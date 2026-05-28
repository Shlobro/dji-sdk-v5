/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.dji.wpmzsdk.common.utils.kml;

import android.text.TextUtils;
import com.dji.wpmzsdk.common.utils.kml.data.MissionType;
import com.dji.wpmzsdk.common.utils.kml.mission.WaypointMissionFinishedAction;
import com.dji.wpmzsdk.common.utils.kml.mission.WaypointMissionHeadingMode;
import com.dji.wpmzsdk.common.utils.kml.mission.WaypointV2MissionTypes;
import com.dji.wpmzsdk.common.utils.kml.model.MappingCameraType;
import com.dji.wpmzsdk.common.utils.kml.model.PointTurnMode;
import com.dji.wpmzsdk.common.utils.kml.model.WaypointActionType;
import com.dji.wpmzsdk.common.utils.kml.model.WaypointDroneType;

public class KMLValueConverter {
    public static String convert(PointTurnMode turnMode) {
        switch (turnMode) {
            case CLOCKWISE: {
                return "Clockwise";
            }
            case COUNTER_CLOCKWISE: {
                return "Counterclockwise";
            }
            case AUTO: {
                return "Auto";
            }
        }
        return "Clockwise";
    }

    public static String convert(WaypointMissionFinishedAction finishedAction) {
        switch (finishedAction) {
            case NO_ACTION: {
                return "Hover";
            }
            case GO_HOME: {
                return "GoHome";
            }
            case AUTO_LAND: {
                return "AutoLand";
            }
            case GO_FIRST_WAYPOINT: {
                return "GoFirstPoint";
            }
        }
        return "Hover";
    }

    public static String convert(WaypointMissionHeadingMode headingMode) {
        switch (headingMode) {
            case AUTO: {
                return "Auto";
            }
            case CONTROL_BY_REMOTE_CONTROLLER: {
                return "ControlledByRC";
            }
            case USING_WAYPOINT_HEADING: {
                return "UsePointSetting";
            }
            case TOWARD_POINT_OF_INTEREST: {
                return "TowardsPoi";
            }
            case USING_INITIAL_DIRECTION: {
                return "UsingInitialDirection";
            }
        }
        return "Auto";
    }

    public static String convert(WaypointActionType actionType) {
        switch (actionType) {
            case STAY: {
                return "Hovering";
            }
            case START_TAKE_PHOTO: {
                return "ShootPhoto";
            }
            case START_RECORD: {
                return "StartRecording";
            }
            case STOP_RECORD: {
                return "StopRecording";
            }
            case ROTATE_AIRCRAFT: {
                return "AircraftYaw";
            }
            case GIMBAL_PITCH: {
                return "GimbalPitch";
            }
            case GIMBAL_YAW: {
                return "GimbalYaw";
            }
            case CAMERA_ZOOM: {
                return "CameraZoom";
            }
            case CAMERA_FOCUS: {
                return "CameraFocus";
            }
            case START_TIME_INTERVAL_SHOT: {
                return "TimeIntervalShot";
            }
            case START_DISTANCE_INTERVAL_SHOT: {
                return "DistanceIntervalShot";
            }
            case STOP_INTERVAL_SHOT: {
                return "StopIntervalShot";
            }
            case PRECISE_SHOT: {
                return "PreciseShot";
            }
            case PAYLOAD_BUTTON: {
                return "PayloadButton";
            }
            case PAYLOAD_SWITCH_ON: {
                return "PayloadSwitchOn";
            }
            case PAYLOAD_SWITCH_OFF: {
                return "PayloadSwitchOff";
            }
            case PAYLOAD_SEEK_VALUE: {
                return "PayloadSeek";
            }
            case START_POINT_CLOUD: {
                return "StartPointCloud";
            }
            case PAUSE_POINT_CLOUD: {
                return "PausePointCloud";
            }
            case CONTINUE_POINT_CLOUD: {
                return "ContinuePointCloud";
            }
            case FINISH_POINT_CLOUD: {
                return "FinishPointCloud";
            }
            case CAMERA_MKDIR: {
                return "CameraMkdir";
            }
        }
        return null;
    }

