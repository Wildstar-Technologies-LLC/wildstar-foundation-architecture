package com.wildstartech.wfa.dao.finance;

import com.wildstartech.wfa.dao.finance.PersistentPaymentCard;
import com.wildstartech.wfa.finance.PaymentCard;

public interface PaymentCardDAO<
   T extends PaymentCard,
   W extends PersistentPaymentCard<?>> 
extends PaymentTypeDAO<T,W> {   
}