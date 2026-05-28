/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;

public enum WaylineGimbalActuatorActionType implements JNIProguardKeepTag
{
    UNKNOWN(0),
    GIMBAL_ROTATE(1),
    START_SMART_OBLIQUE(3),
    STOP_SMART_OBLIQUE(4),
    GIMBAL_EVENLY_ROTATE(5);

    private int value;
    private static final WaylineGimbalActuatorActionType[] allValues;

    private WaylineGimbalActuatorActionType(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static WaylineGimbalActuatorActionType find(int value) {
        WaylineGimbalActuatorActionType result = null;
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
        allValues = WaylineGimbalActuatorActionType.values();
    }
}

