package com.wildstartech.wfa.dao.finance;

import com.wildstartech.wfa.dao.WildDAOFactory;
import com.wildstartech.wfa.finance.PaymentType;

public class PaymentTypeDAOFactory 
extends WildDAOFactory<
   PaymentTypeDAO<PaymentType,PersistentPaymentType<?>>, 
   PaymentType, 
   PersistentPaymentType<?>> {
}