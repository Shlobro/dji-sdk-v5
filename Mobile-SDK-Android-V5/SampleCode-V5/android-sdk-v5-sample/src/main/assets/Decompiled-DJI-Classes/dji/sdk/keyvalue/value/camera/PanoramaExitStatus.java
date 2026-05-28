/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class PanoramaExitStatus
extends Enum<PanoramaExitStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ PanoramaExitStatus SUCCESSFUL = new PanoramaExitStatus(0);
    public static final /* enum */ PanoramaExitStatus FAILED = new PanoramaExitStatus(1);
    public static final /* enum */ PanoramaExitStatus ABORTED = new PanoramaExitStatus(2);
    public static final /* enum */ PanoramaExitStatus NOT_SUPPORTED = new PanoramaExitStatus(3);
    public static final /* enum */ PanoramaExitStatus BUZY = new PanoramaExitStatus(4);
    public static final /* enum */ PanoramaExitStatus INVALID_REQUEST = new PanoramaExitStatus(5);
    public static final /* enum */ PanoramaExitStatus ON_GROUND = new PanoramaExitStatus(6);
    public static final /* enum */ PanoramaExitStatus FAIL_TAKE_CONTROL = new PanoramaExitStatus(7);
    public static final /* enum */ PanoramaExitStatus CAMERA_ERROR = new PanoramaExitStatus(8);
    public static final /* enum */ PanoramaExitStatus TAKE_PHOTO_TIME_OUT = new PanoramaExitStatus(9);
    public static final /* enum */ PanoramaExitStatus FC_MODE_FOBIDDEN = new PanoramaExitStatus(10);
    public static final /* enum */ PanoramaExitStatus CAMERA_STORAGE_NOT_ENOUGH = new PanoramaExitStatus(11);
    public static final /* enum */ PanoramaExitStatus DRONE_MOVING_FOBBIDEN = new PanoramaExitStatus(12);
    public static final /* enum */ PanoramaExitStatus GIMBAL_MOVING_FOBBIDEN = new PanoramaExitStatus(13);
    public static final /* enum */ PanoramaExitStatus USER_STICK = new PanoramaExitStatus(14);
    public static final /* enum */ PanoramaExitStatus HEIGHT_RESTRICT = new PanoramaExitStatus(15);
    public static final /* enum */ PanoramaExitStatus DISTANCE_RESTRICT = new PanoramaExitStatus(16);
    public static final /* enum */ PanoramaExitStatus GIMBAL_STUCK = new PanoramaExitStatus(17);
    public static final /* enum */ PanoramaExitStatus CAMERA_TAKE_PHOTO_FAILED = new PanoramaExitStatus(18);
    public static final /* enum */ PanoramaExitStatus CAMERA_PHOTO_STITCHING_FAILED = new PanoramaExitStatus(19);
    public static final /* enum */ PanoramaExitStatus CAMERA_LOADING_CALIBRATION_FAILED = new PanoramaExitStatus(20);
    public static final /* enum */ PanoramaExitStatus CAMERA_CHANGE_CAMERA_PARAMETER_FAILED = new PanoramaExitStatus(21);
    public static final /* enum */ PanoramaExitStatus LOWPOWER_OR_GOHOME_FOECE_QUIT = new PanoramaExitStatus(22);
    public static final /* enum */ PanoramaExitStatus CAMERA_WRONG_ANGLE = new PanoramaExitStatus(23);
    public static final /* enum */ PanoramaExitStatus CAMERA_UNKNOWN_ERROR = new PanoramaExitStatus(24);
    public static final /* enum */ PanoramaExitStatus CAMERA_WRONG_PARAM = new PanoramaExitStatus(25);
    public static final /* enum */ PanoramaExitStatus CAMERA_STATUS_ERROR = new PanoramaExitStatus(26);
    public static final /* enum */ PanoramaExitStatus CAMERA_TOPMODE_RESET = new PanoramaExitStatus(27);
    public static final /* enum */ PanoramaExitStatus CAMERA_NON_TOPMODE = new PanoramaExitStatus(28);
    public static final /* enum */ PanoramaExitStatus STRONG_WIND_EXIT = new PanoramaExitStatus(29);
    public static final /* enum */ PanoramaExitStatus APP_IMU_BUF_ERROR = new PanoramaExitStatus(30);
    public static final /* enum */ PanoramaExitStatus UNKNOWN = new PanoramaExitStatus(255);
    private int value;
    private static final PanoramaExitStatus[] allValues;
    private static final /* synthetic */ PanoramaExitStatus[] $VALUES;

    public static PanoramaExitStatus[] values() {
        return null;
    }

    public static PanoramaExitStatus valueOf(String string) {
        return null;
    }

    private PanoramaExitStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PanoramaExitStatus find(int n) {
        return null;
    }

    private static /* synthetic */ PanoramaExitStatus[] $values() {
        return null;
    }

    static {
        $VALUES = PanoramaExitStatus.$values();
        allValues = PanoramaExitStatus.values();
    }
}

