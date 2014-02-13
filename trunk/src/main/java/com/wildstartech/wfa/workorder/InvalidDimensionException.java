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
package com.wildstartech.wfa.workorder;

import com.wildstartech.wfa.WFAException;

public class InvalidDimensionException extends WFAException {
    /**
     * Unique class version used in object serialization/deserialization.
     */
    private static final long serialVersionUID = 1668371225315193143L;
    /**
     * Static constant used to identify the LENGTH dimension type.
     */
    public static final int LENGTH = 0;
    /**
     * Static constant used to identify the WIDTH dimension type.
     */
    public static final int WIDTH = 1;
    /**
     * Static constant used to identify the HEIGHT dimension type.
     */
    public static final int HEIGHT = 2;
    /**
     * Static constant used to identify the WEIGHT dimension type.
     */
    public static final int WEIGHT = 3;
    /**
     * Identifies the resource bundle used to format the message.
     * This field should be over-ridden by all subclassing object identifying a
     * valid ResourceBundle key.
     */
    private static String RESOURCE_BUNDLE_KEY =
            WorkOrderResources.class.getName();

    public InvalidDimensionException(int dimensionType, float dimension) {
        super(RESOURCE_BUNDLE_KEY);
        String dimensionMsg = null;
        switch (dimensionType) {
            case (LENGTH):
                dimensionMsg = "Length";
                break;
            case (WIDTH):
                dimensionMsg = "Width";
                break;
            case (HEIGHT):
                dimensionMsg = "Height";
                break;
            case (WEIGHT):
                dimensionMsg = "Weight";
                break;
            default:
                dimensionMsg = "Unknown";
                break;
        } /// END switch(dimension)

        localizeMessage("InvalidDimensionException", new Object[]{
                    dimension, dimensionMsg
                });
    }
}