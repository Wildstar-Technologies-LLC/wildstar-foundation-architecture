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
package com.wildstartech.wfa.objectcleaning;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadFactory;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Manages the process of removing objects after a marker object has been
 * garbage collected.
 * 
 * <p>This object will create a background thread that will be responsible
 * for invoking the {@code clean()} method on objects that are registered with
 * the tracker and their handler object is garbage collected.
 * 
 * @author Derek Berube, Wildstar Technologies, LLC.
 * @version 0.1, 2015-12-17
 */
public class ThreadedObjectCleaningTracker implements ObjectCleaningTracker {
   private static final String _CLASS=
         ThreadedObjectCleaningTracker.class.getName();
   private static final Logger logger=Logger.getLogger(_CLASS);
   
   /* Factory used to create a thread for monitoring. */
   private ThreadFactory threadFactory=null;
   
   /**
    * Marking this field as {@code volatile} because it could be set by
    * different threads. 
    */
   private volatile boolean exitWhenFinished=false;
   
   /**
    * List of "un-cleanable" objects.
    */
   private List<Tracker> uncleanableObjects=null;
   
   
   /**
    * Represents a list of objects that are being monitored for garbage
    * collection. 
    */
   private ReferenceQueue<Object> referenceQueue=null;
   
   /**
    * A collection of tracker objects.
    */
   private Set<Tracker> trackers=null;         
   /**
    * Thread responsible for cleaning up objects once their marker object has
    * been garbage collected.
    */
   private Thread cleanerThread=null;
   
   
   /**
    * Default, no-argument constructor.
    */
   public ThreadedObjectCleaningTracker() {
      logger.entering(_CLASS, "ThreadedObjectCleaningTracker()");      
      logger.exiting(_CLASS, "ThreadedObjectCleaningTracker()");
   }
   
   public ThreadedObjectCleaningTracker(ThreadFactory factory) {
      logger.entering(_CLASS, "ThreadedObjectCleaningTracker(ThreadFactory)",
            factory);
      setThreadFactory(factory);
      logger.exiting(_CLASS, "ThreadedObjectCleaningTracker(ThreadFactory)");
   }

