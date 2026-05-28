/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;

public enum WaylineCoordinateMode implements JNIProguardKeepTag
{
    WGS84(0),
    NAVI(1),
    THIRD_PARTY(2),
    CGCS2000(3),
    NED(4),
    UNKNOWN(65535);

    private int value;
    private static final WaylineCoordinateMode[] allValues;

    private WaylineCoordinateMode(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static WaylineCoordinateMode find(int value) {
        WaylineCoordinateMode result = null;
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
        allValues = WaylineCoordinateMode.values();
    }
}

