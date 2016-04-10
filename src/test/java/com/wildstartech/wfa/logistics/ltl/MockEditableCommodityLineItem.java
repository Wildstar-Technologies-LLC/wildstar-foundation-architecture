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