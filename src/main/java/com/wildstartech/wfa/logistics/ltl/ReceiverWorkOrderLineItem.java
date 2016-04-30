package com.wildstartech.wfa.logistics.ltl;

import com.wildstartech.wfa.journal.Journalizable;

public interface ReceiverWorkOrderLineItem 
extends LineItem, Journalizable {
   public String getLocation();
   public void setLocation(String rackLocation);
   
   public boolean hasException();
   public void setException(boolean exception);
   
   public String getExceptionDescription();
   public void setExceptionDescription(String description);
}