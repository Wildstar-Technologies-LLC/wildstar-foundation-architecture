package com.wildstartech.wfa.logistics.ltl.quote;

import com.wildstartech.wfa.journal.Journalizable;
import com.wildstartech.wfa.logistics.ltl.pricemodels.PriceModel;
import com.wildstartech.wfa.ticketing.BasicTicket;

public interface QuickQuote
extends BasicTicket, Journalizable {
	public enum AdjustmentType { FixedAmount, Percentage };
	public enum QuoteMethod {ByCube, ByWeight };
	
	//***** adjustmentAmount
	public double getAdjustmentAmount();
	public void setAdjustmentAmount(double amount);
	
	//***** adjustmentType
	public AdjustmentType getAdjustmentType();
	public void setAdjustmentType(AdjustmentType type);	

	//***** amount
	public double getAmount();
	public void setAmount(double amount);

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

	//***** customerReferenceNote
	public String getCustomerReferenceNote();
	public void setCustomerReferenceNote(String note);

	//***** deductible
	public double getDeductible();
	public void setDeductible(double amount);

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
	
	//***** orderType
	public String getOrderType();
	public void setOrderType(String orderType);

	//***** originZip
	public String getOriginZip();
	public void setOriginZip(String originZip);

	//***** priceModel
	/**
	 * Return the <code>PriceModel</code> assigned to this quote.
	 * @return The <code>PriceModel</code> that has been specifically assigned 
	 * for use with this quote.
	 */
	public PriceModel getPriceModel();
	
	/**
	 * Assign a <code>PriceModel</code> to for determining the cost of the quote.
	 * @param model An instance of a <code>PriceModel</code>.
	 * @see com.wildstartech.wfa.logistics.ltl.pricemodels.PriceModel
	 */
	public void setPriceModel(PriceModel model);	

	//***** quoteMethod
	/** 
	 * Returns the value of the {@code quoteMethod} property as a {@code String}.
	 * @return A {@code String} representation of the quote method.
	 */
	public String getQuoteMethodLabel();
	/**
	 * Returns the value of the {@code quoteMethod} property.
	 * 
	 * @return
	 */
	public QuoteMethod getQuoteMethod();
	/**
	 * Saves the {@code quoteMethod}
	 * @param method
	 */
	public void setQuoteMethod(QuoteMethod method);
	public void setQuoteMethod(String method);
	
	//***** serviceLevel
	public String getServiceLevel();
	public void setServiceLevel(String serviceLevel);

	//***** totalCubes
	public int getTotalCubes();
	public void setTotalCubes(int totalCubes);
	
	//***** totalWeight
	public int getTotalWeight();
	public void setTotalWeight(int weight);
	
	//***** valuation
	public double getValuation();
	public void setValuation(double amount);

	//***** valuationDeclined
	public boolean isValuationDeclined();
	public void setValuationDeclined(boolean value);
	
	
	//********** Utility Methods
	//***** calculateRate
	/**
	 * Determine the estimated charges for the quote.
	 */
	public void calculateRate();
}