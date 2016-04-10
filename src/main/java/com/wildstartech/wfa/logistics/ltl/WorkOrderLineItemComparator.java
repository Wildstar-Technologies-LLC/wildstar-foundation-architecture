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
package com.wildstartech.wfa.logistics.ltl;

import java.util.logging.Logger;

public class WorkOrderLineItemComparator
      extends EditableCommodityLineItemComparator<WorkOrderLineItem> {
   /** Used in object serialization. */
   private static final long serialVersionUID = -1459335825357159000L;
   private static final String _CLASS=
         WorkOrderLineItemComparator.class.getName();
   private static final Logger logger=Logger.getLogger(_CLASS);
   
   public int compare(WorkOrderLineItem lineItem1, WorkOrderLineItem lineItem2){
      logger.entering(_CLASS,"compare(WorkOrderLineItem,WorkOrderLineItem",
            new Object[] {lineItem1, lineItem2});
      int result=0;
      
      result=super.compare(lineItem1, lineItem2);
      if (result != 0) {
         return result;         
      } // END if (result != 0)
      // price
      result=Float.compare(lineItem1.getPrice(), lineItem2.getPrice());
      if (result != 0) {
         return result;         
      } // END if (result != 0)
      // totalPrice      
      result=Float.compare(
            lineItem1.getTotalPrice(), 
            lineItem2.getTotalPrice());
      if (result != 0) {
         return result;         
      } // END if (result != 0)
      
      logger.entering(_CLASS,"compare(WorkOrderLineItem,WorkOrderLineItem",
            result);
      return result;
   }
}
