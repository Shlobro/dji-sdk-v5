/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class WaypointMissionBreakPointState
extends Enum<WaypointMissionBreakPointState>
implements JNIProguardKeepTag {
    public static final /* enum */ WaypointMissionBreakPointState NORMAL = new WaypointMissionBreakPointState(0);
    public static final /* enum */ WaypointMissionBreakPointState INVALID_BY_MISSION_FINISHED = new WaypointMissionBreakPointState(1);
    public static final /* enum */ WaypointMissionBreakPointState INVALID_BY_GO_TO_FIRST_POINT = new WaypointMissionBreakPointState(2);
    public static final /* enum */ WaypointMissionBreakPointState UNKNOWN = new WaypointMissionBreakPointState(65535);
    private int value;
    private static final WaypointMissionBreakPointState[] allValues;
    private static final /* synthetic */ WaypointMissionBreakPointState[] $VALUES;

    public static WaypointMissionBreakPointState[] values() {
        return null;
    }

    public static WaypointMissionBreakPointState valueOf(String string) {
        return null;
    }

    private WaypointMissionBreakPointState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WaypointMissionBreakPointState find(int n) {
        return null;
    }

    private static /* synthetic */ WaypointMissionBreakPointState[] $values() {
        return null;
    }

    static {
        $VALUES = WaypointMissionBreakPointState.$values();
        allValues = WaypointMissionBreakPointState.values();
    }
}

