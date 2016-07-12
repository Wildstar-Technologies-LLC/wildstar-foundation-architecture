package com.wildstartech.wfa.dao.logistics.ltl;

import com.wildstartech.wfa.logistics.ltl.SimpleQuote;

public interface PersistentSimpleQuote 
extends SimpleQuote, PersistentQuickQuote {
	public void updateFromObject(SimpleQuote quote);
}