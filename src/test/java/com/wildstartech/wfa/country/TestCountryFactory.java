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
package com.wildstartech.wfa.country;

import org.testng.annotations.Test;

/**
 * Test the <code>CountryFactory</code> to validate ISO3166 compliance.
 * 
 * @author Derek Berube, Wildstar Technologies, LLC.
 */
public class TestCountryFactory {
	private static CountryFactory countryFactory=CountryFactory.getInstance();

	// ***** (AD) - Andorra
	@Test
	public void testAndorra() {
		Country country = null;
		country = countryFactory.findByCode("AD");
		assert country != null;
		assert country.getCode().equals("AD")== true;
		assert country.getName().toUpperCase().equals("ANDORRA")== true;
	}

	// ***** (AE) - United Arab Emirates
	@Test
	public void testUnitedArabEmirates() {
		Country country = null;
		country = countryFactory.findByCode("AE");
		assert country != null;
		assert country.getCode().equals("AE")== true;
		assert country.getName().toUpperCase()
				.equals("UNITED ARAB EMIRATES")== true;
	}

	// ***** (AF) - Afghanistan
	@Test
	public void testAfghanistan() {
		Country country = null;
		country = countryFactory.findByCode("AF");
		assert country != null;
		assert country.getCode().equals("AF")== true;
		assert country.getName().toUpperCase().equals("AFGHANISTAN")== true;
	}

	// ***** (AG) - Antigua And Barbuda
	@Test
	public void testAntiguaAndBarbuda() {
		Country country = null;
		country = countryFactory.findByCode("AG");
		assert country != null;
		assert country.getCode().equals("AG")== true;
		assert country.getName().toUpperCase()
				.equals("ANTIGUA AND BARBUDA")== true;
	}

	// ***** (AI) - Anguilla
	@Test
	public void testAnguilla() {
		Country country = null;
		country = countryFactory.findByCode("AI");
		assert country != null;
		assert country.getCode().equals("AI")== true;
		assert country.getName().toUpperCase().equals("ANGUILLA")== true;
	}

	// ***** (AL) - Albania
	@Test
	public void testAlbania() {
		Country country = null;
		country = countryFactory.findByCode("AL");
		assert country != null;
		assert country.getCode().equals("AL")== true;
		assert country.getName().toUpperCase().equals("ALBANIA")== true;
	}

	// ***** (AM) - Armenia
	@Test
	public void testArmenia() {
		Country country = null;
		country = countryFactory.findByCode("AM");
		assert country != null;
		assert country.getCode().equals("AM")== true;
		assert country.getName().toUpperCase().equals("ARMENIA")== true;
	}

	// ***** (AN) - Netherlands Antilles
	@Test
	public void testNetherlandsAntilles() {
		Country country = null;
		country = countryFactory.findByCode("AN");
		assert country != null;
		assert country.getCode().equals("AN")== true;
		assert country.getName().toUpperCase()
				.equals("NETHERLANDS ANTILLES")== true;
	}

	// ***** (AO) - Angola
	@Test
	public void testAngola() {
		Country country = null;
		country = countryFactory.findByCode("AO");
		assert country != null;
		assert country.getCode().equals("AO")== true;
		assert country.getName().toUpperCase().equals("ANGOLA")== true;
	}

	// ***** (AQ) - Antarctica
	@Test
	public void testAntarctica() {
		Country country = null;
		country = countryFactory.findByCode("AQ");
		assert country != null;
		assert country.getCode().equals("AQ")== true;
		assert country.getName().toUpperCase().equals("ANTARCTICA")== true;
	}

	// ***** (AR) - Argentina
	@Test
	public void testArgentina() {
		Country country = null;
		country = countryFactory.findByCode("AR");
		assert country != null;
		assert country.getCode().equals("AR")== true;
		assert country.getName().toUpperCase().equals("ARGENTINA")== true;
	}

	// ***** (AS) - American Samoa
	@Test
	public void testAmericanSamoa() {
		Country country = null;
		country = countryFactory.findByCode("AS");
		assert country != null;
		assert country.getCode().equals("AS")== true;
		assert country.getName().toUpperCase().equals("AMERICAN SAMOA")== true;
	}

	// ***** (AT) - Austria
	@Test
	public void testAustria() {
		Country country = null;
		country = countryFactory.findByCode("AT");
		assert country != null;
		assert country.getCode().equals("AT")== true;
		assert country.getName().toUpperCase().equals("AUSTRIA")== true;
	}

	// ***** (AU) - Australia
	@Test
	public void testAustralia() {
		Country country = null;
		country = countryFactory.findByCode("AU");
		assert country != null;
		assert country.getCode().equals("AU")== true;
		assert country.getName().toUpperCase().equals("AUSTRALIA")== true;
	}

	// ***** (AW) - Aruba
	@Test
	public void testAruba() {
		Country country = null;
		country = countryFactory.findByCode("AW");
		assert country != null;
		assert country.getCode().equals("AW")== true;
		assert country.getName().toUpperCase().equals("ARUBA")== true;
	}

	// ***** (AX) - land Islands
	@Test
	public void testAlandIslands() {
		Country country = null;
		country = countryFactory.findByCode("AX");
		assert country != null;
		assert country.getCode().equals("AX")== true;
		assert country.getName().toUpperCase().equals("\u00c5LAND ISLANDS")== true;
	}

	// ***** (AZ) - Azerbaijan
	@Test
	public void testAzerbaijan() {
		Country country = null;
		country = countryFactory.findByCode("AZ");
		assert country != null;
		assert country.getCode().equals("AZ")== true;
		assert country.getName().toUpperCase().equals("AZERBAIJAN")== true;
	}

	// ***** (BA) - Bosnia And Herzegovina
	@Test
	public void testBosniaAndHerzegovina() {
		Country country = null;
		country = countryFactory.findByCode("BA");
		assert country != null;
		assert country.getCode().equals("BA")== true;
		assert country.getName().toUpperCase()
				.equals("BOSNIA AND HERZEGOVINA")== true;
	}

	// ***** (BB) - Barbados
	@Test
	public void testBarbados() {
		Country country = null;
		country = countryFactory.findByCode("BB");
		assert country != null;
		assert country.getCode().equals("BB")== true;
		assert country.getName().toUpperCase().equals("BARBADOS")== true;
	}

	// ***** (BD) - Bangladesh
	@Test
	public void testBangladesh() {
		Country country = null;
		country = countryFactory.findByCode("BD");
		assert country != null;
		assert country.getCode().equals("BD")== true;
		assert country.getName().toUpperCase().equals("BANGLADESH")== true;
	}

	// ***** (BE) - Belgium
	@Test
	public void testBelgium() {
		Country country = null;
		country = countryFactory.findByCode("BE");
		assert country != null;
		assert country.getCode().equals("BE")== true;
		assert country.getName().toUpperCase().equals("BELGIUM")== true;
	}

	// ***** (BF) - Burkina Faso
	@Test
	public void testBurkinaFaso() {
		Country country = null;
		country = countryFactory.findByCode("BF");
		assert country != null;
		assert country.getCode().equals("BF")== true;
		assert country.getName().toUpperCase().equals("BURKINA FASO")== true;
	}

	// ***** (BG) - Bulgaria
	@Test
	public void testBulgaria() {
		Country country = null;
		country = countryFactory.findByCode("BG");
		assert country != null;
		assert country.getCode().equals("BG")== true;
		assert country.getName().toUpperCase().equals("BULGARIA")== true;
	}

	// ***** (BH) - Bahrain
	@Test
	public void testBahrain() {
		Country country = null;
		country = countryFactory.findByCode("BH");
		assert country != null;
		assert country.getCode().equals("BH")== true;
		assert country.getName().toUpperCase().equals("BAHRAIN")== true;
	}

	// ***** (BI) - Burundi
	@Test
	public void testBurundi() {
		Country country = null;
		country = countryFactory.findByCode("BI");
		assert country != null;
		assert country.getCode().equals("BI")== true;
		assert country.getName().toUpperCase().equals("BURUNDI")== true;
	}

	// ***** (BJ) - Benin
	@Test
	public void testBenin() {
		Country country = null;
		country = countryFactory.findByCode("BJ");
		assert country != null;
		assert country.getCode().equals("BJ")== true;
		assert country.getName().toUpperCase().equals("BENIN")== true;
	}

	// ***** (BL) - Saint Barthelemy
	@Test
	public void testSaintBarthelemy() {
		Country country = null;
		country = countryFactory.findByCode("BL");
		assert country != null;
		assert country.getCode().equals("BL")== true;
		assert country.getName().toUpperCase()
				.equals("SAINT BARTH\u00c9LEMY")== true;
	}

	// ***** (BM) - Bermuda
	@Test
	public void testBermuda() {
		Country country = null;
		country = countryFactory.findByCode("BM");
		assert country != null;
		assert country.getCode().equals("BM")== true;
		assert country.getName().toUpperCase().equals("BERMUDA")== true;
	}

	// ***** (BN) - Brunei Darussalam
	@Test
	public void testBruneiDarussalam() {
		Country country = null;
		country = countryFactory.findByCode("BN");
		assert country != null;
		assert country.getCode().equals("BN")== true;
		assert country.getName().toUpperCase().equals("BRUNEI DARUSSALAM")== true;
	}

	// ***** (BO) - Bolivia, Plurinational State Of
	@Test
	public void testBoliviaPlurinationalStateOf() {
		Country country = null;
		country = countryFactory.findByCode("BO");
		assert country != null;
		assert country.getCode().equals("BO")== true;
		assert country.getName().toUpperCase()
				.equals("BOLIVIA, PLURINATIONAL STATE OF")== true;
	}

