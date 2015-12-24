package com.wildstartech.wfa.logistics.ltl.pricemodels;


public interface CubeDistancePriceModel extends PriceModel {
  public static final String TYPE="Cube/Distance";
  
  //***** mileageInterval
  public int getMileageInterval();
  public void setMileageInterval(int mileageInterval);
  
  //***** minCube
  public int getMinCube();  
  public void setMinCube(int minCube);
  
  //***** baseCharge
  public double getBaseCharge();
  /**
   * Returns the base charge 
   * @param cube
   * @param mileage
   * @return
   */
  public double getBaseCharge(int cube, double mileage);
  /**
   * Returns the base charge for the specified number of cubes.
   * 
   * @param cube
   * @return
   */
  public double getBaseCubeCharge(int cube);
  public void setBaseCharge(double baseCharge);
  
  //***** cubeDiscount
  public double getCubeDiscount();
  public void setCubeDiscount(double cubeDiscount);
  
  //***** mileageStep 
  public double getMileageStep();
  public void setMileageStep(double mileageStep);
  
  //***** minCubeCharge
  public double getMinCubeCharge();
  public void setMinCubeCharge(double minCubeCharge);
  
  //***** calculateCharge
  /**
   * Return an estimated rate for the specified cube and mileage.
   * @param cube
   * @param mileage
   * @return
   */
  public double calculateCharge(int cube, double mileage);
}
