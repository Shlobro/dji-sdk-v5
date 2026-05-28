/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class DroneNestCoverCalibrationCtrl
extends Enum<DroneNestCoverCalibrationCtrl>
implements JNIProguardKeepTag {
    public static final /* enum */ DroneNestCoverCalibrationCtrl CALIBRATION_STAGE_CMD_CLOSE = new DroneNestCoverCalibrationCtrl(0);
    public static final /* enum */ DroneNestCoverCalibrationCtrl CALIBRATION_STAGE_CMD_OPEN = new DroneNestCoverCalibrationCtrl(1);
    public static final /* enum */ DroneNestCoverCalibrationCtrl CALIBRATION_STAGE_CHECK = new DroneNestCoverCalibrationCtrl(2);
    public static final /* enum */ DroneNestCoverCalibrationCtrl CALIBRATION_STAGE_PREPARE = new DroneNestCoverCalibrationCtrl(3);
    public static final /* enum */ DroneNestCoverCalibrationCtrl UNKNOWN = new DroneNestCoverCalibrationCtrl(65535);
    private int value;
    private static final DroneNestCoverCalibrationCtrl[] allValues;
    private static final /* synthetic */ DroneNestCoverCalibrationCtrl[] $VALUES;

    public static DroneNestCoverCalibrationCtrl[] values() {
        return null;
    }

    public static DroneNestCoverCalibrationCtrl valueOf(String string) {
        return null;
    }

    private DroneNestCoverCalibrationCtrl(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DroneNestCoverCalibrationCtrl find(int n) {
        return null;
    }

    private static /* synthetic */ DroneNestCoverCalibrationCtrl[] $values() {
        return null;
    }

    static {
        $VALUES = DroneNestCoverCalibrationCtrl.$values();
        allValues = DroneNestCoverCalibrationCtrl.values();
    }
}

