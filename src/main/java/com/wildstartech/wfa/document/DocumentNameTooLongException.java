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
package com.wildstartech.wfa.document;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.wildstartech.wfa.WFARuntimeException;
import com.wildstartech.wfa.dao.document.DocumentResources;

public class DocumentNameTooLongException extends WFARuntimeException {
	private static final String _CLASS=
		DocumentNameTooLongException.class.getName();
    private static final Logger logger=Logger.getLogger(_CLASS);
    
    /**
     * Unique class version id used in serialization/deserialization.
     */
    private static final long serialVersionUID = -4827090381303564613L;
    /**
     * Identifies the resource bundle used to format the message.
     * This field should be over-ridden by all subclassing object
     * identifying a valid ResourceBundle key.
     */
    private static final String RESOURCE_BUNDLE_KEY =
            DocumentResources.class.getName();
    private int maxDocumentNameLength = 0;
    private String documentName = null;

    public DocumentNameTooLongException(String name, int maxLength) {
        super(RESOURCE_BUNDLE_KEY);
        if (logger.isLoggable(Level.FINEST)) {
            logger.entering(_CLASS,"DocumentNameTooLongException(String,int)",
            		new Object[] {name, maxLength});
        } // END if (logger.isLoggable(Level.FINEST))
        this.documentName = name;
        this.maxDocumentNameLength = maxLength;
        localizeMessage("DocumentNameTooLongException", new Object[]{
                    name,
                    maxLength
                });
        if (logger.isLoggable(Level.FINEST)) {
            logger.exiting(_CLASS,"DocumentNameTooLongException(String,int)");
        } // END if (logger.isLoggable(Level.FINEST))
    }

    public String getDocumentName() {
    	if (logger.isLoggable(Level.FINEST)) {
    		logger.entering(_CLASS,"getDocumentName()");
            logger.exiting(_CLASS,"getDocumentName()",this.documentName);
        } // END if (logger.isLoggable(Level.FINEST))
        return this.documentName;
    }

    public int getDocumentNameMaxLength() {
    	if (logger.isLoggable(Level.FINEST)) {
    		logger.entering(_CLASS,"getDocumentNameMaxLength()");
            logger.exiting(_CLASS,"getDocumentNameMaxLength()",
            		this.maxDocumentNameLength);
        } // END if (logger.isLoggable(Level.FINEST))
        return this.maxDocumentNameLength;
    }
}
