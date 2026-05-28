/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.areacode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class AreaCode
extends Enum<AreaCode> {
    public static final /* enum */ AreaCode ANDORRA = new AreaCode("AD");
    public static final /* enum */ AreaCode UNITED_ARAB_EMIRATES = new AreaCode("AE");
    public static final /* enum */ AreaCode AFGHANISTAN = new AreaCode("AF");
    public static final /* enum */ AreaCode ANTIGUA_BARBUDA = new AreaCode("AG");
    public static final /* enum */ AreaCode ANGUILLA = new AreaCode("AI");
    public static final /* enum */ AreaCode ALBANIA = new AreaCode("AL");
    public static final /* enum */ AreaCode ARMENIA = new AreaCode("AM");
    public static final /* enum */ AreaCode ANGOLA = new AreaCode("AO");
    public static final /* enum */ AreaCode ANTARCTICA = new AreaCode("AQ");
    public static final /* enum */ AreaCode ARGENTINA = new AreaCode("AR");
    public static final /* enum */ AreaCode AMERICAN_SAMOA = new AreaCode("AS");
    public static final /* enum */ AreaCode AUSTRIA = new AreaCode("AT");
    public static final /* enum */ AreaCode AUSTRALIA = new AreaCode("AU");
    public static final /* enum */ AreaCode ARUBA = new AreaCode("AW");
    public static final /* enum */ AreaCode ALAND_ISLAND = new AreaCode("AX");
    public static final /* enum */ AreaCode AZERBAIJAN = new AreaCode("AZ");
    public static final /* enum */ AreaCode BOSNIA_HERZEGOVINA = new AreaCode("BA");
    public static final /* enum */ AreaCode BARBADOS = new AreaCode("BB");
    public static final /* enum */ AreaCode BANGLADESH = new AreaCode("BD");
    public static final /* enum */ AreaCode BELGIUM = new AreaCode("BE");
    public static final /* enum */ AreaCode BURKINA = new AreaCode("BF");
    public static final /* enum */ AreaCode BULGARIA = new AreaCode("BG");
    public static final /* enum */ AreaCode BAHRAIN = new AreaCode("BH");
    public static final /* enum */ AreaCode BURUNDI = new AreaCode("BI");
    public static final /* enum */ AreaCode BENIN = new AreaCode("BJ");
    public static final /* enum */ AreaCode SAINT_BARTHELEMY = new AreaCode("BL");
    public static final /* enum */ AreaCode BERMUDA = new AreaCode("BM");
    public static final /* enum */ AreaCode BRUNEI = new AreaCode("BN");
    public static final /* enum */ AreaCode BOLIVIA = new AreaCode("BO");
    public static final /* enum */ AreaCode CARIBBEAN_NETHERLANDS = new AreaCode("BQ");
    public static final /* enum */ AreaCode BRAZIL = new AreaCode("BR");
    public static final /* enum */ AreaCode THE_BAHAMAS = new AreaCode("BS");
    public static final /* enum */ AreaCode BHUTAN = new AreaCode("BT");
    public static final /* enum */ AreaCode BOUVET_ISLAND = new AreaCode("BV");
    public static final /* enum */ AreaCode BOTSWANA = new AreaCode("BW");
    public static final /* enum */ AreaCode BELARUS = new AreaCode("BY");
    public static final /* enum */ AreaCode BELIZE = new AreaCode("BZ");
    public static final /* enum */ AreaCode CANADA = new AreaCode("CA");
    public static final /* enum */ AreaCode COCOS_ISLANDS = new AreaCode("CC");
    public static final /* enum */ AreaCode CENTRAL_AFRICAN_REPUBLIC = new AreaCode("CF");
    public static final /* enum */ AreaCode SWITZERLAND = new AreaCode("CH");
    public static final /* enum */ AreaCode CHILE = new AreaCode("CL");
    public static final /* enum */ AreaCode CAMEROON = new AreaCode("CM");
    public static final /* enum */ AreaCode COLOMBIA = new AreaCode("CO");
    public static final /* enum */ AreaCode COSTA_RICA = new AreaCode("CR");
    public static final /* enum */ AreaCode CUBA = new AreaCode("CU");
    public static final /* enum */ AreaCode CAPE_VERDE = new AreaCode("CV");
    public static final /* enum */ AreaCode CURACAO = new AreaCode("CW");
    public static final /* enum */ AreaCode CHRISTMAS_ISLAND = new AreaCode("CX");
    public static final /* enum */ AreaCode CYPRUS = new AreaCode("CY");
    public static final /* enum */ AreaCode CZECH_REPUBLIC = new AreaCode("CZ");
    public static final /* enum */ AreaCode GERMANY = new AreaCode("DE");
    public static final /* enum */ AreaCode DJIBOUTI = new AreaCode("DJ");
    public static final /* enum */ AreaCode DENMARK = new AreaCode("DK");
    public static final /* enum */ AreaCode DOMINICA = new AreaCode("DM");
    public static final /* enum */ AreaCode DOMINICAN_REPUBLIC = new AreaCode("DO");
    public static final /* enum */ AreaCode ALGERIA = new AreaCode("DZ");
    public static final /* enum */ AreaCode ECUADOR = new AreaCode("EC");
    public static final /* enum */ AreaCode ESTONIA = new AreaCode("EE");
    public static final /* enum */ AreaCode EGYPT = new AreaCode("EG");
    public static final /* enum */ AreaCode WESTERN_SAHARA = new AreaCode("EH");
    public static final /* enum */ AreaCode ERITREA = new AreaCode("ER");
    public static final /* enum */ AreaCode SPAIN = new AreaCode("ES");
    public static final /* enum */ AreaCode FINLAND = new AreaCode("FI");
    public static final /* enum */ AreaCode FIJI = new AreaCode("FJ");
    public static final /* enum */ AreaCode FALKLAND_ISLANDS = new AreaCode("FK");
    public static final /* enum */ AreaCode FEDERATED_STATES_OF_MICRONESIA = new AreaCode("FM");
    public static final /* enum */ AreaCode FAROE_ISLANDS = new AreaCode("FO");
    public static final /* enum */ AreaCode FRANCE = new AreaCode("FR");
    public static final /* enum */ AreaCode GABON = new AreaCode("GA");
    public static final /* enum */ AreaCode GRENADA = new AreaCode("GD");
    public static final /* enum */ AreaCode GEORGIA = new AreaCode("GE");
    public static final /* enum */ AreaCode FRENCH_GUIANA = new AreaCode("GF");
    public static final /* enum */ AreaCode GHANA = new AreaCode("GH");
    public static final /* enum */ AreaCode GIBRALTAR = new AreaCode("GI");
    public static final /* enum */ AreaCode GREENLAND = new AreaCode("GL");
    public static final /* enum */ AreaCode GUINEA = new AreaCode("GN");
    public static final /* enum */ AreaCode GUADELOUPE = new AreaCode("GP");
    public static final /* enum */ AreaCode EQUATORIAL_GUINEA = new AreaCode("GQ");
    public static final /* enum */ AreaCode GREECE = new AreaCode("GR");
    public static final /* enum */ AreaCode SOUTH_GEORGIA_AND_THE_SOUTH_SANDWICH_ISLANDS = new AreaCode("GS");
    public static final /* enum */ AreaCode GUATEMALA = new AreaCode("GT");
    public static final /* enum */ AreaCode GUAM = new AreaCode("GU");
    public static final /* enum */ AreaCode GUINEA_BISSAU = new AreaCode("GW");
    public static final /* enum */ AreaCode GUYANA = new AreaCode("GY");
    public static final /* enum */ AreaCode HONG_KONG = new AreaCode("HK");
    public static final /* enum */ AreaCode HEARD_ISLAND_AND_MCDONALD_ISLANDS = new AreaCode("HM");
    public static final /* enum */ AreaCode HONDURAS = new AreaCode("HN");
    public static final /* enum */ AreaCode CROATIA = new AreaCode("HR");
    public static final /* enum */ AreaCode HAITI = new AreaCode("HT");
    public static final /* enum */ AreaCode HUNGARY = new AreaCode("HU");
    public static final /* enum */ AreaCode INDONESIA = new AreaCode("ID");
    public static final /* enum */ AreaCode IRELANE = new AreaCode("IE");
    public static final /* enum */ AreaCode ISRAEL = new AreaCode("IL");
    public static final /* enum */ AreaCode ISLE_OF_MAN = new AreaCode("IM");
    public static final /* enum */ AreaCode INDIA = new AreaCode("IN");
    public static final /* enum */ AreaCode BRITISH_INDIAN_OCEAN_TERRITORY = new AreaCode("IO");
    public static final /* enum */ AreaCode IRAQ = new AreaCode("IQ");
    public static final /* enum */ AreaCode IRAN = new AreaCode("IR");
    public static final /* enum */ AreaCode ICELAND = new AreaCode("IS");
    public static final /* enum */ AreaCode ITALY = new AreaCode("IT");
    public static final /* enum */ AreaCode JERSEY = new AreaCode("JE");
    public static final /* enum */ AreaCode JAMAICA = new AreaCode("JM");
    public static final /* enum */ AreaCode JORDAN = new AreaCode("JO");
    public static final /* enum */ AreaCode JAPAN = new AreaCode("JP");
    public static final /* enum */ AreaCode CAMBODIA = new AreaCode("KH");
    public static final /* enum */ AreaCode KIRIBATI = new AreaCode("KI");
    public static final /* enum */ AreaCode THE_COMOROS = new AreaCode("KM");
    public static final /* enum */ AreaCode KUWAIT = new AreaCode("KW");
    public static final /* enum */ AreaCode CAYMAN_ISLANDS = new AreaCode("KY");
    public static final /* enum */ AreaCode LEBANON = new AreaCode("LB");
    public static final /* enum */ AreaCode LIECHTENSTEIN = new AreaCode("LI");
    public static final /* enum */ AreaCode SRI_LANKA = new AreaCode("LK");
    public static final /* enum */ AreaCode LIBERIA = new AreaCode("LR");
    public static final /* enum */ AreaCode LESOTHO = new AreaCode("LS");
    public static final /* enum */ AreaCode LITHUANIA = new AreaCode("LT");
    public static final /* enum */ AreaCode LUXEMBOURG = new AreaCode("LU");
    public static final /* enum */ AreaCode LATVIA = new AreaCode("LV");
    public static final /* enum */ AreaCode LIBYA = new AreaCode("LY");
    public static final /* enum */ AreaCode MOROCCO = new AreaCode("MA");
    public static final /* enum */ AreaCode MONACO = new AreaCode("MC");
    public static final /* enum */ AreaCode MOLDOVA = new AreaCode("MD");
    public static final /* enum */ AreaCode MONTENEGRO = new AreaCode("ME");
    public static final /* enum */ AreaCode SAINT_MARTIN = new AreaCode("MF");
    public static final /* enum */ AreaCode MADAGASCAR = new AreaCode("MG");
    public static final /* enum */ AreaCode MARSHALL_ISLANDS = new AreaCode("MH");
    public static final /* enum */ AreaCode REPUBLIC_OF_MACEDONIA = new AreaCode("MK");
    public static final /* enum */ AreaCode MALI = new AreaCode("ML");
    public static final /* enum */ AreaCode MYANMAR = new AreaCode("MM");
    public static final /* enum */ AreaCode MACAU = new AreaCode("MO");
    public static final /* enum */ AreaCode MARTINIQUE = new AreaCode("MQ");
    public static final /* enum */ AreaCode MAURITANIA = new AreaCode("MR");
    public static final /* enum */ AreaCode MONTSERRAT = new AreaCode("MS");
    public static final /* enum */ AreaCode MALTA = new AreaCode("MT");
    public static final /* enum */ AreaCode MALDIVES = new AreaCode("MV");
    public static final /* enum */ AreaCode MALAWI = new AreaCode("MW");
    public static final /* enum */ AreaCode MEXICO = new AreaCode("MX");
    public static final /* enum */ AreaCode MALAYSIA = new AreaCode("MY");
    public static final /* enum */ AreaCode NAMIBIA = new AreaCode("NA");
    public static final /* enum */ AreaCode NIGER = new AreaCode("NE");
    public static final /* enum */ AreaCode NORFOLK_ISLAND = new AreaCode("NF");
    public static final /* enum */ AreaCode NIGERIA = new AreaCode("NG");
    public static final /* enum */ AreaCode NICARAGUA = new AreaCode("NI");
    public static final /* enum */ AreaCode NETHERLANDS = new AreaCode("NL");
    public static final /* enum */ AreaCode NORWAY = new AreaCode("NO");
    public static final /* enum */ AreaCode NEPAL = new AreaCode("NP");
    public static final /* enum */ AreaCode NAURU = new AreaCode("NR");
    public static final /* enum */ AreaCode OMAN = new AreaCode("OM");
    public static final /* enum */ AreaCode PANAMA = new AreaCode("PA");
    public static final /* enum */ AreaCode PERU = new AreaCode("PE");
    public static final /* enum */ AreaCode FRENCH_POLYNESIA = new AreaCode("PF");
    public static final /* enum */ AreaCode PAPUA_NEW_GUINEA = new AreaCode("PG");
    public static final /* enum */ AreaCode THE_PHILIPPINES = new AreaCode("PH");
    public static final /* enum */ AreaCode PAKISTAN = new AreaCode("PK");
    public static final /* enum */ AreaCode POLAND = new AreaCode("PL");
    public static final /* enum */ AreaCode PITCAIRN_ISLANDS = new AreaCode("PN");
    public static final /* enum */ AreaCode PUERTO_RICO = new AreaCode("PR");
    public static final /* enum */ AreaCode PALESTINIAN_TERRITORIES = new AreaCode("PS");
    public static final /* enum */ AreaCode PALAU = new AreaCode("PW");
    public static final /* enum */ AreaCode PARAGUAY = new AreaCode("PY");
    public static final /* enum */ AreaCode QATAR = new AreaCode("QA");
    public static final /* enum */ AreaCode REUNION = new AreaCode("RE");
    public static final /* enum */ AreaCode ROMANIA = new AreaCode("RO");
    public static final /* enum */ AreaCode RUSSIAN_FEDERATION = new AreaCode("RU");
    public static final /* enum */ AreaCode RWANDA = new AreaCode("RW");
    public static final /* enum */ AreaCode SOLOMON_ISLANDS = new AreaCode("SB");
    public static final /* enum */ AreaCode SEYCHELLES = new AreaCode("SC");
    public static final /* enum */ AreaCode SUDAN = new AreaCode("SD");
    public static final /* enum */ AreaCode SWEDEN = new AreaCode("SE");
    public static final /* enum */ AreaCode SINGAPORE = new AreaCode("SG");
    public static final /* enum */ AreaCode SLOVENIA = new AreaCode("SI");
    public static final /* enum */ AreaCode COUNTRY_DATA_SJM_SVALBARD = new AreaCode("SJ");
    public static final /* enum */ AreaCode SLOVAKIA = new AreaCode("SK");
    public static final /* enum */ AreaCode SIERRA_LEONE = new AreaCode("SL");
    public static final /* enum */ AreaCode SAN_MARINO = new AreaCode("SM");
    public static final /* enum */ AreaCode SENEGAL = new AreaCode("SN");
    public static final /* enum */ AreaCode SOMALIA = new AreaCode("SO");
    public static final /* enum */ AreaCode SURINAME = new AreaCode("SR");
    public static final /* enum */ AreaCode SOUTH_SUDAN = new AreaCode("SS");
    public static final /* enum */ AreaCode SAO_TOME_AND_PRINCIPE = new AreaCode("ST");
    public static final /* enum */ AreaCode EL_SALVADOR = new AreaCode("SV");
    public static final /* enum */ AreaCode SINT_MAARTEN = new AreaCode("SX");
    public static final /* enum */ AreaCode SYRIA = new AreaCode("SY");
    public static final /* enum */ AreaCode SWAZILAND = new AreaCode("SZ");
    public static final /* enum */ AreaCode TURKS_AND_CAICOS_ISLANDS = new AreaCode("TC");
    public static final /* enum */ AreaCode CHAD = new AreaCode("TD");
    public static final /* enum */ AreaCode TOGO = new AreaCode("TG");
    public static final /* enum */ AreaCode THAILAND = new AreaCode("TH");
    public static final /* enum */ AreaCode TOKELAU = new AreaCode("TK");
    public static final /* enum */ AreaCode TIMOR_LESTE = new AreaCode("TL");
    public static final /* enum */ AreaCode TUNISIA = new AreaCode("TN");
    public static final /* enum */ AreaCode TONGA = new AreaCode("TO");
    public static final /* enum */ AreaCode TURKEY = new AreaCode("TR");
    public static final /* enum */ AreaCode TUVALU = new AreaCode("TV");
    public static final /* enum */ AreaCode TANZANIA = new AreaCode("TZ");
    public static final /* enum */ AreaCode UKRAINE = new AreaCode("UA");
    public static final /* enum */ AreaCode UGANDA = new AreaCode("UG");
    public static final /* enum */ AreaCode UNITED_STATES_OF_AMERICA = new AreaCode("US");
    public static final /* enum */ AreaCode URUGUAY = new AreaCode("UY");
    public static final /* enum */ AreaCode VATICAN_CITY = new AreaCode("VA");
    public static final /* enum */ AreaCode VENEZUELA = new AreaCode("VE");
    public static final /* enum */ AreaCode BRITISH_VIRGIN_ISLANDS = new AreaCode("VG");
    public static final /* enum */ AreaCode UNITED_STATES_VIRGIN_ISLANDS = new AreaCode("VI");
    public static final /* enum */ AreaCode VIETNAM = new AreaCode("VN");
    public static final /* enum */ AreaCode WALLIS_AND_FUTUNA = new AreaCode("WF");
    public static final /* enum */ AreaCode SAMOA = new AreaCode("WS");
    public static final /* enum */ AreaCode YEMEN = new AreaCode("YE");
    public static final /* enum */ AreaCode MAYOTTE = new AreaCode("YT");
    public static final /* enum */ AreaCode SOUTH_AFRICA = new AreaCode("ZA");
    public static final /* enum */ AreaCode ZAMBIA = new AreaCode("ZM");
    public static final /* enum */ AreaCode ZIMBABWE = new AreaCode("ZW");
    public static final /* enum */ AreaCode CHINA = new AreaCode("CN");
    public static final /* enum */ AreaCode REPUBLIC_OF_THE_CONGO = new AreaCode("CG");
    public static final /* enum */ AreaCode DEMOCRATIC_REPUBLIC_OF_THE_CONGO = new AreaCode("CD");
    public static final /* enum */ AreaCode MOZAMBIQUE = new AreaCode("MZ");
    public static final /* enum */ AreaCode GUERNSEY = new AreaCode("GG");
    public static final /* enum */ AreaCode GAMBIA = new AreaCode("GM");
    public static final /* enum */ AreaCode NORTHERN_MARIANA_ISLANDS = new AreaCode("MP");
    public static final /* enum */ AreaCode ETHIOPIA = new AreaCode("ET");
    public static final /* enum */ AreaCode NEW_CALEDONIA = new AreaCode("NC");
    public static final /* enum */ AreaCode VANUATU = new AreaCode("VU");
    public static final /* enum */ AreaCode FRENCH_SOUTHERN_TERRITORIES = new AreaCode("TF");
    public static final /* enum */ AreaCode NIUE = new AreaCode("NU");
    public static final /* enum */ AreaCode UNITED_STATES_MINOR_OUTLYING_ISLANDS = new AreaCode("UM");
    public static final /* enum */ AreaCode COOK_ISLANDS = new AreaCode("CK");
    public static final /* enum */ AreaCode GREAT_BRITAIN = new AreaCode("GB");
    public static final /* enum */ AreaCode TRINIDAD_TOBAGO = new AreaCode("TT");
    public static final /* enum */ AreaCode ST_VINCENT_AND_THE_GRENADINES = new AreaCode("VC");
    public static final /* enum */ AreaCode CHINA_TAIWAN = new AreaCode("TW");
    public static final /* enum */ AreaCode NEW_ZEALAND = new AreaCode("NZ");
    public static final /* enum */ AreaCode SAUDI_ARABIA = new AreaCode("SA");
    public static final /* enum */ AreaCode LAOS = new AreaCode("LA");
    public static final /* enum */ AreaCode NORTH_KOREA = new AreaCode("KP");
    public static final /* enum */ AreaCode SOUTH_KOREA = new AreaCode("KR");
    public static final /* enum */ AreaCode PORTUGAL = new AreaCode("PT");
    public static final /* enum */ AreaCode KYRGYZSTAN = new AreaCode("KG");
    public static final /* enum */ AreaCode KAZAKHSTAN = new AreaCode("KZ");
    public static final /* enum */ AreaCode TAJIKISTAN = new AreaCode("TJ");
    public static final /* enum */ AreaCode TURKMENISTAN = new AreaCode("TM");
    public static final /* enum */ AreaCode UZBEKISTAN = new AreaCode("UZ");
    public static final /* enum */ AreaCode ST_KITTS_NEVIS = new AreaCode("KN");
    public static final /* enum */ AreaCode SAINT_PIERRE_AND_MIQUELON = new AreaCode("PM");
    public static final /* enum */ AreaCode ST_HELENA_DEPENDENCIES = new AreaCode("SH");
    public static final /* enum */ AreaCode ST_LUCIA = new AreaCode("LC");
    public static final /* enum */ AreaCode MAURITIUS = new AreaCode("MU");
    public static final /* enum */ AreaCode IVORY_COAST = new AreaCode("CI");
    public static final /* enum */ AreaCode KENYA = new AreaCode("KE");
    public static final /* enum */ AreaCode MONGOLIA = new AreaCode("MN");
    public static final /* enum */ AreaCode UU = new AreaCode("UU");
    public static final /* enum */ AreaCode FF = new AreaCode("FF");
    public static final /* enum */ AreaCode F2 = new AreaCode("F2");
    public static final /* enum */ AreaCode UNKNOWN = new AreaCode("unknown");
    private String code;
    private static final AreaCode[] allValues;
    private static final List<String> EU_CODES;
    private static final /* synthetic */ AreaCode[] $VALUES;

    public static AreaCode[] values() {
        return null;
    }

    public static AreaCode valueOf(String string2) {
        return null;
    }

    public String getCode() {
        return null;
    }

    private AreaCode(String string3) {
    }

    private boolean compareValue(String string2) {
        return false;
    }

    public String value() {
        return null;
    }

    public static AreaCode find(String string2) {
        return null;
    }

    public static boolean isInEU(AreaCode areaCode) {
        return false;
    }

    private static /* synthetic */ AreaCode[] $values() {
        return null;
    }

    static {
        $VALUES = AreaCode.$values();
        allValues = AreaCode.values();
        EU_CODES = new ArrayList<String>(Arrays.asList("AT", "BE", "BG", "HU", "DE", "GR", "DK", "IE", "ES", "IT", "CY", "LV", "LT", "LU", "MT", "NL", "PL", "PT", "RO", "SK", "SI", "FI", "FR", "HR", "CZ", "SE", "EE", "CH", "IS", "NO", "LI"));
    }
}

