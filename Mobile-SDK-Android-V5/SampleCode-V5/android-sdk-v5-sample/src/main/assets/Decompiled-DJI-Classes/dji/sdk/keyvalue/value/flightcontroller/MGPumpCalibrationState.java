/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class MGPumpCalibrationState
extends Enum<MGPumpCalibrationState>
implements JNIProguardKeepTag {
    public static final /* enum */ MGPumpCalibrationState WAITING = new MGPumpCalibrationState(0);
    public static final /* enum */ MGPumpCalibrationState GOING = new MGPumpCalibrationState(1);
    public static final /* enum */ MGPumpCalibrationState SUCCESSFUL = new MGPumpCalibrationState(2);
    public static final /* enum */ MGPumpCalibrationState SPEED_UNBALANCE = new MGPumpCalibrationState(-6);
    public static final /* enum */ MGPumpCalibrationState POLYFIT_ERR = new MGPumpCalibrationState(-5);
    public static final /* enum */ MGPumpCalibrationState PUMP_RUN_ERR = new MGPumpCalibrationState(-4);
    public static final /* enum */ MGPumpCalibrationState EMF_ERR = new MGPumpCalibrationState(-3);
    public static final /* enum */ MGPumpCalibrationState PIPE_EMPTY = new MGPumpCalibrationState(-2);
    public static final /* enum */ MGPumpCalibrationState PARAM_ERR = new MGPumpCalibrationState(-1);
    public static final /* enum */ MGPumpCalibrationState UNKNOWN = new MGPumpCalibrationState(65535);
    private int value;
    private static final MGPumpCalibrationState[] allValues;
    private static final /* synthetic */ MGPumpCalibrationState[] $VALUES;

    public static MGPumpCalibrationState[] values() {
        return null;
    }

    public static MGPumpCalibrationState valueOf(String string) {
        return null;
    }

    private MGPumpCalibrationState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MGPumpCalibrationState find(int n) {
        return null;
    }

    private static /* synthetic */ MGPumpCalibrationState[] $values() {
        return null;
    }

    static {
        $VALUES = MGPumpCalibrationState.$values();
        allValues = MGPumpCalibrationState.values();
    }
}

