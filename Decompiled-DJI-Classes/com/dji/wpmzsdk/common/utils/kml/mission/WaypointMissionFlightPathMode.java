/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.mission;

public enum WaypointMissionFlightPathMode {
    NORMAL(0),
    CURVED(1),
    UNKNOWN(65535);

    private int value;
    private static final WaypointMissionFlightPathMode[] allValues;

    private WaypointMissionFlightPathMode(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static WaypointMissionFlightPathMode find(int value) {
        WaypointMissionFlightPathMode result = null;
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
        allValues = WaypointMissionFlightPathMode.values();
    }
}

