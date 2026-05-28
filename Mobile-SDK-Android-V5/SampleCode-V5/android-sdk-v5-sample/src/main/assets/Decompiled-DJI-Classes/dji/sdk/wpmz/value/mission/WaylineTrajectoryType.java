/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;

public enum WaylineTrajectoryType implements JNIProguardKeepTag
{
    BEZIER_TYPE(0),
    LINE_TYPE(1),
    TURN_TYPE(2),
    UNKNOWN(65535);

    private int value;
    private static final WaylineTrajectoryType[] allValues;

    private WaylineTrajectoryType(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static WaylineTrajectoryType find(int value) {
        WaylineTrajectoryType result = null;
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
        allValues = WaylineTrajectoryType.values();
    }
}

