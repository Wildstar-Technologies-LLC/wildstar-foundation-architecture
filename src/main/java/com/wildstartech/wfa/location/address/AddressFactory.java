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

import com.wildstartech.wfa.country.Country;

public class AddressFactory {
  private static final String _CLASS=AddressFactory.class.getName();
  private static final Logger logger=Logger.getLogger(_CLASS);
  
  private static final AddressFactory factory=new AddressFactory();
  
  /**
   * Default, no-argument constructor.
   */
  private AddressFactory() {
    logger.entering(_CLASS,"AddressFactory()");
    logger.exiting(_CLASS,"AddressFactory()");
  }
  
  /**
   * Create an address appropriate for the current locale.
   * @return
   */
  public static Address createAddress() {
    logger.entering(_CLASS,"createAddress()");
    Address address=null;
    logger.exiting(_CLASS,"createAddress()",address);
    return address;
  }
  
  /**
   * Create an address that is appropriate for the specified country.
   *  
   * @author Derek Berube, Wildstar Technologies, LLC.
   * @version 1.0, 01 Jan 2010
   * @param country The <code>Country</code> object for which you would like to
   * have a compatible implementation of the <code>Address</code> interface. 
   * @return An implementation of the <code>Address</code> that is appropriate
   * for the specified country.
   */
  public static Address createAddress(Country country) {
    logger.entering(_CLASS,"createAddress(Country)",country);
    Address address=null;
    logger.exiting(_CLASS,"createAddress(Country)",address);
    return address;    
  }
  
  /**
   * Returns a <code>Address</code> for the specified country.
   * <p>The <code>countryCode</code> parameter should be a valid ISO-3166 
   * country code.</p>
   * @param countryCode
   * @return An implementation of the <code>Address</code> interface that is
   * compatible with the <code>Country</code> identified by the specified 
   * <code>countryCode</code> abbreviation.
   */
  public static Address createAddress(String countryCode) {
    logger.entering(_CLASS,"createAddress(String)",countryCode);
    Address address=null;
    logger.exiting(_CLASS,"createAddress(String)",address);
    return address;
    
  }
}
