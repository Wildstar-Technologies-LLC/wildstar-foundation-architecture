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
import java.util.logging.Logger;

public class InputStreamWrapper extends InputStream {
   private static final String _CLASS=InputStreamWrapper.class.getName();
   private static final Logger logger=Logger.getLogger(_CLASS);
   
   private InputStream inputStream=null;
   
   public InputStreamWrapper(InputStream inputStream) {
      logger.entering(_CLASS, "InputStreamWrapper(InputStream)",inputStream);
      this.inputStream=inputStream;
      logger.exiting(_CLASS, "InputStreamWrapper(InputStream)");
   }
   
   /**
    * Returns an estimate of the number of bytes that can be read (or skipped 
    * over) from this input stream without blocking by the next invocation of a
    * method for this input stream.
    * <p>Note that while some implementations of {@code InputStream} will return
    * the total number of bytes in the stream, many will not. It is never 
    * correct to use the return value of this method to allocate a buffer 
    * intended to hold all data in this stream.</p>
    * <p>A subclass' implementation of this method may choose to throw an 
    * {@code IOException} if this input stream has been closed by invoking the 
    * {@code close()} method.</p>
    * <p>The {@code available} method for class {@code InputStream} always 
    * returns 0.</p>
    * <p>This method should be overridden by subclasses.</p>
    * @return an estimate of the number of bytes that can be read (or skipped 
    * over) from this input stream without blocking or 0 when it reaches the 
    * end of the input stream.
    * @throws {@code IOException} if an I/O error occurs.
    */
   public int available() throws IOException {
      logger.entering(_CLASS, "available()");
      int bytesAvailable=this.inputStream.available();
      logger.exiting(_CLASS, "available()",bytesAvailable);
      return bytesAvailable;
   }
   
   /**
    * Closes this input stream and releases any system resources associated with
    * the stream.
    * <p>The close method of InputStream does nothing.</p>
    * @throws {@code IOException} if an I/O error occurs.
    */
   public void close() throws IOException {
      logger.entering(_CLASS, "close()");
      
      this.inputStream.close();
      
      logger.exiting(_CLASS, "close()");
   }
   
   /**
    * Marks the current position in this input stream. A subsequent call to the
    * reset method repositions this stream at the last marked position so that
    * subsequent reads re-read the same bytes.
    * <p>The {@code readlimit} arguments tells this input stream to allow that
    * many bytes to be read before the mark position gets invalidated.</p>
    * <p>The general contract of {@code mark} is that, if the method 
    * {@code markSupported} returns {@code true}, the stream somehow remembers 
    * all the bytes read after the call to mark and stands ready to supply those
    * same bytes again if and whenever the method reset is called. However, the
    * stream is not required to remember any data at all if more than 
    * {@code readlimit} bytes are read from the stream before reset is 
    * called.</p>
    * <p>Marking a closed stream should not have any effect on the stream.</p>
    * <p>The {@code mark} method of InputStream does nothing.</p>
    * @param readlimit the maximum limit of bytes that can be read before the 
    * mark position becomes invalid.
    * @see {@code reset()}
    */
   public void mark(int readLimit) {
      logger.entering(_CLASS, "mark(int)",readLimit);
      this.inputStream.mark(readLimit);
      logger.exiting(_CLASS,"mark(int)");
   }
   
   /**
    * Tests if this input stream supports the mark and reset methods.
    * <p>Tests if this input stream supports the mark and reset methods. 
    * Whether or not mark and reset are supported is an invariant property of 
    * a particular input stream instance. The {@code markSupported} method of 
    * {@code InputStream} returns false.</p>
    * @return {@code true} if this stream instance supports the {@code mark} and
    * {@code reset} methods; {@code false} otherwise.
    * @see {@code mark(int)}, {@code reset}
    */
   public boolean markSupported() {
      logger.entering(_CLASS, "markSupported()");
      boolean result=false;
      result=this.inputStream.markSupported();
      logger.exiting(_CLASS, "markSupported()",result);
      return result;
   }
   
   /**
    * Reads the next byte of data from the input stream.
    * <p>Reads the next byte of data from the input stream. The value byte is 
    * returned as an int in the range 0 to 255. If no byte is available because
    * the end of the stream has been reached, the value -1 is returned. This
    * method blocks until input data is available, the end of the stream is
    * detected, or an exception is thrown.</p>
    * <p>A subclass must provide an implementation of this method.</p>
    * @return the next byte of data, or {@code -1} if the end of the stream is
    * reached.
    * @throws {@code IOException} - if an I/O error occurs.
    */
   public int read() throws IOException {
      logger.entering(_CLASS, "read()");
      int byteRead=-1;
      byteRead=this.inputStream.read();
      logger.exiting(_CLASS, "read()", byteRead);
      return byteRead;
   }
   
