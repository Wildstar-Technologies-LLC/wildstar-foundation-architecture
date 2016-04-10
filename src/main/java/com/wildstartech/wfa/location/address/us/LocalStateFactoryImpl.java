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
package com.wildstartech.wfa.location.address.us;

import java.io.ObjectStreamException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Logger;

import com.wildstartech.wfa.location.address.State;
import com.wildstartech.wfa.location.address.StateFactory;

public class LocalStateFactoryImpl extends StateFactory {
	private static final String _CLASS=LocalStateFactoryImpl.class.getName();
	private static final Logger logger=Logger.getLogger(_CLASS);
	private static StateFactory factory=new LocalStateFactoryImpl();
	
	private Map<String, StateImpl> statesByAbbreviation = null;
    private Map<String, StateImpl> statesByName = null;
    private List<String> abbreviations=null;
    private List<String> continentalAbbreviations=null;
    private List<String> continentalNames = null;
    private List<String> stateNames = null;
    private List<String> militaryNames = null;
    private List<String> territoryNames= null;
    
    /**
     * Private constructor to ensure the singleton nature of this class.
     */
    private LocalStateFactoryImpl() {
    	super();
    	logger.finest("Building state Map...");
    	StateImpl state=null;
    	
    	// Initialize the lists...
    	abbreviations=new ArrayList<String>();
    	continentalAbbreviations=new ArrayList<String>();
    	continentalNames=new ArrayList<String>();
    	stateNames=new ArrayList<String>();
    	statesByName=new TreeMap<String,StateImpl>();
    	militaryNames=new ArrayList<String>();
    	territoryNames=new ArrayList<String>();
    	
    	//***** Alabama
    	state=new StateImpl("AL","Alabama");
    	statesByName.put("ALABAMA", state);
    	//***** Alaska
    	state=new StateImpl("AK", "Alaska", State.STATE_TYPE_NON_CONTINENTAL);
    	statesByName.put("ALASKA", state);
    	//***** American Samoa
        state=new StateImpl("AS", "American Samoa", State.STATE_TYPE_TERRITORY);
        statesByName.put("AMERICAN SAMOA",state);
        //***** Arizona
        state=new StateImpl("AZ", "Arizona");
        statesByName.put("ARIZONA", state);
        //***** Arkansas 
        state=new StateImpl("AR", "Arkansas");
        statesByName.put("ARKANSAS", state);
        //***** California
        state=new StateImpl("CA", "California");
        statesByName.put("CALIFORNIA", state);
        //***** Colorado
        state=new StateImpl("CO", "Colorado");
        statesByName.put("COLORADO",state);
        //***** Connecticut
        state=new StateImpl("CT", "Connecticut");
        statesByName.put("CONNECTICUT",state);
        //***** Delaware
        state=new StateImpl("DE", "Delaware");
        statesByName.put("DELAWARE",state);
        //***** District of Columbia
        state=new StateImpl("DC", "District of Columbia");
        statesByName.put("DISTRICT OF COLUMBIA",state);
        //***** Federated States of Micronesia
        state=new StateImpl("FM", "Federated States of Micronesia", 
        		State.STATE_TYPE_TERRITORY);
        statesByName.put("FEDERATED STATES OF MICRONESIA", state);
        //***** Florida
        state=new StateImpl("FL", "Florida");
        statesByName.put("FLORIDA", state);
        //***** Georgia
        state=new StateImpl("GA", "Georgia");
        statesByName.put("GEORGIA", state);
        //***** Guam
        state=new StateImpl("GU", "Guam",State.STATE_TYPE_TERRITORY);
        statesByName.put("GUAM",state);
        //***** Hawaii
        state=new StateImpl("HI", "Hawaii",State.STATE_TYPE_NON_CONTINENTAL);
        statesByName.put("HAWAII",state);
        //***** Idaho
        state=new StateImpl("ID", "Idaho");
        statesByName.put("IDAHO",state);
        //***** Illinois
        state=new StateImpl("IL", "Illinois");
        statesByName.put("ILLINOIS",state);
        //***** Indiana
        state=new StateImpl("IN", "Indiana");
        statesByName.put("INDIANA",state);
        //***** Iowa
        state=new StateImpl("IA", "Iowa");
        statesByName.put("IOWA",state);
        //***** Kansas
        state=new StateImpl("KS", "Kansas");
        statesByName.put("KANSAS",state);
        //***** Kentucky
        state=new StateImpl("KY", "Kentucky");
        statesByName.put("KENTUCKY", state);
        //***** Louisiana
        state=new StateImpl("LA", "Louisiana");
        statesByName.put("LOUISIANA", state);
        //***** Maine
        state=new StateImpl("ME", "Maine");
        statesByName.put("MAINE", state);
        //***** Marshall Islands
        state=new StateImpl("MH", "Marshall Islands",State.STATE_TYPE_TERRITORY);
        statesByName.put("MARSHALL ISLANDS", state);
        //***** Maryland
        state=new StateImpl("MD", "Maryland");
        statesByName.put("MARYLAND",state);
        //***** Massachusetts
        state=new StateImpl("MA", "Massachusetts");
        statesByName.put("MASSACHUSETTS", state);
        //***** Michigan
        state=new StateImpl("MI", "Michigan");
        statesByName.put("MICHIGAN", state);
        //***** Minnesota
        state=new StateImpl("MN", "Minnesota");
        statesByName.put("MINNESOTA", state);
        //***** Mississippi
        state=new StateImpl("MS", "Mississippi");
        statesByName.put("MISSISSIPPI", state);
        //***** Missouri
        state=new StateImpl("MO", "Missouri");
        statesByName.put("MISSOURI", state);
        //***** Montana
        state=new StateImpl("MT", "Montana");
        statesByName.put("MONTANA",state);
        //***** Nebraska
        state=new StateImpl("NE", "Nebraska");
        statesByName.put("NEBRASKA", state);
        //***** Nevada
        state=new StateImpl("NV", "Nevada");
        statesByName.put("NEVADA",state);
        //***** New Hampshire
        state=new StateImpl("NH", "New Hampshire");
        statesByName.put("NEW HAMPSHIRE", state);
        //***** New Jersey
        state=new StateImpl("NJ", "New Jersey");
        statesByName.put("NEW JERSEY",state);
        //***** New Mexico
        state=new StateImpl("NM", "New Mexico");
        statesByName.put("NEW MEXICO",state);
        //***** New York
        state=new StateImpl("NY", "New York");
        statesByName.put("NEW YORK",state);
        //***** North Carolina
        state=new StateImpl("NC", "North Carolina");
        statesByName.put("NORTH CAROLINA",state);
        //***** North Dakota
        state=new StateImpl("ND", "North Dakota");
        statesByName.put("NORTH DAKOTA",state);
        //***** Northern Mariana Islands
        state=new StateImpl("MP", "Northern Mariana Islands", 
        		State.STATE_TYPE_TERRITORY);
        statesByName.put("NORTHERN MARIANA ISLANDS",state);
        //***** Ohio
        state=new StateImpl("OH", "Ohio");
        statesByName.put("OHIO",state);
        //***** Oklahoma
        state=new StateImpl("OK", "Oklahoma");
        statesByName.put("OKLAHOMA", state);
        //***** Oregon
        state=new StateImpl("OR", "Oregon");
        statesByName.put("OREGON", state);
        //***** Palau
        state=new StateImpl("PW", "Palau", State.STATE_TYPE_TERRITORY);
        statesByName.put("PALAU", state);
        //***** Pennsylvania
        state=new StateImpl("PA", "Pennsylvania");
        statesByName.put("PENNSYLVANIA", state);
        //***** Puerto Rico
        state=new StateImpl("PR", "Puerto Rico", State.STATE_TYPE_TERRITORY);
        statesByName.put("PUERTO RICO",state);
        //***** Rhode Island
        state=new StateImpl("RI", "Rhode Island");
        statesByName.put("RHODE ISLAND", state);
        //***** South Caronlina
        state=new StateImpl("SC", "South Carolina");
        statesByName.put("SOUTH CAROLINA", state);
        //***** South Dakota
        state=new StateImpl("SD", "South Dakota");
        statesByName.put("SOUTH DAKOTA", state);
        //***** Tennessee
        state=new StateImpl("TN", "Tennessee");
        statesByName.put("TENNESSEE",state);
        //***** Texas
        state=new StateImpl("TX", "Texas");
        statesByName.put("TEXAS", state);
        //***** Utah
        state=new StateImpl("UT", "Utah");
        statesByName.put("UTAH", state);
        //***** Vermont
        state=new StateImpl("VT", "Vermont");
        statesByName.put("VERMONT", state);
        //***** Virgin Islands
        state=new StateImpl("VI", "Virgin Islands", State.STATE_TYPE_TERRITORY);
        statesByName.put("VIRGIN ISLANDS", state);
        //***** Virginia
        state=new StateImpl("VA", "Virginia");
        statesByName.put("VIRGINIA", state);
        //***** Washington
        state=new StateImpl("WA", "Washington");
        statesByName.put("WASHINGTON", state);
        //***** West Virginia
        state=new StateImpl("WV", "West Virginia");
        statesByName.put("WEST VIRGINIA", state);
        //***** Wisconsin
        state=new StateImpl("WI", "Wisconsin");
        statesByName.put("WISCONSIN",state);
        //***** Wyoming
        state=new StateImpl("WY", "Wyoming");
        statesByName.put("WYOMING",state);
        //***** Armed Forces Eurpoe
        state=new StateImpl("AE", 
        		"Armed Forces Euorpe, the Middle East, and Canada", 
        		State.STATE_TYPE_MILITARY);
        statesByName.put(
        		"ARMED FORCES EURPOE, THE MIDDLE EAST, AND CANADA",
        		state);
        //***** Armed Forces Pacific
        state=new StateImpl("AP", "Armed Forces Pacific", 
        		State.STATE_TYPE_MILITARY);
        statesByName.put("ARMED FORCES PACIFIC", state);
        //***** Armed Forces Americas (except Canada)
        state=new StateImpl("AA", "Armed Forces Americas (except Canada)", 
        		State.STATE_TYPE_MILITARY);
        statesByName.put("ARMED FORCES AMERICAS (EXCEPT CANADA)",state);
        
        logger.finest("Finished building state Map...");    	
    } // END static
    
