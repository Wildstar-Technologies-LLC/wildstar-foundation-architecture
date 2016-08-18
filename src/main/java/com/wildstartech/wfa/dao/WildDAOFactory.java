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
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Properties;

/**
 * Provides access to the Data Access Object used to manage persistence.
 * <p>The <code>WildDAOFactory</code> is used to return a concrete 
 * implementation of a Data Access Object (DAO) which is used to manage the
 * persistence process for a specific type of object.  The various sub-classes
 * of this object delegate the process of retrieving a specific instance of a  
 * DAO to the <code>getDAO()</code> method of this object.</p>
 * 
 * <p>By default, the <code>WildDAOFactory</code> looks for the
 * <code>wild-dao.properties</code> configuration file on the classpath.  The 
 * contents of this file should adhere to the following convention.</p>
 * <table>
 * 	<tr>
 * 	 <td><code>com.wildstartech.dao.UserDAOFactory</code></td>
 *   <td>=</td>
 *   <td><code>com.wildstartech.dao.gae.UserDAOFactoryImpl</code></td>
 *  </tr>
 * </table>
 * 
 * @author Derek Berube, Wildstar Technologies, LLC.
 * @version 0.1, 2013-09-10
 *
 * @param <D> The type of Data Access Object (DAO) that manages persistence.
 * @param <T> The class which for which the DAO manages persistence.
 * @param <W> The persistent version of the class managed by the DAO.
 * @param <K> The type of primary key used by the persistent data store to
 * uniquely identify an element.
 */
public abstract class WildDAOFactory<D extends WildDAO<T, W>, T, W extends WildObject> {
	private static final String _CLASS=WildDAOFactory.class.getName();
	private static final Logger logger=Logger.getLogger(_CLASS);
	
	/**
	 * 
	 * @return An instance of the Data Access Object which will be used to 
	 * interact with the persistent data store.
	 */
	@SuppressWarnings("unchecked")
	public D getDAO() {
		logger.entering(_CLASS, "getDAO()");
		Class<?> _class=null;
		ClassLoader cl=null;
		D dao=null;
		InputStream in=null;
		Properties props=null;
		String className=null;
		String property=null;
		
		// Get the name of the current class
		className=this.getClass().getName();
		// Read the properties file.
		cl=this.getClass().getClassLoader();
		in=cl.getResourceAsStream("wild-dao.properties");
		
		if (in != null) {
			props=new Properties();
			try {
				props.load(in);
				property=props.getProperty(className);
				logger.log(Level.FINEST,"Class Name: "+property);
				// Load the class identified in the configuration file.
				_class=cl.loadClass(property);
				// Create a new instance of that class.
				dao=(D) _class.newInstance();
			} catch(ClassNotFoundException ex) {
				logger.log(Level.SEVERE,
					"ClassNotFoundException loading class "+property,
					ex);
			} catch (IllegalAccessException ex) {
				logger.log(Level.SEVERE,
					"Error creating instance of DAO "+property,
					ex);
			} catch (InstantiationException ex) {
				logger.log(Level.SEVERE,
					"Error creating instance of DAO "+property,
					ex);
			} catch (java.lang.ExceptionInInitializerError ex) {
			   logger.log(Level.SEVERE,
			         "ExceptionInInitializerError invoking newInstance() method.",
			         ex);
			} catch (IOException ex) {
				logger.log(Level.SEVERE,
					"IOException loading the wild-dao.properties file.",
					ex);
			} // END try/catch
		} // END if (in != null)
		
		logger.exiting(_CLASS, "getDAO()",dao);
		return dao;
	}
}