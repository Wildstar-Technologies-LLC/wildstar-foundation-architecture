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

import java.util.StringTokenizer;
import java.util.logging.Logger;

import com.wildstartech.wfa.Utils;
import com.wildstartech.wfa.country.Country;
import com.wildstartech.wfa.country.CountryFactory;
import com.wildstartech.wfa.location.address.Address;
import com.wildstartech.wfa.location.address.State;
import com.wildstartech.wfa.location.address.StateFactory;
public class AddressImpl implements Address {
	private static final String _CLASS=AddressImpl.class.getName();
	private static final Logger logger=Logger.getLogger(_CLASS);
	private static final CountryFactory countryFactory=
			CountryFactory.getInstance();			
	private static final StateFactory stateFactory=LocalStateFactoryImpl.getInstance();
	
	private Country country;
    private String companyName;
    private String recipientName;
    private String streetAddress;
    private String secondaryAddress;
    private String city;
    private State state;
    private String postalCode;
    
    
    
    {
    	// Default initialization code
    	this.companyName="";
    	this.recipientName="";
    	this.streetAddress="";
    	this.secondaryAddress="";
    	this.city="";
    	this.state=null;
    	this.postalCode="";
    	this.country=countryFactory.findByCode("US");    			
    }
    /**
     * Default, no-argument constructor.
     */
    public AddressImpl() {
    	logger.entering(_CLASS,"Address()");
    	logger.exiting(_CLASS,"Address()");
    }
    
    
    //********** Company Name
    /**
     * 
     */
    public String getCompanyName() {
    	logger.entering(_CLASS,"getCompanyName()");
    	logger.exiting(_CLASS,"getCompanyName()",this.companyName);
        return this.companyName;
    }

    /**
     * 
     * @param companyName
     */
    public void setCompanyName(String companyName) {
    	logger.entering(_CLASS,"setCompanyName(String)",companyName);
    	this.companyName = Utils.defaultValue(companyName,"");
    	logger.exiting(_CLASS,"setCompanyName(String)");        
    }
    //********** Recipient Name
    public String getRecipientName() {
    	logger.entering(_CLASS,"getRecipientName()");
    	logger.exiting(_CLASS,"getRecipientName()",this.recipientName);
        return this.recipientName;
    }

    public void setRecipientName(String recipientName) {
    	logger.entering(_CLASS,"setRecipientName(String)",recipientName);
    	this.recipientName = Utils.defaultValue(recipientName,"");
    	logger.exiting(_CLASS,"setRecipientName(String)");
        
    }
    //********** Street Address
    /**
     * @return Returns the streetAddress.
     */
    public String getStreetAddress() {
    	logger.entering(_CLASS,"getStreetAddress()");
    	logger.exiting(_CLASS,"getStreetAddress()",this.streetAddress);
        return this.streetAddress;
    }

    /**
     * @param streetAddress The streetAddress to set.
     */
    public void setStreetAddress(String streetAddress) {
    	logger.entering(_CLASS,"setStreetAddress(String)",streetAddress);
    	this.streetAddress = Utils.defaultValue(streetAddress,"");
    	logger.exiting(_CLASS,"setStreetAddress(String)");       
    }
    //********** Secondary Address
    public String getSecondaryAddress() {
    	logger.entering(_CLASS,"getSecondaryAddress()");
    	logger.exiting(_CLASS,"getSecondaryAddress()",this.secondaryAddress);
        return this.secondaryAddress;
    }

    public void setSecondaryAddress(String secondaryAddress) {
    	logger.entering(_CLASS,"setSecondaryAddress(String)",secondaryAddress);
    	this.secondaryAddress = Utils.defaultValue(secondaryAddress,"");
    	logger.exiting(_CLASS,"setSecondaryAddress(String)");
    }
    //********** City
    /* (non-Javadoc)
     * @see com.wildstartech.wfa.address.us.Address#getCity()
     */
    @Override
    public String getCity() {
    	logger.entering(_CLASS,"getCity()");
    	logger.exiting(_CLASS,"getCity()",this.city);
        return this.city;
    }

    /* (non-Javadoc)
     * @see com.wildstartech.wfa.address.us.Address#setCity(java.lang.String)
     */
    @Override
    public void setCity(String city) {
    	logger.entering(_CLASS,"setCity(String)",city);
    	this.city = Utils.defaultValue(city,"");
    	logger.exiting(_CLASS,"setCity(String)");
    }
    //********** State
    /* (non-Javadoc)
     * @see com.wildstartech.wfa.address.us.Address#getState()
     */
    @Override
    public State getState() {
    	logger.entering(_CLASS,"getState()");
    	logger.exiting(_CLASS,"getState()",this.state);
        return this.state;
    }

    /**
     * @param state The state to set.
     */
    public void setState(State state) {
    	logger.entering(_CLASS,"setState(State)",state);
    	this.state=state;
    	logger.exiting(_CLASS,"setState(State)");
    }

    /* (non-Javadoc)
     * @see com.wildstartech.wfa.address.us.Address#setState(java.lang.String)
     */
    @Override
    public void setState(String name) {
    	logger.entering(_CLASS,"setState(String)",name);
    	State theState=null;
    	if ((name != null) && (name.length() >0)) {
    		theState=stateFactory.getState(name);
    		if (theState == null) {
    			logger.finest("A state object could not be found.");
    		} // END if (theState == null)
    	} else {
    		logger.finest("The name parameter was either null or zero-length.");    	
    	} // END
    	logger.exiting(_CLASS,"setState(String)");
    }
    //********** ZIP Code
    /* (non-Javadoc)
     * @see com.wildstartech.wfa.address.us.Address#getZipCode()
     */
    @Override
    public String getPostalCode() {
    	logger.entering(_CLASS,"getPostalCode()");
    	logger.exiting(_CLASS,"getPostalCode()",this.postalCode);
        return this.postalCode;
    }

