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
package com.wildstartech.wfa.rules;

import java.util.List;
import java.util.logging.Logger;
/**
 * Runtime exception thrown when evaluating a <code>Rule</code>.
 * 
 * <p>When a <code>RuleSet</code> is evaluated, a rule can throw a 
 * <code>RuleException</code> runtime exception which is used to provide 
 * feedback to the caller.  A <code>RuleException</code> has the following 
 * properties:</p>
 * 
 * <table border="1">
 * 	<tr>
 * 	 <th>Property</th>
 * 	 <th>Description</th>
 *  </tr>
 *  <tr>
 * 	 <td>level</td>
 * 	 <td>A description of the relative severity of the exception.</td>
 *  </tr>
 * 	 <td>propertyName</td>
 *   <td>A <code>RuleSet</code> is evaluated against an object as a whole. As
 *   such, the <code>propertyName</code> indicates which of the objects 
 *   properties with which the exception is associated.</td>
 *  </tr>
 *  <tr>
 * 	 <td>message</td>
 * 	 <td>A full narrative of the exception.</td>
 *  </tr>
 * </table>
 * 
 * <p>A <code>RuleException</code> will be assigned a relative severity
 * which is used to determine how the system <em>should</em> respond to the 
 * exception.</p>
 * 
 * <table border="1">
 * 	<tr>
 *   <th>Level</th>
 *   <th>Description</th>
 * 	</tr>
 * 	<tr>
 * 	 <td>INFORMATION</td>
 *   <td>General feedback intended to inform the user.</td>
 * 	</tr>
 * <tr>
 * 	 <td>WARNING</td>
 *   <td>
 *    Information produced in the course of evaluating a <code>Rule</code>
 *    which, while not fatal, should be relayed back to the caller.
 *   </td>   
 * 	</tr>
 *  <tr>
 *   <td>ERROR</td>
 *   <td>
 *    A significant problem encountered while evaluating a rule which should
 *    prevent the application server from taking any permanent action such as
 *    creating or updating an object in the persistent data store.
 *   </td>
 *  </tr>
 * </table>
 * 
 * @author Derek Berube, Wildstar Technologies, LLC.
 * @version 1.0
 * @since 1.0
 */
public class RuleException extends RuntimeException {
	/* Used in object serialization/deserialization */
	private static final long serialVersionUID = -3790314067359745414L;
	/* Class name used in logging. */
	private static final String _CLASS=RuleException.class.getName();
	/* Default logger */
	private static final Logger logger=Logger.getLogger(_CLASS);
	
	/* The property to which the exception pertains. */
	private String propertyName=null;
	
	/* An indicator for the severity of the exception. */ 
	private Level level=null;
	
	/* Free-form text associated with the exception. */
	private String message=null;
	
	/** 
	 * Enumerated data type used to identify the severity of the exception.
	 */
	public enum Level {INFORMATION,WARNING,ERROR};
	
	/** 
	 * Returns <code>true</code> if the list contains at least one error.
	 */
	public static boolean containsError(List<RuleException> exceptions) {
		logger.entering(_CLASS,"containsError(List<RuleException>",exceptions);
		boolean result=false;
		for (RuleException exception: exceptions) {
			if (exception.getLevel().equals(RuleException.Level.ERROR)) {
				result=true;
				break;
			} // END if (exception.getLevel().equals(RuleException.Level.ERROR))
		} // END for (RuleException exception: exceptions)
		logger.exiting(_CLASS,"containsError(List<RuleException>",result);
		return result;
	}
	
	/**
	 * Default, no argument exception.
	 */
	public RuleException() {
		logger.entering(_CLASS,"RuleException()");
		logger.exiting(_CLASS,"RuleException()");
	}
	
	public RuleException(Level level, String propertyName, String message) {
		logger.entering(_CLASS,"RuleException(Level,String,String)",
				new Object[] {level,propertyName,message});
		setLevel(level);
		setPropertyName(propertyName);
		setMessage(message);
		logger.exiting(_CLASS,"RuleException(Level,String,String)");
	}
	
	//********** Accessor Methods
	//***** level
	public Level getLevel() {
		logger.entering(_CLASS,"getLevel()");
		logger.exiting(_CLASS,"getLevel()",this.level);
		return this.level;
	}
	protected void setLevel(Level level) {
		logger.entering(_CLASS,"setLevel(Level)",level);
		if (level == null) {
			this.level=Level.INFORMATION;
		} else {
			this.level=level;
		} // END if (level == null)
		logger.exiting(_CLASS,"setLevel(Level)");		
	}
	//***** message
	public String getMessage() {
		logger.entering(_CLASS,"getMessage()");
		logger.exiting(_CLASS,"getMessage()",this.message);
		return this.message;
	}
	protected void setMessage(String message) {
		logger.entering(_CLASS,"getMessage(String)",message);
		if (message == null) {
			this.message="";
		} else {
			this.message=message;
		} // END if (message == null) 
		logger.exiting(_CLASS,"getMessage(String)");		
	}
	//***** propertyName
	public String getPropertyName() {
		logger.entering(_CLASS,"getPropertyName()");
		logger.exiting(_CLASS,"getPropertyName()",this.propertyName);
		return this.propertyName;
	}
	protected void setPropertyName(String propertyName) {
		logger.entering(_CLASS,"setPropertyName(String)",propertyName);
		if (propertyName == null) {
			this.propertyName="";
		} else {
			this.propertyName=propertyName;
		} // END if (propertyName == null) 
		logger.exiting(_CLASS,"getPropertyName(String)");		
	}
}
