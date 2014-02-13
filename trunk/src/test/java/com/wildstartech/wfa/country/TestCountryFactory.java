/*
 * Copyright (c) 2001 - 2013 Wildstar Technologies, LLC.
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
 *      1453 Riverview Run Lane
 *      Suwanee, GA 30024
 *      USA
 *
 *      derek.berube@wildstartech.com
 *      www.wildstartech.com
 */
package com.wildstartech.wfa.country;

import junit.framework.TestCase;
/**
 * Test the <code>CountryFactory</code> to validate ISO3166 compliance.
 * 
 * @author Derek Berube, Wildstar Technologies, LLC.
 */
public class TestCountryFactory extends TestCase {
	private CountryFactory countryFactory;
	/**
	 * Obtain a reference to the <code>CountryFactory</code>.
	 */
	public void setup() {
		this.countryFactory=CountryFactory.getInstance();
	}
	
	/**
	 * Cleanup after test execution.
	 */
	public void tearDown() {
		this.countryFactory=null;
	}
	
	// ***** (AD) - Andorra
	public void testAndorra() {
		Country country = null;
		country = countryFactory.findByCode("AD");
		assertTrue(country.getCode().equals("AD"));
		assertTrue(country.getName().toUpperCase().equals("ANDORRA"));
	}

	// ***** (AE) - United Arab Emirates
	public void testUnitedArabEmirates() {
		Country country = null;
		country = countryFactory.findByCode("AE");
		assertTrue(country.getCode().equals("AE"));
		assertTrue(country.getName().toUpperCase().equals(
				"UNITED ARAB EMIRATES"));
	}

	// ***** (AF) - Afghanistan
	public void testAfghanistan() {
		Country country = null;
		country = countryFactory.findByCode("AF");
		assertTrue(country.getCode().equals("AF"));
		assertTrue(country.getName().toUpperCase().equals("AFGHANISTAN"));
	}

	// ***** (AG) - Antigua And Barbuda
	public void testAntiguaAndBarbuda() {
		Country country = null;
		country = countryFactory.findByCode("AG");
		assertTrue(country.getCode().equals("AG"));
		assertTrue(country.getName().toUpperCase()
				.equals("ANTIGUA AND BARBUDA"));
	}

	// ***** (AI) - Anguilla
	public void testAnguilla() {
		Country country = null;
		country = countryFactory.findByCode("AI");
		assertTrue(country.getCode().equals("AI"));
		assertTrue(country.getName().toUpperCase().equals("ANGUILLA"));
	}

	// ***** (AL) - Albania
	public void testAlbania() {
		Country country = null;
		country = countryFactory.findByCode("AL");
		assertTrue(country.getCode().equals("AL"));
		assertTrue(country.getName().toUpperCase().equals("ALBANIA"));
	}

	// ***** (AM) - Armenia
	public void testArmenia() {
		Country country = null;
		country = countryFactory.findByCode("AM");
		assertTrue(country.getCode().equals("AM"));
		assertTrue(country.getName().toUpperCase().equals("ARMENIA"));
	}

	// ***** (AN) - Netherlands Antilles
	public void testNetherlandsAntilles() {
		Country country = null;
		country = countryFactory.findByCode("AN");
		assertTrue(country.getCode().equals("AN"));
		assertTrue(country.getName().toUpperCase().equals(
				"NETHERLANDS ANTILLES"));
	}

	// ***** (AO) - Angola
	public void testAngola() {
		Country country = null;
		country = countryFactory.findByCode("AO");
		assertTrue(country.getCode().equals("AO"));
		assertTrue(country.getName().toUpperCase().equals("ANGOLA"));
	}

	// ***** (AQ) - Antarctica
	public void testAntarctica() {
		Country country = null;
		country = countryFactory.findByCode("AQ");
		assertTrue(country.getCode().equals("AQ"));
		assertTrue(country.getName().toUpperCase().equals("ANTARCTICA"));
	}

	// ***** (AR) - Argentina
	public void testArgentina() {
		Country country = null;
		country = countryFactory.findByCode("AR");
		assertTrue(country.getCode().equals("AR"));
		assertTrue(country.getName().toUpperCase().equals("ARGENTINA"));
	}

	// ***** (AS) - American Samoa
	public void testAmericanSamoa() {
		Country country = null;
		country = countryFactory.findByCode("AS");
		assertTrue(country.getCode().equals("AS"));
		assertTrue(country.getName().toUpperCase().equals("AMERICAN SAMOA"));
	}

	// ***** (AT) - Austria
	public void testAustria() {
		Country country = null;
		country = countryFactory.findByCode("AT");
		assertTrue(country.getCode().equals("AT"));
		assertTrue(country.getName().toUpperCase().equals("AUSTRIA"));
	}

	// ***** (AU) - Australia
	public void testAustralia() {
		Country country = null;
		country = countryFactory.findByCode("AU");
		assertTrue(country.getCode().equals("AU"));
		assertTrue(country.getName().toUpperCase().equals("AUSTRALIA"));
	}

	// ***** (AW) - Aruba
	public void testAruba() {
		Country country = null;
		country = countryFactory.findByCode("AW");
		assertTrue(country.getCode().equals("AW"));
		assertTrue(country.getName().toUpperCase().equals("ARUBA"));
	}

	// ***** (AX) - land Islands
	public void testAlandIslands() {
		Country country = null;
		country = countryFactory.findByCode("AX");
		assertTrue(country.getCode().equals("AX"));
		assertTrue(country.getName().toUpperCase().equals("\u00c5LAND ISLANDS"));
	}

	// ***** (AZ) - Azerbaijan
	public void testAzerbaijan() {
		Country country = null;
		country = countryFactory.findByCode("AZ");
		assertTrue(country.getCode().equals("AZ"));
		assertTrue(country.getName().toUpperCase().equals("AZERBAIJAN"));
	}

	// ***** (BA) - Bosnia And Herzegovina
	public void testBosniaAndHerzegovina() {
		Country country = null;
		country = countryFactory.findByCode("BA");
		assertTrue(country.getCode().equals("BA"));
		assertTrue(country.getName().toUpperCase().equals(
				"BOSNIA AND HERZEGOVINA"));
	}

	// ***** (BB) - Barbados
	public void testBarbados() {
		Country country = null;
		country = countryFactory.findByCode("BB");
		assertTrue(country.getCode().equals("BB"));
		assertTrue(country.getName().toUpperCase().equals("BARBADOS"));
	}

	// ***** (BD) - Bangladesh
	public void testBangladesh() {
		Country country = null;
		country = countryFactory.findByCode("BD");
		assertTrue(country.getCode().equals("BD"));
		assertTrue(country.getName().toUpperCase().equals("BANGLADESH"));
	}

	// ***** (BE) - Belgium
	public void testBelgium() {
		Country country = null;
		country = countryFactory.findByCode("BE");
		assertTrue(country.getCode().equals("BE"));
		assertTrue(country.getName().toUpperCase().equals("BELGIUM"));
	}

	// ***** (BF) - Burkina Faso
	public void testBurkinaFaso() {
		Country country = null;
		country = countryFactory.findByCode("BF");
		assertTrue(country.getCode().equals("BF"));
		assertTrue(country.getName().toUpperCase().equals("BURKINA FASO"));
	}

	// ***** (BG) - Bulgaria
	public void testBulgaria() {
		Country country = null;
		country = countryFactory.findByCode("BG");
		assertTrue(country.getCode().equals("BG"));
		assertTrue(country.getName().toUpperCase().equals("BULGARIA"));
	}

	// ***** (BH) - Bahrain
	public void testBahrain() {
		Country country = null;
		country = countryFactory.findByCode("BH");
		assertTrue(country.getCode().equals("BH"));
		assertTrue(country.getName().toUpperCase().equals("BAHRAIN"));
	}

	// ***** (BI) - Burundi
	public void testBurundi() {
		Country country = null;
		country = countryFactory.findByCode("BI");
		assertTrue(country.getCode().equals("BI"));
		assertTrue(country.getName().toUpperCase().equals("BURUNDI"));
	}

	// ***** (BJ) - Benin
	public void testBenin() {
		Country country = null;
		country = countryFactory.findByCode("BJ");
		assertTrue(country.getCode().equals("BJ"));
		assertTrue(country.getName().toUpperCase().equals("BENIN"));
	}

	// ***** (BL) - Saint Barthelemy
	public void testSaintBarthelemy() {
		Country country = null;
		country = countryFactory.findByCode("BL");
		assertTrue(country.getCode().equals("BL"));
		assertTrue(country.getName().toUpperCase().equals("SAINT BARTH\u00c9LEMY"));
	}

	// ***** (BM) - Bermuda
	public void testBermuda() {
		Country country = null;
		country = countryFactory.findByCode("BM");
		assertTrue(country.getCode().equals("BM"));
		assertTrue(country.getName().toUpperCase().equals("BERMUDA"));
	}

