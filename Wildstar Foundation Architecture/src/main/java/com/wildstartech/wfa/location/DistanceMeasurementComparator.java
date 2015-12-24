package com.wildstartech.wfa.location;

import java.util.Comparator;
import java.util.logging.Logger;

import com.wildstartech.wfa.location.DistanceMeasurement.UNITS;

public class DistanceMeasurementComparator 
implements Comparator<DistanceMeasurement> {
  private static final String _CLASS=
      DistanceMeasurementComparator.class.getName();
  private static final Logger logger=Logger.getLogger(_CLASS);
  
  @Override
  public int compare(DistanceMeasurement o1, DistanceMeasurement o2) {
    logger.entering(_CLASS,"compare(DistanceMeasurement,DistanceMeasurement",
        new Object[] {o1,o2});
    int result=0;
    double firstDistance=0;
    double secondDistance=0;
    
    if ((o1 != null) && (o2 != null)) {
      firstDistance=o1.getMeasurementAs(UNITS.METRIC);
      secondDistance=o2.getMeasurementAs(UNITS.METRIC);
      
      if (firstDistance == secondDistance) {
        result = 0;
      } else if (firstDistance < secondDistance) {
        result = -1;
      } else {
        result = 1;
      } // END if (firstDistance == secondDistance)
    } else {
      // One (or both) of the parameters are null
      if ((o1 == null) && (o2 == null)) {
        logger.severe("Both DistanceMeasurement parameters are null.");
        throw new NullPointerException(
            "Both DistanceMeasurement parameters are null.");
      } else if (o1 == null) {
        logger.severe("The first DistanceMeasurement parameter is null.");
        throw new NullPointerException(
            "The first DistanceMeasurement parameter is null.");        
      } else {
        logger.severe("The second DistanceMeasurement parameter is null.");
        throw new NullPointerException(
            "The second DistanceMeasurement parameter is null.");
      } // END if (o1 == null)
    } // END if ((o1 != null) && (o2 != null))
    
    logger.exiting(_CLASS,"compare(DistanceMeasurement,DistanceMeasurement",
        result);
    return result;
  }
}