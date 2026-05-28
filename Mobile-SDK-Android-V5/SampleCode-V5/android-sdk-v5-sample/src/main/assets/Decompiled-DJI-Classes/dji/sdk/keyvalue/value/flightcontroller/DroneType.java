/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class DroneType
extends Enum<DroneType>
implements JNIProguardKeepTag {
    public static final /* enum */ DroneType UNKNOWN = new DroneType(0);
    public static final /* enum */ DroneType INSPIRE = new DroneType(1);
    public static final /* enum */ DroneType P3S = new DroneType(2);
    public static final /* enum */ DroneType P3X = new DroneType(3);
    public static final /* enum */ DroneType P3C = new DroneType(4);
    public static final /* enum */ DroneType N1 = new DroneType(5);
    public static final /* enum */ DroneType ACEONE = new DroneType(6);
    public static final /* enum */ DroneType WKM = new DroneType(7);
    public static final /* enum */ DroneType NAZA = new DroneType(8);
    public static final /* enum */ DroneType A2 = new DroneType(9);
    public static final /* enum */ DroneType A3 = new DroneType(10);
    public static final /* enum */ DroneType P4 = new DroneType(11);
    public static final /* enum */ DroneType A2_ARG = new DroneType(12);
    public static final /* enum */ DroneType A3_IMU = new DroneType(13);
    public static final /* enum */ DroneType A3_M600 = new DroneType(14);
    public static final /* enum */ DroneType P3_4K = new DroneType(15);
    public static final /* enum */ DroneType MAVIC_PRO = new DroneType(16);
    public static final /* enum */ DroneType INSPIRE2 = new DroneType(17);
    public static final /* enum */ DroneType P4P = new DroneType(18);
    public static final /* enum */ DroneType MG_1S = new DroneType(19);
    public static final /* enum */ DroneType N3 = new DroneType(20);
    public static final /* enum */ DroneType SPARK = new DroneType(21);
    public static final /* enum */ DroneType NOT_SUPPORTED_0 = new DroneType(22);
    public static final /* enum */ DroneType A3_M600_PRO = new DroneType(23);
    public static final /* enum */ DroneType MAVIC_AIR = new DroneType(24);
    public static final /* enum */ DroneType M200 = new DroneType(25);
    public static final /* enum */ DroneType N3_AGR = new DroneType(26);
    public static final /* enum */ DroneType P4A = new DroneType(27);
    public static final /* enum */ DroneType M210 = new DroneType(28);
    public static final /* enum */ DroneType P3SE = new DroneType(29);
    public static final /* enum */ DroneType M210RTK = new DroneType(30);
    public static final /* enum */ DroneType A3_AGR = new DroneType(31);
    public static final /* enum */ DroneType T16 = new DroneType(32);
    public static final /* enum */ DroneType N3_FW = new DroneType(33);
    public static final /* enum */ DroneType MG_1A = new DroneType(34);
    public static final /* enum */ DroneType P4R = new DroneType(35);
    public static final /* enum */ DroneType P4P_SDR = new DroneType(36);
    public static final /* enum */ DroneType RM = new DroneType(37);
    public static final /* enum */ DroneType MG_1P = new DroneType(38);
    public static final /* enum */ DroneType NOT_SUPPORTED_1 = new DroneType(39);
    public static final /* enum */ DroneType MG_1P_PRO = new DroneType(40);
    public static final /* enum */ DroneType MAVIC_2_SERIES = new DroneType(41);
    public static final /* enum */ DroneType A3_AGR2 = new DroneType(42);
    public static final /* enum */ DroneType N3_AGR2 = new DroneType(43);
    public static final /* enum */ DroneType M200_V2_SERIES = new DroneType(44);
    public static final /* enum */ DroneType NOT_SUPPORTED_2 = new DroneType(45);
    public static final /* enum */ DroneType NOT_SUPPORTED_3 = new DroneType(46);
    public static final /* enum */ DroneType WIND_1 = new DroneType(47);
    public static final /* enum */ DroneType WIND_2 = new DroneType(48);
    public static final /* enum */ DroneType WIND_4 = new DroneType(49);
    public static final /* enum */ DroneType WIND_8 = new DroneType(50);
    public static final /* enum */ DroneType MAVIC_2_ENTERPRISE = new DroneType(51);
    public static final /* enum */ DroneType NOT_SUPPORTED_4 = new DroneType(52);
    public static final /* enum */ DroneType MAVIC_MINI = new DroneType(53);
    public static final /* enum */ DroneType NOT_SUPPORTED_5 = new DroneType(54);
    public static final /* enum */ DroneType NOT_SUPPORTED_6 = new DroneType(55);
    public static final /* enum */ DroneType A3_AGR3 = new DroneType(56);
    public static final /* enum */ DroneType N3_AGR3 = new DroneType(57);
    public static final /* enum */ DroneType MAVIC_AIR_2 = new DroneType(58);
    public static final /* enum */ DroneType P4M = new DroneType(59);
    public static final /* enum */ DroneType M300_RTK = new DroneType(60);
    public static final /* enum */ DroneType DJI_FPV = new DroneType(61);
    public static final /* enum */ DroneType T20 = new DroneType(62);
    public static final /* enum */ DroneType DJI_MINI_2 = new DroneType(63);
    public static final /* enum */ DroneType DJI_AIR_2S = new DroneType(66);
    public static final /* enum */ DroneType M30_SERIES = new DroneType(67);
    public static final /* enum */ DroneType NOT_SUPPORTED_7 = new DroneType(76);
    public static final /* enum */ DroneType DJI_MAVIC_3_ENTERPRISE_SERIES = new DroneType(77);
    public static final /* enum */ DroneType TA101 = new DroneType(78);
    public static final /* enum */ DroneType WM163 = new DroneType(87);
    public static final /* enum */ DroneType PM431 = new DroneType(89);
    public static final /* enum */ DroneType EA220 = new DroneType(91);
    public static final /* enum */ DroneType WA140 = new DroneType(93);
    public static final /* enum */ DroneType WA525 = new DroneType(94);
    public static final /* enum */ DroneType DJI_MATRICE_4_SERIES = new DroneType(99);
    public static final /* enum */ DroneType DJI_MATRICE_4D_SERIES = new DroneType(100);
    public static final /* enum */ DroneType DJI_MATRICE_400 = new DroneType(103);
    public static final /* enum */ DroneType OTHER_MC = new DroneType(255);
    private int value;
    private static final DroneType[] allValues;
    private static final /* synthetic */ DroneType[] $VALUES;

    public static DroneType[] values() {
        return null;
    }

    public static DroneType valueOf(String string) {
        return null;
    }

    private DroneType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DroneType find(int n) {
        return null;
    }

    private static /* synthetic */ DroneType[] $values() {
        return null;
    }

    static {
        $VALUES = DroneType.$values();
        allValues = DroneType.values();
    }
}

