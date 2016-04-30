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

import java.util.Locale;
import java.util.logging.Logger;

import com.wildstartech.wfa.country.Country;
import com.wildstartech.wfa.country.CountryFactory;
import com.wildstartech.wfa.location.GeoPoint;
import com.wildstartech.wfa.location.address.City;
import com.wildstartech.wfa.location.address.PostalCode;

public class USPostalCode implements PostalCode {
  private static final String _CLASS=USPostalCode.class.getName();
  private static final Logger logger=Logger.getLogger(_CLASS);
  
  
  private boolean dst=true;
  private City city=null;
  private Country country=null;
  private GeoPoint centroid=null;  
  private String code=null;
  private String timeZone=null;
  /**
   * Default, no-argument constructor.
   */
  protected USPostalCode() {
    logger.entering(_CLASS, "USPostalCode()");
    logger.exiting(_CLASS, "USPostalCode()");
  }
  
  protected USPostalCode(String code, 
      String cityName, 
      String stateCode, 
      String latitude, 
      String longitude, 
      String timeZone,
      boolean isDST) {
    logger.entering(_CLASS,
        "USPostalCode(String,String,String,String,String,String",
        new Object[] {code,cityName,stateCode,latitude,longitude,timeZone,isDST});
    City city=null;
    
    setPostalCode(code);
    city=new CityImpl();
    city.setName(cityName);
    city.setStateAbbreviation(stateCode);
    this.city=city;
    this.centroid=new GeoPointImpl(latitude, longitude);
    setTimeZone(timeZone);
    setDST(isDST);
    logger.exiting(_CLASS,
        "USPostalCode(String,String,String,String,String,String");
  }
  
  //***** centriod
  @Override
  public GeoPoint getCentroid() {
    logger.entering(_CLASS,"getCentroid()");
    logger.exiting(_CLASS,"getCentroid()",this.centroid);
    return this.centroid;
  }
  protected void setCentroid(GeoPoint centroid) {
    logger.entering(_CLASS, "setCentroid(GeoPoint)",centroid);
    this.centroid=centroid;
    logger.exiting(_CLASS, "setCentroid(GeoPoint)");
  }
  
  //***** city
  public City getCity() {
    logger.entering(_CLASS,"getCity()");
    logger.exiting(_CLASS,"getCity()",this.city);
    return this.city;
  }
  
  //***** country
  @Override
  public Country getCountry() {
    logger.entering(_CLASS,"getCountry()");
    logger.exiting(_CLASS,"getCountry()",this.country);
    return this.country;
  }
  
  /*
   * Set the country of the postal code the specified country name.
   * 
   * <p>If the <code>countryName</code> parameter is NOT null, the system will
   * obtain a reference to the <code>CountryFactory<code> of the 
   * <code>com.wildstartech.wfa.country</code> package and attempt to resolve 
   * the <code>countryName</code> to a specific country.  If 
   * <code>countryName</code> is neither <code>NULL</code> nor an empty
   * <code>String</code>,  the method will use the following logic in an effort
   * to isolate the
   * <ul>
   * <li>Check to see if the specified <code>countryName</code> value 
   * corresponds to a two-character ISO-3166 country code.  If it does, then 
   * the corresponding<code>Country</code> object will be returned.</li>
   * <li>Check to see if the specified <code>countryName</code> value can 
   * be used as the parameter to the 
   * <code>CountryFactory.findByName(String)</code> method.</li>
   * <li>Default to the current <code>Locale</code>.  Use the 
   * <code>getCountry()</code> method to get the two-character country 
   * code.</li>
   */
  protected void setCountry(String countryName) {
    logger.entering(_CLASS, "setCountry(String)",countryName);
    Country tmpCountry=null;
    CountryFactory factory=null;
    Locale locale=null;
    String tmpCode=null;
    
    if ((countryName != null) && (countryName.length() > 0)) {
      factory=CountryFactory.getInstance();
      if (countryName.length() == 2) {
        tmpCountry=factory.findByCode(countryName);        
      } // END if (countryName.length() == 2)
      /* Either looking up by countryCode didn't work or the countryName value
       * is more than two characters, so try looking for the whole name. */ 
      if (tmpCountry == null) {
        tmpCountry=factory.findByName(countryName);
      } // END if (country == null)      
    } // END if ((countryName != null) && (countryName.length() > 0))
    // If we are still blank, then let's default to the current locale
    if (tmpCountry == null) {
      locale=Locale.getDefault();
      tmpCode=locale.getCountry();
      tmpCountry=factory.findByCode(tmpCode);
    } // END if (country == null)
    if (tmpCountry == null) {
      tmpCountry=factory.findByCode("US");
    } // END if (country == null)
    this.country=tmpCountry;
    
    logger.exiting(_CLASS, "setCountry(String)");
  }
  
  @Override
  public String getCountryCode() {
    logger.entering(_CLASS,"getCountryCode()");
    String countryCode="";
    if (this.country != null) {
      countryCode=this.country.getCode();
    } // END if (this.country != null)
    logger.exiting(_CLASS,"getCountryCode()",countryCode);
    return countryCode;
  }
  
  //***** dst
  public boolean isDST() {
    logger.entering(_CLASS, "isDST()");
    logger.entering(_CLASS, "isDST()",this.dst);
    return this.dst;
  }
  protected void setDST(boolean dst) {
    logger.entering(_CLASS,"setDST(boolean)",dst);
    this.dst=dst;
    logger.exiting(_CLASS,"setDST(boolean)");
  }
  
  //***** postalCode
  @Override
  public String getPostalCode() {
    logger.entering(_CLASS,"getPostalCode()");
    logger.exiting(_CLASS,"getPostalCode()",this.code);
    return this.code;
  }
  
  public void setPostalCode(String postalCode) {
    logger.entering(_CLASS,"setPostalCode(String)",postalCode);
    if (postalCode == null) {
      this.code="";
    } else {
      this.code=postalCode;
    } // END if (postalCode == null)
    logger.exiting(_CLASS,"setPostalCode(String)");
  }
  //***** timeZone
  public String getTimeZone() {
    logger.entering(_CLASS,"getTimeZone()");
    logger.exiting(_CLASS,"getTimeZone()",this.timeZone);
    return this.timeZone;    
  }
  protected void setTimeZone(String timeZone) {
    logger.entering(_CLASS,"setTimeZone(String)",timeZone);
    this.timeZone=timeZone;
    logger.exiting(_CLASS,"setTimeZone(String)");
  }
  
  //***** Utility methods
  @Override
  public String toString() {
  	logger.entering(_CLASS,"toString()");
  	String result=null; 
  	StringBuilder sb=null;
  	
  	sb=new StringBuilder();
  	sb.append("USPostalCode [Zip Code=").append(this.code);
  	if (this.city != null) {
  		sb.append(", city=").append(this.city.getName());
  		sb.append(", state=").append(this.city.getStateAbbreviation());
  	} else {
  		sb.append(", city=, state=");
  	} // END if (this.city != null)
  	sb.append(", latitude=");
  	if (this.centroid != null) {
  		sb.append(this.centroid.getLatitudeAsString());
  		sb.append(", longitude=").append(this.centroid.getLongitudeAsString());
  	} else {
  		sb.append(", longitude=");
  	} // END if (this.country != null)
  	sb.append(", timeZone=").append(this.timeZone);
  	sb.append(", dst=").append(this.dst);
  	sb.append("]");
  	result=sb.toString();
  	logger.exiting(_CLASS,"toString()",result);
  	return result;
  }
}