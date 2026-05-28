/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class SpotlightZoomStatusTipAndExitReason
extends Enum<SpotlightZoomStatusTipAndExitReason>
implements JNIProguardKeepTag {
    public static final /* enum */ SpotlightZoomStatusTipAndExitReason OK = new SpotlightZoomStatusTipAndExitReason(0);
    public static final /* enum */ SpotlightZoomStatusTipAndExitReason TAR_TOO_NEAR = new SpotlightZoomStatusTipAndExitReason(1);
    public static final /* enum */ SpotlightZoomStatusTipAndExitReason TAR_TOO_FAR = new SpotlightZoomStatusTipAndExitReason(2);
    public static final /* enum */ SpotlightZoomStatusTipAndExitReason LOW_LIMIT = new SpotlightZoomStatusTipAndExitReason(3);
    public static final /* enum */ SpotlightZoomStatusTipAndExitReason HEIGHT_LIMIT = new SpotlightZoomStatusTipAndExitReason(4);
    public static final /* enum */ SpotlightZoomStatusTipAndExitReason RADIUS_LIMIT = new SpotlightZoomStatusTipAndExitReason(5);
    public static final /* enum */ SpotlightZoomStatusTipAndExitReason BOUNDARY_LIMIT = new SpotlightZoomStatusTipAndExitReason(6);
    public static final /* enum */ SpotlightZoomStatusTipAndExitReason GIMBAL_LIMITED = new SpotlightZoomStatusTipAndExitReason(7);
    public static final /* enum */ SpotlightZoomStatusTipAndExitReason YAW_LIMITED = new SpotlightZoomStatusTipAndExitReason(8);
    public static final /* enum */ SpotlightZoomStatusTipAndExitReason TOO_CLOSE_TO_OBSTACLE = new SpotlightZoomStatusTipAndExitReason(9);
    public static final /* enum */ SpotlightZoomStatusTipAndExitReason GPS_TO_RTK = new SpotlightZoomStatusTipAndExitReason(10);
    public static final /* enum */ SpotlightZoomStatusTipAndExitReason RTK_TO_GPS = new SpotlightZoomStatusTipAndExitReason(11);
    public static final /* enum */ SpotlightZoomStatusTipAndExitReason OBSTACLE_AVOID_INVALID = new SpotlightZoomStatusTipAndExitReason(12);
    public static final /* enum */ SpotlightZoomStatusTipAndExitReason NO_ERROR = new SpotlightZoomStatusTipAndExitReason(160);
    public static final /* enum */ SpotlightZoomStatusTipAndExitReason UNSUPPORTED_PAYLOAD = new SpotlightZoomStatusTipAndExitReason(161);
    public static final /* enum */ SpotlightZoomStatusTipAndExitReason UNSUPPORTED_CAMERA_MODE = new SpotlightZoomStatusTipAndExitReason(162);
    public static final /* enum */ SpotlightZoomStatusTipAndExitReason INVALID_CMD = new SpotlightZoomStatusTipAndExitReason(163);
    public static final /* enum */ SpotlightZoomStatusTipAndExitReason GPS_INVALID = new SpotlightZoomStatusTipAndExitReason(164);
    public static final /* enum */ SpotlightZoomStatusTipAndExitReason NO_IN_AIR = new SpotlightZoomStatusTipAndExitReason(165);
    public static final /* enum */ SpotlightZoomStatusTipAndExitReason UNSUPPORTED_CTRL_MODE = new SpotlightZoomStatusTipAndExitReason(166);
    public static final /* enum */ SpotlightZoomStatusTipAndExitReason UNSUPPORTED_FLIGHT_MODE = new SpotlightZoomStatusTipAndExitReason(167);
    public static final /* enum */ SpotlightZoomStatusTipAndExitReason RC_LOST = new SpotlightZoomStatusTipAndExitReason(168);
    public static final /* enum */ SpotlightZoomStatusTipAndExitReason UNKNOWN = new SpotlightZoomStatusTipAndExitReason(255);
    private int value;
    private static final SpotlightZoomStatusTipAndExitReason[] allValues;
    private static final /* synthetic */ SpotlightZoomStatusTipAndExitReason[] $VALUES;

    public static SpotlightZoomStatusTipAndExitReason[] values() {
        return null;
    }

    public static SpotlightZoomStatusTipAndExitReason valueOf(String string) {
        return null;
    }

    private SpotlightZoomStatusTipAndExitReason(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SpotlightZoomStatusTipAndExitReason find(int n) {
        return null;
    }

    private static /* synthetic */ SpotlightZoomStatusTipAndExitReason[] $values() {
        return null;
    }

    static {
        $VALUES = SpotlightZoomStatusTipAndExitReason.$values();
        allValues = SpotlightZoomStatusTipAndExitReason.values();
    }
}

