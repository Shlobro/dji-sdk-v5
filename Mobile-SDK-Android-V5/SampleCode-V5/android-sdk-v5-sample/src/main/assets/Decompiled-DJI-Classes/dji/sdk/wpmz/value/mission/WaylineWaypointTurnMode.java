/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;

public enum WaylineWaypointTurnMode implements JNIProguardKeepTag
{
    TO_POINT_AND_PASS_WITH_CONTINUITY_CURVATURE(0),
    TO_POINT_AND_STOP_WITH_CONTINUITY_CURVATURE(1),
    TO_POINT_AND_STOP_WITH_DISCONTINUITY_CURVATURE(2),
    COORDINATE_TURN(3),
    UNKNOWN(65535);

    private int value;
    private static final WaylineWaypointTurnMode[] allValues;

    private WaylineWaypointTurnMode(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static WaylineWaypointTurnMode find(int value) {
        WaylineWaypointTurnMode result = null;
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
        allValues = WaylineWaypointTurnMode.values();
    }
}

