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

import com.wildstartech.wfa.ticketing.BasicTicket;

public interface FreightDueInWorkOrder extends BasicTicket {

   //***** carrierName
   public String getCarrierName();
   public void setCarrierName(String carrierName);

   //***** carrierTrackingNumber
   public String getCarrierTrackingNumber();
   public void setCarrierTrackingNumber(String carrierTrackingNumber);
   
   //***** contactCompanyName
   public String getContactCompanyName();
   public void setContactCompanyName(String contactCompanyName);

   //***** contactEmail
   public String getContactEmail();
   public void setContactEmail(String contactEmail);

   //***** contactName
   public String getContactName();
   public void setContactName(String contactName);

   //***** contactPreferredTelephoneNumber
   public String getContactPreferredTelephoneNumber();
   public void setContactPreferredTelephoneNumber(
         String contactPreferredTelephoneNumber);

   //***** dateReceived
   public Date getDateReceived();
   public void setDateReceived(Date dateReceived);
   
   //***** dateShipped  
   public Date getDateShipped();
   public void setDateShipped(Date dateShipped);

   //***** depot
   public String getDepot();
   public void setDepot(String depot);
   
   //***** estimatedArrivalDate
   public Date getEstimatedArrivalDate();
   public void setEstimatedArrivalDate(Date estimatedArrivalDate);

   //***** estimatedShipDate
   public Date getEstimatedShipDate();
   public void setEstimatedShipDate(Date estimatedShipDate);

   //***** lineItems
   /**
    * Appends the specified line item to the end of this list.
    * @param item
    * @return <code>true</code> if the item was successfully added to the list
    * or <code>false</code> it it was not added.
    */
   public boolean addLineItem(FreightDueInWorkOrderLineItem item);
   
   /**
    * Inserts the specified line item at the specified position in this list.
    * <p>Any item that presently exists at the specified position will be moved 
    * to the right.  For example, if you have a work order that already has 
    * four associated line items and you invoke the method in the following way:
    * </p>
    * <pre>
    * workOrder.addLineItem(newItem,4);
    * </pre>
    * <p>The line item that was in position four (4) will now be in position 
    * five (5) and the <code>newItem</code> will now be in position four.</p> 
    * <table>
    *   <tr>
    *     <td><strong>NOTE:</strong></td>
    *     <td>
    *       The first element in the list has a position number of one (1). 
    *       I.e., the list of line items is not zero-based.
    *     </td>
    *   </tr>
    * </table>
    * @param lineItemNumber The position to insert the workOrderLineItem 
    * @param item The actual <code>FreightDueInWorkOrderLineItem to be added at
    * the specified position.
    */
   public void addLineItem(int lineItemNumber,
         FreightDueInWorkOrderLineItem item);
   
   /**
    * Create a line item. 
    */
   public FreightDueInWorkOrderLineItem createLineItem();
   
   /**
    * Returns the line item identified by the specified line item number.
    * @param lineItemNumber The number of the row containing the line item the
    * caller would like returned.
    * @return The <code>FreightDueInWorkOrderLineItem</code> that exists with 
    * the specified value for it's <code>lineItemNumber</code> property. 
    * @throws IndexOutOfBoundsException
    */
   public FreightDueInWorkOrderLineItem getLineItem(int lineItemNumber);
   /**
    * Returns an immutable list of line items associated with the work order.
    * <p>The list of <code>FreightDueInWorkOrderLineItem</code> objects that is
    * returned by this method cannot be modified.  I.e., you cannot add or 
    * remove items from the list.  To add items to or remove items from the 
    * list, you have to use the <code>addLineItem</code> and 
    * <code>removeLineItem</code> methods.</p>
    * <p>However, the elements IN the list can be modified.</p>
    * @return A list of line items associated with the work order that cannot be
    * modified.
    */
   public List<FreightDueInWorkOrderLineItem> getLineItems();
   
   /**
    * Removes the line item identified by the specified line item number.
    * <table>
    *   <tr>
    *     <td><strong>NOTE:</strong></td>
    *     <td>
    *       The first element in the list has a position number of one (1). 
    *       I.e., the list of line items is not zero-based.
    *     </td>
    *   </tr>
    * </table>
    * @param item
    * @return <code>true</code> if the item was successfully removed or 
    * <code>false</code> if the specified item was not removed from the list.
    */
   public boolean removeLineItem(FreightDueInWorkOrderLineItem item);
   
   /**
    * Replace the identified line item with the specified object.
    * @param lineItemNumber - the line item which should be replaced with the
    * specified <code>FreightDueInWorkOrderLineItem</code> object.
    * @param item - the <code>FreightDueInWorkOrderLineItem</code> object
    * that should replace the current object
    * @return The work order line item object that was previously at the 
    * specified position.
    */
   public FreightDueInWorkOrderLineItem setLineItem(int lineItemNumber, 
         FreightDueInWorkOrderLineItem item);
   
   //***** manufacturerName
   public String getManufacturerName();
   public void setManufacturerName(String manufacturerName);
   
   //***** purchaseOrder
   public String getPurchaseOrder();
   public void setPurchaseOrder(String purchaseOrder);
   
   //***** quoteRequestId
   public String getQuoteRequestId();
   public void setQuoteRequestId(String requestId);
   
   //***** referenceIdentifier
   public String getReferenceIdentifier();
   public void setReferenceIdentifier(String referenceIdentifier);

   //***** specialHandling
   public String getSpecialHandling();
   public void setSpecialHandling(String specialHandling);
   
   //***** workOrderId
   /**
    * A unique identifier for the work order.
    * 
    * <p>As the <code>FreightDueInWorkOrder</code> is an extension of the 
    * <code>BasicTicket</code> interface, the <code>workOrderId</code> property
    * IS an alias for the <code>requestId</code> property.  Any concrete 
    * implementation of this interface <strong>MUST</strong> ensure that 
    * invocation of the <code>getWorkOrderId()</code> method returns the 
    * <strong>EXACT</strong> same value as the invocation of the 
    * <code>getRequestId</code> method of the <code>BasicTicket</code> super 
    * class.</p>
    * 
    * @return The unique identifier for this work order.
    */
   public String getWorkOrderId();
   /**
    * Sets the unique identifier for the work order.
    * <p>As the <code>FreightDueInWorkOrder</code> is an extension of the 
    * <code>BasicTicket</code> interface, the <code>workOrderId</code> property
    * IS an alias for the <code>requestId</code> property.  Any concrete 
    * implementation of this interface <strong>MUST</strong> ensure that 
    * invocation of the <code>setWorkOrderId(String)</code> method updates the
    * <strong>EXACT</strong> same field as the invocation of the 
    * <code>setRequestId(String)</code> method of the 
    * <code>BasicTicket</code> super class.</p>
    * 
    * @param workOrderId the value to be used as the unique identifier of the
    * work order.
    */
   public void setWorkOrderId(String workOrderId);
}