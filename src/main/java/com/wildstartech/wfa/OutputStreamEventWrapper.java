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
package com.wildstartech.wfa;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Logger;

public class OutputStreamEventWrapper extends OutputStream {
	private static final String _CLASS=OutputStreamEventWrapper.class.getName();
	private static final Logger logger=Logger.getLogger(_CLASS);
	
	private OutputStream out=null;
	
	/**
	 * Default, no-argument constructor.
	 */
	public OutputStreamEventWrapper() {
		logger.entering(_CLASS, "OutputStreamEventWrapper()");		
		logger.exiting(_CLASS, "OutputStreamEventWrapper()");
	}
	
	/**
	 * Default, no-argument constructor.
	 */
	public OutputStreamEventWrapper(OutputStream out) {
		logger.entering(_CLASS, "OutputStreamEventWrapper(OutputStream)",out);
		this.out=out;
		logger.exiting(_CLASS, "OutputStreamEventWrapper(OutputStream)");
	}
	

	@Override
	public void write(int _byte) throws IOException {
		logger.entering(_CLASS, "write(int)",_byte);
		this.out.write(_byte);
		logger.exiting(_CLASS, "write(int)");
	}

	@Override
	public void write(byte[] bytes) throws IOException {
		logger.entering(_CLASS, "write(byte[]",bytes);
		this.out.write(bytes);
		logger.exiting(_CLASS, "write(byte[]");
	}

	@Override
	public void write(byte[] _byte, int offset, int length) throws IOException {
		logger.entering(_CLASS, "write(byte[],int,int)",
				new Object[] {_byte,offset,length});
		this.out.write(_byte, offset, length);
		logger.exiting(_CLASS, "write(byte[],int,int)");
	}

	@Override
	public void flush() throws IOException {
		logger.entering(_CLASS, "flush()");
		this.out.flush();
		logger.entering(_CLASS, "flush()");
	}

	@Override
	public void close() throws IOException {
		logger.entering(_CLASS, "close()");
		this.out.close();
		logger.entering(_CLASS, "close()");
	}
}