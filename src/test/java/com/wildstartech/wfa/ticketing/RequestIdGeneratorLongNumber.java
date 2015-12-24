package com.wildstartech.wfa.ticketing;

public class RequestIdGeneratorLongNumber extends RequestIdGenerator {

   @Override
   protected long _getNextId() {
      return Long.MAX_VALUE;
   }

   @Override
   protected String getPrefix() {
      return "";
   }
}
