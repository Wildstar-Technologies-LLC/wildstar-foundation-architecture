/*
 * Copyright (c) 2014 Wildstar Technologies, LLC. All Rights Reserved.
 */
package com.wildstartech.wfa.logistics.ltl;

public interface QuoteLineItem {
  //***** description
  public String getDescription();
  public void setDescription(String description);

  //***** height
  public int getHeight();
  public void setHeight(int height);

  //***** length
  public int getLength();
  public void setLength(int length);

  //***** weight
  public int getWeight();
  public void setWeight(int weight);

  //***** width
  public int getWidth();
  public void setWidth(int width);

  //*****
  public int getQuantity();
  public void setQuantity(int quantity);
  
  //***** cube
  public int getCube();
}