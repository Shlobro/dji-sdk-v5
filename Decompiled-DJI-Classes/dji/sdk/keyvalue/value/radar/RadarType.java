/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.radar;

import dji.jni.JNIProguardKeepTag;

public final class RadarType
extends Enum<RadarType>
implements JNIProguardKeepTag {
    public static final /* enum */ RadarType RADAR_1P = new RadarType(1);
    public static final /* enum */ RadarType RADAR_T16 = new RadarType(2);
    public static final /* enum */ RadarType RADAR_T20 = new RadarType(3);
    public static final /* enum */ RadarType RADAR_M300_RTK = new RadarType(4);
    public static final /* enum */ RadarType RADAR_T30_DOWN = new RadarType(5);
    public static final /* enum */ RadarType RADAR_T40 = new RadarType(6);
    public static final /* enum */ RadarType RADAR_AG701 = new RadarType(7);
    public static final /* enum */ RadarType RADAR_T30_UP = new RadarType(101);
    public static final /* enum */ RadarType UNKNOWN = new RadarType(65535);
    private int value;
    private static final RadarType[] allValues;
    private static final /* synthetic */ RadarType[] $VALUES;

    public static RadarType[] values() {
        return null;
    }

    public static RadarType valueOf(String string) {
        return null;
    }

    private RadarType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RadarType find(int n) {
        return null;
    }

    private static /* synthetic */ RadarType[] $values() {
        return null;
    }

    static {
        $VALUES = RadarType.$values();
        allValues = RadarType.values();
    }
}

