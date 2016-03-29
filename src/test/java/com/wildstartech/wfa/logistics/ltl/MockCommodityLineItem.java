package com.wildstartech.wfa.logistics.ltl;

public class MockCommodityLineItem 
extends MockLineItem 
implements CommodityLineItem {
   private int height=0;
   private int length=0;
   private int quantity=0;
   private int weight=0;
   private int width=0;
   private String description="";
   private String packagingType = "";
   private String productId="";
   
   /**
    * Default, no-argument constructor.
    */
   public MockCommodityLineItem() {
      
   }
   @Override
   public int getCube() {
      return (this.length*this.width*this.height)/(12*12*12);
   }

   //***** description
   @Override
   public String getDescription() {
      return this.description;
   }
   
   @Override
   public void setDescription(String description) {
      this.description=description;      
   }
   //***** height
   @Override
   public int getHeight() {
      return this.height;
   }

   @Override
   public void setHeight(int height) {
      this.height=height;      
   }
   //***** length
   @Override
   public int getLength() {
      return this.length;
   }

   @Override
   public void setLength(int length) {
      this.length=length;
   }
   
   //***** packagingType
   @Override
   public String getPackagingType() {
      return this.packagingType;
   }
   @Override
   public void setPackagingType(String packagingType) {
      this.packagingType=packagingType;
   }
   
   //***** productId
   @Override
   public String getProductId() {
      return this.productId;
   }

   @Override
   public void setProductId(String productId) {
      this.productId=productId;
   }
   //***** quantity
   @Override
   public int getQuantity() {
      return this.quantity;
   }

   @Override
   public void setQuantity(int quantity) {
      this.quantity=quantity;      
   }
   //***** totalCube
   @Override
   public int getTotalCube() {
      return getQuantity() * getCube();
   }
   //***** weight
   @Override
   public int getWeight() {
      return this.weight;
   }

   @Override
   public void setWeight(int weight) {
      this.weight=weight;
   }
   
   public int getTotalWeight() {
      return this.weight*this.quantity;
   }
   //***** width
   @Override
   public int getWidth() {
      return this.width;
   }

   @Override
   public void setWidth(int width) {
      this.width=width;
   }  
   @Override
   public String toPropertyString() {
      StringBuilder sb=null;
      
      sb=new StringBuilder(1024);
      if (sb.length() > 0) {
         sb.append(", ");
      } // END if (sb.length() > 0)
      sb.append("description=").append(getDescription()).append(", ");
      sb.append("productId=").append(getProductId()).append(", ");
      sb.append("length=").append(getLength()).append(", ");
      sb.append("width=").append(getWidth()).append(", ");
      sb.append("height=").append(getHeight()).append(", ");
      sb.append("cube=").append(getCube()).append(", ");
      sb.append("weight=").append(getWeight()).append(", ");
      sb.append("quantity=").append(getQuantity()).append(", ");
      sb.append("totalCube=").append(getTotalCube());
      
      return sb.toString();
   }
   @Override
   public String toString() {
      StringBuilder sb=null;
      sb=new StringBuilder(1024);
      sb.append(MockCommodityLineItem.class.getName()).append(" [");
      sb.append(toPropertyString());
      sb.append("]");
      return sb.toString();
   }
}