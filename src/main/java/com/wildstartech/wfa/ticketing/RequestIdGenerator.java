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
package com.wildstartech.wfa.ticketing;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class RequestIdGenerator {
   private static final String _CLASS=RequestIdGenerator.class.getName();
   private static final Logger logger=Logger.getLogger(_CLASS);
   
   public static final int MAX_LENGTH=15;
   /**
    * Default, no-argument constructor. 
    */
   public RequestIdGenerator() {
      logger.entering(_CLASS,"RequestIdGenerator()");
      logger.exiting(_CLASS,"RequestIdGenerator()");
   }
   
   /**
    * Returns the nextId value using no prefix and the defaul value.
    */
   public String getNextId() {
      logger.entering(_CLASS, "getNextId()");
      String result="";
      String prefix=null;
      
      prefix=getPrefix();
      if (prefix == null) {
         prefix="";
      } // END if (prefix == null)
      result=getNextId(getPrefix());
      
      logger.exiting(_CLASS, "getNextId()",result);
      return result;
   }
   
   /**
    * Returns the nextId value using the default length.
    * @param prefix  The alphanumeric prefix that should be used when 
    * constructing the identifier.
    * @return The formatted maximum allowable length of a request which begins
    * with the specified prefix and ends with the next available numerical
    * identifier for the record.  Zeroes (0) will be inserted between the 
    * prefix and the numerical value to ensure the <code>String</code> returned
    * is of the appropriate length.
    * 
    * @throws java.lang.IllegalArgumentException Thrown if the length of the 
    * prefix is longer than the maximum allowable length of a requestId value.
    */
   public String getNextId(String prefix) {
      logger.entering(_CLASS, "getNextId(String)",prefix);
      String result="";
      
      result=getNextId(prefix,MAX_LENGTH);
      
      logger.exiting(_CLASS, "getNextId(String)",result);
      return result;
   }
   
   /**
    * Returns the nextId value using the specified prefix and length.
    * 
    * <p>If the value for the <code>maximumLength</code> parameter is less than
    * or equal to zero (0), then the <code>maximumLength</code> property will 
    * be set equal to the <code>MAX_LENGTH</code>.</p>
    * 
    * <p>If the value of the <code>prefix</code> parameter is greater than
    * the <code>maximumLength</code> property and it is greater than the 
    * <code>MAX_LENGTH</code>, then an <code>IllegalArgumentException</code>
    * runtime exception will be thrown.</p>
    * 
    * <p>If the value of the <code>prefix</code> parameter is greater than the
    * <code>maximumLength</code> property; however, it is shorter than the 
    * <code>MAX_LENGTH</code>, then the <code>maximumLength</code> property 
    * will be set equal to <code>MAX_LENGTH</code> and the construction of the
    * identifier shall continue.</p>
    * 
    * @param prefix  The alphanumeric prefix that should be used when 
    * constructing the identifier.
    * @param maximumLength The maximum allowable length of the request id.
    *  
    * @return The formatted maximum allowable length of a request which begins
    * with the specified prefix and ends with the next available numerical
    * identifier for the record.  Zeroes (0) will be inserted between the 
    * prefix and the numerical value to ensure the <code>String</code> returned
    * is of the appropriate length.
    * 
    * @throws java.lang.IllegalArgumentException Thrown if the length of the 
    * prefix is longer than the maximum allowable length of a requestId value.
    */
   public String getNextId(String prefix, int maximumLength) {
      logger.entering(_CLASS, "getNextId(String,int)",
            new Object[] {prefix,maximumLength});
      int prefixLength=0;
      int nextIdValueLength=0;
      long nextIdValue=Long.MIN_VALUE;
      IllegalArgumentException ex=null;
      String nextIdValueStr="";
      String result="";
      StringBuilder sb=null;
      
      /* If for some reason the value of the maximumLength parameter is less
       * than zero, then it will automatically be set equal to 
       * <code>MAX_LENGTH</code>. */
      if (maximumLength < 0) maximumLength=MAX_LENGTH;
      
      /* Let's make sure the prefix is not greater than the maximum allowable
       * length for the identifier. */
      if (prefix != null) {
         prefixLength = prefix.length();
         if (prefixLength > maximumLength) {
            if (prefixLength > MAX_LENGTH) {
               sb=new StringBuilder(80);
               sb.append("The prefix is ").append(prefixLength - MAX_LENGTH);
               sb.append(" characters longer than the maximum allowable length of ");
               sb.append(MAX_LENGTH);
               
               ex=new IllegalArgumentException(sb.toString());
               ex.fillInStackTrace();
               logger.log(Level.SEVERE,
                     "Length of Prefix is Too Long",
                     ex);
               throw ex;                
            } else {
               sb=new StringBuilder(80);
               sb.append("The length of the prefix was greater than the ");
               sb.append("specified value of ").append(maximumLength);
               sb.append("; however, it was less than the MAX_LENGTH (");
               sb.append(MAX_LENGTH).append(").  The maximumLength was set ");
               sb.append("equal to MAX_LENGTH.");
               logger.warning(sb.toString());
               maximumLength=MAX_LENGTH;
            } // END if (prefix.length() > MAX_LENGTH)                     
         } // END if (prefix.length() > maximumLength)      
      } // END if (prefix != null)
      
      // Let's get the StringBuilder ready.
      sb=new StringBuilder(maximumLength);
      if (prefix != null) {
         sb.append(prefix);
      } // END if (prefix != null)
      // Get the nextId numeric value.
      nextIdValue=_getNextId();
      nextIdValueStr=String.valueOf(nextIdValue);
      nextIdValueLength=nextIdValueStr.length();
      
      /* Let's check the lengths of the combined prefix + length of the nextId
       * value represented as a string. */
      if ((prefixLength + nextIdValueLength) > maximumLength) {
         if ((prefixLength + nextIdValueLength) > MAX_LENGTH) {
            sb=new StringBuilder(80);
            sb.append("The string value of the nextId number is ");
            sb.append(nextIdValueLength).append(" which, when combined with ");
            sb.append("the length of the prefix (").append(prefixLength);
            sb.append(") is greater than the MAX_LENGTH (").append(MAX_LENGTH);
            sb.append(") property.");
            ex=new IllegalArgumentException(sb.toString());
            ex.fillInStackTrace();
            logger.log(Level.SEVERE,
                  "String Value of NextId Number is Too Large",
                  ex);
            throw ex;
         } else {
            maximumLength=MAX_LENGTH;
         } // END if ((prefixLength + nextIdValueLength) > MAX_LENGTH)
      } // END if ((prefixLength + nextIdValueLength) > maximumLength)
      
      // Let's pad with zeroes.
      for(int i=prefixLength + nextIdValueLength; i < maximumLength; i++) {
         sb.append("0");
      } // END for(int i=prefixLength + nextIdValueLength; i < maximumLength ...
      sb.append(nextIdValueStr);
      result=sb.toString();
      
      logger.exiting(_CLASS, "getNextId(String,int)",result);
      return result;
   }
   /**
    * Return the prefix that should be used when constructing the identifier.
    */
   protected abstract String getPrefix();
   
   /**
    * Return the numerical value that should be used for the identifier.
    * <p>The numerical value will be converted into a <code>String</code> value
    * and concatenated with the <code>prefix</code> in order to return a valid
    * identifier.</p>
    * 
    * @return A numerical value between 1 and the maximum allowable value based
    * upon the defined <code>MAX_LENGTH</code> for an identifier.
    */
   protected abstract long _getNextId();
}
