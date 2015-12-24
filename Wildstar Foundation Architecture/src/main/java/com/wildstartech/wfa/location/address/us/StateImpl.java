/*
 * Copyright (c) 2001 - 2015 Wildstar Technologies, LLC.
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
import java.util.logging.Logger;

import com.wildstartech.wfa.location.address.State;
import com.wildstartech.wfa.location.address.StateFactory;

public class StateImpl implements java.io.Serializable, State {
	/** Used in object serialization. */
	private static final long serialVersionUID = -6746127278713806658L;
	// Name of the class
	private final static String _CLASS=StateImpl.class.getName();
	// Reference to a logging utility
	private final static Logger logger=Logger.getLogger(_CLASS);
	
    public final static int MAX_ABBREVIATION_LENGTH = 2;
    private String name = null;
    private String abbreviation = null;
    private String formattedName = null;
    private int type;

    /*
     * Private constructor intended to maintain the State's singleton nature.
     */
    @SuppressWarnings("unused")
	private StateImpl() {
    	logger.entering(_CLASS, "State()");
    	logger.exiting(_CLASS, "State()");
    }

    /*
     * Two-string constructor taking the abbreviation and name as parameters. 
     * @param abbreviation
     * @param name
     */
    protected StateImpl(String abbreviation, String name) {
        this.abbreviation = abbreviation;
        this.name = name;
        this.type = STATE_TYPE_CONTINENTAL;
    }
    /**
     * Three-parameter constructor allowing full declaration os State.
     * @param abbreviation
     * @param name
     * @param type
     */
    protected StateImpl(String abbreviation, String name, int type) {
        this.abbreviation = abbreviation;
        this.name = name;
        this.type = type;
    }
    /**
     * Preserve the singleton nature of the State class.
     * 
     * <p>Per "Effective Java" tip #77, when deserializing instances of the 
     * <code>State</code> class, this method will ensure the singleton nature of
     * this class is preserved. An instance of the class will be returned using
     * the value from the <code>abbreviation</code> field of the serialized 
     * object.</p>
     *
     * @see http://www.amazon.com/Effective-Java-Edition-Joshua-Bloch/dp/0321356683/
     * @return
     */
    private Object readResolve() throws ObjectStreamException {
    	logger.entering(_CLASS,"readReasolve()");
    	State state=null;
    	StateFactory factory=null;
    	
    	factory=LocalStateFactoryImpl.getInstance();
    	state=factory.getState(this.abbreviation);
    	logger.exiting(_CLASS,"readResolve()",state);
    	return state;
    }
    //***** accessor methods
    /* (non-Javadoc)
     * @see com.wildstartech.wfa.address.us.State#getName()
     */
    @Override
    public String getName() {
        return name;
    }

    /* (non-Javadoc)
     * @see com.wildstartech.wfa.address.us.State#getAbbreviation()
     */
    @Override
    public String getAbbreviation() {
        return abbreviation;
    }    

    /* (non-Javadoc)
     * @see com.wildstartech.wfa.address.us.State#getType()
     */
    @Override
    public int getType() {
        return type;
    }
    
    

    /**
     * Override the default <code>toString</code> method.
     */
    public String toString() {
        if (formattedName == null) {
            StringBuilder sb = new StringBuilder(name.length() + abbreviation.length() + 3);
            sb.append(name).append(" (").append(abbreviation).append(")");
            formattedName = sb.toString();
        }
        return formattedName;
    }    
}