   /**
    * Reads some number of bytes from the input stream and stores them into the 
    * buffer array b.
    * <p>Reads some number of bytes from the input stream and stores them into 
    * the buffer array b. The number of bytes actually read is returned as an 
    * integer. This method blocks until input data is available, end of file is
    * detected, or an exception is thrown.</p>
    * <p>If the length of {@code b} is zero, then no bytes are read and 0 is 
    * returned; otherwise, there is an attempt to read at least one byte. If no
    * byte is available because the stream is at the end of the file, the value 
    * {@code -1} is returned; otherwise, at least one byte is read and stored 
    * into {@code b}.</p>
    * <p>The first byte read is stored into element {@code b[0]}, the next one
    * into {@code b[1]}, and so on. The number of bytes read is, at most, equal
    * to the length of {@code b}. Let k be the number of bytes actually read; 
    * these bytes will be stored in elements {@code b[0]} through 
    * {@code b[k-1]}, leaving elements {@code b[k]} through 
    * {@code b[b.length-1]} unaffected.</p>
    * <p>The {@code read(b)} method for class {@code InputStream} has the same 
    * effect as:<p>
    * <p>{@code read(b, 0, b.length)}</p>
    * @param b the buffer into which the data is read.
    * @return the total number of bytes read into the buffer, or {@code -1} if
    * there is no more data because the end of the stream has been reached.
    * @throws  {@code IOException} - If the first byte cannot be 
    * read for any reason other than the end of the file, if the input stream 
    * has been closed, or if some other I/O error occurs.
    * @throws {@code NullPointerException} - if b is null.
    * @see {@code read(byte[], int, int)}
    */
   public int read(byte[] bytes) throws IOException {
      logger.entering(_CLASS, "read(byte[]",bytes);
      int bytesRead=-1;
      bytesRead=this.inputStream.read(bytes);
      logger.exiting(_CLASS, "read(byte[]",bytesRead);
      return bytesRead;
   }
   
   /**
    * Reads up to {@code len} bytes of data from the input stream into an array 
    * of bytes.
    * <p>If the length of {@code b} is zero, then no bytes are read and 0 is 
    * returned; otherwise, there is an attempt to read at least one byte. If no
    * byte is available because the stream is at the end of the file, the value 
    * {@code -1} is returned; otherwise, at least one byte is read and stored 
    * into {@code b}.</p>
    * <p>The first byte read is stored into element {@code b[0]}, the next one
    * into {@code b[1]}, and so on. The number of bytes read is, at most, equal
    * to the length of {@code b}. Let k be the number of bytes actually read; 
    * these bytes will be stored in elements {@code b[0]} through 
    * {@code b[k-1]}, leaving elements {@code b[k]} through 
    * {@code b[b.length-1]} unaffected.</p>
    * <p>The {@code read(b, off, len)} method for class {@code InputStream} 
    * simply calls the method {@code read()} repeatedly. If the first such call
    * results in an IOException, that exception is returned from the call to the
    * {@code read(b, off, len)} method. If any subsequent call to {@code read()}
    * results in a {@code IOException}, the exception is caught and treated as
    * if it were end of file; the bytes read up to that point are stored into 
    * {@code b} and the number of bytes read before the exception occurred is
    * returned. The default implementation of this method blocks until the 
    * requested amount of input data {@code len} has been read, end of file is 
    * detected, or an exception is thrown. Subclasses are encouraged to provide
    * a more efficient implementation of this method.</p>
    */
   public int read(byte[] b, int off, int len) throws IOException {
      logger.entering(_CLASS, "read(byte[],int, int)", new Object[] 
            {b, off, len});
      int bytesRead=-1;
      bytesRead=this.inputStream.read(b,off,len);
      logger.entering(_CLASS, "read(byte[],int, int)",bytesRead);
      return bytesRead;
   }
   
   /**
    * Repositions this stream to the position at the time the mark method was 
    * last called on this input stream.
    * <p>The general contract of reset is:</p>
    * <ul>
    * <li>If the method markSupported returns true, then:
    * <ul>
    * <li>If the method mark has not been called since the stream was created, 
    * or the number of bytes read from the stream since mark was last called is 
    * larger than the argument to mark at that last call, then an 
    * {@code IOException} might be thrown.</li>
    * <li>If such an {@code IOException} is not thrown, then the stream is 
    * reset to a state such that all the bytes read since the most recent call
    * to mark (or since the start of the file, if mark has not been called) will
    * be resupplied to subsequent callers of the read method, followed by any
    * bytes that otherwise would have been the next input data as of the time of
    * the call to reset.</li>
    * </ul></li>
    * <li>If the method markSupported returns false, then:
    * <ul><li>The call to reset may throw an {@code IOException}.</li>
    * <li>If an {@code IOException} is not thrown, then the stream is reset to 
    * a fixed state that depends on the particular type of the input stream and
    * how it was created. The bytes that will be supplied to subsequent callers
    * of the read method depend on the particular type of the input stream.</li>
    * </ul></li>
    * </ul>
    * <p>The method reset for class {@code InputStream} does nothing except  
    * throw an {@code IOException}.</p>
    * @throws  {@code IOException} - if this stream has not been marked or if 
    * the mark has been invalidated.
    * @see {@code mark(int)}, {@code IOException}
    */
   public void reset() throws IOException {
      logger.entering(_CLASS, "reset()");
      this.inputStream.reset();
      logger.exiting(_CLASS, "reset()");
   }
   
   /**
    * Skips over and discards n bytes of data from this input stream.
    * <p>Skips over and discards n bytes of data from this input stream. The 
    * skip method may, for a variety of reasons, end up skipping over some 
    * smaller number of bytes, possibly 0. This may result from any of a 
    * number of conditions; reaching end of file before n bytes have been 
    * skipped is only one possibility. The actual number of bytes skipped 
    * is returned. If n is negative, no bytes are skipped.</p>
    * <p>The skip method of this class creates a byte array and then repeatedly
    * reads into it until n bytes have been read or the end of the stream has 
    * been reached. Subclasses are encouraged to provide a more efficient
    * implementation of this method. For instance, the implementation may
    * depend on the ability to seek.</p>
    * @param n - the number of bytes to be skipped.
    * @return the actual number of bytes skipped.
    * @throws {@code IOException} - if the stream does not support seek, or if
    * some other I/O error occurs.
    */
   public long skip(long n) throws IOException {
      logger.entering(_CLASS, "skip(long)",n);
      long bytesSkipped=-1;
      bytesSkipped=this.inputStream.skip(n);
      logger.exiting(_CLASS, "skip(long)",bytesSkipped);
      return bytesSkipped;
   }
}