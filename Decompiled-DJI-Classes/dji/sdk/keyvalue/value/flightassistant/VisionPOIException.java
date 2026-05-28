/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class VisionPOIException
extends Enum<VisionPOIException>
implements JNIProguardKeepTag {
    public static final /* enum */ VisionPOIException NONE = new VisionPOIException(0);
    public static final /* enum */ VisionPOIException PER_CONF_VISION_ERR = new VisionPOIException(1);
    public static final /* enum */ VisionPOIException PER_CONF_SYSTEM_ERR = new VisionPOIException(2);
    public static final /* enum */ VisionPOIException PER_CONF_TARGET_TOO_SMALL = new VisionPOIException(3);
    public static final /* enum */ VisionPOIException PER_CONG_NO_ENOUGH_FEATURE = new VisionPOIException(4);
    public static final /* enum */ VisionPOIException PER_CONF_TRACKING_LOST = new VisionPOIException(5);
    public static final /* enum */ VisionPOIException PER_ESTI_VISION_ERR = new VisionPOIException(6);
    public static final /* enum */ VisionPOIException PER_ESTI_TRACKING_LOST = new VisionPOIException(7);
    public static final /* enum */ VisionPOIException PER_ESTI_RE_PROJ_ERR = new VisionPOIException(8);
    public static final /* enum */ VisionPOIException PER_ESTI_OUT_OF_RANGE = new VisionPOIException(9);
    public static final /* enum */ VisionPOIException PER_ESTI_IMAGE_SZ_CHANGE = new VisionPOIException(10);
    public static final /* enum */ VisionPOIException TA_NAVIGATION_ERR = new VisionPOIException(11);
    public static final /* enum */ VisionPOIException TA_GPS_ERR = new VisionPOIException(12);
    public static final /* enum */ VisionPOIException PRO_PERC_CONN_TIMEOUT = new VisionPOIException(13);
    public static final /* enum */ VisionPOIException PRO_HOT_POINT_INVALID = new VisionPOIException(14);
    public static final /* enum */ VisionPOIException PRO_WATCH_FAILED = new VisionPOIException(15);
    public static final /* enum */ VisionPOIException PRO_ESTIMATE_TIMEOUT = new VisionPOIException(16);
    public static final /* enum */ VisionPOIException PRO_ESTIMATE_RES_INVALID = new VisionPOIException(17);
    public static final /* enum */ VisionPOIException PRO_PATH_GENERATE_ERR = new VisionPOIException(18);
    public static final /* enum */ VisionPOIException PRO_PATH_FOLLOWER_ERR = new VisionPOIException(19);
    public static final /* enum */ VisionPOIException PRO_USER_BUTTON_STOP = new VisionPOIException(20);
    public static final /* enum */ VisionPOIException RADIUS_LIMIT = new VisionPOIException(21);
    public static final /* enum */ VisionPOIException HEIGHT_LIMIT = new VisionPOIException(22);
    public static final /* enum */ VisionPOIException CTRL_MODE_INVALID = new VisionPOIException(23);
    public static final /* enum */ VisionPOIException RC_LOST = new VisionPOIException(24);
    public static final /* enum */ VisionPOIException APP_LOST = new VisionPOIException(25);
    public static final /* enum */ VisionPOIException OBSTACLE_ESTIMATE = new VisionPOIException(26);
    public static final /* enum */ VisionPOIException NAV_RUNNING_OBSTACLE = new VisionPOIException(27);
    public static final /* enum */ VisionPOIException NAV_ESTIMATING_TOO_FAR = new VisionPOIException(28);
    public static final /* enum */ VisionPOIException Drone_TOO_LOW = new VisionPOIException(30);
    public static final /* enum */ VisionPOIException USER_STIR_STICK = new VisionPOIException(31);
    public static final /* enum */ VisionPOIException UNKNOWN = new VisionPOIException(255);
    private int value;
    private static final VisionPOIException[] allValues;
    private static final /* synthetic */ VisionPOIException[] $VALUES;

    public static VisionPOIException[] values() {
        return null;
    }

    public static VisionPOIException valueOf(String string) {
        return null;
    }

    private VisionPOIException(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VisionPOIException find(int n) {
        return null;
    }

    private static /* synthetic */ VisionPOIException[] $values() {
        return null;
    }

    static {
        $VALUES = VisionPOIException.$values();
        allValues = VisionPOIException.values();
    }
}

