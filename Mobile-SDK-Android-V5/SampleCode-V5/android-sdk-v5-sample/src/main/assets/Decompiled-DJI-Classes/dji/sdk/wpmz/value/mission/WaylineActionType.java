/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;

public enum WaylineActionType implements JNIProguardKeepTag
{
    TAKE_PHOTO(0),
    START_RECORD(1),
    STOP_RECORD(2),
    FOCUS(3),
    ZOOM(4),
    CUSTOM_DIR_NAME(5),
    SET_FOCUS_TYPE(6),
    START_TIME_LAPSE(7),
    STOP_TIME_LAPSE(8),
    GIMBAL_ROTATE(9),
    GIMBAL_EVENLY_ROTATE(10),
    START_SMART_OBLIQUE(11),
    STOP_SMART_OBLIQUE(12),
    HOVER(13),
    ROTATE_YAW(14),
    FLY_CONTROL(15),
    ACCURATE_PHOTO(16),
    RECORD_POINT_CLOUD(17),
    PSDK_ACTION(18),
    AIRCRAFT_CALI(19),
    START_CONTINUOUS_SHOOTING(20),
    STOP_CONTINUOUS_SHOOTING(21),
    SPRAY_OPEN(22),
    SPRAY_CLOSE(23),
    SPRAY_CAPACITY(24),
    ROTATE_YAW_FOLLOW_SPEED(25),
    LOW_LIGHT_SMART_SHOOTING(26),
    ORIENTED_PHOTO(27),
    LOCK_GIMBAL(28),
    UNLOCK_GIMBAL(29),
    PANO_SHOT(30),
    PRE_EXECUTE_ACTION(31),
    MEGAPHONE(32),
    SEARCHLIGHT(33),
    TARGET_DETECTION(34),
    HOIST_UNLOAD(101),
    UNKNOWN(65535);

    private int value;
    private static final WaylineActionType[] allValues;

    private WaylineActionType(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static WaylineActionType find(int value) {
        WaylineActionType result = null;
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
        allValues = WaylineActionType.values();
    }
}

