package com.wildstartech.wfa.dao.logistics.ltl.quote;

import com.wildstartech.wfa.logistics.ltl.quote.SimpleQuote;

public interface PersistentSimpleQuote 
extends SimpleQuote, PersistentQuickQuote {
	public void updateFromObject(SimpleQuote quote);
}