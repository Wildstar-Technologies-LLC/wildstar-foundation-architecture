package com.wildstartech.wfa.logistics.ltl;

import java.util.List;

import com.wildstartech.wfa.journal.Journalizable;
import com.wildstartech.wfa.logistics.ltl.pricemodels.PriceModel;
import com.wildstartech.wfa.ticketing.BasicTicket;

public interface WorkOrder extends BasicTicket, Journalizable {
   public enum AdjustmentType { FixedAmount, Percentage };
   
   //***** accessorialCharges
   public double getAccessorialTotal();
   public void setAccessorialTotal(double total);
   public List<AccessorialCharge> getAccessorialCharges();
   public AccessorialCharge addAccessorialCharge(AccessorialCharge charge);
   public AccessorialCharge getAccessorialCharge(int i);
   public AccessorialCharge removeAccessorialCharge(AccessorialCharge charge);
   
   //***** adjustmentAmount
   public double getAdjustmentAmount();
   public void setAdjustmentAmount(double amount);
   
   //***** adjustmetnType
   public AdjustmentType getAdjustmentType();
   public void setAdjustmentType(AdjustmentType type);
   
   //***** amount
   public double getAmount();
   public void setAmount(double amount);
   
   //***** assemblyRequired
   public boolean isAssemblyRequired();
   public void setAssemblyRequired(boolean assembly);
   
   //***** billingCity
   public String getBillingCity();
   public void setBillingCity(String city);
   
   //***** billingCompanyName
   public String getBillingCompanyName();
   public void setBillingCompanyName(String name);
   
   //***** billingContactEmail
   public String getBillingContactEmail();
   public void setBillingContactEmail(String contactEmail);
   
   //***** billingContactName
   public String getBillingContactName();
   public void setBillingContactName(String contactName);
   
   //***** billingContactPhone
   public String getBillingContactPhone();
   public void setBillingContactPhone(String contactPhone);
   
   //***** billingMethod
   public String getBillingMethod();
   public void setBillingMethod(String method);
   
   //***** billingState
   public String getBillingState();
   public void setBillingState(String state);
   
   //***** billingStreetAddress
   public String getBillingStreetAddress();
   public void setBillingStreetAddress(String streetAddress);
   
   //***** billingZip
   public String getBillingZip();
   public void setBillingZip(String zip);
   
   //***** blanketwrap
   public boolean isBlanketWrapRequired();
   public void setBlanketWrapRequired(boolean blanketwrap);
   
   //***** calculateRate
   /**
    * Determine the estimated charges for the quote.
    */
   public void calculateRate();
   
   //***** contactCompanyName
   public String getContactCompanyName();
   public void setContactCompanyName(String companyName);
   
   //***** contactEmail
   public String getContactEmail();
   public void setContactEmail(String contactEmail);

   //***** contactName
   public String getContactName();
   public void setContactName(String contactName);

   //***** contactPhone
   public String getContactPhone();
   public void setContactPhone(String contactPhone);
   
   //***** crating
   public boolean isCratingRequired();
   public void setCratingRequired(boolean crating);
   
   //***** creditCardExpirationMonth
   public int getCreditCardExpirationMonth();
   public void setCreditCardExpirationMonth(int expirationMonth);
   
   //***** creditCardExpirationYear
   public int getCreditCardExpirationYear();
   public void setCreditCardExpirationYear(int expirationYear);
   
   //***** creditCardName
   public String getCreditCardName();
   public void setCreditCardName(String cardName);  
   
   //***** creditCardNumber
   public String getCreditCardNumber();
   public void setCreditCardNumber(String number);
   
   //***** creditCardType
   public String getCreditCardType();
   public void setCreditCardType(String type);
   
   //***** creditCardVerification
   public String getCreditCardVerification();
   public void setCreditCardVerification(String ccv);
   
   //***** customerReferenceNote
   public String getCustomerReferenceNote();
   public void setCustomerReferenceNote(String note);
   
   //***** deductible
   public double getDeductible();
   public void setDeductible(double amount);
   
   //***** destinationCity
   public String getDestinationCity();
   public void setDestinationCity(String destinationCity);
   
   //***** destinationCompanyName
   public String getDestinationCompanyName();
   public void setDestinationCompanyName(String destinationCompanyName);
   
   //***** destinationContactName
   public String getDestinationContactEmail();
   public void setDestinationContactEmail(String destinationContactEmail);
   
   //***** destinationContactName
   public String getDestinationContactName();
   public void setDestinationContactName(String destinationContactName);
   
