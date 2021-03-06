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

/**
 * For the time being, this is a marker interface.
 * 
 * @author Derek Berube, Wildstar Technologies, LLC.
 * @version 0.1, 2016-10-11
 */
public interface Query  {
   /**
    * Adds a filter that should be applied when performing the query.
    * 
    * @param filter The {@code Filter} object that should be added to the list
    * of {@code Filter} objects that are applied when executing the 
    * {@code Query}.
    * 
    * @return {@code true} is returned if the specified {@code Filter} was
    * added to the list of {@code Filter} objects associated with the
    * {@code Query}.  {@code false} is returned if the specified {@code Filter}
    * was NOT added.
    */
   public boolean addFilter(Filter filter);
   
   /**
    * Adds the specified list of filters to the query.
    * @param filters The list of {@code Filter} objects that should be 
    * applied when the query is executed.
    * @return The {@code Filter} objects that were added to the list
    * of {@code Filter} objects associated with the {@code Query}.
    */
   public List<Filter> addFilters(List<Filter> filters);
   
   /**
    * Removes all {@code} Filter objects associated with the query.   
    */
   public void clearFilters();
    
   /**
    * Returns the list of filters that have been associated with the query.
    * @return Either an empty {@code List} of {@code Filter} objects or
    * a {@code List} of {@code Filter} objects that are supposed to be
    * applied to the query.
    */
   public List<Filter> getFilters();
   
   /**
    * Removes the specified {@code Filter} object from the list of filters
    * associated with the Query.
    * 
    * @return {@code true} is returned if the specified {@code Filter} was
    * removed from the list of {@code Filter} objects associated with the
    * {@code Query}.  {@code false} is returned if the specified {@code Filter}
    * was NOT removed.
    */
   public boolean removeFilter(Filter filter);
   
   /**
    * Removes the specified {@code Filter} objects from the list of filters
    * associated with the query.
    * @return The list
    */
   public List<Filter> removeFilters(List<Filter> filters);
}