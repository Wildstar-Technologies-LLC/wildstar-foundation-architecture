package com.wildstartech.wfa.dao.finance;

import com.wildstartech.wfa.dao.WildDAO;
import com.wildstartech.wfa.finance.PaymentType;

public interface PaymentTypeDAO<
   T extends PaymentType, 
   W extends PersistentPaymentType<?>>
extends WildDAO<T,W> {
}