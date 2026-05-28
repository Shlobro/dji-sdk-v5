/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;

public enum WaylineAircraftActuatorActionType implements JNIProguardKeepTag
{
    UNKNOWN(0),
    ROTATE_YAW(1),
    FLY_CONTROL(2),
    HOVER(3);

    private int value;
    private static final WaylineAircraftActuatorActionType[] allValues;

    private WaylineAircraftActuatorActionType(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static WaylineAircraftActuatorActionType find(int value) {
        WaylineAircraftActuatorActionType result = null;
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
        allValues = WaylineAircraftActuatorActionType.values();
    }
}

