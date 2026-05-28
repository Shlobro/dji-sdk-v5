/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class InfinityCalibrationState
extends Enum<InfinityCalibrationState>
implements JNIProguardKeepTag {
    public static final /* enum */ InfinityCalibrationState NOT_CALIBRATE = new InfinityCalibrationState(0);
    public static final /* enum */ InfinityCalibrationState CALIBRATED = new InfinityCalibrationState(1);
    public static final /* enum */ InfinityCalibrationState CALIBRATING = new InfinityCalibrationState(2);
    public static final /* enum */ InfinityCalibrationState WAITING_FOR_CALIBRATE = new InfinityCalibrationState(3);
    public static final /* enum */ InfinityCalibrationState OTHER = new InfinityCalibrationState(100);
    public static final /* enum */ InfinityCalibrationState UNKNOWN = new InfinityCalibrationState(65535);
    private int value;
    private static final InfinityCalibrationState[] allValues;
    private static final /* synthetic */ InfinityCalibrationState[] $VALUES;

    public static InfinityCalibrationState[] values() {
        return null;
    }

    public static InfinityCalibrationState valueOf(String string) {
        return null;
    }

    private InfinityCalibrationState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static InfinityCalibrationState find(int n) {
        return null;
    }

    private static /* synthetic */ InfinityCalibrationState[] $values() {
        return null;
    }

    static {
        $VALUES = InfinityCalibrationState.$values();
        allValues = InfinityCalibrationState.values();
    }
}

