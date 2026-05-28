/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class VisionMultipleTrackException
extends Enum<VisionMultipleTrackException>
implements JNIProguardKeepTag {
    public static final /* enum */ VisionMultipleTrackException NONE = new VisionMultipleTrackException(0);
    public static final /* enum */ VisionMultipleTrackException TIMEOUT = new VisionMultipleTrackException(1);
    public static final /* enum */ VisionMultipleTrackException APP_STOP_OR_CANCEL = new VisionMultipleTrackException(10);
    public static final /* enum */ VisionMultipleTrackException DRONE_EXIT = new VisionMultipleTrackException(11);
    public static final /* enum */ VisionMultipleTrackException QUICK_MOVIE_END = new VisionMultipleTrackException(12);
    public static final /* enum */ VisionMultipleTrackException QUICK_MOVIE_EXIT_BY_JOYSTICK = new VisionMultipleTrackException(13);
    public static final /* enum */ VisionMultipleTrackException TRACKING_END = new VisionMultipleTrackException(14);
    public static final /* enum */ VisionMultipleTrackException SHAKE = new VisionMultipleTrackException(-1);
    public static final /* enum */ VisionMultipleTrackException LOW_DETECT = new VisionMultipleTrackException(-2);
    public static final /* enum */ VisionMultipleTrackException RC_HALT = new VisionMultipleTrackException(-3);
    public static final /* enum */ VisionMultipleTrackException APP_HALT = new VisionMultipleTrackException(-4);
    public static final /* enum */ VisionMultipleTrackException TARGET_HIGHT = new VisionMultipleTrackException(-11);
    public static final /* enum */ VisionMultipleTrackException OBSTACLE = new VisionMultipleTrackException(-12);
    public static final /* enum */ VisionMultipleTrackException PITCH_LOW = new VisionMultipleTrackException(-13);
    public static final /* enum */ VisionMultipleTrackException TOO_FAR = new VisionMultipleTrackException(-14);
    public static final /* enum */ VisionMultipleTrackException TOO_CLOSE = new VisionMultipleTrackException(-15);
    public static final /* enum */ VisionMultipleTrackException DRONE_TOO_HIGHT = new VisionMultipleTrackException(-16);
    public static final /* enum */ VisionMultipleTrackException DRONE_TOO_LOW = new VisionMultipleTrackException(-17);
    public static final /* enum */ VisionMultipleTrackException RADAR_FAIL = new VisionMultipleTrackException(-18);
    public static final /* enum */ VisionMultipleTrackException TOO_SMALL = new VisionMultipleTrackException(-21);
    public static final /* enum */ VisionMultipleTrackException TOO_LARGE = new VisionMultipleTrackException(-22);
    public static final /* enum */ VisionMultipleTrackException NO_FEATURE = new VisionMultipleTrackException(-23);
    public static final /* enum */ VisionMultipleTrackException GIMBAL_PITCH_LOWER_THEN_DEGREE90 = new VisionMultipleTrackException(-24);
    public static final /* enum */ VisionMultipleTrackException LOW_BATTERY_CAPABILITY = new VisionMultipleTrackException(-25);
    public static final /* enum */ VisionMultipleTrackException MISSION_ALREADY_RUNNING = new VisionMultipleTrackException(-26);
    public static final /* enum */ VisionMultipleTrackException UNKNOWN_FC_FORBINDEN = new VisionMultipleTrackException(-27);
    public static final /* enum */ VisionMultipleTrackException UNKNOWN = new VisionMultipleTrackException(255);
    private int value;
    private static final VisionMultipleTrackException[] allValues;
    private static final /* synthetic */ VisionMultipleTrackException[] $VALUES;

    public static VisionMultipleTrackException[] values() {
        return null;
    }

    public static VisionMultipleTrackException valueOf(String string) {
        return null;
    }

    private VisionMultipleTrackException(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VisionMultipleTrackException find(int n) {
        return null;
    }

    private static /* synthetic */ VisionMultipleTrackException[] $values() {
        return null;
    }

    static {
        $VALUES = VisionMultipleTrackException.$values();
        allValues = VisionMultipleTrackException.values();
    }
}