	// ***** (BR) - Brazil
	@Test
	public void testBrazil() {
		Country country = null;
		country = countryFactory.findByCode("BR");
		assert country != null;
		assert country.getCode().equals("BR")== true;
		assert country.getName().toUpperCase().equals("BRAZIL")== true;
	}

	// ***** (BS) - Bahamas
	@Test
	public void testBahamas() {
		Country country = null;
		country = countryFactory.findByCode("BS");
		assert country != null;
		assert country.getCode().equals("BS")== true;
		assert country.getName().toUpperCase().equals("BAHAMAS")== true;
	}

	// ***** (BT) - Bhutan
	@Test
	public void testBhutan() {
		Country country = null;
		country = countryFactory.findByCode("BT");
		assert country != null;
		assert country.getCode().equals("BT")== true;
		assert country.getName().toUpperCase().equals("BHUTAN")== true;
	}

	// ***** (BV) - Bouvet Island
	@Test
	public void testBouvetIsland() {
		Country country = null;
		country = countryFactory.findByCode("BV");
		assert country != null;
		assert country.getCode().equals("BV")== true;
		assert country.getName().toUpperCase().equals("BOUVET ISLAND")== true;
	}

	// ***** (BW) - Botswana
	@Test
	public void testBotswana() {
		Country country = null;
		country = countryFactory.findByCode("BW");
		assert country != null;
		assert country.getCode().equals("BW")== true;
		assert country.getName().toUpperCase().equals("BOTSWANA")== true;
	}

	// ***** (BY) - Belarus
	@Test
	public void testBelarus() {
		Country country = null;
		country = countryFactory.findByCode("BY");
		assert country != null;
		assert country.getCode().equals("BY")== true;
		assert country.getName().toUpperCase().equals("BELARUS")== true;
	}

	// ***** (BZ) - Belize
	@Test
	public void testBelize() {
		Country country = null;
		country = countryFactory.findByCode("BZ");
		assert country != null;
		assert country.getCode().equals("BZ")== true;
		assert country.getName().toUpperCase().equals("BELIZE")== true;
	}

	// ***** (CA) - Canada
	@Test
	public void testCanada() {
		Country country = null;
		country = countryFactory.findByCode("CA");
		assert country != null;
		assert country.getCode().equals("CA")== true;
		assert country.getName().toUpperCase().equals("CANADA")== true;
	}

	// ***** (CC) - Cocos (Keeling) Islands
	@Test
	public void testCocosKeelingIslands() {
		Country country = null;
		country = countryFactory.findByCode("CC");
		assert country != null;
		assert country.getCode().equals("CC")== true;
		assert country.getName().toUpperCase()
				.equals("COCOS (KEELING) ISLANDS")== true;
	}

	// ***** (CD) - Congo, The Democratic Republic Of The
	@Test
	public void testCongoTheDemocraticRepublicOfThe() {
		Country country = null;
		country = countryFactory.findByCode("CD");
		assert country != null;
		assert country.getCode().equals("CD")== true;
		assert country.getName().toUpperCase()
				.equals("CONGO, THE DEMOCRATIC REPUBLIC OF THE")== true;
	}

	// ***** (CF) - Central African Republic
	@Test
	public void testCentralAfricanRepublic() {
		Country country = null;
		country = countryFactory.findByCode("CF");
		assert country != null;
		assert country.getCode().equals("CF")== true;
		assert country.getName().toUpperCase()
				.equals("CENTRAL AFRICAN REPUBLIC")== true;
	}

	// ***** (CG) - Congo
	@Test
	public void testCongo() {
		Country country = null;
		country = countryFactory.findByCode("CG");
		assert country != null;
		assert country.getCode().equals("CG")== true;
		assert country.getName().toUpperCase().equals("CONGO")== true;
	}

	// ***** (CH) - Switzerland
	@Test
	public void testSwitzerland() {
		Country country = null;
		country = countryFactory.findByCode("CH");
		assert country != null;
		assert country.getCode().equals("CH")== true;
		assert country.getName().toUpperCase().equals("SWITZERLAND")== true;
	}

	// ***** (CI) - Cote D'Ivoire
	@Test
	public void testCoteDIvoire() {
		Country country = null;
		country = countryFactory.findByCode("CI");
		assert country != null;
		assert country.getCode().equals("CI")== true;
		assert country.getName().toUpperCase().equals("C\u00d4TE D'IVOIRE")== true;
	}

	// ***** (CK) - Cook Islands
	@Test
	public void testCookIslands() {
		Country country = null;
		country = countryFactory.findByCode("CK");
		assert country != null;
		assert country.getCode().equals("CK")== true;
		assert country.getName().toUpperCase().equals("COOK ISLANDS")== true;
	}

	// ***** (CL) - Chile
	@Test
	public void testChile() {
		Country country = null;
		country = countryFactory.findByCode("CL");
		assert country != null;
		assert country.getCode().equals("CL")== true;
		assert country.getName().toUpperCase().equals("CHILE")== true;
	}

	// ***** (CM) - Cameroon
	@Test
	public void testCameroon() {
		Country country = null;
		country = countryFactory.findByCode("CM");
		assert country != null;
		assert country.getCode().equals("CM")== true;
		assert country.getName().toUpperCase().equals("CAMEROON")== true;
	}

	// ***** (CN) - China
	@Test
	public void testChina() {
		Country country = null;
		country = countryFactory.findByCode("CN");
		assert country != null;
		assert country.getCode().equals("CN")== true;
		assert country.getName().toUpperCase().equals("CHINA")== true;
	}

	// ***** (CO) - Colombia
	@Test
	public void testColombia() {
		Country country = null;
		country = countryFactory.findByCode("CO");
		assert country != null;
		assert country.getCode().equals("CO")== true;
		assert country.getName().toUpperCase().equals("COLOMBIA")== true;
	}

	// ***** (CR) - Costa Rica
	@Test
	public void testCostaRica() {
		Country country = null;
		country = countryFactory.findByCode("CR");
		assert country != null;
		assert country.getCode().equals("CR")== true;
		assert country.getName().toUpperCase().equals("COSTA RICA")== true;
	}

	// ***** (CU) - Cuba
	@Test
	public void testCuba() {
		Country country = null;
		country = countryFactory.findByCode("CU");
		assert country != null;
		assert country.getCode().equals("CU")== true;
		assert country.getName().toUpperCase().equals("CUBA")== true;
	}

	// ***** (CV) - Cape Verde
	@Test
	public void testCapeVerde() {
		Country country = null;
		country = countryFactory.findByCode("CV");
		assert country != null;
		assert country.getCode().equals("CV")== true;
		assert country.getName().toUpperCase().equals("CAPE VERDE")== true;
	}

	// ***** (CX) - Christmas Island
	@Test
	public void testChristmasIsland() {
		Country country = null;
		country = countryFactory.findByCode("CX");
		assert country != null;
		assert country.getCode().equals("CX")== true;
		assert country.getName().toUpperCase().equals("CHRISTMAS ISLAND")== true;
	}

	// ***** (CY) - Cyprus
	@Test
	public void testCyprus() {
		Country country = null;
		country = countryFactory.findByCode("CY");
		assert country != null;
		assert country.getCode().equals("CY")== true;
		assert country.getName().toUpperCase().equals("CYPRUS")== true;
	}

	// ***** (CZ) - Czech Republic
	@Test
	public void testCzechRepublic() {
		Country country = null;
		country = countryFactory.findByCode("CZ");
		assert country != null;
		assert country.getCode().equals("CZ")== true;
		assert country.getName().toUpperCase().equals("CZECH REPUBLIC")== true;
	}

	// ***** (DE) - Germany
	@Test
	public void testGermany() {
		Country country = null;
		country = countryFactory.findByCode("DE");
		assert country != null;
		assert country.getCode().equals("DE")== true;
		assert country.getName().toUpperCase().equals("GERMANY")== true;
	}

	// ***** (DJ) - Djibouti
	@Test
	public void testDjibouti() {
		Country country = null;
		country = countryFactory.findByCode("DJ");
		assert country != null;
		assert country.getCode().equals("DJ")== true;
		assert country.getName().toUpperCase().equals("DJIBOUTI")== true;
	}

	// ***** (DK) - Denmark
	@Test
	public void testDenmark() {
		Country country = null;
		country = countryFactory.findByCode("DK");
		assert country != null;
		assert country.getCode().equals("DK")== true;
		assert country.getName().toUpperCase().equals("DENMARK")== true;
	}

	// ***** (DM) - Dominica
	@Test
	public void testDominica() {
		Country country = null;
		country = countryFactory.findByCode("DM");
		assert country != null;
		assert country.getCode().equals("DM")== true;
		assert country.getName().toUpperCase().equals("DOMINICA")== true;
	}

	// ***** (DO) - Dominican Republic
	@Test
	public void testDominicanRepublic() {
		Country country = null;
		country = countryFactory.findByCode("DO");
		assert country != null;
		assert country.getCode().equals("DO")== true;
		assert country.getName().toUpperCase().equals("DOMINICAN REPUBLIC")== true;
	}

	// ***** (DZ) - Algeria
	@Test
	public void testAlgeria() {
		Country country = null;
		country = countryFactory.findByCode("DZ");
		assert country != null;
		assert country.getCode().equals("DZ")== true;
		assert country.getName().toUpperCase().equals("ALGERIA")== true;
	}

