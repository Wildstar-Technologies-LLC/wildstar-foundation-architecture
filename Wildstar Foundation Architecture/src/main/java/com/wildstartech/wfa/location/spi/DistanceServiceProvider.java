/*
 * Copyright (c) 2001 - 2015 Wildstar Technologies, LLC.
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
package com.wildstartech.wfa.location.spi;

import com.wildstartech.wfa.location.DistanceMeasurement;
import com.wildstartech.wfa.location.GeoPoint;

/**
 * Pluggable mechanism to use for calculating distance between two points.
 * 
 * <p>References to concrete implementations of the 
 * <code>DistanceServiceProvider</code> should be obtained through the use of
 * the <code>DistanceServiceProviderFactory.getService()</code> method.
 * 
 * @author Derek Berube, Wildstar Technologies, LLC.
 * @version 0.2, 2015-06-23
 */
public interface DistanceServiceProvider {    
  /**
   * Calculates distance between two sets of latitude and longitude coordinates.
   * 
   * <p>Calculates the distance between a pair of latitude and longitude 
   * coordinates returning an answer using the default measurement units for 
   * the current locale.</p>
   * 
   * @param origin
   * @param destination
   * @return The distance between the specified latitude and longitude 
   * coordinate pairs.
   */
  public DistanceMeasurement calculateDistance(
      GeoPoint origin, 
      GeoPoint destination);
  
  /**
   * Calculates distance between two sets of latitude and longitude coordinates.
   * 
   * @param origin A <code>GeoPoint</code> instance that identifies the latitude
   * and longitude for the starting point for the calculation.
   * @param destination A <code>GeoPoint</code> instance that identifies the
   * latitude and longitude for the ending point of the calculation.
   * @param unit The type of measure that should be used when expressing the
   * distance between the <code>origin</code> and <code>destination</code>.
   * 
   * @return A measure of the distance between the specified latitude and
   * longitude coordinate pairs.
   */
  public DistanceMeasurement calculateDistance(
      GeoPoint origin, 
      GeoPoint destination, 
      DistanceMeasurement.UNITS unit);
  
  /**
   * Calculates the distance between two postal codes.
   * 
   * <p>Calculates the distance between the two specified postal codes returning
   * an answer using the default measurement units for the current locale.</p>
   * 
   * @param originPostalCode The postal code that represents the initial 
   * point from which to start the distance calculation.
   * @param destinationPostalCode The postal code that represents the 
   * termination point for the distance calculation.
   * @return A measure of the distance between the specified postal codes.
   */
  public DistanceMeasurement calculateDistance(
      String originPostalCode, 
      String destinationPostalCode);
  
  /** 
   * Calculates the distance between two postal codes.
   * 
   * @param originPostalCode The postal code that represents the initial 
   * point from which to start the distance calculation.
   * @param destinationPostalCode The postal code that represents the 
   * termination point for the distance calculation.
   * @param unit The type of measure that should be used when expressing the
   * distance between the <code>origin</code> and <code>destination</code>.
   * @return A measure of the distance between the specified postal codes.
   */
  public DistanceMeasurement calculateDistance(String originPostalCode,
      String destinationPostalCode,
      DistanceMeasurement.UNITS unit);
}
