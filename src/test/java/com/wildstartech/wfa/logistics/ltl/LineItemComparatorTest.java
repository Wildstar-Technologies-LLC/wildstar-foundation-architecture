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