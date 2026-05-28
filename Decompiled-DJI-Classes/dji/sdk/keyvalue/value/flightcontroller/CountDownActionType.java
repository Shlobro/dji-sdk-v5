/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class CountDownActionType
extends Enum<CountDownActionType>
implements JNIProguardKeepTag {
    public static final /* enum */ CountDownActionType NO_GPS_CONTINUE_RETURN_HOME = new CountDownActionType(0);
    public static final /* enum */ CountDownActionType CHECK_COVER_RESULT = new CountDownActionType(1);
    public static final /* enum */ CountDownActionType SMART_RETURN_HOME = new CountDownActionType(2);
    public static final /* enum */ CountDownActionType SMART_FORCE_RETURNHOME = new CountDownActionType(3);
    public static final /* enum */ CountDownActionType SMART_FORCE_LANDING = new CountDownActionType(4);
    public static final /* enum */ CountDownActionType WATER_LANDING = new CountDownActionType(6);
    public static final /* enum */ CountDownActionType PREVENT_TAKEOFF_SDR_NOT_CONNECTED = new CountDownActionType(7);
    public static final /* enum */ CountDownActionType UNKNOWN = new CountDownActionType(65535);
    private int value;
    private static final CountDownActionType[] allValues;
    private static final /* synthetic */ CountDownActionType[] $VALUES;

    public static CountDownActionType[] values() {
        return null;
    }

    public static CountDownActionType valueOf(String string) {
        return null;
    }

    private CountDownActionType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CountDownActionType find(int n) {
        return null;
    }

    private static /* synthetic */ CountDownActionType[] $values() {
        return null;
    }

    static {
        $VALUES = CountDownActionType.$values();
        allValues = CountDownActionType.values();
    }
}

