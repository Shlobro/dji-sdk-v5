/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;

public enum WaylineOrientedPhotoModeType implements JNIProguardKeepTag
{
    NORMAL_PHOTO(0),
    LOW_LIGHT_SMART_SHOOTING(1),
    UNKNOWN(65535);

    private int value;
    private static final WaylineOrientedPhotoModeType[] allValues;

    private WaylineOrientedPhotoModeType(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static WaylineOrientedPhotoModeType find(int value) {
        WaylineOrientedPhotoModeType result = null;
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
        allValues = WaylineOrientedPhotoModeType.values();
    }
}

