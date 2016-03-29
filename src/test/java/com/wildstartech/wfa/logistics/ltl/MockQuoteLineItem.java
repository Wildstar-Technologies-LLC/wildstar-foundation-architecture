package com.wildstartech.wfa.logistics.ltl;

public class MockQuoteLineItem 
extends MockEditableCommodityLineItem
implements QuoteLineItem {
   @Override
   public String toPropertyString() {
      StringBuilder sb=null;
      
      sb=new StringBuilder(1024);
      if (sb.length() > 0) {
         sb.append(", ");
      } // END if (sb.length() > 0)
      
      return sb.toString();
   }
   @Override
   public String toString() {
      StringBuilder sb=null;
      sb=new StringBuilder(1024);
      sb.append(MockQuoteLineItem.class.getName()).append(" [");
      sb.append(toPropertyString());
      sb.append("]");
      return sb.toString();
   }
}