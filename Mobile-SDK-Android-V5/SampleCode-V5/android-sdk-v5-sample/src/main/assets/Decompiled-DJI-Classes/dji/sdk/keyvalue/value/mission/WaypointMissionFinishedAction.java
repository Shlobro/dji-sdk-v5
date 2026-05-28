/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class WaypointMissionFinishedAction
extends Enum<WaypointMissionFinishedAction>
implements JNIProguardKeepTag {
    public static final /* enum */ WaypointMissionFinishedAction NO_ACTION = new WaypointMissionFinishedAction(0);
    public static final /* enum */ WaypointMissionFinishedAction GO_HOME = new WaypointMissionFinishedAction(1);
    public static final /* enum */ WaypointMissionFinishedAction AUTO_LAND = new WaypointMissionFinishedAction(2);
    public static final /* enum */ WaypointMissionFinishedAction GO_FIRST_WAYPOINT = new WaypointMissionFinishedAction(3);
    public static final /* enum */ WaypointMissionFinishedAction CONTINUE_UNTIL_END = new WaypointMissionFinishedAction(4);
    public static final /* enum */ WaypointMissionFinishedAction UNKNOWN = new WaypointMissionFinishedAction(65535);
    private int value;
    private static final WaypointMissionFinishedAction[] allValues;
    private static final /* synthetic */ WaypointMissionFinishedAction[] $VALUES;

    public static WaypointMissionFinishedAction[] values() {
        return null;
    }

    public static WaypointMissionFinishedAction valueOf(String string) {
        return null;
    }

    private WaypointMissionFinishedAction(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WaypointMissionFinishedAction find(int n) {
        return null;
    }

    private static /* synthetic */ WaypointMissionFinishedAction[] $values() {
        return null;
    }

    static {
        $VALUES = WaypointMissionFinishedAction.$values();
        allValues = WaypointMissionFinishedAction.values();
    }
}

