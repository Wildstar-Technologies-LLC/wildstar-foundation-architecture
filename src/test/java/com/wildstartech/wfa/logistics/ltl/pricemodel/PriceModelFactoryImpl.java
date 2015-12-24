package com.wildstartech.wfa.logistics.ltl.pricemodel;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.wildstartech.wfa.logistics.ltl.Quote;
import com.wildstartech.wfa.logistics.ltl.pricemodels.CubeDistancePriceModel;
import com.wildstartech.wfa.logistics.ltl.pricemodels.PriceModel;
import com.wildstartech.wfa.logistics.ltl.pricemodels.PriceModelFactory;

public class PriceModelFactoryImpl extends PriceModelFactory {
  private static final String _CLASS=PriceModelFactoryImpl.class.getName();
  private static final Logger logger=Logger.getLogger(_CLASS);
  
  private static final String MODEL_NAMES_CUBE_DISTANCE="Cube/Distance";
  private static final String MODEL_NAMES_CUBE_DISTANCE_DISCOUNT="Cube/Distance (15% Discount)";
  private final static List<String> names=new ArrayList<String>();
  static {
    names.add(MODEL_NAMES_CUBE_DISTANCE);
    names.add(MODEL_NAMES_CUBE_DISTANCE_DISCOUNT);
  }
  private final static List<String> types=new ArrayList<String>();
  static {
    types.add(CubeDistancePriceModel.TYPE);
  }
  @Override
  public PriceModel getDefaultModel() {
    logger.entering(_CLASS,"getDefaultModel()");
    PriceModel pm=new CubeDistancePriceModelImpl();
    logger.exiting(_CLASS,"getDefaultModel()",pm);
    return pm;
  }
  
  @Override
  public PriceModel getModel(Quote quote) {
    logger.entering(_CLASS,"getModel(Quote)",quote);
    PriceModel pm=getDefaultModel();
    logger.exiting(_CLASS,"getModel(Quote)",pm);
    return pm;
  }
  
  @Override
  public PriceModel getModelByLabel(String modelName) {
    logger.entering(_CLASS,"getNamedModel(String)",modelName);
    CubeDistancePriceModel cpm=null;
    PriceModel pm=null;
    
    if (modelName != null) {
      if (modelName.equalsIgnoreCase(MODEL_NAMES_CUBE_DISTANCE)) {
        pm=new CubeDistancePriceModelImpl();
      } else if (
          modelName.equalsIgnoreCase(MODEL_NAMES_CUBE_DISTANCE_DISCOUNT)
                ) {
        cpm=new CubeDistancePriceModelImpl();
        pm=cpm;
        cpm.setBaseCharge(cpm.getBaseCharge() * .85);        
      } // END if (modelName.equalsIgnoreCase( ...
    } // END if (modelName != null)
    
    if (pm == null) {
      pm=getDefaultModel();
    } // END if (pm == null)
    logger.exiting(_CLASS,"getNamedModel(String)",pm);
    return pm;
  }

  @Override
  public PriceModel createType(String supportedType) {
    logger.entering(_CLASS, "");
    PriceModel pm=null;
    if (supportedType != null) {
      if (supportedType.equalsIgnoreCase(CubeDistancePriceModel.TYPE)) {
        pm=new CubeDistancePriceModelImpl();
      } // END if (supportedType.equalsIgnoreCase(CubeDistancePriceModel.TYPE))
    } else {
      logger.warning("The supportedType parameter is null.");
    } // END if (supportedType != null)
    logger.entering(_CLASS, "",pm);
    return pm;
  }

  @Override
  public List<String> getModelLabels() {
    logger.entering(_CLASS,"getModelNames()");
    logger.entering(_CLASS,"getModelNames()",PriceModelFactoryImpl.names);
    return PriceModelFactoryImpl.names;
  }
  @Override
  public List<String> getModelTypes() {
    logger.entering(_CLASS, "getModelTypes()");
    logger.exiting(_CLASS, "getModelTypes()",PriceModelFactoryImpl.types);
    return PriceModelFactoryImpl.types;
  }
}