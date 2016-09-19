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
package com.wildstartech.wfa.dao;

import java.util.ListResourceBundle;

/**
 * A {@code ResourceBundle} containing message templates for use by 
 * implementations of the {@code WildDAO} interface.
 * 
 * @author Derek Berube, Wildstar Technologies, LLC.
 * @version 0.1, 2016-09-08
 *
 */
public class WildDAOResources extends ListResourceBundle {
   public static final String MSGKEY_ADMIN_PWD_NULL="MSGKEY_ADMIN_PWD_NULL";
   public static final String MSGKEY_DELETE_FAIL_NOT_SAVED=
         "MSGKEY_DELETE_FAIL_NOT_SAVED";
   public static final String MSGKEY_NOT_AUTHENTICATED=
         "MSGKEY_NOT_AUTHENTICATED";
   public static final String MSGKEY_NOT_FOUND="MSGKEY_NOT_FOUND";
   public static final String MSGKEY_PARAM_DELETE_NULL=
         "MSGKEY_PARAM_DELETE_NULL";
   public static final String MSGKEY_PARAM_NULL="MSGKEY_PARAM_NULL";
   public static final String MSGKEY_PROPERTIES_NOT_FOUND=
         "MSGKEY_PROPERTIES_NOT_FOUND";
   public static final String MSGKEY_PROPERTIES_ERROR_READING=
         "MSGKEY_PROPERTIES_ERROR_READING";
   
   @Override
   protected Object[][] getContents() {
      return new Object[][] {
         // BEGIN: LOCALIZE the second string in each array.
         {MSGKEY_ADMIN_PWD_NULL,
          "Admin Password not specified. Using default"
         },
         {MSGKEY_DELETE_FAIL_NOT_SAVED,
          "No key, so object hasn't been saved."            
         },
         {MSGKEY_NOT_AUTHENTICATED,
          "The specified UserContext, \"{0}\", is not authenticated."
         },
         {MSGKEY_NOT_FOUND, 
          "Unable to find the entity for the specified key - \"{0}\"."},
         {MSGKEY_PARAM_DELETE_NULL,
          "The alleged object to be deleted is null."             
         },
         {MSGKEY_PARAM_NULL,
          "The {0} parameter was null."
         },
         {MSGKEY_PROPERTIES_NOT_FOUND,
          "Unable to find the properties file."
         },
         {MSGKEY_PROPERTIES_ERROR_READING,
          "Error loading properties file."
         }
         // END: LOCALIZE
      };
   }
}