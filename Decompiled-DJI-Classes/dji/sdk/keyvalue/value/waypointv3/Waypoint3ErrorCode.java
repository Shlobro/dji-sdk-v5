/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.waypointv3;

import dji.jni.JNIProguardKeepTag;

public final class Waypoint3ErrorCode
extends Enum<Waypoint3ErrorCode>
implements JNIProguardKeepTag {
    public static final /* enum */ Waypoint3ErrorCode FILE_TRANSFER_FAIL = new Waypoint3ErrorCode(-19);
    public static final /* enum */ Waypoint3ErrorCode SDR_CHANGE_FAIL = new Waypoint3ErrorCode(-18);
    public static final /* enum */ Waypoint3ErrorCode LOCK_MOTOR_RECOVERY_FAIL = new Waypoint3ErrorCode(-17);
    public static final /* enum */ Waypoint3ErrorCode LOCK_MOTOR_FAIL = new Waypoint3ErrorCode(-16);
    public static final /* enum */ Waypoint3ErrorCode UPLOAD_CANCEL_BY_USER = new Waypoint3ErrorCode(-15);
    public static final /* enum */ Waypoint3ErrorCode MOTOR_STATE_ERROR = new Waypoint3ErrorCode(-14);
    public static final /* enum */ Waypoint3ErrorCode PRECISE_FILE_MD5_CHECK_FAIL = new Waypoint3ErrorCode(-13);
    public static final /* enum */ Waypoint3ErrorCode FILE_NOT_EXIST = new Waypoint3ErrorCode(-12);
    public static final /* enum */ Waypoint3ErrorCode CANT_EXCUTE_IN_CURRENT_STATUS = new Waypoint3ErrorCode(-11);
    public static final /* enum */ Waypoint3ErrorCode QUERY_EXCUTION_STATUS_INVALID = new Waypoint3ErrorCode(-10);
    public static final /* enum */ Waypoint3ErrorCode QUERY_NO_THIS_BREAK_POINT = new Waypoint3ErrorCode(-9);
    public static final /* enum */ Waypoint3ErrorCode QUERY_NO_THIS_MISSION = new Waypoint3ErrorCode(-8);
    public static final /* enum */ Waypoint3ErrorCode PARSE_RETURN_PACK_FAILED = new Waypoint3ErrorCode(-7);
    public static final /* enum */ Waypoint3ErrorCode INVALID_PARAM = new Waypoint3ErrorCode(-6);
    public static final /* enum */ Waypoint3ErrorCode SEND_PACK_TIMEOUT = new Waypoint3ErrorCode(-5);
    public static final /* enum */ Waypoint3ErrorCode SEND_PACK_FAILED = new Waypoint3ErrorCode(-4);
    public static final /* enum */ Waypoint3ErrorCode SYSTEM_ERROR = new Waypoint3ErrorCode(-3);
    public static final /* enum */ Waypoint3ErrorCode UPLOAD_FILE_FAILED = new Waypoint3ErrorCode(-2);
    public static final /* enum */ Waypoint3ErrorCode REQUEST_HANDLER_NOT_FOUND = new Waypoint3ErrorCode(-1);
    public static final /* enum */ Waypoint3ErrorCode NO_ERROR = new Waypoint3ErrorCode(0);
    public static final /* enum */ Waypoint3ErrorCode MISSION_ID_NOT_EXIST = new Waypoint3ErrorCode(1);
    public static final /* enum */ Waypoint3ErrorCode WAYLINE_INFO_ERROR = new Waypoint3ErrorCode(2);
    public static final /* enum */ Waypoint3ErrorCode WPMZ_FILE_VERSION_NOT_MATCH = new Waypoint3ErrorCode(3);
    public static final /* enum */ Waypoint3ErrorCode WPMZ_FILE_LOAD_ERROR = new Waypoint3ErrorCode(4);
    public static final /* enum */ Waypoint3ErrorCode NO_BREAK_INFO = new Waypoint3ErrorCode(5);
    public static final /* enum */ Waypoint3ErrorCode CMD_INVALID = new Waypoint3ErrorCode(6);
    public static final /* enum */ Waypoint3ErrorCode CANNOT_START_WAYLINE_WHEN_WAYLINE_RUNNING = new Waypoint3ErrorCode(257);
    public static final /* enum */ Waypoint3ErrorCode CANNOT_BREAK_WAYLINE_IN_CUR_STATE = new Waypoint3ErrorCode(258);
    public static final /* enum */ Waypoint3ErrorCode CANNOT_STOP_WAYLINE_WHEN_WAYLINE_NOT_RUNNING = new Waypoint3ErrorCode(259);
    public static final /* enum */ Waypoint3ErrorCode CANNOT_BREAK_WAYLINE_WHEN_WAYLINE_NOT_RUNNING = new Waypoint3ErrorCode(260);
    public static final /* enum */ Waypoint3ErrorCode CANNOT_REQUEST_DRONE_CONTROL = new Waypoint3ErrorCode(261);
    public static final /* enum */ Waypoint3ErrorCode CANNOT_RESUME_WAYLINE_IN_CUR_STATE = new Waypoint3ErrorCode(262);
    public static final /* enum */ Waypoint3ErrorCode CANNOT_TAKEOFF_ON_SHIP = new Waypoint3ErrorCode(263);
    public static final /* enum */ Waypoint3ErrorCode HEIGHT_LIMIT = new Waypoint3ErrorCode(513);
    public static final /* enum */ Waypoint3ErrorCode RADIUS_LIMIT = new Waypoint3ErrorCode(514);
    public static final /* enum */ Waypoint3ErrorCode CROSS_FLYLIMIT_AERA = new Waypoint3ErrorCode(515);
    public static final /* enum */ Waypoint3ErrorCode LOW_LIMIT = new Waypoint3ErrorCode(516);
    public static final /* enum */ Waypoint3ErrorCode OBSTACAL_STOP = new Waypoint3ErrorCode(517);
    public static final /* enum */ Waypoint3ErrorCode RTK_DISCONNECT = new Waypoint3ErrorCode(518);
    public static final /* enum */ Waypoint3ErrorCode BOUNDARY_LIMIT = new Waypoint3ErrorCode(519);
    public static final /* enum */ Waypoint3ErrorCode RC_PITCH_ROLL_BREAK = new Waypoint3ErrorCode(520);
    public static final /* enum */ Waypoint3ErrorCode AIRPORT_HEIGHT_LIMIT = new Waypoint3ErrorCode(521);
    public static final /* enum */ Waypoint3ErrorCode REQUEST_TAKEOFF_FAIL = new Waypoint3ErrorCode(522);
    public static final /* enum */ Waypoint3ErrorCode AUTOTAKEOFF_RUN_FAIL = new Waypoint3ErrorCode(523);
    public static final /* enum */ Waypoint3ErrorCode REQUEST_WAYLINE_FAIL = new Waypoint3ErrorCode(524);
    public static final /* enum */ Waypoint3ErrorCode AGRO_PLAN_FAIL = new Waypoint3ErrorCode(525);
    public static final /* enum */ Waypoint3ErrorCode REQUEST_QUICK_TAKEOFF_ASSIST_FAIL = new Waypoint3ErrorCode(526);
    public static final /* enum */ Waypoint3ErrorCode QUICK_TAKEOFF_ASSIST_RUN_FAIL = new Waypoint3ErrorCode(527);
    public static final /* enum */ Waypoint3ErrorCode VFENCE_LIMIT = new Waypoint3ErrorCode(528);
    public static final /* enum */ Waypoint3ErrorCode TARGET_POINT_UNREACHABLE = new Waypoint3ErrorCode(529);
    public static final /* enum */ Waypoint3ErrorCode ROUTE_PLANNING_FAILED = new Waypoint3ErrorCode(530);
    public static final /* enum */ Waypoint3ErrorCode GPS_INVALID = new Waypoint3ErrorCode(769);
    public static final /* enum */ Waypoint3ErrorCode CANNOT_START_AT_CURRENT_RC_MODE = new Waypoint3ErrorCode(770);
    public static final /* enum */ Waypoint3ErrorCode HOME_POINT_NOT_RECORDED = new Waypoint3ErrorCode(771);
    public static final /* enum */ Waypoint3ErrorCode LOWER_BATTERY = new Waypoint3ErrorCode(772);
    public static final /* enum */ Waypoint3ErrorCode RETURN_HOME = new Waypoint3ErrorCode(773);
    public static final /* enum */ Waypoint3ErrorCode ADSB_ERROR = new Waypoint3ErrorCode(774);
    public static final /* enum */ Waypoint3ErrorCode RC_LOST = new Waypoint3ErrorCode(775);
    public static final /* enum */ Waypoint3ErrorCode RTK_NOT_READY = new Waypoint3ErrorCode(776);
    public static final /* enum */ Waypoint3ErrorCode DRONE_IS_MOVING = new Waypoint3ErrorCode(777);
    public static final /* enum */ Waypoint3ErrorCode DRONE_ON_GROUND_MOTOR_ON = new Waypoint3ErrorCode(778);
    public static final /* enum */ Waypoint3ErrorCode SURFACE_FOLLOW_CAMERA_INVALID = new Waypoint3ErrorCode(779);
    public static final /* enum */ Waypoint3ErrorCode SURFACE_FOLLOW_HEIGHT_INVALID = new Waypoint3ErrorCode(780);
    public static final /* enum */ Waypoint3ErrorCode SURFACE_FOLLOW_MAP_WRONG = new Waypoint3ErrorCode(781);
    public static final /* enum */ Waypoint3ErrorCode HOMEPOINT_NOT_MATCH_RTK = new Waypoint3ErrorCode(782);
    public static final /* enum */ Waypoint3ErrorCode STRONG_WIND_GOHOME = new Waypoint3ErrorCode(784);
    public static final /* enum */ Waypoint3ErrorCode HEADING_LEVEL_POOR = new Waypoint3ErrorCode(787);
    public static final /* enum */ Waypoint3ErrorCode WIND_SPD = new Waypoint3ErrorCode(789);
    public static final /* enum */ Waypoint3ErrorCode CANNOT_FIND_PAYLOAD = new Waypoint3ErrorCode(1025);
    public static final /* enum */ Waypoint3ErrorCode ACTION_EXECUTION_FAILED = new Waypoint3ErrorCode(1026);
    public static final /* enum */ Waypoint3ErrorCode USER_EXIT = new Waypoint3ErrorCode(1281);
    public static final /* enum */ Waypoint3ErrorCode USER_BREAK = new Waypoint3ErrorCode(1282);
    public static final /* enum */ Waypoint3ErrorCode USER_SET_GOHOME = new Waypoint3ErrorCode(1283);
    public static final /* enum */ Waypoint3ErrorCode TRAJ_INIT_FAIL = new Waypoint3ErrorCode(1536);
    public static final /* enum */ Waypoint3ErrorCode TRAJ_JOB_EXIT_BUT_MIS_RUNNING = new Waypoint3ErrorCode(1537);
    public static final /* enum */ Waypoint3ErrorCode TRAJ_ON_GROUND_MOTOR_ON_CANNOT_GO = new Waypoint3ErrorCode(1538);
    public static final /* enum */ Waypoint3ErrorCode TRAJ_INVALID_START_INDEX_OR_PROG = new Waypoint3ErrorCode(1539);
    public static final /* enum */ Waypoint3ErrorCode TRAJ_INVALID_CSYS_MODE = new Waypoint3ErrorCode(1540);
    public static final /* enum */ Waypoint3ErrorCode TRAJ_INVALID_HEIGHT_MODE = new Waypoint3ErrorCode(1541);
    public static final /* enum */ Waypoint3ErrorCode TRAJ_INVALID_FLY_WP_MODE = new Waypoint3ErrorCode(1542);
    public static final /* enum */ Waypoint3ErrorCode TRAJ_INVALID_YAW_MODE = new Waypoint3ErrorCode(1543);
    public static final /* enum */ Waypoint3ErrorCode TRAJ_INVALID_TURN_DIR_MODE = new Waypoint3ErrorCode(1544);
    public static final /* enum */ Waypoint3ErrorCode TRAJ_INVALID_WP_TYPE = new Waypoint3ErrorCode(1545);
    public static final /* enum */ Waypoint3ErrorCode TRAJ_FIR_LAS_WP_TYPE_ERROR = new Waypoint3ErrorCode(1546);
    public static final /* enum */ Waypoint3ErrorCode TRAJ_GLOB_VEL_OUT_OF_RANGE = new Waypoint3ErrorCode(1547);
    public static final /* enum */ Waypoint3ErrorCode TRAJ_WP_NUM_OUT_OF_RANGE = new Waypoint3ErrorCode(1548);
    public static final /* enum */ Waypoint3ErrorCode TRAJ_LAT_LONG_OUT_OF_RANGE = new Waypoint3ErrorCode(1549);
    public static final /* enum */ Waypoint3ErrorCode TRAJ_DAMP_DIS_OUT_OF_RANGE = new Waypoint3ErrorCode(1550);
    public static final /* enum */ Waypoint3ErrorCode TRAJ_MAX_VEL_OUT_OF_RANGE = new Waypoint3ErrorCode(1551);
    public static final /* enum */ Waypoint3ErrorCode TRAJ_VEL_OUT_OF_RANGE = new Waypoint3ErrorCode(1552);
    public static final /* enum */ Waypoint3ErrorCode TRAJ_WP_YAW_OUT_OF_RANGE = new Waypoint3ErrorCode(1553);
    public static final /* enum */ Waypoint3ErrorCode TRAJ_INVALID_YAW_MODE_IN_VERT_SEGM = new Waypoint3ErrorCode(1554);
    public static final /* enum */ Waypoint3ErrorCode TRAJ_WP_BREAK_INFO_MISSION_ID_CHANGED = new Waypoint3ErrorCode(1555);
    public static final /* enum */ Waypoint3ErrorCode TRAJ_WP_BREAK_INFO_PROGRESS_OUT_OF_RANGE = new Waypoint3ErrorCode(1556);
    public static final /* enum */ Waypoint3ErrorCode TRAJ_WP_BREAK_INFO_INVALID_MISSION_STATE = new Waypoint3ErrorCode(1557);
    public static final /* enum */ Waypoint3ErrorCode TRAJ_WP_BREAK_INFO_WP_INDEX_OUT_OF_RANGE = new Waypoint3ErrorCode(1558);
    public static final /* enum */ Waypoint3ErrorCode TRAJ_BREAK_LAT_LONG_OUT_OF_RANGE = new Waypoint3ErrorCode(1559);
    public static final /* enum */ Waypoint3ErrorCode TRAJ_BREAK_INFO_WP_YAW_OUT_OF_RANGE = new Waypoint3ErrorCode(1560);
    public static final /* enum */ Waypoint3ErrorCode TRAJ_INVALID_BREAK_INFO_FLAG = new Waypoint3ErrorCode(1561);
    public static final /* enum */ Waypoint3ErrorCode TRAJ_GET_TRAJ_INFO_FAILED = new Waypoint3ErrorCode(1562);
    public static final /* enum */ Waypoint3ErrorCode TRAJ_GENERATE_FAIL = new Waypoint3ErrorCode(1563);
    public static final /* enum */ Waypoint3ErrorCode TRAJ_LIB_RUN_FAIL = new Waypoint3ErrorCode(1564);
    public static final /* enum */ Waypoint3ErrorCode TRAJ_LIB_EMERGENCY_BRAKE = new Waypoint3ErrorCode(1565);
    public static final /* enum */ Waypoint3ErrorCode ACTION_COMMON_ACTION_NOT_FOUND = new Waypoint3ErrorCode(1588);
    public static final /* enum */ Waypoint3ErrorCode ACTION_COMMON_ACTION_INDEX_REPEATED = new Waypoint3ErrorCode(1591);
    public static final /* enum */ Waypoint3ErrorCode ACTION_COMMON_ACTION_INFO_SIZE_TOO_LONG_OR_TOO_SHORT = new Waypoint3ErrorCode(1592);
    public static final /* enum */ Waypoint3ErrorCode ACTION_COMMON_ACTION_TREE_EMPTY = new Waypoint3ErrorCode(1593);
    public static final /* enum */ Waypoint3ErrorCode ACTION_COMMON_ACTION_TREE_LAYER_EMPTY = new Waypoint3ErrorCode(1594);
    public static final /* enum */ Waypoint3ErrorCode ACTION_COMMON_ACTION_ID_REPEATED = new Waypoint3ErrorCode(1595);
    public static final /* enum */ Waypoint3ErrorCode ACTION_COMMON_ACTION_NODE_CHILDREN_NUM_LT_2 = new Waypoint3ErrorCode(1596);
    public static final /* enum */ Waypoint3ErrorCode ACTION_COMMON_ACTION_INDEX_OUT_OF_RANGE = new Waypoint3ErrorCode(1597);
    public static final /* enum */ Waypoint3ErrorCode ACTION_COMMON_ACTION_ID_IS_65535 = new Waypoint3ErrorCode(1598);
    public static final /* enum */ Waypoint3ErrorCode ACTION_COMMON_ACTION_NODE_CHILDNUM_SUM_NOT_EQ_NEXT_LAYER_SIZE = new Waypoint3ErrorCode(1599);
    public static final /* enum */ Waypoint3ErrorCode ACTION_COMMON_ACTION_TREE_LAYER_NUM_TOO_MORE = new Waypoint3ErrorCode(1600);
    public static final /* enum */ Waypoint3ErrorCode ACTION_COMMON_ACTION_TREE_LAYER_NUM_TOO_LESS = new Waypoint3ErrorCode(1601);
    public static final /* enum */ Waypoint3ErrorCode ACTION_COMMON_ACTION_GROUP_NUM_OUT_OF_RANGE = new Waypoint3ErrorCode(1602);
    public static final /* enum */ Waypoint3ErrorCode ACTION_COMMON_ACTION_GROUP_VALID_RANGE_ERROR = new Waypoint3ErrorCode(1603);
    public static final /* enum */ Waypoint3ErrorCode ACTION_COMMON_ACTION_TREE_ROOT_STATUS_INVALID = new Waypoint3ErrorCode(1604);
    public static final /* enum */ Waypoint3ErrorCode ACTION_COMMON_ACTION_TREE_NODE_STATUS_INVALID = new Waypoint3ErrorCode(1605);
    public static final /* enum */ Waypoint3ErrorCode ACTION_COMMON_BREAK_INFO_ACTION_GROUP_ID_OUT_OF_RANGE = new Waypoint3ErrorCode(1606);
    public static final /* enum */ Waypoint3ErrorCode ACTION_COMMON_ACTION_STATUS_TREE_SIZE_ERROR = new Waypoint3ErrorCode(1607);
    public static final /* enum */ Waypoint3ErrorCode ACTION_COMMON_BREAK_INFO_TRIGGER_RUN_RESULT_INVALID = new Waypoint3ErrorCode(1608);
    public static final /* enum */ Waypoint3ErrorCode ACTION_COMMON_BREAK_INFO_ACTION_GROUP_ID_REPEATED = new Waypoint3ErrorCode(1609);
    public static final /* enum */ Waypoint3ErrorCode ACTION_COMMON_BREAK_INFO_ACTION_LOCATION_REPEATED = new Waypoint3ErrorCode(1610);
    public static final /* enum */ Waypoint3ErrorCode ACTION_COMMON_BREAK_INFO_ACTION_LOCATION_OUT_OF_RANGE = new Waypoint3ErrorCode(1611);
    public static final /* enum */ Waypoint3ErrorCode ACTION_COMMON_RESUME_ID_NOT_IN_BREAK_INFO = new Waypoint3ErrorCode(1612);
    public static final /* enum */ Waypoint3ErrorCode ACTION_COMMON_RESUME_INFO_MODIFY_ACTION_STATUS_FROM_NO_INTERRUPT_TO_INTERRUPT = new Waypoint3ErrorCode(1613);
    public static final /* enum */ Waypoint3ErrorCode ACTION_COMMON_ACTION_RESUME_FAIL_FOR_INVALID_RESUME_INFO = new Waypoint3ErrorCode(1614);
    public static final /* enum */ Waypoint3ErrorCode ACTUATOR_COMMON_ACTUATOR_NOT_FOUND = new Waypoint3ErrorCode(1634);
    public static final /* enum */ Waypoint3ErrorCode TRIGGER_SINGLE_TIME_CHECK_FAIL = new Waypoint3ErrorCode(1650);
    public static final /* enum */ Waypoint3ErrorCode TRIGGER_NOT_FOUND = new Waypoint3ErrorCode(26225);
    public static final /* enum */ Waypoint3ErrorCode UNKNOWN = new Waypoint3ErrorCode(65535);
    private int value;
    private static final Waypoint3ErrorCode[] allValues;
    private static final /* synthetic */ Waypoint3ErrorCode[] $VALUES;

    public static Waypoint3ErrorCode[] values() {
        return null;
    }

    public static Waypoint3ErrorCode valueOf(String string) {
        return null;
    }

    private Waypoint3ErrorCode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static Waypoint3ErrorCode find(int n) {
        return null;
    }

    private static /* synthetic */ Waypoint3ErrorCode[] $values() {
        return null;
    }

    static {
        $VALUES = Waypoint3ErrorCode.$values();
        allValues = Waypoint3ErrorCode.values();
    }
}

