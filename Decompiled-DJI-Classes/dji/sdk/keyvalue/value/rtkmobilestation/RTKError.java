/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.rtkmobilestation;

import dji.jni.JNIProguardKeepTag;

public final class RTKError
extends Enum<RTKError>
implements JNIProguardKeepTag {
    public static final /* enum */ RTKError NONE = new RTKError(0);
    public static final /* enum */ RTKError CANNOT_START = new RTKError(1);
    public static final /* enum */ RTKError CONNECTION_BROKEN = new RTKError(2);
    public static final /* enum */ RTKError BS_ANTENNA_ERROR = new RTKError(3);
    public static final /* enum */ RTKError BS_COORDINATE_RESET = new RTKError(4);
    public static final /* enum */ RTKError INTIALIZING = new RTKError(5);
    public static final /* enum */ RTKError BASE_STATION_NOT_ACTIVATED = new RTKError(6);
    public static final /* enum */ RTKError RTCM_TYPE_CHANGE = new RTKError(7);
    public static final /* enum */ RTKError BASE_STATION_IS_MOVED = new RTKError(8);
    public static final /* enum */ RTKError BASE_STATION_FELL = new RTKError(9);
    public static final /* enum */ RTKError UNKNOWN = new RTKError(65535);
    private int value;
    private static final RTKError[] allValues;
    private static final /* synthetic */ RTKError[] $VALUES;

    public static RTKError[] values() {
        return null;
    }

    public static RTKError valueOf(String string) {
        return null;
    }

    private RTKError(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RTKError find(int n) {
        return null;
    }

    private static /* synthetic */ RTKError[] $values() {
        return null;
    }

    static {
        $VALUES = RTKError.$values();
        allValues = RTKError.values();
    }
}

