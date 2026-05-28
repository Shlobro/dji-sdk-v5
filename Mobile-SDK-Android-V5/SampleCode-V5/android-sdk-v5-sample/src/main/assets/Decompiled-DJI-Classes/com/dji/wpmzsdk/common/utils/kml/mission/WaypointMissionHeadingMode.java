/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.mission;

public enum WaypointMissionHeadingMode {
    AUTO(0),
    USING_INITIAL_DIRECTION(1),
    CONTROL_BY_REMOTE_CONTROLLER(2),
    USING_WAYPOINT_HEADING(3),
    TOWARD_POINT_OF_INTEREST(4),
    FOLLOW_GIMBAL_HEADING(5),
    WAYPOINT_YAW_MODE(6),
    UNKNOWN(65535);

    private int value;
    private static final WaypointMissionHeadingMode[] allValues;

    private WaypointMissionHeadingMode(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static WaypointMissionHeadingMode find(int value) {
        WaypointMissionHeadingMode result = null;
        for (int i = 0; i < allValues.length; ++i) {
            if (!allValues[i].equals(value)) continue;
            result = allValues[i];
            break;
        }
        if (null == result) {
            result = UNKNOWN;
            result.value = value;
        }
        return result;
    }

    static {
        allValues = WaypointMissionHeadingMode.values();
    }
}

