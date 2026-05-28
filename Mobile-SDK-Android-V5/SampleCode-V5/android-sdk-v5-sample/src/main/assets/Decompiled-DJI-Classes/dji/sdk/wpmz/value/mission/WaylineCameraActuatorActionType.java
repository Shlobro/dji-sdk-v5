/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;

public enum WaylineCameraActuatorActionType implements JNIProguardKeepTag
{
    UNKNOWN(0),
    TAKE_PHOTO(1),
    START_RECORD(2),
    STOP_RECORD(3),
    FOCUS(4),
    ZOOM(5),
    CUSTOM_DIR_NAME(6),
    SET_FOCUS_TYPE(7);

    private int value;
    private static final WaylineCameraActuatorActionType[] allValues;

    private WaylineCameraActuatorActionType(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static WaylineCameraActuatorActionType find(int value) {
        WaylineCameraActuatorActionType result = null;
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
        allValues = WaylineCameraActuatorActionType.values();
    }
}

