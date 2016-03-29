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
package com.wildstartech.wfa.logistics.ltl.pricemodels;

import com.wildstartech.wfa.logistics.ltl.Quote;
import com.wildstartech.wfa.logistics.ltl.WorkOrder;

/**
 * Pricing model for use in determining shipping rates.
 * @author Derek Berube, Wildstar Technologies, LLC.
 * @version 0.3, 2015-04-21
 *
 */
public interface PriceModel {
  
  //*****
  /**
   * Indicates whether this model is the default <code>PriceModel</code>.
   * 
   * @return A value of <code>true</code> if the price model is the default
   * price model to be used.  Otherwise, a value of <code>false</code> is 
   * returned.
   */
  public boolean isDefault();
  /**
   * Sets the flag to indicate whether or not the current model is the default.
   * 
   * <p>There can be only one default price model.  As such, the first 
   * price model created will be the default price model.  When the 
   * <code>setDefault()</code> method is invoked on a <code>PriceModel</code> 
   * and it is NOT already the default model, then this model will become the
   * default and the current default will no longer be default.</p>
   * <p>Invoking this method on the model which is already the default model
   * has no effect.</p>
   */
  public void setDefault();
  
  //***** name
  /**
   * Returns the label assigned to this <code>PriceModel</code>.
   * <p>Price models can be customized and tailored to meet different situations
   * and customers.  When tailoring a price model, a unique name is assigned
   * to the  
   * 
   * <p>The names assigned to a price model must be unique.</p>
   * @return
   */
  public String getLabel();
  public void setLabel(String label);
  
  //***** type
  /**
   * Returns name that conveys a sense of how the price model works.
   * <p>For example, if the <code>getType</code> method is invoked on an
   * instance of the <code>CubeDistancePriceModel</code>, then the method will
   * return a value of "Cube/Distance". 
   * @return
   */
  public String getType();
  
  //***** charge
  /**
   * Returns the total amount to charge for the specified quote.
   * 
   * <p>A given <code>PriceModel</code> will be responsible for inspecting a 
   * quote and applying <em>all</em> necessary logic in order to determine an 
   * appropriate price to charge.   The <code>PriceModel</code> will be  
   * responsible for updating the various charge-related field's on the quote  
   * (e.g., <code>lineItemCharges</code>, <code>insuranceCharges</code>, 
   * etc.</p>
   * 
   * @param quote The <code>Quote</code> to be examined in order to determine
   * an appropriate price to charge.
   * @return The amount of money to charge for the quote.
   */
  public double calculateTotalCharges(Quote quote);
  
  /**
   * Returns the total amount to charge for the specified quote.
   * 
   * <p>A given <code>PriceModel</code> will be responsible for inspecting a 
   * quote and applying <em>all</em> necessary logic in order to determine an 
   * appropriate price to charge.   The <code>PriceModel</code> will be  
   * responsible for updating the various charge-related field's on the quote  
   * (e.g., <code>lineItemCharges</code>, <code>insuranceCharges</code>, 
   * etc.</p>
   * 
   * @param quote The <code>WorkOrder</code> to be examined in order to 
   * determine an appropriate price to charge.
   * @return The amount of money to charge for the quote. 
   */
  public double calculateTotalCharges(WorkOrder workOrder);
}