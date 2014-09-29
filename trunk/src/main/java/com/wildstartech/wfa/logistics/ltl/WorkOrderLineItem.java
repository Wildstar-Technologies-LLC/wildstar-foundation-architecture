/*
 * Copyright (c) 2001 - 2014 Wildstar Technologies, LLC.
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

public interface WorkOrderLineItem {
    /**
     * Indicates the maximum allowable length for a line item's description.
     */
    public static final int MAX_DESCRIPTION_LENGTH = 255;
    /**
     * Indicates the maximum allowable length for a line item's product ID.
     */
    public static final int MAX_PRODUCT_ID_LENGTH = 25;
    //********** itemNumber
    public int getItemNumber();

    public void setItemNumber(int num);
    //********** description
    public String getDescription();

    public void setDescription(String desc) throws DescriptionTooLongException;
    //********** productId
    public String getProductId();

    public void setProductId(String productId) throws ProductIdTooLongException;
    //********** quantity
    public int getQuantity();

    public void setQuantity(int qty);
    //********** length
    public float getLength();

    public void setLength(float length) throws InvalidDimensionException;
    //********** width
    public float getWidth();

    public void setWidth(float width) throws InvalidDimensionException;
    //********** height
    public float getHeight();

    public void setHeight(float width) throws InvalidDimensionException;
    //********** weight
    public float getWeight();

    public void setWeight(float weight) throws InvalidDimensionException;
    //********** price
    public float getPrice();

    public void setPrice(float price);
    //********** totalPrice
    public float getTotalPrice();

    public void setTotalPrice(float totalPrice);

    /**
     * Return a reference to the WorkOrder to which this object is associated.
     */
    public WorkOrder getWorkOrder();
}
