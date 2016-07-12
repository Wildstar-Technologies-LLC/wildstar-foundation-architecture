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