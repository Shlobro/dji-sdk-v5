/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class FCGPSModeFailureReason
extends Enum<FCGPSModeFailureReason>
implements JNIProguardKeepTag {
    public static final /* enum */ FCGPSModeFailureReason NONE = new FCGPSModeFailureReason(0);
    public static final /* enum */ FCGPSModeFailureReason DISABLED = new FCGPSModeFailureReason(1);
    public static final /* enum */ FCGPSModeFailureReason NOT_ENOUGH_SATELLITE_COUNT = new FCGPSModeFailureReason(2);
    public static final /* enum */ FCGPSModeFailureReason GPS_HDOP_TOO_HIGH = new FCGPSModeFailureReason(3);
    public static final /* enum */ FCGPSModeFailureReason GPS_VELOCITY_NOT_MATCH = new FCGPSModeFailureReason(4);
    public static final /* enum */ FCGPSModeFailureReason GPS_VELOCITY_ERROR = new FCGPSModeFailureReason(5);
    public static final /* enum */ FCGPSModeFailureReason GPS_YAW_ERROR = new FCGPSModeFailureReason(6);
    public static final /* enum */ FCGPSModeFailureReason COMPASS_ERROR = new FCGPSModeFailureReason(7);
    public static final /* enum */ FCGPSModeFailureReason UNKNOWN = new FCGPSModeFailureReason(8);
    private int value;
    private static final FCGPSModeFailureReason[] allValues;
    private static final /* synthetic */ FCGPSModeFailureReason[] $VALUES;

    public static FCGPSModeFailureReason[] values() {
        return null;
    }

    public static FCGPSModeFailureReason valueOf(String string) {
        return null;
    }

    private FCGPSModeFailureReason(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FCGPSModeFailureReason find(int n) {
        return null;
    }

    private static /* synthetic */ FCGPSModeFailureReason[] $values() {
        return null;
    }

    static {
        $VALUES = FCGPSModeFailureReason.$values();
        allValues = FCGPSModeFailureReason.values();
    }
}

