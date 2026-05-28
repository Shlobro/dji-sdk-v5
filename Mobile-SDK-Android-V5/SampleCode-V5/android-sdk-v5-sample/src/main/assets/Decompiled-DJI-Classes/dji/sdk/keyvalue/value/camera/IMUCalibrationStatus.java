/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class IMUCalibrationStatus
extends Enum<IMUCalibrationStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ IMUCalibrationStatus IDLE = new IMUCalibrationStatus(0);
    public static final /* enum */ IMUCalibrationStatus INPROGRESS = new IMUCalibrationStatus(1);
    public static final /* enum */ IMUCalibrationStatus SUCCESSFUL = new IMUCalibrationStatus(2);
    public static final /* enum */ IMUCalibrationStatus FAILED = new IMUCalibrationStatus(3);
    public static final /* enum */ IMUCalibrationStatus UNKNOWN = new IMUCalibrationStatus(65535);
    private int value;
    private static final IMUCalibrationStatus[] allValues;
    private static final /* synthetic */ IMUCalibrationStatus[] $VALUES;

    public static IMUCalibrationStatus[] values() {
        return null;
    }

    public static IMUCalibrationStatus valueOf(String string) {
        return null;
    }

    private IMUCalibrationStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static IMUCalibrationStatus find(int n) {
        return null;
    }

    private static /* synthetic */ IMUCalibrationStatus[] $values() {
        return null;
    }

    static {
        $VALUES = IMUCalibrationStatus.$values();
        allValues = IMUCalibrationStatus.values();
    }
}

