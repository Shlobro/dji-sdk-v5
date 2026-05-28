/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class EMFCalibrationState
extends Enum<EMFCalibrationState>
implements JNIProguardKeepTag {
    public static final /* enum */ EMFCalibrationState SUCCESSFUL = new EMFCalibrationState(0);
    public static final /* enum */ EMFCalibrationState DATA_FIT_TIMES_NOT_SUPPORTED = new EMFCalibrationState(-17);
    public static final /* enum */ EMFCalibrationState INSUFFICIENT_DATA_FITTING = new EMFCalibrationState(-16);
    public static final /* enum */ EMFCalibrationState INSUFFICIENT_EFFECTIVE_DATA = new EMFCalibrationState(-15);
    public static final /* enum */ EMFCalibrationState TIMEOUT = new EMFCalibrationState(-14);
    public static final /* enum */ EMFCalibrationState PIPE_EMPTY = new EMFCalibrationState(-12);
    public static final /* enum */ EMFCalibrationState DATA_INVALID = new EMFCalibrationState(-11);
    public static final /* enum */ EMFCalibrationState PARAM_OVER_LIMIT = new EMFCalibrationState(-13);
    public static final /* enum */ EMFCalibrationState STEP_ERR = new EMFCalibrationState(-10);
    public static final /* enum */ EMFCalibrationState CMD_ERROR = new EMFCalibrationState(-20);
    public static final /* enum */ EMFCalibrationState UNKNOWN = new EMFCalibrationState(65535);
    private int value;
    private static final EMFCalibrationState[] allValues;
    private static final /* synthetic */ EMFCalibrationState[] $VALUES;

    public static EMFCalibrationState[] values() {
        return null;
    }

    public static EMFCalibrationState valueOf(String string) {
        return null;
    }

    private EMFCalibrationState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static EMFCalibrationState find(int n) {
        return null;
    }

    private static /* synthetic */ EMFCalibrationState[] $values() {
        return null;
    }

    static {
        $VALUES = EMFCalibrationState.$values();
        allValues = EMFCalibrationState.values();
    }
}

