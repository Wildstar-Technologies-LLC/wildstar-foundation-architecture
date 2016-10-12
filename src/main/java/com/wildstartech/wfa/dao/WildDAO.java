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
package com.wildstartech.wfa.dao;

import java.util.List;

import com.wildstartech.wfa.dao.user.UserContext;

/**
 * Wildstar Data Access Object DAO generic interface.
 * 
 * @author Derek Berube, Wildstar Technologies, LLC.
 *
 * @param <T>
 *          A non-persistent type of object whose persistence will be managed by
 *          an implementation of the <code>WildDAO</code> interface.
 * @param <W>
 *          The persistent version of the type object <code>&lt;T&gt;</code>
 *          defined for use with the subclass of this data access object
 *          interface.
 */
public interface WildDAO<T, W extends WildObject> {
   /**
    * The base name of the {@code ResouceBundle} which contains message
    * templates that are to be formatted. 
    */
   public String RESOURCE_BUNDLE=
         "com.wildstartech.wfa.dao.WildDAOResources";
   public final String MSGKEY_NOT_FOUND="NOT_FOUND";
  /**
   * Property entry for the password of the administrative user's password.
   */
  public final String PROPKEY_ADMIN_PASSWORD = 
      "com.wildstartech.wfa.dao.adminPassword";
  /**
   * Property entry to identify the administrative user.
   */
  public final String PROPKEY_ADMIN_USER = 
      "com.wildstartech.wfa.dao.adminUser";
  /**
   * Property entry to identify the default page size for retrieving objects.
   */
  public final String PROPKEY_PAGE_SIZE=
      "com.wildstartech.wfa.dao.pageSize";
  /**
   * Property entry to identify the default sort criteria to be used when 
   * retrieving objects.
   */
  public final String PROPKEY_SORT_CRITERIA=
      "com.wildstartech.wfa.dao.sortCriteria";
  /**
   * The name of the WFA DAO Properties file.
   */
  public final String PROPKEY_CONFIG = 
      "com.wildstartech.wfa.dao.propfile";

  /**
   * Returns a new instance of a <code>WildObject</code>.
   * 
   * @return A new, default instance of the <code>WildObject</code> which has
   *         not yet been saved in the persistent data store.
   */
  public W create();

  /**
   * Creates a <code>WildObject</code> version of an object.
   * 
   * @param object
   * @return A version of the object in the persistent form that uses the object
   *         passed as a template.
   */
  public W create(T object, UserContext ctx);

  /**
   * Create an instance of the {@code Query} object to be used to filter
   * results when searching the persistent data store.
   */
  public Query createQuery();
  
  /**
   * Removes the specified <code>object</code> from the data store.
   */
  public W delete(T object, UserContext ctx) throws DAOException;

  /**
   * Removes an object with the specified identifier.
   */
  public W deleteByIdentifier(String identifier, UserContext ctx);

  /**
   * Saves the specified <code>object</code> to the persistent data store.
   */
  public W save(T object, UserContext ctx) throws DAOException;

  /**
   * Returns all instances of the <code>WildObject</code>
   * 
   * @return A <code>List</code> of all occurrences of the
   *         <code>WildObject</code> found in the persistent data store.
   */

  /**
   * Returns all instances of the class from the persistent data store.
   * 
   * @param ctx
   *          The <code>UserContext</code> which contains the authentication
   *          credentials that should be used to access the persistent data
   *          store.
   * 
   * @return
   * @throws DAOException
   */
  public List<W> findAll(UserContext ctx) throws DAOException;

  /**
   * Returns a specific instance of a <code>WildObject</code>.
   * 
   * @param identifier
   * @return The specific instance of the object.
   */
  public W findByIdentifier(String identifier, UserContext ctx)
      throws DAOException;

  /**
   * 
   * @param query
   *          The query that should be executed.
   * @param ctx
   *          The credentials that should be used to access the persistent data
   *          store.
   * @return A list of objects found in the persistent data store matching the
   *         criteria specified in the query.
   */
  public List<W> findByQuery(Query query, UserContext ctx);

  /**
   * Returns a specific instance of the object.
   * 
   * <p>
   * This method is intended to provide a single instance of an object in the
   * persistent data store which is represented by the instance passed as a
   * parameter. The primary purpose is to provide a means to ensure that the
   * persistence framework does not create <em>copies</em> of a given object
   * when trying to create/update the data store using an instance of an object
   * that has not yet been saved.
   * </p>
   * <p>
   * If multiple objects are found, then a null object should be returned to the
   * calling function.
   * </p>
   */
  public W findInstance(T object, UserContext ctx) throws DAOException;

  /**
   * Returns a localized message formatted with the values passed to the
   * method in the {@code Object} array passed as a parameter.
   * 
   * <p>Implementations of this message should try to resolve the message
   * with the specified {@code resourceId}.  If they cannot, then they 
   * should delegate to their super class.</p>
   * 
   * @param resourceId An identifier which is used to identify the 
   * appropriate message template in the {@code ResourceBundle}.
   * 
   * @param params An array of {@code Object} instances that should be 
   * substituted into variables in the specified message template.
   * @return
   */
  public String getLocalizedMessage(String resourceId, Object[] params);
  
  /**
   * Returns the {@code baseName} for the {@code ResourceBundle} that should
   * be used when localizing messages. 
   * @return A string value that will be used by the 
   * {@code getLocalizedMessage} method to return the requested localized
   * resource.
   */
  public String getResourceBundleBaseName();
  
  /**
   * Return the current number of the page used to retrieve data.
   */
  public int getPageNumber();
  /**
   * Sets the desired page of results to be returned by the query.
   * <p>
   * The page number is zero-based which means the first <code>pageSize</code>
   * objects are returned for <code>page</code> zero (0).
   * </p>
   * 
   * <p>
   * For example, if the <code>pageNumber</code> property is set equal to zero
   * (0) and the <code>pageSize</code> property is set equal to twenty five
   * (25), then objects 1 to 25 are returned.
   * </p>
   * 
   * @param page
   *          A zero-based index to the number of pages of objects that should
   *          be discarded before returning results.
   */
  public void setPageNumber(int pageNumber);

  /**
   * Return the current size of a "page" of objects returned by a query.
   */
  public int getPageSize();
  /**
   * Specify the number of objects to be returned in a single query.
   * 
   * @param pageSize
   *          The maximum number of objects to be returned when the query is run
   *          against the persistent data store.
   */

  public void setPageSize(int pageSize);

  /**
   * Return the sort criteria currently used when fetching data.
   */
  public List<SortCriterion> getSortCriteria();
  /**
   * Set the sort criteria that should be used when fetching data.
   * 
   * <p>
   * The elements in the <code>SortCriteria</code> <code>List</code> should be
   * specified in the order they should be used when performing ordering the
   * results of the search.
   * </p>
   * 
   * @param sortCriteria
   *          A list of <code>SortCriteria</code> objects that should be used
   *          when executing and returning the results of the query.
   */
  public void setSortCriteria(List<SortCriterion> sortCriteria);
}