/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class AppAssistedTrackingMissionStopReason
extends Enum<AppAssistedTrackingMissionStopReason>
implements JNIProguardKeepTag {
    public static final /* enum */ AppAssistedTrackingMissionStopReason NEVER_PERFORMED = new AppAssistedTrackingMissionStopReason(0);
    public static final /* enum */ AppAssistedTrackingMissionStopReason STARTING_UP = new AppAssistedTrackingMissionStopReason(1);
    public static final /* enum */ AppAssistedTrackingMissionStopReason USER = new AppAssistedTrackingMissionStopReason(2);
    public static final /* enum */ AppAssistedTrackingMissionStopReason MODE_SWITCH = new AppAssistedTrackingMissionStopReason(3);
    public static final /* enum */ AppAssistedTrackingMissionStopReason FRAME_CHANGED = new AppAssistedTrackingMissionStopReason(4);
    public static final /* enum */ AppAssistedTrackingMissionStopReason APP_LINK_STATE_CHANGED = new AppAssistedTrackingMissionStopReason(5);
    public static final /* enum */ AppAssistedTrackingMissionStopReason PERFORMANCE_LIMIT = new AppAssistedTrackingMissionStopReason(6);
    public static final /* enum */ AppAssistedTrackingMissionStopReason GIMBAL_ROTATE_CHANGED = new AppAssistedTrackingMissionStopReason(7);
    public static final /* enum */ AppAssistedTrackingMissionStopReason TRACKING_LOST = new AppAssistedTrackingMissionStopReason(8);
    public static final /* enum */ AppAssistedTrackingMissionStopReason VISION_EXIT = new AppAssistedTrackingMissionStopReason(9);
    public static final /* enum */ AppAssistedTrackingMissionStopReason FPV_GIMBAL_LIMIT = new AppAssistedTrackingMissionStopReason(10);
    public static final /* enum */ AppAssistedTrackingMissionStopReason UNKNOWN = new AppAssistedTrackingMissionStopReason(65535);
    private int value;
    private static final AppAssistedTrackingMissionStopReason[] allValues;
    private static final /* synthetic */ AppAssistedTrackingMissionStopReason[] $VALUES;

    public static AppAssistedTrackingMissionStopReason[] values() {
        return null;
    }

    public static AppAssistedTrackingMissionStopReason valueOf(String string) {
        return null;
    }

    private AppAssistedTrackingMissionStopReason(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AppAssistedTrackingMissionStopReason find(int n) {
        return null;
    }

    private static /* synthetic */ AppAssistedTrackingMissionStopReason[] $values() {
        return null;
    }

    static {
        $VALUES = AppAssistedTrackingMissionStopReason.$values();
        allValues = AppAssistedTrackingMissionStopReason.values();
    }
}

