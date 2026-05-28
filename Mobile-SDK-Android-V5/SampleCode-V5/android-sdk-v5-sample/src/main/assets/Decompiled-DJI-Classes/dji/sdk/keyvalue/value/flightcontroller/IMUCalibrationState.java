/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class IMUCalibrationState
extends Enum<IMUCalibrationState>
implements JNIProguardKeepTag {
    public static final /* enum */ IMUCalibrationState NONE = new IMUCalibrationState(0);
    public static final /* enum */ IMUCalibrationState CALIBRATING = new IMUCalibrationState(1);
    public static final /* enum */ IMUCalibrationState SUCCESSFUL = new IMUCalibrationState(2);
    public static final /* enum */ IMUCalibrationState FAILED = new IMUCalibrationState(3);
    public static final /* enum */ IMUCalibrationState UNKNOWN = new IMUCalibrationState(65535);
    private int value;
    private static final IMUCalibrationState[] allValues;
    private static final /* synthetic */ IMUCalibrationState[] $VALUES;

    public static IMUCalibrationState[] values() {
        return null;
    }

    public static IMUCalibrationState valueOf(String string) {
        return null;
    }

    private IMUCalibrationState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static IMUCalibrationState find(int n) {
        return null;
    }

    private static /* synthetic */ IMUCalibrationState[] $values() {
        return null;
    }

    static {
        $VALUES = IMUCalibrationState.$values();
        allValues = IMUCalibrationState.values();
    }
}

