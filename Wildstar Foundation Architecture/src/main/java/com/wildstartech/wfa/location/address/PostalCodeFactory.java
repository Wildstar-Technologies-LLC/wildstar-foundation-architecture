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
package com.wildstartech.wfa.location.address;

import java.util.logging.Logger;

import com.wildstartech.wfa.location.GeoPoint;
import com.wildstartech.wfa.location.address.us.LocalPostalCodeFactoryImpl;

public abstract class PostalCodeFactory {
  private static final String _CLASS=PostalCodeFactory.class.getName();
  private static final Logger logger=Logger.getLogger(_CLASS);
  
  /**
   * Returns a reference to a concerete <code>PostalCodeFactory</code>.
   * 
   * @return
   */
  public static PostalCodeFactory getInstance() {
    logger.entering(_CLASS,"getInstance()");
    PostalCodeFactory factory=LocalPostalCodeFactoryImpl.getInstance();
    logger.entering(_CLASS,"getInstance()",factory);
    return factory;
  }
  /**
   * Returns the "center" of an area covered by a postal code.
   * 
   * @param postalCode A <code>String</code> that identifies the postal code
   * that should be used in order to obtain an instance of the 
   * <code>PostalCode</code> object. 
   */
  public abstract GeoPoint getCentroid(String postalCode);
  
  /**
   * Locates a city based upon the specified
   * 
   * @param postalCode A <code>String</code> that identifies the postal code 
   * that should be used in order to obtain a given <code>City</code> object.
   * 
   * @return The <code>City</code> object represented by the specified postal
   * code.
   */
  public abstract City getCity(String postalCode);
  
  /**
   * Return an instance of the postal code represented by the specified value.
   * @param A <code>String</code> representation of the desired postal code.
   * @return A <code>PostalCode</code> instance that corresponds to the 
   * specified <code>postalCode</code> parameter.
   */
  public abstract PostalCode getPostalCode(String postalCode);
}