package com.wildstartech.wfa.logistics.ltl;

import java.text.NumberFormat;

public class MockWorkOrderLineItem 
extends MockEditableCommodityLineItem
implements WorkOrderLineItem {
   private float price=0f;
   
   @Override
   public float getPrice() {
      return this.price;
   }

   @Override
   public void setPrice(float price) {
      this.price=price;
   }

   @Override
   public float getTotalPrice() {
      return this.price * getQuantity();
   }
   
   @Override
   public String toPropertyString() {
      StringBuilder sb=null;
      NumberFormat cFmt=null;
      
      sb=new StringBuilder(1024);
      cFmt=NumberFormat.getCurrencyInstance();
      
      if (sb.length() > 0) {
         sb.append(", ");
      } // END if (sb.length() > 0)
      sb=new StringBuilder(80);
      sb.append("price=").append(cFmt.format(getPrice())).append(", ");
      sb.append("totalPrice=").append(cFmt.format(getTotalPrice()));
      
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