	// ***** (BN) - Brunei Darussalam
	public void testBruneiDarussalam() {
		Country country = null;
		country = countryFactory.findByCode("BN");
		assertTrue(country.getCode().equals("BN"));
		assertTrue(country.getName().toUpperCase().equals("BRUNEI DARUSSALAM"));
	}

	// ***** (BO) - Bolivia, Plurinational State Of
	public void testBoliviaPlurinationalStateOf() {
		Country country = null;
		country = countryFactory.findByCode("BO");
		assertTrue(country.getCode().equals("BO"));
		assertTrue(country.getName().toUpperCase().equals(
				"BOLIVIA, PLURINATIONAL STATE OF"));
	}

	// ***** (BR) - Brazil
	public void testBrazil() {
		Country country = null;
		country = countryFactory.findByCode("BR");
		assertTrue(country.getCode().equals("BR"));
		assertTrue(country.getName().toUpperCase().equals("BRAZIL"));
	}

	// ***** (BS) - Bahamas
	public void testBahamas() {
		Country country = null;
		country = countryFactory.findByCode("BS");
		assertTrue(country.getCode().equals("BS"));
		assertTrue(country.getName().toUpperCase().equals("BAHAMAS"));
	}

	// ***** (BT) - Bhutan
	public void testBhutan() {
		Country country = null;
		country = countryFactory.findByCode("BT");
		assertTrue(country.getCode().equals("BT"));
		assertTrue(country.getName().toUpperCase().equals("BHUTAN"));
	}

	// ***** (BV) - Bouvet Island
	public void testBouvetIsland() {
		Country country = null;
		country = countryFactory.findByCode("BV");
		assertTrue(country.getCode().equals("BV"));
		assertTrue(country.getName().toUpperCase().equals("BOUVET ISLAND"));
	}

	// ***** (BW) - Botswana
	public void testBotswana() {
		Country country = null;
		country = countryFactory.findByCode("BW");
		assertTrue(country.getCode().equals("BW"));
		assertTrue(country.getName().toUpperCase().equals("BOTSWANA"));
	}

	// ***** (BY) - Belarus
	public void testBelarus() {
		Country country = null;
		country = countryFactory.findByCode("BY");
		assertTrue(country.getCode().equals("BY"));
		assertTrue(country.getName().toUpperCase().equals("BELARUS"));
	}

	// ***** (BZ) - Belize
	public void testBelize() {
		Country country = null;
		country = countryFactory.findByCode("BZ");
		assertTrue(country.getCode().equals("BZ"));
		assertTrue(country.getName().toUpperCase().equals("BELIZE"));
	}

	// ***** (CA) - Canada
	public void testCanada() {
		Country country = null;
		country = countryFactory.findByCode("CA");
		assertTrue(country.getCode().equals("CA"));
		assertTrue(country.getName().toUpperCase().equals("CANADA"));
	}

	// ***** (CC) - Cocos (Keeling) Islands
	public void testCocosKeelingIslands() {
		Country country = null;
		country = countryFactory.findByCode("CC");
		assertTrue(country.getCode().equals("CC"));
		assertTrue(country.getName().toUpperCase().equals(
				"COCOS (KEELING) ISLANDS"));
	}

	// ***** (CD) - Congo, The Democratic Republic Of The
	public void testCongoTheDemocraticRepublicOfThe() {
		Country country = null;
		country = countryFactory.findByCode("CD");
		assertTrue(country.getCode().equals("CD"));
		assertTrue(country.getName().toUpperCase().equals(
				"CONGO, THE DEMOCRATIC REPUBLIC OF THE"));
	}

	// ***** (CF) - Central African Republic
	public void testCentralAfricanRepublic() {
		Country country = null;
		country = countryFactory.findByCode("CF");
		assertTrue(country.getCode().equals("CF"));
		assertTrue(country.getName().toUpperCase().equals(
				"CENTRAL AFRICAN REPUBLIC"));
	}

	// ***** (CG) - Congo
	public void testCongo() {
		Country country = null;
		country = countryFactory.findByCode("CG");
		assertTrue(country.getCode().equals("CG"));
		assertTrue(country.getName().toUpperCase().equals("CONGO"));
	}

	// ***** (CH) - Switzerland
	public void testSwitzerland() {
		Country country = null;
		country = countryFactory.findByCode("CH");
		assertTrue(country.getCode().equals("CH"));
		assertTrue(country.getName().toUpperCase().equals("SWITZERLAND"));
	}

	// ***** (CI) - Cote D'Ivoire
	public void testCoteDIvoire() {
		Country country = null;
		country = countryFactory.findByCode("CI");
		assertTrue(country.getCode().equals("CI"));
		assertTrue(country.getName().toUpperCase().equals("C\u00d4TE D'IVOIRE"));
	}

	// ***** (CK) - Cook Islands
	public void testCookIslands() {
		Country country = null;
		country = countryFactory.findByCode("CK");
		assertTrue(country.getCode().equals("CK"));
		assertTrue(country.getName().toUpperCase().equals("COOK ISLANDS"));
	}

	// ***** (CL) - Chile
	public void testChile() {
		Country country = null;
		country = countryFactory.findByCode("CL");
		assertTrue(country.getCode().equals("CL"));
		assertTrue(country.getName().toUpperCase().equals("CHILE"));
	}

	// ***** (CM) - Cameroon
	public void testCameroon() {
		Country country = null;
		country = countryFactory.findByCode("CM");
		assertTrue(country.getCode().equals("CM"));
		assertTrue(country.getName().toUpperCase().equals("CAMEROON"));
	}

	// ***** (CN) - China
	public void testChina() {
		Country country = null;
		country = countryFactory.findByCode("CN");
		assertTrue(country.getCode().equals("CN"));
		assertTrue(country.getName().toUpperCase().equals("CHINA"));
	}

	// ***** (CO) - Colombia
	public void testColombia() {
		Country country = null;
		country = countryFactory.findByCode("CO");
		assertTrue(country.getCode().equals("CO"));
		assertTrue(country.getName().toUpperCase().equals("COLOMBIA"));
	}

	// ***** (CR) - Costa Rica
	public void testCostaRica() {
		Country country = null;
		country = countryFactory.findByCode("CR");
		assertTrue(country.getCode().equals("CR"));
		assertTrue(country.getName().toUpperCase().equals("COSTA RICA"));
	}

	// ***** (CU) - Cuba
	public void testCuba() {
		Country country = null;
		country = countryFactory.findByCode("CU");
		assertTrue(country.getCode().equals("CU"));
		assertTrue(country.getName().toUpperCase().equals("CUBA"));
	}

	// ***** (CV) - Cape Verde
	public void testCapeVerde() {
		Country country = null;
		country = countryFactory.findByCode("CV");
		assertTrue(country.getCode().equals("CV"));
		assertTrue(country.getName().toUpperCase().equals("CAPE VERDE"));
	}

	// ***** (CX) - Christmas Island
	public void testChristmasIsland() {
		Country country = null;
		country = countryFactory.findByCode("CX");
		assertTrue(country.getCode().equals("CX"));
		assertTrue(country.getName().toUpperCase().equals("CHRISTMAS ISLAND"));
	}

	// ***** (CY) - Cyprus
	public void testCyprus() {
		Country country = null;
		country = countryFactory.findByCode("CY");
		assertTrue(country.getCode().equals("CY"));
		assertTrue(country.getName().toUpperCase().equals("CYPRUS"));
	}

	// ***** (CZ) - Czech Republic
	public void testCzechRepublic() {
		Country country = null;
		country = countryFactory.findByCode("CZ");
		assertTrue(country.getCode().equals("CZ"));
		assertTrue(country.getName().toUpperCase().equals("CZECH REPUBLIC"));
	}

	// ***** (DE) - Germany
	public void testGermany() {
		Country country = null;
		country = countryFactory.findByCode("DE");
		assertTrue(country.getCode().equals("DE"));
		assertTrue(country.getName().toUpperCase().equals("GERMANY"));
	}

	// ***** (DJ) - Djibouti
	public void testDjibouti() {
		Country country = null;
		country = countryFactory.findByCode("DJ");
		assertTrue(country.getCode().equals("DJ"));
		assertTrue(country.getName().toUpperCase().equals("DJIBOUTI"));
	}

	// ***** (DK) - Denmark
	public void testDenmark() {
		Country country = null;
		country = countryFactory.findByCode("DK");
		assertTrue(country.getCode().equals("DK"));
		assertTrue(country.getName().toUpperCase().equals("DENMARK"));
	}

	// ***** (DM) - Dominica
	public void testDominica() {
		Country country = null;
		country = countryFactory.findByCode("DM");
		assertTrue(country.getCode().equals("DM"));
		assertTrue(country.getName().toUpperCase().equals("DOMINICA"));
	}

