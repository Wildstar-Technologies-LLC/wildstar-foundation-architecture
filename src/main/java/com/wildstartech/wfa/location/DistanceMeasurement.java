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

public interface DistanceMeasurement {
  /**
   * Indicates the results of a distance calculations should be conveyed using
   * meters.
   */
  public enum UNITS {
    IMPERIAL,           // Distance expressed using miles.
    METRIC,             // Distance expressed using kilometers.
    NAUTICAL            // Distance expressed using nautical miles.
  };
  public String IMPERIAL_LABEL="miles";
  public String IMPERIAL_ABBREVIATION="MI";
  public String METRIC_LABEL="kilometers";
  public String METRIC_ABBREVIATION="km";
  public String NAUTICAL_LABEL="nautical miles";
  public String NAUTICAL_ABBREVIATION="nm";
  
  /** 
   * Returns the numerical portion of the distance measurement.
   * @return
   */
  public double getMeasurement();
  /**
   * Returns the measurement as the speicifed unit.
   */
  public double getMeasurementAs(UNITS units);
  
  /**
   * Stores the numerical portion of the distance measurement.
   * @param measurement
   */
  public void setMeasurement(double measurement);
  /**
   * Returns the units used to represent the distance.
   * @return One of the <code>UNITS</code> enumerated values.
   */
  public UNITS getUnits();
  /**
   * Set the type of unit used for the measurement specified.
   * @param unit
   */
  public void setUnits(UNITS unit);
  
  /**
   * Returns the default unit of measurement appropriate for the current locale.
   */
  public UNITS getDefaultUnitOfMeasurement();
  
  /**
   * Returns the measurement as a human-readable, formatted <code>String</code>.
   */
  public String toFormattedString();
}