    public static WaypointActionType getActionType(String type) {
        if (KMLValueConverter.equals(type, "Hovering")) {
            return WaypointActionType.STAY;
        }
        if (KMLValueConverter.equals(type, "ShootPhoto")) {
            return WaypointActionType.START_TAKE_PHOTO;
        }
        if (KMLValueConverter.equals(type, "StartRecording")) {
            return WaypointActionType.START_RECORD;
        }
        if (KMLValueConverter.equals(type, "StopRecording")) {
            return WaypointActionType.STOP_RECORD;
        }
        if (KMLValueConverter.equals(type, "AircraftYaw")) {
            return WaypointActionType.ROTATE_AIRCRAFT;
        }
        if (KMLValueConverter.equals(type, "GimbalPitch")) {
            return WaypointActionType.GIMBAL_PITCH;
        }
        if (KMLValueConverter.equals(type, "GimbalYaw")) {
            return WaypointActionType.GIMBAL_YAW;
        }
        if (KMLValueConverter.equals(type, "CameraZoom")) {
            return WaypointActionType.CAMERA_ZOOM;
        }
        if (KMLValueConverter.equals(type, "CameraFocus")) {
            return WaypointActionType.CAMERA_FOCUS;
        }
        if (KMLValueConverter.equals(type, "TimeIntervalShot")) {
            return WaypointActionType.START_TIME_INTERVAL_SHOT;
        }
        if (KMLValueConverter.equals(type, "DistanceIntervalShot")) {
            return WaypointActionType.START_DISTANCE_INTERVAL_SHOT;
        }
        if (KMLValueConverter.equals(type, "StopIntervalShot")) {
            return WaypointActionType.STOP_INTERVAL_SHOT;
        }
        if (KMLValueConverter.equals(type, "PreciseShot")) {
            return WaypointActionType.PRECISE_SHOT;
        }
        if (KMLValueConverter.equals(type, "PayloadButton")) {
            return WaypointActionType.PAYLOAD_BUTTON;
        }
        if (KMLValueConverter.equals(type, "PayloadSwitchOn")) {
            return WaypointActionType.PAYLOAD_SWITCH_ON;
        }
        if (KMLValueConverter.equals(type, "PayloadSwitchOff")) {
            return WaypointActionType.PAYLOAD_SWITCH_OFF;
        }
        if (KMLValueConverter.equals(type, "PayloadSeek")) {
            return WaypointActionType.PAYLOAD_SEEK_VALUE;
        }
        if (KMLValueConverter.equals(type, "StartPointCloud")) {
            return WaypointActionType.START_POINT_CLOUD;
        }
        if (KMLValueConverter.equals(type, "PausePointCloud")) {
            return WaypointActionType.PAUSE_POINT_CLOUD;
        }
        if (KMLValueConverter.equals(type, "ContinuePointCloud")) {
            return WaypointActionType.CONTINUE_POINT_CLOUD;
        }
        if (KMLValueConverter.equals(type, "FinishPointCloud")) {
            return WaypointActionType.FINISH_POINT_CLOUD;
        }
        if (KMLValueConverter.equals(type, "CameraMkdir")) {
            return WaypointActionType.CAMERA_MKDIR;
        }
        return null;
    }

    public static MissionType getMissionType(String type) {
        if (KMLValueConverter.equals(type, "Mapping2D")) {
            return MissionType.Mapping2D;
        }
        if (KMLValueConverter.equals(type, "Mapping3D")) {
            return MissionType.Mapping3D;
        }
        if (KMLValueConverter.equals(type, "Waypoint")) {
            return MissionType.Waypoint;
        }
        if (KMLValueConverter.equals(type, "MappingStrip")) {
            return MissionType.Strip;
        }
        return null;
    }

    public static PointTurnMode getWaypointTurnMode(String turnMode) {
        if (KMLValueConverter.equals(turnMode, "Auto")) {
            return PointTurnMode.AUTO;
        }
        if (KMLValueConverter.equals(turnMode, "Counterclockwise")) {
            return PointTurnMode.COUNTER_CLOCKWISE;
        }
        return PointTurnMode.CLOCKWISE;
    }

    public static WaypointMissionFinishedAction getActionOnFinish(String action) {
        if (KMLValueConverter.equals(action, "Hover")) {
            return WaypointMissionFinishedAction.NO_ACTION;
        }
        if (KMLValueConverter.equals(action, "GoFirstPoint")) {
            return WaypointMissionFinishedAction.GO_FIRST_WAYPOINT;
        }
        if (KMLValueConverter.equals(action, "AutoLand")) {
            return WaypointMissionFinishedAction.AUTO_LAND;
        }
        return WaypointMissionFinishedAction.GO_HOME;
    }

