package com.wildstartech.wfa.dao.ticketing;

import com.wildstartech.wfa.dao.UserContext;
import com.wildstartech.wfa.dao.WildDAO;
import com.wildstartech.wfa.ticketing.BasicTicket;

public interface BasicTicketDAO<T extends BasicTicket, 
                                W extends PersistentBasicTicket>
extends WildDAO<T, W> {
   public W findByRequestId(String requestId, UserContext ctx);
}