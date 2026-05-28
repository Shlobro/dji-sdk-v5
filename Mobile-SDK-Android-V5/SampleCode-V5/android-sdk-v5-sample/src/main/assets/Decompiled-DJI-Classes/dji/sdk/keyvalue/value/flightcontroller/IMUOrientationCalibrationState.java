/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class IMUOrientationCalibrationState
extends Enum<IMUOrientationCalibrationState>
implements JNIProguardKeepTag {
    public static final /* enum */ IMUOrientationCalibrationState CALIBRATING = new IMUOrientationCalibrationState(0);
    public static final /* enum */ IMUOrientationCalibrationState SUCCESSFUL = new IMUOrientationCalibrationState(1);
    public static final /* enum */ IMUOrientationCalibrationState UNKNOWN = new IMUOrientationCalibrationState(65535);
    private int value;
    private static final IMUOrientationCalibrationState[] allValues;
    private static final /* synthetic */ IMUOrientationCalibrationState[] $VALUES;

    public static IMUOrientationCalibrationState[] values() {
        return null;
    }

    public static IMUOrientationCalibrationState valueOf(String string) {
        return null;
    }

    private IMUOrientationCalibrationState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static IMUOrientationCalibrationState find(int n) {
        return null;
    }

    private static /* synthetic */ IMUOrientationCalibrationState[] $values() {
        return null;
    }

    static {
        $VALUES = IMUOrientationCalibrationState.$values();
        allValues = IMUOrientationCalibrationState.values();
    }
}

