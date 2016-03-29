package com.wildstartech.wfa.logistics.ltl;

public class MockLineItem implements LineItem {
   private int lineItemNumber=-1;
   
   /**
    * Default, no-argument constructor.
    */
   public MockLineItem() {
      
   }
   
   public MockLineItem(int lineItemNumber) {
      this.lineItemNumber=lineItemNumber;
   }
   @Override
   public int getLineItemNumber() {
      return this.lineItemNumber;
   }

   @Override
   public void setLineItemNumber(int lineItem) {      
      this.lineItemNumber=lineItem;
   }
   
   public String toPropertyString() {
      StringBuilder sb=null;
      
      sb=new StringBuilder(80);
      sb.append("lineItemNumber=").append(this.lineItemNumber);
      
      return sb.toString();
   }
   public String toString() {
      StringBuilder sb=null;
      sb=new StringBuilder(1024);
      sb.append(MockLineItem.class.getName()).append(" [");
      sb.append(toPropertyString());
      sb.append("]");
      return sb.toString();
   }
}