	// ***** (DO) - Dominican Republic
	public void testDominicanRepublic() {
		Country country = null;
		country = countryFactory.findByCode("DO");
		assertTrue(country.getCode().equals("DO"));
		assertTrue(country.getName().toUpperCase().equals("DOMINICAN REPUBLIC"));
	}

	// ***** (DZ) - Algeria
	public void testAlgeria() {
		Country country = null;
		country = countryFactory.findByCode("DZ");
		assertTrue(country.getCode().equals("DZ"));
		assertTrue(country.getName().toUpperCase().equals("ALGERIA"));
	}

	// ***** (EC) - Ecuador
	public void testEcuador() {
		Country country = null;
		country = countryFactory.findByCode("EC");
		assertTrue(country.getCode().equals("EC"));
		assertTrue(country.getName().toUpperCase().equals("ECUADOR"));
	}

	// ***** (EE) - Estonia
	public void testEstonia() {
		Country country = null;
		country = countryFactory.findByCode("EE");
		assertTrue(country.getCode().equals("EE"));
		assertTrue(country.getName().toUpperCase().equals("ESTONIA"));
	}

	// ***** (EG) - Egypt
	public void testEgypt() {
		Country country = null;
		country = countryFactory.findByCode("EG");
		assertTrue(country.getCode().equals("EG"));
		assertTrue(country.getName().toUpperCase().equals("EGYPT"));
	}

	// ***** (EH) - Western Sahara
	public void testWesternSahara() {
		Country country = null;
		country = countryFactory.findByCode("EH");
		assertTrue(country.getCode().equals("EH"));
		assertTrue(country.getName().toUpperCase().equals("WESTERN SAHARA"));
	}

	// ***** (ER) - Eritrea
	public void testEritrea() {
		Country country = null;
		country = countryFactory.findByCode("ER");
		assertTrue(country.getCode().equals("ER"));
		assertTrue(country.getName().toUpperCase().equals("ERITREA"));
	}

	// ***** (ES) - Spain
	public void testSpain() {
		Country country = null;
		country = countryFactory.findByCode("ES");
		assertTrue(country.getCode().equals("ES"));
		assertTrue(country.getName().toUpperCase().equals("SPAIN"));
	}

	// ***** (ET) - Ethiopia
	public void testEthiopia() {
		Country country = null;
		country = countryFactory.findByCode("ET");
		assertTrue(country.getCode().equals("ET"));
		assertTrue(country.getName().toUpperCase().equals("ETHIOPIA"));
	}

	// ***** (FI) - Finland
	public void testFinland() {
		Country country = null;
		country = countryFactory.findByCode("FI");
		assertTrue(country.getCode().equals("FI"));
		assertTrue(country.getName().toUpperCase().equals("FINLAND"));
	}

	// ***** (FJ) - Fiji
	public void testFiji() {
		Country country = null;
		country = countryFactory.findByCode("FJ");
		assertTrue(country.getCode().equals("FJ"));
		assertTrue(country.getName().toUpperCase().equals("FIJI"));
	}

	// ***** (FK) - Falkland Islands (Malvinas)
	public void testFalklandIslandsMalvinas() {
		Country country = null;
		country = countryFactory.findByCode("FK");
		assertTrue(country.getCode().equals("FK"));
		assertTrue(country.getName().toUpperCase().equals(
				"FALKLAND ISLANDS (MALVINAS)"));
	}

	// ***** (FM) - Micronesia, Federated States Of
	public void testMicronesiaFederatedStatesOf() {
		Country country = null;
		country = countryFactory.findByCode("FM");
		assertTrue(country.getCode().equals("FM"));
		assertTrue(country.getName().toUpperCase().equals(
				"MICRONESIA, FEDERATED STATES OF"));
	}

	// ***** (FO) - Faroe Islands
	public void testFaroeIslands() {
		Country country = null;
		country = countryFactory.findByCode("FO");
		assertTrue(country.getCode().equals("FO"));
		assertTrue(country.getName().toUpperCase().equals("FAROE ISLANDS"));
	}

	// ***** (FR) - France
	public void testFrance() {
		Country country = null;
		country = countryFactory.findByCode("FR");
		assertTrue(country.getCode().equals("FR"));
		assertTrue(country.getName().toUpperCase().equals("FRANCE"));
	}

	// ***** (GA) - Gabon
	public void testGabon() {
		Country country = null;
		country = countryFactory.findByCode("GA");
		assertTrue(country.getCode().equals("GA"));
		assertTrue(country.getName().toUpperCase().equals("GABON"));
	}

	// ***** (GB) - United Kingdom
	public void testUnitedKingdom() {
		Country country = null;
		country = countryFactory.findByCode("GB");
		assertTrue(country.getCode().equals("GB"));
		assertTrue(country.getName().toUpperCase().equals("UNITED KINGDOM"));
	}

	// ***** (GD) - Grenada
	public void testGrenada() {
		Country country = null;
		country = countryFactory.findByCode("GD");
		assertTrue(country.getCode().equals("GD"));
		assertTrue(country.getName().toUpperCase().equals("GRENADA"));
	}

	// ***** (GE) - Georgia
	public void testGeorgia() {
		Country country = null;
		country = countryFactory.findByCode("GE");
		assertTrue(country.getCode().equals("GE"));
		assertTrue(country.getName().toUpperCase().equals("GEORGIA"));
	}

	// ***** (GF) - French Guiana
	public void testFrenchGuiana() {
		Country country = null;
		country = countryFactory.findByCode("GF");
		assertTrue(country.getCode().equals("GF"));
		assertTrue(country.getName().toUpperCase().equals("FRENCH GUIANA"));
	}

	// ***** (GG) - Guernsey
	public void testGuernsey() {
		Country country = null;
		country = countryFactory.findByCode("GG");
		assertTrue(country.getCode().equals("GG"));
		assertTrue(country.getName().toUpperCase().equals("GUERNSEY"));
	}

	// ***** (GH) - Ghana
	public void testGhana() {
		Country country = null;
		country = countryFactory.findByCode("GH");
		assertTrue(country.getCode().equals("GH"));
		assertTrue(country.getName().toUpperCase().equals("GHANA"));
	}

	// ***** (GI) - Gibraltar
	public void testGibraltar() {
		Country country = null;
		country = countryFactory.findByCode("GI");
		assertTrue(country.getCode().equals("GI"));
		assertTrue(country.getName().toUpperCase().equals("GIBRALTAR"));
	}

	// ***** (GL) - Greenland
	public void testGreenland() {
		Country country = null;
		country = countryFactory.findByCode("GL");
		assertTrue(country.getCode().equals("GL"));
		assertTrue(country.getName().toUpperCase().equals("GREENLAND"));
	}

	// ***** (GM) - Gambia
	public void testGambia() {
		Country country = null;
		country = countryFactory.findByCode("GM");
		assertTrue(country.getCode().equals("GM"));
		assertTrue(country.getName().toUpperCase().equals("GAMBIA"));
	}

	// ***** (GN) - Guinea
	public void testGuinea() {
		Country country = null;
		country = countryFactory.findByCode("GN");
		assertTrue(country.getCode().equals("GN"));
		assertTrue(country.getName().toUpperCase().equals("GUINEA"));
	}

	// ***** (GP) - Guadeloupe
	public void testGuadeloupe() {
		Country country = null;
		country = countryFactory.findByCode("GP");
		assertTrue(country.getCode().equals("GP"));
		assertTrue(country.getName().toUpperCase().equals("GUADELOUPE"));
	}

	// ***** (GQ) - Equatorial Guinea
	public void testEquatorialGuinea() {
		Country country = null;
		country = countryFactory.findByCode("GQ");
		assertTrue(country.getCode().equals("GQ"));
		assertTrue(country.getName().toUpperCase().equals("EQUATORIAL GUINEA"));
	}

	// ***** (GR) - Greece
	public void testGreece() {
		Country country = null;
		country = countryFactory.findByCode("GR");
		assertTrue(country.getCode().equals("GR"));
		assertTrue(country.getName().toUpperCase().equals("GREECE"));
	}

	// ***** (GS) - South Georgia And The South Sandwich Islands
	public void testSouthGeorgiaAndTheSouthSandwichIslands() {
		Country country = null;
		country = countryFactory.findByCode("GS");
		assertTrue(country.getCode().equals("GS"));
		assertTrue(country.getName().toUpperCase().equals(
				"SOUTH GEORGIA AND THE SOUTH SANDWICH ISLANDS"));
	}

	// ***** (GT) - Guatemala
	public void testGuatemala() {
		Country country = null;
		country = countryFactory.findByCode("GT");
		assertTrue(country.getCode().equals("GT"));
		assertTrue(country.getName().toUpperCase().equals("GUATEMALA"));
	}

	// ***** (GU) - Guam
	public void testGuam() {
		Country country = null;
		country = countryFactory.findByCode("GU");
		assertTrue(country.getCode().equals("GU"));
		assertTrue(country.getName().toUpperCase().equals("GUAM"));
	}

