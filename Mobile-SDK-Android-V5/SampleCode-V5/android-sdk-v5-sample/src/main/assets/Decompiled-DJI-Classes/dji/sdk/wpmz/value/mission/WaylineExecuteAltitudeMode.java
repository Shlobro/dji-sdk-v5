/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;

public enum WaylineExecuteAltitudeMode implements JNIProguardKeepTag
{
    WGS84(0),
    RELATIVE_TO_START_POINT(1),
    REAL_TIME_SURFACE_FOLLOW(2),
    UNKNOWN(65535);

    private int value;
    private static final WaylineExecuteAltitudeMode[] allValues;

    private WaylineExecuteAltitudeMode(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static WaylineExecuteAltitudeMode find(int value) {
        WaylineExecuteAltitudeMode result = null;
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
        allValues = WaylineExecuteAltitudeMode.values();
    }
}

