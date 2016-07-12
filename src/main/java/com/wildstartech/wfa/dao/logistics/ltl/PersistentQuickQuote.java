package com.wildstartech.wfa.dao.logistics.ltl;

import com.wildstartech.wfa.dao.ticketing.PersistentBasicTicket;
import com.wildstartech.wfa.logistics.ltl.QuickQuote;

public interface PersistentQuickQuote 
extends QuickQuote, PersistentBasicTicket<QuickQuote> {
	  public void updateFromObject(QuickQuote quote);
}