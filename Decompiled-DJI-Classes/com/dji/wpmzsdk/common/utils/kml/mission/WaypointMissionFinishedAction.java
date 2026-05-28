/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;

public enum WaypointMissionFinishedAction implements JNIProguardKeepTag
{
    NO_ACTION(0),
    GO_HOME(1),
    AUTO_LAND(2),
    GO_FIRST_WAYPOINT(3),
    CONTINUE_UNTIL_END(4),
    UNKNOWN(65535);

    private int value;
    private static final WaypointMissionFinishedAction[] allValues;

    private WaypointMissionFinishedAction(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static WaypointMissionFinishedAction find(int value) {
        WaypointMissionFinishedAction result = null;
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
        allValues = WaypointMissionFinishedAction.values();
    }
}