	// ***** (GW) - Guinea-Bissau
	public void testGuineaBissau() {
		Country country = null;
		country = countryFactory.findByCode("GW");
		assertTrue(country.getCode().equals("GW"));
		assertTrue(country.getName().toUpperCase().equals("GUINEA-BISSAU"));
	}

	// ***** (GY) - Guyana
	public void testGuyana() {
		Country country = null;
		country = countryFactory.findByCode("GY");
		assertTrue(country.getCode().equals("GY"));
		assertTrue(country.getName().toUpperCase().equals("GUYANA"));
	}

	// ***** (HK) - Hong Kong
	public void testHongKong() {
		Country country = null;
		country = countryFactory.findByCode("HK");
		assertTrue(country.getCode().equals("HK"));
		assertTrue(country.getName().toUpperCase().equals("HONG KONG"));
	}

	// ***** (HM) - Heard Island And Mcdonald Islands
	public void testHeardIslandAndMcdonaldIslands() {
		Country country = null;
		country = countryFactory.findByCode("HM");
		assertTrue(country.getCode().equals("HM"));
		assertTrue(country.getName().toUpperCase().equals(
				"HEARD ISLAND AND MCDONALD ISLANDS"));
	}

	// ***** (HN) - Honduras
	public void testHonduras() {
		Country country = null;
		country = countryFactory.findByCode("HN");
		assertTrue(country.getCode().equals("HN"));
		assertTrue(country.getName().toUpperCase().equals("HONDURAS"));
	}

	// ***** (HR) - Croatia
	public void testCroatia() {
		Country country = null;
		country = countryFactory.findByCode("HR");
		assertTrue(country.getCode().equals("HR"));
		assertTrue(country.getName().toUpperCase().equals("CROATIA"));
	}

	// ***** (HT) - Haiti
	public void testHaiti() {
		Country country = null;
		country = countryFactory.findByCode("HT");
		assertTrue(country.getCode().equals("HT"));
		assertTrue(country.getName().toUpperCase().equals("HAITI"));
	}

	// ***** (HU) - Hungary
	public void testHungary() {
		Country country = null;
		country = countryFactory.findByCode("HU");
		assertTrue(country.getCode().equals("HU"));
		assertTrue(country.getName().toUpperCase().equals("HUNGARY"));
	}

	// ***** (ID) - Indonesia
	public void testIndonesia() {
		Country country = null;
		country = countryFactory.findByCode("ID");
		assertTrue(country.getCode().equals("ID"));
		assertTrue(country.getName().toUpperCase().equals("INDONESIA"));
	}

	// ***** (IE) - Ireland
	public void testIreland() {
		Country country = null;
		country = countryFactory.findByCode("IE");
		assertTrue(country.getCode().equals("IE"));
		assertTrue(country.getName().toUpperCase().equals("IRELAND"));
	}

	// ***** (IL) - Israel
	public void testIsrael() {
		Country country = null;
		country = countryFactory.findByCode("IL");
		assertTrue(country.getCode().equals("IL"));
		assertTrue(country.getName().toUpperCase().equals("ISRAEL"));
	}

	// ***** (IM) - Isle Of Man
	public void testIsleOfMan() {
		Country country = null;
		country = countryFactory.findByCode("IM");
		assertTrue(country.getCode().equals("IM"));
		assertTrue(country.getName().toUpperCase().equals("ISLE OF MAN"));
	}

	// ***** (IN) - India
	public void testIndia() {
		Country country = null;
		country = countryFactory.findByCode("IN");
		assertTrue(country.getCode().equals("IN"));
		assertTrue(country.getName().toUpperCase().equals("INDIA"));
	}

	// ***** (IO) - British Indian Ocean Territory
	public void testBritishIndianOceanTerritory() {
		Country country = null;
		country = countryFactory.findByCode("IO");
		assertTrue(country.getCode().equals("IO"));
		assertTrue(country.getName().toUpperCase().equals(
				"BRITISH INDIAN OCEAN TERRITORY"));
	}

	// ***** (IQ) - Iraq
	public void testIraq() {
		Country country = null;
		country = countryFactory.findByCode("IQ");
		assertTrue(country.getCode().equals("IQ"));
		assertTrue(country.getName().toUpperCase().equals("IRAQ"));
	}

	// ***** (IR) - Iran, Islamic Republic Of
	public void testIranIslamicRepublicOf() {
		Country country = null;
		country = countryFactory.findByCode("IR");
		assertTrue(country.getCode().equals("IR"));
		assertTrue(country.getName().toUpperCase().equals(
				"IRAN, ISLAMIC REPUBLIC OF"));
	}

	// ***** (IS) - Iceland
	public void testIceland() {
		Country country = null;
		country = countryFactory.findByCode("IS");
		assertTrue(country.getCode().equals("IS"));
		assertTrue(country.getName().toUpperCase().equals("ICELAND"));
	}

	// ***** (IT) - Italy
	public void testItaly() {
		Country country = null;
		country = countryFactory.findByCode("IT");
		assertTrue(country.getCode().equals("IT"));
		assertTrue(country.getName().toUpperCase().equals("ITALY"));
	}

	// ***** (JE) - Jersey
	public void testJersey() {
		Country country = null;
		country = countryFactory.findByCode("JE");
		assertTrue(country.getCode().equals("JE"));
		assertTrue(country.getName().toUpperCase().equals("JERSEY"));
	}

	// ***** (JM) - Jamaica
	public void testJamaica() {
		Country country = null;
		country = countryFactory.findByCode("JM");
		assertTrue(country.getCode().equals("JM"));
		assertTrue(country.getName().toUpperCase().equals("JAMAICA"));
	}

	// ***** (JO) - Jordan
	public void testJordan() {
		Country country = null;
		country = countryFactory.findByCode("JO");
		assertTrue(country.getCode().equals("JO"));
		assertTrue(country.getName().toUpperCase().equals("JORDAN"));
	}

	// ***** (JP) - Japan
	public void testJapan() {
		Country country = null;
		country = countryFactory.findByCode("JP");
		assertTrue(country.getCode().equals("JP"));
		assertTrue(country.getName().toUpperCase().equals("JAPAN"));
	}

	// ***** (KE) - Kenya
	public void testKenya() {
		Country country = null;
		country = countryFactory.findByCode("KE");
		assertTrue(country.getCode().equals("KE"));
		assertTrue(country.getName().toUpperCase().equals("KENYA"));
	}

	// ***** (KG) - Kyrgyzstan
	public void testKyrgyzstan() {
		Country country = null;
		country = countryFactory.findByCode("KG");
		assertTrue(country.getCode().equals("KG"));
		assertTrue(country.getName().toUpperCase().equals("KYRGYZSTAN"));
	}

	// ***** (KH) - Cambodia
	public void testCambodia() {
		Country country = null;
		country = countryFactory.findByCode("KH");
		assertTrue(country.getCode().equals("KH"));
		assertTrue(country.getName().toUpperCase().equals("CAMBODIA"));
	}

	// ***** (KI) - Kiribati
	public void testKiribati() {
		Country country = null;
		country = countryFactory.findByCode("KI");
		assertTrue(country.getCode().equals("KI"));
		assertTrue(country.getName().toUpperCase().equals("KIRIBATI"));
	}

	// ***** (KM) - Comoros
	public void testComoros() {
		Country country = null;
		country = countryFactory.findByCode("KM");
		assertTrue(country.getCode().equals("KM"));
		assertTrue(country.getName().toUpperCase().equals("COMOROS"));
	}

	// ***** (KN) - Saint Kitts And Nevis
	public void testSaintKittsAndNevis() {
		Country country = null;
		country = countryFactory.findByCode("KN");
		assertTrue(country.getCode().equals("KN"));
		assertTrue(country.getName().toUpperCase().equals(
				"SAINT KITTS AND NEVIS"));
	}

	// ***** (KP) - Korea, Democratic People'S Republic Of
	public void testKoreaDemocraticPeopleSRepublicOf() {
		Country country = null;
		country = countryFactory.findByCode("KP");
		assertTrue(country.getCode().equals("KP"));
		assertTrue(country.getName().toUpperCase().equals(
				"KOREA, DEMOCRATIC PEOPLE'S REPUBLIC OF"));
	}

	// ***** (KR) - Korea, Republic Of
	public void testKoreaRepublicOf() {
		Country country = null;
		country = countryFactory.findByCode("KR");
		assertTrue(country.getCode().equals("KR"));
		assertTrue(country.getName().toUpperCase().equals("KOREA, REPUBLIC OF"));
	}

	// ***** (KW) - Kuwait
	public void testKuwait() {
		Country country = null;
		country = countryFactory.findByCode("KW");
		assertTrue(country.getCode().equals("KW"));
		assertTrue(country.getName().toUpperCase().equals("KUWAIT"));
	}

