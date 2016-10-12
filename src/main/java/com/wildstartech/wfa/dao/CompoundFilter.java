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

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class CompoundFilter implements Filter {  
   private static final String _CLASS=CompoundFilter.class.getName();
   private static final Logger logger=Logger.getLogger(_CLASS);
   
   public static enum FilterOperator {AND,OR};
   
   private FilterOperator filterOperator=null;
   private List<Filter> filters=null;
   
   /**
    * Default, no-argument constructor.
    */
   public CompoundFilter() {
      logger.entering(_CLASS, "CompoundFilter()");
      logger.exiting(_CLASS, "CompoundFilter()");
   }
   
   /**
    * The {@code FilterOperator} that should be used when filtering the
    * specified property.
    * 
    * @return The {@code FilterOperator} that should be used when applying
    * the {@code Filter} that looks for the {@code propertyValue} in the
    * specified {@code propertyName}.
    */
   public FilterOperator getFilterOperator() {
      logger.entering(_CLASS, "getFilterOperator()");
      logger.exiting(_CLASS, "getFilterOperator()",this.filterOperator);
      return this.filterOperator;
   }
   /**
    * Stores the {@code FilterOperator} that should be used when applying
    * the {@code Filter} against the query.
    * @param operator The {@code FilterOperator} that should be used when 
    * processing the results of the query.
    */
   public void setFilterOperator(FilterOperator filterOperator) {
      logger.entering(_CLASS, "setFilterOperator(FilterOperator)",
            filterOperator);
      this.filterOperator=filterOperator;
      logger.exiting(_CLASS, "setFilterOperator(FilterOperator)");
   }
   
   /**
    * Returns a list of the filters that are a part of the
    * {@code CompoundFilter}.
    * 
    */
   public List<Filter> getFilters() {
      logger.entering(_CLASS, "getFilters()");
      logger.exiting(_CLASS, "getFilters()",this.filters);
      return this.filters;
   }
   
   /**
    * Adds the specified list of {@code Filter} objects that are part 
    * of the {@code CompoundFilter}.
    * 
    * @param Variable list of {@code Filter} objects that are to be 
    * considered part of the {@code CompoundFilter}.
    */
   public void addFilters(Filter... filters) {
      logger.entering(_CLASS, "addFilters(Filter...)",filters);
      if (filters != null) {
         if (this.filters == null) {
            this.filters=new ArrayList<Filter>();
         } // END if (this.filters == null)
         for (Filter filter: filters) {
            this.filters.add(filter);
         } // END for (Filter filter: filters)
      } // END if (filters != null)
      logger.exiting(_CLASS, "addFilters(Filter...)");
   }
   
   /**
    * Removes the specified {@code Filter} object(s) from the list of
    * {@code Filter} objects associated with the {@code CompoundFilter}.
    * 
    * @param filters The array of {@code Filter} objects to be removed from
    * the list of filters associated with the {@code CompoundFilter}.
    * @return The list of {@code Filter} objects that were removed from the 
    * {@code CompoundFilter}
    */
   public List<Filter> removeFilters(Filter...filters) {
      logger.entering(_CLASS, "removeFilters(Filter...)",filters);
      boolean removed=false;
      List<Filter> removedFilters=null;
      
      removedFilters=new ArrayList<Filter>();
      if (
            (filters != null) && 
            (this.filters != null) &&
            (this.filters.size() > 0)
         ) {
         for (Filter filter: filters) {
            removed=this.filters.remove(filter);
            if (removed) {
               removedFilters.add(filter);
            } // END if (removed)
         } // END for (Filter filter: filters)
      } // END if ((filters != null) && (this.filters != null) && ...
      
      logger.exiting(_CLASS, "removeFilters(Filter...)",removedFilters);
      return removedFilters;
   }
}