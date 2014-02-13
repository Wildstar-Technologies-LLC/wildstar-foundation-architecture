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
package com.wildstartech.wfa;

import java.io.IOException;
import java.io.OutputStream;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Provides a means to track/count the number of bytes that were actually
 * written to an OutputStream.
 */
public class ByteCounterOutputStream extends OutputStream {
	private static String _CLASS=ByteCounterOutputStream.class.getName();
    private static Logger logger = Logger.getLogger(_CLASS);
    private static NumberFormat numFmt = NumberFormat.getInstance();

    static {
        /* Indicate that the NumberFormat instance should "group" together the
        numbers being printed. */
        numFmt.setGroupingUsed(true);
    }
    private OutputStream out = null;
    /* Tracks the number of bytes written to the OutputStream. */
    private int bytesWritten = 0;
    public ByteCounterOutputStream(OutputStream out) {
    	if (logger.isLoggable(Level.FINEST)) {
    		logger.entering(_CLASS,"ByteCounterOutputStream(OutputStream)");
    	} // END if (logger.isLoggable(Level.FINEST))
        this.out = out;
        if (logger.isLoggable(Level.FINEST)) {
    		logger.exiting(_CLASS,"ByteCounterOutputStream(OutputStream)");
    	} // END if (logger.isLoggable(Level.FINEST))
        
    }
    /**
     * Returns a count of the total number of bytes written to the OutputStream.
     * 
     * @return int The total count of the number of bytes written.
     */
    public int getBytesWritten() {
        if (logger.isLoggable(Level.FINEST)) {
    		logger.entering(_CLASS,"getBytesWritten()");
    		logger.exiting(_CLASS,"getBytesWritten()",this.bytesWritten);
    	} // END if (logger.isLoggable(Level.FINEST))
        return this.bytesWritten;
    }
    /**
     * Closes this output stream and releases any system resources associated 
     * with this stream. The general contract of close is that it closes the 
     * output stream. A closed stream cannot perform output operations and 
     * cannot be reopened.
     * 
     * @throws java.io.IOException Thrown if an I/O error occurs.
     */
    public void close() {
        if (logger.isLoggable(Level.FINEST)) {
    		logger.entering(_CLASS,"close()");
    	} // END if (logger.isLoggable(Level.FINEST))
        try {
            this.out.close();
        } catch (IOException ex) {
            logger.log(Level.SEVERE, 
            		"An IOException was thrown during a call to close().", ex);
        } // END try/catch
        if (logger.isLoggable(Level.FINEST)) {
    		logger.exiting(_CLASS,"close()");
    	} // END if (logger.isLoggable(Level.FINEST))        
    }

    /**
     * Flushes this output stream and forces any buffered output bytes to be
     * written out. The general contract of flush is that calling it is an
     * indication that, if any bytes previously written have been buffered by
     * the implementation of the output stream, such bytes should immediately
     * be written to their intended destination.
     * 
     * If the intended destination of this stream is an abstraction provided by
     * the underlying operating system, for example a file, then flushing the
     * stream guarantees only that bytes previously written to the stream are
     * passed to the operating system for writing; it does not guarantee that
     * they are actually written to a physical device such as a disk drive.
     * 
     * The <pre>flush</pre> method of <pre>OutputStream</pre> does nothing.
     * 
     * @throws java.io.IOException Thrown if an I/O error occurs.
     */
    public void flush() {
        if (logger.isLoggable(Level.FINEST)) {
    		logger.entering(_CLASS,"flush()");
    	} // END if (logger.isLoggable(Level.FINEST))
        try {
            this.out.flush();
        } catch (IOException ex) {
            logger.log(Level.SEVERE,
            		"An IOException was thrown during a call to flush().", ex);
        } // END try/catch
        if (logger.isLoggable(Level.FINEST)) {
    		logger.exiting(_CLASS,"flush()");
    	} // END if (logger.isLoggable(Level.FINEST))
    }

