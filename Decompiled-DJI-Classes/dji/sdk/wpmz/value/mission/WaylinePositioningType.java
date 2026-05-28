/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;

public enum WaylinePositioningType implements JNIProguardKeepTag
{
    GPS(0),
    RTK_BASE_STATION(1),
    RTK_QIANXUN(2),
    RTK_CUSTOM(3),
    TEACH_MODE(4),
    RTK_NTRIP(5),
    UNKNOWN(65535);

    private int value;
    private static final WaylinePositioningType[] allValues;

    private WaylinePositioningType(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static WaylinePositioningType find(int value) {
        WaylinePositioningType result = null;
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
        allValues = WaylinePositioningType.values();
    }
}