   //********** Accessor Methods
   //***** cleanerThread
   /**
    * 
    */
   private Thread getCleanerThread() {
      logger.entering(_CLASS,"getCleanerThread()");
      logger.exiting(_CLASS,"getCleanerThread()",this.cleanerThread);
      return this.cleanerThread;
   }
   private void setCleanerThread(Thread thread) {
      logger.entering(_CLASS, "setCleanerThread(Thread)",thread);
      this.cleanerThread=thread;
      logger.exiting(_CLASS, "setCleanerThread(Thread)");
   }
   //***** referenceQueue
   private ReferenceQueue<Object> getReferenceQueue() {
      logger.entering(_CLASS, "getReferenceQueue()");
      logger.exiting(_CLASS, "getReferenceQueue()",this.referenceQueue);
      return this.referenceQueue;
   }
   private void setReferenceQueue(ReferenceQueue<Object> referenceQueue) {
      logger.entering(_CLASS, "setReferenceQueue(ReferenceQueue)",
            referenceQueue);
      this.referenceQueue=referenceQueue;
      logger.exiting(_CLASS, "setReferenceQueue(ReferenceQueue)");
   }
   //***** threadFactory
   /**
    * Returns an instance of {@code java.util.concurrent.ThreadFactory} that
    * will be used to create a thread to manage the cleanup process.
    * 
    * @return
    */
   public ThreadFactory getThreadFactory() {
      logger.entering(_CLASS,"getThreadFactory()");
      logger.entering(_CLASS,"getThreadFactory()",this.threadFactory);
      return this.threadFactory;
   }
   /**
    * Set the {@code ThreadFactory} to be used to generate a {@code Thread}
    * used to manage the clean-up process.
    * 
    * @param factory
    */
   public void setThreadFactory(ThreadFactory factory) {
      logger.entering(_CLASS,"setThreadFactory(ThreadFactory)",factory);
      this.threadFactory=factory;
      logger.exiting(_CLASS,"setThreadFactory(ThreadFactory)");
   }
   //***** trackers
   private Set<Tracker> getTrackers() {
      logger.entering(_CLASS, "getTrackers()");
      logger.exiting(_CLASS, "getTrackers()",this.trackers);
      return this.trackers;
   }
   private void setTrackers(Set<Tracker> trackers) {
      logger.entering(_CLASS, "setTrackers(Set<Tracker>)",trackers);
      this.trackers=trackers;
      logger.entering(_CLASS, "setTrackers(Set<Tracker>)");
   }
   //********** Utility Methods
   /* (non-Javadoc)
    * @see com.wildstartech.wfa.objectcleaning.ObjectCleaningTracker#addTracker(com.wildstartech.wfa.objectcleaning.Cleanable, java.lang.Object)
    */
   @Override
   public synchronized void addTracker(
         Cleanable cleanableObject, 
         Object marker) {
      logger.entering(_CLASS, "addTracker(Cleanable,Object)");
      Cleaner cleaner=null;
      ReferenceQueue<Object> referenceQueue=null;
      Set<Tracker> trackers=null;
      Thread cleanerThread=null;
      ThreadFactory threadFactory=null;
      
      if (this.exitWhenFinished) {
         throw new IllegalStateException(
               "Unable to add a tracker once exitWhenFinished() invoked.");
      } // END if (this.exitWhenFinished)
      
      //********** BEGIN Lazy-instantiation
      //***** Has the reference queue been created?
      referenceQueue=getReferenceQueue();
      if (referenceQueue == null) {
         referenceQueue=new ReferenceQueue<Object>();
         setReferenceQueue(referenceQueue);
      } // END if (this.referenceQueue == null)
      //***** Has the trackers collection been created?
      trackers=getTrackers();
      if (trackers == null) {
         trackers=Collections.synchronizedSet(new HashSet<Tracker>());
         setTrackers(trackers);
      } // END if (this.trackers == null)      
      //***** Has the cleaner thread been created
      cleanerThread=getCleanerThread();
      if (cleanerThread == null) {
         cleaner=new Cleaner();
         threadFactory=getThreadFactory();
         if (threadFactory != null) {
            cleanerThread=threadFactory.newThread(cleaner);
            cleanerThread.setName("Cleaner Thread");
            cleanerThread.setDaemon(true);
            cleanerThread.start();
            setCleanerThread(cleanerThread);
         } else {
            throw new IllegalStateException(
               "Unable to get ThreadFactory");
         } // END threadFactory=getThreadFactory();         
      } // END if (this.cleanerThread == null)
      //********** END Lazy-instantiation checks
      //***** Pre-work done, let's add the trakcer.
      trackers.add(new Tracker(cleanableObject,marker,referenceQueue));
      
      logger.exiting(_CLASS, "addTracker(Cleanable,Object)");
   }
   
   /**
    * Call this method to cause the file cleaner thread to terminate when
    * there are no more objects being tracked for deletion.
    * <p>
    * In a simple environment, you don't need this method as the file cleaner
    * thread will simply exit when the JVM exits. In a more complex environment,
    * with multiple class loaders (such as an application server), you should be
    * aware that the file cleaner thread will continue running even if the class
    * loader it was started from terminates. This can consitute a memory leak.
    * <p>
    * For example, suppose that you have developed a web application, which
    * contains the commons-io jar file in your WEB-INF/lib directory. In other
    * words, the FileCleaner class is loaded through the class loader of your
    * web application. If the web application is terminated, but the servlet
    * container is still running, then the file cleaner thread will still exist,
    * posing a memory leak.
    * <p>
    * This method allows the thread to be terminated. Simply call this method
   * in the resource cleanup code, such as
   * {@code javax.servlet.ServletContextListener.contextDestroyed(javax.servlet.ServletContextEvent)}.
   * Once called, no new objects can be tracked by the file cleaner.
   */
   public synchronized void exitWhenFinished() {
      // synchronized block protects reaper
      exitWhenFinished = true;
      if (this.cleanerThread != null) {
         synchronized (this.cleanerThread) {
            this.cleanerThread.interrupt();
         } // END synchronized (this.cleanerThread)
      } // END if (this.cleanerThread != null) 
   }
   
