/*
 * Copyright (c) 2014 Wildstar Technologies, LLC. All Rights Reserved.
 */
package com.wildstartech.wfa.logistics.ltl.pricemodel;

import java.util.logging.Logger;

import com.wildstartech.wfa.logistics.ltl.Quote;
import com.wildstartech.wfa.logistics.ltl.pricemodels.CubeDistancePriceModel;

public class CubeDistancePriceModelImpl extends PriceModelImpl 
implements CubeDistancePriceModel {
  /** Used in object serialization. */
  private static final String _CLASS = CubeDistancePriceModelImpl.class.getName();
  private static final Logger logger = Logger.getLogger(_CLASS);
  
  private int mileageInterval=0;
  private int minCube=0;
  private double baseCharge=0;
  private double cubeDiscount=0;
  private double mileageStep=1;
  private double minCubeCharge=0;
  private String label="";
  
  /**
   * Default, no-argument constructor.
   */
  public CubeDistancePriceModelImpl() {
    logger.entering(_CLASS,"CubeDistancePriceModelImpl()");
    logger.exiting(_CLASS,"CubeDistancePriceModelImpl()");
  }
  
  //***** label
  public String getLabel() {
    logger.entering(_CLASS,"getLabel()");
    logger.exiting(_CLASS, "getLabel()",this.label);
    return this.label;
  }
  public void setLabel(String label) {
    logger.entering(_CLASS,"setLabel(String)",label);
    if (label != null) {
      this.label=label;
    } else {
      this.label="";
    } // END if (label != null)
    logger.exiting(_CLASS,"setLabel(String)");
  }
  //***** mileageInterval
  public int getMileageInterval() {
    logger.entering(_CLASS,"getMileageInterval()");
    logger.exiting(_CLASS,"getMileageInterval()",this.mileageInterval);
    return this.mileageInterval;
  }
  public void setMileageInterval(int mileageInterval) {
    logger.entering(_CLASS,"setMileageInterval(int)",mileageInterval);
    this.mileageInterval = mileageInterval;
    logger.exiting(_CLASS,"setMileageInterval(int)");
  }
  //***** minCube
  public int getMinCube() {
    logger.entering(_CLASS,"getMinCube()");
    logger.exiting(_CLASS,"getMinCube()",this.minCube);
    return this.minCube;
  }  
  public void setMinCube(int minCube) {
    logger.entering(_CLASS,"setMinCube(int)",minCube);
    this.minCube = minCube;
    logger.exiting(_CLASS,"setMinCube(int)");
  }
  //***** baseCharge
  public double getBaseCharge() {
    logger.entering(_CLASS,"getBaseCharge()");
    logger.exiting(_CLASS,"getBaseCharge()",this.baseCharge);
    return this.baseCharge;
  }
  /**
   * Returns the base charge 
   * @param cube
   * @param mileage
   * @return
   */
  public double getBaseCharge(int cube, double mileage) {
    logger.entering(_CLASS, "getBaseCharge(int)",cube);
    double computedBaseCharge=0;
    double mileageMultiplier=0;
    double mileageStep=0;
    double minimumBaseCharge=0;
    int roundedMileage=0;
    int mileageExponent=0;
    int mileageInterval=0;
    
    computedBaseCharge=getBaseCubeCharge(cube);
    // Normalize the mileage
    roundedMileage=new Long(Math.round(mileage)).intValue();
    // Get the mileage Interval
    mileageInterval=getMileageInterval();
    // Get the mileageStep
    mileageStep=getMileageStep();
    // Determine mileage exponent
    if (roundedMileage < mileageInterval) {
      mileageExponent=0;
    } else if ((roundedMileage % mileageInterval) == 0) {
      mileageExponent=(roundedMileage/mileageInterval) - 1;
    } else {
      mileageExponent=(roundedMileage/mileageInterval);
    } // END if (roundedMileage < mileageInterval)
    mileageMultiplier=Math.pow(mileageStep,mileageExponent);
    // Apply mileageMultiplier
    computedBaseCharge=computedBaseCharge * mileageMultiplier;
    // Check computed computedBaseCharge against minimum base charge.
    if (computedBaseCharge < minimumBaseCharge) {
      computedBaseCharge=minimumBaseCharge;
    } // END if (computedBaseCharge < minimumBaseCharge)
    logger.exiting(_CLASS,"getBaseCharge(int)", computedBaseCharge);
    return computedBaseCharge;
  }
  /**
   * Returns the base charge for the specified number of cubes.
   * 
   * @param cube
   * @return
   */
  public double getBaseCubeCharge(int cube) {
    logger.entering(_CLASS,"getBaseCubeCharge(int)",cube);
    double baseCharge;
    double cubeDiscount=0;
    double computedBaseCharge=0;
    double computedCubeDiscount=0;
    int minCube=0;
    
    // Obtain the base Charge
    baseCharge=getBaseCharge();
    // Normalize the cube
    minCube=getMinCube();
    if (cube < minCube) {
      cube=minCube;
    } // END if (cube < this.model.getMinCube())
    // Determine the cube discount rate.
    cubeDiscount=getCubeDiscount();
    computedCubeDiscount=1-cubeDiscount;
    if (cube == minCube) {
      computedCubeDiscount=1;
    } else {
      computedCubeDiscount=Math.pow(computedCubeDiscount, (cube - minCube));
    } // END if (cube == minCube)
    // Calculate base charge.
    computedBaseCharge=baseCharge * computedCubeDiscount;
    logger.exiting(_CLASS,"getBaseCubeCharge(int)",baseCharge);
    return computedBaseCharge;
  }
  
  public void setBaseCharge(double baseCharge) {
    logger.entering(_CLASS,"setBaseCharge(double)",baseCharge);
    this.baseCharge = baseCharge;
    logger.exiting(_CLASS,"setBaseCharge(double)");
  }
  //***** cubeDiscount
  public double getCubeDiscount() {
    logger.entering(_CLASS,"getCubeDiscount()");
    logger.exiting(_CLASS,"getCubeDiscount()",this.cubeDiscount);
    return this.cubeDiscount;
  }
  public void setCubeDiscount(double cubeDiscount) {
    logger.entering(_CLASS,"setCubeDiscount(double)",cubeDiscount);
    this.cubeDiscount = cubeDiscount;
    logger.exiting(_CLASS,"setCubeDiscount(double)");    
  }
  //***** mileageStep 
  public double getMileageStep() {
    logger.entering(_CLASS,"getMileageStep()");
    logger.exiting(_CLASS,"getMileageStep()",this.mileageStep);
    return this.mileageStep;
  }
  public void setMileageStep(double mileageStep) {
    logger.entering(_CLASS,"setMileageStep(double)",mileageStep);
    this.mileageStep = mileageStep;
    logger.exiting(_CLASS,"setMileageStep(double)");
  }
  //***** minCubeCharge
  public double getMinCubeCharge() {
    logger.entering(_CLASS,"getMinCubeCharge()");
    logger.exiting(_CLASS,"getMinCubeCharge()",this.minCubeCharge);
    return this.minCubeCharge;
  }
  public void setMinCubeCharge(double minCubeCharge) {
    logger.entering(_CLASS,"setMinCubeCharge(double)",minCubeCharge);
    this.minCubeCharge = minCubeCharge;
    logger.exiting(_CLASS,"setMinCubeCharge(double)");    
  }  
  //***** calculateCharge
  /**
   * Return an estimated rate for the specified cube and mileage.
   * @param cube
   * @param mileage
   * @return
   */
  public double calculateCharge(int cube, double mileage) {
    logger.entering(_CLASS,"calculateCharge(int,int)",
        new Object[] {cube,mileage});
    int minCube=0;
    double charge=0;
    double baseCharge=0;
    // Calculate the base charge.
    baseCharge=getBaseCharge(cube,mileage);
    /* Determine if the specified cube meets the minimum.  If it does not, then
     * adjust the cube to relfect the minimum. */
    minCube=getMinCube();
    if (cube < minCube) cube=minCube;
    charge=baseCharge*cube;
    logger.exiting(_CLASS,"calculateCharge(int,int)",charge);
    return charge;
  }

  @Override
  public double calculateTotalCharges(Quote quote) {
    logger.entering(_CLASS,"calculateCharge(Quote)",quote);
    double charges=0;
    double distance=0;
    int cubes=0;
    if (quote != null) {
      distance=quote.getDistance();
      cubes=quote.getTotalCubes();
    } else {
      logger.severe("The specified quote parameter is null.");
    } // END if (quote != null)
    charges=calculateCharge(cubes,distance);
    logger.exiting(_CLASS,"calculateCharge(Quote)",charges);
    return charges;
  }

  @Override
  public String getType() {
    logger.entering(_CLASS,"getType()");
    logger.entering(_CLASS,"getType()",CubeDistancePriceModel.TYPE);
    return CubeDistancePriceModel.TYPE;
  }
}