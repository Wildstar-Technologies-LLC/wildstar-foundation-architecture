package com.wildstartech.wfa.logistics.ltl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.wildstartech.wfa.journal.JournalEntry;
import com.wildstartech.wfa.ticketing.MockBasicTicket;

public class MockReceiverWorkOrder extends MockBasicTicket
implements ReceiverWorkOrder {

   private Date dateReceived;
   private JournalEntry newJournalEntry=null;
   private List<ReceiverWorkOrderLineItem> lineItems=null;
   private String billOfLadingNumber="";
   private String carrier="";
   private String purchaseOrderNumber="";
   private String salesOrderNumber="";
   
   //***** billOfLadingNumber
   @Override
   public String getBillOfLadingNumber() {
      return this.billOfLadingNumber;
   }

   @Override
   public void setBillOfLadingNumber(String billOfLading) {
      this.billOfLadingNumber=billOfLading;
   }

   //***** carrier
   @Override
   public String getCarrier() {
      return this.carrier;
   }

   @Override
   public void setCarrier(String carrier) {
      this.carrier=carrier;
   }
   
   //***** dateReceived
   @Override
   public Date getDateReceived() {
      return this.dateReceived;
   }

   @Override
   public void setDateReceived(Date dateReceived) {
      this.dateReceived=dateReceived;
   }
 
   //***** lineItems
   @Override
   public List<ReceiverWorkOrderLineItem> getLineItems() {
      return this.lineItems;
   }

   @Override
   public ReceiverWorkOrderLineItem addLineItem(
         ReceiverWorkOrderLineItem lineItem) {
      boolean added=false;
      ReceiverWorkOrderLineItem result=null;
      
      if (this.lineItems == null) {
         this.lineItems=new ArrayList<ReceiverWorkOrderLineItem>();
      } // END if (this.lineItems == null)
      added=this.lineItems.add(lineItem);
      if (added) {
         result=lineItem;
      } // END if (added)
      
      return result;
   }

   @Override
   public ReceiverWorkOrderLineItem removeLineItem(
         ReceiverWorkOrderLineItem lineItem) {
      boolean removed=false;
      ReceiverWorkOrderLineItem result=null;
      
      removed=this.lineItems.remove(lineItem);
      if (removed) {
         result=lineItem;
      } // END if (this.lineItems.remove(lineItem))
      
      return result;
   }

   //***** newJournalEntry
   @Override
   public JournalEntry getNewJournalEntry() {
      return this.newJournalEntry;
   }

   @Override
   public void setNewJournalEntry(JournalEntry entry) {
      this.newJournalEntry=entry;
   }
   
   //***** purchaseOrderNumber
   @Override
   public String getPurchaseOrderNumber() {
      return this.purchaseOrderNumber;
   }

   @Override
   public void setPurchaseOrderNumber(String purchaseOrderNumber) {
      this.purchaseOrderNumber=purchaseOrderNumber;
   }

   //***** salesOrderNumber
   @Override
   public String getSalesOrderNumber() {
      return this.salesOrderNumber;
   }

   @Override
   public void setSalesOrderNumber(String salesOrderNumber) {
      this.salesOrderNumber=salesOrderNumber;
   }
}