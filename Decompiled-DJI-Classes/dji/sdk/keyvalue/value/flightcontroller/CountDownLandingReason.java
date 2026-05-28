/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class CountDownLandingReason
extends Enum<CountDownLandingReason>
implements JNIProguardKeepTag {
    public static final /* enum */ CountDownLandingReason LOW_BAT_GO_HOME = new CountDownLandingReason(1);
    public static final /* enum */ CountDownLandingReason LOW_BAT_LANDING = new CountDownLandingReason(2);
    public static final /* enum */ CountDownLandingReason ABOVE_WATER = new CountDownLandingReason(3);
    public static final /* enum */ CountDownLandingReason NO_GPS_CONTINUE_RETURN_HOME = new CountDownLandingReason(4);
    public static final /* enum */ CountDownLandingReason LOW_BAT_GO_HOME_AND_LANDING = new CountDownLandingReason(5);
    public static final /* enum */ CountDownLandingReason LOST_PICTURE = new CountDownLandingReason(6);
    public static final /* enum */ CountDownLandingReason STOP_MOTOR_FOR_SDR_CNT_DOWN = new CountDownLandingReason(7);
    public static final /* enum */ CountDownLandingReason CHECK_COVER_RESULT = new CountDownLandingReason(8);
    public static final /* enum */ CountDownLandingReason UNKNOWN = new CountDownLandingReason(65535);
    private int value;
    private static final CountDownLandingReason[] allValues;
    private static final /* synthetic */ CountDownLandingReason[] $VALUES;

    public static CountDownLandingReason[] values() {
        return null;
    }

    public static CountDownLandingReason valueOf(String string) {
        return null;
    }

    private CountDownLandingReason(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CountDownLandingReason find(int n) {
        return null;
    }

    private static /* synthetic */ CountDownLandingReason[] $values() {
        return null;
    }

    static {
        $VALUES = CountDownLandingReason.$values();
        allValues = CountDownLandingReason.values();
    }
}

