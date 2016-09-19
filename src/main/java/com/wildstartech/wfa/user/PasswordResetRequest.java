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
package com.wildstartech.wfa.user;

import java.net.InetAddress;
import java.util.Date;

/**
 * Represents a request to reset of the password for a {@code User} 
 * account.
 */
public interface PasswordResetRequest {
   public String RESOURCE_BUNDLE="com.wildstartech.wfa.user.PasswordResetRequestResources";
   
   /**
    * Returns the date the password reset request was made.
    * @return A {@code Date} indicating when the password reset request
    * was made.
    */
   public Date getDateSubmitted();
   /**
    * Stores the {@code Date} the password reset request was made.
    * 
    * @param submitDate The {@code Date} the password reset request
    * was made.
    */
   public void setDateSubmitted(Date submitDate);
   /**
    * Returns the date the password reset request should expire.
    * 
    * @return A {@code Date} object representing when the password
    * reset request should expire.
    */
   public Date getExpirationDate();
   /**
    * Sets the {@code Date} the password reset request should expire.
    * 
    * @param expirationDate The date after which the password reset request
    * should no longer be honored.
    */
   public void setExpirationDate(Date expirationDate);
   /**
    * Returns the Internet Protocol (IP) address of the client submitting
    * the password reset request.
    * 
    * @return The IP address of the client that was used to submit
    * the password reset request.
    */
   public InetAddress getAddressOfRequest();
   /**
    * Store the Internet address of the client submitting the password
    * reset request.
    * 
    * @param address The IP address of the client that submitted the
    * password reset request.
    */
   public void setAddressOfRequest(InetAddress address);
   
   /**
    * Pass the Internet address of the client submitting the password
    * reset request as a {@code String}.
    */
   public void setAddressOfRequest(String address);
   
   /**
    * Returns the name of the user account whose password is to be reset. 
    * @return The name of the user account.
    */
   public String getUserName();
   /** 
    * Sets the name of the user account whose password is to be reset.
    * @param userName The value that identifies the account that should
    * be reset.
    */
   public void setUserName(String userName) throws UserNameTooLongException;
}