	// ***** (KY) - Cayman Islands
	public void testCaymanIslands() {
		Country country = null;
		country = countryFactory.findByCode("KY");
		assertTrue(country.getCode().equals("KY"));
		assertTrue(country.getName().toUpperCase().equals("CAYMAN ISLANDS"));
	}

	// ***** (KZ) - Kazakhstan
	public void testKazakhstan() {
		Country country = null;
		country = countryFactory.findByCode("KZ");
		assertTrue(country.getCode().equals("KZ"));
		assertTrue(country.getName().toUpperCase().equals("KAZAKHSTAN"));
	}

	// ***** (LA) - Lao People'S Democratic Republic
	public void testLaoPeopleSDemocraticRepublic() {
		Country country = null;
		country = countryFactory.findByCode("LA");
		assertTrue(country.getCode().equals("LA"));
		assertTrue(country.getName().toUpperCase().equals(
				"LAO PEOPLE'S DEMOCRATIC REPUBLIC"));
	}

	// ***** (LB) - Lebanon
	public void testLebanon() {
		Country country = null;
		country = countryFactory.findByCode("LB");
		assertTrue(country.getCode().equals("LB"));
		assertTrue(country.getName().toUpperCase().equals("LEBANON"));
	}

	// ***** (LC) - Saint Lucia
	public void testSaintLucia() {
		Country country = null;
		country = countryFactory.findByCode("LC");
		assertTrue(country.getCode().equals("LC"));
		assertTrue(country.getName().toUpperCase().equals("SAINT LUCIA"));
	}

	// ***** (LI) - Liechtenstein
	public void testLiechtenstein() {
		Country country = null;
		country = countryFactory.findByCode("LI");
		assertTrue(country.getCode().equals("LI"));
		assertTrue(country.getName().toUpperCase().equals("LIECHTENSTEIN"));
	}

	// ***** (LK) - Sri Lanka
	public void testSriLanka() {
		Country country = null;
		country = countryFactory.findByCode("LK");
		assertTrue(country.getCode().equals("LK"));
		assertTrue(country.getName().toUpperCase().equals("SRI LANKA"));
	}

	// ***** (LR) - Liberia
	public void testLiberia() {
		Country country = null;
		country = countryFactory.findByCode("LR");
		assertTrue(country.getCode().equals("LR"));
		assertTrue(country.getName().toUpperCase().equals("LIBERIA"));
	}

	// ***** (LS) - Lesotho
	public void testLesotho() {
		Country country = null;
		country = countryFactory.findByCode("LS");
		assertTrue(country.getCode().equals("LS"));
		assertTrue(country.getName().toUpperCase().equals("LESOTHO"));
	}

	// ***** (LT) - Lithuania
	public void testLithuania() {
		Country country = null;
		country = countryFactory.findByCode("LT");
		assertTrue(country.getCode().equals("LT"));
		assertTrue(country.getName().toUpperCase().equals("LITHUANIA"));
	}

	// ***** (LU) - Luxembourg
	public void testLuxembourg() {
		Country country = null;
		country = countryFactory.findByCode("LU");
		assertTrue(country.getCode().equals("LU"));
		assertTrue(country.getName().toUpperCase().equals("LUXEMBOURG"));
	}

	// ***** (LV) - Latvia
	public void testLatvia() {
		Country country = null;
		country = countryFactory.findByCode("LV");
		assertTrue(country.getCode().equals("LV"));
		assertTrue(country.getName().toUpperCase().equals("LATVIA"));
	}

	// ***** (LY) - Libyan Arab Jamahiriya
	public void testLibyanArabJamahiriya() {
		Country country = null;
		country = countryFactory.findByCode("LY");
		assertTrue(country.getCode().equals("LY"));
		assertTrue(country.getName().toUpperCase().equals(
				"LIBYAN ARAB JAMAHIRIYA"));
	}

	// ***** (MA) - Morocco
	public void testMorocco() {
		Country country = null;
		country = countryFactory.findByCode("MA");
		assertTrue(country.getCode().equals("MA"));
		assertTrue(country.getName().toUpperCase().equals("MOROCCO"));
	}

	// ***** (MC) - Monaco
	public void testMonaco() {
		Country country = null;
		country = countryFactory.findByCode("MC");
		assertTrue(country.getCode().equals("MC"));
		assertTrue(country.getName().toUpperCase().equals("MONACO"));
	}

	// ***** (MD) - Moldova, Republic Of
	public void testMoldovaRepublicOf() {
		Country country = null;
		country = countryFactory.findByCode("MD");
		assertTrue(country.getCode().equals("MD"));
		assertTrue(country.getName().toUpperCase().equals(
				"MOLDOVA, REPUBLIC OF"));
	}

	// ***** (ME) - Montenegro
	public void testMontenegro() {
		Country country = null;
		country = countryFactory.findByCode("ME");
		assertTrue(country.getCode().equals("ME"));
		assertTrue(country.getName().toUpperCase().equals("MONTENEGRO"));
	}

	// ***** (MF) - Saint Martin
	public void testSaintMartin() {
		Country country = null;
		country = countryFactory.findByCode("MF");
		assertTrue(country.getCode().equals("MF"));
		assertTrue(country.getName().toUpperCase().equals("SAINT MARTIN"));
	}

	// ***** (MG) - Madagascar
	public void testMadagascar() {
		Country country = null;
		country = countryFactory.findByCode("MG");
		assertTrue(country.getCode().equals("MG"));
		assertTrue(country.getName().toUpperCase().equals("MADAGASCAR"));
	}

	// ***** (MH) - Marshall Islands
	public void testMarshallIslands() {
		Country country = null;
		country = countryFactory.findByCode("MH");
		assertTrue(country.getCode().equals("MH"));
		assertTrue(country.getName().toUpperCase().equals("MARSHALL ISLANDS"));
	}

	// ***** (MK) - Macedonia, The Former Yugoslav Republic Of
	public void testMacedoniaTheFormerYugoslavRepublicOf() {
		Country country = null;
		country = countryFactory.findByCode("MK");
		assertTrue(country.getCode().equals("MK"));
		assertTrue(country.getName().toUpperCase().equals(
				"MACEDONIA, THE FORMER YUGOSLAV REPUBLIC OF"));
	}

	// ***** (ML) - Mali
	public void testMali() {
		Country country = null;
		country = countryFactory.findByCode("ML");
		assertTrue(country.getCode().equals("ML"));
		assertTrue(country.getName().toUpperCase().equals("MALI"));
	}

	// ***** (MM) - Myanmar
	public void testMyanmar() {
		Country country = null;
		country = countryFactory.findByCode("MM");
		assertTrue(country.getCode().equals("MM"));
		assertTrue(country.getName().toUpperCase().equals("MYANMAR"));
	}

	// ***** (MN) - Mongolia
	public void testMongolia() {
		Country country = null;
		country = countryFactory.findByCode("MN");
		assertTrue(country.getCode().equals("MN"));
		assertTrue(country.getName().toUpperCase().equals("MONGOLIA"));
	}

	// ***** (MO) - Macao
	public void testMacao() {
		Country country = null;
		country = countryFactory.findByCode("MO");
		assertTrue(country.getCode().equals("MO"));
		assertTrue(country.getName().toUpperCase().equals("MACAO"));
	}

	// ***** (MP) - Northern Mariana Islands
	public void testNorthernMarianaIslands() {
		Country country = null;
		country = countryFactory.findByCode("MP");
		assertTrue(country.getCode().equals("MP"));
		assertTrue(country.getName().toUpperCase().equals(
				"NORTHERN MARIANA ISLANDS"));
	}

	// ***** (MQ) - Martinique
	public void testMartinique() {
		Country country = null;
		country = countryFactory.findByCode("MQ");
		assertTrue(country.getCode().equals("MQ"));
		assertTrue(country.getName().toUpperCase().equals("MARTINIQUE"));
	}

	// ***** (MR) - Mauritania
	public void testMauritania() {
		Country country = null;
		country = countryFactory.findByCode("MR");
		assertTrue(country.getCode().equals("MR"));
		assertTrue(country.getName().toUpperCase().equals("MAURITANIA"));
	}

	// ***** (MS) - Montserrat
	public void testMontserrat() {
		Country country = null;
		country = countryFactory.findByCode("MS");
		assertTrue(country.getCode().equals("MS"));
		assertTrue(country.getName().toUpperCase().equals("MONTSERRAT"));
	}

	// ***** (MT) - Malta
	public void testMalta() {
		Country country = null;
		country = countryFactory.findByCode("MT");
		assertTrue(country.getCode().equals("MT"));
		assertTrue(country.getName().toUpperCase().equals("MALTA"));
	}

	// ***** (MU) - Mauritius
	public void testMauritius() {
		Country country = null;
		country = countryFactory.findByCode("MU");
		assertTrue(country.getCode().equals("MU"));
		assertTrue(country.getName().toUpperCase().equals("MAURITIUS"));
	}

