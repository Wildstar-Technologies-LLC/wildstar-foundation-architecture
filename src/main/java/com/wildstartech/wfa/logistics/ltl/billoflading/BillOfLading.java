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
package com.wildstartech.wfa.logistics.ltl.billoflading;

import java.util.Date;
import java.util.List;

public interface BillOfLading {

  //********** isCollect
  public boolean isCollect();

  public void setCollect(boolean isCollect);

  //********** date
  public Date getDate();

  public void setDate(Date date);

  //********** blNumber
  public String getBlNumber();

  public void setBlNumber(String blNumber);

  //********** carrier
  public String getCarrier();

  public void setCarrier(String carrier);

  //********** consigneeCompany
  public String getConsigneeCompany();

  public void setConsigneeCompany(String consigneeCompany);

  //********** consigneeEmail
  public String getConsigneeEmail();

  public void setConsigneeEmail(String consigneeEmail);

  //********** consigneeName
  public String getConsigneeName();

  public void setConsigneeName(String consigneeName);

  //********** consigneePhone
  public String getConsigneePhone();

  public void setConsigneePhone(String consigneePhone);

  //********** destinationCity
  public String getDestinationCity();

  public void setDestinationCity(String destinationCity);

  //********** destinationState
  public String getDestinationState();

  public void setDestinationState(String destinationState);

  //********** getDestinationZip
  public String getDestinationZip();

  public void setDestinationZip(String destinationZip);

  //********** freightCountedBy
  public String getFreightCountedBy();

  public void setFreightCountedBy(String freightCountedBy);

  //********** invoiceeName
  public String getInvoiceeName();

  public void setInvoiceeName(String invoiceeName);

  //********** invoiceeCompany
  public String getInvoiceeCompany();

  public void setInvoiceeCompany(String invoiceeCompany);

  //********** invoiceeAddress
  public String getInvoiceeAddress();

  public void setInvoiceeAddress(String invoiceeAddress);

  //********** invoiceeCity
  public String getInvoiceeCity();

  public void setInvoiceeCity(String invoiceeCity);

  //********** invoiceeState
  public String getInvoiceeState();

  public void setInvoiceeState(String invoiceeState);

  //********** invoiceeZip
  public String getInvoiceeZip();

  public void setInvoiceeZip(String invoiceeZip);

  //********** originCity
  public String getOriginCity();

  public void setOriginCity(String originCity);

  //********* originState
  public String getOriginState();

  public void setOriginState(String originState);

  //********** originZip
  public String getOriginZip();

  public void setOriginZip(String originZip);

  //********** purchaseOrderNumber
  public String getPurchaseOrderNumber();

  public void setPurchaseOrderNumber(String purchaseOrderNumber);

  //********** proNumber
  public String getProNumber();

  public void setProNumber(String proNumber);

  //********** shipperAddress
  public String getShipperAddress();

  public void setShipperAddress(String shipperAddress);

  //********** shipperCity
  public String getShipperCity();

  public void setShipperCity(String shipperCity);

  //********** shipperCompany
  public String getShipperCompany();

  public void setShipperCompany(String shipperCompany);

  //********** shipperName
  public String getShipperName();

  public void setShipperName(String shipperName);

  //********** shipperNumber
  public String getShipperNumber();

  public void setShipperNumber(String shipperNumber);

  //********** shipperState
  public String getShipperState();

  public void setShipperState(String shipperState);

  //********* shipperZip
  public String getShipperZip();

  public void setShipperZip(String shipperZip);

  //********** specialInsructions
  public String getSpecialInstructions();

  public void setSpecialInstructions(String specialInstructions);

  //********** trailerLoadedBy
  public String getTrailerLoadedBy();

  public void setTrailerLoadedBy(String trailerLoadedBy);

  //********** trailerNumber
  public String getTrailerNumber();

  public void setTrailerNumber(String trailerNumber);

  //********** getLineItems
  public List<BillOfLadingLineItem> getLineItems();

  public void setLineItems(List<BillOfLadingLineItem> lineItems);

}