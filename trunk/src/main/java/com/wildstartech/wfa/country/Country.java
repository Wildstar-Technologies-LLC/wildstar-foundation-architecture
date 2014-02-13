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

import java.util.Set;
import java.util.TreeSet;

/**
 * Provides access to ISO 3166 English Country names and code elements.
 * 
 * <p>A list of standard country names along with their two-character 
 * abbreviations can be found on the ISO web site at the following 
 * <a href="http://www.iso.org/iso/english_country_names_and_code_elements">url
 * </a>.
 * @author Derek Berube, Wildstar Technologies, LLC.
 * @version 1.0, 01 Jan 2010
 */
public class Country {
	private String name;
	private String code;
	private Set<String> alternateNames;
	
	/**
	 * Default, no-argument constructor.
	 * 
	 * The constructor is <code>protected</code> because this API is designed
	 * such that instances of the <code>Country</code> class are obtained
	 * through the use of the <code>CountryFactory</code> object.  As such, 
	 * the ability to create instances of <code>Country</code> objects is 
	 * restricted to the current package. 
	 * 
	 */
	protected Country() {
		// Not used.
	}
	
	protected Country(String code, String... names) {
		// Handle the code value
		if (code != null) { 
			this.code=code;
		} else {
			this.code="";
		} // END if (code != null)
		// Handle the names...
		if (names != null) {
			if (names.length==1) {
				this.name=names[0];
			} else {
				this.name=names[0];
				// put the rest of the names in the list of alternate names.
				this.alternateNames=new TreeSet<String>();
				for (int i=1; i < names.length; i++) {
					// Add name from the array to the list of alternate names
					this.alternateNames.add(names[i]);
				} // END for (int i=1; i < names.length; i++) 
			} // END if (names.length==1)
		} else {
			this.name="";
		} // END if (names != null)
		if (alternateNames != null) {
			// Alternate names have been specified, so store them.
			this.alternateNames=new TreeSet<String>();	
			for (String altName: alternateNames) {
				this.alternateNames.add(altName);
			} // END for (String altName; alternateNames)
		} // END if (alternateNames != null)
	}
	/**
	 * Returns a <code>String</code> array listing alternate names.
	 * 
	 * <p>If there are no alternate names, then a <code>null</code> value is
	 * returned.</p>
	 * 
	 * @return A <code>String</code> array of alternate names for the country.
	 */
	public String[] getAlternateNames() {
		String[] result=null;
	
		if (this.alternateNames != null) {
			result=this.alternateNames.toArray(new String[0]);
		} // END if (this.alternateNames != null)
		return result;
	}
	/**
	 * Returns the English language name of the country.
	 * @return the English language name of the country.
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * Returns the ISO-3166 two-character country code abbreviation.
	 */
	public String getCode() {
		return this.code;
	}
	/**
	 * Returns a <code>String</code> representation of the <code>Country</code>.
	 * @return a <code>String</code> representation of the <code>Country</code>.
	 */
	public String toString() {
		return this.name+ " (" + this.code + ")";
	}
}
