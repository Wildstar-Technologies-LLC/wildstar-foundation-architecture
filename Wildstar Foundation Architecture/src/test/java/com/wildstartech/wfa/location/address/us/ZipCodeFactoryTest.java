package com.wildstartech.wfa.location.address.us;

import org.testng.annotations.Test;

import com.wildstartech.wfa.location.address.City;
import com.wildstartech.wfa.location.address.PostalCodeFactory;
import com.wildstartech.wfa.location.address.us.LocalPostalCodeFactoryImpl;

public class ZipCodeFactoryTest {
  
  @Test
  public void getInstanceTest() {
    PostalCodeFactory factory=null;
    
    factory=PostalCodeFactory.getInstance();
    assert factory != null;
    assert factory instanceof LocalPostalCodeFactoryImpl;
  }
  
  //***** 30332 Atlanta, GA
  @Test(dependsOnMethods = { "getInstanceTest" })
  public void getGAAtlanta30332Test() {
    City city=null;
    PostalCodeFactory factory=null;
    
    factory=PostalCodeFactory.getInstance();
    city=factory.getCity("30332");
    assert city != null;
    assert city.getName().equals("Atlanta");
    assert city.getStateAbbreviation().equals("GA");
  }
  //***** 30328, Sandy Springs, GA
  @Test(dependsOnMethods = { "getInstanceTest" })
  public void getGASandySprings30328Test() {
    City city=null;
    PostalCodeFactory factory=null;
    
    factory=PostalCodeFactory.getInstance();
    city=factory.getCity("30328");
    assert city != null;
    assert city.getName().equals("Sandy Springs");
    assert city.getStateAbbreviation().equals("GA");
  }
  //***** 32413 Panama City Beach, FL
  @Test(dependsOnMethods = { "getInstanceTest" })
  public void getFLPanamaCityBeachTest() {
    City city=null;
    PostalCodeFactory factory=null;
    
    factory=PostalCodeFactory.getInstance();
    city=factory.getCity("32413");
    assert city != null;
    assert city.getName().equals("Panama City Beach");
    assert city.getStateAbbreviation().equals("FL");
  }
  //***** 92010 Carlsbad, CA  (33.107, -117.287)
  @Test(dependsOnMethods = { "getInstanceTest" })
  public void get92010CarlsbadCA() {
     City city=null;
     PostalCodeFactory factory=null;
     
     factory=PostalCodeFactory.getInstance();
     city=factory.getCity("92010");
     assert city != null;
     assert city.getName().equals("Carlsbad");
     assert city.getStateAbbreviation().equals("CA");
  }
  //***** 92011 Carlsbad, CA  (33.151, -117.306)
  @Test(dependsOnMethods = { "getInstanceTest" })
  public void get92011CarlsbadCA() {
     City city=null;
     PostalCodeFactory factory=null;
     
     factory=PostalCodeFactory.getInstance();
     city=factory.getCity("92011");
     assert city != null;
     assert city.getName().equals("Carlsbad");
     assert city.getStateAbbreviation().equals("CA");
  }
  //***** 93619 Clovis, CA  (36.843, -119.652)
  @Test(dependsOnMethods = { "getInstanceTest" })
  public void get93619ClovisCA() {
     City city=null;
     PostalCodeFactory factory=null;
     
     factory=PostalCodeFactory.getInstance();
     city=factory.getCity("93619");
     assert city != null;
     assert city.getName().equals("Clovis");
     assert city.getStateAbbreviation().equals("CA");
  }
  //***** 94505 Discovery Bay, CA (37.808, -121.906
  @Test(dependsOnMethods = { "getInstanceTest" })
  public void get94505DiscoveryBayCA() {
     City city=null;
     PostalCodeFactory factory=null;
     
     factory=PostalCodeFactory.getInstance();
     city=factory.getCity("94505");
     assert city != null;
     assert city.getName().equals("Discovery Bay");
     assert city.getStateAbbreviation().equals("CA");
  }
  //***** 94582 San Ramon, CA  (37.672, -121.889)
  @Test(dependsOnMethods = { "getInstanceTest" })
  public void get94582SanRamonCA() {
     City city=null;
     PostalCodeFactory factory=null;
     
     factory=PostalCodeFactory.getInstance();
     city=factory.getCity("94582");
     assert city != null;
     assert city.getName().equals("San Ramon");
     assert city.getStateAbbreviation().equals("CA");
  }
  //***** 97086 Happy Valley, OR  (45.443,  -122.515)
  @Test(dependsOnMethods = { "getInstanceTest" })
  public void get97086HappyValleyOR() {
     City city=null;
     PostalCodeFactory factory=null;
     
     factory=PostalCodeFactory.getInstance();
     city=factory.getCity("97086");
     assert city != null;
     assert city.getName().equals("Happy Valley");
     assert city.getStateAbbreviation().equals("OR");
  }
  //***** 97089 Damascus, OR  (45.422, -122.45)

}