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
package com.wildstartech.wfa.location.address.us;

import java.util.logging.Logger;

import com.wildstartech.wfa.location.address.City;

public class CityImpl implements java.io.Serializable, City {
  /** Used in object serializaiton. */
  private static final long serialVersionUID = -9073019969747991852L;
  private static final String _CLASS=CityImpl.class.getName();
  private static final Logger logger=Logger.getLogger(_CLASS);
  
  private String name=null;
  private String stateAbbreviation=null;
  
  public CityImpl() {
    logger.entering(_CLASS,"City()");
    this.name="";
    this.stateAbbreviation="";
    logger.exiting(_CLASS,"City()");
  }
  
  public CityImpl(String name, String stateAbbreviation) {
    logger.entering(_CLASS,"City(String,String)",
        new Object[] {name,stateAbbreviation});
    this.name=name;
    this.stateAbbreviation=stateAbbreviation;
    logger.exiting(_CLASS,"City(String,String)");
  }

  //***** name
  /* (non-Javadoc)
   * @see com.wildstartech.wfa.address.us.City#getName()
   */
  @Override
  public String getName() {
    logger.entering(_CLASS,"getName()");
    logger.exiting(_CLASS,"getName()",this.name);
    return this.name;
  }
  /* (non-Javadoc)
   * @see com.wildstartech.wfa.address.us.City#setName(java.lang.String)
   */
  @Override
  public void setName(String name) {
    logger.entering(_CLASS,"setName(String)",name);
    if (name != null) {
      this.name=name;      
    } else {
      this.name="";
    } // END if (name != null)
    logger.exiting(_CLASS,"setName(String)");
  }

  /* (non-Javadoc)
   * @see com.wildstartech.wfa.address.us.City#getStateAbbreviation()
   */
  @Override
  public String getStateAbbreviation() {
    logger.entering(_CLASS,"getStateAbbreviation()");
    logger.exiting(_CLASS,"getStateAbbreviation()",this.stateAbbreviation);
    return this.stateAbbreviation;
  }

  /* (non-Javadoc)
   * @see com.wildstartech.wfa.address.us.City#setStateAbbreviation(java.lang.String)
   */
  @Override
  public void setStateAbbreviation(String stateAbbreviation) {
    logger.entering(_CLASS,"setStateAbbreviation(String)",stateAbbreviation);
    if (stateAbbreviation != null) {
      this.stateAbbreviation=stateAbbreviation;      
    } else {
      this.stateAbbreviation="";
    } // END if (stateAbbreviation != null)
    logger.exiting(_CLASS,"setStateAbbreviation(String)");
  }

  /* (non-Javadoc)
   * @see com.wildstartech.wfa.address.us.City#toFormattedString()
   */
  @Override
  public String toFormattedString() {
    logger.entering(_CLASS,"toFormattedString()");
    String formattedString="";
    StringBuilder sb=null;
    
    sb=new StringBuilder(
        (this.name.length() + this.stateAbbreviation.length())*2
    );
    sb.append(getName());
    if (sb.length() > 0) {
      sb.append(", ");     
    } // END  if (sb.length() > 0)
    sb.append(getStateAbbreviation());
    formattedString=sb.toString();
    logger.exiting(_CLASS,"toFormattedString()",formattedString);
    return formattedString;
  }
  /* (non-Javadoc)
   * @see com.wildstartech.wfa.address.us.City#toString()
   */
  @Override
  public String toString() {
    logger.entering(_CLASS,"toString()");
    String tmpStr=null;
    StringBuilder sb=null;
    
    sb=new StringBuilder(80);
    sb.append("City [name=").append(this.name);
    sb.append(", stateAbbreviation=").append(this.stateAbbreviation);
    sb.append("]");
    tmpStr=sb.toString();
    logger.exiting(_CLASS,"toString()",tmpStr);
    return tmpStr;
  }

  @Override
  public int hashCode() {
    logger.entering(_CLASS,"hashCode()");
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result
        + ((stateAbbreviation == null) ? 0 : stateAbbreviation.hashCode());
    logger.exiting(_CLASS,"hashCode()",result);
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    CityImpl other = (CityImpl) obj;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (stateAbbreviation == null) {
      if (other.stateAbbreviation != null)
        return false;
    } else if (!stateAbbreviation.equals(other.stateAbbreviation))
      return false;
    return true;
  }  
}
