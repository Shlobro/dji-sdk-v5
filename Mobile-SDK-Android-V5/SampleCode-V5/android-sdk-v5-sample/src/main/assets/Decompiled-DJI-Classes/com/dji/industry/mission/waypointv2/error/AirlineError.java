/*
 * Decompiled with CFR 0.152.
 */
package com.dji.industry.mission.waypointv2.error;

import java.util.concurrent.ConcurrentHashMap;

public final class AirlineError
extends Enum<AirlineError> {
    public static final /* enum */ AirlineError UNKNOWN;
    public static final /* enum */ AirlineError NO_ERROR;
    public static final /* enum */ AirlineError COMMAND_CAN_NOT_EXECUTE;
    public static final /* enum */ AirlineError COMMAND_EXECUTION_FAILED;
    public static final /* enum */ AirlineError INVALID_PARAMETERS;
    public static final /* enum */ AirlineError TIMEOUT;
    public static final /* enum */ AirlineError PRODUCT_CONNECT_FAILED;
    public static final /* enum */ AirlineError SYSTEM_BUSY;
    public static final /* enum */ AirlineError OPERATION_CANCEL_BY_USER;
    public static final /* enum */ AirlineError UPLOAD_MEDIA_FILE_FAILED;
    public static final /* enum */ AirlineError SDR_LINK_RESERVE_FAILED;
    public static final /* enum */ AirlineError CHECK_PHOTOS_STORAGE_PACK_ERROR;
    public static final /* enum */ AirlineError SDR_LINK_RESERVE_FAILED_CAUSE_MOTOR_ON;
    public static final /* enum */ AirlineError ACTION_TRIGGER_NOT_MATCH_ACTUATOR;
    public static final /* enum */ AirlineError INTERRUPT_REASON_AVOID;
    public static final /* enum */ AirlineError INTERRUPT_REASON_AVOID_RADIUS_LIMIT;
    public static final /* enum */ AirlineError INTERRUPT_REASON_AVOID_HEIGHT_LIMIT;
    public static final /* enum */ AirlineError INTERRUPT_REASON_AVOID_RTK_UNHEALTHY;
    public static final /* enum */ AirlineError INTERRUPT_REASON_AVOID_USER_REQ_BREAK;
    public static final /* enum */ AirlineError INTERRUPT_REASON_AVOID_AIRPORT_LIMIT;
    public static final /* enum */ AirlineError INTERRUPT_REASON_AVOID_EMERGENCY_BREAK;
    public static final /* enum */ AirlineError INTERRUPT_REASON_GPS_BAD;
    public static final /* enum */ AirlineError INTERRUPT_REASON_HOME_STATUS_ERROR;
    public static final /* enum */ AirlineError INTERRUPT_REASON_RC_STICK;
    public static final /* enum */ AirlineError TRANJECTORY_REPLAY_INVALID_LOCATION;
    public static final /* enum */ AirlineError TRANJECTORY_REPLAY_NO_WAYPOINT_TO_REMOVE;
    public static final /* enum */ AirlineError TRANJECTORY_REPLAY_GIMBAL_ATTI_ERROR;
    public static final /* enum */ AirlineError INVALID_INPUT_DATA_FC_LENGTH;
    public static final /* enum */ AirlineError INVALID_INPUT_DATA_FLOAT_NUMBER;
    public static final /* enum */ AirlineError INIT_MISSION_COUNT_OVER_RANGE;
    public static final /* enum */ AirlineError INIT_MISSION_COUNT_TOO_LESS;
    public static final /* enum */ AirlineError INIT_MISSION_END_INDEX_INVALID;
    public static final /* enum */ AirlineError INIT_MISSION_GLOBAL_MAX_SPEED_INVALID;
    public static final /* enum */ AirlineError INIT_MISSION_CRUISE_SPEED_INVALID;
    public static final /* enum */ AirlineError INIT_MISSION_GOTO_FIRST_WAYPOINT_INVALID;
    public static final /* enum */ AirlineError INIT_MISSION_FINISHED_ACTION_INVALID;
    public static final /* enum */ AirlineError INIT_MISSION_RC_LOST_CONTROL_ACTION_INVALID;
    public static final /* enum */ AirlineError INIT_MISSION_REFERENCE_LOCATION_INVALID;
    public static final /* enum */ AirlineError INIT_MISSION_EXIST_RUNNING;
    public static final /* enum */ AirlineError UPLOAD_MISSION_INDEX_INVALID;
    public static final /* enum */ AirlineError UPLOAD_MISSION_COUNT_OVER_INIT_TOTAL_COUNT;
    public static final /* enum */ AirlineError UPLOAD_MISSION_START_INDEX_NOT_IN_END_OF_LAST_UPLOAD;
    public static final /* enum */ AirlineError UPLOAD_MISSION_DISTANCE_TOO_CLOSE;
    public static final /* enum */ AirlineError UPLOAD_MISSION_DISTANCE_TO_FAR;
    public static final /* enum */ AirlineError UPLOAD_MISSION_MAX_CRUISE_SPEED_OVER_GLOBAL_MAX_SPEED;
    public static final /* enum */ AirlineError UPLOAD_MISSION_CRUISE_SPEED_OVER_LOCAL_MAX_SPEED;
    public static final /* enum */ AirlineError UPLOAD_MISSION_CRUISE_SPEED_OVER_GLOBAL_MAX_SPEED;
    public static final /* enum */ AirlineError UPLOAD_MISSION_YAW_MODE_INVALID;
    public static final /* enum */ AirlineError UPLOAD_MISSION_YAW_CONTROL_DEGREE_INVALID;
    public static final /* enum */ AirlineError UPLOAD_MISSION_YAW_CONTROL_DIRECTION_INVALID;
    public static final /* enum */ AirlineError UPLOAD_MISSION_WAYPOINT_TYPE_INVALID;
    public static final /* enum */ AirlineError UPLOAD_MISSION_DAMPING_DISTANCE_INVALID;
    public static final /* enum */ AirlineError UPLOAD_MISSION_CANNOT_SET_EXIT_LINE_TYPE;
    public static final /* enum */ AirlineError UPLOAD_MISSION_INDEX_NOT_CONTINUE;
    public static final /* enum */ AirlineError UPLOAD_MISSION_ENTER_LINE_TYPE_SET_TO_START_POINT_INVALID;
    public static final /* enum */ AirlineError UPLOAD_MISSION_DAMPING_INVALID;
    public static final /* enum */ AirlineError UPLOAD_MISSION_COORDINATE_INVALID;
    public static final /* enum */ AirlineError FIRST_WAYPOINT_TYPE_INVALID;
    public static final /* enum */ AirlineError MISSION_FLYING_RADIUS_LIMIT;
    public static final /* enum */ AirlineError MISSION_FLYING_HEIGHT_LIMIT;
    public static final /* enum */ AirlineError MISSION_VERSION_NOT_MATCHED;
    public static final /* enum */ AirlineError DOWNLOAD_MISSION_RANGE_OVER_STORAGE_COUNT;
    public static final /* enum */ AirlineError DOWNLOAD_MISSION_NOT_INITIALIZED;
    public static final /* enum */ AirlineError DOWNLOAD_MISSION_NOT_UPLOADED;
    public static final /* enum */ AirlineError MISSION_CONTROL_START_CURRENT_POINT_TO_FIRST_POINT_TOO_FAR;
    public static final /* enum */ AirlineError MISSION_CONTROL_START_STOP_INVALID;
    public static final /* enum */ AirlineError MISSION_CONTROL_PAUSE_RESUME_INVALID;
    public static final /* enum */ AirlineError MISSION_CONTROL_INTERRUPT_RECOVER_INVALID;
    public static final /* enum */ AirlineError MISSION_CONTROL_UPLOADED_POINT_TOO_LESS;
    public static final /* enum */ AirlineError MISSION_CONTROL_STARTED_NO_IN_RUNNING;
    public static final /* enum */ AirlineError MISSION_CONTROL_ALREADY_STARTED;
    public static final /* enum */ AirlineError MISSION_CONTROL_ALREADY_STOPPED;
    public static final /* enum */ AirlineError MISSION_CONTROL_MISSION_ALREADY_PAUSED;
    public static final /* enum */ AirlineError MISSION_CONTROL_NO_RUNNING_MISSION_FOR_RESUME;
    public static final /* enum */ AirlineError MISSION_CONTROL_NO_RUNNING_MISSION_FOR_RECOVER;
    public static final /* enum */ AirlineError MISSION_CONTROL_ALREADY_INTERRUPT;
    public static final /* enum */ AirlineError MISSION_CONTROL_NOT_SUPPORT_PAUSE_RESUME;
    public static final /* enum */ AirlineError MISSION_CONTROL_NOT_SUPPORT_INTERRUPT_RESUME;
    public static final /* enum */ AirlineError MISSION_CONTROL_BREAK_POINT_NOT_RECORD;
    public static final /* enum */ AirlineError MISSION_CONTROL_PROJECTION_POINT_NOT_IN_CURRENT_WAYPOINT_LINE;
    public static final /* enum */ AirlineError MISSION_CONTROL_PROJECTION_POINT_NOT_NEXT_WAYPOINT_LINE;
    public static final /* enum */ AirlineError MISSION_CONTROL_PROJECTION_POINT_NOT_NEXT_NEXT_WAYPOINT_LINE;
    public static final /* enum */ AirlineError MISSION_STATE_AIRCRAFT_FLYING_STATUS_BAD;
    public static final /* enum */ AirlineError MISSION_STATE_HOME_POINT_NOT_RECORD;
    public static final /* enum */ AirlineError MISSION_STATE_GPS_SIGNAL_WEAK;
    public static final /* enum */ AirlineError MISSION_STATE_RTK_NOT_READY;
    public static final /* enum */ AirlineError MISSION_SECURE_STATE_NFZ_ZONE_CROSS;
    public static final /* enum */ AirlineError MISSION_SECURE_STATE_AIRCRAFT_LOW_BATTERY;
    public static final /* enum */ AirlineError UPLOAD_ACTION_ID_DUPLICATED;
    public static final /* enum */ AirlineError UPLOAD_ACTION_ITEMS_SPACE_NOT_ENOUGH;
    public static final /* enum */ AirlineError UPLOAD_ACTION_BUFFER_NOT_ENOUGH;
    public static final /* enum */ AirlineError DOWNLOAD_ACTION_ID_NOT_FOUND;
    public static final /* enum */ AirlineError DOWNLOAD_ACTION_ID_OVER_RANGE;
    public static final /* enum */ AirlineError DOWNLOAD_ACTION_NO_ACTION_STORED;
    public static final /* enum */ AirlineError UPLOAD_ACTION_TRIGGER_TYPE_INVALID;
    public static final /* enum */ AirlineError UPLOAD_ACTION_TRIGGER_REACH_END_INDEX_LESS_START_INDEX;
    public static final /* enum */ AirlineError UPLOAD_ACTION_TRIGGER_REACH_INTERVAL_COUNT_INVALID;
    public static final /* enum */ AirlineError UPLOAD_ACTION_TRIGGER_REACH_AUTO_TERMINATE_INVALID;
    public static final /* enum */ AirlineError UPLOAD_ACTION_TRIGGER_ASSOCIATE_TYPE_INVALID;
    public static final /* enum */ AirlineError UPLOAD_ACTION_TRIGGER_SIMPLE_INTERVAL_TYPE_INVALID;
    public static final /* enum */ AirlineError UPLOAD_ACTION_ACTUATOR_EXECUTE_NOT_SUPPORT;
    public static final /* enum */ AirlineError UPLOAD_ACTION_ACTUATOR_TYPE_INVALID;
    public static final /* enum */ AirlineError UPLOAD_ACTION_ACTUATOR_FUNCTION_INVALID;
    public static final /* enum */ AirlineError UPLOAD_ACTION_ACTUATOR_SPRAY_EXTERNAL_SPRAY_MODE_INVALID;
    public static final /* enum */ AirlineError UPLOAD_ACTION_ACTUATOR_SPRAY_FLOW_SPEED_INVALID;
    public static final /* enum */ AirlineError UPLOAD_ACTION_ACTUATOR_SPRAY_FLOW_SPEED_PRE_MU_INVALID;
    public static final /* enum */ AirlineError ACTION_ACTUATOR_GIMBAL_ANGLE_INVALID;
    public static final /* enum */ AirlineError ACTION_ACTUATOR_GIMBAL_DURATION_INVALID;
    public static final /* enum */ AirlineError ACTION_ACTUATOR_GIMBAL_ARRIVE_TAG_ANGLE_FAILED;
    public static final /* enum */ AirlineError ACTION_ACTUATOR_GIMBAL_SEND_COMMAND_TO_GIMBAL_FAILED;
    public static final /* enum */ AirlineError ACTION_ACTUATOR_FLIGHT_YAW_ANGLE_INVALID;
    public static final /* enum */ AirlineError ACTION_ACTUATOR_FLIGHT_YAW_TO_TARGET_TIMEOUT;
    public static final /* enum */ AirlineError ACTION_ACTUATOR_FLIGHT_YAW_OCCUPIED;
    public static final /* enum */ AirlineError ACTION_ACTUATOR_FLIGHT_CUR_AND_TARGET_STATE_EQUAL;
    public static final /* enum */ AirlineError ACTION_ACTUATOR_PAYLOAD_FAIL_TO_SNED_CMD_TO_PAYLOAD;
    public static final /* enum */ AirlineError ACTION_ACTUATOR_PAYLOAD_EXEC_FAILED;
    public static final /* enum */ AirlineError OVER_STOP_BY_USER;
    public static final /* enum */ AirlineError OVER_ON_GROUND_MOTOR_ON;
    public static final /* enum */ AirlineError OVER_AUTO_TAKEOFF_TIMEOUT;
    public static final /* enum */ AirlineError OVER_AUTO_TAKEOFF_FAIL_TO_ARRIVE_TARGET_HEIGHT;
    public static final /* enum */ AirlineError OVER_AUTO_TAKEOFF_NOT_EXEC_OR_INTERRUPT;
    public static final /* enum */ AirlineError OVER_BY_HIGH_PRIORITY_MISSION;
    public static final /* enum */ AirlineError OVER_UNKNOWN_REASON;
    public static final /* enum */ AirlineError OVER_GS_FAIL_TO_GENERATE_TRAJ;
    private final int errorCode;
    private static final ConcurrentHashMap<Integer, AirlineError> ERROR_CODES;
    private static final /* synthetic */ AirlineError[] $VALUES;

    public static AirlineError[] values() {
        return null;
    }

    public static AirlineError valueOf(String string) {
        return null;
    }

    private AirlineError(int n2) {
    }

    public int getErrorCode() {
        return 0;
    }

    public static AirlineError fromErrorCode(int n) {
        return null;
    }

    private static /* synthetic */ AirlineError[] $values() {
        return null;
    }

    static {
        AirlineError[] errors;
        UNKNOWN = new AirlineError(1);
        NO_ERROR = new AirlineError(0);
        COMMAND_CAN_NOT_EXECUTE = new AirlineError(-1);
        COMMAND_EXECUTION_FAILED = new AirlineError(-2);
        INVALID_PARAMETERS = new AirlineError(-3);
        TIMEOUT = new AirlineError(-4);
        PRODUCT_CONNECT_FAILED = new AirlineError(-5);
        SYSTEM_BUSY = new AirlineError(-6);
        OPERATION_CANCEL_BY_USER = new AirlineError(-7);
        UPLOAD_MEDIA_FILE_FAILED = new AirlineError(-8);
        SDR_LINK_RESERVE_FAILED = new AirlineError(-9);
        CHECK_PHOTOS_STORAGE_PACK_ERROR = new AirlineError(-10);
        SDR_LINK_RESERVE_FAILED_CAUSE_MOTOR_ON = new AirlineError(-11);
        ACTION_TRIGGER_NOT_MATCH_ACTUATOR = new AirlineError(-12);
        INTERRUPT_REASON_AVOID = new AirlineError(-13);
        INTERRUPT_REASON_AVOID_RADIUS_LIMIT = new AirlineError(-14);
        INTERRUPT_REASON_AVOID_HEIGHT_LIMIT = new AirlineError(-15);
        INTERRUPT_REASON_AVOID_RTK_UNHEALTHY = new AirlineError(-16);
        INTERRUPT_REASON_AVOID_USER_REQ_BREAK = new AirlineError(-17);
        INTERRUPT_REASON_AVOID_AIRPORT_LIMIT = new AirlineError(-18);
        INTERRUPT_REASON_AVOID_EMERGENCY_BREAK = new AirlineError(-19);
        INTERRUPT_REASON_GPS_BAD = new AirlineError(-20);
        INTERRUPT_REASON_HOME_STATUS_ERROR = new AirlineError(-21);
        INTERRUPT_REASON_RC_STICK = new AirlineError(-22);
        TRANJECTORY_REPLAY_INVALID_LOCATION = new AirlineError(-100);
        TRANJECTORY_REPLAY_NO_WAYPOINT_TO_REMOVE = new AirlineError(-101);
        TRANJECTORY_REPLAY_GIMBAL_ATTI_ERROR = new AirlineError(-102);
        INVALID_INPUT_DATA_FC_LENGTH = new AirlineError(-1001);
        INVALID_INPUT_DATA_FLOAT_NUMBER = new AirlineError(-1002);
        INIT_MISSION_COUNT_OVER_RANGE = new AirlineError(-2001);
        INIT_MISSION_COUNT_TOO_LESS = new AirlineError(-2002);
        INIT_MISSION_END_INDEX_INVALID = new AirlineError(-2003);
        INIT_MISSION_GLOBAL_MAX_SPEED_INVALID = new AirlineError(-2004);
        INIT_MISSION_CRUISE_SPEED_INVALID = new AirlineError(-2005);
        INIT_MISSION_GOTO_FIRST_WAYPOINT_INVALID = new AirlineError(-2006);
        INIT_MISSION_FINISHED_ACTION_INVALID = new AirlineError(-2007);
        INIT_MISSION_RC_LOST_CONTROL_ACTION_INVALID = new AirlineError(-2008);
        INIT_MISSION_REFERENCE_LOCATION_INVALID = new AirlineError(-2009);
        INIT_MISSION_EXIST_RUNNING = new AirlineError(-2010);
        UPLOAD_MISSION_INDEX_INVALID = new AirlineError(-2011);
        UPLOAD_MISSION_COUNT_OVER_INIT_TOTAL_COUNT = new AirlineError(-2012);
        UPLOAD_MISSION_START_INDEX_NOT_IN_END_OF_LAST_UPLOAD = new AirlineError(-2013);
        UPLOAD_MISSION_DISTANCE_TOO_CLOSE = new AirlineError(-2014);
        UPLOAD_MISSION_DISTANCE_TO_FAR = new AirlineError(-2015);
        UPLOAD_MISSION_MAX_CRUISE_SPEED_OVER_GLOBAL_MAX_SPEED = new AirlineError(-2016);
        UPLOAD_MISSION_CRUISE_SPEED_OVER_LOCAL_MAX_SPEED = new AirlineError(-2017);
        UPLOAD_MISSION_CRUISE_SPEED_OVER_GLOBAL_MAX_SPEED = new AirlineError(-2018);
        UPLOAD_MISSION_YAW_MODE_INVALID = new AirlineError(-2019);
        UPLOAD_MISSION_YAW_CONTROL_DEGREE_INVALID = new AirlineError(-2020);
        UPLOAD_MISSION_YAW_CONTROL_DIRECTION_INVALID = new AirlineError(-2021);
        UPLOAD_MISSION_WAYPOINT_TYPE_INVALID = new AirlineError(-2022);
        UPLOAD_MISSION_DAMPING_DISTANCE_INVALID = new AirlineError(-2023);
        UPLOAD_MISSION_CANNOT_SET_EXIT_LINE_TYPE = new AirlineError(-2024);
        UPLOAD_MISSION_INDEX_NOT_CONTINUE = new AirlineError(-2025);
        UPLOAD_MISSION_ENTER_LINE_TYPE_SET_TO_START_POINT_INVALID = new AirlineError(-2026);
        UPLOAD_MISSION_DAMPING_INVALID = new AirlineError(-2027);
        UPLOAD_MISSION_COORDINATE_INVALID = new AirlineError(-2028);
        FIRST_WAYPOINT_TYPE_INVALID = new AirlineError(-2029);
        MISSION_FLYING_RADIUS_LIMIT = new AirlineError(-2030);
        MISSION_FLYING_HEIGHT_LIMIT = new AirlineError(-2031);
        MISSION_VERSION_NOT_MATCHED = new AirlineError(-2032);
        DOWNLOAD_MISSION_RANGE_OVER_STORAGE_COUNT = new AirlineError(-3001);
        DOWNLOAD_MISSION_NOT_INITIALIZED = new AirlineError(-3002);
        DOWNLOAD_MISSION_NOT_UPLOADED = new AirlineError(-3003);
        MISSION_CONTROL_START_CURRENT_POINT_TO_FIRST_POINT_TOO_FAR = new AirlineError(-4001);
        MISSION_CONTROL_START_STOP_INVALID = new AirlineError(-4002);
        MISSION_CONTROL_PAUSE_RESUME_INVALID = new AirlineError(-4003);
        MISSION_CONTROL_INTERRUPT_RECOVER_INVALID = new AirlineError(-4004);
        MISSION_CONTROL_UPLOADED_POINT_TOO_LESS = new AirlineError(-4005);
        MISSION_CONTROL_STARTED_NO_IN_RUNNING = new AirlineError(-4006);
        MISSION_CONTROL_ALREADY_STARTED = new AirlineError(-4007);
        MISSION_CONTROL_ALREADY_STOPPED = new AirlineError(-4008);
        MISSION_CONTROL_MISSION_ALREADY_PAUSED = new AirlineError(-4009);
        MISSION_CONTROL_NO_RUNNING_MISSION_FOR_RESUME = new AirlineError(-4010);
        MISSION_CONTROL_NO_RUNNING_MISSION_FOR_RECOVER = new AirlineError(-4011);
        MISSION_CONTROL_ALREADY_INTERRUPT = new AirlineError(-4012);
        MISSION_CONTROL_NOT_SUPPORT_PAUSE_RESUME = new AirlineError(-4013);
        MISSION_CONTROL_NOT_SUPPORT_INTERRUPT_RESUME = new AirlineError(-4014);
        MISSION_CONTROL_BREAK_POINT_NOT_RECORD = new AirlineError(-4015);
        MISSION_CONTROL_PROJECTION_POINT_NOT_IN_CURRENT_WAYPOINT_LINE = new AirlineError(-4016);
        MISSION_CONTROL_PROJECTION_POINT_NOT_NEXT_WAYPOINT_LINE = new AirlineError(-4017);
        MISSION_CONTROL_PROJECTION_POINT_NOT_NEXT_NEXT_WAYPOINT_LINE = new AirlineError(-4018);
        MISSION_STATE_AIRCRAFT_FLYING_STATUS_BAD = new AirlineError(-5001);
        MISSION_STATE_HOME_POINT_NOT_RECORD = new AirlineError(-5002);
        MISSION_STATE_GPS_SIGNAL_WEAK = new AirlineError(-5003);
        MISSION_STATE_RTK_NOT_READY = new AirlineError(-5004);
        MISSION_SECURE_STATE_NFZ_ZONE_CROSS = new AirlineError(-6001);
        MISSION_SECURE_STATE_AIRCRAFT_LOW_BATTERY = new AirlineError(-6002);
        UPLOAD_ACTION_ID_DUPLICATED = new AirlineError(-7001);
        UPLOAD_ACTION_ITEMS_SPACE_NOT_ENOUGH = new AirlineError(-7002);
        UPLOAD_ACTION_BUFFER_NOT_ENOUGH = new AirlineError(-7003);
        DOWNLOAD_ACTION_ID_NOT_FOUND = new AirlineError(-7004);
        DOWNLOAD_ACTION_ID_OVER_RANGE = new AirlineError(-7005);
        DOWNLOAD_ACTION_NO_ACTION_STORED = new AirlineError(-7006);
        UPLOAD_ACTION_TRIGGER_TYPE_INVALID = new AirlineError(-8001);
        UPLOAD_ACTION_TRIGGER_REACH_END_INDEX_LESS_START_INDEX = new AirlineError(-8002);
        UPLOAD_ACTION_TRIGGER_REACH_INTERVAL_COUNT_INVALID = new AirlineError(-8003);
        UPLOAD_ACTION_TRIGGER_REACH_AUTO_TERMINATE_INVALID = new AirlineError(-8004);
        UPLOAD_ACTION_TRIGGER_ASSOCIATE_TYPE_INVALID = new AirlineError(-8005);
        UPLOAD_ACTION_TRIGGER_SIMPLE_INTERVAL_TYPE_INVALID = new AirlineError(-8006);
        UPLOAD_ACTION_ACTUATOR_EXECUTE_NOT_SUPPORT = new AirlineError(-9001);
        UPLOAD_ACTION_ACTUATOR_TYPE_INVALID = new AirlineError(-9002);
        UPLOAD_ACTION_ACTUATOR_FUNCTION_INVALID = new AirlineError(-9003);
        UPLOAD_ACTION_ACTUATOR_SPRAY_EXTERNAL_SPRAY_MODE_INVALID = new AirlineError(-10001);
        UPLOAD_ACTION_ACTUATOR_SPRAY_FLOW_SPEED_INVALID = new AirlineError(-10002);
        UPLOAD_ACTION_ACTUATOR_SPRAY_FLOW_SPEED_PRE_MU_INVALID = new AirlineError(-10003);
        ACTION_ACTUATOR_GIMBAL_ANGLE_INVALID = new AirlineError(-11001);
        ACTION_ACTUATOR_GIMBAL_DURATION_INVALID = new AirlineError(-11002);
        ACTION_ACTUATOR_GIMBAL_ARRIVE_TAG_ANGLE_FAILED = new AirlineError(-11003);
        ACTION_ACTUATOR_GIMBAL_SEND_COMMAND_TO_GIMBAL_FAILED = new AirlineError(-11004);
        ACTION_ACTUATOR_FLIGHT_YAW_ANGLE_INVALID = new AirlineError(-12001);
        ACTION_ACTUATOR_FLIGHT_YAW_TO_TARGET_TIMEOUT = new AirlineError(-12002);
        ACTION_ACTUATOR_FLIGHT_YAW_OCCUPIED = new AirlineError(-12003);
        ACTION_ACTUATOR_FLIGHT_CUR_AND_TARGET_STATE_EQUAL = new AirlineError(-12004);
        ACTION_ACTUATOR_PAYLOAD_FAIL_TO_SNED_CMD_TO_PAYLOAD = new AirlineError(-13001);
        ACTION_ACTUATOR_PAYLOAD_EXEC_FAILED = new AirlineError(-13002);
        OVER_STOP_BY_USER = new AirlineError(-14001);
        OVER_ON_GROUND_MOTOR_ON = new AirlineError(-14002);
        OVER_AUTO_TAKEOFF_TIMEOUT = new AirlineError(-14003);
        OVER_AUTO_TAKEOFF_FAIL_TO_ARRIVE_TARGET_HEIGHT = new AirlineError(-14004);
        OVER_AUTO_TAKEOFF_NOT_EXEC_OR_INTERRUPT = new AirlineError(-14005);
        OVER_BY_HIGH_PRIORITY_MISSION = new AirlineError(-14006);
        OVER_UNKNOWN_REASON = new AirlineError(-14007);
        OVER_GS_FAIL_TO_GENERATE_TRAJ = new AirlineError(-14008);
        $VALUES = AirlineError.$values();
        ERROR_CODES = new ConcurrentHashMap();
        for (AirlineError error : errors = AirlineError.values()) {
            ERROR_CODES.put(error.errorCode, error);
        }
    }
}

