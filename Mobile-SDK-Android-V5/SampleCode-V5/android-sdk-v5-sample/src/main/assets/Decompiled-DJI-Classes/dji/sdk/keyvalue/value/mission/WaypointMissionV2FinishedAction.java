/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class WaypointMissionV2FinishedAction
extends Enum<WaypointMissionV2FinishedAction>
implements JNIProguardKeepTag {
    public static final /* enum */ WaypointMissionV2FinishedAction NO_ACTION = new WaypointMissionV2FinishedAction(0);
    public static final /* enum */ WaypointMissionV2FinishedAction GO_HOME = new WaypointMissionV2FinishedAction(1);
    public static final /* enum */ WaypointMissionV2FinishedAction AUTO_LANDING = new WaypointMissionV2FinishedAction(2);
    public static final /* enum */ WaypointMissionV2FinishedAction GO_FIRST_WAYPOINT = new WaypointMissionV2FinishedAction(3);
    public static final /* enum */ WaypointMissionV2FinishedAction CONTINUE_UNTIL_STOP = new WaypointMissionV2FinishedAction(4);
    public static final /* enum */ WaypointMissionV2FinishedAction UNKNOWN = new WaypointMissionV2FinishedAction(65535);
    private int value;
    private static final WaypointMissionV2FinishedAction[] allValues;
    private static final /* synthetic */ WaypointMissionV2FinishedAction[] $VALUES;

    public static WaypointMissionV2FinishedAction[] values() {
        return null;
    }

    public static WaypointMissionV2FinishedAction valueOf(String string) {
        return null;
    }

    private WaypointMissionV2FinishedAction(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WaypointMissionV2FinishedAction find(int n) {
        return null;
    }

    private static /* synthetic */ WaypointMissionV2FinishedAction[] $values() {
        return null;
    }

    static {
        $VALUES = WaypointMissionV2FinishedAction.$values();
        allValues = WaypointMissionV2FinishedAction.values();
    }
}

