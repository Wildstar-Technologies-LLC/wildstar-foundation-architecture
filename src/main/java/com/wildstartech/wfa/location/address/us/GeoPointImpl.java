package com.wildstartech.wfa.location.address.us;

import java.util.logging.Logger;

import com.wildstartech.wfa.location.DistanceMeasurement;
import com.wildstartech.wfa.location.DistanceServiceProviderFactory;
import com.wildstartech.wfa.location.GeoPoint;
import com.wildstartech.wfa.location.spi.DistanceServiceProvider;

public class GeoPointImpl implements GeoPoint {
   private static final String _CLASS=GeoPointImpl.class.getName();
   private static final Logger logger=Logger.getLogger(_CLASS);
   
   
   private String latitude;
   private String longitude;
   
   public GeoPointImpl(String latitude, String longitude) {
     logger.entering(_CLASS,"GeoPointImpl(String,String)", 
         new Object[] {latitude,longitude});
     setLatitude(latitude);
     setLongitude(longitude);
     logger.exiting(_CLASS,"GeoPointImpl(String,String)");
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
   public static DistanceMeasurement calculateDistance(
         GeoPoint origin, 
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
         logger.warning("The origin MockGeoPoint parameter was null.");        
       } // END if (origin == null)
       if (destination == null) {
         logger.warning("The destination MockGeoPoint parameter was null.");        
       } // END if (origin == null)
     }
     logger.exiting(_CLASS,"calculateDistance(MockGeoPoint,MockGeoPoint)",distance);
     return distance;
   }
   
   /**
    * Returns a <code>String</code> representation of the <code>MockGeoPoint</code> 
    * instance.
    * 
    * @return The <code>MockGeoPoint</code> instance expressed as a 
    * <code>String</code>.
    */
   public String toString() {
     logger.entering(_CLASS, "toString()");
     String text="";
     StringBuilder sb=null;
     
     sb=new StringBuilder();
     sb.append("MockGeoPoint [latitude=");
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
      GeoPointImpl other = (GeoPointImpl) obj;
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