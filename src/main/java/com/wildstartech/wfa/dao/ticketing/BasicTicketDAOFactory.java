package com.wildstartech.wfa.dao.ticketing;

import com.wildstartech.wfa.dao.WildDAOFactory;
import com.wildstartech.wfa.ticketing.BasicTicket;

public class BasicTicketDAOFactory extends
      WildDAOFactory<BasicTicketDAO<BasicTicket, PersistentBasicTicket>, 
                     BasicTicket, 
                     PersistentBasicTicket> {
}