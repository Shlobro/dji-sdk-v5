/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;

public enum WaylinePayloadReturnMode implements JNIProguardKeepTag
{
    SINGLE_RETURN_FIRST(0),
    SINGLE_RETURN_STRONGEST(1),
    DUAL_RETURN(2),
    TRIPLE_RETURN(3),
    QUADRUPLE_RETURN(4),
    QUINTUPLE_RETURN(5),
    UNKNOWN(65535);

    private int value;
    private static final WaylinePayloadReturnMode[] allValues;

    private WaylinePayloadReturnMode(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static WaylinePayloadReturnMode find(int value) {
        WaylinePayloadReturnMode result = null;
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
        allValues = WaylinePayloadReturnMode.values();
    }
}

