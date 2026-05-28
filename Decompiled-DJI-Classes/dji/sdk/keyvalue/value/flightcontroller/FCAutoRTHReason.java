/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class FCAutoRTHReason
extends Enum<FCAutoRTHReason>
implements JNIProguardKeepTag {
    public static final /* enum */ FCAutoRTHReason NONE = new FCAutoRTHReason(0);
    public static final /* enum */ FCAutoRTHReason WARNING_POWER_GOHOME = new FCAutoRTHReason(1);
    public static final /* enum */ FCAutoRTHReason WARNING_POWER_LANDING = new FCAutoRTHReason(2);
    public static final /* enum */ FCAutoRTHReason SMART_POWER_GOHOME = new FCAutoRTHReason(3);
    public static final /* enum */ FCAutoRTHReason SMART_POWER_LANDING = new FCAutoRTHReason(4);
    public static final /* enum */ FCAutoRTHReason LOW_VOLTAGE_GOHOME = new FCAutoRTHReason(5);
    public static final /* enum */ FCAutoRTHReason LOW_VOLTAGE_LANDING = new FCAutoRTHReason(6);
    public static final /* enum */ FCAutoRTHReason SERIOUS_LOW_VOLTAGE_LANDING = new FCAutoRTHReason(7);
    public static final /* enum */ FCAutoRTHReason RC_ONEKEY_GOHOME = new FCAutoRTHReason(8);
    public static final /* enum */ FCAutoRTHReason RC_ASSISTANT_TAKEOFF = new FCAutoRTHReason(9);
    public static final /* enum */ FCAutoRTHReason RC_AUTO_TAKEOFF = new FCAutoRTHReason(10);
    public static final /* enum */ FCAutoRTHReason RC_AUTO_LANDING = new FCAutoRTHReason(11);
    public static final /* enum */ FCAutoRTHReason APP_AUTO_GOHOME = new FCAutoRTHReason(12);
    public static final /* enum */ FCAutoRTHReason APP_AUTO_LANDING = new FCAutoRTHReason(13);
    public static final /* enum */ FCAutoRTHReason APP_AUTO_TAKEOFF = new FCAutoRTHReason(14);
    public static final /* enum */ FCAutoRTHReason OUTOF_CONTROL_GOHOME = new FCAutoRTHReason(15);
    public static final /* enum */ FCAutoRTHReason API_AUTO_TAKEOFF = new FCAutoRTHReason(16);
    public static final /* enum */ FCAutoRTHReason API_AUTO_LANDING = new FCAutoRTHReason(17);
    public static final /* enum */ FCAutoRTHReason API_AUTO_GOHOME = new FCAutoRTHReason(18);
    public static final /* enum */ FCAutoRTHReason AVOID_GROUND_LANDING = new FCAutoRTHReason(19);
    public static final /* enum */ FCAutoRTHReason NO_FLY_ZONE_LANDING = new FCAutoRTHReason(20);
    public static final /* enum */ FCAutoRTHReason TOO_CLOSE_GOHOME_LANDING = new FCAutoRTHReason(21);
    public static final /* enum */ FCAutoRTHReason TOO_FAR_GOHOME_LANDING = new FCAutoRTHReason(22);
    public static final /* enum */ FCAutoRTHReason APP_WP_MISSION = new FCAutoRTHReason(23);
    public static final /* enum */ FCAutoRTHReason WP_AUTO_TAKEOFF = new FCAutoRTHReason(24);
    public static final /* enum */ FCAutoRTHReason GOHOME_AVOID = new FCAutoRTHReason(25);
    public static final /* enum */ FCAutoRTHReason GOHOME_FINISH = new FCAutoRTHReason(26);
    public static final /* enum */ FCAutoRTHReason VERT_LOW_LIMIT_LANDING = new FCAutoRTHReason(27);
    public static final /* enum */ FCAutoRTHReason BATTERY_FORCE_LANDING = new FCAutoRTHReason(28);
    public static final /* enum */ FCAutoRTHReason MC_PROTECT_GOHOME = new FCAutoRTHReason(29);
    public static final /* enum */ FCAutoRTHReason MOTOR_STUCK_LANDING = new FCAutoRTHReason(30);
    public static final /* enum */ FCAutoRTHReason APP_REQUEST_FORCE_LANDING = new FCAutoRTHReason(31);
    public static final /* enum */ FCAutoRTHReason UNAUTH_BATTERY_LANDING = new FCAutoRTHReason(32);
    public static final /* enum */ FCAutoRTHReason RTH_COMING_OBSTACLE_LANDING = new FCAutoRTHReason(33);
    public static final /* enum */ FCAutoRTHReason IMU_ERROR_RTH = new FCAutoRTHReason(34);
    public static final /* enum */ FCAutoRTHReason ON_HAND_LANDING = new FCAutoRTHReason(35);
    public static final /* enum */ FCAutoRTHReason ON_HAND_TAKEOFF = new FCAutoRTHReason(36);
    public static final /* enum */ FCAutoRTHReason EXTERN_MODULE_TEMP_TOO_HIGH_GOHOME = new FCAutoRTHReason(37);
    public static final /* enum */ FCAutoRTHReason PALM_LAND = new FCAutoRTHReason(38);
    public static final /* enum */ FCAutoRTHReason EXTERN_MODULE_TEMP_TOO_HIGH_LANDING = new FCAutoRTHReason(39);
    public static final /* enum */ FCAutoRTHReason GOHOME_FOR_NO_PESTICIDE = new FCAutoRTHReason(40);
    public static final /* enum */ FCAutoRTHReason HEIGHT_CTRL_FAIL = new FCAutoRTHReason(41);
    public static final /* enum */ FCAutoRTHReason MOTOR_OVERLOAD_LANDING = new FCAutoRTHReason(42);
    public static final /* enum */ FCAutoRTHReason USE_BATTERY_BACKUP_LANDING = new FCAutoRTHReason(43);
    public static final /* enum */ FCAutoRTHReason BATTERY_CURRENT_PROTECT_LANDING = new FCAutoRTHReason(44);
    public static final /* enum */ FCAutoRTHReason MANUAL_VIDEO_LOST_GOHOME = new FCAutoRTHReason(45);
    public static final /* enum */ FCAutoRTHReason BATTERY_MOS_ABNORMAL = new FCAutoRTHReason(46);
    public static final /* enum */ FCAutoRTHReason VIDEO_LOST_LANDING = new FCAutoRTHReason(47);
    public static final /* enum */ FCAutoRTHReason RC_LOST_LANDING = new FCAutoRTHReason(48);
    public static final /* enum */ FCAutoRTHReason MC_PROTECT_LANDING = new FCAutoRTHReason(49);
    public static final /* enum */ FCAutoRTHReason FAN_ABNORMAL_GOHOME = new FCAutoRTHReason(50);
    public static final /* enum */ FCAutoRTHReason SMART_BATTERY_GOHOME_LANDING = new FCAutoRTHReason(51);
    public static final /* enum */ FCAutoRTHReason AP_WORK_MODE = new FCAutoRTHReason(52);
    public static final /* enum */ FCAutoRTHReason EXTEND_TASK_ABNORMAL = new FCAutoRTHReason(53);
    public static final /* enum */ FCAutoRTHReason BATTERY_DIAGNOSIS_PROTECT = new FCAutoRTHReason(54);
    public static final /* enum */ FCAutoRTHReason RC_LOST_HOVER = new FCAutoRTHReason(55);
    public static final /* enum */ FCAutoRTHReason STRONG_WIND_GOHOME = new FCAutoRTHReason(56);
    public static final /* enum */ FCAutoRTHReason UNKNOWN = new FCAutoRTHReason(65535);
    private int value;
    private static final FCAutoRTHReason[] allValues;
    private static final /* synthetic */ FCAutoRTHReason[] $VALUES;

    public static FCAutoRTHReason[] values() {
        return null;
    }

    public static FCAutoRTHReason valueOf(String string) {
        return null;
    }

    private FCAutoRTHReason(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FCAutoRTHReason find(int n) {
        return null;
    }

    private static /* synthetic */ FCAutoRTHReason[] $values() {
        return null;
    }

    static {
        $VALUES = FCAutoRTHReason.$values();
        allValues = FCAutoRTHReason.values();
    }
}

