package com.wildstartech.wfa.location;

import org.testng.annotations.Test;

import com.wildstartech.wfa.location.spi.DistanceServiceProvider;
import com.wildstartech.wfa.location.spi.DistanceServiceProviderFactory;

public class EvaluateHaversineAlgorithm {
  @Test
  public void testDistances() {
    // Panama City Beach, FL to Suwanee, GA
    doTest(330,32413,30024);
    // Santa Roas Beach, FL to Los Angeles, CA
    doTest(2160,32459,90021);
    // Toledo, IL to Yonkers, NY
    doTest(856,62468,10710);
    // Shrub Oak, NY to Monona, IA
    doTest(1093,10588,52159);
    // Austin, TX to Hosford, FL
    doTest(857,78721,32334);
    // Panama City Beach to Panama City
    doTest(14,32413,32401);
    // Irvine, CA to Santa Maria, CA
    doTest(217,92697,93453);
    // Reading, PA to Ellison Bay, WI
    doTest(997,19611,54210);
    // Newark, DE to Sterling, VA
    doTest(122,19702,20167);
    // Friendship, MD to Washington, DC
    doTest(28,20758,20541);
    // Etlan, VA to Laurel, MS
    doTest(860,22719,39442);
  }
  
  private void doTest(int expected, int zip1, int zip2) {
    double differnece=0.0;
    DistanceMeasurement distance=null;
    DistanceServiceProviderFactory factory=null;
    DistanceServiceProvider service=null;
    DistanceServiceProvider altService=null;
    String zip1Str, zip2Str, diff;
    
    factory=DistanceServiceProviderFactory.getInstance();
    service=factory.getService();
    zip1Str=String.valueOf(zip1);
    zip2Str=String.valueOf(zip2);
    distance=service.calculateDistance(zip1Str,zip2Str);
    diff=String.valueOf(distance.getMeasurement()/expected);
    
    System.out.printf("%s,%s,%s,%s\n",
        zip1,
        zip2,
        expected,
        distance.toFormattedString());
  }
}