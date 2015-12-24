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