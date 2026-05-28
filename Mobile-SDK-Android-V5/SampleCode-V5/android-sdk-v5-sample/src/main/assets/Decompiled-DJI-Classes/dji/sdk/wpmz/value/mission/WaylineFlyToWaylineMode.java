/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;

public enum WaylineFlyToWaylineMode implements JNIProguardKeepTag
{
    SAFELY(0),
    POINT_TO_POINT(1),
    UNKNOWN(65535);

    private int value;
    private static final WaylineFlyToWaylineMode[] allValues;

    private WaylineFlyToWaylineMode(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static WaylineFlyToWaylineMode find(int value) {
        WaylineFlyToWaylineMode result = null;
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
        allValues = WaylineFlyToWaylineMode.values();
    }
}

