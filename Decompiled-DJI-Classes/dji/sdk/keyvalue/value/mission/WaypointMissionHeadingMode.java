/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class WaypointMissionHeadingMode
extends Enum<WaypointMissionHeadingMode>
implements JNIProguardKeepTag {
    public static final /* enum */ WaypointMissionHeadingMode AUTO = new WaypointMissionHeadingMode(0);
    public static final /* enum */ WaypointMissionHeadingMode USING_INITIAL_DIRECTION = new WaypointMissionHeadingMode(1);
    public static final /* enum */ WaypointMissionHeadingMode CONTROL_BY_REMOTE_CONTROLLER = new WaypointMissionHeadingMode(2);
    public static final /* enum */ WaypointMissionHeadingMode USING_WAYPOINT_HEADING = new WaypointMissionHeadingMode(3);
    public static final /* enum */ WaypointMissionHeadingMode TOWARD_POINT_OF_INTEREST = new WaypointMissionHeadingMode(4);
    public static final /* enum */ WaypointMissionHeadingMode FOLLOW_GIMBAL_HEADING = new WaypointMissionHeadingMode(5);
    public static final /* enum */ WaypointMissionHeadingMode WAYPOINT_YAW_MODE = new WaypointMissionHeadingMode(6);
    public static final /* enum */ WaypointMissionHeadingMode UNKNOWN = new WaypointMissionHeadingMode(65535);
    private int value;
    private static final WaypointMissionHeadingMode[] allValues;
    private static final /* synthetic */ WaypointMissionHeadingMode[] $VALUES;

    public static WaypointMissionHeadingMode[] values() {
        return null;
    }

    public static WaypointMissionHeadingMode valueOf(String string) {
        return null;
    }

    private WaypointMissionHeadingMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WaypointMissionHeadingMode find(int n) {
        return null;
    }

    private static /* synthetic */ WaypointMissionHeadingMode[] $values() {
        return null;
    }

    static {
        $VALUES = WaypointMissionHeadingMode.$values();
        allValues = WaypointMissionHeadingMode.values();
    }
}

