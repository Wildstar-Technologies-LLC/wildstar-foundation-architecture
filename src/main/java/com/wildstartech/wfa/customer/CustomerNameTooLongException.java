package com.wildstartech.wfa.customer;

import com.wildstartech.wfa.WFAException;

public class CustomerNameTooLongException extends WFAException {
  /** Used in object serialization. */
 
  /**
   * Identifies the resource bundle used to format the message.
   * This field should be over-ridden by all subclassing object identifying a 
   * valid ResourceBundle key.
   */
  private static String RESOURCE_BUNDLE_KEY = CustomerResources.class.getName();
  
  public CustomerNameTooLongException(String name, int length) {
      super(RESOURCE_BUNDLE_KEY);
      localizeMessage("CustomerNameTooLongException", new Object[]{
          name,
          length
      });
  }
}
