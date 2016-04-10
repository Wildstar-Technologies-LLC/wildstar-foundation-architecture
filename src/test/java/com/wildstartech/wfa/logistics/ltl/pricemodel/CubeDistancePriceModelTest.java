/*
 * Copyright (c) 2001 - 2016 Wildstar Technologies, LLC.
 *
 * This file is part of Wildstar Foundation Architecture.
 *
 * Wildstar Foundation Architecture is free software: you can redistribute it
 * and/or modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * Wildstar Foundation Architecture is distributed in the hope that it will be
 * useful, but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * Wildstar Foundation Architecture.  If not, see 
 * <http://www.gnu.org/licenses/>.
 * 
 * Linking this library statically or dynamically with other modules is making a
 * combined work based on this library. Thus, the terms and conditions of the 
 * GNU General Public License cover the whole combination.
 * 
 * As a special exception, the copyright holders of this library give you 
 * permission to link this library with independent modules to produce an 
 * executable, regardless of the license terms of these independent modules, 
 * and to copy and distribute the resulting executable under terms of your 
 * choice, provided that you also meet, for each linked independent module, the
 * terms and conditions of the license of that module. An independent module is
 * a module which is not derived from or based on this library. If you modify 
 * this library, you may extend this exception to your version of the library, 
 * but you are not obliged to do so. If you do not wish to do so, delete this 
 * exception statement from your version.
 * 
 * If you need additional information or have any questions, please contact:
 *
 *      Wildstar Technologies, LLC.
 *      63 The Greenway Loop
 *      Panama City Beach, FL 32413
 *      USA
 *
 *      derek.berube@wildstartech.com
 *      www.wildstartech.com
 */
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