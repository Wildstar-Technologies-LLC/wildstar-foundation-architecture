package com.wildstartech.wfa.web;

public interface WebAccessible {
   /**
    * Returns a Uniform Resource Locator for the object.
    */
   public String getURL();
   /**
    * Sets the Uniform Resource Locator for the object.
    * @param url
    */
   public void setURL(String url);
}