/*
 * Copyright (c) 2015 Wildstar Technologies, LLC. All Rights Reserved.
 */
package com.wildstartech.wfa.logistics.ltl.pricemodels;

public interface FuelSurchargeModel {
  
  public double FUEL_COST_PER_GALLON=3.12;
  /**
   * Returns a fuel surcharge amount using the specified amount as a reference.
   * @param quote
   * @return Amount to be added to the quote on the fuel surcharge line item.
   */
  public double calculateFuelSurcharge(double referenceAmount);
}
