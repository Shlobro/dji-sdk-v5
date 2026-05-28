/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;

public enum WaylineActionCameraFocusType implements JNIProguardKeepTag
{
    UNKNOWN(0),
    MANUAL(1),
    AUTO(2),
    CONTINUOUS(3),
    PRECISE(4);

    private int value;
    private static final WaylineActionCameraFocusType[] allValues;

    private WaylineActionCameraFocusType(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static WaylineActionCameraFocusType find(int value) {
        WaylineActionCameraFocusType result = null;
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
        allValues = WaylineActionCameraFocusType.values();
    }
}

