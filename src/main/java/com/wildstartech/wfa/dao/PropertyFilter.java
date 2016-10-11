package com.wildstartech.wfa.dao;

public interface PropertyFilter<T> extends Filter {
   
   
   /**
    * Returns the name of the property.
    * @return
    */
   public String getPropertyName();
   /**
    * Stores the name of the property to which the filter should be applied
    * when executing the query.
    * 
    * @param propertyName The name of the property against which the specified
    * filter should be applied.
    */
   public void setPropertyName(String propertyName);
   
   //*****
   /**
    * Returns the value of the property which should be used in filtering. 
    * 
    * @return The value for the property that should be filtered.
    */
   public T getPropertyValue();
   /**
    * Stores the value that should be used when filtering query results.
    * 
    * @param propertyValue The value that should be used when filtering 
    * query results.
    */
   public void setPropertyValue(T propertyValue);
}