	// ***** (EC) - Ecuador
	@Test
	public void testEcuador() {
		Country country = null;
		country = countryFactory.findByCode("EC");
		assert country != null;
		assert country.getCode().equals("EC")== true;
		assert country.getName().toUpperCase().equals("ECUADOR")== true;
	}

	// ***** (EE) - Estonia
	@Test
	public void testEstonia() {
		Country country = null;
		country = countryFactory.findByCode("EE");
		assert country != null;
		assert country.getCode().equals("EE")== true;
		assert country.getName().toUpperCase().equals("ESTONIA")== true;
	}

	// ***** (EG) - Egypt
	@Test
	public void testEgypt() {
		Country country = null;
		country = countryFactory.findByCode("EG");
		assert country != null;
		assert country.getCode().equals("EG")== true;
		assert country.getName().toUpperCase().equals("EGYPT")== true;
	}

	// ***** (EH) - Western Sahara
	@Test
	public void testWesternSahara() {
		Country country = null;
		country = countryFactory.findByCode("EH");
		assert country != null;
		assert country.getCode().equals("EH")== true;
		assert country.getName().toUpperCase().equals("WESTERN SAHARA")== true;
	}

	// ***** (ER) - Eritrea
	@Test
	public void testEritrea() {
		Country country = null;
		country = countryFactory.findByCode("ER");
		assert country != null;
		assert country.getCode().equals("ER")== true;
		assert country.getName().toUpperCase().equals("ERITREA")== true;
	}

	// ***** (ES) - Spain
	@Test
	public void testSpain() {
		Country country = null;
		country = countryFactory.findByCode("ES");
		assert country != null;
		assert country.getCode().equals("ES")== true;
		assert country.getName().toUpperCase().equals("SPAIN")== true;
	}

	// ***** (ET) - Ethiopia
	@Test
	public void testEthiopia() {
		Country country = null;
		country = countryFactory.findByCode("ET");
		assert country != null;
		assert country.getCode().equals("ET")== true;
		assert country.getName().toUpperCase().equals("ETHIOPIA")== true;
	}

	// ***** (FI) - Finland
	@Test
	public void testFinland() {
		Country country = null;
		country = countryFactory.findByCode("FI");
		assert country != null;
		assert country.getCode().equals("FI")== true;
		assert country.getName().toUpperCase().equals("FINLAND")== true;
	}

	// ***** (FJ) - Fiji
	@Test
	public void testFiji() {
		Country country = null;
		country = countryFactory.findByCode("FJ");
		assert country != null;
		assert country.getCode().equals("FJ")== true;
		assert country.getName().toUpperCase().equals("FIJI")== true;
	}

	// ***** (FK) - Falkland Islands (Malvinas)
	@Test
	public void testFalklandIslandsMalvinas() {
		Country country = null;
		country = countryFactory.findByCode("FK");
		assert country != null;
		assert country.getCode().equals("FK")== true;
		assert country.getName().toUpperCase()
				.equals("FALKLAND ISLANDS (MALVINAS)")== true;
	}

	// ***** (FM) - Micronesia, Federated States Of
	@Test
	public void testMicronesiaFederatedStatesOf() {
		Country country = null;
		country = countryFactory.findByCode("FM");
		assert country != null;
		assert country.getCode().equals("FM")== true;
		assert country.getName().toUpperCase()
				.equals("MICRONESIA, FEDERATED STATES OF")== true;
	}

	// ***** (FO) - Faroe Islands
	@Test
	public void testFaroeIslands() {
		Country country = null;
		country = countryFactory.findByCode("FO");
		assert country != null;
		assert country.getCode().equals("FO")== true;
		assert country.getName().toUpperCase().equals("FAROE ISLANDS")== true;
	}

	// ***** (FR) - France
	@Test
	public void testFrance() {
		Country country = null;
		country = countryFactory.findByCode("FR");
		assert country != null;
		assert country.getCode().equals("FR")== true;
		assert country.getName().toUpperCase().equals("FRANCE")== true;
	}

	// ***** (GA) - Gabon
	@Test
	public void testGabon() {
		Country country = null;
		country = countryFactory.findByCode("GA");
		assert country != null;
		assert country.getCode().equals("GA")== true;
		assert country.getName().toUpperCase().equals("GABON")== true;
	}

	// ***** (GB) - United Kingdom
	@Test
	public void testUnitedKingdom() {
		Country country = null;
		country = countryFactory.findByCode("GB");
		assert country != null;
		assert country.getCode().equals("GB")== true;
		assert country.getName().toUpperCase().equals("UNITED KINGDOM")== true;
	}

	// ***** (GD) - Grenada
	@Test
	public void testGrenada() {
		Country country = null;
		country = countryFactory.findByCode("GD");
		assert country != null;
		assert country.getCode().equals("GD")== true;
		assert country.getName().toUpperCase().equals("GRENADA")== true;
	}

	// ***** (GE) - Georgia
	@Test
	public void testGeorgia() {
		Country country = null;
		country = countryFactory.findByCode("GE");
		assert country != null;
		assert country.getCode().equals("GE")== true;
		assert country.getName().toUpperCase().equals("GEORGIA")== true;
	}

	// ***** (GF) - French Guiana
	@Test
	public void testFrenchGuiana() {
		Country country = null;
		country = countryFactory.findByCode("GF");
		assert country != null;
		assert country.getCode().equals("GF")== true;
		assert country.getName().toUpperCase().equals("FRENCH GUIANA")== true;
	}

	// ***** (GG) - Guernsey
	@Test
	public void testGuernsey() {
		Country country = null;
		country = countryFactory.findByCode("GG");
		assert country != null;
		assert country.getCode().equals("GG")== true;
		assert country.getName().toUpperCase().equals("GUERNSEY")== true;
	}

	// ***** (GH) - Ghana
	@Test
	public void testGhana() {
		Country country = null;
		country = countryFactory.findByCode("GH");
		assert country != null;
		assert country.getCode().equals("GH")== true;
		assert country.getName().toUpperCase().equals("GHANA")== true;
	}

	// ***** (GI) - Gibraltar
	@Test
	public void testGibraltar() {
		Country country = null;
		country = countryFactory.findByCode("GI");
		assert country != null;
		assert country.getCode().equals("GI")== true;
		assert country.getName().toUpperCase().equals("GIBRALTAR")== true;
	}

	// ***** (GL) - Greenland
	@Test
	public void testGreenland() {
		Country country = null;
		country = countryFactory.findByCode("GL");
		assert country != null;
		assert country.getCode().equals("GL")== true;
		assert country.getName().toUpperCase().equals("GREENLAND")== true;
	}

	// ***** (GM) - Gambia
	@Test
	public void testGambia() {
		Country country = null;
		country = countryFactory.findByCode("GM");
		assert country != null;
		assert country.getCode().equals("GM")== true;
		assert country.getName().toUpperCase().equals("GAMBIA")== true;
	}

	// ***** (GN) - Guinea
	@Test
	public void testGuinea() {
		Country country = null;
		country = countryFactory.findByCode("GN");
		assert country != null;
		assert country.getCode().equals("GN")== true;
		assert country.getName().toUpperCase().equals("GUINEA")== true;
	}

	// ***** (GP) - Guadeloupe
	@Test
	public void testGuadeloupe() {
		Country country = null;
		country = countryFactory.findByCode("GP");
		assert country != null;
		assert country.getCode().equals("GP")== true;
		assert country.getName().toUpperCase().equals("GUADELOUPE")== true;
	}

	// ***** (GQ) - Equatorial Guinea
	@Test
	public void testEquatorialGuinea() {
		Country country = null;
		country = countryFactory.findByCode("GQ");
		assert country != null;
		assert country.getCode().equals("GQ")== true;
		assert country.getName().toUpperCase().equals("EQUATORIAL GUINEA")== true;
	}

	// ***** (GR) - Greece
	@Test
	public void testGreece() {
		Country country = null;
		country = countryFactory.findByCode("GR");
		assert country != null;
		assert country.getCode().equals("GR")== true;
		assert country.getName().toUpperCase().equals("GREECE")== true;
	}

	// ***** (GS) - South Georgia And The South Sandwich Islands
	@Test
	public void testSouthGeorgiaAndTheSouthSandwichIslands() {
		Country country = null;
		country = countryFactory.findByCode("GS");
		assert country != null;
		assert country.getCode().equals("GS")== true;
		assert country.getName().toUpperCase()
				.equals("SOUTH GEORGIA AND THE SOUTH SANDWICH ISLANDS")== true;
	}

	// ***** (GT) - Guatemala
	@Test
	public void testGuatemala() {
		Country country = null;
		country = countryFactory.findByCode("GT");
		assert country != null;
		assert country.getCode().equals("GT")== true;
		assert country.getName().toUpperCase().equals("GUATEMALA")== true;
	}

	// ***** (GU) - Guam
	@Test
	public void testGuam() {
		Country country = null;
		country = countryFactory.findByCode("GU");
		assert country != null;
		assert country.getCode().equals("GU")== true;
		assert country.getName().toUpperCase().equals("GUAM")== true;
	}

	// ***** (GW) - Guinea-Bissau
	@Test
	public void testGuineaBissau() {
		Country country = null;
		country = countryFactory.findByCode("GW");
		assert country != null;
		assert country.getCode().equals("GW")== true;
		assert country.getName().toUpperCase().equals("GUINEA-BISSAU")== true;
	}

