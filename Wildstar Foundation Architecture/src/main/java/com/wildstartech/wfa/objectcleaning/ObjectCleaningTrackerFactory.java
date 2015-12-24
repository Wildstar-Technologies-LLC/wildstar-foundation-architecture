/*
 * Copyright (c) 2015 Wildstar Technologies, LLC.
 *
 * This file is part of Wildstar Enterprise Foundation Architecture.
 *
 * Wildstar Enterprise Foundation Architecture is free software: you can 
 * redistribute it and/or modify it under the terms of the GNU General Public 
 * License as published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * Wildstar Enterprise Foundation Architecture is distributed in the hope that
 * it will be useful, but WITHOUT ANY WARRANTY; without even the implied 
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * Wildstar Enterprise Foundation Architecture.  If not, see 
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
package com.wildstartech.wfa.objectcleaning;

import java.util.Properties;
import java.util.logging.Logger;

/**
 * Used to return a reference to a specific implementation of the 
 * {@code ObjectCleaningTracker} interface.
 * <p>The factory will look for configuration properties in the following 
 * order:</p>
 * <ul>
 * <li>{@code com.wildstarteck.wfa.objectcleaning.ObjectCleaningTrackerFactory}
 * System property</li>
 * <li>{@code java.util.Properties} passed via constructor</li>
 * <li>ObjectCleaningTrackerFactory.properties configuration file</li>
 * </ul>
 * 
 * @author Derek Berube, Wildstar Technologies, LLC.
 * @version 0.1, 2015-12-21
 *
 */
public class ObjectCleaningTrackerFactory {
   private static final String _CLASS=
         ObjectCleaningTrackerFactory.class.getName();
   private static final Logger logger=Logger.getLogger(_CLASS);
   
   /* Stores configuration information. */
   private Properties properties=null;
   
   /**
    * Default, no-argument constructor.
    */
   public ObjectCleaningTrackerFactory() {
      logger.entering(_CLASS,"ObjectCleaningTrackerFactory()");
      logger.exiting(_CLASS,"ObjectCleaningTrackerFactory()");
   }
   
   /** 
    * Constructor taking a Properties class as a parameter.
    * 
    * @param properties
    */
   public ObjectCleaningTrackerFactory(Properties properties) {
      logger.entering(_CLASS, "ObjectCleaningTrackerFactory(Properties)",
            properties);
      setProperties(properties);
      logger.exiting(_CLASS, "ObjectCleaningTrackerFactory(Properties)");
   }
   //********** Utility Methods
   /*
    * Initialization routines for the factory class.
    * <p>The system will attempt to load a class that will be used as the 
    * {@code ObjectCleaningTracker} instance using the following precedence.</p>
    * <ul>
    * <li>System property</li>
    * <li>java.util.Properites passed via constructor
    */
   private void init() {
      logger.entering(_CLASS, "init()");
      
      
      logger.exiting(_CLASS, "init()");
   }
   /**
    * Loads the specified class.
    * @param className The name of the class to load.
    * @return {@code null} if the specified class could not be loaded.
    */
   private Class<?> loadClass(String className) {
      logger.entering(_CLASS, "loadClass(String)",className);
      Class<?> factoryClass=null;
      
      
      
      logger.exiting(_CLASS, "loadClass(String)",factoryClass);
      return factoryClass;
      
   }
   //********** Accessor Methods
   public Properties getProperties() {
      logger.entering(_CLASS, "getProperties()");
      logger.entering(_CLASS, "getProperties()",this.properties);
      return this.properties;      
   }
   public void setProperties(Properties properties) {
      logger.entering(_CLASS, "setProperties(Properties)",properties);
      this.properties=properties;
      logger.exiting(_CLASS, "setProperties(Properties)");
   }
}