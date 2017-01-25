package com.wildstartech.wfa.logistics.ltl.receiver;

import com.wildstartech.wfa.journal.Journalizable;
import com.wildstartech.wfa.logistics.WarehouseLocation;
import com.wildstartech.wfa.logistics.ltl.LineItem;

public interface ReceiverWorkOrderLineItem 
extends LineItem, Journalizable {
   public WarehouseLocation getLocation();
   public void setLocation(WarehouseLocation warehouseLocation);
   
   public boolean hasException();
   public void setException(boolean exception);
   
   public String getExceptionDescription();
   public void setExceptionDescription(String description);
}