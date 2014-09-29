/*
 * Copyright (c) 2014 Wildstar Technologies, LLC. All Rights Reserved.
 */
package com.wildstartech.wfa.logistics.ltl;

import java.util.List;

public interface Quote {

  //***** accessorialCharges
  public List<AccessorialCharge> getAccessorialCharges();
  public AccessorialCharge addAccessorialCharge(AccessorialCharge charge);
  public AccessorialCharge getAccessorialCharge(int i);
  public AccessorialCharge removeAccessorialCharge(AccessorialCharge charge);
  
  //***** contactEmail
  public String getContactEmail();
  public void setContactEmail(String contactEmail);

  //***** contactName
  public String getContactName();
  public void setContactName(String contactName);

  //***** contactPhone
  public String getContactPhone();
  public void setContactPhone(String contactPhone);
  
  //***** destinationCity
  public String getDestinationCity();
  public void setDestinationCity(String destinationCity);
  
  //***** destinationState
  public String getDestinationState();
  public void setDestinationState(String destinationState);
  
  //***** destinationZip
  public String getDestinationZip();
  public void setDestinationZip(String destinationZip);
  
  //***** distance
  public float getDistance();
  public void setDistance(float distance);
  
  //***** lineItems 
  public List<QuoteLineItem> getLineItems();
  public QuoteLineItem addLineItem(QuoteLineItem item);
  public QuoteLineItem removeLineItem(QuoteLineItem item);
  public QuoteLineItem getLineItem(int i);
  
  //***** notes
  public String getNotes();
  public void setNotes(String notes);
  
  //***** originCity
  public String getOriginCity();
  public void setOriginCity(String destinationCity);
  
  //***** originState
  public String getOriginState();
  public void setOriginState(String originState);
  
  //***** originZip
  public String getOriginZip();
  public void setOriginZip(String originZip);
  
  //***** referralSource
  public String getReferralSource();
  public void setReferralSource(String source);
  
  //***** referralOther
  public String getReferralOther();
  public void setReferralOther(String other);
}