	// ***** (GY) - Guyana
	@Test
	public void testGuyana() {
		Country country = null;
		country = countryFactory.findByCode("GY");
		assert country != null;
		assert country.getCode().equals("GY")== true;
		assert country.getName().toUpperCase().equals("GUYANA")== true;
	}

	// ***** (HK) - Hong Kong
	@Test
	public void testHongKong() {
		Country country = null;
		country = countryFactory.findByCode("HK");
		assert country != null;
		assert country.getCode().equals("HK")== true;
		assert country.getName().toUpperCase().equals("HONG KONG")== true;
	}

	// ***** (HM) - Heard Island And Mcdonald Islands
	@Test
	public void testHeardIslandAndMcdonaldIslands() {
		Country country = null;
		country = countryFactory.findByCode("HM");
		assert country != null;
		assert country.getCode().equals("HM")== true;
		assert country.getName().toUpperCase()
				.equals("HEARD ISLAND AND MCDONALD ISLANDS")== true;
	}

	// ***** (HN) - Honduras
	@Test
	public void testHonduras() {
		Country country = null;
		country = countryFactory.findByCode("HN");
		assert country != null;
		assert country.getCode().equals("HN")== true;
		assert country.getName().toUpperCase().equals("HONDURAS")== true;
	}

	// ***** (HR) - Croatia
	@Test
	public void testCroatia() {
		Country country = null;
		country = countryFactory.findByCode("HR");
		assert country != null;
		assert country.getCode().equals("HR")== true;
		assert country.getName().toUpperCase().equals("CROATIA")== true;
	}

	// ***** (HT) - Haiti
	@Test
	public void testHaiti() {
		Country country = null;
		country = countryFactory.findByCode("HT");
		assert country != null;
		assert country.getCode().equals("HT")== true;
		assert country.getName().toUpperCase().equals("HAITI")== true;
	}

	// ***** (HU) - Hungary
	@Test
	public void testHungary() {
		Country country = null;
		country = countryFactory.findByCode("HU");
		assert country != null;
		assert country.getCode().equals("HU")== true;
		assert country.getName().toUpperCase().equals("HUNGARY")== true;
	}

	// ***** (ID) - Indonesia
	@Test
	public void testIndonesia() {
		Country country = null;
		country = countryFactory.findByCode("ID");
		assert country != null;
		assert country.getCode().equals("ID")== true;
		assert country.getName().toUpperCase().equals("INDONESIA")== true;
	}

	// ***** (IE) - Ireland
	@Test
	public void testIreland() {
		Country country = null;
		country = countryFactory.findByCode("IE");
		assert country != null;
		assert country.getCode().equals("IE")== true;
		assert country.getName().toUpperCase().equals("IRELAND")== true;
	}

	// ***** (IL) - Israel
	@Test
	public void testIsrael() {
		Country country = null;
		country = countryFactory.findByCode("IL");
		assert country != null;
		assert country.getCode().equals("IL")== true;
		assert country.getName().toUpperCase().equals("ISRAEL")== true;
	}

	// ***** (IM) - Isle Of Man
	@Test
	public void testIsleOfMan() {
		Country country = null;
		country = countryFactory.findByCode("IM");
		assert country != null;
		assert country.getCode().equals("IM")== true;
		assert country.getName().toUpperCase().equals("ISLE OF MAN")== true;
	}

	// ***** (IN) - India
	@Test
	public void testIndia() {
		Country country = null;
		country = countryFactory.findByCode("IN");
		assert country != null;
		assert country.getCode().equals("IN")== true;
		assert country.getName().toUpperCase().equals("INDIA")== true;
	}

	// ***** (IO) - British Indian Ocean Territory
	@Test
	public void testBritishIndianOceanTerritory() {
		Country country = null;
		country = countryFactory.findByCode("IO");
		assert country != null;
		assert country.getCode().equals("IO")== true;
		assert country.getName().toUpperCase()
				.equals("BRITISH INDIAN OCEAN TERRITORY")== true;
	}

	// ***** (IQ) - Iraq
	@Test
	public void testIraq() {
		Country country = null;
		country = countryFactory.findByCode("IQ");
		assert country != null;
		assert country.getCode().equals("IQ")== true;
		assert country.getName().toUpperCase().equals("IRAQ")== true;
	}

	// ***** (IR) - Iran, Islamic Republic Of
	@Test
	public void testIranIslamicRepublicOf() {
		Country country = null;
		country = countryFactory.findByCode("IR");
		assert country != null;
		assert country.getCode().equals("IR")== true;
		assert country.getName().toUpperCase()
				.equals("IRAN, ISLAMIC REPUBLIC OF")== true;
	}

	// ***** (IS) - Iceland
	@Test
	public void testIceland() {
		Country country = null;
		country = countryFactory.findByCode("IS");
		assert country != null;
		assert country.getCode().equals("IS")== true;
		assert country.getName().toUpperCase().equals("ICELAND")== true;
	}

	// ***** (IT) - Italy
	@Test
	public void testItaly() {
		Country country = null;
		country = countryFactory.findByCode("IT");
		assert country != null;
		assert country.getCode().equals("IT")== true;
		assert country.getName().toUpperCase().equals("ITALY")== true;
	}

	// ***** (JE) - Jersey
	@Test
	public void testJersey() {
		Country country = null;
		country = countryFactory.findByCode("JE");
		assert country != null;
		assert country.getCode().equals("JE")== true;
		assert country.getName().toUpperCase().equals("JERSEY")== true;
	}

	// ***** (JM) - Jamaica
	@Test
	public void testJamaica() {
		Country country = null;
		country = countryFactory.findByCode("JM");
		assert country != null;
		assert country.getCode().equals("JM")== true;
		assert country.getName().toUpperCase().equals("JAMAICA")== true;
	}

	// ***** (JO) - Jordan
	@Test
	public void testJordan() {
		Country country = null;
		country = countryFactory.findByCode("JO");
		assert country != null;
		assert country.getCode().equals("JO")== true;
		assert country.getName().toUpperCase().equals("JORDAN")== true;
	}

	// ***** (JP) - Japan
	@Test
	public void testJapan() {
		Country country = null;
		country = countryFactory.findByCode("JP");
		assert country != null;
		assert country.getCode().equals("JP")== true;
		assert country.getName().toUpperCase().equals("JAPAN")== true;
	}

	// ***** (KE) - Kenya
	@Test
	public void testKenya() {
		Country country = null;
		country = countryFactory.findByCode("KE");
		assert country != null;
		assert country.getCode().equals("KE")== true;
		assert country.getName().toUpperCase().equals("KENYA")== true;
	}

	// ***** (KG) - Kyrgyzstan
	@Test
	public void testKyrgyzstan() {
		Country country = null;
		country = countryFactory.findByCode("KG");
		assert country != null;
		assert country.getCode().equals("KG")== true;
		assert country.getName().toUpperCase().equals("KYRGYZSTAN")== true;
	}

	// ***** (KH) - Cambodia
	@Test
	public void testCambodia() {
		Country country = null;
		country = countryFactory.findByCode("KH");
		assert country != null;
		assert country.getCode().equals("KH")== true;
		assert country.getName().toUpperCase().equals("CAMBODIA")== true;
	}

	// ***** (KI) - Kiribati
	@Test
	public void testKiribati() {
		Country country = null;
		country = countryFactory.findByCode("KI");
		assert country != null;
		assert country.getCode().equals("KI")== true;
		assert country.getName().toUpperCase().equals("KIRIBATI")== true;
	}

	// ***** (KM) - Comoros
	@Test
	public void testComoros() {
		Country country = null;
		country = countryFactory.findByCode("KM");
		assert country != null;
		assert country.getCode().equals("KM")== true;
		assert country.getName().toUpperCase().equals("COMOROS")== true;
	}

	// ***** (KN) - Saint Kitts And Nevis
	@Test
	public void testSaintKittsAndNevis() {
		Country country = null;
		country = countryFactory.findByCode("KN");
		assert country != null;
		assert country.getCode().equals("KN")== true;
		assert country.getName().toUpperCase()
				.equals("SAINT KITTS AND NEVIS")== true;
	}

	// ***** (KP) - Korea, Democratic People'S Republic Of
	@Test
	public void testKoreaDemocraticPeopleSRepublicOf() {
		Country country = null;
		country = countryFactory.findByCode("KP");
		assert country != null;
		assert country.getCode().equals("KP")== true;
		assert country.getName().toUpperCase()
				.equals("KOREA, DEMOCRATIC PEOPLE'S REPUBLIC OF")== true;
	}

	// ***** (KR) - Korea, Republic Of
	@Test
	public void testKoreaRepublicOf() {
		Country country = null;
		country = countryFactory.findByCode("KR");
		assert country != null;
		assert country.getCode().equals("KR")== true;
		assert country.getName().toUpperCase().equals("KOREA, REPUBLIC OF")== true;
	}

	// ***** (KW) - Kuwait
	@Test
	public void testKuwait() {
		Country country = null;
		country = countryFactory.findByCode("KW");
		assert country != null;
		assert country.getCode().equals("KW")== true;
		assert country.getName().toUpperCase().equals("KUWAIT")== true;
	}

	// ***** (KY) - Cayman Islands
	@Test
	public void testCaymanIslands() {
		Country country = null;
		country = countryFactory.findByCode("KY");
		assert country != null;
		assert country.getCode().equals("KY")== true;
		assert country.getName().toUpperCase().equals("CAYMAN ISLANDS")== true;
	}

