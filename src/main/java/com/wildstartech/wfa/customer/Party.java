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
package com.wildstartech.wfa.customer;

import com.wildstartech.wfa.company.Company;
import com.wildstartech.wfa.person.Person;

public class Party {

    /**
     * Indicates that the party is un unknown customer type.
     */
    public final static int TYPE_UNKNOWN = -1;
    /**
     * Indicates that the Party is an individual.
     */
    public final static int TYPE_PERSON = 0;
    /**
     * Indicates that the Party is an organization.
     */
    public final static int TYPE_COMPANY = 1;
    /**
     * Holds a reference to the Party object.
     */
    private Object party;
    /**
     * Holds the party's name
     */
    private String partyName;
    /**
     * Indicates what type of object is held in the Party field.
     */
    private int type;

    /**
     * Default, no-argument constructor.
     */
    public Party() {
        party = null;
    }

    /**
     * Constructor taking a Company object as a parameter
     */
    public Party(Company company) {
        if (company != null) {
            this.party = company;
            this.partyName = company.getName();
            this.type = TYPE_COMPANY;
        } else {
            this.party = null;
        }
    }

    /**
     * Constructor taking a Person as a parameter.
     */
    public Party(Person person) {
        String name = null;
        if (person != null) {
            this.party = person;
            name = person.getName();
            if (name != null) {
                this.partyName = name.toString();
            } else {
                this.partyName = null;
            }
            this.type = TYPE_PERSON;
        } else {
            this.party = null;
        }
    }
    //********** party
    public Object getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public void setParty(Company company) {
        if (company != null) {
            this.party = company;
            this.partyName = company.getName();
            this.type = TYPE_COMPANY;
        } else {
            this.party = null;
        }
    }

    public void setParty(Person person) {
        String name = null;
        if (person != null) {
            this.party = person;
            name = person.getName();
            if (name != null) {
                this.partyName = name.toString();
            } else {
                this.partyName = "";
            }
            this.type = TYPE_PERSON;
        } else {
            this.party = null;
        }
    }
    //********** name
    public String getName() {
        return partyName;
    }
    //********** type
    public int getType() {
        return type;
    }

    public void setType(int type) {
    }

    /**
     * Return a string representation of the <code>Party</code>.
     * 
     * @return java.lang.String
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        switch (type) {
            case (Party.TYPE_COMPANY):
                sb.append("Company: ");
                sb.append(((Company) party).toString());
                break;
            case (Party.TYPE_PERSON):
                sb.append("Person: ");
                sb.append(((Person) party).toString());
                break;
        }
        return sb.toString();
    }
}
