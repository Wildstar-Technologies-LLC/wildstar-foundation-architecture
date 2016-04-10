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
