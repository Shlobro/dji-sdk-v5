/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class WaypointMissionFinishState
extends Enum<WaypointMissionFinishState>
implements JNIProguardKeepTag {
    public static final /* enum */ WaypointMissionFinishState NONE = new WaypointMissionFinishState(0);
    public static final /* enum */ WaypointMissionFinishState FINISH = new WaypointMissionFinishState(1);
    public static final /* enum */ WaypointMissionFinishState RESTART = new WaypointMissionFinishState(2);
    public static final /* enum */ WaypointMissionFinishState FINISH_GO_HOME = new WaypointMissionFinishState(3);
    public static final /* enum */ WaypointMissionFinishState FINISH_LAND = new WaypointMissionFinishState(4);
    public static final /* enum */ WaypointMissionFinishState FINISH_TIMEOUT_HOME = new WaypointMissionFinishState(5);
    public static final /* enum */ WaypointMissionFinishState FAILED = new WaypointMissionFinishState(6);
    public static final /* enum */ WaypointMissionFinishState UNKNOWN = new WaypointMissionFinishState(65535);
    private int value;
    private static final WaypointMissionFinishState[] allValues;
    private static final /* synthetic */ WaypointMissionFinishState[] $VALUES;

    public static WaypointMissionFinishState[] values() {
        return null;
    }

    public static WaypointMissionFinishState valueOf(String string) {
        return null;
    }

    private WaypointMissionFinishState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WaypointMissionFinishState find(int n) {
        return null;
    }

    private static /* synthetic */ WaypointMissionFinishState[] $values() {
        return null;
    }

    static {
        $VALUES = WaypointMissionFinishState.$values();
        allValues = WaypointMissionFinishState.values();
    }
}

