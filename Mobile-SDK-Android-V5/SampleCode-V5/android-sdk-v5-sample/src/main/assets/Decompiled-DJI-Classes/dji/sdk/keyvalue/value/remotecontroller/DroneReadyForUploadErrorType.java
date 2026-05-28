/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class DroneReadyForUploadErrorType
extends Enum<DroneReadyForUploadErrorType>
implements JNIProguardKeepTag {
    public static final /* enum */ DroneReadyForUploadErrorType NO_ERROR = new DroneReadyForUploadErrorType(0);
    public static final /* enum */ DroneReadyForUploadErrorType HMS_ERROR = new DroneReadyForUploadErrorType(1);
    public static final /* enum */ DroneReadyForUploadErrorType AP_FUSION_NOT_USED = new DroneReadyForUploadErrorType(2);
    public static final /* enum */ DroneReadyForUploadErrorType RTK_NOT_FIXED = new DroneReadyForUploadErrorType(3);
    public static final /* enum */ DroneReadyForUploadErrorType POSE_DEVIATED = new DroneReadyForUploadErrorType(4);
    public static final /* enum */ DroneReadyForUploadErrorType WAYPOINT_ERROR = new DroneReadyForUploadErrorType(5);
    public static final /* enum */ DroneReadyForUploadErrorType POSITION_INCONSISTENT = new DroneReadyForUploadErrorType(6);
    public static final /* enum */ DroneReadyForUploadErrorType UNKNOWN = new DroneReadyForUploadErrorType(65535);
    private int value;
    private static final DroneReadyForUploadErrorType[] allValues;
    private static final /* synthetic */ DroneReadyForUploadErrorType[] $VALUES;

    public static DroneReadyForUploadErrorType[] values() {
        return null;
    }

    public static DroneReadyForUploadErrorType valueOf(String string) {
        return null;
    }

    private DroneReadyForUploadErrorType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DroneReadyForUploadErrorType find(int n) {
        return null;
    }

    private static /* synthetic */ DroneReadyForUploadErrorType[] $values() {
        return null;
    }

    static {
        $VALUES = DroneReadyForUploadErrorType.$values();
        allValues = DroneReadyForUploadErrorType.values();
    }
}

