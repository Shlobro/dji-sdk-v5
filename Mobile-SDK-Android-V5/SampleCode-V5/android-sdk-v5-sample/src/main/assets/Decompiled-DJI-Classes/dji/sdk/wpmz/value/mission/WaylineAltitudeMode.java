/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;

public enum WaylineAltitudeMode implements JNIProguardKeepTag
{
    EGM96(0),
    RELATIVE_TO_START_POINT(1),
    ABOVE_GROUND_LEVEL(2),
    REAL_TIME_SURFACE_FOLLOW(3),
    UNKNOWN(65535);

    private int value;
    private static final WaylineAltitudeMode[] allValues;

    private WaylineAltitudeMode(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static WaylineAltitudeMode find(int value) {
        WaylineAltitudeMode result = null;
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
        allValues = WaylineAltitudeMode.values();
    }
}

