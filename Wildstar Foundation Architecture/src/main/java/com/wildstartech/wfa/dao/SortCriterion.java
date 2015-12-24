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