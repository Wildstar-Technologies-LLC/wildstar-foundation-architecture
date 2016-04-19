package com.wildstartech.wfa.logistics.ltl;

public class MockFreightDueInWorkOrderLineItem 
extends MockEditableCommodityLineItem 
implements FreightDueInWorkOrderLineItem {
   private String workOrderIdentifier;
   
   @Override
   public String getWorkOrderIdentifier() {
      return this.workOrderIdentifier;
   }

   @Override
   public void setWorkOrderIdentifier(String identifier) {
      this.workOrderIdentifier=identifier;
   }
}