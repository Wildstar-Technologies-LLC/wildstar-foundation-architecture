package com.wildstartech.wfa.dao.logistics.ltl.quote;

import com.wildstartech.wfa.dao.ticketing.PersistentBasicTicket;
import com.wildstartech.wfa.logistics.ltl.quote.QuickQuote;

public interface PersistentQuickQuote 
extends QuickQuote, PersistentBasicTicket<QuickQuote> {
	  public void updateFromObject(QuickQuote quote);
}