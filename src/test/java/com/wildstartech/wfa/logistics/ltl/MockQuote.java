package com.wildstartech.wfa.logistics.ltl;

import java.util.List;

import com.wildstartech.wfa.journal.JournalEntry;
import com.wildstartech.wfa.logistics.ltl.pricemodels.PriceModel;
import com.wildstartech.wfa.ticketing.MockBasicTicket;

public class MockQuote extends MockBasicTicket implements Quote {

   @Override
   public JournalEntry getNewJournalEntry() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setNewJournalEntry(JournalEntry entry) {
      // TODO Auto-generated method stub

   }

   @Override
   public double getAccessorialTotal() {
      // TODO Auto-generated method stub
      return 0;
   }

   @Override
   public void setAccessorialTotal(double total) {
      // TODO Auto-generated method stub

   }

   @Override
   public List<AccessorialCharge> getAccessorialCharges() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public AccessorialCharge addAccessorialCharge(AccessorialCharge charge) {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public AccessorialCharge getAccessorialCharge(int i) {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public AccessorialCharge removeAccessorialCharge(AccessorialCharge charge) {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public double getAdjustmentAmount() {
      // TODO Auto-generated method stub
      return 0;
   }

   @Override
   public void setAdjustmentAmount(double amount) {
      // TODO Auto-generated method stub

   }

   @Override
   public AdjustmentType getAdjustmentType() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setAdjustmentType(AdjustmentType type) {
      // TODO Auto-generated method stub

   }

   @Override
   public double getAmount() {
      // TODO Auto-generated method stub
      return 0;
   }

   @Override
   public void setAmount(double amount) {
      // TODO Auto-generated method stub

   }

   @Override
   public boolean isAssemblyRequired() {
      // TODO Auto-generated method stub
      return false;
   }

   @Override
   public void setAssemblyRequired(boolean assembly) {
      // TODO Auto-generated method stub

   }

   @Override
   public boolean isBlanketWrapRequired() {
      // TODO Auto-generated method stub
      return false;
   }

   @Override
   public void setBlanketWrapRequired(boolean blanketwrap) {
      // TODO Auto-generated method stub

   }

   @Override
   public String getBillingCity() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setBillingCity(String city) {
      // TODO Auto-generated method stub

   }

   @Override
   public String getBillingCompanyName() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setBillingCompanyName(String companyName) {
      // TODO Auto-generated method stub

   }

   @Override
   public String getBillingContactEmail() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setBillingContactEmail(String contactEmail) {
      // TODO Auto-generated method stub

   }

   @Override
   public String getBillingContactName() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setBillingContactName(String contactName) {
      // TODO Auto-generated method stub

   }

   @Override
   public String getBillingContactPhone() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setBillingContactPhone(String contactPhone) {
      // TODO Auto-generated method stub

   }

   @Override
   public String getBillingMethod() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setBillingMethod(String method) {
      // TODO Auto-generated method stub

   }

   @Override
   public String getBillingState() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setBillingState(String state) {
      // TODO Auto-generated method stub

   }

   @Override
   public String getBillingStreetAddress() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setBillingStreetAddress(String address) {
      // TODO Auto-generated method stub

   }

   @Override
   public String getBillingZip() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setBillingZip(String zipCode) {
      // TODO Auto-generated method stub

   }

   @Override
   public void calculateRate() {
      // TODO Auto-generated method stub

   }

   @Override
   public String getContactCompanyName() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setContactCompanyName(String companyName) {
      // TODO Auto-generated method stub

   }

   @Override
   public String getContactEmail() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setContactEmail(String contactEmail) {
      // TODO Auto-generated method stub

   }

   @Override
   public String getContactName() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setContactName(String contactName) {
      // TODO Auto-generated method stub

   }

   @Override
   public String getContactPhone() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setContactPhone(String contactPhone) {
      // TODO Auto-generated method stub

   }

   @Override
   public boolean isCratingRequired() {
      // TODO Auto-generated method stub
      return false;
   }

   @Override
   public void setCratingRequired(boolean crating) {
      // TODO Auto-generated method stub

   }

   @Override
   public int getCreditCardExpirationMonth() {
      // TODO Auto-generated method stub
      return 0;
   }

   @Override
   public void setCreditCardExpirationMonth(int expirationMonth) {
      // TODO Auto-generated method stub

   }

   @Override
   public int getCreditCardExpirationYear() {
      // TODO Auto-generated method stub
      return 0;
   }

   @Override
   public void setCreditCardExpirationYear(int expirationYear) {
      // TODO Auto-generated method stub

   }

   @Override
   public String getCreditCardName() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setCreditCardName(String cardName) {
      // TODO Auto-generated method stub

   }

   @Override
   public String getCreditCardNumber() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setCreditCardNumber(String number) {
      // TODO Auto-generated method stub

   }

   @Override
   public String getCreditCardType() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setCreditCardType(String type) {
      // TODO Auto-generated method stub

   }

   @Override
   public String getCreditCardVerification() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setCreditCardVerification(String ccv) {
      // TODO Auto-generated method stub

   }

   @Override
   public String getCustomerReferenceNote() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setCustomerReferenceNote(String note) {
      // TODO Auto-generated method stub

   }

   @Override
   public double getDeductible() {
      // TODO Auto-generated method stub
      return 0;
   }

   @Override
   public void setDeductible(double amount) {
      // TODO Auto-generated method stub

   }

   @Override
   public String getDestinationCity() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setDestinationCity(String destinationCity) {
      // TODO Auto-generated method stub

   }

   @Override
   public String getDestinationCompanyName() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setDestinationCompanyName(String destinationCompanyName) {
      // TODO Auto-generated method stub

   }

   @Override
   public String getDestinationContactEmail() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setDestinationContactEmail(String destinationContactEmail) {
      // TODO Auto-generated method stub

   }

   @Override
   public String getDestinationContactName() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setDestinationContactName(String destinationContactName) {
      // TODO Auto-generated method stub

   }

   @Override
   public String getDestinationContactPhone() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setDestinationContactPhone(String destinationContactPhone) {
      // TODO Auto-generated method stub

   }

   @Override
   public boolean isDestinationResidential() {
      // TODO Auto-generated method stub
      return false;
   }

   @Override
   public void setDestinationResidential(boolean residential) {
      // TODO Auto-generated method stub

   }

   @Override
   public String getDestinationState() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setDestinationState(String destinationState) {
      // TODO Auto-generated method stub

   }

   @Override
   public String getDestinationStreetAddress() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setDestinationStreetAddress(String destinationState) {
      // TODO Auto-generated method stub

   }

   @Override
   public String getDestinationZip() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setDestinationZip(String destinationZip) {
      // TODO Auto-generated method stub

   }

   @Override
   public double getDistance() {
      // TODO Auto-generated method stub
      return 0;
   }

   @Override
   public void setDistance(double distance) {
      // TODO Auto-generated method stub

   }

   @Override
   public double getFuelSurcharge() {
      // TODO Auto-generated method stub
      return 0;
   }

   @Override
   public void setFuelSurcharge(double fuelSurcharge) {
      // TODO Auto-generated method stub

   }

   @Override
   public double getInsuranceCharges() {
      // TODO Auto-generated method stub
      return 0;
   }

   @Override
   public void setInsuranceCharges(double insuranceCharge) {
      // TODO Auto-generated method stub

   }

   @Override
   public List<QuoteLineItem> getLineItems() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public QuoteLineItem addLineItem(QuoteLineItem item) {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public QuoteLineItem createLineItem() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public QuoteLineItem removeLineItem(QuoteLineItem item) {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public QuoteLineItem getLineItem(int i) {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public double getLineItemCharges() {
      // TODO Auto-generated method stub
      return 0;
   }

   @Override
   public void setLineItemCharges(double charges) {
      // TODO Auto-generated method stub

   }

   @Override
   public String getNotes() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setNotes(String notes) {
      // TODO Auto-generated method stub

   }

   @Override
   public int getNumberOfFlights() {
      // TODO Auto-generated method stub
      return 0;
   }

   @Override
   public void setNumberOfFlights(int numberOfFlights) {
      // TODO Auto-generated method stub

   }

   @Override
   public String getOrderType() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setOrderType(String orderType) {
      // TODO Auto-generated method stub

   }

   @Override
   public String getOriginCity() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setOriginCity(String originCity) {
      // TODO Auto-generated method stub

   }

   @Override
   public String getOriginCompanyName() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setOriginCompanyName(String originCompanyName) {
      // TODO Auto-generated method stub

   }

   @Override
   public String getOriginContactEmail() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setOriginContactEmail(String originContactEmail) {
      // TODO Auto-generated method stub

   }

   @Override
   public String getOriginContactName() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setOriginContactName(String originContactName) {
      // TODO Auto-generated method stub

   }

   @Override
   public String getOriginContactPhone() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setOriginContactPhone(String originContactPhone) {
      // TODO Auto-generated method stub

   }

   @Override
   public boolean isOriginResidential() {
      // TODO Auto-generated method stub
      return false;
   }

   @Override
   public void setOriginResidential(boolean residential) {
      // TODO Auto-generated method stub

   }

   @Override
   public String getOriginState() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setOriginState(String originStreetAddress) {
      // TODO Auto-generated method stub

   }

   @Override
   public String getOriginStreetAddress() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setOriginStreetAddress(String originState) {
      // TODO Auto-generated method stub

   }

   @Override
   public String getOriginZip() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setOriginZip(String originZip) {
      // TODO Auto-generated method stub

   }

   @Override
   public String getPaymentMethod() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setPaymentMethod(String paymentMethod) {
      // TODO Auto-generated method stub

   }

   @Override
   public boolean isPackagingRequired() {
      // TODO Auto-generated method stub
      return false;
   }

   @Override
   public void setPackagingRequired(boolean packaging) {
      // TODO Auto-generated method stub

   }

   @Override
   public PriceModel getPriceModel() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setPriceModel(PriceModel model) {
      // TODO Auto-generated method stub

   }

   @Override
   public String getPurchaseOrderNumber() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setPurchaseOrderNumber(String poNumber) {
      // TODO Auto-generated method stub

   }

   @Override
   public String getReferralSource() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setReferralSource(String source) {
      // TODO Auto-generated method stub

   }

   @Override
   public String getReferralOther() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setReferralOther(String other) {
      // TODO Auto-generated method stub

   }

   @Override
   public boolean isStairCarry() {
      // TODO Auto-generated method stub
      return false;
   }

   @Override
   public void setStairCarry(boolean value) {
      // TODO Auto-generated method stub

   }

   @Override
   public String getServiceLevel() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setServiceLevel(String serviceLevel) {
      // TODO Auto-generated method stub

   }

   @Override
   public int getTotalCubes() {
      // TODO Auto-generated method stub
      return 0;
   }

   @Override
   public int getTotalWeight() {
      // TODO Auto-generated method stub
      return 0;
   }

   @Override
   public boolean isUnpackagingRequired() {
      // TODO Auto-generated method stub
      return false;
   }

   @Override
   public void setUnpackagingRequired(boolean unpackaging) {
      // TODO Auto-generated method stub

   }

   @Override
   public double getValuation() {
      // TODO Auto-generated method stub
      return 0;
   }

   @Override
   public void setValuation(double amount) {
      // TODO Auto-generated method stub

   }

   @Override
   public boolean isValuationDeclined() {
      // TODO Auto-generated method stub
      return false;
   }

   @Override
   public void setValuationDeclined(boolean value) {
      // TODO Auto-generated method stub

   }

   @Override
   public String getWorkOrderRequestId() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setWorkOrderRequestId(String workOrderRequestId) {
      // TODO Auto-generated method stub

   }

}
