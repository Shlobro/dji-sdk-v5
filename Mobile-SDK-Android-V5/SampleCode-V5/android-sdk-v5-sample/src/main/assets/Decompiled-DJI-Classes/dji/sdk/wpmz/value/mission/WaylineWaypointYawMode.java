/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;

public enum WaylineWaypointYawMode implements JNIProguardKeepTag
{
    FOLLOW_WAYLINE(0),
    FIXED(1),
    MANUALLY(2),
    TOWARD_POI(3),
    SMOOTH_TRANSITION(4),
    UNKNOWN(65535);

    private int value;
    private static final WaylineWaypointYawMode[] allValues;

    private WaylineWaypointYawMode(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static WaylineWaypointYawMode find(int value) {
        WaylineWaypointYawMode result = null;
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
        allValues = WaylineWaypointYawMode.values();
    }
}

