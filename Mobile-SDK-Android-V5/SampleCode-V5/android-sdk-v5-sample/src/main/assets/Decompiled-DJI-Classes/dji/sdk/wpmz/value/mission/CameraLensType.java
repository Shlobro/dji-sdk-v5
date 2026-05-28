/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;

public enum CameraLensType implements JNIProguardKeepTag
{
    ZOOM(0),
    WIDE(1),
    IR(2),
    NARROW_BAND(3),
    VISABLE(4),
    UNKNOWN(65535);

    private int value;
    private static final CameraLensType[] allValues;

    private CameraLensType(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static CameraLensType find(int value) {
        CameraLensType result = null;
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
        allValues = CameraLensType.values();
    }
}

