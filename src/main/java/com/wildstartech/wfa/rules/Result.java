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
package com.wildstartech.wfa.rules;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

/**
 * Stores the results of processing the <code>RuleSet</code>.
 * @since 0.1, 2014-12-07
 * @author Derek Berube, Wildstar Technologies, LLC.
 *
 */
public class Result<T> {
  private static final String _CLASS=Result.class.getName();
  private static final Logger logger=Logger.getLogger(_CLASS);
  
  /* Indicates whether or not the Result can be modified. */
  private boolean mutable=true;
  /* The list of RuleException objects generated from a given session of 
   * processing a RuleSet. */
  private List<RuleException> exceptions;
  
  public Result() {
    logger.entering(_CLASS,"Result()");
    this.exceptions=new ArrayList<RuleException>();
    logger.exiting(_CLASS,"Result()");
  }
  
  /**
   * Convenience method to indicate presence of Error exceptions.
   * @return
   */
  public boolean containsError() {
    logger.entering(_CLASS, "containsError()");
    boolean result=false;
    result=containsExceptionType(RuleException.Level.ERROR);
    logger.exiting(_CLASS, "containsError()",result);
    return result;
  }
  /**
   * Convenience method to indicate presence of Information exceptions.
   * @return
   */
  public boolean containsInformational() {
    logger.entering(_CLASS, "containsInformational()");
    boolean result=false;
    result=containsExceptionType(RuleException.Level.INFORMATION);
    logger.exiting(_CLASS, "containsInformational()",result);
    return result;
  }
  /**
   * Convenience method to indicate presence of Error exceptions.
   * @return
   */
  public boolean containsWarning() {
    logger.entering(_CLASS, "containsWarning()");
    boolean result=false;
    result=containsExceptionType(RuleException.Level.WARNING);
    logger.exiting(_CLASS, "containsWarning()",result);
    return result;
  }
  /**
   * Indicates whether Result contains an exception of the specified level.
   * @param level
   * @return
   */
  public boolean containsExceptionType(RuleException.Level level) {
    logger.entering(_CLASS, "containsExceptionType(RuleException.Level)",level);
    boolean result=false;
    for (RuleException exception: this.exceptions) {
      if (exception.getLevel() == RuleException.Level.INFORMATION) {
        result=true;
        break;
      } // END if (exception.getLevel() == RuleException.Level.INFORMATION)
    } // END for (RuleException exception: this.exceptions)
    logger.exiting(_CLASS, "containsExceptionType(RuleException.Level)",result);
    return result;
  }
  //***** exceptions
  /**
   * Adds the specified exception.
   * @param exception The <code>RuleException</code> to be added to the 
   * <code>List</code> of exceptions associated with the <code>Result</code>. 
   */
  public void addException(RuleException exception) {
    logger.entering(_CLASS,"addException(RuleException)",exception);
    if (exception != null) { 
      if (mutable) {
        this.exceptions.add(exception);
      } else  {
        logger.finest("Result is NOT mutable.  RuleException NOT added.");
      } // END if (mutable)
    } else {
      logger.finest("Exception parameter is NULL.");
    } // END if (exception != null)
    logger.exiting(_CLASS,"addException(RuleException)");
  }
  /**
   * Returns an unmodifiable list of RuleSet exceptions.
   * @return
   */
  public List<RuleException> getExceptions() {
    logger.entering(_CLASS,"getExceptions()");
    logger.exiting(_CLASS,"getExceptions()");
    return (List<RuleException>) 
        Collections.unmodifiableCollection(this.exceptions);
  }
  /**
   * Removes the specified exception.
   * @param exception The <code>RuleException</code> to be removed from the 
   * <code>List</code> of exceptions associated with the <code>Result</code>. 
   */
  public void removeException(RuleException exception) {
    logger.entering(_CLASS,"removeException(RuleException)",exception);
    if (exception != null) { 
      if (mutable) {
        this.exceptions.remove(exception);
      } else  {
        logger.finest("Result is NOT mutable.  RuleException NOT removed.");
      } // END if (mutable)
    } else {
      logger.finest("Exception parameter is NULL.");
    } // END if (exception != null)
    logger.exiting(_CLASS,"removeException(RuleException)");
  }
  
  //***** mutable
  /**
   * Indicates the Result may no longer be changed.
   */
  public void setImmutable() {
    logger.entering(_CLASS,"setImmutable()");
    if (this.mutable) {
      this.mutable = false;
    } else {
      logger.finest("Result is already immutable.");
    } // END if (this.mutable)
    logger.exiting(_CLASS,"setMutable()");
  }
}
