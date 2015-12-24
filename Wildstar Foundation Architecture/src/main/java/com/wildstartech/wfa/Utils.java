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
package com.wildstartech.wfa;

import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Utils implements LoggableObject {
	private final static String _CLASS=Utils.class.getName();
    private final static Logger logger=Logger.getLogger(_CLASS);

    /**
     * Copies an input stream to an output stream.
     *
     * This method will synchronize the input and output streams to prevent
     * data corruption during the copy operation.
     *
     * @param in The source of the data.
     * @param out The destination for the data.
     * @throws IOException If an error occurs, an IOException is thrown.
     */
    public final static void copyStream(InputStream in, OutputStream out)    
            throws IOException {
    	logger.entering(_CLASS, "copyStream(InputStream,OutputStream)", 
    			new Object[] {in,out});
        byte[] buffer = null;
        int bytesRead = 0;

        /* No threads should be allowed to read from the InputStream or
         * write to the OutputStream while copying the data. */
        synchronized (in) {
            synchronized (out) {
                buffer = new byte[2048];
                while (true) {
                    // Fill the buffer with data from the InputStream
                    bytesRead = in.read(buffer);
                    // Check to see if you've reached the end of the stream
                    if (bytesRead == -1) {
                        break;
                    }
                    // Write the data in the buffer to the OutputStream
                    out.write(buffer, 0, bytesRead);
                } // END while (true)
            } // END synchronized(out)
        } // END synchronized(in)
        logger.exiting(_CLASS, "copyStream(InputStream,OutputStream)");
    }

    /**
     * Closes the InputStream swallowing any exceptions.
     */
    public final static void closeStream(InputStream in) {
        logger.entering(_CLASS,"closeStream(InputStream)",in);            
        if (in != null) {
            try {
                in.close();
            } catch (IOException ex) {
                if (logger.isLoggable(Level.SEVERE)) {
                    logger.log(Level.SEVERE,"IOException thrown.", ex);
                } // END if (log.isTraceEnabled())
            } // END try/catch
        } // END if (in != null)
        logger.exiting(_CLASS,"closeStream(InputStream)");        
    }

    /**
     * Closes the OutputStream swallowing any exceptions.
     */
    public final static void closeStream(OutputStream out) {
        logger.entering(_CLASS,"closeStream(OutputStream)",out);            
        if (out != null) {
            try {
                out.close();
            } catch (IOException ex) {
                if (logger.isLoggable(Level.SEVERE)) {
                    logger.log(Level.SEVERE,"IOException thrown.", ex);
                } // END if (log.isTraceEnabled())
            } // END try/catch
        } // END if (in != null)
        logger.exiting(_CLASS,"closeStream(OutputStream)");        
    }

    /**
     * Returns an empty string if the value specified is null.
     * 
     */
    public final static String defaultValue(String value) {
    	logger.entering(_CLASS,"defaultValue(String)",value);
    	String returnValue="";
    	if (value != null) {
    		returnValue=value;
    	} // END if (value != null)
    	logger.entering(_CLASS,"defaultValue(String)",returnValue);
    	return returnValue;
    }
    /**
     * Returns the value specified if it is not null.
     * @param value
     * @param defaultValue
     * @return
     */
    public final static String defaultValue(String value, String defaultValue) {
        logger.entering(_CLASS,"defaultValue(String,String)",
            		new Object[] {value, defaultValue} );
        String tmpStr = null;

        tmpStr = (String) _defaultValue(value, defaultValue);
        logger.exiting(_CLASS,"defaultValue(String,String)",tmpStr);
        return tmpStr;
    }

    /**
     * Returns the value passed as the first parameter unless that value is
     * NULL, in which case the second parameter will be passed.  If the second
     * parameter is a Null object reference, then an IllegalArgumentException
     * will be thrown.
     *
     * @param desiredValue
     * @param defaultValue
     * @return
     * @throws IllegalArgumentException
     */
    public final static Object _defaultValue(Object desiredValue,
            Object defaultValue)
            throws IllegalArgumentException {
        logger.entering(_CLASS,"defaultValue(Object,Object)");
        Object result = null;
        String tmpStr = null;

        if (defaultValue == null) {
            // The defaultValue is null - this is not allowed.
            tmpStr = "The defaultValue parameter cannot be a null value.";
            throw new IllegalArgumentException(tmpStr);
        } else {
            if (desiredValue == null) {
                result = defaultValue;
            } else {
                result = desiredValue;
            } // END if (desiredValue==null)
        } // END if (defaultValue == null)
        logger.exiting(_CLASS,"defaultValue(Object,Object)");
        return result;
    }
}
