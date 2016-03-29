package com.wildstartech.wfa.dao.ticketing;

import java.util.Date;
import java.util.List;

import com.wildstartech.wfa.dao.DAOException;
import com.wildstartech.wfa.dao.UserContext;
import com.wildstartech.wfa.dao.WildDAO;
import com.wildstartech.wfa.ticketing.BasicTicket;

public interface BasicTicketDAO<T extends BasicTicket, 
                                W extends PersistentBasicTicket<?>>
extends WildDAO<T, W> {
   /**
    * Find a list of work orders that can be acted upon.
    * @param ctx
    * @return
    * @throws DAOException
    */
   public List<W> findActionable(UserContext ctx)
         throws DAOException;
   
   /**
    * Return a list of open WorkOrders.
    */
   public List<W> findAllOpen(UserContext ctx)
   throws DAOException;
   
   public W findByRequestId(String requestId, UserContext ctx);
   
   public List<W> findByStatusState(
         String statusState, 
         String statusReason, 
         Date minDate, 
         UserContext ctx);
}