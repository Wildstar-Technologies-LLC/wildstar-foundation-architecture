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
package com.wildstartech.wfa.dao.resources;

import java.util.ListResourceBundle;

public class User extends ListResourceBundle {
	static final Object[][] contents= {
		// BEGIN TEXT LOCALIZATION
		{"UserNameTooLongException",
		 "The specifie value, \"{1}\", exceeds the maximum allowable length of a user name ({2} characters).",
		 "UserPreferenceKeyNullException",
		 "The value specified as the preference key was either null or a zero-length string.",
		 "UserPreferenceKeyTooLongException",
		 "The specifie value, \"{1}\", exceeds the maximum allowable length of a user preference key ({2} characters).",
		 "UserPreferencePropertyInvalidException",
		 "The specified value for the \"{1}\" preference is not valid for the following reason.\n{2}",
		 "PasswordTooLongException",
		 "The specified value exceeds the maximum allowable length of a password ({1} characters).",
		 "ValidationKeyTooLongException",
		 "The specified value, \"{1}\", exceeds the maximum allowable length of a validation key ({2} characters).",
		 "ValidationException",
		 "Validation of the User object failed.",
		 "DuplicateUserName",
		 "The specified user name, \"{1}\", has already been defined."}
		// END TEXT LOCALIZATION
	};	
	protected Object[][] getContents() {		
		return contents;
	}
}