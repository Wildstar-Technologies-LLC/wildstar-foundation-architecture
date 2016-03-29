package com.wildstartech.wfa.propertymanagement;

import javax.money.MonetaryAmount;

public interface PaymentAmount {
   public MonetaryAmount getAmount();
   public void setAmount(MonetaryAmount amount);
   public void setAmount(float amount);
   
   
}