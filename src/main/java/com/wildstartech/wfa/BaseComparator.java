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
package com.wildstartech.wfa;

import java.util.Comparator;
import java.util.logging.Logger;

public abstract class BaseComparator<T extends Object> 
implements Comparator<T> {
   private static final String _CLASS=BaseComparator.class.getName();
   private static final Logger logger=Logger.getLogger(_CLASS);
   
   @Override
   public abstract int compare(T object1, T object2);
   
   //***** Helper methods
   /**
    * Compare two strings.
    * @param string1 The value to which the second parameter must be compared.
    * @param string2 The value which must be compared to the first parameter.
    * @return Returns a value of 0 if the strings are lexically equal.  Returns a 
    * value of -1 if the <code>string1</code> parameter is less than the 
    * <code>string2</code> parameter.
    */
   protected int compare(String string1, String string2) {
      logger.entering(_CLASS, "compare(String,String)",
            new Object[] {string1, string2});
      int result=0;
      if ((string1 != null) && (string2 != null)) {
         result=string1.compareTo(string2);
      } else if ((string1 == null) && (string2 == null)) { 
         throw new NullPointerException("Both parameters are null.");         
      } else if ((string1 == null) && (string2 != null)) {
         throw new NullPointerException("The first String parameter is null.");
      } else {
         throw new NullPointerException("The second String parameter is null.");
      } // END if ((item1 != null) && (item2 != null))
      logger.exiting(_CLASS, "compare(String,String)",result);
      return result;
   }
}