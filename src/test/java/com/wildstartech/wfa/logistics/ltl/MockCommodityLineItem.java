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