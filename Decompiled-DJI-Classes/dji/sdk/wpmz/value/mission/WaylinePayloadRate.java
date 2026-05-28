/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;

public enum WaylinePayloadRate implements JNIProguardKeepTag
{
    RATE_240KHz(0),
    RATE_180KHz(1),
    RATE_160KHz(2),
    RATE_120KHz(3),
    RATE_80KHz(4),
    RATE_60KHz(5),
    UNKNOWN(65535);

    private int value;
    private static final WaylinePayloadRate[] allValues;

    private WaylinePayloadRate(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static WaylinePayloadRate find(int value) {
        WaylinePayloadRate result = null;
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
        allValues = WaylinePayloadRate.values();
    }
}