	// ***** (MV) - Maldives
	public void testMaldives() {
		Country country = null;
		country = countryFactory.findByCode("MV");
		assertTrue(country.getCode().equals("MV"));
		assertTrue(country.getName().toUpperCase().equals("MALDIVES"));
	}

	// ***** (MW) - Malawi
	public void testMalawi() {
		Country country = null;
		country = countryFactory.findByCode("MW");
		assertTrue(country.getCode().equals("MW"));
		assertTrue(country.getName().toUpperCase().equals("MALAWI"));
	}

	// ***** (MX) - Mexico
	public void testMexico() {
		Country country = null;
		country = countryFactory.findByCode("MX");
		assertTrue(country.getCode().equals("MX"));
		assertTrue(country.getName().toUpperCase().equals("MEXICO"));
	}

	// ***** (MY) - Malaysia
	public void testMalaysia() {
		Country country = null;
		country = countryFactory.findByCode("MY");
		assertTrue(country.getCode().equals("MY"));
		assertTrue(country.getName().toUpperCase().equals("MALAYSIA"));
	}

	// ***** (MZ) - Mozambique
	public void testMozambique() {
		Country country = null;
		country = countryFactory.findByCode("MZ");
		assertTrue(country.getCode().equals("MZ"));
		assertTrue(country.getName().toUpperCase().equals("MOZAMBIQUE"));
	}

	// ***** (NA) - Namibia
	public void testNamibia() {
		Country country = null;
		country = countryFactory.findByCode("NA");
		assertTrue(country.getCode().equals("NA"));
		assertTrue(country.getName().toUpperCase().equals("NAMIBIA"));
	}

	// ***** (NC) - New Caledonia
	public void testNewCaledonia() {
		Country country = null;
		country = countryFactory.findByCode("NC");
		assertTrue(country.getCode().equals("NC"));
		assertTrue(country.getName().toUpperCase().equals("NEW CALEDONIA"));
	}

	// ***** (NE) - Niger
	public void testNiger() {
		Country country = null;
		country = countryFactory.findByCode("NE");
		assertTrue(country.getCode().equals("NE"));
		assertTrue(country.getName().toUpperCase().equals("NIGER"));
	}

	// ***** (NF) - Norfolk Island
	public void testNorfolkIsland() {
		Country country = null;
		country = countryFactory.findByCode("NF");
		assertTrue(country.getCode().equals("NF"));
		assertTrue(country.getName().toUpperCase().equals("NORFOLK ISLAND"));
	}

	// ***** (NG) - Nigeria
	public void testNigeria() {
		Country country = null;
		country = countryFactory.findByCode("NG");
		assertTrue(country.getCode().equals("NG"));
		assertTrue(country.getName().toUpperCase().equals("NIGERIA"));
	}

	// ***** (NI) - Nicaragua
	public void testNicaragua() {
		Country country = null;
		country = countryFactory.findByCode("NI");
		assertTrue(country.getCode().equals("NI"));
		assertTrue(country.getName().toUpperCase().equals("NICARAGUA"));
	}

	// ***** (NL) - Netherlands
	public void testNetherlands() {
		Country country = null;
		country = countryFactory.findByCode("NL");
		assertTrue(country.getCode().equals("NL"));
		assertTrue(country.getName().toUpperCase().equals("NETHERLANDS"));
	}

	// ***** (NO) - Norway
	public void testNorway() {
		Country country = null;
		country = countryFactory.findByCode("NO");
		assertTrue(country.getCode().equals("NO"));
		assertTrue(country.getName().toUpperCase().equals("NORWAY"));
	}

	// ***** (NP) - Nepal
	public void testNepal() {
		Country country = null;
		country = countryFactory.findByCode("NP");
		assertTrue(country.getCode().equals("NP"));
		assertTrue(country.getName().toUpperCase().equals("NEPAL"));
	}

	// ***** (NR) - Nauru
	public void testNauru() {
		Country country = null;
		country = countryFactory.findByCode("NR");
		assertTrue(country.getCode().equals("NR"));
		assertTrue(country.getName().toUpperCase().equals("NAURU"));
	}

	// ***** (NU) - Niue
	public void testNiue() {
		Country country = null;
		country = countryFactory.findByCode("NU");
		assertTrue(country.getCode().equals("NU"));
		assertTrue(country.getName().toUpperCase().equals("NIUE"));
	}

	// ***** (NZ) - New Zealand
	public void testNewZealand() {
		Country country = null;
		country = countryFactory.findByCode("NZ");
		assertTrue(country.getCode().equals("NZ"));
		assertTrue(country.getName().toUpperCase().equals("NEW ZEALAND"));
	}

	// ***** (OM) - Oman
	public void testOman() {
		Country country = null;
		country = countryFactory.findByCode("OM");
		assertTrue(country.getCode().equals("OM"));
		assertTrue(country.getName().toUpperCase().equals("OMAN"));
	}

	// ***** (PA) - Panama
	public void testPanama() {
		Country country = null;
		country = countryFactory.findByCode("PA");
		assertTrue(country.getCode().equals("PA"));
		assertTrue(country.getName().toUpperCase().equals("PANAMA"));
	}

	// ***** (PE) - Peru
	public void testPeru() {
		Country country = null;
		country = countryFactory.findByCode("PE");
		assertTrue(country.getCode().equals("PE"));
		assertTrue(country.getName().toUpperCase().equals("PERU"));
	}

	// ***** (PF) - French Polynesia
	public void testFrenchPolynesia() {
		Country country = null;
		country = countryFactory.findByCode("PF");
		assertTrue(country.getCode().equals("PF"));
		assertTrue(country.getName().toUpperCase().equals("FRENCH POLYNESIA"));
	}

	// ***** (PG) - Papua New Guinea
	public void testPapuaNewGuinea() {
		Country country = null;
		country = countryFactory.findByCode("PG");
		assertTrue(country.getCode().equals("PG"));
		assertTrue(country.getName().toUpperCase().equals("PAPUA NEW GUINEA"));
	}

	// ***** (PH) - Philippines
	public void testPhilippines() {
		Country country = null;
		country = countryFactory.findByCode("PH");
		assertTrue(country.getCode().equals("PH"));
		assertTrue(country.getName().toUpperCase().equals("PHILIPPINES"));
	}

	// ***** (PK) - Pakistan
	public void testPakistan() {
		Country country = null;
		country = countryFactory.findByCode("PK");
		assertTrue(country.getCode().equals("PK"));
		assertTrue(country.getName().toUpperCase().equals("PAKISTAN"));
	}

	// ***** (PL) - Poland
	public void testPoland() {
		Country country = null;
		country = countryFactory.findByCode("PL");
		assertTrue(country.getCode().equals("PL"));
		assertTrue(country.getName().toUpperCase().equals("POLAND"));
	}

	// ***** (PM) - Saint Pierre And Miquelon
	public void testSaintPierreAndMiquelon() {
		Country country = null;
		country = countryFactory.findByCode("PM");
		assertTrue(country.getCode().equals("PM"));
		assertTrue(country.getName().toUpperCase().equals(
				"SAINT PIERRE AND MIQUELON"));
	}

	// ***** (PN) - Pitcairn
	public void testPitcairn() {
		Country country = null;
		country = countryFactory.findByCode("PN");
		assertTrue(country.getCode().equals("PN"));
		assertTrue(country.getName().toUpperCase().equals("PITCAIRN"));
	}

	// ***** (PR) - Puerto Rico
	public void testPuertoRico() {
		Country country = null;
		country = countryFactory.findByCode("PR");
		assertTrue(country.getCode().equals("PR"));
		assertTrue(country.getName().toUpperCase().equals("PUERTO RICO"));
	}

	// ***** (PS) - Palestinian Territory, Occupied
	public void testPalestinianTerritoryOccupied() {
		Country country = null;
		country = countryFactory.findByCode("PS");
		assertTrue(country.getCode().equals("PS"));
		assertTrue(country.getName().toUpperCase().equals(
				"PALESTINIAN TERRITORY, OCCUPIED"));
	}

	// ***** (PT) - Portugal
	public void testPortugal() {
		Country country = null;
		country = countryFactory.findByCode("PT");
		assertTrue(country.getCode().equals("PT"));
		assertTrue(country.getName().toUpperCase().equals("PORTUGAL"));
	}

	// ***** (PW) - Palau
	public void testPalau() {
		Country country = null;
		country = countryFactory.findByCode("PW");
		assertTrue(country.getCode().equals("PW"));
		assertTrue(country.getName().toUpperCase().equals("PALAU"));
	}

	// ***** (PY) - Paraguay
	public void testParaguay() {
		Country country = null;
		country = countryFactory.findByCode("PY");
		assertTrue(country.getCode().equals("PY"));
		assertTrue(country.getName().toUpperCase().equals("PARAGUAY"));
	}

	// ***** (QA) - Qatar
	public void testQatar() {
		Country country = null;
		country = countryFactory.findByCode("QA");
		assertTrue(country.getCode().equals("QA"));
		assertTrue(country.getName().toUpperCase().equals("QATAR"));
	}

