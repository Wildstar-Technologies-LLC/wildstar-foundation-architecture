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
package com.wildstartech.wfa.dao.user;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import com.wildstartech.wfa.dao.WildObject;


public interface UserContext extends WildObject {
	//***** isAuthenticated
	/** 
	 * Performs the process of authenticating the specified user.
	 * @return A true/false value indicating whether or not the information 
	 * specified as the userName and password values are actually authentic.
	 */
	public boolean authenticate();
	/**
	 * Returns a boolean flag indicating if the user has authenticated. 
	 */
	public boolean isAuthenticated();
	//***** authenticationDate
	/**
	 * Returns the date/time the user authenticated against the server.
	 * 
	 * @return java.util.Date The date/time the user authenticated against the
	 * server.
	 */
	public Date getAuthenticationDate();
	//***** locale
	public Locale getLocale();
	public void setLocale(Locale locale);
	public void setLocale(String locale);
	//***** password
	public String getPassword();
	public void setPassword(String password);
	//***** sessionId
	/**
	 * Return the value to be used as a session identifier.
	 */
	public String getSessionId();
	/**
	 * Set the value to be used as a session identifier.
	 * @param sessionId
	 */
	public void setSessionId(String sessionId);
	//***** timezone
	public TimeZone getTimeZone();
	public void setTimeZone(TimeZone tz);
	public void setTimeZone(String tz);
	//***** userName
	public String getUserName();
	public void setUserName(String userName);
	//***** user
	public PersistentUser getUser();
	public void setUser(PersistentUser user);
	//***** currencyFormat
	public NumberFormat getCurrencyFormat();
	//***** currentDateTime
	public Date getCurrentDateTime();
	//***** numberFormat
	public NumberFormat getNumberFormat();
	//***** dateFormat
	public DateFormat getDateFormat();	
}