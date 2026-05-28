/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class WaypointMissionV2RCLostConnectionAction
extends Enum<WaypointMissionV2RCLostConnectionAction>
implements JNIProguardKeepTag {
    public static final /* enum */ WaypointMissionV2RCLostConnectionAction FOLLOW_LOST_CONTROL_ACTION = new WaypointMissionV2RCLostConnectionAction(0);
    public static final /* enum */ WaypointMissionV2RCLostConnectionAction CONTINUE_UNTIL_FINISHED = new WaypointMissionV2RCLostConnectionAction(1);
    public static final /* enum */ WaypointMissionV2RCLostConnectionAction UNKNOWN = new WaypointMissionV2RCLostConnectionAction(65535);
    private int value;
    private static final WaypointMissionV2RCLostConnectionAction[] allValues;
    private static final /* synthetic */ WaypointMissionV2RCLostConnectionAction[] $VALUES;

    public static WaypointMissionV2RCLostConnectionAction[] values() {
        return null;
    }

    public static WaypointMissionV2RCLostConnectionAction valueOf(String string) {
        return null;
    }

    private WaypointMissionV2RCLostConnectionAction(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WaypointMissionV2RCLostConnectionAction find(int n) {
        return null;
    }

    private static /* synthetic */ WaypointMissionV2RCLostConnectionAction[] $values() {
        return null;
    }

    static {
        $VALUES = WaypointMissionV2RCLostConnectionAction.$values();
        allValues = WaypointMissionV2RCLostConnectionAction.values();
    }
}

