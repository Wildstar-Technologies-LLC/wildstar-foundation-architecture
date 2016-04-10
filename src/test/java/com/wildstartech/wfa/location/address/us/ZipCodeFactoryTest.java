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
  //***** 93730 Fresno, CA (36.903166,-119.754900)
  @Test(dependsOnMethods ={"getInstanceTest"})
  public void get93730FresnoCA() {
     City city=null;
     PostalCodeFactory factory=null;
     
     factory=PostalCodeFactory.getInstance();
     city=factory.getCity("93730");
     assert city != null;
     assert city.getName().equals("Fresno");
     assert city.getStateAbbreviation().equals("CA");
  }
  //***** 94505 Discovery Bay, CA (37.808, -121.906)
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