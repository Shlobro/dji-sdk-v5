/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class FODCalibrationSubStep
extends Enum<FODCalibrationSubStep>
implements JNIProguardKeepTag {
    public static final /* enum */ FODCalibrationSubStep CLOSE_COVER = new FODCalibrationSubStep(0);
    public static final /* enum */ FODCalibrationSubStep FOD_CHECKING = new FODCalibrationSubStep(1);
    public static final /* enum */ FODCalibrationSubStep UNKNOWN = new FODCalibrationSubStep(65535);
    private int value;
    private static final FODCalibrationSubStep[] allValues;
    private static final /* synthetic */ FODCalibrationSubStep[] $VALUES;

    public static FODCalibrationSubStep[] values() {
        return null;
    }

    public static FODCalibrationSubStep valueOf(String string) {
        return null;
    }

    private FODCalibrationSubStep(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FODCalibrationSubStep find(int n) {
        return null;
    }

    private static /* synthetic */ FODCalibrationSubStep[] $values() {
        return null;
    }

    static {
        $VALUES = FODCalibrationSubStep.$values();
        allValues = FODCalibrationSubStep.values();
    }
}

