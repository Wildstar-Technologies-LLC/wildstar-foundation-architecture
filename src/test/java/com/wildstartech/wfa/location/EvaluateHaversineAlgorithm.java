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

import org.testng.annotations.Test;

import com.wildstartech.wfa.location.spi.DistanceServiceProvider;

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