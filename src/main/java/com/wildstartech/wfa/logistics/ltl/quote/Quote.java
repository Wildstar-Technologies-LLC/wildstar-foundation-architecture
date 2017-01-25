/*
 * Copyright (c) 2001 - 2016 Wildstar Technologies, LLC.
 *
 * This file is part of Wildstar Foundation Architecture.
 *
 * Wildstar Foundation Architecture is free software: you can redistribute it
 * and/or modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * Wildstar Foundation Architecture is distributed in the hope that it will be
 * useful, but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * Wildstar Foundation Architecture.  If not, see 
 * <http://www.gnu.org/licenses/>.
 * 
 * Linking this library statically or dynamically with other modules is making a
 * combined work based on this library. Thus, the terms and conditions of the 
 * GNU General Public License cover the whole combination.
 * 
 * As a special exception, the copyright holders of this library give you 
 * permission to link this library with independent modules to produce an 
 * executable, regardless of the license terms of these independent modules, 
 * and to copy and distribute the resulting executable under terms of your 
 * choice, provided that you also meet, for each linked independent module, the
 * terms and conditions of the license of that module. An independent module is
 * a module which is not derived from or based on this library. If you modify 
 * this library, you may extend this exception to your version of the library, 
 * but you are not obliged to do so. If you do not wish to do so, delete this 
 * exception statement from your version.
 * 
 * If you need additional information or have any questions, please contact:
 *
 *      Wildstar Technologies, LLC.
 *      63 The Greenway Loop
 *      Panama City Beach, FL 32413
 *      USA
 *
 *      derek.berube@wildstartech.com
 *      www.wildstartech.com
 */
package com.wildstartech.wfa.logistics.ltl.quote;

import java.util.List;

import com.wildstartech.wfa.logistics.ltl.AccessorialCharge;

public interface Quote extends SimpleQuote {

	// ***** accessorialCharges
	public double getAccessorialTotal();
	public List<AccessorialCharge> getAccessorialCharges();
	public AccessorialCharge addAccessorialCharge(AccessorialCharge charge);
	public AccessorialCharge getAccessorialCharge(int i);
	public boolean removeAccessorialCharge(AccessorialCharge charge);

	// ***** billingCity
	public String getBillingCity();
	public void setBillingCity(String billingCity);

	// ***** billingCompanyName
	public String getBillingCompanyName();
	public void setBillingCompanyName(String companyName);

	// ***** billingContactEmail
	public String getBillingContactEmail();
	public void setBillingContactEmail(String contactEmail);

	// ***** billingContactName
	public String getBillingContactName();
	public void setBillingContactName(String contactName);

	// ***** billingContactPhone
	public String getBillingContactPhone();
	public void setBillingContactPhone(String contactPhone);

	// ***** billingMethod
	public String getBillingMethod();
	public void setBillingMethod(String method);

	// ***** billingState
	public String getBillingState();
	public void setBillingState(String state);

	// ***** billingStreetAddress
	public String getBillingStreetAddress();
	public void setBillingStreetAddress(String address);

	// ***** billingZip
	public String getBillingZip();
	public void setBillingZip(String zipCode);

	// ***** creditCardExpirationMonth
	public int getCreditCardExpirationMonth();
	public void setCreditCardExpirationMonth(int expirationMonth);

	// ***** creditCardExpirationYear
	public int getCreditCardExpirationYear();
	public void setCreditCardExpirationYear(int expirationYear);

	// ***** creditCardName
	public String getCreditCardName();
	public void setCreditCardName(String cardName);

	// ***** creditCardNumber
	public String getCreditCardNumber();
	public void setCreditCardNumber(String number);

	// ***** creditCardType
	public String getCreditCardType();
	public void setCreditCardType(String type);

	// ***** creditCardVerification
	public String getCreditCardVerification();
	public void setCreditCardVerification(String ccv);

	// ***** paymentMethod
	public String getPaymentMethod();
	public void setPaymentMethod(String paymentMethod);

	// ***** lineItems
	public List<QuoteLineItem> getLineItems();
	public QuoteLineItem addLineItem(QuoteLineItem item);
	public QuoteLineItem createLineItem();
	public boolean removeLineItem(QuoteLineItem item);
	public QuoteLineItem getLineItem(int i);

	// ***** lineItemCharges
	public double getLineItemCharges();
	public void setLineItemCharges(double charges);

	// ***** workOrderRequestId
	public String getWorkOrderRequestId();
	public void setWorkOrderRequestId(String workOrderRequestId);
}