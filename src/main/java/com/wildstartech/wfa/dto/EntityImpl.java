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
package com.wildstartech.wfa.dto;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EntityImpl implements Entity {
   private static final String _CLASS=Entity.class.getName();
   private static final Logger logger=Logger.getLogger(_CLASS);
   
   private Map<String, Property> dbValues=null;
   private Map<String, Property> trValues=null;
   private String entityName=null;
   
   /**
    * Default, no argument constructor.
    */
   public EntityImpl() {
      if (logger.isLoggable(Level.FINEST)) {
         logger.entering(_CLASS,"Entity()");
      } // END if (logger.isLoggable(Level.FINEST))
      this.dbValues=new TreeMap<String, Property>();
      this.trValues=new TreeMap<String,Property>();
      this.entityName="";
      if (logger.isLoggable(Level.FINEST)) {
         logger.exiting(_CLASS,"Entity()");      
      } // END if (logger.isLoggable(Level.FINEST))
   }
   
   //***** name
   public String getName() {
      if (logger.isLoggable(Level.FINEST)) {
         logger.entering(_CLASS,"getName()");
         logger.exiting(_CLASS,"getName()",this.entityName);    
      } // END if (logger.isLoggable(Level.FINEST))
      return this.entityName;
   }
   public void setName(String entityName) {
      logger.entering(_CLASS,"setName(String)",entityName);
      if (entityName == null) {
         this.entityName="";
      } else {
         this.entityName=entityName;
      } // END if (formName == null)
      logger.exiting(_CLASS,"setName(String)");
   }
   
   /**
    * Returns the current value of the specified value.
    */
   public Value getValue(String propertyName) {
     logger.entering(_CLASS,"getValue(String)",propertyName);
     Property property=null;
     Value value=null;
      
      // Get the transaction value...
      if (propertyName != null) {
         property=trValues.get(propertyName);
         if (property == null) {
            // Get the database value
            property=dbValues.get(propertyName);
         } // END if (value != null)
         if (property != null) {
            value=property.getValue();
         } // END if (property != null)
      } // END if (propertyName != null)
      logger.entering(_CLASS,"getValue(int)",value);
      return value;
   }

   //***** propertyNames
   public Set<String> getPropertyNames() {
      logger.entering(_CLASS,"getPropertyNames()");
      Set<String> propertyNames=null;
      logger.exiting(_CLASS,"getPropertyNames()",propertyNames);
      return propertyNames;
   }

   @Override
   public Set<Property> getProperties() {
      logger.entering(_CLASS,"getProperties()");
      Set<Property> properties=null;
      logger.exiting(_CLASS,"getProperties()",properties);
      return properties;
   }
}
