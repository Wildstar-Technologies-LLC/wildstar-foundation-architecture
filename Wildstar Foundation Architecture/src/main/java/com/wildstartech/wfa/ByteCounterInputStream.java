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

import java.io.IOException;
import java.io.InputStream;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ByteCounterInputStream extends InputStream {
	private static final String _CLASS=ByteCounterInputStream.class.getName();
    private static Logger logger=Logger.getLogger(_CLASS);
    private static NumberFormat numFmt = NumberFormat.getInstance();

    static {
        /* Indicate that the NumberFormat instance should "group" together the
        numbers being printed. */
        numFmt.setGroupingUsed(true);
    }
    private InputStream in;
    private long bytesRead;
    /**
     * Default constructor taking an InputStream as a paratmer.
     */
    public ByteCounterInputStream(InputStream in) {
        if (logger.isLoggable(Level.FINEST)) {
        	logger.entering(_CLASS,"ByteCounterInputStream(InputStream)");
        } // END if (logger.isLoggable(Level.FINEST))
        this.in = in;
        if (logger.isLoggable(Level.FINEST)) {
        	logger.exiting(_CLASS,"ByteCounterInputStream(InputStream)");
        } // END if (logger.isLoggable(Level.FINEST))
        
    }
    /**
     * Returns a count listing the total number of bytes read.
     */
    public long bytesRead() {
        if (logger.isLoggable(Level.FINEST)) {
            logger.entering(_CLASS,"bytesRead()");
            logger.finest("Number of Bytes Read=" +
            		numFmt.format(this.bytesRead));
            logger.exiting(_CLASS,"bytesRead()");
        } // END if (logger.isLoggable(Level.FINEST))
        return this.bytesRead;
    }
    /**
     * Returns the number of bytes that can be read from this input stream 
     * without blocking.
     * 
     * This method simply performs in.available() and returns the result. 
     * 
     * @return int the number of bytes that can be read from the input stream 
     * without blocking.
     * @throws java.io.IOException Thrown if an I/O error occurs.
     */
    public int available() throws IOException {
        logger.entering(_CLASS,"available()");
        int availableBytes = 0;

        try {
            availableBytes = this.in.available();
        } catch (IOException ex) {
            logger.log(Level.SEVERE,
            		"IOException thrown during call to available().", ex);
            throw ex;
        } // END try/catch
        if (logger.isLoggable(Level.FINEST)) {
            logger.exiting(_CLASS,"available()",availableBytes);
        } // END if (logger.isLoggable(Level.FINEST)) 
        return availableBytes;
    }

    /**
     * Closes this input stream and releases any system resources associated 
     * with the stream. This method simply performs in.close().
     * 
     * @throws java.io.IOException Thrown if an I/O error occurs.
     */
    public void close() throws IOException {
        if (logger.isLoggable(Level.FINEST)) {
            logger.entering(_CLASS,"close()");            
        } // END if (logger.isLoggable(Level.FINEST)) 
        try {
            this.in.close();
        } catch (IOException ex) {
            logger.log(Level.SEVERE,
            		"IOException thrown during call to close().", ex);
            throw ex;
        } // END try/catch
        if (logger.isLoggable(Level.FINEST)) {
            logger.exiting(_CLASS,"close()");            
        } // END if (logger.isLoggable(Level.FINEST))         
    }

    /**
     * Marks the current position in this input stream. A subsequent call to the
     * reset method repositions this stream at the last marked position so that
     * subsequent reads re-read the same bytes.
     * 
     * The <pre>readlimit</pre> argument tells this input stream to allow that
     * many bytes to be read before the mark position gets invalidated.
     * 
     * This method simply performs <pre>in.mark(readlimit)</pre>. 
     * 
     * @param int readLimit the maximum limit of bytes that can be read before
     * the mark position becomes invalid.
     */
    public void mark(int readLimit) {
        if (logger.isLoggable(Level.FINEST)) {
            logger.entering(_CLASS,"mark(int)", readLimit);            
        } // END if (logger.isLoggable(Level.FINEST))
        this.in.mark(readLimit);
        if (logger.isLoggable(Level.FINEST)) {
            logger.exiting(_CLASS,"mark(int)");            
        } // END if (logger.isLoggable(Level.FINEST))
    }

    /**
     * Tests if this input stream supports the mark and reset methods. This
     * method simply performs <pre>in.markSupported()</pre>.
     * 
     * @return boolean <pre>true</pre> if this stream type supports the mark and
     * reset method; <pre>false</pre> otherwise.
     */
    public boolean markSupported() {
        logger.entering(_CLASS,"markSupported()");
        boolean isMarkSupported = false;

        isMarkSupported = this.in.markSupported();
        if (logger.isLoggable(Level.FINEST)) {
            logger.exiting(_CLASS,"markSupported()",isMarkSupported);
        } // END if (logger.isLoggable(Level.FINEST))
        return isMarkSupported;
    }

    /**
     * Repositions this stream to the position at the time the mark method was
     * last called on this input stream.
     * 
     * This method simply performs <pre>in.reset()</pre>.
     * 
     * Stream marks are intended to be used in situations where you need to read
     * ahead a little to see what's in the stream. Often this is most easily
     * done by invoking some general parser. If the stream is of the type
     * handled by the parse, it just chugs along happily. If the stream is not
     * of that type, the parser should toss an exception when it fails. If this
     * happens within readlimit bytes, it allows the outer code to reset the
     * stream and try another parser. 
     * 
     * @throws java.io.IOException if the stream has not been marked or if the
     * mark has been invalidated.
     */
    public void reset() throws IOException {
    	if (logger.isLoggable(Level.FINEST)) {
        	logger.entering(_CLASS,"reset()");
        } // END if (logger.isLoggable(Level.FINEST))
        try {
            this.in.reset();
        } catch (IOException ex) {
            logger.log(Level.SEVERE,
            		"IOException thrown during call to reset().", ex);
        } // END try/catch
        if (logger.isLoggable(Level.FINEST)) {
        	logger.exiting(_CLASS,"reset()");
        } // END if (logger.isLoggable(Level.FINEST))
    }

    /**
     * Reads the next byte of data from this input stream. The value byte is
     * returned as an <pre>int</pre> in the range <pre>0</pre> to 
     * <pre>255</pre>. If no byte is available because the end of the stream has
     * been reached, the value <pre>-1</pre> is returned.  This method blocks 
     * until input data is available, the end of the stream is detected, or an
     * exception is thrown.
     * 
     * This method simply performs <pre>in.read()</pre> and returns the result.
     */
    public int read() throws IOException {
        if (logger.isLoggable(Level.FINEST)) {
        	logger.entering(_CLASS,"read()");
        } // END if (logger.isLoggable(Level.FINEST))
        int intRead = 0;
        
        // Read a byte from the input stream
        intRead = this.in.read();
        // Increment the counter for the total number of bytes read.
        this.bytesRead++;

        if (logger.isLoggable(Level.FINEST)) {
            logger.finest("Integer Read=" + intRead);
            logger.finest("Total Bytes Read=" + numFmt.format(this.bytesRead));
            logger.exiting(_CLASS,"read()");
        } // END if (logger.isLoggable(Level.FINEST)) 
        return in.read();
    }

    /**
     * Reads up to byte.length bytes of data from this input stream into an
     * array of bytes. This method blocks until some input is available.
     * 
     * This method simply performs the call <pre>read(b, 0, b.length)</pre> and
     * returns the result. It is important that it does not do 
     * <pre>in.read(b)</pre> instead; certain subclasses of 
     * <pre>FilterInputStream</pre> depend on the implementation strategy
     * actually used.
     * 
     * @param byte[] buffer The buffer into which data is read.
     * 
     * @return int The total number of bytes read into the buffer, or 
     * <pre>-1</pre> if there is no more data because the end of the stream 
     * has been reached.
     * 
     * @throws java.io.IOException Thrown if an I/O error occurs.
     */
    public int read(byte[] buffer) throws IOException {
        if (logger.isLoggable(Level.FINEST)) {
            logger.entering(_CLASS,"read(byte[])",buffer);            
        } // END if (logger.isLoggable(Level.FINEST))
        int localBytesRead = -1;
        try {
            localBytesRead = read(buffer, 0, buffer.length);
        } catch (IOException ex) {
            logger.log(Level.SEVERE,
            		"IOException thrown during call to read(byte[]).", ex);
            throw ex;
        } // END try/catch
        if (logger.isLoggable(Level.FINEST)) {
            logger.finest("Number of Bytes Read=" + 
            		numFmt.format(localBytesRead));
            logger.exiting(_CLASS,"read(byte[])");
        } // END if (logger.isLoggable(Level.FINEST)) 
        return localBytesRead;
    }

    /**
     * Reads up to <pre>length</pre> bytes of data from this input stream into
     * an array of bytes. This method blocks until some input is available.
     * 
     * This method simply performs in.read(b, off, len) and returns the result.
     * 
     * @param byte[] buffer The buffer into which the data is read.
     * @param int offset The start offset of the data.
     * @param int length The maximum number of bytes read.
     * 
     * @return int The total number of bytes read into the buffer, or 
     * <pre>-1</pre> if there is no more data because the end of the stream has
     * been reached.
     * 
     * @throws IOException 
     */
    public int read(byte[] buffer, int offset, int length) throws IOException {
        logger.entering(_CLASS,"read(byte[],int,int)");
        int localBytesRead = -1;

        try {
            localBytesRead = this.in.read(buffer, offset, length);
            this.bytesRead += localBytesRead;
        } catch (IOException ex) {
            logger.log(Level.SEVERE,
            	"IOException thrown during call to read(byte[],int,int).", ex);
        } // END try/catch
        if (logger.isLoggable(Level.FINEST)) {
            logger.finest("Total Bytes Read=" + localBytesRead);            
            logger.exiting(_CLASS,"read(byte[],int,int)");
        } // END if (logger.isLoggable(Level.FINEST)) 
        return localBytesRead;
    }

    /**
     * Skips over and discards <pre>numBytes</pre> bytes of data from the input
     * stream. The <pre>skip</pre> method may, for a variety of reasons, end up 
     * skipping over some smaller number of bytes, possibly <pre>0</pre>. The 
     * actual number of bytes skipped is returned.
     * 
     * This method simply performs <pre>in.skip()</pre>.
     * 
     * @param long numBytes The number of bytes to be skipped.
     * @return long The actual number of bytes skipped.
     * @throws IOException Thrown if an I/O error occurs.
     */
    public long skip(long numBytes) throws IOException {
        if (logger.isLoggable(Level.FINEST)) {
        	logger.entering(_CLASS,"skip(long)", numBytes);
        } // END if (logger.isLoggable(Level.FINEST))
        long actualBytesSkipped = 0;

        actualBytesSkipped = this.in.skip(numBytes);
        if (logger.isLoggable(Level.FINEST)) {
            logger.finest("Actual Bytes Skipped=" +
                    numFmt.format(actualBytesSkipped));
            logger.exiting(_CLASS,"skip(long)");
        } // END if (logger.isLoggable(Level.FINEST))
        return actualBytesSkipped;
    }
}
