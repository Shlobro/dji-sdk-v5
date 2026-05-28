/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;

public enum GimbalHeadingYawBase implements JNIProguardKeepTag
{
    NORTH(0),
    AIRCRAFT(1),
    UNKNOWN(65535);

    private int value;
    private static final GimbalHeadingYawBase[] allValues;

    private GimbalHeadingYawBase(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static GimbalHeadingYawBase find(int value) {
        GimbalHeadingYawBase result = null;
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
        allValues = GimbalHeadingYawBase.values();
    }
}

