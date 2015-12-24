package com.wildstartech.wfa.dao.ticketing;

import com.wildstartech.wfa.dao.WildDAO;
import com.wildstartech.wfa.ticketing.AdvancedTicket;

public interface AdvancedTicketDAO<T extends AdvancedTicket,
                                   W extends PersistentAdvancedTicket> 
extends WildDAO<T,W> {

}