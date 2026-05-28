/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;

public enum WaylineActionPanoShotSubModeType implements JNIProguardKeepTag
{
    PANO_SHOT_3X1(0),
    PANO_SHOT_3X3(1),
    PANO_SHOT_3X7(2),
    PANO_SHOT_360(4),
    UNKNOWN(65535);

    private int value;
    private static final WaylineActionPanoShotSubModeType[] allValues;

    private WaylineActionPanoShotSubModeType(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static WaylineActionPanoShotSubModeType find(int value) {
        WaylineActionPanoShotSubModeType result = null;
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
        allValues = WaylineActionPanoShotSubModeType.values();
    }
}