	// ***** (KZ) - Kazakhstan
	@Test
	public void testKazakhstan() {
		Country country = null;
		country = countryFactory.findByCode("KZ");
		assert country != null;
		assert country.getCode().equals("KZ")== true;
		assert country.getName().toUpperCase().equals("KAZAKHSTAN")== true;
	}

	// ***** (LA) - Lao People'S Democratic Republic
	@Test
	public void testLaoPeopleSDemocraticRepublic() {
		Country country = null;
		country = countryFactory.findByCode("LA");
		assert country != null;
		assert country.getCode().equals("LA")== true;
		assert country.getName().toUpperCase()
				.equals("LAO PEOPLE'S DEMOCRATIC REPUBLIC")== true;
	}

	// ***** (LB) - Lebanon
	@Test
	public void testLebanon() {
		Country country = null;
		country = countryFactory.findByCode("LB");
		assert country != null;
		assert country.getCode().equals("LB")== true;
		assert country.getName().toUpperCase().equals("LEBANON")== true;
	}

	// ***** (LC) - Saint Lucia
	@Test
	public void testSaintLucia() {
		Country country = null;
		country = countryFactory.findByCode("LC");
		assert country != null;
		assert country.getCode().equals("LC")== true;
		assert country.getName().toUpperCase().equals("SAINT LUCIA")== true;
	}

	// ***** (LI) - Liechtenstein
	@Test
	public void testLiechtenstein() {
		Country country = null;
		country = countryFactory.findByCode("LI");
		assert country != null;
		assert country.getCode().equals("LI")== true;
		assert country.getName().toUpperCase().equals("LIECHTENSTEIN")== true;
	}

	// ***** (LK) - Sri Lanka
	@Test
	public void testSriLanka() {
		Country country = null;
		country = countryFactory.findByCode("LK");
		assert country != null;
		assert country.getCode().equals("LK")== true;
		assert country.getName().toUpperCase().equals("SRI LANKA")== true;
	}

	// ***** (LR) - Liberia
	@Test
	public void testLiberia() {
		Country country = null;
		country = countryFactory.findByCode("LR");
		assert country != null;
		assert country.getCode().equals("LR")== true;
		assert country.getName().toUpperCase().equals("LIBERIA")== true;
	}

	// ***** (LS) - Lesotho
	@Test
	public void testLesotho() {
		Country country = null;
		country = countryFactory.findByCode("LS");
		assert country != null;
		assert country.getCode().equals("LS")== true;
		assert country.getName().toUpperCase().equals("LESOTHO")== true;
	}

	// ***** (LT) - Lithuania
	@Test
	public void testLithuania() {
		Country country = null;
		country = countryFactory.findByCode("LT");
		assert country != null;
		assert country.getCode().equals("LT")== true;
		assert country.getName().toUpperCase().equals("LITHUANIA")== true;
	}

	// ***** (LU) - Luxembourg
	@Test
	public void testLuxembourg() {
		Country country = null;
		country = countryFactory.findByCode("LU");
		assert country != null;
		assert country.getCode().equals("LU")== true;
		assert country.getName().toUpperCase().equals("LUXEMBOURG")== true;
	}

	// ***** (LV) - Latvia
	@Test
	public void testLatvia() {
		Country country = null;
		country = countryFactory.findByCode("LV");
		assert country != null;
		assert country.getCode().equals("LV")== true;
		assert country.getName().toUpperCase().equals("LATVIA")== true;
	}

	// ***** (LY) - Libyan Arab Jamahiriya
	@Test
	public void testLibyanArabJamahiriya() {
		Country country = null;
		country = countryFactory.findByCode("LY");
		assert country != null;
		assert country.getCode().equals("LY")== true;
		assert country.getName().toUpperCase()
				.equals("LIBYAN ARAB JAMAHIRIYA")== true;
	}

	// ***** (MA) - Morocco
	@Test
	public void testMorocco() {
		Country country = null;
		country = countryFactory.findByCode("MA");
		assert country != null;
		assert country.getCode().equals("MA")== true;
		assert country.getName().toUpperCase().equals("MOROCCO")== true;
	}

	// ***** (MC) - Monaco
	@Test
	public void testMonaco() {
		Country country = null;
		country = countryFactory.findByCode("MC");
		assert country != null;
		assert country.getCode().equals("MC")== true;
		assert country.getName().toUpperCase().equals("MONACO")== true;
	}

	// ***** (MD) - Moldova, Republic Of
	@Test
	public void testMoldovaRepublicOf() {
		Country country = null;
		country = countryFactory.findByCode("MD");
		assert country != null;
		assert country.getCode().equals("MD")== true;
		assert country.getName().toUpperCase()
				.equals("MOLDOVA, REPUBLIC OF")== true;
	}

	// ***** (ME) - Montenegro
	@Test
	public void testMontenegro() {
		Country country = null;
		country = countryFactory.findByCode("ME");
		assert country != null;
		assert country.getCode().equals("ME")== true;
		assert country.getName().toUpperCase().equals("MONTENEGRO")== true;
	}

	// ***** (MF) - Saint Martin
	@Test
	public void testSaintMartin() {
		Country country = null;
		country = countryFactory.findByCode("MF");
		assert country != null;
		assert country.getCode().equals("MF")== true;
		assert country.getName().toUpperCase().equals("SAINT MARTIN")== true;
	}

	// ***** (MG) - Madagascar
	@Test
	public void testMadagascar() {
		Country country = null;
		country = countryFactory.findByCode("MG");
		assert country != null;
		assert country.getCode().equals("MG")== true;
		assert country.getName().toUpperCase().equals("MADAGASCAR")== true;
	}

	// ***** (MH) - Marshall Islands
	@Test
	public void testMarshallIslands() {
		Country country = null;
		country = countryFactory.findByCode("MH");
		assert country != null;
		assert country.getCode().equals("MH")== true;
		assert country.getName().toUpperCase().equals("MARSHALL ISLANDS")== true;
	}

	// ***** (MK) - Macedonia, The Former Yugoslav Republic Of
	@Test
	public void testMacedoniaTheFormerYugoslavRepublicOf() {
		Country country = null;
		country = countryFactory.findByCode("MK");
		assert country != null;
		assert country.getCode().equals("MK")== true;
		assert country.getName().toUpperCase()
				.equals("MACEDONIA, THE FORMER YUGOSLAV REPUBLIC OF")== true;
	}

	// ***** (ML) - Mali
	@Test
	public void testMali() {
		Country country = null;
		country = countryFactory.findByCode("ML");
		assert country != null;
		assert country.getCode().equals("ML")== true;
		assert country.getName().toUpperCase().equals("MALI")== true;
	}

	// ***** (MM) - Myanmar
	@Test
	public void testMyanmar() {
		Country country = null;
		country = countryFactory.findByCode("MM");
		assert country != null;
		assert country.getCode().equals("MM")== true;
		assert country.getName().toUpperCase().equals("MYANMAR")== true;
	}

	// ***** (MN) - Mongolia
	@Test
	public void testMongolia() {
		Country country = null;
		country = countryFactory.findByCode("MN");
		assert country != null;
		assert country.getCode().equals("MN")== true;
		assert country.getName().toUpperCase().equals("MONGOLIA")== true;
	}

	// ***** (MO) - Macao
	@Test
	public void testMacao() {
		Country country = null;
		country = countryFactory.findByCode("MO");
		assert country != null;
		assert country.getCode().equals("MO")== true;
		assert country.getName().toUpperCase().equals("MACAO")== true;
	}

	// ***** (MP) - Northern Mariana Islands
	@Test
	public void testNorthernMarianaIslands() {
		Country country = null;
		country = countryFactory.findByCode("MP");
		assert country != null;
		assert country.getCode().equals("MP")== true;
		assert country.getName().toUpperCase()
				.equals("NORTHERN MARIANA ISLANDS")== true;
	}

	// ***** (MQ) - Martinique
	@Test
	public void testMartinique() {
		Country country = null;
		country = countryFactory.findByCode("MQ");
		assert country != null;
		assert country.getCode().equals("MQ")== true;
		assert country.getName().toUpperCase().equals("MARTINIQUE")== true;
	}

	// ***** (MR) - Mauritania
	@Test
	public void testMauritania() {
		Country country = null;
		country = countryFactory.findByCode("MR");
		assert country != null;
		assert country.getCode().equals("MR")== true;
		assert country.getName().toUpperCase().equals("MAURITANIA")== true;
	}

	// ***** (MS) - Montserrat
	@Test
	public void testMontserrat() {
		Country country = null;
		country = countryFactory.findByCode("MS");
		assert country != null;
		assert country.getCode().equals("MS")== true;
		assert country.getName().toUpperCase().equals("MONTSERRAT")== true;
	}

	// ***** (MT) - Malta
	@Test
	public void testMalta() {
		Country country = null;
		country = countryFactory.findByCode("MT");
		assert country != null;
		assert country.getCode().equals("MT")== true;
		assert country.getName().toUpperCase().equals("MALTA")== true;
	}

	// ***** (MU) - Mauritius
	@Test
	public void testMauritius() {
		Country country = null;
		country = countryFactory.findByCode("MU");
		assert country != null;
		assert country.getCode().equals("MU")== true;
		assert country.getName().toUpperCase().equals("MAURITIUS")== true;
	}

	// ***** (MV) - Maldives
	@Test
	public void testMaldives() {
		Country country = null;
		country = countryFactory.findByCode("MV");
		assert country != null;
		assert country.getCode().equals("MV")== true;
		assert country.getName().toUpperCase().equals("MALDIVES")== true;
	}