	// ***** (RE) - Reunion
	public void eunion() {
		Country country = null;
		country = countryFactory.findByCode("RE");
		assertTrue(country.getCode().equals("RE"));
		assertTrue(country.getName().toUpperCase().equals("R\u00c9UNION"));
	}

	// ***** (RO) - Romania
	public void testRomania() {
		Country country = null;
		country = countryFactory.findByCode("RO");
		assertTrue(country.getCode().equals("RO"));
		assertTrue(country.getName().toUpperCase().equals("ROMANIA"));
	}

	// ***** (RS) - Serbia
	public void testSerbia() {
		Country country = null;
		country = countryFactory.findByCode("RS");
		assertTrue(country.getCode().equals("RS"));
		assertTrue(country.getName().toUpperCase().equals("SERBIA"));
	}

	// ***** (RU) - Russian Federation
	public void testRussianFederation() {
		Country country = null;
		country = countryFactory.findByCode("RU");
		assertTrue(country.getCode().equals("RU"));
		assertTrue(country.getName().toUpperCase().equals("RUSSIAN FEDERATION"));
	}

	// ***** (RW) - Rwanda
	public void testRwanda() {
		Country country = null;
		country = countryFactory.findByCode("RW");
		assertTrue(country.getCode().equals("RW"));
		assertTrue(country.getName().toUpperCase().equals("RWANDA"));
	}

	// ***** (SA) - Saudi Arabia
	public void testSaudiArabia() {
		Country country = null;
		country = countryFactory.findByCode("SA");
		assertTrue(country.getCode().equals("SA"));
		assertTrue(country.getName().toUpperCase().equals("SAUDI ARABIA"));
	}

	// ***** (SB) - Solomon Islands
	public void testSolomonIslands() {
		Country country = null;
		country = countryFactory.findByCode("SB");
		assertTrue(country.getCode().equals("SB"));
		assertTrue(country.getName().toUpperCase().equals("SOLOMON ISLANDS"));
	}

	// ***** (SC) - Seychelles
	public void testSeychelles() {
		Country country = null;
		country = countryFactory.findByCode("SC");
		assertTrue(country.getCode().equals("SC"));
		assertTrue(country.getName().toUpperCase().equals("SEYCHELLES"));
	}

	// ***** (SD) - Sudan
	public void testSudan() {
		Country country = null;
		country = countryFactory.findByCode("SD");
		assertTrue(country.getCode().equals("SD"));
		assertTrue(country.getName().toUpperCase().equals("SUDAN"));
	}

	// ***** (SE) - Sweden
	public void testSweden() {
		Country country = null;
		country = countryFactory.findByCode("SE");
		assertTrue(country.getCode().equals("SE"));
		assertTrue(country.getName().toUpperCase().equals("SWEDEN"));
	}

	// ***** (see HOLY SEE) - Vatican City State
	public void testVaticanCityState() {
		Country country = null;
		country = countryFactory.findByCode("see HOLY SEE");
		assertTrue(country.getCode().equals("see HOLY SEE"));
		assertTrue(country.getName().toUpperCase().equals("VATICAN CITY STATE"));
	}

	// ***** (SG) - Singapore
	public void testSingapore() {
		Country country = null;
		country = countryFactory.findByCode("SG");
		assertTrue(country.getCode().equals("SG"));
		assertTrue(country.getName().toUpperCase().equals("SINGAPORE"));
	}

	// ***** (SH) - Saint Helena
	public void testSaintHelena() {
		Country country = null;
		country = countryFactory.findByCode("SH");
		assertTrue(country.getCode().equals("SH"));
		assertTrue(country.getName().toUpperCase().equals("SAINT HELENA"));
	}

	// ***** (SI) - Slovenia
	public void testSlovenia() {
		Country country = null;
		country = countryFactory.findByCode("SI");
		assertTrue(country.getCode().equals("SI"));
		assertTrue(country.getName().toUpperCase().equals("SLOVENIA"));
	}

	// ***** (SJ) - Svalbard And Jan Mayen
	public void testSvalbardAndJanMayen() {
		Country country = null;
		country = countryFactory.findByCode("SJ");
		assertTrue(country.getCode().equals("SJ"));
		assertTrue(country.getName().toUpperCase().equals(
				"SVALBARD AND JAN MAYEN"));
	}

	// ***** (SK) - Slovakia
	public void testSlovakia() {
		Country country = null;
		country = countryFactory.findByCode("SK");
		assertTrue(country.getCode().equals("SK"));
		assertTrue(country.getName().toUpperCase().equals("SLOVAKIA"));
	}

	// ***** (SL) - Sierra Leone
	public void testSierraLeone() {
		Country country = null;
		country = countryFactory.findByCode("SL");
		assertTrue(country.getCode().equals("SL"));
		assertTrue(country.getName().toUpperCase().equals("SIERRA LEONE"));
	}

	// ***** (SM) - San Marino
	public void testSanMarino() {
		Country country = null;
		country = countryFactory.findByCode("SM");
		assertTrue(country.getCode().equals("SM"));
		assertTrue(country.getName().toUpperCase().equals("SAN MARINO"));
	}

	// ***** (SN) - Senegal
	public void testSenegal() {
		Country country = null;
		country = countryFactory.findByCode("SN");
		assertTrue(country.getCode().equals("SN"));
		assertTrue(country.getName().toUpperCase().equals("SENEGAL"));
	}

	// ***** (SO) - Somalia
	public void testSomalia() {
		Country country = null;
		country = countryFactory.findByCode("SO");
		assertTrue(country.getCode().equals("SO"));
		assertTrue(country.getName().toUpperCase().equals("SOMALIA"));
	}

	// ***** (SR) - Suriname
	public void testSuriname() {
		Country country = null;
		country = countryFactory.findByCode("SR");
		assertTrue(country.getCode().equals("SR"));
		assertTrue(country.getName().toUpperCase().equals("SURINAME"));
	}

	// ***** (ST) - Sao Tome And Principe
	public void testSaoTomeAndPrincipe() {
		Country country = null;
		country = countryFactory.findByCode("ST");
		assertTrue(country.getCode().equals("ST"));
		assertTrue(country.getName().toUpperCase().equals(
				"SAO TOME AND PRINCIPE"));
	}

	// ***** (SV) - El Salvador
	public void testElSalvador() {
		Country country = null;
		country = countryFactory.findByCode("SV");
		assertTrue(country.getCode().equals("SV"));
		assertTrue(country.getName().toUpperCase().equals("EL SALVADOR"));
	}

	// ***** (SY) - Syrian Arab Republic
	public void testSyrianArabRepublic() {
		Country country = null;
		country = countryFactory.findByCode("SY");
		assertTrue(country.getCode().equals("SY"));
		assertTrue(country.getName().toUpperCase().equals(
				"SYRIAN ARAB REPUBLIC"));
	}

	// ***** (SZ) - Swaziland
	public void testSwaziland() {
		Country country = null;
		country = countryFactory.findByCode("SZ");
		assertTrue(country.getCode().equals("SZ"));
		assertTrue(country.getName().toUpperCase().equals("SWAZILAND"));
	}

	// ***** (TC) - Turks And Caicos Islands
	public void testTurksAndCaicosIslands() {
		Country country = null;
		country = countryFactory.findByCode("TC");
		assertTrue(country.getCode().equals("TC"));
		assertTrue(country.getName().toUpperCase().equals(
				"TURKS AND CAICOS ISLANDS"));
	}

	// ***** (TD) - Chad
	public void testChad() {
		Country country = null;
		country = countryFactory.findByCode("TD");
		assertTrue(country.getCode().equals("TD"));
		assertTrue(country.getName().toUpperCase().equals("CHAD"));
	}

	// ***** (TF) - French Southern Territories
	public void testFrenchSouthernTerritories() {
		Country country = null;
		country = countryFactory.findByCode("TF");
		assertTrue(country.getCode().equals("TF"));
		assertTrue(country.getName().toUpperCase().equals(
				"FRENCH SOUTHERN TERRITORIES"));
	}

	// ***** (TG) - Togo
	public void testTogo() {
		Country country = null;
		country = countryFactory.findByCode("TG");
		assertTrue(country.getCode().equals("TG"));
		assertTrue(country.getName().toUpperCase().equals("TOGO"));
	}

	// ***** (TH) - Thailand
	public void testThailand() {
		Country country = null;
		country = countryFactory.findByCode("TH");
		assertTrue(country.getCode().equals("TH"));
		assertTrue(country.getName().toUpperCase().equals("THAILAND"));
	}

	// ***** (TJ) - Tajikistan
	public void testTajikistan() {
		Country country = null;
		country = countryFactory.findByCode("TJ");
		assertTrue(country.getCode().equals("TJ"));
		assertTrue(country.getName().toUpperCase().equals("TAJIKISTAN"));
	}

