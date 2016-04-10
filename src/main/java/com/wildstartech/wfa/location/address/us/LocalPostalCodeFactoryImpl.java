/*
 * Copyright (c) 2001 - 2016 Wildstar Technologies, LLC.
 *
 * This file is part of Wildstar Foundation Architecture.
 *
 * Wildstar Foundation Architecture is free software: you can redistribute it
 * and/or modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * Wildstar Foundation Architecture is distributed in the hope that it will be
 * useful, but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * Wildstar Foundation Architecture.  If not, see 
 * <http://www.gnu.org/licenses/>.
 * 
 * Linking this library statically or dynamically with other modules is making a
 * combined work based on this library. Thus, the terms and conditions of the 
 * GNU General Public License cover the whole combination.
 * 
 * As a special exception, the copyright holders of this library give you 
 * permission to link this library with independent modules to produce an 
 * executable, regardless of the license terms of these independent modules, 
 * and to copy and distribute the resulting executable under terms of your 
 * choice, provided that you also meet, for each linked independent module, the
 * terms and conditions of the license of that module. An independent module is
 * a module which is not derived from or based on this library. If you modify 
 * this library, you may extend this exception to your version of the library, 
 * but you are not obliged to do so. If you do not wish to do so, delete this 
 * exception statement from your version.
 * 
 * If you need additional information or have any questions, please contact:
 *
 *      Wildstar Technologies, LLC.
 *      63 The Greenway Loop
 *      Panama City Beach, FL 32413
 *      USA
 *
 *      derek.berube@wildstartech.com
 *      www.wildstartech.com
 */
package com.wildstartech.wfa.location.address.us;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPInputStream;

import com.wildstartech.wfa.location.GeoPoint;
import com.wildstartech.wfa.location.address.City;
import com.wildstartech.wfa.location.address.PostalCode;
import com.wildstartech.wfa.location.address.PostalCodeFactory;

