package com.wildstartech.wfa;
import java.util.EventListener;

public interface OutputStreamEventListener extends EventListener {
	public void onClose();
	
	public void onFlush();
}