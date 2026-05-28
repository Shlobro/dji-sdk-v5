/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class VisualExplorationErrorCode
extends Enum<VisualExplorationErrorCode>
implements JNIProguardKeepTag {
    public static final /* enum */ VisualExplorationErrorCode CMD_SUCCESS = new VisualExplorationErrorCode(0);
    public static final /* enum */ VisualExplorationErrorCode UNKNOW_TASK_CMD = new VisualExplorationErrorCode(1);
    public static final /* enum */ VisualExplorationErrorCode APP_REGISTER_CALLBACK_ERROR = new VisualExplorationErrorCode(2);
    public static final /* enum */ VisualExplorationErrorCode ABSTRACT_DATD_ERROR = new VisualExplorationErrorCode(3);
    public static final /* enum */ VisualExplorationErrorCode DRONE_IS_NOT_IN_AIR = new VisualExplorationErrorCode(4);
    public static final /* enum */ VisualExplorationErrorCode PARAM_READ_ERROR = new VisualExplorationErrorCode(5);
    public static final /* enum */ VisualExplorationErrorCode EPHEMERIS_NOT_EXIT = new VisualExplorationErrorCode(6);
    public static final /* enum */ VisualExplorationErrorCode WIND_SPD_BIG = new VisualExplorationErrorCode(7);
    public static final /* enum */ VisualExplorationErrorCode USER_REQUEST_PAUSE = new VisualExplorationErrorCode(8);
    public static final /* enum */ VisualExplorationErrorCode USER_CHANGE_MODE = new VisualExplorationErrorCode(9);
    public static final /* enum */ VisualExplorationErrorCode RUNNING_AT_NIGHT = new VisualExplorationErrorCode(10);
    public static final /* enum */ VisualExplorationErrorCode HEIGHT_LIMIT = new VisualExplorationErrorCode(11);
    public static final /* enum */ VisualExplorationErrorCode BOUNDARY_LIMIT = new VisualExplorationErrorCode(12);
    public static final /* enum */ VisualExplorationErrorCode OA_LIMIT = new VisualExplorationErrorCode(13);
    public static final /* enum */ VisualExplorationErrorCode REG_DBUS_EROOR = new VisualExplorationErrorCode(14);
    public static final /* enum */ VisualExplorationErrorCode RC_LOST_VE = new VisualExplorationErrorCode(15);
    public static final /* enum */ VisualExplorationErrorCode START_FAIL_TASK_NUM_FULL = new VisualExplorationErrorCode(16);
    public static final /* enum */ VisualExplorationErrorCode START_FAIL_FOR_TASK_IS_RUNNING = new VisualExplorationErrorCode(17);
    public static final /* enum */ VisualExplorationErrorCode START_FAIL_FOR_HEADING_LEVEL = new VisualExplorationErrorCode(18);
    public static final /* enum */ VisualExplorationErrorCode START_FAIL_FOR_OSDK_MO_DULE_TYPE = new VisualExplorationErrorCode(19);
    public static final /* enum */ VisualExplorationErrorCode START_FAIL_FOR_GNSS_INIT_FAIL = new VisualExplorationErrorCode(20);
    public static final /* enum */ VisualExplorationErrorCode START_FAIL_FOR_GNSS_LEVEL_LOW = new VisualExplorationErrorCode(21);
    public static final /* enum */ VisualExplorationErrorCode START_FAIL_FOR_POS_INVALID = new VisualExplorationErrorCode(22);
    public static final /* enum */ VisualExplorationErrorCode START_FAIL_FOR_MAP_INVALID = new VisualExplorationErrorCode(23);
    public static final /* enum */ VisualExplorationErrorCode STOP_FAIL_FOR_TASK_IS_NOT_RUNING = new VisualExplorationErrorCode(32);
    public static final /* enum */ VisualExplorationErrorCode STOP_FAIL_FOR_UNKNOW_TASK_CMD = new VisualExplorationErrorCode(33);
    public static final /* enum */ VisualExplorationErrorCode STOP_SKY_PARSING_SUCCESS = new VisualExplorationErrorCode(34);
    public static final /* enum */ VisualExplorationErrorCode STOP_GNSS_ACCESS_SUCCESS = new VisualExplorationErrorCode(35);
    public static final /* enum */ VisualExplorationErrorCode STOP_GNSS_ACCESS_FAIL = new VisualExplorationErrorCode(36);
    public static final /* enum */ VisualExplorationErrorCode EPHEMERIS_UPLOAD_SUCCESS = new VisualExplorationErrorCode(64);
    public static final /* enum */ VisualExplorationErrorCode EPHEMERIS_GET_FAILED = new VisualExplorationErrorCode(65);
    public static final /* enum */ VisualExplorationErrorCode EPHEMERIS_UNZIP_FAILED = new VisualExplorationErrorCode(66);
    public static final /* enum */ VisualExplorationErrorCode ROTATE_TIMEOUT = new VisualExplorationErrorCode(80);
    public static final /* enum */ VisualExplorationErrorCode ACCLUSION_HIGH = new VisualExplorationErrorCode(81);
    public static final /* enum */ VisualExplorationErrorCode GET_SCALE_TIMEOUT = new VisualExplorationErrorCode(82);
    public static final /* enum */ VisualExplorationErrorCode FOUND_OBSTACLE = new VisualExplorationErrorCode(83);
    public static final /* enum */ VisualExplorationErrorCode PARSING_FAIL = new VisualExplorationErrorCode(84);
    public static final /* enum */ VisualExplorationErrorCode GET_SCALE_ERROR = new VisualExplorationErrorCode(85);
    public static final /* enum */ VisualExplorationErrorCode TOP_TASK_FOR_GNSS_FAILE = new VisualExplorationErrorCode(98);
    public static final /* enum */ VisualExplorationErrorCode GNSS_DATA_UNAVAILABLE = new VisualExplorationErrorCode(99);
    public static final /* enum */ VisualExplorationErrorCode SPP_LOW_POS_RATE = new VisualExplorationErrorCode(100);
    public static final /* enum */ VisualExplorationErrorCode SPP_LOW_POS_ACCURACY = new VisualExplorationErrorCode(101);
    public static final /* enum */ VisualExplorationErrorCode SPP_POS_SAT_INSUFFICIENT = new VisualExplorationErrorCode(102);
    public static final /* enum */ VisualExplorationErrorCode SPP_POS_HIGH_PDOP = new VisualExplorationErrorCode(103);
    public static final /* enum */ VisualExplorationErrorCode HEADING_LOW_FIXRATE = new VisualExplorationErrorCode(104);
    public static final /* enum */ VisualExplorationErrorCode HEADING_SWITCH_TO_FLOAT = new VisualExplorationErrorCode(105);
    public static final /* enum */ VisualExplorationErrorCode HEADING_LOW_ACCURACY = new VisualExplorationErrorCode(112);
    public static final /* enum */ VisualExplorationErrorCode HEADING_SAT_INSUFFICIENT = new VisualExplorationErrorCode(113);
    public static final /* enum */ VisualExplorationErrorCode RTK_POS_NO_VALID_DATA = new VisualExplorationErrorCode(114);
    public static final /* enum */ VisualExplorationErrorCode RTK_POS_TOO_MANY_ERROR_PERIODS = new VisualExplorationErrorCode(115);
    public static final /* enum */ VisualExplorationErrorCode NO_EPHEMERIS = new VisualExplorationErrorCode(116);
    public static final /* enum */ VisualExplorationErrorCode EPHEMERIS_NOT_VALID = new VisualExplorationErrorCode(117);
    public static final /* enum */ VisualExplorationErrorCode OBS_SAT_SNR_LOW = new VisualExplorationErrorCode(118);
    public static final /* enum */ VisualExplorationErrorCode OBS_SAT_FREQUENT_CYCLE_SLIP = new VisualExplorationErrorCode(119);
    public static final /* enum */ VisualExplorationErrorCode OBS_SAT_NUM_INSUFFICIENT = new VisualExplorationErrorCode(120);
    public static final /* enum */ VisualExplorationErrorCode OBS_MIN_SAT_NUM_LESS = new VisualExplorationErrorCode(121);
    public static final /* enum */ VisualExplorationErrorCode RTK_POS_TYPE_INVALID = new VisualExplorationErrorCode(122);
    public static final /* enum */ VisualExplorationErrorCode GNSS_INIT_ERROR = new VisualExplorationErrorCode(123);
    public static final /* enum */ VisualExplorationErrorCode GNSS_GET_RESULT_ERROR = new VisualExplorationErrorCode(124);
    public static final /* enum */ VisualExplorationErrorCode GNSS_TIMEOUT = new VisualExplorationErrorCode(125);
    public static final /* enum */ VisualExplorationErrorCode TRANSFER_HEIGHT_ERROR = new VisualExplorationErrorCode(128);
    public static final /* enum */ VisualExplorationErrorCode TRANSFER_HEIGHT_LIMIT = new VisualExplorationErrorCode(129);
    public static final /* enum */ VisualExplorationErrorCode TRANSFER_TIMEOUT = new VisualExplorationErrorCode(130);
    public static final /* enum */ VisualExplorationErrorCode TRANSFER_GNSS_TIME_OUT = new VisualExplorationErrorCode(131);
    public static final /* enum */ VisualExplorationErrorCode ASSESS_RESULT_UNAVAILABLE_VE = new VisualExplorationErrorCode(153);
    public static final /* enum */ VisualExplorationErrorCode MISSION_SWITCH_ERROR_VE = new VisualExplorationErrorCode(155);
    public static final /* enum */ VisualExplorationErrorCode DEPARTURE_FAIL_VE = new VisualExplorationErrorCode(160);
    public static final /* enum */ VisualExplorationErrorCode DEPARTURE_INIT_FAIL_VE = new VisualExplorationErrorCode(161);
    public static final /* enum */ VisualExplorationErrorCode DEPARTURE_INVALID_VE = new VisualExplorationErrorCode(162);
    public static final /* enum */ VisualExplorationErrorCode DEPARTURE_TARGET_NOT_REACHABLE_VE = new VisualExplorationErrorCode(163);
    public static final /* enum */ VisualExplorationErrorCode DEPARTURE_PLANNING_FAIL_VE = new VisualExplorationErrorCode(164);
    public static final /* enum */ VisualExplorationErrorCode DEPARTURE_POS_VERT_ERROR_VE = new VisualExplorationErrorCode(165);
    public static final /* enum */ VisualExplorationErrorCode DEPARTURE_POS_HORIZ_ERROR_VE = new VisualExplorationErrorCode(166);
    public static final /* enum */ VisualExplorationErrorCode DEPARTURE_RC_MODE_ERROR_VE = new VisualExplorationErrorCode(167);
    public static final /* enum */ VisualExplorationErrorCode RADIUS_LIMIT_VE = new VisualExplorationErrorCode(176);
    public static final /* enum */ VisualExplorationErrorCode VFENCE_LIMIT_VE = new VisualExplorationErrorCode(177);
    public static final /* enum */ VisualExplorationErrorCode HOME_NOT_SET_VE = new VisualExplorationErrorCode(178);
    public static final /* enum */ VisualExplorationErrorCode LOW_LIMIT_VE = new VisualExplorationErrorCode(179);
    public static final /* enum */ VisualExplorationErrorCode ATTI_MODE_VE = new VisualExplorationErrorCode(180);
    public static final /* enum */ VisualExplorationErrorCode UNKNOWN = new VisualExplorationErrorCode(65535);
    private int value;
    private static final VisualExplorationErrorCode[] allValues;
    private static final /* synthetic */ VisualExplorationErrorCode[] $VALUES;

    public static VisualExplorationErrorCode[] values() {
        return null;
    }

    public static VisualExplorationErrorCode valueOf(String string) {
        return null;
    }

    private VisualExplorationErrorCode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VisualExplorationErrorCode find(int n) {
        return null;
    }

    private static /* synthetic */ VisualExplorationErrorCode[] $values() {
        return null;
    }

    static {
        $VALUES = VisualExplorationErrorCode.$values();
        allValues = VisualExplorationErrorCode.values();
    }
}

