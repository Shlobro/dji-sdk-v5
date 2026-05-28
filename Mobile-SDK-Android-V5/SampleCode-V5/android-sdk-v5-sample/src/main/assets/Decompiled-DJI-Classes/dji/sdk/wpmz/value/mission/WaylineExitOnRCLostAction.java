/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;

public enum WaylineExitOnRCLostAction implements JNIProguardKeepTag
{
    GO_BACK(0),
    LANDING(1),
    HOVER(2),
    GO_ALTERNATE_POINT(3),
    UNKNOWN(65535);

    private int value;
    private static final WaylineExitOnRCLostAction[] allValues;

    private WaylineExitOnRCLostAction(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static WaylineExitOnRCLostAction find(int value) {
        WaylineExitOnRCLostAction result = null;
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
        allValues = WaylineExitOnRCLostAction.values();
    }
}

