/*
 * Copyright (c) 2001 - 2013 Wildstar Technologies, LLC.
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
 *      1453 Riverview Run Lane
 *      Suwanee, GA 30024
 *      USA
 *
 *      derek.berube@wildstartech.com
 *      www.wildstartech.com
 */
package com.wildstartech.wfa;

import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Enumerated data type.
 * @author Derek Berube, Wildstar Technologies, LLC.
 *
 */
public class EnumeratedType {
	private static final String _CLASS=EnumeratedType.class.getName();
	private static final Logger logger=Logger.getLogger(_CLASS);
	
	private int enumValue=Integer.MIN_VALUE;
	private String label=null;
	
	/**
	 * Default, no-argument constructor.
	 */
	protected EnumeratedType() {
		logger.entering(_CLASS,"EnumeratedType()");
		logger.exiting(_CLASS,"EnumeratedType()");
	}
	/**
	 * Constructor taking a String and an Integer as a parameter.
	 * @param label
	 * @param enumValue
	 */
	protected EnumeratedType(String label, int enumValue) {
		if (logger.isLoggable(Level.FINEST)) {
			logger.entering(_CLASS,"EnumeratedType(String)",
					new Object[] {label, enumValue});
		} // END if (logger.isLoggable(Level.FINEST))
		
		this.label=label;
		this.enumValue=enumValue;
		
		logger.exiting(_CLASS,"EnumeratedType(String)");		
	}
	
	//***** label
	/**
	 * Return the label assigned to the enumerated type.
	 * @return The <code>String</code> label currently assigned to the 
	 * enumerated type.
	 */
	public String getLabel() {
		logger.entering(_CLASS,"getLabel()");
		logger.entering(_CLASS,"getLabel()",this.label);
		return this.label;
	}
	//***** enumId
	/**
	 * The integer value that corresponds to the enumerated type.
	 * @return
	 */
	public int getEnumValue() {
		logger.entering(_CLASS,"getEnumValue()");
		logger.entering(_CLASS,"getEnumValue()",this.enumValue);
		return this.enumValue;		
	}
}
