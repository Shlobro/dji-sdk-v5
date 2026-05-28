/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.aircraft.waypoint3.model;

public final class WaypointMissionExecuteState
extends Enum<WaypointMissionExecuteState> {
    public static final /* enum */ WaypointMissionExecuteState DISCONNECTED = new WaypointMissionExecuteState(-1);
    public static final /* enum */ WaypointMissionExecuteState IDLE = new WaypointMissionExecuteState(0);
    public static final /* enum */ WaypointMissionExecuteState NOT_SUPPORTED = new WaypointMissionExecuteState(1);
    public static final /* enum */ WaypointMissionExecuteState READY = new WaypointMissionExecuteState(2);
    public static final /* enum */ WaypointMissionExecuteState UPLOADING = new WaypointMissionExecuteState(3);
    public static final /* enum */ WaypointMissionExecuteState PREPARING = new WaypointMissionExecuteState(4);
    public static final /* enum */ WaypointMissionExecuteState ENTER_WAYLINE = new WaypointMissionExecuteState(5);
    public static final /* enum */ WaypointMissionExecuteState EXECUTING = new WaypointMissionExecuteState(6);
    public static final /* enum */ WaypointMissionExecuteState INTERRUPTED = new WaypointMissionExecuteState(7);
    public static final /* enum */ WaypointMissionExecuteState RECOVERING = new WaypointMissionExecuteState(8);
    public static final /* enum */ WaypointMissionExecuteState FINISHED = new WaypointMissionExecuteState(9);
    public static final /* enum */ WaypointMissionExecuteState RETURN_TO_START_POINT = new WaypointMissionExecuteState(10);
    public static final /* enum */ WaypointMissionExecuteState UNKNOWN = new WaypointMissionExecuteState(256);
    private int value;
    private static final WaypointMissionExecuteState[] allValues;
    private static final /* synthetic */ WaypointMissionExecuteState[] $VALUES;

    public static WaypointMissionExecuteState[] values() {
        return null;
    }

    public static WaypointMissionExecuteState valueOf(String string2) {
        return null;
    }

    private WaypointMissionExecuteState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean _equals(int n) {
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

