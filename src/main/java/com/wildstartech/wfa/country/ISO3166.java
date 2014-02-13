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

import java.util.ListResourceBundle;
/**
 * Resource bundle containing ISO3166 country names and abbreviations.
 * 
 * @see http://www.iso.org/iso/english_country_names_and_code_elements
 * @author Derek Berube, Wildstar Technologies, LLC.
 * @since 1.0
 * @version 1.0
 */
public class ISO3166 extends ListResourceBundle {
	private static Object[][] contents = {
		{"AE",new Country("AE","United Arab Emirates")},
		{"AF",new Country("AF","Afghanistan")},
		{"AG",new Country("AG","Antigua And Barbuda")},
		{"AI",new Country("AI","Anguilla")},
		{"AL",new Country("AL","Albania")},
		{"AM",new Country("AM","Armenia")},
		{"AN",new Country("AN","Netherlands Antilles")},
		{"AO",new Country("AO","Angola")},
		{"AQ",new Country("AQ","Antarctica")},
		{"AR",new Country("AR","Argentina")},
		{"AS",new Country("AS","American Samoa")},
		{"AT",new Country("AT","Austria")},
		{"AU",new Country("AU","Australia")},
		{"AW",new Country("AW","Aruba")},
		{"AX",new Country("AX","\u00c5land Islands")},
		{"AZ",new Country("AZ","Azerbaijan")},
		{"BA",new Country("BA","Bosnia And Herzegovina")},
		{"BB",new Country("BB","Barbados")},
		{"BD",new Country("BD","Bangladesh")},
		{"BE",new Country("BE","Belgium")},
		{"BF",new Country("BF","Burkina Faso")},
		{"BG",new Country("BG","Bulgaria")},
		{"BH",new Country("BH","Bahrain")},
		{"BI",new Country("BI","Burundi")},
		{"BJ",new Country("BJ","Benin")},
		{"BL",new Country("BL","Saint Barth\u00e9lemy")},
		{"BM",new Country("BM","Bermuda")},
		{"BN",new Country("BN","Brunei Darussalam")},
		{"BO",new Country("BO","Bolivia, Plurinational State of")},
		{"BR",new Country("BR","Brazil")},
		{"BS",new Country("BS","Bahamas")},
		{"BT",new Country("BT","Bhutan")},
		{"BV",new Country("BV","Bouvet Island")},
		{"BW",new Country("BW","Botswana")},
		{"BY",new Country("BY","Belarus")},
		{"BZ",new Country("BZ","Belize")},
		{"CA",new Country("CA","Canada")},
		{"CC",new Country("CC","Cocos (Keeling) Islands")},
		{"CD",new Country("CD","Congo, The Democratic Republic of the")},
		{"CF",new Country("CF","Central African Republic")},
		{"CG",new Country("CG","Congo")},
		{"CH",new Country("CH","Switzerland")},
		{"CI",new Country("CI","C\u00f4te D'Ivoire")},
		{"CK",new Country("CK","Cook Islands")},
		{"CL",new Country("CL","Chile")},
		{"CM",new Country("CM","Cameroon")},
		{"CN",new Country("CN","China")},
		{"CO",new Country("CO","Colombia")},
		{"CR",new Country("CR","Costa Rica")},
		{"CU",new Country("CU","Cuba")},
		{"CV",new Country("CV","Cape Verde")},
		{"CX",new Country("CX","Christmas Island")},
		{"CY",new Country("CY","Cyprus")},
		{"CZ",new Country("CZ","Czech Republic")},
		{"DE",new Country("DE","Germany")},
		{"DJ",new Country("DJ","Djibouti")},
		{"DK",new Country("DK","Denmark")},
		{"DM",new Country("DM","Dominica")},
		{"DO",new Country("DO","Dominican Republic")},
		{"DZ",new Country("DZ","Algeria")},
		{"EC",new Country("EC","Ecuador")},
		{"EE",new Country("EE","Estonia")},
		{"EG",new Country("EG","Egypt")},
		{"EH",new Country("EH","Western Sahara")},
		{"ER",new Country("ER","Eritrea")},
		{"ES",new Country("ES","Spain")},
		{"ET",new Country("ET","Ethiopia")},
		{"FI",new Country("FI","Finland")},
		{"FJ",new Country("FJ","Fiji")},
		{"FK",new Country("FK","Falkland Islands (Malvinas)")},
		{"FM",new Country("FM","Micronesia, Federated States of")},
		{"FO",new Country("FO","Faroe Islands")},
		{"FR",new Country("FR","France")},
		{"GA",new Country("GA","Gabon")},
		{"GB",new Country("GB","United Kingdom")},
		{"GD",new Country("GD","Grenada")},
		{"GE",new Country("GE","Georgia")},
		{"GF",new Country("GF","French Guiana")},
		{"GG",new Country("GG","Guernsey")},
		{"GH",new Country("GH","Ghana")},
		{"GI",new Country("GI","Gibraltar")},
		{"GL",new Country("GL","Greenland")},
		{"GM",new Country("GM","Gambia")},
		{"GN",new Country("GN","Guinea")},
		{"GP",new Country("GP","Guadeloupe")},
		{"GQ",new Country("GQ","Equatorial Guinea")},
		{"GR",new Country("GR","Greece")},
		{"GS",new Country("GS","South Georgia and the South Sandwich Islands")},
		{"GT",new Country("GT","Guatemala")},
		{"GU",new Country("GU","Guam")},
		{"GW",new Country("GW","Guinea-Bissau")},
		{"GY",new Country("GY","Guyana")},
		{"HK",new Country("HK","Hong Kong")},
		{"HM",new Country("HM","Heard Island and Mcdonald Islands")},
		{"HN",new Country("HN","Honduras")},
		{"HR",new Country("HR","Croatia")},
		{"HT",new Country("HT","Haiti")},
		{"HU",new Country("HU","Hungary")},
		{"ID",new Country("ID","Indonesia")},
		{"IE",new Country("IE","Ireland")},
		{"IL",new Country("IL","Israel")},
		{"IM",new Country("IM","Isle Of Man")},
		{"IN",new Country("IN","India")},
		{"IO",new Country("IO","British Indian Ocean Territory")},
		{"IQ",new Country("IQ","Iraq")},
		{"IR",new Country("IR","Iran, Islamic Republic of")},
		{"IS",new Country("IS","Iceland")},
		{"IT",new Country("IT","Italy")},
		{"JE",new Country("JE","Jersey")},
		{"JM",new Country("JM","Jamaica")},
		{"JO",new Country("JO","Jordan")},
		{"JP",new Country("JP","Japan")},
		{"KE",new Country("KE","Kenya")},
		{"KG",new Country("KG","Kyrgyzstan")},
		{"KH",new Country("KH","Cambodia")},
		{"KI",new Country("KI","Kiribati")},
		{"KM",new Country("KM","Comoros")},
		{"KN",new Country("KN","Saint Kitts and Nevis")},
		{"KP",new Country("KP","Korea, Democratic People's Republic of")},
		{"KR",new Country("KR","Korea, Republic of")},
		{"KW",new Country("KW","Kuwait")},
		{"KY",new Country("KY","Cayman Islands")},
		{"KZ",new Country("KZ","Kazakhstan")},
		{"LA",new Country("LA","Lao People's Democratic Republic")},
		{"LB",new Country("LB","Lebanon")},
		{"LC",new Country("LC","Saint Lucia")},
		{"LI",new Country("LI","Liechtenstein")},
		{"LK",new Country("LK","Sri Lanka")},
		{"LR",new Country("LR","Liberia")},
		{"LS",new Country("LS","Lesotho")},
		{"LT",new Country("LT","Lithuania")},
		{"LU",new Country("LU","Luxembourg")},
		{"LV",new Country("LV","Latvia")},
		{"LY",new Country("LY","Libyan Arab Jamahiriya")},
		{"MA",new Country("MA","Morocco")},
		{"MC",new Country("MC","Monaco")},
		{"MD",new Country("MD","Moldova, Republic of")},
		{"ME",new Country("ME","Montenegro")},
		{"MF",new Country("MF","Saint Martin")},
		{"MG",new Country("MG","Madagascar")},
		{"MH",new Country("MH","Marshall Islands")},
		{"MK",new Country("MK","Macedonia, The Former Yugoslav Republic of")},
		{"ML",new Country("ML","Mali")},
		{"MM",new Country("MM","Myanmar")},
		{"MN",new Country("MN","Mongolia")},
		{"MO",new Country("MO","Macao")},
		{"MP",new Country("MP","Northern Mariana Islands")},
		{"MQ",new Country("MQ","Martinique")},
		{"MR",new Country("MR","Mauritania")},
		{"MS",new Country("MS","Montserrat")},
		{"MT",new Country("MT","Malta")},
		{"MU",new Country("MU","Mauritius")},
		{"MV",new Country("MV","Maldives")},
		{"MW",new Country("MW","Malawi")},
		{"MX",new Country("MX","Mexico")},
		{"MY",new Country("MY","Malaysia")},
		{"MZ",new Country("MZ","Mozambique")},
		{"NA",new Country("NA","Namibia")},
		{"NC",new Country("NC","New Caledonia")},
		{"NE",new Country("NE","Niger")},
		{"NF",new Country("NF","Norfolk Island")},
		{"NG",new Country("NG","Nigeria")},
		{"NI",new Country("NI","Nicaragua")},
		{"NL",new Country("NL","Netherlands")},
		{"NO",new Country("NO","Norway")},
		{"NP",new Country("NP","Nepal")},
		{"NR",new Country("NR","Nauru")},
		{"NU",new Country("NU","Niue")},
		{"NZ",new Country("NZ","New Zealand")},
		{"OM",new Country("OM","Oman")},
		{"PA",new Country("PA","Panama")},
		{"PE",new Country("PE","Peru")},
		{"PF",new Country("PF","French Polynesia")},
		{"PG",new Country("PG","Papua New Guinea")},
		{"PH",new Country("PH","Philippines")},
		{"PK",new Country("PK","Pakistan")},
		{"PL",new Country("PL","Poland")},
		{"PM",new Country("PM","Saint Pierre and Miquelon")},
		{"PN",new Country("PN","Pitcairn")},
		{"PR",new Country("PR","Puerto Rico")},
		{"PS",new Country("PS","Palestinian Territory, Occupied")},
		{"PT",new Country("PT","Portugal")},
		{"PW",new Country("PW","Palau")},
		{"PY",new Country("PY","Paraguay")},
		{"QA",new Country("QA","Qatar")},
		{"RE",new Country("RE","R\u00e9union")},
		{"RO",new Country("RO","Romania")},
		{"RS",new Country("RS","Serbia")},
		{"RU",new Country("RU","Russian Federation")},
		{"RW",new Country("RW","Rwanda")},
		{"SA",new Country("SA","Saudi Arabia")},
		{"SB",new Country("SB","Solomon Islands")},
		{"SC",new Country("SC","Seychelles")},
		{"SD",new Country("SD","Sudan")},
		{"SE",new Country("SE","Sweden")},
		{"SG",new Country("SG","Singapore")},
		{"SH",new Country("SH","Saint Helena")},
		{"SI",new Country("SI","Slovenia")},
		{"SJ",new Country("SJ","Svalbard and Jan Mayen")},
		{"SK",new Country("SK","Slovakia")},
		{"SL",new Country("SL","Sierra Leone")},
		{"SM",new Country("SM","San Marino")},
		{"SN",new Country("SN","Senegal")},
		{"SO",new Country("SO","Somalia")},
		{"SR",new Country("SR","Suriname")},
		{"ST",new Country("ST","Sao Tome and Principe")},
		{"SV",new Country("SV","El Salvador")},
		{"SY",new Country("SY","Syrian Arab Republic")},
		{"SZ",new Country("SZ","Swaziland")},
		{"TC",new Country("TC","Turks and Caicos Islands")},
		{"TD",new Country("TD","Chad")},
		{"TF",new Country("TF","French Southern Territories")},
		{"TG",new Country("TG","Togo")},
		{"TH",new Country("TH","Thailand")},
		{"TJ",new Country("TJ","Tajikistan")},
		{"TK",new Country("TK","Tokelau")},
		{"TL",new Country("TL","Timor-Leste")},
		{"TM",new Country("TM","Turkmenistan")},
		{"TN",new Country("TN","Tunisia")},
		{"TO",new Country("TO","Tonga")},
		{"TR",new Country("TR","Turkey")},
		{"TT",new Country("TT","Trinidad and Tobago")},
		{"TV",new Country("TV","Tuvalu")},
		{"TW",new Country("TW","Taiwan, Province of China")},
		{"TZ",new Country("TZ","Tanzania, United Republic of")},
		{"UA",new Country("UA","Ukraine")},
		{"UG",new Country("UG","Uganda")},
		{"UM",new Country("UM","United States Minor Outlying Islands")},
		{"US",new Country("US","United States")},
		{"UY",new Country("UY","Uruguay")},
		{"UZ",new Country("UZ","Uzbekistan")},
		{"VA",new Country("VA","Holy See (Vatican City State)","Vatican City State")},
		{"VC",new Country("VC","Saint Vincent and the Grenadines")},
		{"VE",new Country("VE","Venezuela, Bolivarian Republic of")},
		{"VG",new Country("VG","Virgin Islands, British")},
		{"VI",new Country("VI","Virgin Islands, U.S.")},
		{"VN",new Country("VN","Viet Nam")},
		{"VU",new Country("VU","Vanuatu")},
		{"WF",new Country("WF","Wallis And Futuna")},
		{"WS",new Country("WS","Samoa")},
		{"YE",new Country("YE","Yemen")},
		{"YT",new Country("YT","Mayotte")},
		{"ZA",new Country("ZA","South Africa")},
		{"ZM",new Country("ZM","Zambia")},
		{"ZW",new Country("ZW","Zimbabwe")}
	};
	
	public Object[][] getContents() {
		return ISO3166.contents;
	}
}