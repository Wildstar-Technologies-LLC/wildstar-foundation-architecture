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

/**
 * Represents the distance between two different postal codes.
 * 
 * <p>Implementations of this interface should use the alphabetic sorting of 
 * the postal code values to determine which is the 
 * <code>originPostalCode</code> and which is the 
 * <code>destinationPostalCode</code>.  Numbers are considered to be 
 * &quot;less&quot; than letters, so the character &quot;9&quot; would come 
 * before the letter &quot;A&quot;.  The sorting of alpha characters should be 
 * done in a case-insensitive way meaning that &quot;A&quot; and &quot;a&quot; 
 * are equal.</p>
 * <p>For example, if you have two postal codes:</p>
 * <ul>
 * <li>30024</li>
 * <li>32413</li>
 * </ul>
 * <p>The <code>originPostalCode</code> should <strong>always</strong> be 
 * <strong>30024</strong>.  When the <code>setOriginPostalCode(String)</code>  
 * and <code>setDestinationPostalCode(String)</code> methods are invoked, the
 * implementation of these methods should ensure the sort order of the postal
 * codes is maintained.  A proper implementation of this interface would result
 * in the following snippet of code:</p>
 * <pre>
 * setOriginPostalCode("32413");
 * setDestinationPostalCode("30024");
 * System.out.printf("Origin: %s\n",getOriginPostalCode());
 * System.out.printf("Destination: %s\n",getDestinationPostalCode());
 * </pre>
 * <p>should produce the following console output:</p>
 * <pre>
 * Origin: 30024
 * Destination: 32413
 * </pre>
 * 
 * @author Derek Berube, Wildstar Technologies, LLC.
 * @version 0.1, 2015-06-23
 */
public interface PostalCodeDistance {
  //***** destinationPostalCode
  public String getDestinationPostalCode();
  public void setDestinationPostalCode(String destination);
  //***** originPostalCode
  public String getOriginPostalCode();
  public void setOriginPostalCode(String origin);
  //***** distance
  /**
   * Returns the distance between the specified postal codes.
   * @return
   */
  public DistanceMeasurement getDistanceMeasurement(); 
  /**
   * Stores the distance measurement.
   * @param measurement A <code>DistanceMeasurement</code> instance that 
   * represents the distance between the postal code pair.
   */
  public void setDistanceMeasurement(DistanceMeasurement measurement);
}
