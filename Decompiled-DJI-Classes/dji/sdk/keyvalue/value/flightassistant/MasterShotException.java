/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class MasterShotException
extends Enum<MasterShotException>
implements JNIProguardKeepTag {
    public static final /* enum */ MasterShotException NONE = new MasterShotException(0);
    public static final /* enum */ MasterShotException QM_NORMAL_COMEBACK = new MasterShotException(1);
    public static final /* enum */ MasterShotException QM_FLYLIMIT_COMEBACK = new MasterShotException(2);
    public static final /* enum */ MasterShotException QM_DISTANCE_COMEBACK = new MasterShotException(3);
    public static final /* enum */ MasterShotException QM_TIMEOUT_COMEBACK = new MasterShotException(4);
    public static final /* enum */ MasterShotException QM_GPS_UNVALID_COMEBACK = new MasterShotException(5);
    public static final /* enum */ MasterShotException QM_RC_INTERRUPT_COMEBACK = new MasterShotException(6);
    public static final /* enum */ MasterShotException QM_INIT_FAILED_COMEBACK = new MasterShotException(7);
    public static final /* enum */ MasterShotException QM_CAMERA_WRONG_COMEBACK = new MasterShotException(8);
    public static final /* enum */ MasterShotException QM_NOT_IN_AIR = new MasterShotException(9);
    public static final /* enum */ MasterShotException QM_FC_MODE_ERROR = new MasterShotException(10);
    public static final /* enum */ MasterShotException QM_OBSTACLE_AVOID = new MasterShotException(11);
    public static final /* enum */ MasterShotException QM_USER_PAUSE = new MasterShotException(12);
    public static final /* enum */ MasterShotException PANO_SHOT_GIMBAL_STUCK = new MasterShotException(13);
    public static final /* enum */ MasterShotException PANO_SHOT_FAIL_TAKE_CONTROL = new MasterShotException(14);
    public static final /* enum */ MasterShotException PANO_SHOT_STORAGE_NOT_ENOUGH = new MasterShotException(15);
    public static final /* enum */ MasterShotException TRACKIING_SHOT_TARGET_LOST = new MasterShotException(16);
    public static final /* enum */ MasterShotException PANO_SHOT_TAKE_PHOTO_FAILED = new MasterShotException(17);
    public static final /* enum */ MasterShotException PANO_SHOT_PHOTO_STITCHING_FAILED = new MasterShotException(18);
    public static final /* enum */ MasterShotException PANO_SHOT_LOADING_CALIBRATION_FAILED = new MasterShotException(19);
    public static final /* enum */ MasterShotException PANO_SHOT_ADJUST_CAMERA_PARAMETER_FAILED = new MasterShotException(20);
    public static final /* enum */ MasterShotException PANO_SHOT_TIME_OUT = new MasterShotException(21);
    public static final /* enum */ MasterShotException PANO_SHOT_LINK_LOST = new MasterShotException(22);
    public static final /* enum */ MasterShotException LOW_POWER_OR_FORCE_QUIT = new MasterShotException(23);
    public static final /* enum */ MasterShotException OBSTACLE_AVOID_FORWARD = new MasterShotException(24);
    public static final /* enum */ MasterShotException OBSTACLE_AVOID_BACKWARD = new MasterShotException(25);
    public static final /* enum */ MasterShotException OBSTACLE_AVOID_LEFT = new MasterShotException(26);
    public static final /* enum */ MasterShotException OBSTACLE_AVOID_RIGHT = new MasterShotException(27);
    public static final /* enum */ MasterShotException LANDING_FORCE_QUIT = new MasterShotException(28);
    public static final /* enum */ MasterShotException HOMING_FORCE_QUIT = new MasterShotException(29);
    public static final /* enum */ MasterShotException VIDEO_LENTH_NOT_ENOUGH = new MasterShotException(30);
    public static final /* enum */ MasterShotException CAMERA_TOPMODE_WRONG = new MasterShotException(31);
    public static final /* enum */ MasterShotException BEYOND_VISUAL_RANGE = new MasterShotException(32);
    public static final /* enum */ MasterShotException CAMERA_RECORDING_ERROR = new MasterShotException(33);
    public static final /* enum */ MasterShotException CAMERA_SDCARD_ERROR = new MasterShotException(34);
    public static final /* enum */ MasterShotException UNKNOWN = new MasterShotException(255);
    private int value;
    private static final MasterShotException[] allValues;
    private static final /* synthetic */ MasterShotException[] $VALUES;

    public static MasterShotException[] values() {
        return null;
    }

    public static MasterShotException valueOf(String string) {
        return null;
    }

    private MasterShotException(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MasterShotException find(int n) {
        return null;
    }

    private static /* synthetic */ MasterShotException[] $values() {
        return null;
    }

    static {
        $VALUES = MasterShotException.$values();
        allValues = MasterShotException.values();
    }
}

