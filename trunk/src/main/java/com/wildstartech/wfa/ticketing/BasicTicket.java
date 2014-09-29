/*
 * Copyright (c) 2001, 2006, 2008-2014 Wildstar Technologies, LLC.
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

import java.util.Date;

public interface BasicTicket {
	/**
	 * Returns the unique identifier for the ticket.
	 * @return String value used to uniquely identify the ticket.
	 */
	public String getId();
	
	/**
	 * Returns the ticket's title or a brief, one-line description.
	 */
	public String getTitle();
	/**
	 * Sets a brief one-line description of the ticket.
	 * @param title The value to be used as the one-line description of the
	 * ticket.
	 */
	public void setTitle(String title);
	/**
	 * A name of the individual who initially created the ticket.
	 * @return A <code>String</code> value that indicates the name of the 
	 * individual who initially created the ticket.
	 */
	public String getCreatedBy();
	/**
	 * The date the ticket was initially created.
	 * @return A <code>Date</code> object that indicates when the ticket was
	 * originally created.
	 */
	public Date getDateCreated();
	/**
	 * The date the ticket was last modified.
	 * @return A <code>Date</code> object that indicates when the ticket was 
	 * last modified by the person identified by the <code>ModifiedBy</code>
	 * field.
	 */
	public Date getDateModified();
	/**
	 * The name of the person who last modified the ticket.
	 * @return A <code>String</code> value that indicates the name of the 
	 * individual who last changed the ticket.
	 */
	public String getModifiedBy();
}
