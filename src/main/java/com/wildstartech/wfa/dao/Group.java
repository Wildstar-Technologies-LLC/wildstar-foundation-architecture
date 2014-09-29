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

public interface Group extends Comparable<Group>, WildObject {
	/**
	 * Indicates the maximum allowed length for a Company name.
	 */
	public int MAX_GROUP_NAME_LENGTH=255;
	/**
	 * Stores the name of the company.
	 * @param java.lang.String The value to be used as the name of the group.
	 * @throws GroupNameTooLongException
	 */
	public void setName(String name) throws GroupNameTooLongException;
	/**
	 * Returns the value currently designated as the name of the group.
	 */
	public String getName();
	/**
	 * Add a user to the group.
	 */
	public void addUser(User user);
	/**
	 * Return a list of users that currently belong to the group.
	 * @return java.util.List A collection of users that belong to the group.
	 */
	public List<User> getUsers();
	/**
	 * Indicates whether or not the specified user is a member of the group.
	 */
	public boolean contains(User user);
	/**
	 * Remove the specified user from the list of associated user.
	 */
	public void removeUser(User user);
}
