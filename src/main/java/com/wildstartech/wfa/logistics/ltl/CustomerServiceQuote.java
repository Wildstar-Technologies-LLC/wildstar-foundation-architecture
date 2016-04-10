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
package com.wildstartech.wfa.logistics.ltl;

import java.util.Date;
import java.util.List;

public interface CustomerServiceQuote {
	//***** deliveryAddressType
	public String getDeliveryAddressType();
	public void setDeliveryAddressType(String deliveryAddressType);

	//***** deliveryAddress1
	public String getDeliveryAddress1();
	public void setDeliveryAddress1(String deliveryAddress1);

	//***** deliveryAddress2
	public String getDeliveryAddress2();
	public void setDeliveryAddress2(String deliveryAddress2);

	//***** deliveryBusinessName
	public String getDeliveryBusinessName();
	public void setDeliveryBusinessName(String deliveryBusinessName);

	//***** deliveryCity
	public String getDeliveryCity();
	public void setDeliveryCity(String deliveryCity);

	//***** deliveryContactName
	public String getDeliveryContactName();
	public void setDeliveryContactName(String deliveryContactName);

	//***** deliveryPhoneNumber
	public String getDeliveryPhoneNumber();
	public void setDeliveryPhoneNumber(String phoneNumber);
	
	//***** deliveryPhoneType
	public String getDeliveryPhoneType();
	public void setDeliveryPhoneType(String deliveryPhoneType);

	//***** deliveryState
	public String getDeliveryState();
	public void setDeliveryState(String deliveryState);

	//***** deliveryType
	public String getDeliveryType();
	public void setDeliveryType(String deliveryType);

	//***** deliveryZip
	public String getDeliveryZip();
	public void setDeliveryZip(String deliveryZip);

	//***** expectedDeliveryDate
	public Date getExpectedDeliveryDate();
	public void setExpectedDeliveryDate(Date expectedDeliverydate);

	//***** hoist
	public boolean isHoist();
	public void setHoist(boolean hoist);

	//***** insuranceValue
	public double getInsuranceValue();
	public void setInsuranceValue(double insuranceValue);

	//***** install
	public String getInstall();
	public void setInstall(String install);

	//***** moveItemsToOtherRooms
	public String getMoveItemsToOtherRoom();
	public void setMoveItemsToOtherRoom(String moveItemsToOtherRoom);

	//***** numberFlightsOfStairs
	public int getNumberOfFlightsOfStairs();
	public void setNumberOfFlightsOfStairs(int numberOfFlightsOfStairs);

	//***** numberHoursAssembly
	public double getNumberOfHoursOfAssembly();
	public void setNumberOfHoursOfAssembly(double assemblyHours);

	//***** quoteDate
	public Date getQuoteDate();
	public void setQuoteDate(Date quoteDate);

	//***** pickupBusinessName
	public String getPickupBusinessName();
	public void setPickupBusinessName(String pickupBusinessName);

	//***** pickupCallerName
	public String getPickupCallerName();
	public void setPickupCallerName(String pickupCallerName);

	//***** pickupContactName
	public String getPickupContactName();
	public void setPickupContactName(String pickupContactName);

	//***** pickupPhone1Number
	public String getPickupPhone1Number();
	public void setPickupPhone1Number(String pickupPhone1Number);

	//***** pickupPhone1Type
	public String getPickupPhone1Type();
	public void setPickupPhone1Type(String pickupPhone1Type);

	//***** pickupPhone2Number
	public String getPickupPhone2Number();
	public void setPickupPhone2Number(String pickupPhone2Number);

	//***** pickupPhone2Type
	public String getPickupPhone2Type();
	public void setPickupPhone2Type(String pickupPhone2Type);

	//***** pickupAddress1
	public String getPickupAddress1();
	public void setPickupAddress1(String pickupAddress1);

	//***** pickupAddress2
	public String getPickupAddress2();
	public void setPickupAddress2(String pickupAddress2);

	//***** pickupCity
	public String getPickupCity();
	public void setPickupCity(String pickupCity);

	//***** pickupState
	public String getPickupState();
	public List<String> getPickupStates();
	public void setPickupState(String pickupState);

	//***** pickupAddressType
	public String getPickupAddressType();
	public void setPickupAddressType(String pickupAddressType);

	//***** pickupZip
	public String getPickupZip();
	public void setPickupZip(String pickupZip);
}