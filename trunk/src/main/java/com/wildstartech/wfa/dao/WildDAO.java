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
package com.wildstartech.wfa.dao;

import java.util.List;

public interface WildDAO<T, W extends WildObject> {
	/**
	 * The line in the wild-dao.properties configuration file that is used to
	 * identify the administrative user.
	 */
	public static final String PROPKEY_ADMIN_USER=
			"com.wildstartech.wfa.dao.adminUser";
	/**
	 * The line in the wild-dao.properties configuration file that is used to
	 * identify the password of the administrative user's password.
	 */
	public static final String PROPKEY_ADMIN_PASSWORD=
			"com.wildstartech.wfa.dao.adminPassword";
	/**
	 * The name of the WFA DAO Properties file.
	 */
	public static final String PROPKEY_CONFIG=
			"com.wildstartech.wfa.dao.propfile";
	/**
	 * Returns a new instance of a <code>WildObject</code>.
	 * @return A new, default instance of the <code>WildObject</code> which has
	 * not yet been saved in the persistent data store.
	 */
	public T create();
	/**
	 * Removes the specified <code>object</code> from the data store.
	 */
	public T delete(T object, UserContext ctx) 
			throws DAOException;
	/**
	 * Saves the specified <code>object</code> to the persistent data store.
	 */
	public T save(T object, UserContext ctx) 
			throws DAOException;
	/**
	 * Returns all instances of the <code>WildObject</code>
	 * @return A <code>List</code> of all occurrences of the 
	 * <code>WildObject</code> found in the persistent data store.
	 */
	public List<T> findAll(UserContext ctx) 
			throws DAOException;
	/**
	 * Returns a specific instance of a <code>WildObject</code>. 
	 * @param identifier
	 * @return The specific instance of the object.
	 */
	public T findByIdentifier(String identifier, UserContext ctx) 
			throws DAOException;
	/**
	 * Returns a specific instance of the object.
	 * 
	 * <p>This method is intended to provide a single instance of an object in
	 * the persistent data store which is represented by the instance passed
	 * as a parameter.  The primary purpose is to provide a means to ensure 
	 * that the persistence framework does not create <em>copies</em> of 
	 * a given object when trying to create/update the data store using an
	 * instance of an object that has not yet been saved.</p>
	 * <p>If multiple objects are found, then a null object should be returned
	 * to the calling function.</p> 
	 */
	public W findInstance(T object, UserContext ctx) 
			throws DAOException;
}