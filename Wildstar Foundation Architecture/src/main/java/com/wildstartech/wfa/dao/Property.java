package com.wildstartech.wfa.dao;

import java.util.logging.Logger;

public class Property {
  private static final String _CLASS=Property.class.getName();
  private static final Logger logger=Logger.getLogger(_CLASS);
  
  private String name=null;
  private Class<?> type=null;
  
  /**
   * Default, no-argument constructor.
   */
  public Property() {
    this.name="";
    this.type=Object.class;
  }
  
  public Property(String name, Class<?> type) {
    logger.entering(_CLASS,"Property(String,Class)", 
        new Object[] {name,type});
    if (name == null) {
      this.name="";
    } else {
      this.name=name;
    } // END if (name == null)
    if (type == null) {
      this.type=Object.class;
    } else {
      this.type=type;
    } // END if (type == null)
    logger.exiting(_CLASS, "Property(String,Class)");
  }
  //***** name
  public String getName() {
    logger.entering(_CLASS,"getName()");
    logger.exiting(_CLASS,"getName()",this.name);
    return this.name;
  }
  public void setName(String name) {
    logger.entering(_CLASS,"setName(Class)",name);
    if (name == null) {
      this.name="";
    } else {
      this.name=name;
    } // END if (name == null)
    logger.exiting(_CLASS,"setName(Class)");
  }
  //***** type
  public Class<?> getType() {
    logger.entering(_CLASS,"getType()");
    logger.exiting(_CLASS,"getType()",this.type);
    return this.type;
  }
  public void setType(Class<?> type) {
    logger.entering(_CLASS,"setType(Class)",type);
    if (type == null) {
      this.type=Object.class;
    } else {
      this.type=type;
    } // END if (type == null)
    logger.exiting(_CLASS,"setType(Class)");
  }
  
  //***** Utility methods
  public int hashCode() {
    logger.entering(_CLASS,"hashCode()");
    int result=0;
    String tmpStr=null;
    
    tmpStr=toString();
    result=tmpStr.hashCode();
    
    logger.exiting(_CLASS,"hashCode()",result);
    return result;
  }
  public String toString() {
    logger.entering(_CLASS,"toString()");
    StringBuilder sb=null;
    String tmpStr=null;
    
    sb=new StringBuilder(80);
    sb.append(getClass().getName());
    sb.append("[name: ");
    sb.append(getName());
    sb.append(", type: ");
    sb.append(getType().getCanonicalName());
    sb.append("]");
    tmpStr=sb.toString();
    logger.exiting(_CLASS,"toString()",tmpStr);
    return tmpStr;
  }
}
