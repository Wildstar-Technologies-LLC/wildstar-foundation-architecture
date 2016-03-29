package com.wildstartech.wfa.dao.finance;

import com.wildstartech.wfa.dao.WildDAOFactory;
import com.wildstartech.wfa.finance.PaymentCard;

public class PaymentCardDAOFactory<
   T extends PaymentCard, 
   W extends PersistentPaymentCard<?>>
extends WildDAOFactory<PaymentCardDAO<T,W>, T, W> {
}