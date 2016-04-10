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

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Used to return a reference to the persistence manager.
 * 
 * @author Derek Berube, Wildstar Technologies, LLC.
 * @version 1.01 April 17, 2010
 */
public abstract class PersistenceManagerFactory<K> {
	// Stores the class name (shorthand for logging purposes.
	private static String _CLASS=PersistenceManagerFactory.class.getName();
	// Class-wide logger
	private static Logger logger=Logger.getLogger(_CLASS);
	/**
	 *  Indicates the default name for the properties file
	 */
	public final static String DEFAULT_PROPERTIES_FILE="wfa-dao.properties";
	/**
	 *  The key for the property identifying the PersistenceManagerFactory
	 *  implementation to be used.
	 */
	public final static String PROPS_PMF_CLASS="pmf-implementation";
	/**
	 * Returns a reference to a <code>PersistenceManager</code> which can be
	 * used to interact with the data store.
	 * 
	 * @return A reference to an implementation of the 
	 * <code>PersistenceManager</code> interface.
	 */
	public abstract PersistenceManager getPersistenceManager();
	/**
	 * Returns a default <code>PersistenceManagerFactory</code>.
	 * @return PersistenceManagerFactory
	 */
	public static PersistenceManagerFactory<?> getInstance() {
		if (logger.isLoggable(Level.FINEST)) {
			logger.entering(_CLASS,"getInstance()");
		} // END if (logger.isLoggable(Level.FINEST))
		ClassLoader cl=null;
		InputStream in=null;
		PersistenceManagerFactory<?> pmf=null;
		Properties props=null;
		
		/* Obtain a reference to the ClassLoader responsible for loading this 
		 * class. */
		cl=PersistenceManagerFactory.class.getClassLoader();
		/* Load the default properties file as a stream. */
		in=cl.getResourceAsStream(DEFAULT_PROPERTIES_FILE);		
		if (in != null) {
			props=new Properties();
			try {
				if (logger.isLoggable(Level.FINEST)) {
					logger.finest("Loading properties file: "
							+DEFAULT_PROPERTIES_FILE);
				} // END if (log.isLoggable(Level.FINEST))
				// load the properties file
				props.load(in);
				pmf=getInstance(props);
			} catch (IOException e) {
				logger.severe("Error reading properties file \""+
						DEFAULT_PROPERTIES_FILE+"\".");
			} // END try/catch
		} else {
			logger.severe("Default properties file, \""+DEFAULT_PROPERTIES_FILE+
					"\", could not be loaded.");
		}
		if (logger.isLoggable(Level.FINEST)) {
			logger.exiting(_CLASS,"getInstance()",pmf);
		} // END if (logger.isLoggable(Level.FINEST))
		return pmf;
	}
	/**
	 * Returns a reference to the <code>PersistenceManagerFactory</code> using
	 * information provided in the <code>Properties</code> object passed as a 
	 * parameter.
	 * 
	 * @param java.util.Properties A configuration file containing the property
	 * using the key identified by the <code>PROPS_PMF_CLASS</code> field.
	 */
	public static PersistenceManagerFactory<?> getInstance(Properties props) {
		if (logger.isLoggable(Level.FINEST)) {
			logger.entering(_CLASS,"getInstance(Properties)",props);
		} // END if (logger.isLoggable(Level.FINEST))
		Class<?> pmfClass=null;
		Method method=null;
		String pmfClassName=null;
		PersistenceManagerFactory<?> pmf=null;
		
		if (props != null) {
			pmfClassName=props.getProperty(PROPS_PMF_CLASS);
			try {
				pmfClass=Class.forName(pmfClassName);				
				method=pmfClass.getMethod("getInstance", null);
				pmf=(PersistenceManagerFactory<?>) method.invoke(pmfClass, null);
			} catch (ClassNotFoundException ex) {
				logger.log(Level.SEVERE,"The specified class, "+pmfClassName+
					", could not be loaded.",ex);
			} catch (NoSuchMethodException ex) {
				logger.log(Level.SEVERE,"The specified class, "+pmfClassName+
					", could not be instantiated.",ex);
			} catch (IllegalArgumentException ex) {
				logger.log(Level.SEVERE,"IllegalArgumentException.", ex);
			} catch (IllegalAccessException ex) {
				logger.log(Level.SEVERE,"IllegalAccessException.", ex);
			} catch (InvocationTargetException ex) {
				logger.log(Level.SEVERE,"InvocationTargetException.", ex);
			} // END try/catch
		} else {
			logger.severe("Properties parameter is null.");
		} // END if (props != null)
		// Read the pmfClassName from the properties.
		
		if (logger.isLoggable(Level.FINEST)) {
			logger.exiting(_CLASS,"getInstance(Properties)",pmf);
		} // END if (logger.isLoggable(Level.FINEST))
		return pmf;
	}	
}