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
package com.wildstartech.wfa.logistics.ltl.receiver;

import java.util.Date;
import java.util.List;

import com.wildstartech.wfa.journal.Journalizable;
import com.wildstartech.wfa.ticketing.BasicTicket;

public interface ReceiverWorkOrder extends BasicTicket, Journalizable {
   
   public void setInboundCarrier(String carrier);
   //***** billOfLading
   /**
    * Returns the bill of lading associated with the sales order. 
    * @return
    */
   public String getBillOfLadingNumber();
   /**
    * Stores the sales order.
    * @param billOfLading
    */
   public void setBillOfLadingNumber(String billOfLading);
   
   //***** dateReceived
   /**
    * Returns the {@code Date} the items were received.
    * @return
    */
   public Date getDateReceived();
   /**
    * Sets the {@code Date} the items were received.
    * 
    * @param dateReceived
    */
   public void setDateReceived(Date dateReceived);
   
   //***** depot
   /**
    * Returns the name of the depot into which the product was received.
    * @return The name of the depot into which the product was received.
    */
   public String getDepot();
   /**
    * Stores the name of the depot into which the product was received.
    * @param string The name of the depot into which the product was received.
    */
   public void setDepot(String string);
   
   //***** inboundCarrier
   /** 
    * Return the carrier on which the product arrives at the warehouse.
    * @return
    */
   public String getInboundCarrier();
   /**
    * Stores the carrier on which the product arrived at the warehouse.
    * @param carrier The name of the carrier responsible for conveying the 
    * product to the warehouse.
    */
   
   //***** lineItems
   public List<ReceiverWorkOrderLineItem> getLineItems();
   public ReceiverWorkOrderLineItem addLineItem(
         ReceiverWorkOrderLineItem lineItem);
   public ReceiverWorkOrderLineItem removeLineItem(ReceiverWorkOrderLineItem lineItem);
   
   //***** purchaseOrderNumber
   /**
    * Returns the purchase order assigned to the shipment.
    * @return The purchase order provided to the vendor by the purchaser of the
    * goods included in the shipment.
    */
   public String getPurchaseOrderNumber();
   /**
    * Sets the purchase order assigned to the shipment.
    */
   public void setPurchaseOrderNumber(String purchaseOrderNumber);
   
   //***** salesOrderNumber
   /**
    * Returns the sales order number assigned to the order.
    * @return
    */
   public String getSalesOrderNumber();
   /**
    * Stores the sales order number with the order.
    * @param salesOrderNumber
    */
   public void setSalesOrderNumber(String salesOrderNumber);   
}