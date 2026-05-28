/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class WaypointMissionState
extends Enum<WaypointMissionState>
implements JNIProguardKeepTag {
    public static final /* enum */ WaypointMissionState DISCONNECTED = new WaypointMissionState(1);
    public static final /* enum */ WaypointMissionState RECOVERING = new WaypointMissionState(2);
    public static final /* enum */ WaypointMissionState NOT_SUPPORTED = new WaypointMissionState(3);
    public static final /* enum */ WaypointMissionState READY_TO_UPLOAD = new WaypointMissionState(4);
    public static final /* enum */ WaypointMissionState UPLOADING = new WaypointMissionState(5);
    public static final /* enum */ WaypointMissionState READY_TO_EXECUTE = new WaypointMissionState(6);
    public static final /* enum */ WaypointMissionState EXECUTING = new WaypointMissionState(7);
    public static final /* enum */ WaypointMissionState EXECUTE_PAUSED = new WaypointMissionState(8);
    public static final /* enum */ WaypointMissionState UNKNOWN = new WaypointMissionState(65535);
    private int value;
    private static final WaypointMissionState[] allValues;
    private static final /* synthetic */ WaypointMissionState[] $VALUES;

    public static WaypointMissionState[] values() {
        return null;
    }

    public static WaypointMissionState valueOf(String string) {
        return null;
    }

    private WaypointMissionState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WaypointMissionState find(int n) {
        return null;
    }

    private static /* synthetic */ WaypointMissionState[] $values() {
        return null;
    }

    static {
        $VALUES = WaypointMissionState.$values();
        allValues = WaypointMissionState.values();
    }
}

