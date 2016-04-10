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
package com.wildstartech.wfa.io;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ActionableInputStream extends InputStreamWrapper {
   private static final String _CLASS=ActionableInputStream.class.getName();
   private static final Logger logger=Logger.getLogger(_CLASS);
   
   private List<IOEventListener> eventListeners=null;
   
   public ActionableInputStream(InputStream inputStream) {
      super(inputStream);
      logger.entering(_CLASS, "ActionableInputStream(InputStream)",inputStream);
      logger.exiting(_CLASS, "ActionableInputStream(InputStream)");
   }

   /**
    * Add the specified {@code IOEventListener}
    * @param listener
    */
   public void addEventListener(IOEventListener listener) {
      logger.entering(_CLASS, "addEventListener(IOEventListener)",listener);
      
      if (this.eventListeners == null) {
         this.eventListeners=new ArrayList<IOEventListener>();
      } // END if (this.eventListeners != null)
      
      if ((listener != null) && (!this.eventListeners.contains(listener))) {
         this.eventListeners.add(listener);
      } // END if ((listener != null) && (!this.eventListeners.contains ...
      
      logger.exiting(_CLASS, "addEventListener(IOEventListener)");
   }
   
   /**
    * Close the {@code InputStream} and invoke registered listeners.
    * 
    * <p>The {@code close()} method will invoke the {@code close()} method on the 
    * super class and then it will invoke the {@code onEvent()} method on all
    * registered {@code IOEventListener} objects.</p>
    */
   public void close() throws IOException {
      logger.entering(_CLASS, "close()");
      IOEvent event=null;
      
      try {
         super.close();
      } catch (IOException ex) {
         
      } finally {
         event=new IOEvent(IOEvent.EventType.Close,this);
         for (IOEventListener listener: this.eventListeners) {
            listener.onEvent(event);
         } // END for (IOEventListener listener: this.eventListeners)
      } // END try/catch
      
      logger.exiting(_CLASS, "close()");
   }
}