package com.wildstartech.wfa.logistics.ltl.pricemodel;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import org.testng.annotations.Test;

import com.wildstartech.wfa.logistics.ltl.pricemodels.CubeDistancePriceModel;
import com.wildstartech.wfa.logistics.ltl.pricemodels.PriceModelFactory;


public class CubeDistancePriceModelTest {
  private CubeDistancePriceModel model=null;
    
  @Test
  public void testCalculation() {
    double baseCharge;
    double charge=0;
    double computedBaseCharge=0;
    double cubeDiscount=0;
    double computedCubeDiscount=0;
    double mileage=0;
    double mileageMultiplier=0;
    double mileageStep=0;
    double minimumBaseCharge=0;
    int cube=0;
    int roundedMileage=0;
    int mileageExponent=0;
    int mileageInterval=0;
    int minCube=0;
    
    cube=300;
    mileage=600;
    
    initPrinceModel();
    // Identify the base Charge
    baseCharge=this.model.getBaseCharge();
    // Normalize the cube
    minCube=this.model.getMinCube();
    if (cube < minCube) {
      cube=minCube;
    } // END if (cube < this.model.getMinCube())
    // Determine the cube discount rate.
    cubeDiscount=this.model.getCubeDiscount();
    computedCubeDiscount=1-cubeDiscount;
    if (cube == minCube) {
      computedCubeDiscount=1;
    } else {
      computedCubeDiscount=Math.pow(computedCubeDiscount, (cube - minCube));
    } // END if (cube == minCube)
    // Calculate base charge.
    computedBaseCharge=baseCharge * computedCubeDiscount;
    // Normalize the mileage
    roundedMileage=new Long(Math.round(mileage)).intValue();
    // Get the mileage Interval
    mileageInterval=this.model.getMileageInterval();
    // Get the mileageStep
    mileageStep=this.model.getMileageStep();
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
    
    // Multiply the computedBaseCharge by the number of cubes
    charge=computedBaseCharge * cube;
    
    System.out.println("Charge: "+ charge);
  }
  
  /**
   * Used to initialize the PriceModel.
   */
  private void initPrinceModel() {
    PriceModelFactory pmf=null;
    pmf=PriceModelFactory.getInstance();
    this.model=(CubeDistancePriceModel) pmf.getDefaultModel();
    this.model.setBaseCharge(4.72);
    this.model.setCubeDiscount(0.00169);
    this.model.setMileageInterval(50);
    this.model.setMileageStep(1.05);
    this.model.setMinCube(35);
    this.model.setMinCubeCharge(2); 
  }
  
  /**
   * Calculate the baseCharge.
   * @param cube
   * @return
   */
  public double getBaseCharge(int cube, int mileage) {
    double cubeDiscount=0;
    int minCube=0;
    BigDecimal baseCharge=null;
    BigDecimal discount=null;
    MathContext mc=null;
    
    minCube=this.model.getMinCube();
    if (cube < minCube) cube=minCube;
    //***** calculate the baseCharge 
    mc=new MathContext(2,RoundingMode.HALF_EVEN);
    baseCharge=new BigDecimal(this.model.getBaseCharge(),mc);
    //***** setup the discount
    mc=new MathContext(5,RoundingMode.HALF_EVEN);
    cubeDiscount=this.model.getCubeDiscount();
    discount=new BigDecimal(cubeDiscount,mc);
    discount=discount.negate();
    discount=discount.add(new BigDecimal(1));
    discount=discount.pow(cube-minCube);
    baseCharge=baseCharge.multiply(discount);
    
    return baseCharge.doubleValue();
  }
}