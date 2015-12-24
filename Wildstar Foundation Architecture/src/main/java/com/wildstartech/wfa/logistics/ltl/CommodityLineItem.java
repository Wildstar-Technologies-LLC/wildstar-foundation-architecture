package com.wildstartech.wfa.logistics.ltl;

public interface CommodityLineItem extends LineItem {
      
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
   /**
    * Returns the number of cubic feet occupied by the object in question.
    * 
    * <p>When calculating the cube value, standard rounding will apply such that 
    * fractional cubic feet less than 0.5 will be rounded <em>down</em> to the 
    * nearest whole number.  Fractional cubic feel 0.5 and up will be rounded 
    * <em>up</em> to the nearest whole number.</p>
    * 
    * @return An integer value indicating the number of volume of space occupied 
    * by the item represented by this line item.
    */
   public int getCube();
   
   /**
    * Returns the number of cubic feet occupied by the object by the quantity.
    * @return
    */
   public int getTotalCube();
}