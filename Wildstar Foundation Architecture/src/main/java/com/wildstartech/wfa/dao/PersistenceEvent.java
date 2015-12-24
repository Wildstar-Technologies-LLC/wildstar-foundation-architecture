/*
 * Copyright (c) 2001 - 2014 Wildstar Technologies, LLC.
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
package com.wildstartech.wfa.dao;

import java.util.logging.Logger;

/**
 * Provides hooks into various phases of the persistence framework.
 * @version 0.1, 2014-12-08
 * @author Derek Berube, Wildstar Technologies, LLC.
 *
 */
public class PersistenceEvent<W extends WildObject> {
  private static String _CLASS=PersistenceEvent.class.getName();
  private static Logger logger=Logger.getLogger(_CLASS);
  
  /* The type of event being fired. */
  private EventType eventType=null;
  
  /* The object for which the event is being fired. */
  private W object=null;
  
  /**
   * Enumeration listing the various types of events.
   * 
   * <dl>
   * <dt><code>PreSave</code></dt>
   * <dd>Triggered immediately before the object is written to the persistent
   * data store.</dd>
   * <dt>PostSave</dt>
   * <dd>Triggered immediately after an object is written to the persistent
   * data store.</dd>
   * <dt>PreDelete</dt>
   * <dd>Triggered immediately before the object is removed from the persistent
   * data store.</dd>
   * <dt>PostDelete</dt>
   * <dd>Triggered immediately after the object is removed from the persistent
   * data store.</dd>
   */
  public enum EventType {PreSave, PostSave, PreDelete, PostDelete};
  
  
  
  /**
   * Default no-argument constructor.
   */
  public PersistenceEvent() {
    logger.entering(_CLASS,"PersistenceEvent()");
    logger.exiting(_CLASS,"PersistenceEvent()");
  }
  
  /**
   * Constructor taking <code>EventType</code> and <code>WildObject</code> as
   * parameters.
   */
  public PersistenceEvent(EventType eventType, W object) {
    logger.entering(_CLASS,"PersistenceEvent(EventType,W)",
        new Object[] {eventType,object});
    if ((eventType == null) && (object == null)) {
      throw new IllegalArgumentException(
          "Both the eventType and object parameters are null.");
    } else if (eventType == null) {
      throw new IllegalArgumentException("The eventType parameter is null.");
    } else if (object == null) {
      throw new IllegalArgumentException("The object parameter is null.");
    } else {
      this.eventType=eventType;
      this.object=object;
    } // END if ((eventType == null) && (object == null))
    
    logger.exiting(_CLASS,"PersistenceEvent(EventType,W)");
  }
  //***** object
  public W getPersistentObject() {
    logger.entering(_CLASS,"getPersistentObject()");
    logger.exiting(_CLASS,"getPersistentObject()",this.object);
    return this.object;
  } 
  /**
   * Sets the object for which this event has been triggered.
   * 
   * <table border="0">
   *   <tr>
   *      <td><strong>NOTE:</strong></td>
   *      <td>
   *      This method may be called only <strong>one</strong> time in the 
   *      context of a given <code>PersistenceEvent</code>.  Once this method 
   *      has been invoked with a non-null value, successive invocations have no 
   *      impact.
   *      </td>
   *    </tr>
   * </table>
   */
  public void setPersistentObject(W object) {
    logger.entering(_CLASS, "setPersistentObject(W)",object);
    if (object != null) {
      // The PersistentObject is NOT null.
      if (this.object == null) {
        this.object=object;
      } else {
        logger.finest(
            "The object for this PersistenceEvent has already been set.");
      } // END if (this.eventType == null)
    } else {
      logger.finest("The object parameter was null.");
    } // END  if (eventType != null)
    logger.exiting(_CLASS, "setPersistentObject(W)");
  }
  //***** eventType
  /**
   * Identifies the type of event being performed.
   * @return
   */
  public EventType getEventType() {
    logger.entering(_CLASS,"getEventType()");
    logger.exiting(_CLASS,"getEventType()",this.eventType);
    return this.eventType;
  }
  /**
   * Convenience method for comparing events.
   * 
   * @return A true/false value indicating whether the current event is of the
   * same type as the value passed as the <code>targetEventType</code> 
   * parameter.
   */
  public boolean isEventType(EventType targetEventType) {
    logger.entering(_CLASS,"isEventType(EventType)",targetEventType);
    boolean result=false;
    if ((this.eventType != null) && (this.eventType == targetEventType)) {
      result = true;
    } // END if (this.eventType != null) && (this.eventType == targetEventType)
    logger.exiting(_CLASS,"isEventType(EventType)",result);
    return result;
  }
  /**
   * Sets the type of event.
   * 
   * <table border="0">
   *   <tr>
   *      <td><strong>NOTE:</strong></td>
   *      <td>
   *      This method may be called only <strong>one</strong> time in the 
   *      context of a given <code>PersistenceEvent</code>.  Once this method 
   *      has been invoked with a non-null value, successive invocations have no 
   *      impact.
   *      </td>
   *    </tr>
   * </table>
   */
  public void setEventType(EventType eventType) {
    logger.entering(_CLASS, "setEventType(EventType)",eventType);
    if (eventType != null) {
      // The eventType is NOT null.
      if (this.eventType == null) {
        this.eventType=eventType;
      } else {
        logger.finest(
            "The eventType for this PersistenceEvent has already been set.");
      } // END if (this.eventType == null)
    } else {
      logger.finest("The eventType parameter was null.");
    } // END  if (eventType != null)
    logger.exiting(_CLASS, "setEventType(EventType)");
  }
}