    /**
     * Writes the specified byte to this output stream. The general contract for
     * <pre>write</pre> is that one byte is written to the output stream. The 
     * byte to be written is the eight low-order bits of the argument 
     * <pre>byteData</pre>. The 24 high-order bits of <pre>byteData</pre> are
     * ignored.
     * 
     * Subclasses of <pre>OutputStream</pre> must provide an implementation for
     * this method. 
     * 
     * @throws java.io.IOException Thrown if an I/O error occurs.
     */
    public void write(int byteData) throws IOException {
        if (logger.isLoggable(Level.FINEST)) {
    		logger.entering(_CLASS,"write(int)",byteData);
    	} // END if (logger.isLoggable(Level.FINEST))
        try {
            this.out.write(byteData);
            this.bytesWritten++;
        } catch (IOException ex) {
            logger.log(Level.SEVERE,
               "An IOException was thrown during a call to write(int).", ex);
        }
        if (logger.isLoggable(Level.FINEST)) {
    		logger.exiting(_CLASS,"write(int)");
    	} // END if (logger.isLoggable(Level.FINEST))
    }

    /**
     * Writes <pre>buffer.length</pre> bytes from the specified byte array to
     * this output stream. The general contract for <pre>write(buffer)</pre> is
     * that it should have exactly the same effect as the call 
     * <pre>write(buffer, 0, buffer.length)</pre>.
     * 
     * @param byte[] buffer The byte array containing data to be written.
     * @throws java.io.IOException Thrown if an I/O error occurs.
     */
    public void write(byte[] buffer) {
        if (logger.isLoggable(Level.FINEST)) {
    		logger.entering(_CLASS,"write(byte[])");
    	} // END if (logger.isLoggable(Level.FINEST))
        write(buffer, 0, buffer.length);
        if (logger.isLoggable(Level.FINEST)) {
    		logger.exiting(_CLASS,"write(byte[])");
    	} // END if (logger.isLoggable(Level.FINEST))
    }

    /**
     * Writes <pre>length</pre> bytes from the specified byte array starting at
     * <pre>offset</pre> off to this output stream. The general contract for 
     * <pre>write(buffer, off, len)</pre> is that some of the bytes in the array
     * <pre>buffer</pre> are written to the output stream in order; 
     * element <pre>buffer[offset]<pre> is the first byte written and 
     * <pre>buffer[offset+length-1]</pre> is the last byte written by this 
     * operation.
     * 
     * The write method of OutputStream calls the write method of one argument 
     * on each of the bytes to be written out. Subclasses are encouraged to 
     * override this method and provide a more efficient implementation.
     * 
     * If <pre>buffer</pre> is <pre>null</pre>, a 
     * <pre>NullPointerException</pre> is thrown.
     * 
     * If <pre>offset</pre> is negative, or <pre>length</pre> is negative, or 
     * <pre>offset+length</pre> is greater than the length of the array 
     * <pre>buffer</pre>, then an <pre>IndexOutOfBoundsException</pre> is 
     * thrown. 
     */
    public void write(byte[] buffer, int offset, int length) {
        if (logger.isLoggable(Level.FINEST)) {
    		logger.entering(_CLASS,"write(byte[],int,int)",
    				new Object[] {buffer,offset,length});
    	} // END if (logger.isLoggable(Level.FINEST))
                try {
            this.out.write(buffer, offset, length);
            this.bytesWritten += length;
        } catch (IndexOutOfBoundsException ex) {
            logger.log(Level.SEVERE,
            		"An IndexOutOfBoundsException was thrown.", ex);
        } catch (IOException ex) {
        	logger.log(Level.SEVERE,
            		"An IOException was thrown.", ex);
        } catch (NullPointerException ex) {
        	logger.log(Level.SEVERE,
            		"A NullPointerException was thrown.", ex);
            throw ex;
        } // END try/catch
        if (logger.isLoggable(Level.FINEST)) {
        	logger.log(Level.FINEST,"Actual Bytes Written=" + length);
            logger.log(Level.FINEST,"Total Bytes Written=" + this.bytesWritten);
            logger.exiting(_CLASS,"write(byte[],int,int)");
        } // END if (log.isTraceEnabled())
    }
}
