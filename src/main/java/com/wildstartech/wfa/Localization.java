/*
 * Copyright (c) 2006 - 2016 Wildstar Technologies, LLC.
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
package com.wildstartech.wfa;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Helper utility that facilitates the process of localizing messages
 * for display to users of applications and libraries. 
 * 
 * @author Derek Berube, Wildstar Technologies, LLC.
 * @version 0.1, 2016.08.28
 *
 */
public class Localization {
   private static final String _CLASS=Localization.class.getName();
   private static final Logger logger=Logger.getLogger(_CLASS);
   
   public static String getString(String bundleBase, 
         String resourceId, Object[] params) {
      logger.entering(_CLASS,"getString(String,String,Object[])",
            new Object[] {bundleBase,resourceId,params});
      ClassLoader classLoader=null;
      Locale locale=null;
      String resource=null;
      
      classLoader=getClassLoader();
      locale=Locale.getDefault();
      resource=getString(bundleBase, resourceId, locale, 
            classLoader,params);
      
      logger.exiting(_CLASS, "getString(String,String,Object[])",
            resource);
      return resource;
   }
   
   /**
    * Returns a localized string using a specific {@code Locale}.
    * 
    * @param bundleBase The base name the {@code ResourceBundle} class 
    * should use when attempting to obtain localization information.
    * 
    * @param locale Indicates a specific {@code Locale} other than the
    * default which should be used when localizing a message.
    * 
    * @param resourceId The identifier in the resource bundle that indicates
    * which message template should be used.
    * 
    * @param params The values that should be inserted into variables 
    * defined in the message template.
    * 
    * @return A fully localized message customized with information passed
    * via the object array.
    */
   public static String getString(String bundleBase, 
         Locale locale, 
         String resourceId, 
         Object[] params) {
      logger.entering(_CLASS,"getString(String,Locale,String,Object[])",
            new Object[] {bundleBase,resourceId,params});
      ClassLoader classLoader=null;
      String resource=null;
      
      classLoader=getClassLoader();
      resource=getString(bundleBase, resourceId, locale, 
            classLoader,params);
      
      logger.exiting(_CLASS, "getString(String,String,Object[])",
            resource);
      return resource;
   }
   
   /**
    * Retrieve a message template from a {@code ResourceBundle}.
    * 
    * @param bundleBase Identifies the resource bundle that contains
    * the messages.
    * @param resourceId Identifies the specific message template that
    * should be returned and formatted with the specified parameter.
    * @param locale The {@code Locale} that should be used when 
    * determining which specific language should be used when identifying
    * the proper message.
    * @param cl The {@code ClassLoader} that should be used to retrieve
    * the appropriate {@code ResourceBundle} that contains the message
    * template.
    * @param params The parameters that should be used when formatting
    * the specified message template.
    * 
    * @return A fully localized version of the message template that 
    * has been customized with the values specified in the {@code params}
    * {@code Object} array.
    */
   public static String getString(String bundleBase, 
         String resourceId,
         Locale locale,
         ClassLoader cl,
         Object[] params) {
      logger.entering(_CLASS, 
            "getString(String,String,String,Locale,ClassLoader,Object[])",
            new Object[] {
                  bundleBase,resourceId,locale,cl,params
            });
      MessageFormat formatter=null;
      ResourceBundle resourceBundle=null;
      String resource="";
      
      if (bundleBase != null) {
         resourceBundle=ResourceBundle.getBundle(bundleBase,locale,cl);
         if (resourceBundle != null) {
            try {
               resource=resourceBundle.getString(resourceId);
            } catch (MissingResourceException ex) {
               logger.log(Level.SEVERE,
                     "Unable to locate specified resource.",
                     ex);
            } // END try/catch
         } // END if (bundle != null)
      } // END if (firstBundle != null) 
            
      
      if (resource != null) {
         if (params != null) {
            formatter=new MessageFormat(resource,locale);
            resource=formatter.format(params);
         } // END if (params != null)
      } else {
         logger.warning("No resource found.");
      } // END if (resource != null)
      
      logger.exiting(_CLASS, 
            "getString(String,String,String,Locale,ClassLoader,Object[])",
            resource);
      return resource;
   }
   
   /**
    * Returns a reference to a {@code ClassLoader} that can be used to
    * load resources for the application to use.
    * 
    * @return A reference to a {@code ClassLoader} that will be used 
    * to return localized message information.
    */
   public static ClassLoader getClassLoader() {
      logger.entering(_CLASS, "getClassloader()");
      ClassLoader cl=null;
      
      cl=Thread.currentThread().getContextClassLoader();
      if (cl == null) cl=Localization.class.getClassLoader();
      if (cl == null) cl=ClassLoader.getSystemClassLoader();
      
      logger.exiting(_CLASS, "getClassloader()",cl);
      return cl;
   }
}