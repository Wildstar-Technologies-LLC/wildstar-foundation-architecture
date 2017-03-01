package com.wildstartech.wfa;

import org.testng.annotations.Test;

public class EmailAddressTest {
   @Test
   public void emailAddressTest() {
      EmailAddress address;
      
      address=new EmailAddress("dork@");
      assert address.isValid() == false;
   }
}