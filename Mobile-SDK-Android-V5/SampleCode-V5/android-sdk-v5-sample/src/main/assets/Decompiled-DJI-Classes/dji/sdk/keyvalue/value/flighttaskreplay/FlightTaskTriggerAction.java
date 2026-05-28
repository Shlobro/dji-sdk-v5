/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flighttaskreplay;

import dji.jni.JNIProguardKeepTag;

public final class FlightTaskTriggerAction
extends Enum<FlightTaskTriggerAction>
implements JNIProguardKeepTag {
    public static final /* enum */ FlightTaskTriggerAction FLIGHTTASK_EXECUTE = new FlightTaskTriggerAction(0);
    public static final /* enum */ FlightTaskTriggerAction RETURN_SPECIFIC_HOME = new FlightTaskTriggerAction(1);
    public static final /* enum */ FlightTaskTriggerAction WAYLINE_BREAK = new FlightTaskTriggerAction(2);
    public static final /* enum */ FlightTaskTriggerAction WAYLINE_RECOVERY = new FlightTaskTriggerAction(3);
    public static final /* enum */ FlightTaskTriggerAction TAKEOFF_TO_POINT = new FlightTaskTriggerAction(4);
    public static final /* enum */ FlightTaskTriggerAction DRONE_EMERGENCY_STOP = new FlightTaskTriggerAction(5);
    public static final /* enum */ FlightTaskTriggerAction EMERGENCY_LANDING = new FlightTaskTriggerAction(6);
    public static final /* enum */ FlightTaskTriggerAction FORCE_LANDING = new FlightTaskTriggerAction(7);
    public static final /* enum */ FlightTaskTriggerAction FLY_TO_POINT = new FlightTaskTriggerAction(8);
    public static final /* enum */ FlightTaskTriggerAction FLY_TO_POINT_UPDATE = new FlightTaskTriggerAction(9);
    public static final /* enum */ FlightTaskTriggerAction POI_MODE_ENTER = new FlightTaskTriggerAction(10);
    public static final /* enum */ FlightTaskTriggerAction POI_MODE_EXIT = new FlightTaskTriggerAction(11);
    public static final /* enum */ FlightTaskTriggerAction POI_CIRCLE_SPEED_SET = new FlightTaskTriggerAction(12);
    public static final /* enum */ FlightTaskTriggerAction AI_IDENTIFY_SET = new FlightTaskTriggerAction(13);
    public static final /* enum */ FlightTaskTriggerAction AI_SPOTLIGHT_ZOOM_SET = new FlightTaskTriggerAction(14);
    public static final /* enum */ FlightTaskTriggerAction AI_SPOTLIGHT_ZOOM_TRACK = new FlightTaskTriggerAction(15);
    public static final /* enum */ FlightTaskTriggerAction AI_SPOTLIGHT_ZOOM_SELECT = new FlightTaskTriggerAction(16);
    public static final /* enum */ FlightTaskTriggerAction AI_SPOTLIGHT_ZOOM_CONFIRM = new FlightTaskTriggerAction(17);
    public static final /* enum */ FlightTaskTriggerAction AI_SPOTLIGHT_ZOOM_STOP = new FlightTaskTriggerAction(18);
    public static final /* enum */ FlightTaskTriggerAction COMMANDER_FLIGHT_HEIGHT_SET = new FlightTaskTriggerAction(19);
    public static final /* enum */ FlightTaskTriggerAction RTH_ALTITUDE_SET = new FlightTaskTriggerAction(20);
    public static final /* enum */ FlightTaskTriggerAction WAYLINE_LOST_ACTION_SET = new FlightTaskTriggerAction(21);
    public static final /* enum */ FlightTaskTriggerAction COMMANDER_MODE_LOST_ACTION_SET = new FlightTaskTriggerAction(22);
    public static final /* enum */ FlightTaskTriggerAction RTH_MODE = new FlightTaskTriggerAction(23);
    public static final /* enum */ FlightTaskTriggerAction COMMANDER_FLIGHT_MODE_SET = new FlightTaskTriggerAction(24);
    public static final /* enum */ FlightTaskTriggerAction HEIGHT_LIMIT_SET = new FlightTaskTriggerAction(25);
    public static final /* enum */ FlightTaskTriggerAction DISTANCE_LIMIT_SET = new FlightTaskTriggerAction(26);
    public static final /* enum */ FlightTaskTriggerAction OBSTACLE_AVOIDANCE_SET = new FlightTaskTriggerAction(27);
    public static final /* enum */ FlightTaskTriggerAction WAYLINE_STOP = new FlightTaskTriggerAction(28);
    public static final /* enum */ FlightTaskTriggerAction RETURN_HOME_CANCEL = new FlightTaskTriggerAction(29);
    public static final /* enum */ FlightTaskTriggerAction RETURN_HOME_REASON = new FlightTaskTriggerAction(30);
    public static final /* enum */ FlightTaskTriggerAction LANDING_REASON = new FlightTaskTriggerAction(31);
    public static final /* enum */ FlightTaskTriggerAction HOVER_REASON = new FlightTaskTriggerAction(32);
    public static final /* enum */ FlightTaskTriggerAction FLY_TO_POINT_STOP = new FlightTaskTriggerAction(33);
    public static final /* enum */ FlightTaskTriggerAction IN_FLIGHT_WAYLINE_DELIVER = new FlightTaskTriggerAction(34);
    public static final /* enum */ FlightTaskTriggerAction IN_FLIGHT_WAYLINE_PAUSE = new FlightTaskTriggerAction(35);
    public static final /* enum */ FlightTaskTriggerAction IN_FLIGHT_WAYLINE_RECOVER = new FlightTaskTriggerAction(36);
    public static final /* enum */ FlightTaskTriggerAction IN_FLIGHT_WAYLINE_CANCEL = new FlightTaskTriggerAction(37);
    public static final /* enum */ FlightTaskTriggerAction PILOT_WAYLINE_START = new FlightTaskTriggerAction(40);
    public static final /* enum */ FlightTaskTriggerAction PILOT_WAYLINE_PAUSE = new FlightTaskTriggerAction(41);
    public static final /* enum */ FlightTaskTriggerAction PILOT_WAYLINE_RECOVER = new FlightTaskTriggerAction(42);
    public static final /* enum */ FlightTaskTriggerAction PILOT_WAYLINE_END = new FlightTaskTriggerAction(43);
    public static final /* enum */ FlightTaskTriggerAction UNKNOWN = new FlightTaskTriggerAction(65535);
    private int value;
    private static final FlightTaskTriggerAction[] allValues;
    private static final /* synthetic */ FlightTaskTriggerAction[] $VALUES;

    public static FlightTaskTriggerAction[] values() {
        return null;
    }

    public static FlightTaskTriggerAction valueOf(String string) {
        return null;
    }

    private FlightTaskTriggerAction(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FlightTaskTriggerAction find(int n) {
        return null;
    }

    private static /* synthetic */ FlightTaskTriggerAction[] $values() {
        return null;
    }

    static {
        $VALUES = FlightTaskTriggerAction.$values();
        allValues = FlightTaskTriggerAction.values();
    }
}

