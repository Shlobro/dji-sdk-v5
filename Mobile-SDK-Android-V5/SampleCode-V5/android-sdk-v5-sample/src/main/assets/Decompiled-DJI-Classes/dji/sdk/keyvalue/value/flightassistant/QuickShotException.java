/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class QuickShotException
extends Enum<QuickShotException>
implements JNIProguardKeepTag {
    public static final /* enum */ QuickShotException NONE = new QuickShotException(0);
    public static final /* enum */ QuickShotException QM_NORMAL_COMEBACK = new QuickShotException(1);
    public static final /* enum */ QuickShotException QM_FLYLIMIT_COMEBACK = new QuickShotException(2);
    public static final /* enum */ QuickShotException QM_DISTANCE_COMEBACK = new QuickShotException(3);
    public static final /* enum */ QuickShotException QM_TIMEOUT_COMEBACK = new QuickShotException(4);
    public static final /* enum */ QuickShotException QM_GPS_UNVALID_COMEBACK = new QuickShotException(5);
    public static final /* enum */ QuickShotException QM_RC_INTERRUPT_COMEBACK = new QuickShotException(6);
    public static final /* enum */ QuickShotException QM_INIT_FAILED_COMEBACK = new QuickShotException(7);
    public static final /* enum */ QuickShotException QM_CAMERA_WRONG_COMEBACK = new QuickShotException(8);
    public static final /* enum */ QuickShotException QM_NOT_IN_AIR = new QuickShotException(9);
    public static final /* enum */ QuickShotException QM_FC_MODE_ERROR = new QuickShotException(10);
    public static final /* enum */ QuickShotException QM_OBSTACLE_AVOID = new QuickShotException(11);
    public static final /* enum */ QuickShotException QM_USER_PAUSE = new QuickShotException(12);
    public static final /* enum */ QuickShotException PANO_SHOT_GIMBAL_STUCK = new QuickShotException(13);
    public static final /* enum */ QuickShotException PANO_SHOT_FAIL_TAKE_CONTROL = new QuickShotException(14);
    public static final /* enum */ QuickShotException PANO_SHOT_STORAGE_NOT_ENOUGH = new QuickShotException(15);
    public static final /* enum */ QuickShotException TRACKIING_SHOT_TARGET_LOST = new QuickShotException(16);
    public static final /* enum */ QuickShotException PANO_SHOT_TAKE_PHOTO_FAILED = new QuickShotException(17);
    public static final /* enum */ QuickShotException PANO_SHOT_PHOTO_STITCHING_FAILED = new QuickShotException(18);
    public static final /* enum */ QuickShotException PANO_SHOT_LOADING_CALIBRATION_FAILED = new QuickShotException(19);
    public static final /* enum */ QuickShotException PANO_SHOT_ADJUST_CAMERA_PARAMETER_FAILED = new QuickShotException(20);
    public static final /* enum */ QuickShotException PANO_SHOT_TIMEOUT = new QuickShotException(21);
    public static final /* enum */ QuickShotException QUICK_SHOT_EXCEPTION_LOW_POWER_OR_FORCE_QUIT = new QuickShotException(23);
    public static final /* enum */ QuickShotException QUICK_SHOT_EXCEPTION_OBSTACLE_AVOID_FORWARD = new QuickShotException(24);
    public static final /* enum */ QuickShotException QUICK_SHOT_EXCEPTION_OBSTACLE_AVOID_BACKWARD = new QuickShotException(25);
    public static final /* enum */ QuickShotException QUICK_SHOT_EXCEPTION_OBSTACLE_AVOID_LEFT = new QuickShotException(26);
    public static final /* enum */ QuickShotException QUICK_SHOT_EXCEPTION_OBSTACLE_AVOID_RIGHT = new QuickShotException(27);
    public static final /* enum */ QuickShotException QUIT_IN_LANDING = new QuickShotException(28);
    public static final /* enum */ QuickShotException QUIT_IN_HOMING = new QuickShotException(29);
    public static final /* enum */ QuickShotException QUICK_SHOT_EXCEPTION_VIDEO_LENGTH_NOT_ENOUGH = new QuickShotException(30);
    public static final /* enum */ QuickShotException UNKNOWN = new QuickShotException(65535);
    private int value;
    private static final QuickShotException[] allValues;
    private static final /* synthetic */ QuickShotException[] $VALUES;

    public static QuickShotException[] values() {
        return null;
    }

    public static QuickShotException valueOf(String string) {
        return null;
    }

    private QuickShotException(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static QuickShotException find(int n) {
        return null;
    }

    private static /* synthetic */ QuickShotException[] $values() {
        return null;
    }

    static {
        $VALUES = QuickShotException.$values();
        allValues = QuickShotException.values();
    }
}