   //********** Internal classes ********** 
   
   /*
    * Internal class responsible for managing the "cleaning" process.
    * <p>Identified as {@code private} to ensure it is not used outside the 
    * scope of this object.</p>
    */
   private final class Cleaner implements Runnable {
      /**
       * Method responsible for monitoring the ReferenceQueue for objects to
       * clean.
       */
      public void run() {
         logger.entering(_CLASS, "run()");
         boolean result=false;
         Tracker tracker=null;
         
         while (!exitWhenFinished && trackers.size() > 0) {
            try {
               /* Thread blocks until the garbage collector enqueues an object
                * that is, aside from references in this class, is ready for
                * garbage collection. */
               tracker=(Tracker) referenceQueue.remove();
               // Remove the tracker from the list of trackers
               trackers.remove(tracker);
               // Invoke the clean method on the tracker.
               result=tracker.clean();
               if (!result) {
                  /* If the object could not be "cleaned", add it to the list
                   * of uncleanable Objects.class */
                  if (uncleanableObjects == null) {
                     uncleanableObjects=Collections.synchronizedList(
                           new ArrayList<Tracker>());
                  } // END if (uncleanableObjects == null)
                  uncleanableObjects.add(tracker);
               } // END if (!result)
               /* The Tracker is a {@code PhantomReference} subclass, so 
                * invocation of the {@code clear} method clears the reference
                * object. */
               tracker.clear();
            } catch (InterruptedException ex) {
               logger.log(Level.WARNING, "Cleaner thread interrupted.", ex);
               continue;
            }
         } // END while (!exitWhenFinished)
         
         logger.exiting(_CLASS, "run()");
      }
   }
   
   /*
    * Internal class used for managing items that have to be cleaned up.
    */
   private static final class Tracker 
   extends PhantomReference<Object> 
   implements Cleanable {
      
      private Cleanable cleanableObj=null;
      
      /**
       * Constructor taking a {@code Cleanable} object, {@code Object}, and
       * {@code ReferenceQueue<T>} objects as parameters.
       * @param cleanableObject
       * @param referenceObject
       * @param queue
       */
      Tracker(final Cleanable cleanableObject, 
            Object referenceObject,
            final ReferenceQueue<? super Object> queue) {
         /* Invoke the super class constructor that takes an {@code Object} 
          * and {@code ReferenceQueu<T>} as parameters. */
         super(referenceObject,queue);
         setCleanable(cleanableObject);
      }
      
      /**
       * Initiate the cleaning process.
       */
      public boolean clean() {
         logger.entering(_CLASS, "clean()");
         boolean result=false;
         Cleanable cleanableObj=null;
         
         cleanableObj=getCleanable();
         if (cleanableObj != null) {
            result=cleanableObj.clean();
         } // END if (cleanableObj != null)
              
         logger.exiting(_CLASS, "clean()",result);
         return result;
      }
      
      //********** Accessor Methods
      public Cleanable getCleanable() {
         logger.entering(_CLASS, "getCleanable()");
         logger.exiting(_CLASS, "getCleanable()",this.cleanableObj);
         return this.cleanableObj;
      }
      
      public void setCleanable(Cleanable cleanableObject) {
         logger.entering(_CLASS, "setCleanable(Cleanable)",cleanableObject);
         this.cleanableObj=cleanableObject;
         logger.exiting(_CLASS, "setCleanable(Cleanable)");
      }
   }
}