    public static WaypointMissionHeadingMode getHeadingMode(String headingMode) {
        if (KMLValueConverter.equals(headingMode, "ControlledByRC")) {
            return WaypointMissionHeadingMode.CONTROL_BY_REMOTE_CONTROLLER;
        }
        if (KMLValueConverter.equals(headingMode, "UsePointSetting")) {
            return WaypointMissionHeadingMode.USING_WAYPOINT_HEADING;
        }
        if (KMLValueConverter.equals(headingMode, "TowardsPoi")) {
            return WaypointMissionHeadingMode.TOWARD_POINT_OF_INTEREST;
        }
        if (KMLValueConverter.equals(headingMode, "UsingInitialDirection")) {
            return WaypointMissionHeadingMode.USING_INITIAL_DIRECTION;
        }
        return WaypointMissionHeadingMode.AUTO;
    }

    public static String convert(WaypointV2MissionTypes.WaypointV2FlightPathMode type) {
        if (type == WaypointV2MissionTypes.WaypointV2FlightPathMode.CURVATURE_CONTINUOUS_PASSED) {
            return "CurvaturePassed";
        }
        if (type == WaypointV2MissionTypes.WaypointV2FlightPathMode.GOTO_POINT_CURVE_AND_STOP) {
            return "CurvatureStop";
        }
        if (type == WaypointV2MissionTypes.WaypointV2FlightPathMode.COORDINATE_TURN) {
            return "CoordinateTurning";
        }
        if (type == WaypointV2MissionTypes.WaypointV2FlightPathMode.GOTO_FIRST_POINT_ALONG_STRAIGHT_LINE) {
            return "StraightIn";
        }
        if (type == WaypointV2MissionTypes.WaypointV2FlightPathMode.STRAIGHT_OUT) {
            return "StraightOut";
        }
        return "LineStop";
    }

    public static WaypointV2MissionTypes.WaypointV2FlightPathMode getWaypointType(String type) {
        if (KMLValueConverter.equals(type, "CurvaturePassed")) {
            return WaypointV2MissionTypes.WaypointV2FlightPathMode.CURVATURE_CONTINUOUS_PASSED;
        }
        if (KMLValueConverter.equals(type, "CurvatureStop")) {
            return WaypointV2MissionTypes.WaypointV2FlightPathMode.GOTO_POINT_CURVE_AND_STOP;
        }
        if (KMLValueConverter.equals(type, "CoordinateTurning")) {
            return WaypointV2MissionTypes.WaypointV2FlightPathMode.COORDINATE_TURN;
        }
        if (KMLValueConverter.equals(type, "StraightIn")) {
            return WaypointV2MissionTypes.WaypointV2FlightPathMode.GOTO_FIRST_POINT_ALONG_STRAIGHT_LINE;
        }
        if (KMLValueConverter.equals(type, "StraightOut")) {
            return WaypointV2MissionTypes.WaypointV2FlightPathMode.STRAIGHT_OUT;
        }
        return WaypointV2MissionTypes.WaypointV2FlightPathMode.GOTO_POINT_STRAIGHT_LINE_AND_STOP;
    }

    public static String convert(WaypointDroneType droneType) {
        if (droneType == WaypointDroneType.PM430) {
            return "PM430";
        }
        if (droneType == WaypointDroneType.PM431) {
            return "PM431";
        }
        if (droneType == WaypointDroneType.P4R) {
            return "P4R";
        }
        return "COMMON";
    }

    public static WaypointDroneType getDroneType(String droneType) {
        if (KMLValueConverter.equals(droneType, "PM430")) {
            return WaypointDroneType.PM430;
        }
        if (KMLValueConverter.equals(droneType, "PM431")) {
            return WaypointDroneType.PM431;
        }
        if (KMLValueConverter.equals(droneType, "P4R")) {
            return WaypointDroneType.P4R;
        }
        return WaypointDroneType.COMMON;
    }

    public static boolean getGimbalPitchMode(String gimbalMode) {
        return KMLValueConverter.equals(gimbalMode, "UsePointSetting");
    }

    public static int string2Int(String num) throws NumberFormatException {
        return Integer.parseInt(num);
    }

    public static double string2Double(String num) throws NumberFormatException {
        return Double.parseDouble(num);
    }

    public static float string2Float(String num) throws NumberFormatException {
        return Float.parseFloat(num);
    }

    public static boolean equals(String s1, String s2) {
        return !TextUtils.isEmpty((CharSequence)s1) && !TextUtils.isEmpty((CharSequence)s2) && s1.toLowerCase().equals(s2.toLowerCase());
    }

    public static boolean isKnownCamera(String cameraType) {
        return MappingCameraType.contains(cameraType);
    }
}

