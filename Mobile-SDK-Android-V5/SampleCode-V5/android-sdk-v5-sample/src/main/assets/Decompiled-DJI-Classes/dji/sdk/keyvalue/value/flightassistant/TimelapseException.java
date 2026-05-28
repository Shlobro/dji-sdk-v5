/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class TimelapseException
extends Enum<TimelapseException>
implements JNIProguardKeepTag {
    public static final /* enum */ TimelapseException NORMAL = new TimelapseException(0);
    public static final /* enum */ TimelapseException USER_STICK = new TimelapseException(1);
    public static final /* enum */ TimelapseException RC_LOST = new TimelapseException(2);
    public static final /* enum */ TimelapseException APP_LOST = new TimelapseException(3);
    public static final /* enum */ TimelapseException CAN_NOT_TAKE_CONTROL = new TimelapseException(4);
    public static final /* enum */ TimelapseException CTRL_LOST = new TimelapseException(5);
    public static final /* enum */ TimelapseException FC_MODE_ERROR = new TimelapseException(6);
    public static final /* enum */ TimelapseException FORBIDDEN = new TimelapseException(7);
    public static final /* enum */ TimelapseException RADIUS_LIMIT = new TimelapseException(8);
    public static final /* enum */ TimelapseException HEIGHT_LIMIT = new TimelapseException(9);
    public static final /* enum */ TimelapseException HEIGHT_TOO_LOW = new TimelapseException(10);
    public static final /* enum */ TimelapseException PLUS_SEC_FAILURE = new TimelapseException(11);
    public static final /* enum */ TimelapseException LOAD_TASK_FAIL = new TimelapseException(12);
    public static final /* enum */ TimelapseException LOAD_TASK_FAIL_GPS_WEAK = new TimelapseException(13);
    public static final /* enum */ TimelapseException LOAD_TASK_FAIL_DIST_TOO_FAR = new TimelapseException(14);
    public static final /* enum */ TimelapseException PLUSSESC_FAILURE_NOSOURCE = new TimelapseException(15);
    public static final /* enum */ TimelapseException CAMERA_LOST = new TimelapseException(16);
    public static final /* enum */ TimelapseException CAMERA_CUR_INDEX_ERROR = new TimelapseException(17);
    public static final /* enum */ TimelapseException CAMERA_TOTAL_INDEX_ERROR = new TimelapseException(18);
    public static final /* enum */ TimelapseException CAMERA_STATUS_ERROR = new TimelapseException(19);
    public static final /* enum */ TimelapseException CAMERA_NO_SOURCE = new TimelapseException(20);
    public static final /* enum */ TimelapseException CAMERA_PARAMETER_ERROR = new TimelapseException(21);
    public static final /* enum */ TimelapseException CAMERA_UNKNOWN_ERROR = new TimelapseException(22);
    public static final /* enum */ TimelapseException CAMERA_CAN_NOT_ENTRY = new TimelapseException(23);
    public static final /* enum */ TimelapseException CAMERA_NO_MEMORY = new TimelapseException(24);
    public static final /* enum */ TimelapseException PHOTOS_TOO_LITTLE = new TimelapseException(25);
    public static final /* enum */ TimelapseException GEN_VIDEO_FAILURE = new TimelapseException(26);
    public static final /* enum */ TimelapseException PATH_GENERATE_FAILURE = new TimelapseException(28);
    public static final /* enum */ TimelapseException GIMBAL_ATTI_CHANGE_TOO_SMALL = new TimelapseException(29);
    public static final /* enum */ TimelapseException GIMBAL_ATTI_OVER_RANGE_LIMIT = new TimelapseException(30);
    public static final /* enum */ TimelapseException ENCOUNTER_OBSTACLE = new TimelapseException(31);
    public static final /* enum */ TimelapseException TOTAL_TIME_TOO_SHORT = new TimelapseException(32);
    public static final /* enum */ TimelapseException TOTAL_TIME_TOO_LONG = new TimelapseException(33);
    public static final /* enum */ TimelapseException PATH_TOO_SHORT = new TimelapseException(34);
    public static final /* enum */ TimelapseException HAS_NOT_SET_ORIENTATION = new TimelapseException(36);
    public static final /* enum */ TimelapseException FC_MODE_ERROR_LANDING = new TimelapseException(37);
    public static final /* enum */ TimelapseException FC_MODE_ERROR_GO_HOME = new TimelapseException(38);
    public static final /* enum */ TimelapseException ALREADY_MAX_PHOTO = new TimelapseException(39);
    public static final /* enum */ TimelapseException OA_DISABLED_TO_PAUSE = new TimelapseException(40);
    public static final /* enum */ TimelapseException UNKNOWN = new TimelapseException(255);
    private int value;
    private static final TimelapseException[] allValues;
    private static final /* synthetic */ TimelapseException[] $VALUES;

    public static TimelapseException[] values() {
        return null;
    }

    public static TimelapseException valueOf(String string) {
        return null;
    }

    private TimelapseException(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static TimelapseException find(int n) {
        return null;
    }

    private static /* synthetic */ TimelapseException[] $values() {
        return null;
    }

    static {
        $VALUES = TimelapseException.$values();
        allValues = TimelapseException.values();
    }
}