    /**
     * Preserve the singleton nature of the State class.
     * 
     * <p>Per "Effective Java" tip #77, when deserializing instances of the 
     * <code>State</code> class, this method will ensure the singleton nature of
     * this class is preserved.
     *
     * @see http://www.amazon.com/Effective-Java-Edition-Joshua-Bloch/dp/0321356683/
     * @return
     */
    private Object readResolve() throws ObjectStreamException {
    	logger.entering(_CLASS,"readReasolve()");
    	StateFactory factory=null;
    	
    	factory=LocalStateFactoryImpl.getInstance();
    	logger.exiting(_CLASS,"readResolve()",factory);
    	return factory;
    }
    
    // Initialization methods
    private Map<String,StateImpl> initializeMap(int stateType) {
    	logger.entering(_CLASS,"initialize(int)");
    	Map<String,StateImpl> map=null;
    	
    	map=new TreeMap<String,StateImpl>();
    	
    	
    	logger.exiting(_CLASS,"initialize(int)",map);
    	return map;
    }
    
    
    /**
     * Return a reference to the singleton instance of the factory. 
     * 
     * @return
     */
    public static StateFactory getInstance() {
    	logger.entering(_CLASS,"getInstance()");
    	logger.exiting(_CLASS,"getInstance()",LocalStateFactoryImpl.factory);
    	return LocalStateFactoryImpl.factory;
    }
    
