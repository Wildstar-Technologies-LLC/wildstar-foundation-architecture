package com.wildstartech.wfa.logistics.ltl;


public interface WorkOrder extends Quote {
   public String getBillingCompanyName();
   public void setBillingCompanyName(String company);
   
   public String getBillingContactName();
   public void setBillingContactName(String name);
   
   public String getBillingStreetAddress();
   public void setBillingStreetAddress(String address);
   
   public String getBillingCity();
   public void setBillingCity(String city);
   
   public String getBillingState();
   public void setBillingState(String name);
   
   public String getBillingZip();
   public void setBillingZip(String zip);
   
   public String getContactCompanyName();
   public void setContactCompanyName(String name);  
}