package com.wildstartech.wfa.logistics.ltl;

import com.wildstartech.wfa.logistics.ltl.quote.QuickQuote;

public interface SimpleQuote extends QuickQuote {	
	//***** assemblyRequired
	public boolean isAssemblyRequired();
	public void setAssemblyRequired(boolean assembly);

	//***** blanketwrap
	public boolean isBlanketWrapRequired();
	public void setBlanketWrapRequired(boolean blanketwrap);
	
    //***** crating
	public boolean isCratingRequired();
	public void setCratingRequired(boolean crating);

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

	//***** packaging
	public boolean isPackagingRequired();
	public void setPackagingRequired(boolean packaging);

	//***** purchaseOrderNumber
	public String getPurchaseOrderNumber();
	public void setPurchaseOrderNumber(String poNumber);

	//***** referralSource
	public String getReferralSource();
	public void setReferralSource(String source);

	//***** referralOther
	public String getReferralOther();
	public void setReferralOther(String other);
		
	//***** stairCarry
	public boolean isStairCarry();
	public void setStairCarry(boolean value);

	//***** unpacking
	public boolean isUnpackagingRequired();
	public void setUnpackagingRequired(boolean unpackaging);
}