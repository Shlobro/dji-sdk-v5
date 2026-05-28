/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class TrackingExceptionCode
extends Enum<TrackingExceptionCode>
implements JNIProguardKeepTag {
    public static final /* enum */ TrackingExceptionCode UNKNOWN_FCFORBINDEN = new TrackingExceptionCode(-27);
    public static final /* enum */ TrackingExceptionCode MISSION_ALREADY_RUNNING = new TrackingExceptionCode(-26);
    public static final /* enum */ TrackingExceptionCode LOW_BATTERY_CAPABILITY = new TrackingExceptionCode(-25);
    public static final /* enum */ TrackingExceptionCode FAILED_PITCH_LOW = new TrackingExceptionCode(-24);
    public static final /* enum */ TrackingExceptionCode FAILED_NO_DETECT = new TrackingExceptionCode(-23);
    public static final /* enum */ TrackingExceptionCode FAILED_TOO_LARGE = new TrackingExceptionCode(-22);
    public static final /* enum */ TrackingExceptionCode FAILED_TOO_SMALL = new TrackingExceptionCode(-21);
    public static final /* enum */ TrackingExceptionCode CANNOT_CONFIRM_REASON_NO_RADAR = new TrackingExceptionCode(-18);
    public static final /* enum */ TrackingExceptionCode CANNOT_CONFIRM_REASON_DRONE_TOO_LOW = new TrackingExceptionCode(-17);
    public static final /* enum */ TrackingExceptionCode CANNOT_CONFIRM_REASON_DRONE_TOO_HIGH = new TrackingExceptionCode(-16);
    public static final /* enum */ TrackingExceptionCode CANNOT_CONFIRM_REASON_TOO_CLOSE = new TrackingExceptionCode(-15);
    public static final /* enum */ TrackingExceptionCode CANNOT_CONFIRM_REASON_TOO_FAR = new TrackingExceptionCode(-14);
    public static final /* enum */ TrackingExceptionCode CANNOT_CONFIRM_REASON_PITCH_LOW = new TrackingExceptionCode(-13);
    public static final /* enum */ TrackingExceptionCode CANNOT_CONFIRM_REASON_OBSTACLE = new TrackingExceptionCode(-12);
    public static final /* enum */ TrackingExceptionCode CANNOT_CONFIRM_REASON_TOO_HEIGHT = new TrackingExceptionCode(-11);
    public static final /* enum */ TrackingExceptionCode SELFIE_OK_TO_WAIT = new TrackingExceptionCode(-8);
    public static final /* enum */ TrackingExceptionCode SELFIE_LANDING = new TrackingExceptionCode(-7);
    public static final /* enum */ TrackingExceptionCode SELFIE_OBS_TOO_CLOSE = new TrackingExceptionCode(-6);
    public static final /* enum */ TrackingExceptionCode NEED_CONFIRM_REASON_APP_HALT = new TrackingExceptionCode(-4);
    public static final /* enum */ TrackingExceptionCode NEED_CONFIRM_REASON_USER_PAUSE = new TrackingExceptionCode(-3);
    public static final /* enum */ TrackingExceptionCode NEED_CONFIRM_REASON_LOW_DETECT = new TrackingExceptionCode(-2);
    public static final /* enum */ TrackingExceptionCode NEED_CONFIRM_REASON_SHAKE = new TrackingExceptionCode(-1);
    public static final /* enum */ TrackingExceptionCode NO_ERROR = new TrackingExceptionCode(0);
    public static final /* enum */ TrackingExceptionCode EXIT_TIME_OUT = new TrackingExceptionCode(1);
    public static final /* enum */ TrackingExceptionCode EXIT_NO_VELOCITY = new TrackingExceptionCode(2);
    public static final /* enum */ TrackingExceptionCode EXIT_NO_IMAGE_INPUT = new TrackingExceptionCode(3);
    public static final /* enum */ TrackingExceptionCode EXIT_LOW_FPS = new TrackingExceptionCode(4);
    public static final /* enum */ TrackingExceptionCode EXIT_LIMIT = new TrackingExceptionCode(5);
    public static final /* enum */ TrackingExceptionCode EXIT_LOST_RC = new TrackingExceptionCode(6);
    public static final /* enum */ TrackingExceptionCode EXIT_LOST_CONTROL = new TrackingExceptionCode(7);
    public static final /* enum */ TrackingExceptionCode EXIT_APP_STOP = new TrackingExceptionCode(10);
    public static final /* enum */ TrackingExceptionCode EXIT_TRACKING_KILL_SELF = new TrackingExceptionCode(11);
    public static final /* enum */ TrackingExceptionCode EXIT_QUICK_MOVIE_END_NORMAL = new TrackingExceptionCode(12);
    public static final /* enum */ TrackingExceptionCode EXIT_QUICK_MOVIE_END_IN_RETURN_FOR_STICK = new TrackingExceptionCode(13);
    public static final /* enum */ TrackingExceptionCode EXIT_GESTURE_CONTROL_END_FOR_RETURN_GESTURE = new TrackingExceptionCode(14);
    public static final /* enum */ TrackingExceptionCode EXIT_GESTURE_CONTROL_END_FOR_TOF_GESTURE = new TrackingExceptionCode(15);
    public static final /* enum */ TrackingExceptionCode UNKNOWN = new TrackingExceptionCode(65535);
    private int value;
    private static final TrackingExceptionCode[] allValues;
    private static final /* synthetic */ TrackingExceptionCode[] $VALUES;

    public static TrackingExceptionCode[] values() {
        return null;
    }

    public static TrackingExceptionCode valueOf(String string) {
        return null;
    }

    private TrackingExceptionCode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static TrackingExceptionCode find(int n) {
        return null;
    }

    private static /* synthetic */ TrackingExceptionCode[] $values() {
        return null;
    }

    static {
        $VALUES = TrackingExceptionCode.$values();
        allValues = TrackingExceptionCode.values();
    }
}

