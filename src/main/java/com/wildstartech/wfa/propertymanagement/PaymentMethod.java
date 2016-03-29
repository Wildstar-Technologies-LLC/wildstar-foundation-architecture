package com.wildstartech.wfa.propertymanagement;

public interface PaymentMethod<T> {
   //***** description
   public String getDescription();
   public void setDescription(String description);
   
   //***** type
   public String getType();
   public void setType(String type);
   
   //***** Wrapped Type
   public T getWrappedType();
   public void setWrappedType(T wrappedPaymentMethod);
}