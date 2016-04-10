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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class LineItemComparatorTest {
   @Test
   public void testSorting() {
      List<LineItem> lineItems=null;
      
      lineItems=new ArrayList<LineItem>();
      lineItems.add(new MockLineItem(10));
      lineItems.add(new MockLineItem(3));
      lineItems.add(new MockLineItem(9));
      lineItems.add(new MockLineItem(6));
      lineItems.add(new MockLineItem(1));
      lineItems.add(new MockLineItem(7));
      lineItems.add(new MockLineItem(5));
      lineItems.add(new MockLineItem(8));
      lineItems.add(new MockLineItem(4));
      lineItems.add(new MockLineItem(2));
      
      Collections.sort(lineItems,new LineItemComparator());
      
      assert lineItems.get(0).getLineItemNumber() == 1;
      assert lineItems.get(1).getLineItemNumber() == 2;
      assert lineItems.get(2).getLineItemNumber() == 3;
      assert lineItems.get(3).getLineItemNumber() == 4;
      assert lineItems.get(4).getLineItemNumber() == 5;
      assert lineItems.get(5).getLineItemNumber() == 6;
      assert lineItems.get(6).getLineItemNumber() == 7;
      assert lineItems.get(7).getLineItemNumber() == 8;
      assert lineItems.get(8).getLineItemNumber() == 9;
      assert lineItems.get(9).getLineItemNumber() == 10;
   }
}