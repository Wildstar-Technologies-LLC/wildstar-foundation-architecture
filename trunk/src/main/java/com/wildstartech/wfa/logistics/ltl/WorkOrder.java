/*
 * Copyright (c) 2001 - 2014 Wildstar Technologies, LLC.
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

import com.wildstartech.wfa.address.us.State;
import com.wildstartech.wfa.company.Company;
import com.wildstartech.wfa.customer.Party;
import com.wildstartech.wfa.document.Document;
import com.wildstartech.wfa.group.GroupNameTooLongException;
import com.wildstartech.wfa.journal.Journalizable;
import com.wildstartech.wfa.person.Person;
import com.wildstartech.wfa.user.UserNameTooLongException;

public interface WorkOrder extends Journalizable {
    public static final int CONSIGNEE_TYPE_UNKNOWN = -1;
    public static final int CONSIGNEE_TYPE_COMPANY = 1;
    public static final int CONSIGNEE_TYPE_PERSON = 2;
    public static final int STATUS_NEW = 0;
    public static final int STATUS_ARRIVED = 1;
    public static final int STATUS_PENDING = 2;
    public static final int STATUS_SCHEDULED = 3;
    public static final int STATUS_DELIVERED = 4;
    public static final int STATUS_COMPLETE = 5;
    public static final int STATUS_CANCELLED = 5;
    public static final int TYPE_PICKUP = 0;
    public static final int TYPE_DELIVERY = 1;
    //********** accessorialCharges
    /**
     * Returns a list of accessorial charges associated with the work order.
     * @return List<AccessorialCharge> The list of accessorial charges
     * presently associated with the work order.
     */
    public List<AccessorialCharge> getAccessorialCharges();

    /**
     * Creates a new instance of an <code>AccessorialCharge</code>.
     * @return AccessorialCharge
     */
    public AccessorialCharge createAccessorialCharge();

    /**
     * Removes the specified accessorial charge from the work order.
     * 
     * If the accessorial charge passed as a parameter is not associated with
     * the work order, then <code>null</code> will be returned from the 
     * method call. 
     * 
     * @param AccessorialCharge The accessorial charge to be removed.
     * @return AccessorialCharge The accessorial charge that was removed.
     */
    public AccessorialCharge removeAccessorialCharge(AccessorialCharge charge);
    //********** agent
    public Party getAgent();

    public void setAgent(Party party);

    public void setAgent(Company company);

    public void setAgent(Person person);
    //********** appointmentTime
    public Date getAppointmentTime();

    public void setAppointmentTime(Date date);
    //********** arrivalTime
    public Date getArrivalTime();

    public void setArrivalTime(Date date);
    //********** assignedToGroup
    public String getAssignedToGroup();

    public void setAssignedToGroup(String group)
            throws GroupNameTooLongException;
    //********** assignedToIndividual
    public String getAssignedToIndividual();

    public void setAssignedToIndividual(String group)
            throws UserNameTooLongException;
    //********** billOfLading
    public Document getBillOfLading();

    public void setBillOfLading(Document document);
    //********** billingContactName
    public String getBillingContactName();

    public void setBillingContactName(String name);
    //********** billingAddress
    public String getBillingAddress();

    public void setBillingAddress(String address);
    //********** billingAddressSecondary
    public String getBillingAddressSecondary();

    public void setBillingAddressSecondary(String address);
    //********** billingCity
    public String getBillingCity();

    public void setBillingCity(String city);
    //********** billingState
    public State getBillingState();

    public void setBillingState(State state);
    //********** billingZip
    public String getBillingZip();

    public void setBillingZip(String zip);
    //********** billingTerms
    public String getBillingTerms();

    public void setBillingTerms(String billingTerms);
    //**********
    public String getBillingPhone();

    public void setBillingPhone(String phone);
    //********** billingDate
    public Date getBillingDate();

    public void setBillingDate(Date billingDate);
    //********** billingReferenceId
    public String getBillingReferenceId();

    public void setBillingReferenceId(String billingReferenceId)
            throws BillingReferenceIdTooLongException;
    //********** completeTime
    public Date getCompleteTime();

    public void setCompleteTime(Date date);
    //********** consignee
    public Party getConsignee();

    public void setConsignee(Party party);

    public void setConsignee(Company company);

    public void setConsignee(Person person);
    //********** consigneeAddress
    public String getConsigneeAddress();

    public void setConsigneeAddress(String addr);
    //********** consigneeCity
    public String getConsigneeCity();

    public void setConsigneeCity(String city);
    //********** consigneeContact
    public String getConsigneeContact();

    public void setConsigneeContact(String name);
    //********** consigneeFax
    public String getConsigneeFax();

    public void setConsigneeFax(String phone);
    //********** consigneePhone
    public String getConsigneePhone();

    public void setConsigneePhone(String phone);
    //********** consigneeSecondaryAddress
    public String getConsigneeAddressSecondary();

    public void setConsigneeAddressSecondary(String addr);
    //********** consigneeState
    public State getConsigneeState();

    public void setConsigneeState(State state);
    //********** consigneeZip
    public String getConsigneeZip();

    public void setConsigneeZip(String zip);
    //********** customer
    public Party getCustomer();

    public void setCustomer(Party customer);

    public void setCustomer(Company company);

    public void setCustomer(Person person);
    //********** customerOrderId
    public String getCustomerOrderId();

    public void setCustomerOrderId(String orderId)
            throws CustomerOrderIdTooLongException;
    //********** lineItems
    /**
     * Add the specified WorkOrderLineItem to the end of the list.
     * @param WorkOrderLineItem
     */
    public void addLineItem(WorkOrderLineItem lineItem);

    /**
     * Add the line item at the specified index.
     * @param pos
     * @param lineItem
     */
    public void addLineItem(int pos, WorkOrderLineItem lineItem);

    /**
     * Creates a new instance of the WorkOrderLineItem class.
     */
    public WorkOrderLineItem createLineItem();

    /**
     * Remove the specified line item.
     * @return WorkOrderLineItem
     */
    public void remove(WorkOrderLineItem lineItem);

    /**
     * Returns a list of <code>WorkOrderLineItem</code> objects.
     * @return java.util.List<WorkOrderLineItem>
     */
    public List<WorkOrderLineItem> getLineItems();
    //***** locatorID
    /**
     * Return a pseudo-unique identifer for the work order.
     */
    public String getLocatorId();

    /**
     * Set the value to be used as the identifer for the work order.
     */
    public void setLocatorId(String locatorId);
    //********** pickupAddress
    public String getPickupAddress();

    public void setPickupAddress(String address);
    //********** pickupAddressSecondary
    public String getPickupAddressSecondary();

    public void setPickupAddressSecondary(String address);
    //********** pickupCity
    public String getPickupCity();

    public void setPickupCity(String city);
    //********** pickupPhone
    public String getPickupPhone();

    public void setPickupPhone(String phone);
    //********** pickupState
    public State getPickupState();

    public void setPickupState(State state);
    //********** pickupZip
    public String getPickupZip();

    public void setPickupZip(String zip);
    //********** proofOfDelivery
    public Document getProofOfDelivery();

    public void setProofOfDelivery(Document doc);
    //********** shippingMethod
    public String getShippingMethod();

    public void setShippingMethod(String val);
    //********** status
    public int getStatus();

    public void setStatus(int status);
    //********** startTime
    public Date getStartTime();

    public void setStartTime(Date date);
    //********** type
    public int getType();

    public void setType(int workOrderType);
    //***** workOrderID
    /**
     * Return the unique identifier  
     */
    public String getWorkOrderId();

    /**
     * Set the unique identifier for the work order.
     */
    public void setWorkOrderId(String workOrderId)
            throws WorkOrderIdTooLongException;
}
