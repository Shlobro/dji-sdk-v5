/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dji.v5.core.R$string
 */
package dji.v5.common.error;

import dji.v5.common.error.ErrorType;
import dji.v5.common.error.IErrorFactory;
import dji.v5.core.R;

public class DJIWaypointMissionError
extends IErrorFactory.DefaultErrorFactory {
    public static final String UPLOAD_FILE_FAILED = "UPLOAD_FILE_FAILED";
    public static final String GPS_INVALID = "GPS_INVALID";
    public static final String MISSION_ID_NOT_EXIST = "MISSION_ID_NOT_EXIST";
    public static final String OBSTACAL_STOP = "OBSTACAL_STOP";
    public static final String HEIGHT_LIMIT = "HEIGHT_LIMIT";
    public static final String LOW_LIMIT = "LOW_LIMIT";
    public static final String LOWER_BATTERY = "LOWER_BATTERY";
    public static final String WPMZ_FILE_LOAD_ERROR = "WPMZ_FILE_LOAD_ERROR";
    public static final String CANNOT_STOP_WAYLINE_WHEN_WAYLINE_NOT_RUNNING = "CANNOT_STOP_WAYLINE_WHEN_WAYLINE_NOT_RUNNING";
    public static final String CANNOT_BREAK_WAYLINE_IN_CUR_STATE = "CANNOT_BREAK_WAYLINE_IN_CUR_STATE";
    public static final String CANNOT_START_WAYLINE_WHEN_WAYLINE_RUNNING = "CANNOT_START_WAYLINE_WHEN_WAYLINE_RUNNING";
    public static final String FILE_TRANSFER_FAIL = "FILE_TRANSFER_FAIL";
    public static final String SDR_CHANGE_FAIL = "SDR_CHANGE_FAIL";
    public static final String UPLOAD_PRECICSE_MISSION_FAIL = "UPLOAD_PRECICSE_MISSION_FAIL";
    public static final String LOCK_MOTOR_RECOVERY_FAIL = "LOCK_MOTOR_RECOVERY_FAIL";
    public static final String LOCK_MOTOR_FAIL = "LOCK_MOTOR_FAIL";
    public static final String UPLOAD_CANCEL_BY_USER = "UPLOAD_CANCEL_BY_USER";
    public static final String MOTOR_STATE_ERROR = "MOTOR_STATE_ERROR";
    public static final String PRECISE_FILE_MD5_CHECK_FAIL = "PRECISE_FILE_MD5_CHECK_FAIL";
    public static final String FILE_NOT_EXIST = "FILE_NOT_EXIST";
    public static final String CANT_EXCUTE_IN_CURRENT_STATUS = "CANT_EXCUTE_IN_CURRENT_STATUS";
    public static final String PARSE_RETURN_PACK_FAILED = "PARSE_RETURN_PACK_FAILED";
    public static final String INVALID_PARAM = "INVALID_PARAM";
    public static final String SEND_PACK_TIMEOUT = "SEND_PACK_TIMEOUT";
    public static final String SEND_PACK_FAILED = "SEND_PACK_FAILED";
    public static final String SYSTEM_ERROR = "SYSTEM_ERROR";
    public static final String WAYLINE_INFO_ERROR = "WAYLINE_INFO_ERROR";
    public static final String NO_BREAK_INFO = "NO_BREAK_INFO";
    public static final String CMD_INVALID = "CMD_INVALID";
    public static final String RADIUS_LIMIT = "RADIUS_LIMIT";
    public static final String CANNOT_START_AT_CURRENT_RC_MODE = "CANNOT_START_AT_CURRENT_RC_MODE";
    public static final String HOME_POINT_NOT_RECORDED = "HOME_POINT_NOT_RECORDED";
    public static final String RTK_NOT_READY = "RTK_NOT_READY";
    public static final String DRONE_CRITICAL_ERROR = "DRONE_CRITICAL_ERROR";
    public static final String MISSION_INVALID_FILE_NAME = "START_MISSION_INVALID_FILE_NAME";
    public static final String GENERATE_MISSION_FILE_FAILED = "GENERATE_MISSION_FILE_FAILED";
    public static final String WAYPOINT_METHOD_NOT_SUPPORT = "WAYPOINT_METHOD_NOT_SUPPORT";
    public static final String RETURN_HOME = "RETURN_HOME";
    public static final String CANNOT_START_TASK_ON_WEAK_GPS = "CANNOT_START_TASK_ON_WEAK_GPS";
    public static final String SURFACE_FOLLOW_CAMERA_INVALID = "SURFACE_FOLLOW_CAMERA_INVALID";
    public static final String DRONE_ON_GROUND_MOTOR_ON = "DRONE_ON_GROUND_MOTOR_ON";
    public static final String TRAJ_MAX_VEL_OUT_OF_RANGE = "TRAJ_MAX_VEL_OUT_OF_RANGE";
    public static final String TRAJ_VEL_OUT_OF_RANGE = "TRAJ_VEL_OUT_OF_RANGE";
    public static final String TRAJ_INIT_FAIL = "TRAJ_INIT_FAIL";
    public static final String TRAJ_ON_GROUND_MOTOR_ON_CANNOT_GO = "TRAJ_ON_GROUND_MOTOR_ON_CANNOT_GO";
    public static final String TRAJ_INVALID_START_INDEX_OR_PROG = "TRAJ_INVALID_START_INDEX_OR_PROG";
    public static final String TRAJ_INVALID_CSYS_MODE = "TRAJ_INVALID_CSYS_MODE";
    public static final String TRAJ_INVALID_HEIGHT_MODE = "TRAJ_INVALID_HEIGHT_MODE";
    public static final String TRAJ_INVALID_FLY_WP_MODE = "TRAJ_INVALID_FLY_WP_MODE";
    public static final String TRAJ_INVALID_YAW_MODE = "TRAJ_INVALID_YAW_MODE";
    public static final String TRAJ_INVALID_TURN_DIR_MODE = "TRAJ_INVALID_TURN_DIR_MODE";
    public static final String TRAJ_INVALID_WP_TYPE = "TRAJ_INVALID_WP_TYPE";
    public static final String TRAJ_FIR_LAS_WP_TYPE_ERROR = "TRAJ_FIR_LAS_WP_TYPE_ERROR";
    public static final String TRAJ_GLOB_VEL_OUT_OF_RANGE = "TRAJ_GLOB_VEL_OUT_OF_RANGE";
    public static final String TRAJ_WP_NUM_OUT_OF_RANGE = "TRAJ_WP_NUM_OUT_OF_RANGE";
    public static final String TRAJ_LAT_LONG_OUT_OF_RANGE = "TRAJ_LAT_LONG_OUT_OF_RANGE";
    public static final String TRAJ_DAMP_DIS_OUT_OF_RANGE = "TRAJ_DAMP_DIS_OUT_OF_RANGE";
    public static final String TRAJ_WP_YAW_OUT_OF_RANGE = "TRAJ_WP_YAW_OUT_OF_RANGE";
    public static final String NOT_IN_NORMAL_MODE = "NOT_IN_NORMAL_MODE";
    public static final String UNKNOWN = "UNKNOWN";
    public static final DJIWaypointMissionError FACTORY = new DJIWaypointMissionError();

    @Override
    public IErrorFactory.InnerError findInnerError(String string2) {
        return null;
    }

    @Override
    public ErrorType errorType() {
        return null;
    }

    private static final class Error
    extends Enum<Error>
    implements IErrorFactory.InnerError {
        public static final /* enum */ Error FILE_TRANSFER_FAIL = new Error("FILE_TRANSFER_FAIL", R.string.mission_upload_trans_failed_tip);
        public static final /* enum */ Error SDR_CHANGE_FAIL = new Error("SDR_CHANGE_FAIL", R.string.mission_upload_reconfig_failed_tip);
        public static final /* enum */ Error UPLOAD_PRECICSE_MISSION_FAIL = new Error("UPLOAD_PRECICSE_MISSION_FAIL", R.string.mission_upload_precise_failed_tip);
        public static final /* enum */ Error LOCK_MOTOR_RECOVERY_FAIL = new Error("LOCK_MOTOR_RECOVERY_FAIL", R.string.mission_lock_motor_recover_failed_tip);
        public static final /* enum */ Error LOCK_MOTOR_FAIL = new Error("LOCK_MOTOR_FAIL", R.string.mission_lock_motor_failed_tip);
        public static final /* enum */ Error UPLOAD_CANCEL_BY_USER = new Error("UPLOAD_CANCEL_BY_USER", R.string.mission_upload_cancel_failed_tip);
        public static final /* enum */ Error MOTOR_STATE_ERROR = new Error("MOTOR_STATE_ERROR", R.string.mission_upload_motor_is_on_failed_tip);
        public static final /* enum */ Error PRECISE_FILE_MD5_CHECK_FAIL = new Error("PRECISE_FILE_MD5_CHECK_FAIL", R.string.mission_upload_md5_dismatch_tip);
        public static final /* enum */ Error FILE_NOT_EXIST = new Error("FILE_NOT_EXIST", R.string.mission_upload_file_missing_tip);
        public static final /* enum */ Error CANT_EXCUTE_IN_CURRENT_STATUS = new Error("CANT_EXCUTE_IN_CURRENT_STATUS", R.string.mission_wrong_status_tip);
        public static final /* enum */ Error PARSE_RETURN_PACK_FAILED = new Error("PARSE_RETURN_PACK_FAILED", R.string.mission_parsing_error_tip);
        public static final /* enum */ Error INVALID_PARAM = new Error("INVALID_PARAM", R.string.mission_invaild_parameter_tip);
        public static final /* enum */ Error SEND_PACK_TIMEOUT = new Error("SEND_PACK_TIMEOUT", R.string.mission_command_timeout_tip);
        public static final /* enum */ Error SEND_PACK_FAILED = new Error("SEND_PACK_FAILED", R.string.mission_command_failed_tip);
        public static final /* enum */ Error SYSTEM_ERROR = new Error("SYSTEM_ERROR", R.string.mission_system_error_tip);
        public static final /* enum */ Error WAYLINE_INFO_ERROR = new Error("WAYLINE_INFO_ERROR", R.string.mission_wayline_info_error_tip);
        public static final /* enum */ Error NO_BREAK_INFO = new Error("NO_BREAK_INFO", R.string.mission_null_break_point_tip);
        public static final /* enum */ Error CMD_INVALID = new Error("CMD_INVALID", R.string.mission_invalid_command_tip);
        public static final /* enum */ Error RADIUS_LIMIT = new Error("RADIUS_LIMIT", R.string.mission_start_failedradius_limit_tip);
        public static final /* enum */ Error CANNOT_START_AT_CURRENT_RC_MODE = new Error("CANNOT_START_AT_CURRENT_RC_MODE", R.string.mission_start_failed_rc_mode_tip);
        public static final /* enum */ Error HOME_POINT_NOT_RECORDED = new Error("HOME_POINT_NOT_RECORDED", R.string.mission_start_failed_null_homepoint_tip);
        public static final /* enum */ Error RTK_NOT_READY = new Error("RTK_NOT_READY", R.string.mission_start_failed_rtK_unready_tip);
        public static final /* enum */ Error DRONE_CRITICAL_ERROR = new Error("DRONE_CRITICAL_ERROR", R.string.mission_start_failed_motor_on_groud_tip);
        public static final /* enum */ Error MISSION_INVALID_FILE_NAME = new Error("START_MISSION_INVALID_FILE_NAME", R.string.mission_start_invalid_file_name);
        public static final /* enum */ Error GENERATE_MISSION_FILE_FAILED = new Error("GENERATE_MISSION_FILE_FAILED", R.string.mission_file_generate_failed);
        public static final /* enum */ Error UPLOAD_FILE_FAILED = new Error("UPLOAD_FILE_FAILED", R.string.dji_msdk_error_waypoint_upload_file_failed);
        public static final /* enum */ Error GPS_INVALID = new Error("GPS_INVALID", R.string.dji_msdk_error_waypoint_gps_invalid);
        public static final /* enum */ Error MISSION_ID_NOT_EXIST = new Error("MISSION_ID_NOT_EXIST", R.string.dji_msdk_error_waypoint_mission_id_not_exist);
        public static final /* enum */ Error OBSTACAL_STOP = new Error("OBSTACAL_STOP", R.string.dji_msdk_error_waypoint_obstacle_stop);
        public static final /* enum */ Error HEIGHT_LIMIT = new Error("HEIGHT_LIMIT", R.string.dji_msdk_error_waypoint_height_limit);
        public static final /* enum */ Error LOW_LIMIT = new Error("LOW_LIMIT", R.string.dji_msdk_error_waypoint_low_limit);
        public static final /* enum */ Error LOWER_BATTERY = new Error("LOWER_BATTERY", R.string.dji_msdk_error_waypoint_battery_low);
        public static final /* enum */ Error WPMZ_FILE_LOAD_ERROR = new Error("WPMZ_FILE_LOAD_ERROR", R.string.dji_msdk_error_waypoint_file_load_error);
        public static final /* enum */ Error CANNOT_STOP_WAYLINE_WHEN_WAYLINE_NOT_RUNNING = new Error("CANNOT_STOP_WAYLINE_WHEN_WAYLINE_NOT_RUNNING", R.string.dji_msdk_error_waypoint_can_not_stop_when_running);
        public static final /* enum */ Error CANNOT_BREAK_WAYLINE_IN_CUR_STATE = new Error("CANNOT_BREAK_WAYLINE_IN_CUR_STATE", R.string.dji_msdk_error_waypoint_can_not_break_in_cur_state);
        public static final /* enum */ Error CANNOT_START_WAYLINE_WHEN_WAYLINE_RUNNING = new Error("CANNOT_START_WAYLINE_WHEN_WAYLINE_RUNNING", R.string.dji_msdk_error_waypoint_can_not_start_in_wayline_running);
        public static final /* enum */ Error WAYPOINT_METHOD_NOT_SUPPORT = new Error("WAYPOINT_METHOD_NOT_SUPPORT", R.string.dji_msdk_error_common_unsupported);
        public static final /* enum */ Error RETURN_HOME = new Error("RETURN_HOME", R.string.mission_start_failed_return_home);
        public static final /* enum */ Error CANNOT_START_TASK_ON_WEAK_GPS = new Error("CANNOT_START_TASK_ON_WEAK_GPS", R.string.mission_error_gps_signal_weak);
        public static final /* enum */ Error SURFACE_FOLLOW_CAMERA_INVALID = new Error("SURFACE_FOLLOW_CAMERA_INVALID", R.string.fpv_tip_0x20120B0A);
        public static final /* enum */ Error DRONE_ON_GROUND_MOTOR_ON = new Error("DRONE_ON_GROUND_MOTOR_ON", R.string.mission_start_failed_motor_on_groud_tip);
        public static final /* enum */ Error TRAJ_INIT_FAIL = new Error("TRAJ_INIT_FAIL", R.string.mission_execution_upload_wp_abnormal);
        public static final /* enum */ Error TRAJ_ON_GROUND_MOTOR_ON_CANNOT_GO = new Error("TRAJ_ON_GROUND_MOTOR_ON_CANNOT_GO", R.string.mission_execution_upload_stop_oars);
        public static final /* enum */ Error TRAJ_INVALID_START_INDEX_OR_PROG = new Error("TRAJ_INVALID_START_INDEX_OR_PROG", R.string.mission_execution_upload_waypoint_fail_index_mistake);
        public static final /* enum */ Error TRAJ_INVALID_CSYS_MODE = new Error("TRAJ_INVALID_CSYS_MODE", R.string.mission_execution_upload_waypoint_fail_coordinate_system_mistake);
        public static final /* enum */ Error TRAJ_INVALID_HEIGHT_MODE = new Error("TRAJ_INVALID_HEIGHT_MODE", R.string.mission_execution_upload_waypoint_fail_high_mode_mistake);
        public static final /* enum */ Error TRAJ_INVALID_FLY_WP_MODE = new Error("TRAJ_INVALID_FLY_WP_MODE", R.string.mission_execution_upload_waypoint_fail_transition_mistake);
        public static final /* enum */ Error TRAJ_INVALID_YAW_MODE = new Error("TRAJ_INVALID_YAW_MODE", R.string.mission_execution_upload_waypoint_fail_yaw_mode_mistake);
        public static final /* enum */ Error TRAJ_INVALID_TURN_DIR_MODE = new Error("TRAJ_INVALID_TURN_DIR_MODE", R.string.mission_execution_upload_waypoint_fail_yaw_direction_mistake);
        public static final /* enum */ Error TRAJ_INVALID_WP_TYPE = new Error("TRAJ_INVALID_WP_TYPE", R.string.mission_execution_upload_waypoint_fail_waypoint_type_mistake);
        public static final /* enum */ Error TRAJ_FIR_LAS_WP_TYPE_ERROR = new Error("TRAJ_FIR_LAS_WP_TYPE_ERROR", R.string.mission_execution_upload_waypoint_fail_sewaypoint_type_mistake);
        public static final /* enum */ Error TRAJ_GLOB_VEL_OUT_OF_RANGE = new Error("TRAJ_GLOB_VEL_OUT_OF_RANGE", R.string.mission_execution_upload_waypoint_fail_speed_mistake);
        public static final /* enum */ Error TRAJ_WP_NUM_OUT_OF_RANGE = new Error("TRAJ_WP_NUM_OUT_OF_RANGE", R.string.mission_execution_upload_waypoint_fail_waypoint_number_mistake);
        public static final /* enum */ Error TRAJ_LAT_LONG_OUT_OF_RANGE = new Error("TRAJ_LAT_LONG_OUT_OF_RANGE", R.string.mission_execution_upload_waypoint_fail_waypoint_location_mistake);
        public static final /* enum */ Error TRAJ_DAMP_DIS_OUT_OF_RANGE = new Error("TRAJ_DAMP_DIS_OUT_OF_RANGE", R.string.mission_execution_upload_waypoint_fail_waypoint_intercept_mistake);
        public static final /* enum */ Error TRAJ_WP_YAW_OUT_OF_RANGE = new Error("TRAJ_WP_YAW_OUT_OF_RANGE", R.string.mission_execution_upload_waypoint_fail_drone_yaw_mistake);
        public static final /* enum */ Error TRAJ_MAX_VEL_OUT_OF_RANGE = new Error("TRAJ_MAX_VEL_OUT_OF_RANGE", R.string.mission_upload_fail_waypoint_max_speed_exceed);
        public static final /* enum */ Error TRAJ_VEL_OUT_OF_RANGE = new Error("TRAJ_VEL_OUT_OF_RANGE", R.string.mission_upload_fail_waypoint_max_speed_exceed);
        public static final /* enum */ Error NOT_IN_NORMAL_MODE = new Error("NOT_IN_NORMAL_MODE", R.string.mission_not_in_normal_mode);
        public static final /* enum */ Error UNKNOWN = new Error("UNKNOWN", R.string.dji_msdk_error_waypoint_unkown_error);
        private final String errorCode;
        private final String hint;
        private final int resId;
        private static Error[] mValues;
        private static final /* synthetic */ Error[] $VALUES;

        public static Error[] values() {
            return null;
        }

        public static Error valueOf(String string2) {
            return null;
        }

        private Error(String string3, int n2) {
        }

        @Override
        public String errorCode() {
            return null;
        }

        @Override
        public String hint() {
            return null;
        }

        @Override
        public int resID() {
            return 0;
        }

        public static Error[] getValues() {
            return null;
        }

        public static Error find(String string2) {
            return null;
        }

        private boolean eauqlas(String string2) {
            return false;
        }

        private static /* synthetic */ Error[] $values() {
            return null;
        }

        static {
            $VALUES = Error.$values();
        }
    }
}

