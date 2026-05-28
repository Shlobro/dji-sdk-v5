/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class CableInspectionErrCode
extends Enum<CableInspectionErrCode>
implements JNIProguardKeepTag {
    public static final /* enum */ CableInspectionErrCode OK = new CableInspectionErrCode(0);
    public static final /* enum */ CableInspectionErrCode ABST_DATA_ERR = new CableInspectionErrCode(1);
    public static final /* enum */ CableInspectionErrCode USER_REQ_EXIT = new CableInspectionErrCode(2);
    public static final /* enum */ CableInspectionErrCode USER_SWITCH_MODE = new CableInspectionErrCode(3);
    public static final /* enum */ CableInspectionErrCode MISSION_ERR = new CableInspectionErrCode(4);
    public static final /* enum */ CableInspectionErrCode LIDAR_INFO_UPDATE_FAIL = new CableInspectionErrCode(5);
    public static final /* enum */ CableInspectionErrCode CABLE_LOST = new CableInspectionErrCode(6);
    public static final /* enum */ CableInspectionErrCode CAM_CONFIG_FAIL = new CableInspectionErrCode(7);
    public static final /* enum */ CableInspectionErrCode ADJUST_POS_FAIL = new CableInspectionErrCode(8);
    public static final /* enum */ CableInspectionErrCode HEIGHT_LIMIT = new CableInspectionErrCode(10);
    public static final /* enum */ CableInspectionErrCode RADIUS_LIMIT = new CableInspectionErrCode(11);
    public static final /* enum */ CableInspectionErrCode LOW_LIMIT = new CableInspectionErrCode(12);
    public static final /* enum */ CableInspectionErrCode BOUNDARY_LIMIT = new CableInspectionErrCode(13);
    public static final /* enum */ CableInspectionErrCode VFENCE_LIMIT = new CableInspectionErrCode(14);
    public static final /* enum */ CableInspectionErrCode DARK = new CableInspectionErrCode(15);
    public static final /* enum */ CableInspectionErrCode RC_LOST = new CableInspectionErrCode(16);
    public static final /* enum */ CableInspectionErrCode ATTI_MODE = new CableInspectionErrCode(17);
    public static final /* enum */ CableInspectionErrCode TRAJ_INIT_FAIL = new CableInspectionErrCode(257);
    public static final /* enum */ CableInspectionErrCode TRAJ_EMERGENCY_BRAKE = new CableInspectionErrCode(258);
    public static final /* enum */ CableInspectionErrCode TRAJ_PLAN_FAIL = new CableInspectionErrCode(259);
    public static final /* enum */ CableInspectionErrCode UNKNOWN_CMD = new CableInspectionErrCode(513);
    public static final /* enum */ CableInspectionErrCode PARAM_ERR = new CableInspectionErrCode(514);
    public static final /* enum */ CableInspectionErrCode CALIBRATION_FAIL = new CableInspectionErrCode(769);
    public static final /* enum */ CableInspectionErrCode UNKNOWN = new CableInspectionErrCode(65535);
    private int value;
    private static final CableInspectionErrCode[] allValues;
    private static final /* synthetic */ CableInspectionErrCode[] $VALUES;

    public static CableInspectionErrCode[] values() {
        return null;
    }

    public static CableInspectionErrCode valueOf(String string) {
        return null;
    }

    private CableInspectionErrCode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CableInspectionErrCode find(int n) {
        return null;
    }

    private static /* synthetic */ CableInspectionErrCode[] $values() {
        return null;
    }

    static {
        $VALUES = CableInspectionErrCode.$values();
        allValues = CableInspectionErrCode.values();
    }
}