	// ***** (MW) - Malawi
	@Test
	public void testMalawi() {
		Country country = null;
		country = countryFactory.findByCode("MW");
		assert country != null;
		assert country.getCode().equals("MW")== true;
		assert country.getName().toUpperCase().equals("MALAWI")== true;
	}

	// ***** (MX) - Mexico
	@Test
	public void testMexico() {
		Country country = null;
		country = countryFactory.findByCode("MX");
		assert country != null;
		assert country.getCode().equals("MX")== true;
		assert country.getName().toUpperCase().equals("MEXICO")== true;
	}

	// ***** (MY) - Malaysia
	@Test
	public void testMalaysia() {
		Country country = null;
		country = countryFactory.findByCode("MY");
		assert country != null;
		assert country.getCode().equals("MY")== true;
		assert country.getName().toUpperCase().equals("MALAYSIA")== true;
	}

	// ***** (MZ) - Mozambique
	@Test
	public void testMozambique() {
		Country country = null;
		country = countryFactory.findByCode("MZ");
		assert country != null;
		assert country.getCode().equals("MZ")== true;
		assert country.getName().toUpperCase().equals("MOZAMBIQUE")== true;
	}

	// ***** (NA) - Namibia
	@Test
	public void testNamibia() {
		Country country = null;
		country = countryFactory.findByCode("NA");
		assert country != null;
		assert country.getCode().equals("NA")== true;
		assert country.getName().toUpperCase().equals("NAMIBIA")== true;
	}

	// ***** (NC) - New Caledonia
	@Test
	public void testNewCaledonia() {
		Country country = null;
		country = countryFactory.findByCode("NC");
		assert country != null;
		assert country.getCode().equals("NC")== true;
		assert country.getName().toUpperCase().equals("NEW CALEDONIA")== true;
	}

	// ***** (NE) - Niger
	@Test
	public void testNiger() {
		Country country = null;
		country = countryFactory.findByCode("NE");
		assert country != null;
		assert country.getCode().equals("NE")== true;
		assert country.getName().toUpperCase().equals("NIGER")== true;
	}

	// ***** (NF) - Norfolk Island
	@Test
	public void testNorfolkIsland() {
		Country country = null;
		country = countryFactory.findByCode("NF");
		assert country != null;
		assert country.getCode().equals("NF")== true;
		assert country.getName().toUpperCase().equals("NORFOLK ISLAND")== true;
	}

	// ***** (NG) - Nigeria
	@Test
	public void testNigeria() {
		Country country = null;
		country = countryFactory.findByCode("NG");
		assert country != null;
		assert country.getCode().equals("NG")== true;
		assert country.getName().toUpperCase().equals("NIGERIA")== true;
	}

	// ***** (NI) - Nicaragua
	@Test
	public void testNicaragua() {
		Country country = null;
		country = countryFactory.findByCode("NI");
		assert country != null;
		assert country.getCode().equals("NI")== true;
		assert country.getName().toUpperCase().equals("NICARAGUA")== true;
	}

	// ***** (NL) - Netherlands
	@Test
	public void testNetherlands() {
		Country country = null;
		country = countryFactory.findByCode("NL");
		assert country != null;
		assert country.getCode().equals("NL")== true;
		assert country.getName().toUpperCase().equals("NETHERLANDS")== true;
	}

	// ***** (NO) - Norway
	@Test
	public void testNorway() {
		Country country = null;
		country = countryFactory.findByCode("NO");
		assert country != null;
		assert country.getCode().equals("NO")== true;
		assert country.getName().toUpperCase().equals("NORWAY")== true;
	}

	// ***** (NP) - Nepal
	@Test
	public void testNepal() {
		Country country = null;
		country = countryFactory.findByCode("NP");
		assert country != null;
		assert country.getCode().equals("NP")== true;
		assert country.getName().toUpperCase().equals("NEPAL")== true;
	}

	// ***** (NR) - Nauru
	@Test
	public void testNauru() {
		Country country = null;
		country = countryFactory.findByCode("NR");
		assert country != null;
		assert country.getCode().equals("NR")== true;
		assert country.getName().toUpperCase().equals("NAURU")== true;
	}

	// ***** (NU) - Niue
	@Test
	public void testNiue() {
		Country country = null;
		country = countryFactory.findByCode("NU");
		assert country != null;
		assert country.getCode().equals("NU")== true;
		assert country.getName().toUpperCase().equals("NIUE")== true;
	}

	// ***** (NZ) - New Zealand
	@Test
	public void testNewZealand() {
		Country country = null;
		country = countryFactory.findByCode("NZ");
		assert country != null;
		assert country.getCode().equals("NZ")== true;
		assert country.getName().toUpperCase().equals("NEW ZEALAND")== true;
	}

	// ***** (OM) - Oman
	@Test
	public void testOman() {
		Country country = null;
		country = countryFactory.findByCode("OM");
		assert country != null;
		assert country.getCode().equals("OM")== true;
		assert country.getName().toUpperCase().equals("OMAN")== true;
	}

	// ***** (PA) - Panama
	@Test
	public void testPanama() {
		Country country = null;
		country = countryFactory.findByCode("PA");
		assert country != null;
		assert country.getCode().equals("PA")== true;
		assert country.getName().toUpperCase().equals("PANAMA")== true;
	}

	// ***** (PE) - Peru
	@Test
	public void testPeru() {
		Country country = null;
		country = countryFactory.findByCode("PE");
		assert country != null;
		assert country.getCode().equals("PE")== true;
		assert country.getName().toUpperCase().equals("PERU")== true;
	}

	// ***** (PF) - French Polynesia
	@Test
	public void testFrenchPolynesia() {
		Country country = null;
		country = countryFactory.findByCode("PF");
		assert country != null;
		assert country.getCode().equals("PF")== true;
		assert country.getName().toUpperCase().equals("FRENCH POLYNESIA")== true;
	}

	// ***** (PG) - Papua New Guinea
	@Test
	public void testPapuaNewGuinea() {
		Country country = null;
		country = countryFactory.findByCode("PG");
		assert country != null;
		assert country.getCode().equals("PG")== true;
		assert country.getName().toUpperCase().equals("PAPUA NEW GUINEA")== true;
	}

	// ***** (PH) - Philippines
	@Test
	public void testPhilippines() {
		Country country = null;
		country = countryFactory.findByCode("PH");
		assert country != null;
		assert country.getCode().equals("PH")== true;
		assert country.getName().toUpperCase().equals("PHILIPPINES")== true;
	}

	// ***** (PK) - Pakistan
	@Test
	public void testPakistan() {
		Country country = null;
		country = countryFactory.findByCode("PK");
		assert country != null;
		assert country.getCode().equals("PK")== true;
		assert country.getName().toUpperCase().equals("PAKISTAN")== true;
	}

	// ***** (PL) - Poland
	@Test
	public void testPoland() {
		Country country = null;
		country = countryFactory.findByCode("PL");
		assert country != null;
		assert country.getCode().equals("PL")== true;
		assert country.getName().toUpperCase().equals("POLAND")== true;
	}

	// ***** (PM) - Saint Pierre And Miquelon
	@Test
	public void testSaintPierreAndMiquelon() {
		Country country = null;
		country = countryFactory.findByCode("PM");
		assert country != null;
		assert country.getCode().equals("PM")== true;
		assert country.getName().toUpperCase()
				.equals("SAINT PIERRE AND MIQUELON")== true;
	}

	// ***** (PN) - Pitcairn
	@Test
	public void testPitcairn() {
		Country country = null;
		country = countryFactory.findByCode("PN");
		assert country != null;
		assert country.getCode().equals("PN")== true;
		assert country.getName().toUpperCase().equals("PITCAIRN")== true;
	}

	// ***** (PR) - Puerto Rico
	@Test
	public void testPuertoRico() {
		Country country = null;
		country = countryFactory.findByCode("PR");
		assert country != null;
		assert country.getCode().equals("PR")== true;
		assert country.getName().toUpperCase().equals("PUERTO RICO")== true;
	}

	// ***** (PS) - Palestinian Territory, Occupied
	@Test
	public void testPalestinianTerritoryOccupied() {
		Country country = null;
		country = countryFactory.findByCode("PS");
		assert country != null;
		assert country.getCode().equals("PS")== true;
		assert country.getName().toUpperCase()
				.equals("PALESTINIAN TERRITORY, OCCUPIED")== true;
	}

	// ***** (PT) - Portugal
	@Test
	public void testPortugal() {
		Country country = null;
		country = countryFactory.findByCode("PT");
		assert country != null;
		assert country.getCode().equals("PT")== true;
		assert country.getName().toUpperCase().equals("PORTUGAL")== true;
	}

	// ***** (PW) - Palau
	@Test
	public void testPalau() {
		Country country = null;
		country = countryFactory.findByCode("PW");
		assert country != null;
		assert country.getCode().equals("PW")== true;
		assert country.getName().toUpperCase().equals("PALAU")== true;
	}

	// ***** (PY) - Paraguay
	@Test
	public void testParaguay() {
		Country country = null;
		country = countryFactory.findByCode("PY");
		assert country != null;
		assert country.getCode().equals("PY")== true;
		assert country.getName().toUpperCase().equals("PARAGUAY")== true;
	}

	// ***** (QA) - Qatar
	@Test
	public void testQatar() {
		Country country = null;
		country = countryFactory.findByCode("QA");
		assert country != null;
		assert country.getCode().equals("QA")== true;
		assert country.getName().toUpperCase().equals("QATAR")== true;
	}

