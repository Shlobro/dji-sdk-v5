/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class FODCalibrationStep
extends Enum<FODCalibrationStep>
implements JNIProguardKeepTag {
    public static final /* enum */ FODCalibrationStep FIRST_STEP_EMPETY = new FODCalibrationStep(0);
    public static final /* enum */ FODCalibrationStep SECOND_STEP_DRONE = new FODCalibrationStep(1);
    public static final /* enum */ FODCalibrationStep UNKNOWN = new FODCalibrationStep(65535);
    private int value;
    private static final FODCalibrationStep[] allValues;
    private static final /* synthetic */ FODCalibrationStep[] $VALUES;

    public static FODCalibrationStep[] values() {
        return null;
    }

    public static FODCalibrationStep valueOf(String string) {
        return null;
    }

    private FODCalibrationStep(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FODCalibrationStep find(int n) {
        return null;
    }

    private static /* synthetic */ FODCalibrationStep[] $values() {
        return null;
    }

    static {
        $VALUES = FODCalibrationStep.$values();
        allValues = FODCalibrationStep.values();
    }
}