public class LocalPostalCodeFactoryImpl extends PostalCodeFactory implements
      Serializable {
   /** Used in object serialization. */
   private static final long serialVersionUID = 4417375575731953783L;
   private static final String _CLASS = LocalPostalCodeFactoryImpl.class
         .getName();
   private static final Logger logger = Logger.getLogger(_CLASS);

   private static final String DATA_FILE_NAME = "USZipCodeCenteroids.csv.gz";
   private static final PostalCodeFactory factory = new LocalPostalCodeFactoryImpl();

   private Map<String, PostalCode> zipCodes = null;

   /**
    * Default, no-argument constructor
    */
   private LocalPostalCodeFactoryImpl() {
      logger.entering(_CLASS, "LocalPostalCodeFactoryImpl()");
      logger.exiting(_CLASS, "LocalPostalCodeFactoryImpl()");
   }

   /**
    * Returns a reference to this implementation of the PostalCodeFactory.
    * 
    * @return A concerete implementation of the <code>PostalCodeFactory</code>
    *         class.
    */
   public static PostalCodeFactory getInstance() {
      logger.entering(_CLASS, "getInstance()");
      logger.exiting(_CLASS, "getInstance()",
            LocalPostalCodeFactoryImpl.factory);
      return LocalPostalCodeFactoryImpl.factory;
   }

   private void init() {
      // Initialize the class
      boolean dst = true;
      int row = 0;
      BufferedReader reader = null;
      ClassLoader cl = null;
      GZIPInputStream zipIn = null;
      InputStream in = null;
      String city = null;
      String dstStr = null;
      String fieldName = null;
      String latitude = null;
      String line = null;
      String longitude = null;
      String state = null;
      String timeZone = null;
      String zip = null;
      StringBuilder msg = null;
      StringTokenizer tokenizer = null;
      USPostalCode postalCode = null;

      cl = LocalPostalCodeFactoryImpl.class.getClassLoader();
      in = cl.getResourceAsStream(DATA_FILE_NAME);
      if (in != null) {
         try {
            zipIn = new GZIPInputStream(in);
            reader = new BufferedReader(new InputStreamReader(zipIn));
            this.zipCodes = new TreeMap<String, PostalCode>();
            // Read and ignore the first line
            reader.readLine();
            row++;
            while (reader.ready()) {
               line = reader.readLine();
               row++;
if (row == 40219) {
   System.out.println("HI");
}
               if (line != null) {
                  try {
                     tokenizer = new StringTokenizer(line, ",");
                     fieldName = "Zip Code";
                     zip = tokenizer.nextToken();
                     fieldName = "City";
                     city = tokenizer.nextToken();
                     fieldName = "State";
                     state = tokenizer.nextToken();
                     fieldName = "Latitude";
                     latitude = tokenizer.nextToken();
                     fieldName = "Longitude";
                     longitude = tokenizer.nextToken();
                     fieldName = "Timezone";
                     timeZone = tokenizer.nextToken();
                     fieldName = "DST";
                     dstStr = tokenizer.nextToken();
                  } catch (NoSuchElementException ex) {
                     msg = new StringBuilder(80);
                     msg.append("Error parsing the \"");
                     msg.append(fieldName);
                     msg.append("\" field on row ");
                     msg.append(row);
                     msg.append(".");
                     logger.severe(msg.toString());
                  } // END try/catch
                  switch (dstStr) {
                  case "0":
                     dst = false;
                     break;
                  default:
                     dst = true;
                  }
                  // So let's create a PostalCode object.
                  postalCode = new USPostalCode(zip, city, state, latitude,
                        longitude, timeZone, dst);
                  // Let's add that postal code to the map
                  this.zipCodes.put(zip, postalCode);
               } else {
                  logger.warning("Blank line read from USPostalCodes.csv.gz.");
               }
            } // END while (reader.ready())
         } catch (IOException ex) {
            logger.log(
                  Level.SEVERE,
                  "An IOException was thrown while reading USPostalCodes.csv.gz.",
                  ex);
         }
      } else {
         logger.severe("Unable to locate the USPostalCodes.csv.gz file.");
      } // END if (in != null)
      if (logger.isLoggable(Level.FINEST)) {
         msg=new StringBuilder(80);
         msg.append("Processed ").append(this.zipCodes.size());
         msg.append(" zip code entries from ").append(row).append(" rows.");
         logger.finest(msg.toString());
      } // END if (logger.isLoggable(Level.FINEST))
   }

   /**
    * Returns the centeroid that corresponds to the specified zip code.
    * 
    * @return A <code>GeoPoint</code> that identifies the centeroid of the area
    *         covered by the postal code.
    */
   public GeoPoint getCentroid(String zipCode) {
      logger.entering(_CLASS, "getCentroid(String)", zipCode);
      GeoPoint centroid = null;
      PostalCode postalCode = null;

      if (zipCode != null) {
         postalCode = getPostalCode(zipCode);
         if (postalCode != null) {
            centroid = postalCode.getCentroid();
         } // END if (postalCode != null)
      } // END if (zipCode != null)
      if (centroid == null) {
         centroid = new GeoPoint("0", "0");
      } // END if (centroid == null)

      logger.exiting(_CLASS, "getCentroid(String)", centroid);
      return centroid;
   }

   /**
    * Returns the <code>City</code> that corresponds to the specified zip code.
    * 
    * @param zipCode
    * @return
    */
   public City getCity(String zipCode) {
      logger.entering(_CLASS, "findCity(String)", zipCode);
      City city = null;
      PostalCode postalCode = null;
      
      if (zipCode != null) {
         postalCode = getPostalCode(zipCode);
         if (postalCode != null) {
            city = postalCode.getCity();
         } // END if (postalCode != null)
      } // END if (zipCode != null)
      
      logger.exiting(_CLASS, "findCity(String)", city);
      return city;
   }
   
   /**
    * Return an instance of the postal code represented by the specified value.
    * @param A <code>String</code> representation of the desired postal code.
    * @return A <code>PostalCode</code> instance that corresponds to the 
    * specified <code>postalCode</code> parameter.
    */
   public PostalCode getPostalCode(String postalCodeStr) {
      logger.entering(_CLASS, "getPostalCode(String)",postalCodeStr);
      PostalCode postalCode=null;
      
      if (postalCodeStr != null) {
         // Let's check to see if the internal zip code databse has been
         // populated.
         if (this.zipCodes == null) {
            // Nope. Run the initialization script.
            init();
         } // END if (this.zipCodes == null)
         postalCode=this.zipCodes.get(postalCodeStr);
      } // END if (postalCodeStr != null)
      logger.exiting(_CLASS, "getPostalCode(String)",postalCode);
      return postalCode;
   }
}
