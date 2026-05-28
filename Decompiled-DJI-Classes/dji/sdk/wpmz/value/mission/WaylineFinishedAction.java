/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;

public enum WaylineFinishedAction implements JNIProguardKeepTag
{
    NO_ACTION(0),
    GO_HOME(1),
    AUTO_LAND(2),
    GOTO_FIRST_WAYPOINT(3),
    UNKNOWN(65535);

    private int value;
    private static final WaylineFinishedAction[] allValues;

    private WaylineFinishedAction(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static WaylineFinishedAction find(int value) {
        WaylineFinishedAction result = null;
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
        allValues = WaylineFinishedAction.values();
    }
}

