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

public interface CommodityLineItem extends LineItem {
   //***** cube
   /**
    * Returns the number of cubic feet occupied by the object in question.
    * 
    * <p>When calculating the cube value, standard rounding will apply such that 
    * fractional cubic feet less than 0.5 will be rounded <em>down</em> to the 
    * nearest whole number.  Fractional cubic feel 0.5 and up will be rounded 
    * <em>up</em> to the nearest whole number.</p>
    * 
    * @return An integer value indicating the number of volume of space occupied 
    * by the item represented by this line item.
    */
   public int getCube();
   
   //***** description
   public String getDescription();
   public void setDescription(String description);

   //***** height
   public int getHeight();
   public void setHeight(int height);

   //***** length
   public int getLength();
   public void setLength(int length);
   
   //***** packageType
   public String getPackagingType();
   public void setPackagingType(String packagingType);
   
   //********** productId
   public String getProductId();
   public void setProductId(String productId);
   
   //*****
   public int getQuantity();
   public void setQuantity(int quantity);

   //***** weight
   public int getWeight();
   public void setWeight(int weight);

   //***** width
   public int getWidth();
   public void setWidth(int width);
   
   /**
    * Returns the number of cubic feet occupied by the object by the quantity.
    * @return
    */
   public int getTotalCube();
   
   /**
    * Returns the total weight of the quantity of line items represented.
    */
   public int getTotalWeight();
}