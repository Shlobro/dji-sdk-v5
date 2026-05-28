/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class LLGCalibrationErrorCode
extends Enum<LLGCalibrationErrorCode>
implements JNIProguardKeepTag {
    public static final /* enum */ LLGCalibrationErrorCode CALI_SUCCESS = new LLGCalibrationErrorCode(0);
    public static final /* enum */ LLGCalibrationErrorCode LLG_DEVICE_ABSENT = new LLGCalibrationErrorCode(1);
    public static final /* enum */ LLGCalibrationErrorCode LOC_NOT_STABLE = new LLGCalibrationErrorCode(2);
    public static final /* enum */ LLGCalibrationErrorCode LLG_VLOUME_ERROR = new LLGCalibrationErrorCode(3);
    public static final /* enum */ LLGCalibrationErrorCode CALI_RESIDUAL_OVER_THRL = new LLGCalibrationErrorCode(4);
    public static final /* enum */ LLGCalibrationErrorCode CALI_OTHER_ERROR = new LLGCalibrationErrorCode(5);
    public static final /* enum */ LLGCalibrationErrorCode UNKNOWN = new LLGCalibrationErrorCode(65535);
    private int value;
    private static final LLGCalibrationErrorCode[] allValues;
    private static final /* synthetic */ LLGCalibrationErrorCode[] $VALUES;

    public static LLGCalibrationErrorCode[] values() {
        return null;
    }

    public static LLGCalibrationErrorCode valueOf(String string) {
        return null;
    }

    private LLGCalibrationErrorCode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LLGCalibrationErrorCode find(int n) {
        return null;
    }

    private static /* synthetic */ LLGCalibrationErrorCode[] $values() {
        return null;
    }

    static {
        $VALUES = LLGCalibrationErrorCode.$values();
        allValues = LLGCalibrationErrorCode.values();
    }
}