   //***** destinationContactPhone
   public String getDestinationContactPhone();
   public void setDestinationContactPhone(String destinationContactPhone);
   
   //***** destinationResidential
   public boolean isDestinationResidential();
   public void setDestinationResidential(boolean residential);
   
   //***** destinationState
   public String getDestinationState();
   public void setDestinationState(String destinationState);
   
   //***** destinationStreetAddress
   public String getDestinationStreetAddress();
   public void setDestinationStreetAddress(String destinationState);
   
   //***** destinationZip
   public String getDestinationZip();
   public void setDestinationZip(String destinationZip);
   
   //***** distance
   public double getDistance();
   public void setDistance(double distance);
   
   //***** fuel surcharge
   public double getFuelSurcharge();
   public void setFuelSurcharge(double fuelSurcharge);
   
   //***** insuranceCost
   public double getInsuranceCharges();
   public void setInsuranceCharges(double insuranceCharge);
   
   //***** lineItems 
   public List<WorkOrderLineItem> getLineItems();
   public WorkOrderLineItem addLineItem(WorkOrderLineItem item);
   public WorkOrderLineItem createLineItem();
   public WorkOrderLineItem removeLineItem(WorkOrderLineItem item);
   public WorkOrderLineItem getLineItem(int i);
   
   //***** lineItemCharges
   public double getLineItemCharges();
   public void setLineItemCharges(double charges);
   
   //***** notes
   public String getNotes();
   public void setNotes(String notes);
   
   //***** numberOfFlights
   public int getNumberOfFlights();
   public void setNumberOfFlights(int numberOfFlights);
   
   //***** originCity
   public String getOriginCity();
   public void setOriginCity(String originCity);
   
   //***** originCompanyName
   public String getOriginCompanyName();
   public void setOriginCompanyName(String originCompanyName);
   
   //***** originContactEmail
   public String getOriginContactEmail();
   public void setOriginContactEmail(String originContactEmail);
   
   //***** originContactName
   public String getOriginContactName();
   public void setOriginContactName(String originContactName);
   
   //***** originContactPhone
   public String getOriginContactPhone();
   public void setOriginContactPhone(String originContactPhone);
   
   //***** originResidential
   public boolean isOriginResidential();
   public void setOriginResidential(boolean residential);
   
   //***** originState
   public String getOriginState();
   public void setOriginState(String originStreetAddress);
   
   //***** originStreetAddress
   public String getOriginStreetAddress();
   public void setOriginStreetAddress(String originState);
   
   //***** originZip
   public String getOriginZip();
   public void setOriginZip(String originZip);
   
   //***** packaging
   public boolean isPackagingRequired();
   public void setPackagingRequired(boolean packaging);
   
   //***** paymentMethod
   public String getPaymentMethod();
   public void setPaymentMethod(String paymentMethod);
   
   //***** priceModel
   /**
    * Return the <code>PriceModel</code> assigned to this quote.
    * 
    * @return The <code>PriceModel</code> that has been specifically assigned for
    * use with this quote.
    */
   public PriceModel getPriceModel();
   /**
    * Assign a <code>PriceModel</code> to for determining the cost of the quote.
    * @param model An instance of a <code>PriceModel</code>.
    * @see com.wildstartech.wfa.logistics.ltl.pricemodels.PriceModel
    */
   public void setPriceModel(PriceModel model);
   
   //***** purchaseOrderNumber
   public String getPurchaseOrderNumber();
   public void setPurchaseOrderNumber(String poNumber);
   
   //***** quoteRequestId
   public String getQuoteRequestId();
   public void setQuoteRequestId(String requestId);
   
   //***** referralSource
   public String getReferralSource();
   public void setReferralSource(String source);
   
   //***** referralOther
   public String getReferralOther();
   public void setReferralOther(String other);
   
   //***** stairCarry
   public boolean isStairCarry();
   public void setStairCarry(boolean value);
   
   //***** serviceLevel
   public String getServiceLevel();
   public void setServiceLevel(String serviceLevel);

   //***** totalCubes
   public int getTotalCubes();
   
   //***** totalWeight
   public int getTotalWeight();
   
   //***** unpacking
   public boolean isUnpackagingRequired();
   public void setUnpackagingRequired(boolean unpackaging);
   //***** valuation
   public double getValuation();
   public void setValuation(double amount);
   
   //***** valuationDeclined
   public boolean isValuationDeclined();
   public void setValuationDeclined(boolean value);  
}