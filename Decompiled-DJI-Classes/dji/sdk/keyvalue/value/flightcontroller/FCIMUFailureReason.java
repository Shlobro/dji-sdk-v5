/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class FCIMUFailureReason
extends Enum<FCIMUFailureReason>
implements JNIProguardKeepTag {
    public static final /* enum */ FCIMUFailureReason MONITOR = new FCIMUFailureReason(0);
    public static final /* enum */ FCIMUFailureReason COLLETING_DATA = new FCIMUFailureReason(1);
    public static final /* enum */ FCIMUFailureReason GYRO_DEAD = new FCIMUFailureReason(2);
    public static final /* enum */ FCIMUFailureReason ACCE_DEAD = new FCIMUFailureReason(3);
    public static final /* enum */ FCIMUFailureReason COMPASS_DEAD = new FCIMUFailureReason(4);
    public static final /* enum */ FCIMUFailureReason BAROMETER_DEAD = new FCIMUFailureReason(5);
    public static final /* enum */ FCIMUFailureReason BAROMETER_NEGATIVE = new FCIMUFailureReason(6);
    public static final /* enum */ FCIMUFailureReason COMPASS_MOD_TOO_LARGE = new FCIMUFailureReason(7);
    public static final /* enum */ FCIMUFailureReason GYRO_BIAS_TOO_LARGE = new FCIMUFailureReason(8);
    public static final /* enum */ FCIMUFailureReason ACCE_BIAS_TOO_LARGE = new FCIMUFailureReason(9);
    public static final /* enum */ FCIMUFailureReason COMPASS_NOISE_TOO_LARGE = new FCIMUFailureReason(10);
    public static final /* enum */ FCIMUFailureReason BAROMETER_NOISE_TOO_LARGE = new FCIMUFailureReason(11);
    public static final /* enum */ FCIMUFailureReason WAITING_AIRCRAFT_STATIONARY = new FCIMUFailureReason(12);
    public static final /* enum */ FCIMUFailureReason ACCE_MOVE_TOO_LARGE = new FCIMUFailureReason(13);
    public static final /* enum */ FCIMUFailureReason AIRCRAFT_HEAD_MOVED = new FCIMUFailureReason(14);
    public static final /* enum */ FCIMUFailureReason AIRCRAFT_VIRBRATED = new FCIMUFailureReason(15);
    public static final /* enum */ FCIMUFailureReason UNKNOWN = new FCIMUFailureReason(65535);
    private int value;
    private static final FCIMUFailureReason[] allValues;
    private static final /* synthetic */ FCIMUFailureReason[] $VALUES;

    public static FCIMUFailureReason[] values() {
        return null;
    }

    public static FCIMUFailureReason valueOf(String string) {
        return null;
    }

    private FCIMUFailureReason(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FCIMUFailureReason find(int n) {
        return null;
    }

    private static /* synthetic */ FCIMUFailureReason[] $values() {
        return null;
    }

    static {
        $VALUES = FCIMUFailureReason.$values();
        allValues = FCIMUFailureReason.values();
    }
}

