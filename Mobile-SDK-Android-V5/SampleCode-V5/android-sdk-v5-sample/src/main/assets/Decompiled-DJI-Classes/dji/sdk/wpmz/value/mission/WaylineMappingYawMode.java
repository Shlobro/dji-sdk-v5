/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;

public enum WaylineMappingYawMode implements JNIProguardKeepTag
{
    FOLLOW_WAYLINE(0),
    FIXED(1),
    UNKNOWN(65535);

    private int value;
    private static final WaylineMappingYawMode[] allValues;

    private WaylineMappingYawMode(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static WaylineMappingYawMode find(int value) {
        WaylineMappingYawMode result = null;
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
        allValues = WaylineMappingYawMode.values();
    }
}

