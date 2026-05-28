/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class FCHeightLimitReason
extends Enum<FCHeightLimitReason>
implements JNIProguardKeepTag {
    public static final /* enum */ FCHeightLimitReason NONE = new FCHeightLimitReason(0);
    public static final /* enum */ FCHeightLimitReason NO_GPS_LIMIT = new FCHeightLimitReason(1);
    public static final /* enum */ FCHeightLimitReason COMPASS_NOT_CALIBRATE_WITH_GPS = new FCHeightLimitReason(2);
    public static final /* enum */ FCHeightLimitReason IN_WAYPOINT = new FCHeightLimitReason(3);
    public static final /* enum */ FCHeightLimitReason AVOID_GROUND = new FCHeightLimitReason(4);
    public static final /* enum */ FCHeightLimitReason NORMAL = new FCHeightLimitReason(5);
    public static final /* enum */ FCHeightLimitReason NFZ = new FCHeightLimitReason(6);
    public static final /* enum */ FCHeightLimitReason NOVICE_MODE = new FCHeightLimitReason(7);
    public static final /* enum */ FCHeightLimitReason WIFI_MODE = new FCHeightLimitReason(8);
    public static final /* enum */ FCHeightLimitReason WRISTBAND = new FCHeightLimitReason(9);
    public static final /* enum */ FCHeightLimitReason REAL_NAME = new FCHeightLimitReason(10);
    public static final /* enum */ FCHeightLimitReason INVALID_REF_HEIGHT = new FCHeightLimitReason(11);
    public static final /* enum */ FCHeightLimitReason PROP_COVER = new FCHeightLimitReason(12);
    public static final /* enum */ FCHeightLimitReason EU_C0 = new FCHeightLimitReason(13);
    public static final /* enum */ FCHeightLimitReason POOR_GPS_AT_NIGHT = new FCHeightLimitReason(14);
    public static final /* enum */ FCHeightLimitReason GPS_LEVEL_NEVER_BE_GOOD_AND_NO_APP_POSE = new FCHeightLimitReason(15);
    public static final /* enum */ FCHeightLimitReason UNKNOWN = new FCHeightLimitReason(65535);
    private int value;
    private static final FCHeightLimitReason[] allValues;
    private static final /* synthetic */ FCHeightLimitReason[] $VALUES;

    public static FCHeightLimitReason[] values() {
        return null;
    }

    public static FCHeightLimitReason valueOf(String string) {
        return null;
    }

    private FCHeightLimitReason(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FCHeightLimitReason find(int n) {
        return null;
    }

    private static /* synthetic */ FCHeightLimitReason[] $values() {
        return null;
    }

    static {
        $VALUES = FCHeightLimitReason.$values();
        allValues = FCHeightLimitReason.values();
    }
}

