/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class SmartEyeException
extends Enum<SmartEyeException>
implements JNIProguardKeepTag {
    public static final /* enum */ SmartEyeException NORMAL = new SmartEyeException(0);
    public static final /* enum */ SmartEyeException DRONE_TOO_LOW = new SmartEyeException(1);
    public static final /* enum */ SmartEyeException DRONE_TOO_HIGH = new SmartEyeException(2);
    public static final /* enum */ SmartEyeException TARGET_TOO_CLOSE = new SmartEyeException(3);
    public static final /* enum */ SmartEyeException TARGET_TOO_FAR = new SmartEyeException(4);
    public static final /* enum */ SmartEyeException TARGET_TOO_LARGE = new SmartEyeException(5);
    public static final /* enum */ SmartEyeException TARGET_TOO_SMALL = new SmartEyeException(6);
    public static final /* enum */ SmartEyeException TOO_FAR_PLZ_WAIT = new SmartEyeException(7);
    public static final /* enum */ SmartEyeException NO_ENOUGH_FEATURE = new SmartEyeException(8);
    public static final /* enum */ SmartEyeException TARGET_NOT_SUPPORT = new SmartEyeException(9);
    public static final /* enum */ SmartEyeException TOO_LOW_TO_TK = new SmartEyeException(10);
    public static final /* enum */ SmartEyeException TOO_HIGH_TO_TK = new SmartEyeException(11);
    public static final /* enum */ SmartEyeException TOO_CLOSE_TO_TK = new SmartEyeException(12);
    public static final /* enum */ SmartEyeException TOO_FAR_TO_TK = new SmartEyeException(13);
    public static final /* enum */ SmartEyeException NEED_TK_FASTER = new SmartEyeException(14);
    public static final /* enum */ SmartEyeException UNDEREXPOSURED_TO_TK = new SmartEyeException(15);
    public static final /* enum */ SmartEyeException OVEREXPOSURED_TO_TK = new SmartEyeException(16);
    public static final /* enum */ SmartEyeException TARGET_LOST_TO_TK = new SmartEyeException(17);
    public static final /* enum */ SmartEyeException TARGET_TOO_LARGE_ZOOM_IN = new SmartEyeException(18);
    public static final /* enum */ SmartEyeException TOO_NARROW_TO_SWITCH_DIRECTION = new SmartEyeException(19);
    public static final /* enum */ SmartEyeException TARGET_TOO_FAST_TO_SWITCH_DIRECTION = new SmartEyeException(20);
    public static final /* enum */ SmartEyeException SYS_ERROR_WARNNING = new SmartEyeException(50);
    public static final /* enum */ SmartEyeException USER_PAUSE = new SmartEyeException(51);
    public static final /* enum */ SmartEyeException ENVI_TOO_NARROW = new SmartEyeException(52);
    public static final /* enum */ SmartEyeException OBSTACLE_BLOCK = new SmartEyeException(53);
    public static final /* enum */ SmartEyeException PERC_EST_TOO_LONG = new SmartEyeException(54);
    public static final /* enum */ SmartEyeException FOLLOWING_TOO_CLOSE = new SmartEyeException(58);
    public static final /* enum */ SmartEyeException POI_TOO_CLOSE = new SmartEyeException(61);
    public static final /* enum */ SmartEyeException SYS_ERROR_WATITTING = new SmartEyeException(100);
    public static final /* enum */ SmartEyeException PERC_TARGET_LOST = new SmartEyeException(101);
    public static final /* enum */ SmartEyeException PERC_EST_FAILED = new SmartEyeException(102);
    public static final /* enum */ SmartEyeException PERC_EST_JOYSTIC = new SmartEyeException(103);
    public static final /* enum */ SmartEyeException ML_TARGET_LOST = new SmartEyeException(104);
    public static final /* enum */ SmartEyeException FC_TAKE_CTRL_FAILED = new SmartEyeException(105);
    public static final /* enum */ SmartEyeException PERC_BOX_TO_TP = new SmartEyeException(106);
    public static final /* enum */ SmartEyeException LOST_CTRL_RIGHTS = new SmartEyeException(107);
    public static final /* enum */ SmartEyeException DAMGEROUS_ATTITUDE = new SmartEyeException(108);
    public static final /* enum */ SmartEyeException TOO_LOW_TO_INIT = new SmartEyeException(109);
    public static final /* enum */ SmartEyeException TOO_HIGH_TO_INIT = new SmartEyeException(110);
    public static final /* enum */ SmartEyeException TOO_CLOSE_TO_INIT = new SmartEyeException(111);
    public static final /* enum */ SmartEyeException TOO_FAR_TO_INIT = new SmartEyeException(112);
    public static final /* enum */ SmartEyeException TE_INIT_TIMEOUT = new SmartEyeException(113);
    public static final /* enum */ SmartEyeException TARGET_SWITCHED = new SmartEyeException(114);
    public static final /* enum */ SmartEyeException APP_LOST = new SmartEyeException(115);
    public static final /* enum */ SmartEyeException IMG_LOST = new SmartEyeException(116);
    public static final /* enum */ SmartEyeException RC_LOST = new SmartEyeException(117);
    public static final /* enum */ SmartEyeException EST_SWITCH_MODE = new SmartEyeException(118);
    public static final /* enum */ SmartEyeException UNDEREXPOSURED = new SmartEyeException(119);
    public static final /* enum */ SmartEyeException OVEREXPOSURED = new SmartEyeException(120);
    public static final /* enum */ SmartEyeException NO_OA_TO_CIR_DYNAMIC = new SmartEyeException(121);
    public static final /* enum */ SmartEyeException PERC_EST_FAILED_ZOOM_CHANGED = new SmartEyeException(122);
    public static final /* enum */ SmartEyeException SYS_ERROR_MOT = new SmartEyeException(150);
    public static final /* enum */ SmartEyeException REGION_LIMITED = new SmartEyeException(151);
    public static final /* enum */ SmartEyeException HEIGHT_LIMITED = new SmartEyeException(152);
    public static final /* enum */ SmartEyeException NO_FUSION = new SmartEyeException(154);
    public static final /* enum */ SmartEyeException FC_MODE_ERROR = new SmartEyeException(155);
    public static final /* enum */ SmartEyeException VIDEO_RECORD_RESTRICT = new SmartEyeException(156);
    public static final /* enum */ SmartEyeException FC_MODE_LANDING = new SmartEyeException(157);
    public static final /* enum */ SmartEyeException FC_MODE_HOMING = new SmartEyeException(158);
    public static final /* enum */ SmartEyeException SYS_ERROR = new SmartEyeException(200);
    public static final /* enum */ SmartEyeException UNKNOWN = new SmartEyeException(255);
    private int value;
    private static final SmartEyeException[] allValues;
    private static final /* synthetic */ SmartEyeException[] $VALUES;

    public static SmartEyeException[] values() {
        return null;
    }

    public static SmartEyeException valueOf(String string) {
        return null;
    }

    private SmartEyeException(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SmartEyeException find(int n) {
        return null;
    }

    private static /* synthetic */ SmartEyeException[] $values() {
        return null;
    }

    static {
        $VALUES = SmartEyeException.$values();
        allValues = SmartEyeException.values();
    }
}

