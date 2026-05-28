/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class MGSowCalibrateState
extends Enum<MGSowCalibrateState>
implements JNIProguardKeepTag {
    public static final /* enum */ MGSowCalibrateState NOT_IN_CALIBRATE_MODE = new MGSowCalibrateState(0);
    public static final /* enum */ MGSowCalibrateState CALIBRATE_OPEN_HATCH_AND_TURNTABLE = new MGSowCalibrateState(1);
    public static final /* enum */ MGSowCalibrateState CLAIBRATE_UNOPEN_HATCH_AND_TURNTABLE = new MGSowCalibrateState(2);
    public static final /* enum */ MGSowCalibrateState UNKNOWN = new MGSowCalibrateState(65535);
    private int value;
    private static final MGSowCalibrateState[] allValues;
    private static final /* synthetic */ MGSowCalibrateState[] $VALUES;

    public static MGSowCalibrateState[] values() {
        return null;
    }

    public static MGSowCalibrateState valueOf(String string) {
        return null;
    }

    private MGSowCalibrateState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MGSowCalibrateState find(int n) {
        return null;
    }

    private static /* synthetic */ MGSowCalibrateState[] $values() {
        return null;
    }

    static {
        $VALUES = MGSowCalibrateState.$values();
        allValues = MGSowCalibrateState.values();
    }
}

