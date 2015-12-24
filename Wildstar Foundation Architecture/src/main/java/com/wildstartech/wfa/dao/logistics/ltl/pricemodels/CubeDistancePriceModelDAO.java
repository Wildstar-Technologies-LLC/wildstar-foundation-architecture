package com.wildstartech.wfa.dao.logistics.ltl.pricemodels;

import java.util.List;

import com.wildstartech.wfa.dao.WildDAO;
import com.wildstartech.wfa.logistics.ltl.pricemodels.CubeDistancePriceModel;

public interface CubeDistancePriceModelDAO 
extends WildDAO<CubeDistancePriceModel, PersistentCubeDistancePriceModel> {
  /**
   * Returns a list of <code>PriceModel</code> objects with the specified label.
   * 
   * @param label
   * @return
   */
  public List<CubeDistancePriceModel> findByLabel(String label);
}