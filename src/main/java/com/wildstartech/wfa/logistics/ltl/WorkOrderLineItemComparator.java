package com.wildstartech.wfa.logistics.ltl;

import java.util.logging.Logger;

public class WorkOrderLineItemComparator
      extends EditableCommodityLineItemComparator<WorkOrderLineItem> {
   /** Used in object serialization. */
   private static final long serialVersionUID = -1459335825357159000L;
   private static final String _CLASS=
         WorkOrderLineItemComparator.class.getName();
   private static final Logger logger=Logger.getLogger(_CLASS);
   
   public int compare(WorkOrderLineItem lineItem1, WorkOrderLineItem lineItem2){
      logger.entering(_CLASS,"compare(WorkOrderLineItem,WorkOrderLineItem",
            new Object[] {lineItem1, lineItem2});
      int result=0;
      
      result=super.compare(lineItem1, lineItem2);
      if (result != 0) {
         return result;         
      } // END if (result != 0)
      // price
      result=Float.compare(lineItem1.getPrice(), lineItem2.getPrice());
      if (result != 0) {
         return result;         
      } // END if (result != 0)
      // totalPrice      
      result=Float.compare(
            lineItem1.getTotalPrice(), 
            lineItem2.getTotalPrice());
      if (result != 0) {
         return result;         
      } // END if (result != 0)
      
      logger.entering(_CLASS,"compare(WorkOrderLineItem,WorkOrderLineItem",
            result);
      return result;
   }
}
