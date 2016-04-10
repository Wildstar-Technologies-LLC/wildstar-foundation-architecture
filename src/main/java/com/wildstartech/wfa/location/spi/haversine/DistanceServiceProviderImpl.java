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
package com.wildstartech.wfa.location.spi.haversine;

import java.util.logging.Logger;

import com.wildstartech.wfa.location.DistanceMeasurement;
import com.wildstartech.wfa.location.DistanceMeasurement.UNITS;
import com.wildstartech.wfa.location.GeoPoint;
import com.wildstartech.wfa.location.address.PostalCodeFactory;
import com.wildstartech.wfa.location.spi.DistanceServiceProvider;

/**
 * Calculates distance using the Haversine forumla and latitude/longitude.
 * 
 * <p>The haversine formula is an equation important in navigation, giving 
 * great-circle distances between two points on a sphere from their longitudes 
 * and latitudes. It is a special case of a more general formula in spherical 
 * trigonometry, the law of haversines, relating the sides and angles of 
 * spherical triangles.</p>
 * 
 * <p>The implementation of the <code>calculateDistance(String,String)</code>
 * method takes postal codes as parameters.  When performing this type of 
 * calculation, the latitude and longitude of the centroid of the area covered
 * by the postal code is used.  The <strong>centroid</strong> for a postal code
 * is the geometric center of the area represented by the postal code.  This
 * may not be the absolute center, but rather the average center from ALL the 
 * points in the shape created by the postal code's boundaries.  The
 * centroids for the postal codes specified will be obtained through the use of
 * the clasess in the <code>com.wildstartech.wfa.location.address</code>
 * package.  Specifically, the implementation will invoke the 
 * <code>getCenteroid(String)</code> static method of the 
 * <code>PostalCodeFactory</code> class for each of the postal codes passed as
 * paramters to the method.</p>
 * 
 * @see https://en.wikipedia.org/wiki/Haversine_formula 
 * @see com.wildstartech.wfa.location.address 
 * 
 * @author Derek Berube, Wildstar Techologies, LLC.
 * @version 0.1, 2015-06-21
 *
 */
public class DistanceServiceProviderImpl implements DistanceServiceProvider {
  private static final String _CLASS=
      DistanceServiceProviderImpl.class.getName();
  private static final Logger logger=Logger.getLogger(_CLASS);
  
  //********** utility methods
  public static double convertDegreesToRadians(double degrees) {
    logger.entering(_CLASS,"converDegreesToRadians(double)",degrees);
    double radians=0.0;
    radians = (degrees * Math.PI ) / 180.0;
    logger.exiting(_CLASS,"converDegreesToRadians(double)",radians);
    return radians;
  }
  
  public static double convertRadiansToDegrees(double radians) {
    logger.entering(_CLASS,"converDegreesToRadians(double)", radians);
    double degrees=0.0;
    degrees = (radians * 180) / Math.PI;
    logger.exiting(_CLASS,"converDegreesToRadians(double)", degrees);
    return degrees;
  }
  
  
  /**
   * Calculate distance between two points using local measurement units.
   * @param origin A <code>GeoPoint</code> that contains the latitude and
   * longitude of the point considered to be the starting point for the distance
   * calculation.
   * @param destination A <code>GeoPoint</code> that contains the latitude and
   * longitude of the point considered to be the ending point for the distance
   * calculation.
   * @return The distance, expressed as a <code>DistanceMeasurement</code> using
   * the units identified by the <code>units</code> parameter, between the 
   * latitude and longitude coordinate pairs.
   */
  @Override
  public DistanceMeasurement calculateDistance(
      GeoPoint origin, 
      GeoPoint destination) {
    logger.entering(_CLASS,"calculateDistance(GeoPoint,GeoPoint)",
        new Object[] {origin, destination});
    DistanceMeasurement distance=null;
    DistanceMeasurement.UNITS unit=null;
    
    distance=new DistanceMeasurementImpl();
    unit=distance.getDefaultUnitOfMeasurement();
    distance=calculateDistance(origin, destination, unit);
    logger.exiting(_CLASS,"calculateDistance(GeoPoint,GeoPoint)",distance);
    return distance;
  }

