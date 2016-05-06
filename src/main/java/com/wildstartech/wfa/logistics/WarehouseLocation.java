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
package com.wildstartech.wfa.dao.logistics;

import com.wildstartech.wfa.location.Location;

/**
 * Identifies a given location in a warehouse.
 * 
 * <p>This data structure is intended to model the storage of items in a 
 * warehouse that is comprised of aisles of multi-level racks.  Each rack is
 * divided into smaller sections into which goods are placed. The following
 * is a hierchal list of location attributes going from most general to most
 * specific.</p>
 * <ul>
 * <li>Aisle</li>
 * <li>Level</li>
 * <li>Bay</li>
 * <li>Position</li>
 * </ul>
 * 
 * @author Derek Berube, Wildstar Technologies, LLC.
 * @version 0.1, 2016-04-29
 *
 */
public interface WarehouseLocation extends Location {
   public String getAisle();
   public void setAisle(String aisle);
   
   public String getBay();
   public void setBay(String bay);
   
   public String getLevel();
   public void setLevel(String level);
   
   public String getPosition();
   public void setPosition(String position);
}