	// ***** (RE) - Reunion
	public void eunion() {
		Country country = null;
		country = countryFactory.findByCode("RE");
		assert country != null;
		assert country.getCode().equals("RE")== true;
		assert country.getName().toUpperCase().equals("R\u00c9UNION")== true;
	}

	// ***** (RO) - Romania
	@Test
	public void testRomania() {
		Country country = null;
		country = countryFactory.findByCode("RO");
		assert country != null;
		assert country.getCode().equals("RO")== true;
		assert country.getName().toUpperCase().equals("ROMANIA")== true;
	}

	// ***** (RS) - Serbia
	@Test
	public void testSerbia() {
		Country country = null;
		country = countryFactory.findByCode("RS");
		assert country != null;
		assert country.getCode().equals("RS")== true;
		assert country.getName().toUpperCase().equals("SERBIA")== true;
	}

	// ***** (RU) - Russian Federation
	@Test
	public void testRussianFederation() {
		Country country = null;
		country = countryFactory.findByCode("RU");
		assert country != null;
		assert country.getCode().equals("RU")== true;
		assert country.getName().toUpperCase().equals("RUSSIAN FEDERATION")== true;
	}

	// ***** (RW) - Rwanda
	@Test
	public void testRwanda() {
		Country country = null;
		country = countryFactory.findByCode("RW");
		assert country != null;
		assert country.getCode().equals("RW")== true;
		assert country.getName().toUpperCase().equals("RWANDA")== true;
	}

	// ***** (SA) - Saudi Arabia
	@Test
	public void testSaudiArabia() {
		Country country = null;
		country = countryFactory.findByCode("SA");
		assert country != null;
		assert country.getCode().equals("SA")== true;
		assert country.getName().toUpperCase().equals("SAUDI ARABIA")== true;
	}

	// ***** (SB) - Solomon Islands
	@Test
	public void testSolomonIslands() {
		Country country = null;
		country = countryFactory.findByCode("SB");
		assert country != null;
		assert country.getCode().equals("SB")== true;
		assert country.getName().toUpperCase().equals("SOLOMON ISLANDS")== true;
	}

	// ***** (SC) - Seychelles
	@Test
	public void testSeychelles() {
		Country country = null;
		country = countryFactory.findByCode("SC");
		assert country != null;
		assert country.getCode().equals("SC")== true;
		assert country.getName().toUpperCase().equals("SEYCHELLES")== true;
	}

	// ***** (SD) - Sudan
	@Test
	public void testSudan() {
		Country country = null;
		country = countryFactory.findByCode("SD");
		assert country != null;
		assert country.getCode().equals("SD")== true;
		assert country.getName().toUpperCase().equals("SUDAN")== true;
	}

	// ***** (SE) - Sweden
	@Test
	public void testSweden() {
		Country country = null;
		country = countryFactory.findByCode("SE");
		assert country != null;
		assert country.getCode().equals("SE")== true;
		assert country.getName().toUpperCase().equals("SWEDEN")== true;
	}

	// ***** (HOLY SEE) - Vatican City State
	@Test
	public void testVaticanCityState() {
		Country country = null;
		country = countryFactory.findByCode("VA");
		assert country != null;
		assert country.getCode().equals("VA")== true;
		assert country.getName().toUpperCase().equals("VATICAN CITY STATE")== true;
	}

	// ***** (SG) - Singapore
	@Test
	public void testSingapore() {
		Country country = null;
		country = countryFactory.findByCode("SG");
		assert country != null;
		assert country.getCode().equals("SG")== true;
		assert country.getName().toUpperCase().equals("SINGAPORE")== true;
	}

	// ***** (SH) - Saint Helena
	@Test
	public void testSaintHelena() {
		Country country = null;
		country = countryFactory.findByCode("SH");
		assert country != null;
		assert country.getCode().equals("SH")== true;
		assert country.getName().toUpperCase().equals("SAINT HELENA")== true;
	}

	// ***** (SI) - Slovenia
	@Test
	public void testSlovenia() {
		Country country = null;
		country = countryFactory.findByCode("SI");
		assert country != null;
		assert country.getCode().equals("SI")== true;
		assert country.getName().toUpperCase().equals("SLOVENIA")== true;
	}

	// ***** (SJ) - Svalbard And Jan Mayen
	@Test
	public void testSvalbardAndJanMayen() {
		Country country = null;
		country = countryFactory.findByCode("SJ");
		assert country != null;
		assert country.getCode().equals("SJ")== true;
		assert country.getName().toUpperCase()
				.equals("SVALBARD AND JAN MAYEN")== true;
	}

	// ***** (SK) - Slovakia
	@Test
	public void testSlovakia() {
		Country country = null;
		country = countryFactory.findByCode("SK");
		assert country != null;
		assert country.getCode().equals("SK")== true;
		assert country.getName().toUpperCase().equals("SLOVAKIA")== true;
	}

	// ***** (SL) - Sierra Leone
	@Test
	public void testSierraLeone() {
		Country country = null;
		country = countryFactory.findByCode("SL");
		assert country != null;
		assert country.getCode().equals("SL")== true;
		assert country.getName().toUpperCase().equals("SIERRA LEONE")== true;
	}

	// ***** (SM) - San Marino
	@Test
	public void testSanMarino() {
		Country country = null;
		country = countryFactory.findByCode("SM");
		assert country != null;
		assert country.getCode().equals("SM")== true;
		assert country.getName().toUpperCase().equals("SAN MARINO")== true;
	}

	// ***** (SN) - Senegal
	@Test
	public void testSenegal() {
		Country country = null;
		country = countryFactory.findByCode("SN");
		assert country != null;
		assert country.getCode().equals("SN")== true;
		assert country.getName().toUpperCase().equals("SENEGAL")== true;
	}

	// ***** (SO) - Somalia
	@Test
	public void testSomalia() {
		Country country = null;
		country = countryFactory.findByCode("SO");
		assert country != null;
		assert country.getCode().equals("SO")== true;
		assert country.getName().toUpperCase().equals("SOMALIA")== true;
	}

	// ***** (SR) - Suriname
	@Test
	public void testSuriname() {
		Country country = null;
		country = countryFactory.findByCode("SR");
		assert country != null;
		assert country.getCode().equals("SR")== true;
		assert country.getName().toUpperCase().equals("SURINAME")== true;
	}

	// ***** (ST) - Sao Tome And Principe
	@Test
	public void testSaoTomeAndPrincipe() {
		Country country = null;
		country = countryFactory.findByCode("ST");
		assert country != null;
		assert country.getCode().equals("ST")== true;
		assert country.getName().toUpperCase()
				.equals("SAO TOME AND PRINCIPE")== true;
	}

	// ***** (SV) - El Salvador
	@Test
	public void testElSalvador() {
		Country country = null;
		country = countryFactory.findByCode("SV");
		assert country != null;
		assert country.getCode().equals("SV")== true;
		assert country.getName().toUpperCase().equals("EL SALVADOR")== true;
	}

	// ***** (SY) - Syrian Arab Republic
	@Test
	public void testSyrianArabRepublic() {
		Country country = null;
		country = countryFactory.findByCode("SY");
		assert country != null;
		assert country.getCode().equals("SY")== true;
		assert country.getName().toUpperCase()
				.equals("SYRIAN ARAB REPUBLIC")== true;
	}

	// ***** (SZ) - Swaziland
	@Test
	public void testSwaziland() {
		Country country = null;
		country = countryFactory.findByCode("SZ");
		assert country != null;
		assert country.getCode().equals("SZ")== true;
		assert country.getName().toUpperCase().equals("SWAZILAND")== true;
	}

	// ***** (TC) - Turks And Caicos Islands
	@Test
	public void testTurksAndCaicosIslands() {
		Country country = null;
		country = countryFactory.findByCode("TC");
		assert country != null;
		assert country.getCode().equals("TC")== true;
		assert country.getName().toUpperCase()
				.equals("TURKS AND CAICOS ISLANDS")== true;
	}

	// ***** (TD) - Chad
	@Test
	public void testChad() {
		Country country = null;
		country = countryFactory.findByCode("TD");
		assert country != null;
		assert country.getCode().equals("TD")== true;
		assert country.getName().toUpperCase().equals("CHAD")== true;
	}

	// ***** (TF) - French Southern Territories
	@Test
	public void testFrenchSouthernTerritories() {
		Country country = null;
		country = countryFactory.findByCode("TF");
		assert country != null;
		assert country.getCode().equals("TF")== true;
		assert country.getName().toUpperCase()
				.equals("FRENCH SOUTHERN TERRITORIES")== true;
	}

	// ***** (TG) - Togo
	@Test
	public void testTogo() {
		Country country = null;
		country = countryFactory.findByCode("TG");
		assert country != null;
		assert country.getCode().equals("TG")== true;
		assert country.getName().toUpperCase().equals("TOGO")== true;
	}

	// ***** (TH) - Thailand
	@Test
	public void testThailand() {
		Country country = null;
		country = countryFactory.findByCode("TH");
		assert country != null;
		assert country.getCode().equals("TH")== true;
		assert country.getName().toUpperCase().equals("THAILAND")== true;
	}

	// ***** (TJ) - Tajikistan
	@Test
	public void testTajikistan() {
		Country country = null;
		country = countryFactory.findByCode("TJ");
		assert country != null;
		assert country.getCode().equals("TJ")== true;
		assert country.getName().toUpperCase().equals("TAJIKISTAN")== true;
	}

