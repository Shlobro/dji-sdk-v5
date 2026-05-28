/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.rtkbasestation;

import dji.jni.JNIProguardKeepTag;

public final class DroneNestRtkCalibrationControl
extends Enum<DroneNestRtkCalibrationControl>
implements JNIProguardKeepTag {
    public static final /* enum */ DroneNestRtkCalibrationControl MIN = new DroneNestRtkCalibrationControl(1);
    public static final /* enum */ DroneNestRtkCalibrationControl SELF = new DroneNestRtkCalibrationControl(1);
    public static final /* enum */ DroneNestRtkCalibrationControl NET_RTK = new DroneNestRtkCalibrationControl(2);
    public static final /* enum */ DroneNestRtkCalibrationControl MAX = new DroneNestRtkCalibrationControl(2);
    public static final /* enum */ DroneNestRtkCalibrationControl UNKNOWN = new DroneNestRtkCalibrationControl(255);
    private int value;
    private static final DroneNestRtkCalibrationControl[] allValues;
    private static final /* synthetic */ DroneNestRtkCalibrationControl[] $VALUES;

    public static DroneNestRtkCalibrationControl[] values() {
        return null;
    }

    public static DroneNestRtkCalibrationControl valueOf(String string) {
        return null;
    }

    private DroneNestRtkCalibrationControl(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DroneNestRtkCalibrationControl find(int n) {
        return null;
    }

    private static /* synthetic */ DroneNestRtkCalibrationControl[] $values() {
        return null;
    }

    static {
        $VALUES = DroneNestRtkCalibrationControl.$values();
        allValues = DroneNestRtkCalibrationControl.values();
    }
}

