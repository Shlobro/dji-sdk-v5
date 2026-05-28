/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class DroneNestCoverErrorCode
extends Enum<DroneNestCoverErrorCode>
implements JNIProguardKeepTag {
    public static final /* enum */ DroneNestCoverErrorCode NORMAL = new DroneNestCoverErrorCode(0);
    public static final /* enum */ DroneNestCoverErrorCode OVER_CURRENT = new DroneNestCoverErrorCode(1);
    public static final /* enum */ DroneNestCoverErrorCode OVER_LOAD = new DroneNestCoverErrorCode(2);
    public static final /* enum */ DroneNestCoverErrorCode LOCATION_ERR_OVERSIZE = new DroneNestCoverErrorCode(3);
    public static final /* enum */ DroneNestCoverErrorCode OVER_SPEED = new DroneNestCoverErrorCode(4);
    public static final /* enum */ DroneNestCoverErrorCode NOT_CTRL = new DroneNestCoverErrorCode(5);
    public static final /* enum */ DroneNestCoverErrorCode LOW_VOLTAGE = new DroneNestCoverErrorCode(6);
    public static final /* enum */ DroneNestCoverErrorCode HIGH_VOLTAGE = new DroneNestCoverErrorCode(7);
    public static final /* enum */ DroneNestCoverErrorCode ENCODER_ERR = new DroneNestCoverErrorCode(8);
    public static final /* enum */ DroneNestCoverErrorCode EMERY_STOP = new DroneNestCoverErrorCode(9);
    public static final /* enum */ DroneNestCoverErrorCode BLEEDER_RESISTANCE_OVERLOAD = new DroneNestCoverErrorCode(16);
    public static final /* enum */ DroneNestCoverErrorCode UNKNOWN = new DroneNestCoverErrorCode(65535);
    private int value;
    private static final DroneNestCoverErrorCode[] allValues;
    private static final /* synthetic */ DroneNestCoverErrorCode[] $VALUES;

    public static DroneNestCoverErrorCode[] values() {
        return null;
    }

    public static DroneNestCoverErrorCode valueOf(String string) {
        return null;
    }

    private DroneNestCoverErrorCode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DroneNestCoverErrorCode find(int n) {
        return null;
    }

    private static /* synthetic */ DroneNestCoverErrorCode[] $values() {
        return null;
    }

    static {
        $VALUES = DroneNestCoverErrorCode.$values();
        allValues = DroneNestCoverErrorCode.values();
    }
}

