/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;

public final class GimbalCalibrationState
extends Enum<GimbalCalibrationState>
implements JNIProguardKeepTag {
    public static final /* enum */ GimbalCalibrationState IDLE = new GimbalCalibrationState(0);
    public static final /* enum */ GimbalCalibrationState IN_PROGRESS = new GimbalCalibrationState(1);
    public static final /* enum */ GimbalCalibrationState FAILED = new GimbalCalibrationState(3);
    public static final /* enum */ GimbalCalibrationState UNKNOWN = new GimbalCalibrationState(65535);
    private int value;
    private static final GimbalCalibrationState[] allValues;
    private static final /* synthetic */ GimbalCalibrationState[] $VALUES;

    public static GimbalCalibrationState[] values() {
        return null;
    }

    public static GimbalCalibrationState valueOf(String string) {
        return null;
    }

    private GimbalCalibrationState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GimbalCalibrationState find(int n) {
        return null;
    }

    private static /* synthetic */ GimbalCalibrationState[] $values() {
        return null;
    }

    static {
        $VALUES = GimbalCalibrationState.$values();
        allValues = GimbalCalibrationState.values();
    }
}

