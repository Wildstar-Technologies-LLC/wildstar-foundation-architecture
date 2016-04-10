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
package com.wildstartech.wfa.person;

import java.util.Date;

public interface Contact extends SimplePerson {
	//********** age
    /**
     * Return's the person's current age, expressed in terms of years, from the
     * present date/time.  If, the person is no longer alive, their age at the
     * time of death should be returned.
     *
     * @return float The person's present age, expressed in terms of years.
     */
    public float getAge();

    /**
     * Return's the person's age, expressed in terms of years, from their
     * birthdate to the date and time passed as a parameter.
     *
     * @return float The person's age relative to the specified date.
     */
    public float getAge(Date age);

    //********** dateOfBirth
    /**
     * Return the person's date of birth.
     * @return java.util.Date The date/time corresponding to the person's birth.
     */
    public Date getDateOfBirth();

    /**
     * Set the date/time that the person was born.
     * @param java.util.Date The date/time identifying the person's birth.
     */
    public void setDateOfBirth(Date dateOfBirth);
    //********** deathDate
    /**
     * Return the date/time that the person died.
     */
    public Date getDateOfDeath();

    /**
     * Set the date/time the person died.
     * @param jva.util.Date The date/time of the person's death.
     */
    public void setDateOfDeath(Date dateOfDeath);
  //********** prefix
    /**
     * Returns the value used as the prefix of the person's name.
     * @return String The current prefix assigned to the person.
     */
    public String getPrefix();

    /**
     * Sets the value to be used as the prefix of the person's name.
     * @param prefix The value to be usedd as the prefix of the person's name.
     * @throws PersonNameTooLongException If the specified value exceeds the 
     * allowable length of a prefix for a person's name.
     */
    public void setPrefix(String prefix) throws PersonNameTooLongException;
    //********** suffix
    /**
     * Returns the current suffix for the person's name.
     * @return String The current suffix assigned of the person's name.
     */
    public String getSuffix();

    /**
     * Sets the value to be used as the suffix of the person's name.
     * @param sufix The value to be used as the suffix portion of the person's 
     * name.
     * @throws PersonNameTooLongException If the specified value exceeds the 
     * allowable length of a suffix for a person's name.
     */
    public void setSuffix(String suffix) throws PersonNameTooLongException;
}
