/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;

public enum WaylineSprayActuatorActionType implements JNIProguardKeepTag
{
    UNKNOWN(0),
    SPRAY(1);

    private int value;
    private static final WaylineSprayActuatorActionType[] allValues;

    private WaylineSprayActuatorActionType(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static WaylineSprayActuatorActionType find(int value) {
        WaylineSprayActuatorActionType result = null;
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
        allValues = WaylineSprayActuatorActionType.values();
    }
}

