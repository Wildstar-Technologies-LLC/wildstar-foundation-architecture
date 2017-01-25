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
package com.wildstartech.wfa.logistics.ltl.pricemodels;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.wildstartech.wfa.logistics.ltl.SimpleQuote;
import com.wildstartech.wfa.logistics.ltl.quote.QuickQuote;
import com.wildstartech.wfa.logistics.ltl.quote.Quote;
import com.wildstartech.wfa.logistics.ltl.workorder.WorkOrder;

/**
 * Provides a mechanism to obtain an instance of a PriceModel.
 * 
 * <p>When this class is loaded, it will run an <code>init()</code> method that
 * will look for the <code>price-model.properties</code> configuration file and
 * read the value of the 
 * <code>com.wildstartech.wfa.logistics.ltl.PriceModelFactory</code> property to 
 * obtain the name of the class that should be instantiated and returned as the
 * price model.
 * 
 * @author Derek Berube, Wildstar Technologies, LLC.
 * @version 0.2, 2014-12-16
 *
 */
public abstract class PriceModelFactory {
  private static final String _CLASS=PriceModelFactory.class.getName();
  private static final String _PROPFILENAME="price-model.properties";
  
  private static final String _PROPKEY=
      "com.wildstartech.wfa.logistics.ltl.PriceModelFactory";
  private static final Logger logger=Logger.getLogger(_CLASS);
  
  private static final Class<?> pmfClass=init();
  
  /**
   * Returns a new instance of the specified type of <code>PriceModel</code>.
   * 
   * <p>The <code>String</code> passed as the value of the 
   * <code>supportedType</code> parameter must be one of the values returned by
   * the <code>getModelTypes</code> method.</p>
   */
  public abstract PriceModel createType(String supportedType);
  
  /**
   * Returns the default instance of the <code>PriceModel</code>. 
   * 
   * @return
   */
  public abstract PriceModel getDefaultModel();
  
  /**
   * Returns an the <code>PriceModel</code> appropriate for the specified quote.
   * 
   */
  public abstract PriceModel getModel(QuickQuote quote);
  /**
   * Returns an the <code>PriceModel</code> appropriate for the specified quote.
   * 
   */
  public abstract PriceModel getModel(Quote quote);
  /**
   * Returns an the <code>PriceModel</code> appropriate for the specified quote.
   * 
   */
  public abstract PriceModel getModel(SimpleQuote quote);
  
  /**
   * Returns the <code>PriceModel</code> appropriate for the specified 
   * work order.
   */
  public abstract PriceModel getModel(WorkOrder workOrder);
  
  /**
   * Returns a list of names for available <code>PriceModel</code> instances.
   */
  public abstract List<String> getModelLabels();
  
  /**
   * Returns a list of supported types of <code>PriceModel</code> classes.
   */
  public abstract List<String> getModelTypes();
  
  /**
   * Return the named price model based upon the specified parameters.
   * <p>If the specified <code>PriceModel</code> cannot be found, then the 
   * class will return an instance of the <code>default</code> price model.</p>
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
    String pmfName=null;
    
    // Read the properties file.
    cl=PriceModelFactory.class.getClassLoader();
    in=cl.getResourceAsStream(_PROPFILENAME);
    if (in != null) {
      props=new Properties();
      try {
        props.load(in);
        pmfName=props.getProperty(_PROPKEY);
        // Load the class identified in the configuration file.
        _class=cl.loadClass(pmfName);
      } catch(ClassNotFoundException ex) {
        logger.log(Level.SEVERE,
            "ClassNotFoundException loading class "+pmfName,
            ex);
      } catch (IOException ex) {
          logger.log(Level.SEVERE,
              "IOException loading the price-model.properties file.",
              ex);
      } // END try/catch
    } // END if (in != null)
    
    logger.exiting(_CLASS, "init()",_class);
    return _class;
  }
  
  public static PriceModelFactory getInstance() {
    logger.entering(_CLASS,"getInstance()");
    PriceModelFactory pmf=null;
    
    try {
      // Create a new instance of that class.
      pmf=(PriceModelFactory) PriceModelFactory.pmfClass.newInstance();
      
    } catch (IllegalAccessException ex) {
      logger.log(Level.SEVERE,
          "Error creating instance of PriceModelFactory "+
          PriceModelFactory.pmfClass.getName(),
          ex);
    } catch (InstantiationException ex) {
        logger.log(Level.SEVERE,
            "Error creating instance of PriceModelFactory "+
            PriceModelFactory.pmfClass.getName(),
            ex);
    } // END /try/catch
    logger.exiting(_CLASS,"getInstance()", pmf);
    return pmf;
  }
}