  /**
   * Calculates distance between two points using the specified units.
   * 
   * <p>All other methods in this class ultimately invoke this method to 
   * employ the Haversine forumla to calculate the distance between two 
   * different latitude and longitude coordinates.
   * @param origin A <code>GeoPoint</code> that contains the latitude and
   * longitude of the point considered to be the starting point for the distance
   * calculation.
   * @param destination A <code>GeoPoint</code> that contains the latitude and
   * longitude of the point considered to be the ending point for the distance
   * calculation.
   * @param units The unit of measurement that should be used when returning
   * the distance between the two specified points.
   * @return The distance, expressed as a <code>double</code> using the units
   * identified by the <code>units</code> parameter, between the latitude and
   * longitude coordinate pairs.
   */
  @Override
  public DistanceMeasurement calculateDistance(
      GeoPoint origin, 
      GeoPoint destination,
      DistanceMeasurement.UNITS units) {
    DistanceMeasurement distance=null;
    double measurement=0.0;
    double tmpMeasure=0.0;
    double tmpMeasure2=0.0;
    double dLat=0.0;
    double dLong=0.0;
    double latDifference=0.0;
    double latDifferenceR=0.0;
    double longDifference=0.0;
    double longDifferenceR=0.0;
    double oLat=0.0;
    double oLong=0.0;
    int earthRadiusKM = 6371;
    
    if ((origin != null) && (destination != null)) {
      oLat=origin.getLatitude();
      oLong=origin.getLongitude();
      dLat=destination.getLatitude();
      dLong=destination.getLongitude();
      latDifference = dLat - oLat;
      latDifferenceR = convertDegreesToRadians(latDifference);
      longDifference = dLong - oLong;
      longDifferenceR = convertDegreesToRadians(longDifference);
      
      tmpMeasure = Math.sin(latDifferenceR /2) *
                   Math.sin(latDifferenceR /2) +
                   Math.cos(convertDegreesToRadians(oLat)) *
                   Math.cos(convertDegreesToRadians(dLat)) *
                   Math.sin(longDifferenceR /2) * 
                   Math.sin(longDifferenceR / 2);
      tmpMeasure2 = 2 * Math.atan2(Math.sqrt(tmpMeasure), 
                                   Math.sqrt(1-tmpMeasure));
      /* When doing some baseline testing, the unmodified calculation, shown
       * below produced distances that were not consistent with what was seen
       * when using the Google Distance Matrix API.
       * 
       * measurement = (earthRadiusKM * tmpMeasure2)
       * 
       * Some sampling was done and the modifier shown below was applied to 
       * the results.  Measurements are still not identical, but this is
       * generally a little closer.
       */
      measurement = (earthRadiusKM * tmpMeasure2) / 0.8845849883;
      distance = new DistanceMeasurementImpl(measurement,UNITS.METRIC);
      distance.setUnits(distance.getDefaultUnitOfMeasurement());
    } // END if ((origin != null) && (destination != null))
    return distance;
  }

  /**
   * Calculate distance between two postal codes using local measurement units.
   * 
   * @param origin A postal code that is considered to be the starting point 
   * for the distance calculation.
   * @param destination A postal code that is considered to be the ending point 
   * for the distance calculation.
   * @return The distance, expressed as a <code>double</code> using a unit of
   * measurement appropriate for the default <code>Locale</code>, between the
   * two postal codes passed as parameters.
   */
  @Override
  public DistanceMeasurement calculateDistance(
      String originPostalCode,
      String destinationPostalCode) {
    logger.entering(_CLASS,"calculateDistance(String,String)",
        new Object[] {originPostalCode, destinationPostalCode});
    DistanceMeasurement distance=null;
    DistanceMeasurement.UNITS unit=null;
    
    distance=new DistanceMeasurementImpl();
    unit=distance.getDefaultUnitOfMeasurement();
    distance=calculateDistance(originPostalCode,destinationPostalCode,unit);
    
    logger.exiting(_CLASS,"calculateDistance(String,String)",distance);
    return distance;
  }
  /**
   * Calculate distance between two postal codes using local measurement units.
   * 
   * <p>This method will determine the centroids for the specified postal codes
   * and then employ the <code>calculateDistance(GeoPoint,GeoPoint,UNITS)</code>
   * method to determin the distance between the two postal codes.</p>
   * <p>The <em>centroid</em> is considered to be a point in the polygon
   * which outlines the postal code's delivery area that is, on average, 
   * equidistant from all points in the postal code area.</p>
   *
   * @param origin A postal code that is considered to be the starting point 
   * for the distance calculation.
   * @param destination A postal code that is considered to be the ending point 
   * for the distance calculation.
   * @param units The unit of measurement that should be used when returning
   * the distance between the two specified points.
   * @return The distance, expressed as a <code>double</code> using a unit of
   * measurement appropriate for the default <code>Locale</code>, between the
   * two postal codes passed as parameters.
   */ 
  @Override
  public DistanceMeasurement calculateDistance(
      String originPostalCode,
      String destinationPostalCode, 
      DistanceMeasurement.UNITS units) {
    logger.entering(_CLASS,"calculateDistance(String,String)",
        new Object[] {originPostalCode, destinationPostalCode,  units});
    DistanceMeasurement distance=null;
    GeoPoint originCentroid=null;
    GeoPoint destinationCentroid=null;
    PostalCodeFactory factory=null;
    
    factory=PostalCodeFactory.getInstance();
    // Get the centroid for the origin postal code.
    originCentroid=factory.getCentroid(originPostalCode);
    // Get the centroid for the destination postal code.
    destinationCentroid=factory.getCentroid(destinationPostalCode);
    if ((originCentroid != null) && (destinationCentroid != null)) {
      /* Neither the originCentroid nor destinationCentroid are blank, so
       * perform the calculation. */
      distance=calculateDistance(originCentroid,destinationCentroid,units);
    } else {
      // Either the origin or destination centroid was null.
      if (originCentroid == null) {
        logger.severe(
            "The centroid for the origin postal code could not be found.");
      } // END if (originCentroid == null)
      if (destinationCentroid == null) {
        logger.severe(
            "The centroid for the destination postal code could not be found.");
      } // END if (destinationCentroid == null)
    } // END if ((originCentroid != null) && (destinationCentroid != null))
    logger.exiting(_CLASS,"calculateDistance(String,String)",distance);
    return distance;
  }
}
