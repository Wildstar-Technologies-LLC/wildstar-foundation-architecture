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
package com.wildstartech.wfa.location;

import java.util.logging.Logger;

import com.wildstartech.wfa.location.spi.DistanceServiceProvider;

public class GeoPoint {
  private static final String _CLASS=GeoPoint.class.getName();
  private static final Logger logger=Logger.getLogger(_CLASS);
  
  
  private String latitude;
  private String longitude;
  
  public GeoPoint(String latitude, String longitude) {
    logger.entering(_CLASS,"GeoPoint(String,String)", 
        new Object[] {latitude,longitude});
    setLatitude(latitude);
    setLongitude(longitude);
    logger.exiting(_CLASS,"GeoPoint(String,String)");
  }
  
  //***** latitude
  public double getLatitude() {
    logger.entering(_CLASS,"getLatitude()");
    double latitude=0.0;
    latitude=Double.valueOf(this.latitude);
    logger.exiting(_CLASS,"getLatitude()",latitude);
    return latitude;
  }
  public String getLatitudeAsString() {
    logger.entering(_CLASS,"getLatitudeAsString()");
    logger.exiting(_CLASS,"getLatitudeAsString()",this.latitude);
    return this.latitude;
  }
  public void setLatitude(String latitude) {
    logger.entering(_CLASS,"setLatitude(String)",latitude);
    if ((latitude != null) && (latitude.length() > 0)) {
      this.latitude=latitude; 
    } else {
      this.latitude="0";
    }
    logger.exiting(_CLASS,"setLatitude()");
  }
  
  //***** longitude
  public double getLongitude() {
    logger.entering(_CLASS,"getLongitude()");
    double longitude=0.0;
    longitude=Double.valueOf(this.longitude);
    logger.exiting(_CLASS,"getLongitude()",longitude);
    return longitude;
  }
  public String getLongitudeAsString() {
    logger.entering(_CLASS,"getLongitudeAsString()");
    logger.entering(_CLASS,"getLongitudeAsString()",this.longitude);
    return this.longitude;
  }
  public void setLongitude(String longitude) {
    logger.entering(_CLASS,"setLongitude(String)",longitude);
    if ((longitude != null) && (longitude.length() > 0)) {
      this.longitude=longitude; 
    } else {
      this.longitude="0";
    }
    logger.exiting(_CLASS,"setLongitude()");    
  }
  
  //********** utility methods
  /**
   * Convenience method to calculate the distance between two GeoPoints.
   * @param origin
   * @param destination
   * @return The distance between the two points expressed in units that are 
   * appropriate for the current locale.
   */
  public static DistanceMeasurement calculateDistance(GeoPoint origin, 
      GeoPoint destination) {
    logger.entering(_CLASS,"calculateDistance(GeoPoint,GeoPoint)",
        new Object[] {origin, destination});
    DistanceMeasurement distance=null;
    DistanceServiceProvider service=null;
    DistanceServiceProviderFactory factory=null;
    
    if ((origin != null) && (destination != null)) {
      factory=DistanceServiceProviderFactory.getInstance();
      service=factory.getService();
      distance=service.calculateDistance(origin, destination);
    } else {
      if (origin == null) {
        logger.warning("The origin GeoPoint parameter was null.");        
      } // END if (origin == null)
      if (destination == null) {
        logger.warning("The destination GeoPoint parameter was null.");        
      } // END if (origin == null)
    }
    logger.exiting(_CLASS,"calculateDistance(GeoPoint,GeoPoint)",distance);
    return distance;
  }
  
  /**
   * Returns a <code>String</code> representation of the <code>GeoPoint</code> 
   * instance.
   * 
   * @return The <code>GeoPoint</code> instance expressed as a 
   * <code>String</code>.
   */
  public String toString() {
    logger.entering(_CLASS, "toString()");
    String text="";
    StringBuilder sb=null;
    
    sb=new StringBuilder();
    sb.append("GeoPoint [latitude=");
    sb.append(getLatitudeAsString());
    sb.append(", longitude=");
    sb.append(getLongitudeAsString());
    sb.append("]");
    text=sb.toString();
    logger.exiting(_CLASS, "toString()",text);
    return text;
  }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((latitude == null) ? 0 : latitude.hashCode());
      result = prime * result
            + ((longitude == null) ? 0 : longitude.hashCode());
      return result;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      GeoPoint other = (GeoPoint) obj;
      if (latitude == null) {
         if (other.latitude != null)
            return false;
      } else if (!latitude.equals(other.latitude))
         return false;
      if (longitude == null) {
         if (other.longitude != null)
            return false;
      } else if (!longitude.equals(other.longitude))
         return false;
      return true;
   }
}