	// ***** (TK) - Tokelau
	@Test
	public void testTokelau() {
		Country country = null;
		country = countryFactory.findByCode("TK");
		assert country != null;
		assert country.getCode().equals("TK")== true;
		assert country.getName().toUpperCase().equals("TOKELAU")== true;
	}

	// ***** (TL) - Timor-Leste
	@Test
	public void testTimorLeste() {
		Country country = null;
		country = countryFactory.findByCode("TL");
		assert country != null;
		assert country.getCode().equals("TL")== true;
		assert country.getName().toUpperCase().equals("TIMOR-LESTE")== true;
	}

	// ***** (TM) - Turkmenistan
	@Test
	public void testTurkmenistan() {
		Country country = null;
		country = countryFactory.findByCode("TM");
		assert country != null;
		assert country.getCode().equals("TM")== true;
		assert country.getName().toUpperCase().equals("TURKMENISTAN")== true;
	}

	// ***** (TN) - Tunisia
	@Test
	public void testTunisia() {
		Country country = null;
		country = countryFactory.findByCode("TN");
		assert country != null;
		assert country.getCode().equals("TN")== true;
		assert country.getName().toUpperCase().equals("TUNISIA")== true;
	}

	// ***** (TO) - Tonga
	@Test
	public void testTonga() {
		Country country = null;
		country = countryFactory.findByCode("TO");
		assert country != null;
		assert country.getCode().equals("TO")== true;
		assert country.getName().toUpperCase().equals("TONGA")== true;
	}

	// ***** (TR) - Turkey
	@Test
	public void testTurkey() {
		Country country = null;
		country = countryFactory.findByCode("TR");
		assert country != null;
		assert country.getCode().equals("TR")== true;
		assert country.getName().toUpperCase().equals("TURKEY")== true;
	}

	// ***** (TT) - Trinidad And Tobago
	@Test
	public void testTrinidadAndTobago() {
		Country country = null;
		country = countryFactory.findByCode("TT");
		assert country != null;
		assert country.getCode().equals("TT")== true;
		assert country.getName().toUpperCase()
				.equals("TRINIDAD AND TOBAGO")== true;
	}

	// ***** (TV) - Tuvalu
	@Test
	public void testTuvalu() {
		Country country = null;
		country = countryFactory.findByCode("TV");
		assert country != null;
		assert country.getCode().equals("TV")== true;
		assert country.getName().toUpperCase().equals("TUVALU")== true;
	}

	// ***** (TW) - Taiwan, Province Of China
	@Test
	public void testTaiwanProvinceOfChina() {
		Country country = null;
		country = countryFactory.findByCode("TW");
		assert country != null;
		assert country.getCode().equals("TW")== true;
		assert country.getName().toUpperCase()
				.equals("TAIWAN, PROVINCE OF CHINA")== true;
	}

	// ***** (TZ) - Tanzania, United Republic Of
	@Test
	public void testTanzaniaUnitedRepublicOf() {
		Country country = null;
		country = countryFactory.findByCode("TZ");
		assert country != null;
		assert country.getCode().equals("TZ")== true;
		assert country.getName().toUpperCase()
				.equals("TANZANIA, UNITED REPUBLIC OF")== true;
	}

	// ***** (UA) - Ukraine
	@Test
	public void testUkraine() {
		Country country = null;
		country = countryFactory.findByCode("UA");
		assert country != null;
		assert country.getCode().equals("UA")== true;
		assert country.getName().toUpperCase().equals("UKRAINE")== true;
	}

	// ***** (UG) - Uganda
	@Test
	public void testUganda() {
		Country country = null;
		country = countryFactory.findByCode("UG");
		assert country != null;
		assert country.getCode().equals("UG")== true;
		assert country.getName().toUpperCase().equals("UGANDA")== true;
	}

	// ***** (UM) - United States Minor Outlying Islands
	@Test
	public void testUnitedStatesMinorOutlyingIslands() {
		Country country = null;
		country = countryFactory.findByCode("UM");
		assert country != null;
		assert country.getCode().equals("UM")== true;
		assert country.getName().toUpperCase()
				.equals("UNITED STATES MINOR OUTLYING ISLANDS")== true;
	}

	// ***** (US) - United States
	@Test
	public void testUnitedStates() {
		Country country = null;
		country = countryFactory.findByCode("US");
		assert country != null;
		assert country.getCode().equals("US")== true;
		assert country.getName().toUpperCase().equals("UNITED STATES")== true;
	}

	// ***** (UY) - Uruguay
	@Test
	public void testUruguay() {
		Country country = null;
		country = countryFactory.findByCode("UY");
		assert country != null;
		assert country.getCode().equals("UY")== true;
		assert country.getName().toUpperCase().equals("URUGUAY")== true;
	}

	// ***** (UZ) - Uzbekistan
	@Test
	public void testUzbekistan() {
		Country country = null;
		country = countryFactory.findByCode("UZ");
		assert country != null;
		assert country.getCode().equals("UZ")== true;
		assert country.getName().toUpperCase().equals("UZBEKISTAN")== true;
	}

	// ***** (VA) - Vatican City State
	@Test
	public void testHolySeeVaticanCityState() {
		Country country = null;
		country = countryFactory.findByCode("VA");
		assert country != null;
		assert country.getCode().equals("VA")== true;
		assert country.getName().toUpperCase()
				.equals("VATICAN CITY STATE")== true;
	}

	// ***** (VC) - Saint Vincent And The Grenadines
	@Test
	public void testSaintVincentAndTheGrenadines() {
		Country country = null;
		country = countryFactory.findByCode("VC");
		assert country != null;
		assert country.getCode().equals("VC")== true;
		assert country.getName().toUpperCase()
				.equals("SAINT VINCENT AND THE GRENADINES")== true;
	}

	// ***** (VE) - Venezuela, Bolivarian Republic Of
	@Test
	public void testVenezuelaBolivarianRepublicOf() {
		Country country = null;
		country = countryFactory.findByCode("VE");
		assert country != null;
		assert country.getCode().equals("VE")== true;
		assert country.getName().toUpperCase()
				.equals("VENEZUELA, BOLIVARIAN REPUBLIC OF")== true;
	}

	// ***** (VG) - Virgin Islands, British
	@Test
	public void testVirginIslandsBritish() {
		Country country = null;
		country = countryFactory.findByCode("VG");
		assert country != null;
		assert country.getCode().equals("VG")== true;
		assert country.getName().toUpperCase()
				.equals("VIRGIN ISLANDS, BRITISH")== true;
	}

	// ***** (VI) - Virgin Islands, U.S.
	@Test
	public void testVirginIslandsUS() {
		Country country = null;
		country = countryFactory.findByCode("VI");
		assert country != null;
		assert country.getCode().equals("VI")== true;
		assert country.getName().toUpperCase()
				.equals("VIRGIN ISLANDS, U.S.")== true;
	}

	// ***** (VN) - Viet Nam
	@Test
	public void testVietNam() {
		Country country = null;
		country = countryFactory.findByCode("VN");
		assert country != null;
		assert country.getCode().equals("VN")== true;
		assert country.getName().toUpperCase().equals("VIET NAM")== true;
	}

	// ***** (VU) - Vanuatu
	@Test
	public void testVanuatu() {
		Country country = null;
		country = countryFactory.findByCode("VU");
		assert country != null;
		assert country.getCode().equals("VU")== true;
		assert country.getName().toUpperCase().equals("VANUATU")== true;
	}

	// ***** (WF) - Wallis And Futuna
	@Test
	public void testWallisAndFutuna() {
		Country country = null;
		country = countryFactory.findByCode("WF");
		assert country != null;
		assert country.getCode().equals("WF")== true;
		assert country.getName().toUpperCase().equals("WALLIS AND FUTUNA")== true;
	}

	// ***** (WS) - Samoa
	@Test
	public void testSamoa() {
		Country country = null;
		country = countryFactory.findByCode("WS");
		assert country != null;
		assert country.getCode().equals("WS")== true;
		assert country.getName().toUpperCase().equals("SAMOA")== true;
	}

	// ***** (YE) - Yemen
	@Test
	public void testYemen() {
		Country country = null;
		country = countryFactory.findByCode("YE");
		assert country != null;
		assert country.getCode().equals("YE")== true;
		assert country.getName().toUpperCase().equals("YEMEN")== true;
	}

	// ***** (YT) - Mayotte
	@Test
	public void testMayotte() {
		Country country = null;
		country = countryFactory.findByCode("YT");
		assert country != null;
		assert country.getCode().equals("YT")== true;
		assert country.getName().toUpperCase().equals("MAYOTTE")== true;
	}

	// ***** (ZA) - South Africa
	@Test
	public void testSouthAfrica() {
		Country country = null;
		country = countryFactory.findByCode("ZA");
		assert country != null;
		assert country.getCode().equals("ZA")== true;
		assert country.getName().toUpperCase().equals("SOUTH AFRICA")== true;
	}

	// ***** (ZM) - Zambia
	@Test
	public void testZambia() {
		Country country = null;
		country = countryFactory.findByCode("ZM");
		assert country != null;
		assert country.getCode().equals("ZM")== true;
		assert country.getName().toUpperCase().equals("ZAMBIA")== true;
	}

	// ***** (ZW) - Zimbabwe
	@Test
	public void testZimbabwe() {
		Country country = null;
		country = countryFactory.findByCode("ZW");
		assert country != null;
		assert country.getCode().equals("ZW")== true;
		assert country.getName().toUpperCase().equals("ZIMBABWE")== true;
	}
}