    /* (non-Javadoc)
     * @see com.wildstartech.wfa.address.us.Address#setZipCode(java.lang.String)
     */
    @Override
    public void setPostalCode(String zipCode) {
    	logger.entering(_CLASS,"setZipCode(State)",zipCode);
    	this.postalCode=Utils.defaultValue(zipCode);
    	logger.exiting(_CLASS,"setZipCode(State)");
        this.postalCode = zipCode;
    }
    //********** Country
    /* (non-Javadoc)
     * @see com.wildstartech.wfa.address.us.Address#getCountry()
     */
    @Override
    public Country getCountry() {
    	logger.entering(_CLASS,"getCountry()");
    	logger.exiting(_CLASS,"getCountry()",this.country);
        return this.country;
    }

    /* (non-Javadoc)
     * @see com.wildstartech.wfa.address.us.Address#setCountry(java.lang.String)
     */
    @Override
    public void setCountry(String country) {
    	logger.entering(_CLASS,"setCountry(String)",country);
    	Country tmpCountry=null;
    	if ((country != null) && (country.length() >0)) {
    		tmpCountry=countryFactory.findByName(country);
    		if (tmpCountry==null) {
    			countryFactory.findByCode(country);
    		} // END if (tmpCountry==null)
    	} // END if ((country != null) && (country.length() >0))
    	if (tmpCountry == null) {
    		tmpCountry=countryFactory.findByCode("US");
    	} // END if (tmpCountry == null)
    	this.country=tmpCountry;
    	logger.exiting(_CLASS,"setCountry(String)");        
    }
    /* (non-Javadoc)
     * @see com.wildstartech.wfa.address.us.Address#toString()
     */
    @Override
    public String toString() {
    	logger.entering(_CLASS,"toString()");
    	String tmpStr=null;
        StringBuilder address = new StringBuilder();
        if (companyName != null) {
            address.append(companyName).append('\n');
        }
        if (recipientName != null) {
            address.append(recipientName).append('\n');
        }
        if (streetAddress != null) {
            address.append(streetAddress).append('\n');
        }
        if (secondaryAddress != null) {
            address.append(secondaryAddress).append('\n');
        }
        if (city != null) {
            address.append(city).append(", ");
        }
        if (state != null) {
            address.append(state.getAbbreviation()).append("  ");
        }
        if (postalCode != null) {
            address.append(postalCode);
        }
        if ((city != null) || (state != null) || (postalCode != null)) {
            address.append('\n');
        }
        if (country != null) {
            address.append(country).append('\n');
        }
        tmpStr=address.toString();
        logger.exiting(_CLASS,"toString()",tmpStr);
        
        return tmpStr;
    }

    /**
     * Create an Address object from a string representation of an address.
     */
    public static Address parseAddress(String address) {
    	logger.entering(_CLASS,"parseAddress(String)",address);
        int lineCount = 0;
        int startPos = 0;
        int stopPos = 0;
        int streetAddressLine = -1;
        AddressImpl addr = null;
        String tmpStr;
        StringTokenizer st = new StringTokenizer(address, "\n");
        String[] addressArray = new String[st.countTokens()];

        // Break up the address into lines
        while (st.hasMoreTokens()) {
            addressArray[lineCount] = st.nextToken();
            // Locate the Street Address line...
            if (streetAddressLine == -1) {
                if (Character.isDigit(addressArray[lineCount].charAt(0))) {
                    // The first character is a digit.
                    streetAddressLine = lineCount;
                }
            }
            lineCount++;
        }
        //********** Populate Address Information
        addr = new AddressImpl();
        //**********
        // If the street address is the second line, then the first line is the 
        // recipient
        if (streetAddressLine == 1) {
            addr.setRecipientName(addressArray[0]);
            addr.setStreetAddress(addressArray[1]);
        } else if (streetAddressLine == 2) {
            addr.setCompanyName(addressArray[0]);
            addr.setRecipientName(addressArray[1]);
            addr.setStreetAddress(addressArray[2]);
        }
        if (streetAddressLine + 2 == addressArray.length - 2) {
            addr.setSecondaryAddress(addressArray[streetAddressLine + 1]);
        }
        //********** Parse City, State, and Zip Code
        //***** City
        tmpStr = addressArray[addressArray.length - 2];
        startPos = 0;
        stopPos = tmpStr.indexOf(',');
        addr.setCity(tmpStr.substring(startPos, stopPos));
        //***** State
        startPos = stopPos + 2;
        stopPos = tmpStr.indexOf(' ', startPos);
        addr.setState(tmpStr.substring(startPos, stopPos));
        //***** Zip
        startPos = tmpStr.lastIndexOf(' ') + 1;
        addr.setPostalCode(tmpStr.substring(startPos));
        //***** Country
        addr.setCountry(addressArray[addressArray.length - 1]);
        // Return the Address
        logger.exiting(_CLASS,"parseAddress(String)",addr);
        return addr;
    }
}