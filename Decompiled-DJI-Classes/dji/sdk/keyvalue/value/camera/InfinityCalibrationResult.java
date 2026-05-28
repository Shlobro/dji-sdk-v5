/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class InfinityCalibrationResult
extends Enum<InfinityCalibrationResult>
implements JNIProguardKeepTag {
    public static final /* enum */ InfinityCalibrationResult IDLE = new InfinityCalibrationResult(0);
    public static final /* enum */ InfinityCalibrationResult SUCCEEDED = new InfinityCalibrationResult(1);
    public static final /* enum */ InfinityCalibrationResult TOOCLOSE = new InfinityCalibrationResult(2);
    public static final /* enum */ InfinityCalibrationResult ERROR = new InfinityCalibrationResult(3);
    public static final /* enum */ InfinityCalibrationResult UNKNOWN = new InfinityCalibrationResult(65535);
    private int value;
    private static final InfinityCalibrationResult[] allValues;
    private static final /* synthetic */ InfinityCalibrationResult[] $VALUES;

    public static InfinityCalibrationResult[] values() {
        return null;
    }

    public static InfinityCalibrationResult valueOf(String string) {
        return null;
    }

    private InfinityCalibrationResult(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static InfinityCalibrationResult find(int n) {
        return null;
    }

    private static /* synthetic */ InfinityCalibrationResult[] $values() {
        return null;
    }

    static {
        $VALUES = InfinityCalibrationResult.$values();
        allValues = InfinityCalibrationResult.values();
    }
}

