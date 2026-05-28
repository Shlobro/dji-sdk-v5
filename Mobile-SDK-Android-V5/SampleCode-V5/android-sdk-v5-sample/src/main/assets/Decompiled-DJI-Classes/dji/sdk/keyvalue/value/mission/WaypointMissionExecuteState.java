/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class WaypointMissionExecuteState
extends Enum<WaypointMissionExecuteState>
implements JNIProguardKeepTag {
    public static final /* enum */ WaypointMissionExecuteState INITIALIZING = new WaypointMissionExecuteState(0);
    public static final /* enum */ WaypointMissionExecuteState MOVING = new WaypointMissionExecuteState(1);
    public static final /* enum */ WaypointMissionExecuteState CURVE_MODE_MOVING = new WaypointMissionExecuteState(2);
    public static final /* enum */ WaypointMissionExecuteState CURVE_MODE_TURNING = new WaypointMissionExecuteState(3);
    public static final /* enum */ WaypointMissionExecuteState BEGIN_ACTION = new WaypointMissionExecuteState(4);
    public static final /* enum */ WaypointMissionExecuteState DOING_ACTION = new WaypointMissionExecuteState(5);
    public static final /* enum */ WaypointMissionExecuteState FINISHED_ACTION = new WaypointMissionExecuteState(6);
    public static final /* enum */ WaypointMissionExecuteState RETURN_TO_FIRST_POINT = new WaypointMissionExecuteState(7);
    public static final /* enum */ WaypointMissionExecuteState PAUSED = new WaypointMissionExecuteState(8);
    public static final /* enum */ WaypointMissionExecuteState MANUAL = new WaypointMissionExecuteState(9);
    public static final /* enum */ WaypointMissionExecuteState RETURN_TO_PROJECT_POINT = new WaypointMissionExecuteState(10);
    public static final /* enum */ WaypointMissionExecuteState NO_PESTICIDE_CLIMB = new WaypointMissionExecuteState(11);
    public static final /* enum */ WaypointMissionExecuteState RADAR_AVOID_OBSTACLE = new WaypointMissionExecuteState(12);
    public static final /* enum */ WaypointMissionExecuteState PAUSED_BY_OBSTACLE = new WaypointMissionExecuteState(13);
    public static final /* enum */ WaypointMissionExecuteState UNKNOWN = new WaypointMissionExecuteState(65535);
    private int value;
    private static final WaypointMissionExecuteState[] allValues;
    private static final /* synthetic */ WaypointMissionExecuteState[] $VALUES;

    public static WaypointMissionExecuteState[] values() {
        return null;
    }

    public static WaypointMissionExecuteState valueOf(String string) {
        return null;
    }

    private WaypointMissionExecuteState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WaypointMissionExecuteState find(int n) {
        return null;
    }

    private static /* synthetic */ WaypointMissionExecuteState[] $values() {
        return null;
    }

    static {
        $VALUES = WaypointMissionExecuteState.$values();
        allValues = WaypointMissionExecuteState.values();
    }
}

