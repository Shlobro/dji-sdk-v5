/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class DroneNestCoverControl
extends Enum<DroneNestCoverControl>
implements JNIProguardKeepTag {
    public static final /* enum */ DroneNestCoverControl STOP = new DroneNestCoverControl(0);
    public static final /* enum */ DroneNestCoverControl OPEN = new DroneNestCoverControl(1);
    public static final /* enum */ DroneNestCoverControl CLOSE = new DroneNestCoverControl(2);
    public static final /* enum */ DroneNestCoverControl HALF_OPEN = new DroneNestCoverControl(3);
    public static final /* enum */ DroneNestCoverControl ALL_OPEN = new DroneNestCoverControl(4);
    public static final /* enum */ DroneNestCoverControl ALL_CLOSE = new DroneNestCoverControl(5);
    public static final /* enum */ DroneNestCoverControl ALL_OPEN_DRONE = new DroneNestCoverControl(6);
    public static final /* enum */ DroneNestCoverControl ALL_CLOSE_DRONE = new DroneNestCoverControl(7);
    public static final /* enum */ DroneNestCoverControl ALL_OPEN_CHARGE = new DroneNestCoverControl(8);
    public static final /* enum */ DroneNestCoverControl ALL_CLOSE_CHARGE = new DroneNestCoverControl(9);
    public static final /* enum */ DroneNestCoverControl FORCE_CLOSE = new DroneNestCoverControl(10);
    public static final /* enum */ DroneNestCoverControl LEFT_OPEN = new DroneNestCoverControl(11);
    public static final /* enum */ DroneNestCoverControl LEFT_CLOSE = new DroneNestCoverControl(12);
    public static final /* enum */ DroneNestCoverControl RIGHT_OPEN = new DroneNestCoverControl(13);
    public static final /* enum */ DroneNestCoverControl RIGHT_CLOSE = new DroneNestCoverControl(14);
    public static final /* enum */ DroneNestCoverControl FOD_CALIBRATION_STEP1_EMPTY = new DroneNestCoverControl(15);
    public static final /* enum */ DroneNestCoverControl FOD_CALIBRATION_STEP2_DRONE = new DroneNestCoverControl(16);
    public static final /* enum */ DroneNestCoverControl UNKNOWN = new DroneNestCoverControl(65535);
    private int value;
    private static final DroneNestCoverControl[] allValues;
    private static final /* synthetic */ DroneNestCoverControl[] $VALUES;

    public static DroneNestCoverControl[] values() {
        return null;
    }

    public static DroneNestCoverControl valueOf(String string) {
        return null;
    }

    private DroneNestCoverControl(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DroneNestCoverControl find(int n) {
        return null;
    }

    private static /* synthetic */ DroneNestCoverControl[] $values() {
        return null;
    }

    static {
        $VALUES = DroneNestCoverControl.$values();
        allValues = DroneNestCoverControl.values();
    }
}