    /* (non-Javadoc)
     * @see com.wildstartech.wfa.address.us.StateFactory#getState(java.lang.String)
     */
    @Override
    public State getState(String key) {
        State state = null;
        if (key != null) {
            if (key.length() == 2) {
            	if (this.statesByAbbreviation == null) {
            		this.statesByAbbreviation=initializeMap(State.STATE_ALL);
            	}
                state = statesByAbbreviation.get(key.toUpperCase());
            } else {
                state = statesByName.get(key.toUpperCase());
            } // END if (key.length() ==2)
        } // END if (key != null)
        return state;
    }
    
    /* (non-Javadoc)
     * @see com.wildstartech.wfa.address.us.StateFactory#getAbbreviations()
     */
    @Override
    public List<String> getAbbreviations() {
    	logger.entering(_CLASS,"getAbbreviations()");
    	if ((this.abbreviations == null) || (this.abbreviations.size() == 0)) {
    		if (this.abbreviations == null) {
    			this.abbreviations=new ArrayList<String>();
    		} // END if (this.abbreviations == null)
    		for (State state: statesByName.values()) {
    			this.abbreviations.add(state.getAbbreviation());
    		} // END for (State state: statesByName.values())
    		Collections.sort(this.abbreviations);
    		this.abbreviations=Collections.unmodifiableList(
    				this.abbreviations);
    	} // END if ((this.abbreviations == null) ...
    	logger.exiting(_CLASS,"getAbbreviations()",this.abbreviations);
        return this.abbreviations;
    }
    /* (non-Javadoc)
     * @see com.wildstartech.wfa.address.us.StateFactory#getContinentalAbbreviations()
     */
    @Override
    public List<String> getContinentalAbbreviations() {
    	logger.entering(_CLASS,"getContinentalAbbreviations()");
    	if (
    			(this.continentalAbbreviations == null) || 
    			(continentalAbbreviations.size() == 0)
    		) {
    		if (this.continentalAbbreviations == null) {
    			this.continentalAbbreviations=new ArrayList<String>();
    		} // END if (this.continentalAbbreviations == null)
    		for (State state: statesByName.values()) {
    			if (state.getType() == State.STATE_TYPE_CONTINENTAL) {
    				this.continentalAbbreviations.add(state.getAbbreviation());
    			} // END if (state.getType() == State.STATE_TYPE_CONTINENTAL    			
    		} // END for (State state: statesByName.values())
    		Collections.sort(this.continentalAbbreviations);
    		this.continentalAbbreviations=Collections.unmodifiableList(
    				this.continentalAbbreviations);
    	} // END if ((this.abbreviations == null) ...
    	logger.exiting(_CLASS,"getContinentalAbbreviations()",
    			this.continentalAbbreviations);
        return this.continentalAbbreviations;
    }

