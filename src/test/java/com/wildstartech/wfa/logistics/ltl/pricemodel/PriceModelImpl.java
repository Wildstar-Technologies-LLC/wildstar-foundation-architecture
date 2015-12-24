package com.wildstartech.wfa.logistics.ltl.pricemodel;

import java.util.logging.Logger;

import com.wildstartech.wfa.logistics.ltl.Quote;
import com.wildstartech.wfa.logistics.ltl.pricemodels.PriceModel;

public abstract class PriceModelImpl implements PriceModel {
  private static final String _CLASS=PriceModelImpl.class.getName();
  private static final Logger logger=Logger.getLogger(_CLASS);
  
  private boolean defaultModel=false;
  private String label=null; 
  
  public PriceModelImpl() {
    logger.entering(_CLASS, "PriceModelImpl()");
    logger.exiting(_CLASS, "PriceModelImpl()");
  }
  @Override
  public boolean isDefault() {
    logger.entering(_CLASS, "isDefault()");
    logger.exiting(_CLASS, "isDefault()",this.defaultModel);
    return this.defaultModel;
  }

  @Override
  public void setDefault() {
    logger.entering(_CLASS, "setDefault()");
    if (!defaultModel) {
      this.defaultModel=true;
    } // END if (!defaultModel)
    logger.exiting(_CLASS, "setDefault()");    
  }

  @Override
  public String getLabel() {
    logger.entering(_CLASS, "getLabel()");
    logger.exiting(_CLASS, "getLabel()",this.label);
    return this.label;
  }

  @Override
  public void setLabel(String label) {
    logger.entering(_CLASS, "setLabel(String)",label);
    if (label != null) {
      this.label=label;
    } else {
      logger.warning("Specified label was null.");
      this.label="";
    } // END if (label != null)
    logger.exiting(_CLASS, "setLabel(String)");   
  }

  @Override
  public abstract String getType();

  @Override
  public abstract double calculateTotalCharges(Quote quote);
}
