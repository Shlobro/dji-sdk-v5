/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class CameraTrackingMissionStopReason
extends Enum<CameraTrackingMissionStopReason>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraTrackingMissionStopReason NEVER_PERFORMED = new CameraTrackingMissionStopReason(0);
    public static final /* enum */ CameraTrackingMissionStopReason STARTING_UP = new CameraTrackingMissionStopReason(1);
    public static final /* enum */ CameraTrackingMissionStopReason FPV_GIMBAL_LIMIT = new CameraTrackingMissionStopReason(10);
    public static final /* enum */ CameraTrackingMissionStopReason UNKNOWN = new CameraTrackingMissionStopReason(65535);
    private int value;
    private static final CameraTrackingMissionStopReason[] allValues;
    private static final /* synthetic */ CameraTrackingMissionStopReason[] $VALUES;

    public static CameraTrackingMissionStopReason[] values() {
        return null;
    }

    public static CameraTrackingMissionStopReason valueOf(String string) {
        return null;
    }

    private CameraTrackingMissionStopReason(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraTrackingMissionStopReason find(int n) {
        return null;
    }

    private static /* synthetic */ CameraTrackingMissionStopReason[] $values() {
        return null;
    }

    static {
        $VALUES = CameraTrackingMissionStopReason.$values();
        allValues = CameraTrackingMissionStopReason.values();
    }
}

