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
package com.wildstartech.wfa.dao.user;

import java.util.Date;
import java.util.List;

import com.wildstartech.wfa.dao.WildDAO;
import com.wildstartech.wfa.user.PasswordResetRequest;

/**
 * Used to return instances of the {@code PasswordResetRequest}
 * that have been written to the persistent data store.
 * @author Derek Berube, Wildstar Technologies, LLC.
 * @version 0.1, 2016-09-02
 *
 */
public interface PasswordResetRequestDAO 
extends WildDAO<PasswordResetRequest, PersistentPasswordResetRequest> {
   public static final String RESOURCE_BUNDLE=
         "com.wildstartech.wfa.dao.user.PasswordResetRequestDAOResources";
   /**
    * Returns a {@code List} of {@code PersistentPasswordResetRequest}
    * objects that are configured to expire within the window represented 
    * by the two parameters.
    * 
    * <p>If the value for the {@code startDate} parameter is after the
    * value specified for the {@code endDate} parameter, the implementing
    * class will swap the two parameter values BEFORE performing the search.
    * The <em>earlier</em> of the two parameters will ALWAYS be used as
    * the {@code startDate} parameter value.
    * 
    * @param startDate The date/time representing the beginning of the
    * time the caller is interested in.
    *  
    * @param endDate The date/time representing the end of the period of 
    * time the caller is interested in.
    * 
    * @return The date/time before which {@code PasswordResetRequest} 
    * objects are configured to expire.
    */
   public List<PersistentPasswordResetRequest> 
      findByExpirationDate(Date startDate, Date endDate, UserContext ctx);
   
   /**
    * Returns the persistent version of the {@code PasswordResetRequest}
    * that corresponds to the specified user name.
    * <table>
    * <tr>
    * <td><strong>NOTE:</strong></td>
    * <td>At all times, there should be only one {@code PasswordResetRequset}
    * for a given user in the persistent data store.</td>
    * </tr>
    * </table>
    * @param userName The value for the {@code userName} property which 
    * should be used when searching for {@code PersistentPasswordResetRequest}
    * objects.
    * 
    * @param ctx The {@code UserContext} object that should be used when
    * searching the persistent data store.
    *  
    * @return A single instance of a {@code PersistentPasswordResetRequest}
    * object that exists in the persistent data store.
    */
   public PersistentPasswordResetRequest findByUserName(
         String userName, UserContext ctx);
}