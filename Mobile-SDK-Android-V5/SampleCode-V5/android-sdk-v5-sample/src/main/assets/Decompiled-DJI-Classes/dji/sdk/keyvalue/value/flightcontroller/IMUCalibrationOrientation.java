/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class IMUCalibrationOrientation
extends Enum<IMUCalibrationOrientation>
implements JNIProguardKeepTag {
    public static final /* enum */ IMUCalibrationOrientation NOSE_DOWN = new IMUCalibrationOrientation(0);
    public static final /* enum */ IMUCalibrationOrientation TAIL_DOWN = new IMUCalibrationOrientation(1);
    public static final /* enum */ IMUCalibrationOrientation RIGHT_DOWN = new IMUCalibrationOrientation(2);
    public static final /* enum */ IMUCalibrationOrientation LEFT_DOWN = new IMUCalibrationOrientation(3);
    public static final /* enum */ IMUCalibrationOrientation BOTTOM_DOWN = new IMUCalibrationOrientation(4);
    public static final /* enum */ IMUCalibrationOrientation TOP_DOWN = new IMUCalibrationOrientation(5);
    public static final /* enum */ IMUCalibrationOrientation UNKNOWN = new IMUCalibrationOrientation(65535);
    private int value;
    private static final IMUCalibrationOrientation[] allValues;
    private static final /* synthetic */ IMUCalibrationOrientation[] $VALUES;

    public static IMUCalibrationOrientation[] values() {
        return null;
    }

    public static IMUCalibrationOrientation valueOf(String string) {
        return null;
    }

    private IMUCalibrationOrientation(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static IMUCalibrationOrientation find(int n) {
        return null;
    }

    private static /* synthetic */ IMUCalibrationOrientation[] $values() {
        return null;
    }

    static {
        $VALUES = IMUCalibrationOrientation.$values();
        allValues = IMUCalibrationOrientation.values();
    }
}

