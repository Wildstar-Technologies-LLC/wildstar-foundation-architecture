package com.wildstartech.wfa.dao.logistics.ltl.pricemodels;

import java.util.List;

import com.wildstartech.wfa.dao.WildDAO;
import com.wildstartech.wfa.logistics.ltl.pricemodels.PriceModel;

public interface PriceModelDAO extends
    WildDAO<PriceModel, PersistentPriceModel> {
  public List<PersistentPriceModel> findByLabel();
  public PersistentPriceModel findDefault();
}