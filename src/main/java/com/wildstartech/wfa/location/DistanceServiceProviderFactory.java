/*
 * Copyright (c) 2001 - 2015 Wildstar Technologies, LLC.
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
package com.wildstartech.wfa.location;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.wildstartech.wfa.location.spi.DistanceServiceProvider;

/**
 * The <code>DistanceServiceProvideraFactory</code> is used to obtain a 
 * reference to a concrete implementation of the 
 * <code>DistanceServiceProvider</code> interface.  
 * 
 * @author Derek Berube, Wildstar Technologies, LLC.
 * @version 0.1, 2015-06-22
 */
public class DistanceServiceProviderFactory {
  private static final String _CLASS=
      DistanceServiceProviderFactory.class.getName();
  private static final Logger logger=Logger.getLogger(_CLASS);
  
  private static String DEFAULT_CLASS_NAME=
      "com.wildstartech.wfa.location.spi.haversine.DistanceServiceProviderImpl";
  private static String PROPERTIES_FILE="DistanceServiceProvider.properties";
  
  /**
   * <p>When reading the <code>DistanceSerivceProvider.properties</code> 
   * configuration file, this class will look for the 
   * <code>PROPERTIES_FACTORY_KEY</code> property to get the name of the 
   * class that provides an implementation of the 
   * <code>DistanceServiceProvider</code> interface.</p>
   */
  public static String PROPERTIES_FACTORY_KEY=
      "com.wildstartech.wfa.location.DistanceServiceProviderFactory";
  /* Stores the name of the class that will be instantiated upon invocation of
   * the <code>getService()</code> method. */
  private Class<?> serviceProviderClass=null;
  
  /**
   * Default constructor intended enforce the <code>Singleton</code> nature of
   * the factory.
   */
  private DistanceServiceProviderFactory() {
    logger.entering(_CLASS, "DistanceServiceProviderFactory()");
    init();
    logger.exiting(_CLASS, "DistanceServiceProviderFactory()");
  }
  
  /**
   * Initialization routine.
   */
  private void init() {
    logger.entering(_CLASS,"init()");
    ClassLoader cl=null;
    InputStream in=null;
    Properties props=null;
    String className=null;
    StringBuilder msg=null;
    
    if (logger.isLoggable(Level.FINEST)) {
      logger.finest("Attempting to read the configuration file: "+
          PROPERTIES_FILE);
    } // END if (logger.isLoggable(Level.FINEST))
    cl=DistanceServiceProviderFactory.class.getClassLoader();
    in=cl.getResourceAsStream(PROPERTIES_FILE);
    if (in != null) {
      // The properties configuration file was found.
      props=new Properties();
      try {
        props.load(in);
        className=props.getProperty(PROPERTIES_FACTORY_KEY);
        if ((className == null) || (className.length() == 0)) {
          msg=new StringBuilder();
          msg.append("The \"").append(PROPERTIES_FILE).append("\"");
          msg.append("configuration file was found; however, it did not ");
          msg.append("contain a value for the  \"");
          msg.append(PROPERTIES_FACTORY_KEY).append("\" property.");
          logger.severe(msg.toString());
        } else {
          try {
            this.serviceProviderClass=cl.loadClass(className);
          } catch (ClassNotFoundException ex) {
            msg=new StringBuilder(80);
            msg.append("Unable to load the designated DistanceSerivceProvider");
            msg.append(" implementation.");
            logger.log(Level.SEVERE,
                msg.toString(),
                ex);
          } // END try/catch
        } // END if (className == null) || (className.length() == 0)
      } catch (IOException ex) {
        logger.log(Level.SEVERE,
            "Error Reading the Configuration File",
            ex);
      } // END try/catch      
    } else {
      /* The properties file was NOT FOUND, so let's try to load the default 
       * class. */
      if (logger.isLoggable(Level.FINEST)) {
        logger.finest(PROPERTIES_FILE+" Configuration File NOT Found");
        logger.finest("Loading Default Service Provider Class: "+
            DEFAULT_CLASS_NAME);
      } // END if (logger.isLoggable(Level.FINEST))      
    } // END if (in != null)
    
    // Check to see if a service provider class was specified.
    if (this.serviceProviderClass == null) {
      try {
        this.serviceProviderClass=cl.loadClass(DEFAULT_CLASS_NAME);
      } catch (ClassNotFoundException ex) {
        logger.log(Level.SEVERE,
            "Unable to Load Default Distance Service Provider Class",
            ex);
      } // END try/catch
    }
    logger.exiting(_CLASS, "init()");
  }
  /**
   * Returns a concrete distance service provider factory. 
   * @return
   */
  public static DistanceServiceProviderFactory getInstance() {
    logger.entering(_CLASS,"getInstance()");
    
    DistanceServiceProviderFactory factory=null;
    factory=new DistanceServiceProviderFactory();
    
    logger.exiting(_CLASS,"getInstance()",factory);        
    return factory;
  }
  
  /**
   * Returns a <code>DistanceServiceProvider</code> implementation.
   * @return
   */
  public DistanceServiceProvider getService() {
    logger.entering(_CLASS,"getService()");
    DistanceServiceProvider provider=null;
    StringBuilder sb=null;
    
    if (this.serviceProviderClass != null) {
      try {
        provider=(DistanceServiceProvider) 
            this.serviceProviderClass.newInstance();
      } catch (InstantiationException ex) {
        sb=new StringBuilder(80);
        sb.append("InstantiationException Thrown Trying to Create Instance of");
        sb.append(" ").append(this.serviceProviderClass.getName());
        logger.log(Level.SEVERE,
            sb.toString(),
            ex);
      } catch (IllegalAccessException ex) {
        sb=new StringBuilder(80);
        sb.append("IllegalAccessException Thrown Trying to Create Instance of");
        sb.append(" ").append(this.serviceProviderClass.getName());
        logger.log(Level.SEVERE,
            sb.toString(),
            ex);
      }
    } else {
      logger.severe(
          "The DistanceServiceProvider class has not been identified.");
    } // END if (this.serviceProviderClass != null)
    
    logger.exiting(_CLASS,"getService()",provider);
    return provider;
  }
}
