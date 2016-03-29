package com.wildstartech.wfa.logistics.ltl;

public class MockEditableCommodityLineItem 
extends MockCommodityLineItem
implements EditableCommodityLineItem {
   private boolean customDescription=false;
   private boolean customDimensions=false;
   private boolean customWeight=false;
   
   @Override
   public boolean isCustomDescription() {
      return this.customDescription;
   }

   @Override
   public void setCustomDescription(boolean customDescription) {
      this.customDescription=customDescription;
   }

   @Override
   public boolean isCustomDimensions() {
      return this.customDimensions;
   }

   @Override
   public void setCustomDimensions(boolean customDimenstions) {
      this.customDimensions=customDimenstions;
   }

   @Override
   public boolean isCustomWeight() {
      return this.customWeight;
   }

   @Override
   public void setCustomWeight(boolean customWeight) {
      this.customWeight=customWeight;
   }
   @Override
   public String toPropertyString() {
      StringBuilder sb=null;
      
      sb=new StringBuilder(1024);
      if (sb.length() > 0) {
         sb.append(", ");
      } // END if (sb.length() > 0)
      sb.append("customDescription=").append(isCustomDescription());
      sb.append(", ");
      sb.append("customDimensions=").append(isCustomDimensions()).append(", ");
      sb.append("customWeight=").append(isCustomWeight()).append(", ");      
      
      return sb.toString();
   }
   @Override
   public String toString() {
      StringBuilder sb=null;
      sb=new StringBuilder(1024);
      sb.append(MockEditableCommodityLineItem.class.getName()).append(" [");
      sb.append(toPropertyString());
      sb.append("]");
      return sb.toString();
   }
}