	// ***** (TK) - Tokelau
	public void testTokelau() {
		Country country = null;
		country = countryFactory.findByCode("TK");
		assertTrue(country.getCode().equals("TK"));
		assertTrue(country.getName().toUpperCase().equals("TOKELAU"));
	}

	// ***** (TL) - Timor-Leste
	public void testTimorLeste() {
		Country country = null;
		country = countryFactory.findByCode("TL");
		assertTrue(country.getCode().equals("TL"));
		assertTrue(country.getName().toUpperCase().equals("TIMOR-LESTE"));
	}

	// ***** (TM) - Turkmenistan
	public void testTurkmenistan() {
		Country country = null;
		country = countryFactory.findByCode("TM");
		assertTrue(country.getCode().equals("TM"));
		assertTrue(country.getName().toUpperCase().equals("TURKMENISTAN"));
	}

	// ***** (TN) - Tunisia
	public void testTunisia() {
		Country country = null;
		country = countryFactory.findByCode("TN");
		assertTrue(country.getCode().equals("TN"));
		assertTrue(country.getName().toUpperCase().equals("TUNISIA"));
	}

	// ***** (TO) - Tonga
	public void testTonga() {
		Country country = null;
		country = countryFactory.findByCode("TO");
		assertTrue(country.getCode().equals("TO"));
		assertTrue(country.getName().toUpperCase().equals("TONGA"));
	}

	// ***** (TR) - Turkey
	public void testTurkey() {
		Country country = null;
		country = countryFactory.findByCode("TR");
		assertTrue(country.getCode().equals("TR"));
		assertTrue(country.getName().toUpperCase().equals("TURKEY"));
	}

	// ***** (TT) - Trinidad And Tobago
	public void testTrinidadAndTobago() {
		Country country = null;
		country = countryFactory.findByCode("TT");
		assertTrue(country.getCode().equals("TT"));
		assertTrue(country.getName().toUpperCase()
				.equals("TRINIDAD AND TOBAGO"));
	}

	// ***** (TV) - Tuvalu
	public void testTuvalu() {
		Country country = null;
		country = countryFactory.findByCode("TV");
		assertTrue(country.getCode().equals("TV"));
		assertTrue(country.getName().toUpperCase().equals("TUVALU"));
	}

	// ***** (TW) - Taiwan, Province Of China
	public void testTaiwanProvinceOfChina() {
		Country country = null;
		country = countryFactory.findByCode("TW");
		assertTrue(country.getCode().equals("TW"));
		assertTrue(country.getName().toUpperCase().equals(
				"TAIWAN, PROVINCE OF CHINA"));
	}

	// ***** (TZ) - Tanzania, United Republic Of
	public void testTanzaniaUnitedRepublicOf() {
		Country country = null;
		country = countryFactory.findByCode("TZ");
		assertTrue(country.getCode().equals("TZ"));
		assertTrue(country.getName().toUpperCase().equals(
				"TANZANIA, UNITED REPUBLIC OF"));
	}

	// ***** (UA) - Ukraine
	public void testUkraine() {
		Country country = null;
		country = countryFactory.findByCode("UA");
		assertTrue(country.getCode().equals("UA"));
		assertTrue(country.getName().toUpperCase().equals("UKRAINE"));
	}

	// ***** (UG) - Uganda
	public void testUganda() {
		Country country = null;
		country = countryFactory.findByCode("UG");
		assertTrue(country.getCode().equals("UG"));
		assertTrue(country.getName().toUpperCase().equals("UGANDA"));
	}

	// ***** (UM) - United States Minor Outlying Islands
	public void testUnitedStatesMinorOutlyingIslands() {
		Country country = null;
		country = countryFactory.findByCode("UM");
		assertTrue(country.getCode().equals("UM"));
		assertTrue(country.getName().toUpperCase().equals(
				"UNITED STATES MINOR OUTLYING ISLANDS"));
	}

	// ***** (US) - United States
	public void testUnitedStates() {
		Country country = null;
		country = countryFactory.findByCode("US");
		assertTrue(country.getCode().equals("US"));
		assertTrue(country.getName().toUpperCase().equals("UNITED STATES"));
	}

	// ***** (UY) - Uruguay
	public void testUruguay() {
		Country country = null;
		country = countryFactory.findByCode("UY");
		assertTrue(country.getCode().equals("UY"));
		assertTrue(country.getName().toUpperCase().equals("URUGUAY"));
	}

	// ***** (UZ) - Uzbekistan
	public void testUzbekistan() {
		Country country = null;
		country = countryFactory.findByCode("UZ");
		assertTrue(country.getCode().equals("UZ"));
		assertTrue(country.getName().toUpperCase().equals("UZBEKISTAN"));
	}

	// ***** (VA) - Holy See (Vatican City State)
	public void testHolySeeVaticanCityState() {
		Country country = null;
		country = countryFactory.findByCode("VA");
		assertTrue(country.getCode().equals("VA"));
		assertTrue(country.getName().toUpperCase().equals(
				"HOLY SEE (VATICAN CITY STATE)"));
	}

	// ***** (VC) - Saint Vincent And The Grenadines
	public void testSaintVincentAndTheGrenadines() {
		Country country = null;
		country = countryFactory.findByCode("VC");
		assertTrue(country.getCode().equals("VC"));
		assertTrue(country.getName().toUpperCase().equals(
				"SAINT VINCENT AND THE GRENADINES"));
	}

	// ***** (VE) - Venezuela, Bolivarian Republic Of
	public void testVenezuelaBolivarianRepublicOf() {
		Country country = null;
		country = countryFactory.findByCode("VE");
		assertTrue(country.getCode().equals("VE"));
		assertTrue(country.getName().toUpperCase().equals(
				"VENEZUELA, BOLIVARIAN REPUBLIC OF"));
	}

	// ***** (VG) - Virgin Islands, British
	public void testVirginIslandsBritish() {
		Country country = null;
		country = countryFactory.findByCode("VG");
		assertTrue(country.getCode().equals("VG"));
		assertTrue(country.getName().toUpperCase().equals(
				"VIRGIN ISLANDS, BRITISH"));
	}

	// ***** (VI) - Virgin Islands, U.S.
	public void testVirginIslandsUS() {
		Country country = null;
		country = countryFactory.findByCode("VI");
		assertTrue(country.getCode().equals("VI"));
		assertTrue(country.getName().toUpperCase().equals(
				"VIRGIN ISLANDS, U.S."));
	}

	// ***** (VN) - Viet Nam
	public void testVietNam() {
		Country country = null;
		country = countryFactory.findByCode("VN");
		assertTrue(country.getCode().equals("VN"));
		assertTrue(country.getName().toUpperCase().equals("VIET NAM"));
	}

	// ***** (VU) - Vanuatu
	public void testVanuatu() {
		Country country = null;
		country = countryFactory.findByCode("VU");
		assertTrue(country.getCode().equals("VU"));
		assertTrue(country.getName().toUpperCase().equals("VANUATU"));
	}

	// ***** (WF) - Wallis And Futuna
	public void testWallisAndFutuna() {
		Country country = null;
		country = countryFactory.findByCode("WF");
		assertTrue(country.getCode().equals("WF"));
		assertTrue(country.getName().toUpperCase().equals("WALLIS AND FUTUNA"));
	}

	// ***** (WS) - Samoa
	public void testSamoa() {
		Country country = null;
		country = countryFactory.findByCode("WS");
		assertTrue(country.getCode().equals("WS"));
		assertTrue(country.getName().toUpperCase().equals("SAMOA"));
	}

	// ***** (YE) - Yemen
	public void testYemen() {
		Country country = null;
		country = countryFactory.findByCode("YE");
		assertTrue(country.getCode().equals("YE"));
		assertTrue(country.getName().toUpperCase().equals("YEMEN"));
	}

	// ***** (YT) - Mayotte
	public void testMayotte() {
		Country country = null;
		country = countryFactory.findByCode("YT");
		assertTrue(country.getCode().equals("YT"));
		assertTrue(country.getName().toUpperCase().equals("MAYOTTE"));
	}

	// ***** (ZA) - South Africa
	public void testSouthAfrica() {
		Country country = null;
		country = countryFactory.findByCode("ZA");
		assertTrue(country.getCode().equals("ZA"));
		assertTrue(country.getName().toUpperCase().equals("SOUTH AFRICA"));
	}

	// ***** (ZM) - Zambia
	public void testZambia() {
		Country country = null;
		country = countryFactory.findByCode("ZM");
		assertTrue(country.getCode().equals("ZM"));
		assertTrue(country.getName().toUpperCase().equals("ZAMBIA"));
	}

	// ***** (ZW) - Zimbabwe
	public void testZimbabwe() {
		Country country = null;
		country = countryFactory.findByCode("ZW");
		assertTrue(country.getCode().equals("ZW"));
		assertTrue(country.getName().toUpperCase().equals("ZIMBABWE"));
	}
}