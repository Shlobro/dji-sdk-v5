/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class LimitAreaType
extends Enum<LimitAreaType>
implements JNIProguardKeepTag {
    public static final /* enum */ LimitAreaType DJI_AIRPORT = new LimitAreaType(0);
    public static final /* enum */ LimitAreaType DJI_SPECIAL_ZONE = new LimitAreaType(1);
    public static final /* enum */ LimitAreaType MILITARY_ZONE = new LimitAreaType(2);
    public static final /* enum */ LimitAreaType CRITIAL_AIRPORT = new LimitAreaType(10);
    public static final /* enum */ LimitAreaType AIRMAP_COMMERCIAL_AIRPORT = new LimitAreaType(11);
    public static final /* enum */ LimitAreaType PRIVATE_COMMERCIAL_AIRPORT = new LimitAreaType(12);
    public static final /* enum */ LimitAreaType RECREATIONAL_AIRPORT = new LimitAreaType(13);
    public static final /* enum */ LimitAreaType PRIVATE_RECREATIONAL_AIRPORT = new LimitAreaType(14);
    public static final /* enum */ LimitAreaType CLASSB = new LimitAreaType(15);
    public static final /* enum */ LimitAreaType CLASSC = new LimitAreaType(16);
    public static final /* enum */ LimitAreaType CLASSD = new LimitAreaType(17);
    public static final /* enum */ LimitAreaType CLASSE = new LimitAreaType(18);
    public static final /* enum */ LimitAreaType HELIPORTS = new LimitAreaType(19);
    public static final /* enum */ LimitAreaType NATIONAL_PARK = new LimitAreaType(20);
    public static final /* enum */ LimitAreaType NOAA = new LimitAreaType(21);
    public static final /* enum */ LimitAreaType PARCEL = new LimitAreaType(22);
    public static final /* enum */ LimitAreaType POWER_PLANT = new LimitAreaType(23);
    public static final /* enum */ LimitAreaType PRISON = new LimitAreaType(24);
    public static final /* enum */ LimitAreaType SCHOOL = new LimitAreaType(25);
    public static final /* enum */ LimitAreaType STADIUM = new LimitAreaType(26);
    public static final /* enum */ LimitAreaType PROHIBITED_SPECIAL = new LimitAreaType(27);
    public static final /* enum */ LimitAreaType RESTRICTED_SPECIAL = new LimitAreaType(28);
    public static final /* enum */ LimitAreaType TFR = new LimitAreaType(29);
    public static final /* enum */ LimitAreaType NUCLEAR_POWER_PLANT = new LimitAreaType(30);
    public static final /* enum */ LimitAreaType UNPAVED_AIRPORTS = new LimitAreaType(31);
    public static final /* enum */ LimitAreaType UNKNOWN = new LimitAreaType(65535);
    private int value;
    private static final LimitAreaType[] allValues;
    private static final /* synthetic */ LimitAreaType[] $VALUES;

    public static LimitAreaType[] values() {
        return null;
    }

    public static LimitAreaType valueOf(String string) {
        return null;
    }

    private LimitAreaType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LimitAreaType find(int n) {
        return null;
    }

    private static /* synthetic */ LimitAreaType[] $values() {
        return null;
    }

    static {
        $VALUES = LimitAreaType.$values();
        allValues = LimitAreaType.values();
    }
}

