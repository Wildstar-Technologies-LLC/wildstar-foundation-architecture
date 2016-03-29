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
package com.wildstartech.wfa.logistics.ltl;

import java.io.Serializable;
import java.util.Comparator;
import java.util.logging.Logger;

import com.wildstartech.wfa.BaseComparator;

/**
 * Sorts <code>LineItem</code> objects by <code>lineItemNumber</code>.
 * @author Derek Berube, Wildstar Technologies, LLC.
 * @Version 1.0, 2015-09-07
 *
 */
public class LineItemComparator<T extends LineItem>
extends BaseComparator<T>
implements Comparator<T>, Serializable {
   /** Used in object serialization. */
   private static final long serialVersionUID = -8673175973854685664L;
   private static final String _CLASS=LineItemComparator.class.getName();
   private static final Logger logger=Logger.getLogger(_CLASS);
   
   public int compare(T lineItem1, T lineItem2) {
      logger.entering(_CLASS,"compare(LineItem,LineItem)",
            new Object[] {lineItem1,lineItem2});
      int result=0;
      int lineItemNumber1=0;
      int lineItemNumber2=0;
      if ((lineItem1 != null) && (lineItem2 != null)) {
         lineItemNumber1=lineItem1.getLineItemNumber();
         lineItemNumber2=lineItem2.getLineItemNumber();
         result=Integer.compare(lineItemNumber1, lineItemNumber2);         
      } else if ((lineItem1 == null) && (lineItem2 == null)) { 
         throw new NullPointerException("Both parameters are null.");         
      } else if ((lineItem1 == null) && (lineItem2 != null)) {
         throw new NullPointerException("The lineItem1 parameter is null.");
      } else {
         throw new NullPointerException("The lineItem2 parameter is null.");
      } // END if ((item1 != null) && (item2 != null))
      logger.exiting(_CLASS,"compare(LineItem,LineItem)",result);
      return result;    
   }
}