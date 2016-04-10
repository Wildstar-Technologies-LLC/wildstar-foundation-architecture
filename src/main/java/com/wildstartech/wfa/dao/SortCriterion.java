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

import java.io.Serializable;
import java.util.logging.Logger;

public class SortCriterion implements Serializable {
  /** Used in object serializable. */
  private static final long serialVersionUID = -1332446812581628677L;
  private static final String _CLASS=SortCriterion.class.getName();
  private static final Logger logger=Logger.getLogger(_CLASS);
  /* Flag used to indicate the direction the results should be sorted based
   * upon the property specified. */
  public enum ORDER {ASCENDING, DESCENDING};
  
  private boolean valid=false;
  private ORDER sortOrder=ORDER.ASCENDING;
  private Property property=null;
  
  /**
   * Default, no-argument constructor.
   */
  public SortCriterion() {
    logger.entering(_CLASS,"SortCriterion()");
    this.property=null;
    this.valid=false;
    logger.exiting(_CLASS,"SortCriterion()");
  }
  /**
   * Constructor taking the name of the property as a parameter.
   * @param propertyName The name of the property to be used in sorting the
   * results of the query.
   */
  public SortCriterion(Property property) {
    logger.entering(_CLASS,"SortCriterion(Property)",property);
    if (property != null) {
      this.property=property;  
      this.valid=true;
    } else {
      this.property=null;
    } // END if (propertyName != null)
    logger.exiting(_CLASS,"SortCriteria(Property)");
  }
  /**
   * Constructor using property name, sort order and data type as parameters.
   */
  public SortCriterion(Property property, ORDER order) {
    logger.entering(_CLASS,"SortCriterion(Property,ORDER)",
        new Object[] {property, order});
    if (property != null) {
      this.property=property;
      this.valid=true;
    } else {
      this.property = null;
    } // END if (propertyName != null)
    this.sortOrder=order;
    logger.exiting(_CLASS,"SortCriterion(String,ORDER,Class)");
  }
  //********** Utility Methods
  /**
   * Return a hashcode for the class.
   */
  public int hashCode() {
    logger.entering(_CLASS,"hashCode()");
    int hashCode=0;
    String value=null;
    
    value=toString();
    hashCode=value.hashCode();
    logger.exiting(_CLASS,"hashCode()",hashCode);
    return hashCode;
  }
  
  public String toString() {
    logger.entering(_CLASS,"toString()");
    Property property=null;
    String value=null;
    StringBuilder sb=null;
    
    property=getProperty();
    sb=new StringBuilder(80);
    sb.append(getClass().getName());
    sb.append(" [property: ");
    if (property != null) {
      sb.append(property.toString());
    } // END if (property != null)
    sb.append(", sortOrder: ");
    sb.append(getSortOrder());
    sb.append("]");
    value=sb.toString();
    
    logger.exiting(_CLASS,"toString()",value);
    return value;
  }
  //********** Accessor Methods
  
  //***** property
  /**
   * Return the name of the property to be used for sorting.
   * @return
   */
  public Property getProperty() {
    logger.entering(_CLASS,"getProperty()");
    logger.exiting(_CLASS,"getProperty()",this.property);
    return this.property;
  }
  public void setProperty(Property property) {
    logger.entering(_CLASS,"setProperty(Property)",property);
    if (property != null) {
      this.property=property;
    } else {
      this.property=null;
    } // END if (property != null)
    logger.exiting(_CLASS,"setProperty(Property)");
  }
  //***** sortOrder
  public ORDER getSortOrder() {
    logger.entering(_CLASS,"getSortOrder()");
    logger.exiting(_CLASS,"getSortOrder()",this.sortOrder);
    return this.sortOrder;
  }
  public void setSortOrder(ORDER sortOrder) {
    logger.entering(_CLASS,"setSortOrder(ORDER)",sortOrder);
    this.sortOrder=sortOrder;
    logger.exiting(_CLASS,"setSortOrder(ORDER)");
  }  
  //***** valid
  public boolean isValid() {
    logger.entering(_CLASS,"isValid()");
    logger.exiting(_CLASS,"isValid()",this.valid);
    return this.valid;
  }
}