    /* (non-Javadoc)
     * @see com.wildstartech.wfa.address.us.StateFactory#getContinentalStateNames()
     */
    @Override
    public List<String> getContinentalStateNames() {
    	logger.entering(_CLASS, "getContinentalStateNames()");
    	if (
    			(this.continentalNames==null) || 
    			(this.continentalNames.size() == 0)
    	) {
    		if (this.continentalNames==null) {
    			this.continentalNames=new ArrayList<String>();
    		} // END if (this.continentalStateNames==null)
    		for (State state: statesByName.values()) {
    			if (state.getType() == State.STATE_TYPE_CONTINENTAL) {
    				this.continentalNames.add(state.getName());
    			} // END if (state.getType() == State.STATE_TYPE_CONTINENTAL)
    		} // END for (State state: statesByName.values())
    		Collections.sort(this.continentalNames);
    		this.continentalNames=Collections.unmodifiableList(
    				this.continentalNames);
    	} // END if ((this.continentalStateNames==null) ...    	
    	logger.exiting(_CLASS, "getContinentalStateNames()");
    	return this.continentalNames;
    }
    
    /* (non-Javadoc)
     * @see com.wildstartech.wfa.address.us.StateFactory#getMilitaryNames()
     */    
    @Override
    public List<String> getMilitaryNames() {
    	logger.entering(_CLASS, "getMilitaryNames()");
    	if (
    			(this.militaryNames==null) || 
    			(this.militaryNames.size() == 0)
    	) {
    		if (this.militaryNames==null) {
    			this.militaryNames=new ArrayList<String>();
    		} // END if (this.militaryNames==null)
    		for (State state: statesByName.values()) {
    			if (state.getType() == State.STATE_TYPE_MILITARY) {
    				this.militaryNames.add(state.getName());
    			} // END if (state.getType() == State.STATE_TYPE_MILITARY)
    		} // END for (State state: statesByName.values())
    		Collections.sort(this.continentalNames);
    		this.militaryNames=Collections.unmodifiableList(
    				this.militaryNames);
    	} // END if ((this.territoryNames==null) ...    	
    	logger.exiting(_CLASS, "getMilitaryNames()");
    	return this.militaryNames;
    }
    
    /* (non-Javadoc)
     * @see com.wildstartech.wfa.address.us.StateFactory#getStateNames()
     */
    @Override
    public List<String> getStateNames() {
    	logger.entering(_CLASS,"getStateNames()");
    	if ((this.stateNames==null) || (this.stateNames.size()==0)) {
    		if (this.stateNames==null) {
    			this.stateNames=new ArrayList<String>();
    		} // END if (this.stateNames==null)
    		for(String name: statesByName.keySet()) {
    			this.stateNames.add(name);    			
    		} // END for(String name: statesByName.keySet())
    		// Sort the list by name
    		Collections.sort(this.stateNames);
    		// Make the list unmodifiable
    		this.stateNames=Collections.unmodifiableList(this.stateNames);
    	} // END if ((this.stateNames==null) || (this.stateNames.size()==0))
    	logger.exiting(_CLASS,"getStateNames()",this.stateNames);
        return this.stateNames;
    }
    
    /* (non-Javadoc)
     * @see com.wildstartech.wfa.address.us.StateFactory#getTerritoryNames()
     */    
    @Override
    public List<String> getTerritoryNames() {
    	logger.entering(_CLASS, "getTerritoryNames()");
    	if (
    			(this.territoryNames==null) || 
    			(this.territoryNames.size() == 0)
    	) {
    		if (this.territoryNames==null) {
    			this.territoryNames=new ArrayList<String>();
    		} // END if (this.territoryNames==null)
    		for (State state: statesByName.values()) {
    			if (state.getType() == State.STATE_TYPE_TERRITORY) {
    				this.territoryNames.add(state.getName());
    			} // END if (state.getType() == State.STATE_TYPE_TERRITORY)
    		} // END for (State state: statesByName.values())
    		Collections.sort(this.continentalNames);
    		this.territoryNames=Collections.unmodifiableList(
    				this.territoryNames);
    	} // END if ((this.territoryNames==null) ...    	
    	logger.exiting(_CLASS, "getTerritoryNames()");
    	return this.territoryNames;
    }
}
