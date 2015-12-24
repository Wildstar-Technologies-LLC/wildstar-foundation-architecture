package com.wildstartech.wfa.location.spi;

import org.testng.annotations.Test;

import com.wildstartech.wfa.location.spi.haversine.DistanceServiceProviderImpl;

public class DistanceServiceProviderFactoryTest {

  @Test
  public void getInstance() {
    DistanceServiceProviderFactory factory=null;
    
    factory=DistanceServiceProviderFactory.getInstance();
    assert factory != null;
  }

  @Test
  public void getService() {
    DistanceServiceProvider service=null;
    DistanceServiceProviderFactory factory=null;
    
    factory=DistanceServiceProviderFactory.getInstance();
    assert factory != null;
    service=factory.getService();
    assert service != null;
    assert service instanceof DistanceServiceProviderImpl;
  }
}
