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
package com.wildstartech.wfa.ticketing;

import java.util.List;

public interface BasicTicket {
   /**
    * Returns the unique identifier for the ticket.
    * 
    * @return String value used to uniquely identify the ticket.
    */
   public String getRequestId();
   /**
    * Sets the unique identifier for the ticket.
    * <table>
    * <tr>
    * <td><strong>NOTE:</strong></td>
    * <td>
    * There is an implicit contract that the value for the 
    * <code>requestId</code> property is a unique identifier for a given ticket
    * in a given context.  Implementations of this method should ensure this 
    * contract is maintained.
    * </td>
    * </tr>
    * </table>
    * 
    */
   public void setRequestId(String requestId);
   
   // ***** shortDescription
   /**
    * Returns a brief, natural language narrative describing the ticket.
    */
   public String getShortDescription();

   /**
    * Sets a brief, natural language narrative describing the ticket.
    */
   public void setShortDescription(String shortDescription);

   // ***** statusReason
   /**
    * Returns a list of values available for the 'Status Reason' field.
    */
   public List<String> getAvailableStatusReasons();

   /**
    * Returns the current status reason assigned to the ticket.
    */
   public String getStatusReason();

   /**
    * Stores the current status reason assigned to the ticket.
    */
   public void setStatusReason(String statusReason);

   // ***** statusState
   /**
    * Returns a list of available status states.
    */
   public List<String> getAvailableStatusStates();

   /**
    * Returns the current status of the ticket.
    */
   public String getStatusState();

   /**
    * Stores the current point in the ticket's lifecycle.
    */
   public void setStatusState(String statusState);

   // ***** title
   /**
    * Returns the ticket's title or a brief, one-line description.
    */
   public String getTitle();

   /**
    * Sets a brief one-line description of the ticket.
    * 
    * @param title
    *           The value to be used as the one-line description of the ticket.
    */
   public void setTitle(String title);
}