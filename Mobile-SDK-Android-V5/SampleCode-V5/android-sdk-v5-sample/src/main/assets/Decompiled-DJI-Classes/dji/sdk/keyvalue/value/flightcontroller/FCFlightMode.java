/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class FCFlightMode
extends Enum<FCFlightMode>
implements JNIProguardKeepTag {
    public static final /* enum */ FCFlightMode MANUAL = new FCFlightMode(0);
    public static final /* enum */ FCFlightMode ATTI = new FCFlightMode(1);
    public static final /* enum */ FCFlightMode ATTI_CL = new FCFlightMode(2);
    public static final /* enum */ FCFlightMode ATTI_HOVER = new FCFlightMode(3);
    public static final /* enum */ FCFlightMode HOVER = new FCFlightMode(4);
    public static final /* enum */ FCFlightMode GPS_BRAKE = new FCFlightMode(5);
    public static final /* enum */ FCFlightMode GPS_ATTI = new FCFlightMode(6);
    public static final /* enum */ FCFlightMode GPS_CL = new FCFlightMode(7);
    public static final /* enum */ FCFlightMode GPS_HOMELOCK = new FCFlightMode(8);
    public static final /* enum */ FCFlightMode GPS_HOTPOINT = new FCFlightMode(9);
    public static final /* enum */ FCFlightMode ASSISTED_TAKE_OFF = new FCFlightMode(10);
    public static final /* enum */ FCFlightMode AUTO_TAKE_OFF = new FCFlightMode(11);
    public static final /* enum */ FCFlightMode AUTO_LANDING = new FCFlightMode(12);
    public static final /* enum */ FCFlightMode ATTI_LANDING = new FCFlightMode(13);
    public static final /* enum */ FCFlightMode NAVI_GO = new FCFlightMode(14);
    public static final /* enum */ FCFlightMode GO_HOME = new FCFlightMode(15);
    public static final /* enum */ FCFlightMode CLICK_GO = new FCFlightMode(16);
    public static final /* enum */ FCFlightMode JOYSTICK = new FCFlightMode(17);
    public static final /* enum */ FCFlightMode GPS_ATTI_WRISTBAND = new FCFlightMode(18);
    public static final /* enum */ FCFlightMode CINEMATIC = new FCFlightMode(19);
    public static final /* enum */ FCFlightMode ATTI_LIMITED = new FCFlightMode(23);
    public static final /* enum */ FCFlightMode DRAW = new FCFlightMode(24);
    public static final /* enum */ FCFlightMode FOLLOW_ME = new FCFlightMode(25);
    public static final /* enum */ FCFlightMode ACTIVE_TRACK = new FCFlightMode(26);
    public static final /* enum */ FCFlightMode TAP_FLY = new FCFlightMode(27);
    public static final /* enum */ FCFlightMode PANO = new FCFlightMode(28);
    public static final /* enum */ FCFlightMode FARMING = new FCFlightMode(29);
    public static final /* enum */ FCFlightMode FPV = new FCFlightMode(30);
    public static final /* enum */ FCFlightMode GPS_SPORT = new FCFlightMode(31);
    public static final /* enum */ FCFlightMode GPS_NOVICE = new FCFlightMode(32);
    public static final /* enum */ FCFlightMode CONFIRM_LANDING = new FCFlightMode(33);
    public static final /* enum */ FCFlightMode NOE = new FCFlightMode(35);
    public static final /* enum */ FCFlightMode GESTURE_CONTROL = new FCFlightMode(36);
    public static final /* enum */ FCFlightMode QUICK_MOVIE = new FCFlightMode(37);
    public static final /* enum */ FCFlightMode TRIPOD_GPS = new FCFlightMode(38);
    public static final /* enum */ FCFlightMode ACTIVE_TRACK_COURSE_LOCK = new FCFlightMode(39);
    public static final /* enum */ FCFlightMode MOTOR_START = new FCFlightMode(41);
    public static final /* enum */ FCFlightMode FIXED_WING = new FCFlightMode(42);
    public static final /* enum */ FCFlightMode APAS = new FCFlightMode(43);
    public static final /* enum */ FCFlightMode PALM_LAUNCH = new FCFlightMode(44);
    public static final /* enum */ FCFlightMode NAVI_GO_NEW = new FCFlightMode(45);
    public static final /* enum */ FCFlightMode TIME_LAPSE = new FCFlightMode(46);
    public static final /* enum */ FCFlightMode DANCING = new FCFlightMode(47);
    public static final /* enum */ FCFlightMode JUMPING = new FCFlightMode(48);
    public static final /* enum */ FCFlightMode ADSB_ACTION = new FCFlightMode(49);
    public static final /* enum */ FCFlightMode VISION_POI = new FCFlightMode(50);
    public static final /* enum */ FCFlightMode NAVI_SUBMODE_TA = new FCFlightMode(51);
    public static final /* enum */ FCFlightMode FAULT_TOLERANT = new FCFlightMode(52);
    public static final /* enum */ FCFlightMode PRE_MANUAL = new FCFlightMode(53);
    public static final /* enum */ FCFlightMode FLASHLIGHT = new FCFlightMode(54);
    public static final /* enum */ FCFlightMode FLASHLIGHT_SPORT = new FCFlightMode(55);
    public static final /* enum */ FCFlightMode FLASHLIGHT_ATTI = new FCFlightMode(56);
    public static final /* enum */ FCFlightMode ROLLOVER_RESCUE = new FCFlightMode(57);
    public static final /* enum */ FCFlightMode MASTER_SHOT = new FCFlightMode(58);
    public static final /* enum */ FCFlightMode TAKEOFF = new FCFlightMode(59);
    public static final /* enum */ FCFlightMode GO_TARGET_POINT = new FCFlightMode(60);
    public static final /* enum */ FCFlightMode FARM_WORK = new FCFlightMode(61);
    public static final /* enum */ FCFlightMode FIREFLY = new FCFlightMode(62);
    public static final /* enum */ FCFlightMode FIREFLY_EXIT = new FCFlightMode(63);
    public static final /* enum */ FCFlightMode COMMANDER_MODE = new FCFlightMode(64);
    public static final /* enum */ FCFlightMode BASE_LANDING = new FCFlightMode(65);
    public static final /* enum */ FCFlightMode BACKUP_GO_HOME = new FCFlightMode(66);
    public static final /* enum */ FCFlightMode BACKUP_LANDING = new FCFlightMode(67);
    public static final /* enum */ FCFlightMode TRANSPORT_DIVERT = new FCFlightMode(68);
    public static final /* enum */ FCFlightMode SPOTLIGHT_NORMAL = new FCFlightMode(69);
    public static final /* enum */ FCFlightMode SPOTLIGHT_TRIPOD = new FCFlightMode(70);
    public static final /* enum */ FCFlightMode SPOTLIGHT_SPORT = new FCFlightMode(71);
    public static final /* enum */ FCFlightMode TRANSPORT_HOIST_ASSIST = new FCFlightMode(72);
    public static final /* enum */ FCFlightMode QUICKTAKEOFF_ASSIST = new FCFlightMode(73);
    public static final /* enum */ FCFlightMode VISUAL_EXPLORATION = new FCFlightMode(74);
    public static final /* enum */ FCFlightMode FLYTO_LIVE_TARGET = new FCFlightMode(75);
    public static final /* enum */ FCFlightMode SDR_QUALITY_DETECT = new FCFlightMode(76);
    public static final /* enum */ FCFlightMode DEPARTURE_WAYLINE_TEST = new FCFlightMode(77);
    public static final /* enum */ FCFlightMode CALI_POWER_MODEL = new FCFlightMode(78);
    public static final /* enum */ FCFlightMode CABLE_FOLLOW = new FCFlightMode(79);
    public static final /* enum */ FCFlightMode CABLE_INSPECTION = new FCFlightMode(80);
    public static final /* enum */ FCFlightMode LOCK_YAW = new FCFlightMode(81);
    public static final /* enum */ FCFlightMode AUTO_EXPLORE = new FCFlightMode(83);
    public static final /* enum */ FCFlightMode UNKNOWN = new FCFlightMode(65535);
    private int value;
    private static final FCFlightMode[] allValues;
    private static final /* synthetic */ FCFlightMode[] $VALUES;

    public static FCFlightMode[] values() {
        return null;
    }

    public static FCFlightMode valueOf(String string) {
        return null;
    }

    private FCFlightMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FCFlightMode find(int n) {
        return null;
    }

    private static /* synthetic */ FCFlightMode[] $values() {
        return null;
    }

    static {
        $VALUES = FCFlightMode.$values();
        allValues = FCFlightMode.values();
    }
}

