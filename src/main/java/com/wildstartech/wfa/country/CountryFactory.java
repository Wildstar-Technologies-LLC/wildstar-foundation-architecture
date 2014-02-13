/*
 * Copyright (c) 2001 - 2013 Wildstar Technologies, LLC.
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
 *      1453 Riverview Run Lane
 *      Suwanee, GA 30024
 *      USA
 *
 *      derek.berube@wildstartech.com
 *      www.wildstartech.com
 */
package com.wildstartech.wfa.country;

import java.util.Enumeration;
import java.util.Map;
import java.util.ResourceBundle;

/**
 * Provides access to instances of the Country object.
 * @author Derek Berube, Wildstar Technologies, LLC.
 */
public class CountryFactory {
	/** Stores a reference to the CountryFactory */
	private final static CountryFactory cf=new CountryFactory();	
	/**
	 * Map of <code>Country</code> objects using the name as a key.
	 */
	private Map<String,Country> countriesByName=null;
	/**
	 * Reference to a ResourceBundle containing the country information.
	 */
	private ResourceBundle countryInformation=null;
	
	/**
	 * Preserve the singleton nature of the CountryFactory object. 
	 */
	private CountryFactory() {
		// Obtain a reference to the ISO3166 resource bundle
		this.countryInformation=ResourceBundle.getBundle("ISO3166");
		// Lazy instantiation, so do nothing else.		
	}
	
	/**
	 * Internal initialization code.
	 */
	private void buildNameIndex() {
		Country country=null;
		Enumeration<String> enu=null;
		String key=null;
		String name=null;
		
		enu=countryInformation.getKeys();
		// Iterate through the list of countries.
		while (enu.hasMoreElements()) {
			key=enu.nextElement();
			name=countryInformation.getString(key);
			country=new Country(name,key);
			countriesByName.put(name.toUpperCase(),country);
			country=null;
			key=null;
			name=null;
		} // END while (enu.hasMoreElements())
	}
	
	/**
	 * Returns a reference to the <code>CountryFactory</code> object which is 
	 * used to obtain instances of <code>Country</code> objects.
	 * 
	 * @return A reference to the <code>CountryFactory</code>.
	 */
	public static final CountryFactory getInstance() {
		return CountryFactory.cf;
	}
	
	/**
	 * Returns a <code>Country</code> object representing the specified 
	 * abbreviation.
	 */
	public Country findByCode(String abbreviation) {
		Country country=null;
		
		if ((abbreviation != null) && 
		    (countryInformation.containsKey(abbreviation))) {
			country=(Country) countryInformation.getObject(abbreviation);
		} // END if ((abbreviation != null) && ...
		return country;
	}
	/**
	 * Returns a <code>Country</code> object by the country's name.
	 */
	public Country findByName(String name) {
		Country country=null;
		
		if (name != null) {
			// Convert the name to upper case.
			name=name.toUpperCase();
			// Check to see if countriesByName has been initialized.
			if (this.countriesByName == null) {
				// Initiate the construction of a name index.
				buildNameIndex();
			} // END if (this.countriesByName == null) 
			// Retrieve the country by name
			country=countriesByName.get(name);
		} // END if (name != null)
		return country;
	}
}
