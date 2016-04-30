package com.wildstartech.wfa.location;

import java.util.logging.Logger;

import com.wildstartech.wfa.location.spi.DistanceServiceProvider;

public class DistanceUtilities {
   private static String _CLASS=DistanceUtilities.class.getName();
   private static Logger logger=Logger.getLogger(_CLASS);
   
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
}