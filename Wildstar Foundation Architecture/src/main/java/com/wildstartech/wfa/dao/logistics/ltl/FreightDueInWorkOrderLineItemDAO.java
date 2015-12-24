package com.wildstartech.wfa.dao.logistics.ltl;

import java.util.List;

import com.wildstartech.wfa.dao.UserContext;
import com.wildstartech.wfa.dao.WildDAO;
import com.wildstartech.wfa.logistics.ltl.FreightDueInWorkOrderLineItem;

public interface FreightDueInWorkOrderLineItemDAO 
extends WildDAO<FreightDueInWorkOrderLineItem, 
                PersistentFreightDueInWorkOrderLineItem> {

   /**
    * Returns a list of items belonging to the specified work order.
    * @param id The unique identifier of the work order that should be used
    * when looking for associated line items.
    * @param ctx The UserContext that should be used when performing the search
    * for the requested line items.
    * @return
    */
   List<PersistentFreightDueInWorkOrderLineItem> findByWorkOrderId(
         String id, UserContext ctx);
}