/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class CompassCalibrationState
extends Enum<CompassCalibrationState>
implements JNIProguardKeepTag {
    public static final /* enum */ CompassCalibrationState IDLE = new CompassCalibrationState(0);
    public static final /* enum */ CompassCalibrationState HORIZONTAL = new CompassCalibrationState(1);
    public static final /* enum */ CompassCalibrationState VERTICAL = new CompassCalibrationState(2);
    public static final /* enum */ CompassCalibrationState SUCCEEDED = new CompassCalibrationState(3);
    public static final /* enum */ CompassCalibrationState FAILED = new CompassCalibrationState(4);
    public static final /* enum */ CompassCalibrationState UNKNOWN = new CompassCalibrationState(65535);
    private int value;
    private static final CompassCalibrationState[] allValues;
    private static final /* synthetic */ CompassCalibrationState[] $VALUES;

    public static CompassCalibrationState[] values() {
        return null;
    }

    public static CompassCalibrationState valueOf(String string) {
        return null;
    }

    private CompassCalibrationState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CompassCalibrationState find(int n) {
        return null;
    }

    private static /* synthetic */ CompassCalibrationState[] $values() {
        return null;
    }

    static {
        $VALUES = CompassCalibrationState.$values();
        allValues = CompassCalibrationState.values();
    }
}

