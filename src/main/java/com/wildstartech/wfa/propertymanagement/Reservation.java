/*
 * Copyright (c) 2001 - 2017 Wildstar Technologies, LLC.
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
 *      Inlet Beach, FL 32461
 *      USA
 *
 *      derek.berube@wildstartech.com
 *      www.wildstartech.com
 */
package com.wildstartech.wfa.propertymanagement;

import java.util.Date;

import com.wildstartech.wfa.party.Party;

/**
 * Once a <code>BookingRequest</code> has been confirmed, it becomes a 
 * <code>Reservation</code>.
 * 
 * @author Derek Berube, Wildstar Technologies, LLC. 
 * @version 0.1
 * @since 1.0
 */
public interface Reservation {
   //***** agent
   public Party getAgent();
   public void setAgent(Party agent);
   
   //***** arrivalDate
   public Date getArrivalDate();
   public void setArrivalDate(Date arrivalDate);
   
   //***** contractConfirmed
   public boolean isContractConfirmed();
   public void setContractConfirmed(boolean confirmed);
   
   //***** contractReceived
   /**
    * Indicates whether or not the  confirmed has actually been received from 
    * the guest.
    * @return <code>true</code> if the guest has returned the contract to the 
    * property manager or <code>false</code> if the contract has not  yet been
    * received.
    */
   public boolean isContractReceived();
   public void setContractReceived(boolean received);
   
   //***** departureDate
   public Date getDepartureDate();
   public void setDepartureDate(Date departureDate);
   
   //***** marketingChannel
   /**
    * Returns the marketing method that was 
    * @return
    */
   public String getMarketingChannel();
   public void setMarketingChannel(String channel);
   
   //***** reservationHolder
   public Party getReservationHolder();
   public void setReservationHolder(Party party);
}
