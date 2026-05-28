/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;

public enum WaylineExitOnRCLostBehavior implements JNIProguardKeepTag
{
    GO_ON(0),
    EXCUTE_RC_LOST_ACTION(1),
    UNKNOWN(65535);

    private int value;
    private static final WaylineExitOnRCLostBehavior[] allValues;

    private WaylineExitOnRCLostBehavior(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static WaylineExitOnRCLostBehavior find(int value) {
        WaylineExitOnRCLostBehavior result = null;
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
        allValues = WaylineExitOnRCLostBehavior.values();
    }
}

