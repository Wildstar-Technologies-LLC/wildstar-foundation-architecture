/*
 * Copyright (c) 2001 - 2014 Wildstar Technologies, LLC.
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
package com.wildstartech.wfa.phoneable; 

public class CountryCode {
	private String name;
	private int code;
	
	/**
	 * Default, no-argument constructor.
	 */
	public CountryCode() {
		
	}
	/**
	 * Constructor taking both the country label and numeric code as parameters.
	 */
	public CountryCode(String name, int code) {
		this.name=name;
		this.code=code;
	}
	//***** code
	/**
	 * Returns the numeric country code.
	 * @return The numeric country code.
	 */
	public int getCode() {
		return this.code;
	}
	/**
	 * Associates the specified numeric code with the country name.
	 * @param code The numeric code to be associated with the country name.
	 */
	public void setCode(int code) {
		this.code=code;
	}
	//***** name
	/**
	 * Returns the name of the country represented by the numeric code.
	 * @return The name of the country represented by the numeric code.
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * Associates the name of the country to represent the numeric code.
	 * @param name The value to be used as the country name.
	 */
	public void setName(String name) {
		this.name=name;
	}
}