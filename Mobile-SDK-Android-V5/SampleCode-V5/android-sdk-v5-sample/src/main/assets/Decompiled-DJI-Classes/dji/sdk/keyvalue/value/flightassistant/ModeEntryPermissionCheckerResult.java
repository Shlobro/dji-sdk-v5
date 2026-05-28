/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class ModeEntryPermissionCheckerResult
extends Enum<ModeEntryPermissionCheckerResult>
implements JNIProguardKeepTag {
    public static final /* enum */ ModeEntryPermissionCheckerResult NONE = new ModeEntryPermissionCheckerResult(0);
    public static final /* enum */ ModeEntryPermissionCheckerResult COMING_SOON = new ModeEntryPermissionCheckerResult(1);
    public static final /* enum */ ModeEntryPermissionCheckerResult PANO = new ModeEntryPermissionCheckerResult(2);
    public static final /* enum */ ModeEntryPermissionCheckerResult SIMULATOR = new ModeEntryPermissionCheckerResult(3);
    public static final /* enum */ ModeEntryPermissionCheckerResult BEGINNER = new ModeEntryPermissionCheckerResult(5);
    public static final /* enum */ ModeEntryPermissionCheckerResult NO_GPS = new ModeEntryPermissionCheckerResult(6);
    public static final /* enum */ ModeEntryPermissionCheckerResult NOT_FLY = new ModeEntryPermissionCheckerResult(7);
    public static final /* enum */ ModeEntryPermissionCheckerResult GO_HOME = new ModeEntryPermissionCheckerResult(8);
    public static final /* enum */ ModeEntryPermissionCheckerResult LANDING = new ModeEntryPermissionCheckerResult(9);
    public static final /* enum */ ModeEntryPermissionCheckerResult TAKEOFF = new ModeEntryPermissionCheckerResult(10);
    public static final /* enum */ ModeEntryPermissionCheckerResult MULTIPLE_MODE_SWITCH = new ModeEntryPermissionCheckerResult(11);
    public static final /* enum */ ModeEntryPermissionCheckerResult MC_MODE_FORBIDDEN = new ModeEntryPermissionCheckerResult(12);
    public static final /* enum */ ModeEntryPermissionCheckerResult RECORDING = new ModeEntryPermissionCheckerResult(13);
    public static final /* enum */ ModeEntryPermissionCheckerResult SHOOTING = new ModeEntryPermissionCheckerResult(14);
    public static final /* enum */ ModeEntryPermissionCheckerResult SELFIE_FORBIDDEN = new ModeEntryPermissionCheckerResult(15);
    public static final /* enum */ ModeEntryPermissionCheckerResult USER_ATTI = new ModeEntryPermissionCheckerResult(16);
    public static final /* enum */ ModeEntryPermissionCheckerResult SPORT_MODE = new ModeEntryPermissionCheckerResult(17);
    public static final /* enum */ ModeEntryPermissionCheckerResult MC_MODE_ERROR = new ModeEntryPermissionCheckerResult(18);
    public static final /* enum */ ModeEntryPermissionCheckerResult NO_AVOIDANCE = new ModeEntryPermissionCheckerResult(19);
    public static final /* enum */ ModeEntryPermissionCheckerResult NO_SDCARD = new ModeEntryPermissionCheckerResult(20);
    public static final /* enum */ ModeEntryPermissionCheckerResult NO_VPS = new ModeEntryPermissionCheckerResult(21);
    public static final /* enum */ ModeEntryPermissionCheckerResult ADVANCED_GESTURE_NOT_ALLOW = new ModeEntryPermissionCheckerResult(22);
    public static final /* enum */ ModeEntryPermissionCheckerResult PANO_SHOOTING = new ModeEntryPermissionCheckerResult(23);
    public static final /* enum */ ModeEntryPermissionCheckerResult NOT_IN_P_MODE = new ModeEntryPermissionCheckerResult(24);
    public static final /* enum */ ModeEntryPermissionCheckerResult DISTANCE_LIMIT = new ModeEntryPermissionCheckerResult(25);
    public static final /* enum */ ModeEntryPermissionCheckerResult HEIGH_TLIMIT = new ModeEntryPermissionCheckerResult(26);
    public static final /* enum */ ModeEntryPermissionCheckerResult FLY_LIMIT_ZONE = new ModeEntryPermissionCheckerResult(27);
    public static final /* enum */ ModeEntryPermissionCheckerResult FUSION_ERROR = new ModeEntryPermissionCheckerResult(28);
    public static final /* enum */ ModeEntryPermissionCheckerResult ENVIRON_BRIGHT = new ModeEntryPermissionCheckerResult(30);
    public static final /* enum */ ModeEntryPermissionCheckerResult ENVIRON_DARK = new ModeEntryPermissionCheckerResult(31);
    public static final /* enum */ ModeEntryPermissionCheckerResult SMART_EYE_COMPATIBILITY = new ModeEntryPermissionCheckerResult(32);
    public static final /* enum */ ModeEntryPermissionCheckerResult ATTI_MODE = new ModeEntryPermissionCheckerResult(33);
    public static final /* enum */ ModeEntryPermissionCheckerResult EXPLORE_MODE = new ModeEntryPermissionCheckerResult(34);
    public static final /* enum */ ModeEntryPermissionCheckerResult HAS_AUGMENTED_LENS = new ModeEntryPermissionCheckerResult(35);
    public static final /* enum */ ModeEntryPermissionCheckerResult VERSION_DISABLED = new ModeEntryPermissionCheckerResult(36);
    public static final /* enum */ ModeEntryPermissionCheckerResult HIGH_RESOLUTION_CAPTURE = new ModeEntryPermissionCheckerResult(41);
    public static final /* enum */ ModeEntryPermissionCheckerResult SMART_CAPTURE = new ModeEntryPermissionCheckerResult(42);
    public static final /* enum */ ModeEntryPermissionCheckerResult AEB_CAPTURE = new ModeEntryPermissionCheckerResult(43);
    public static final /* enum */ ModeEntryPermissionCheckerResult BURST_CAPTURE = new ModeEntryPermissionCheckerResult(44);
    public static final /* enum */ ModeEntryPermissionCheckerResult INTERVAL_CAPTURE = new ModeEntryPermissionCheckerResult(45);
    public static final /* enum */ ModeEntryPermissionCheckerResult HIGH_RECORD_FPS = new ModeEntryPermissionCheckerResult(46);
    public static final /* enum */ ModeEntryPermissionCheckerResult SLOW_MOTION = new ModeEntryPermissionCheckerResult(47);
    public static final /* enum */ ModeEntryPermissionCheckerResult QUICK_SHOT = new ModeEntryPermissionCheckerResult(48);
    public static final /* enum */ ModeEntryPermissionCheckerResult HYPERLAPSE = new ModeEntryPermissionCheckerResult(49);
    public static final /* enum */ ModeEntryPermissionCheckerResult PRO_RES = new ModeEntryPermissionCheckerResult(51);
    public static final /* enum */ ModeEntryPermissionCheckerResult DLOG = new ModeEntryPermissionCheckerResult(52);
    public static final /* enum */ ModeEntryPermissionCheckerResult IN_LTE_MODE = new ModeEntryPermissionCheckerResult(53);
    public static final /* enum */ ModeEntryPermissionCheckerResult PORTRAIT_MODE = new ModeEntryPermissionCheckerResult(54);
    public static final /* enum */ ModeEntryPermissionCheckerResult TELE_LENS = new ModeEntryPermissionCheckerResult(55);
    public static final /* enum */ ModeEntryPermissionCheckerResult MASTER_SHOT = new ModeEntryPermissionCheckerResult(56);
    public static final /* enum */ ModeEntryPermissionCheckerResult VIDEO_HS = new ModeEntryPermissionCheckerResult(57);
    public static final /* enum */ ModeEntryPermissionCheckerResult TELE_LENS_NOT_7X = new ModeEntryPermissionCheckerResult(58);
    public static final /* enum */ ModeEntryPermissionCheckerResult TARGET_SCAN = new ModeEntryPermissionCheckerResult(59);
    public static final /* enum */ ModeEntryPermissionCheckerResult UNIDENTIFIED_TARGET = new ModeEntryPermissionCheckerResult(60);
    public static final /* enum */ ModeEntryPermissionCheckerResult MEDIAN_LENS = new ModeEntryPermissionCheckerResult(61);
    public static final /* enum */ ModeEntryPermissionCheckerResult MEDIAN_LENS_NOT_BASIC = new ModeEntryPermissionCheckerResult(62);
    public static final /* enum */ ModeEntryPermissionCheckerResult IS_TRACKING = new ModeEntryPermissionCheckerResult(63);
    public static final /* enum */ ModeEntryPermissionCheckerResult TARGET_NOT_PERSON = new ModeEntryPermissionCheckerResult(64);
    public static final /* enum */ ModeEntryPermissionCheckerResult ONLY_SUPPORT_NORMAL_PHOTO = new ModeEntryPermissionCheckerResult(65);
    public static final /* enum */ ModeEntryPermissionCheckerResult ONLY_SUPPORT_NORMAL_VIDEO = new ModeEntryPermissionCheckerResult(66);
    public static final /* enum */ ModeEntryPermissionCheckerResult TARGET_NOT_PERSON_ENTERING_FOLLOW = new ModeEntryPermissionCheckerResult(67);
    public static final /* enum */ ModeEntryPermissionCheckerResult UNKNOWN_CHECK_ITEM = new ModeEntryPermissionCheckerResult(65532);
    public static final /* enum */ ModeEntryPermissionCheckerResult INVALID_ENTRY_MODE = new ModeEntryPermissionCheckerResult(65533);
    public static final /* enum */ ModeEntryPermissionCheckerResult NOT_SUPPORT = new ModeEntryPermissionCheckerResult(65534);
    public static final /* enum */ ModeEntryPermissionCheckerResult UNKNOWN = new ModeEntryPermissionCheckerResult(65535);
    private int value;
    private static final ModeEntryPermissionCheckerResult[] allValues;
    private static final /* synthetic */ ModeEntryPermissionCheckerResult[] $VALUES;

    public static ModeEntryPermissionCheckerResult[] values() {
        return null;
    }

    public static ModeEntryPermissionCheckerResult valueOf(String string) {
        return null;
    }

    private ModeEntryPermissionCheckerResult(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ModeEntryPermissionCheckerResult find(int n) {
        return null;
    }

    private static /* synthetic */ ModeEntryPermissionCheckerResult[] $values() {
        return null;
    }

    static {
        $VALUES = ModeEntryPermissionCheckerResult.$values();
        allValues = ModeEntryPermissionCheckerResult.values();
    }
}

