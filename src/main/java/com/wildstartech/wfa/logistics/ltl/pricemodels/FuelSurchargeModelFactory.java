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
package com.wildstartech.wfa.logistics.ltl.pricemodels;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.wildstartech.wfa.logistics.ltl.Quote;

/**
 *  
 * <p>Returns a reference to the <code>FuelSurchargeModel</code>.</p>
 * 
 * @author Derek Berube, Wildstar Technologies, LLC.
 * @version 0.1, 2015-01-02
 *
 */
public abstract class FuelSurchargeModelFactory {
  private static final String _CLASS=FuelSurchargeModelFactory.class.getName();
  private static final String _PROPFILENAME="fuel-surcharge-model.properties";
  
  private static final String _PROPKEY=
      "com.wildstartech.wfa.logistics.ltl.pricemodels.FuelSurchargeModelFactory";
  private static final Logger logger=Logger.getLogger(_CLASS);
  
  private static final Class<?> factoryClass=init();
  
  /**
   * Returns a new instance of the specified type of <code>PriceModel</code>.
   * 
   * <p>The <code>String</code> passed as the value of the 
   * <code>supportedType</code> parameter must be one of the values returned by
   * the <code>getModelTypes</code> method.</p>
   */
  public abstract FuelSurchargeModel createType(String supportedType);
  
  /**
   * Returns the default instance of the <code>FuelSurchargeModel</code>. 
   * 
   * @return
   */
  public abstract FuelSurchargeModel getDefaultModel();
  
  /**
   * Returns a <code>FuelSurchargeModel</code> for the specified quote.
   * 
   */
  public abstract FuelSurchargeModel getModel(Quote quote);
  
  /**
   * Returns a list of names of available <code>FuelSurchargeModel</code> names.
   */
  public abstract List<String> getModelLabels();
  
  /**
   * Returns a list of supported <code>FuelSurchargeModel</code> classes.
   */
  public abstract List<String> getModelTypes();
  
  /**
   * Return the named price model based upon the specified parameters.
   * 
   * <p>If the specified <code>FuelSurchargeModel</code> cannot be found, then 
   * the class will return an instance of the default price model.</p>
   * @return 
   */
  public abstract PriceModel getModelByLabel(String modelLabel);
  
  /**
   * Initialization method for returning a concrete factory class.
   *  
   * @return
   */
  private static final Class<?> init() {
    logger.entering(_CLASS,"init()");
    Class<?> _class=null;
    ClassLoader cl=null;
    InputStream in=null;
    Properties props=null;
    String factoryModelName=null;
    
    // Read the properties file.
    cl=FuelSurchargeModelFactory.class.getClassLoader();
    in=cl.getResourceAsStream(_PROPFILENAME);
    if (in != null) {
      props=new Properties();
      try {
        props.load(in);
        factoryModelName=props.getProperty(_PROPKEY);
        // Load the class identified in the configuration file.
        _class=cl.loadClass(factoryModelName);
      } catch(ClassNotFoundException ex) {
        logger.log(Level.SEVERE,
            "ClassNotFoundException loading class "+factoryModelName,
            ex);
      } catch (IOException ex) {
          logger.log(Level.SEVERE,
              "IOException loading the fuel-surcharge-model.properties file.",
              ex);
      } // END try/catch
    } // END if (in != null)
    
    logger.exiting(_CLASS, "init()",_class);
    return _class;
  }
  
  public static FuelSurchargeModelFactory getInstance() {
    logger.entering(_CLASS,"getInstance()");
    FuelSurchargeModelFactory factory=null;
    
    try {
      // Create a new instance of that class.
      factory=(FuelSurchargeModelFactory) 
          FuelSurchargeModelFactory.factoryClass.newInstance();
      
    } catch (IllegalAccessException ex) {
      logger.log(Level.SEVERE,
          "Error creating instance of PriceModelFactory "+
          FuelSurchargeModelFactory.factoryClass.getName(),
          ex);
    } catch (InstantiationException ex) {
        logger.log(Level.SEVERE,
            "Error creating instance of PriceModelFactory "+
            FuelSurchargeModelFactory.factoryClass.getName(),
            ex);
    } // END /try/catch
    logger.exiting(_CLASS,"getInstance()", factory);
    return factory;
  }
}