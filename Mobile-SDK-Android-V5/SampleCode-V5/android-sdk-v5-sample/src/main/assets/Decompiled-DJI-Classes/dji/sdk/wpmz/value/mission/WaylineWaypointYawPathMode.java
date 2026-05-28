/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;

public enum WaylineWaypointYawPathMode implements JNIProguardKeepTag
{
    CLOCKWISE(0),
    COUNTER_CLOCKWISE(1),
    FOLLOW_BAD_ARC(2),
    UNKNOWN(65535);

    private int value;
    private static final WaylineWaypointYawPathMode[] allValues;

    private WaylineWaypointYawPathMode(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static WaylineWaypointYawPathMode find(int value) {
        WaylineWaypointYawPathMode result = null;
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
        allValues = WaylineWaypointYawPathMode.values();
    }
}

