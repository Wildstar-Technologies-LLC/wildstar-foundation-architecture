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
