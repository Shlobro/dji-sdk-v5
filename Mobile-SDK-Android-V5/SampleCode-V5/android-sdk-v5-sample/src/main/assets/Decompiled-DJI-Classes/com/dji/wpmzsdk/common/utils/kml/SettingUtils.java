/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml;

import com.dji.wpmzsdk.common.utils.kml.converter.PilotWaypointTurnMode;
import com.dji.wpmzsdk.common.utils.kml.data.DroneInfoModel;
import com.dji.wpmzsdk.common.utils.kml.data.MissionType;
import com.dji.wpmzsdk.common.utils.kml.mission.MissionCreateType;
import com.dji.wpmzsdk.common.utils.kml.mission.MissionInfoModel;
import com.dji.wpmzsdk.common.utils.kml.mission.WaypointMissionFinishedAction;
import com.dji.wpmzsdk.common.utils.kml.mission.WaypointMissionGotoWaypointMode;
import com.dji.wpmzsdk.common.utils.kml.mission.WaypointMissionHeadingMode;
import com.dji.wpmzsdk.common.utils.kml.model.MissionInfoExtModel;
import com.dji.wpmzsdk.common.utils.kml.model.PointTurnMode;
import com.dji.wpmzsdk.common.utils.kml.model.WaylineModel;
import com.dji.wpmzsdk.common.utils.kml.model.WaypointActionModel;
import com.dji.wpmzsdk.common.utils.kml.model.WaypointDroneType;
import com.dji.wpmzsdk.common.utils.kml.model.WaypointMissionModel;
import com.dji.wpmzsdk.common.utils.kml.model.WaypointModel;
import dji.sdk.wpmz.value.mission.WaylineExitOnRCLostAction;
import java.util.ArrayList;
import java.util.UUID;

public class SettingUtils {
    private static final String TAG = "SettingUtils";
    public static final float DEF_WAYLINE_SPEED = 5.0f;
    public static final float DEF_WAYLINE_SPEED_ADD_POINT = 15.0f;
    public static final float DEF_WAYLINE_HEIGHT = 100.0f;
    public static final float DEF_WAYPOINT_SPEED = -1.0f;
    public static final float MIN_WAYPOINT_HEIGHT = -10000.0f;
    public static final float MAX_WAYPOINT_HEIGHT = 10000.0f;
    public static final float MIN_WAYPOINT_RELATIVE_HEIGHT = -1500.0f;
    public static final float MAX_WAYPOINT_RELATIVE_HEIGHT = 1500.0f;
    public static final float DEF_WAYPOINT_RADIUS = 0.2f;
    public static final float DEF_SECURE_TAKEOFF_HEIGHT = 20.0f;
    public static final float MIN_SECURE_TAKEOFF_HEIGHT = 2.0f;

    public static WaypointMissionModel createWaypointMissionModel(String name) {
        WaypointMissionModel mission = new WaypointMissionModel();
        mission.setMissionInfo(SettingUtils.createMissionInfoModel(name));
        mission.setWayline(SettingUtils.createWaylineModel());
        mission.setWaypoints(new ArrayList<WaypointModel>());
        return mission;
    }

    public static MissionInfoModel createMissionInfoModel(String name) {
        MissionInfoModel model = new MissionInfoModel();
        model.setId(0L);
        model.setName(name);
        model.setType(MissionType.Waypoint);
        model.setCreateTime(System.currentTimeMillis());
        model.setUpdateTime(System.currentTimeMillis());
        model.setCollected(false);
        model.setUuid(UUID.randomUUID().toString().replace("-", "_"));
        MissionInfoExtModel extInfo = new MissionInfoExtModel();
        extInfo.setCreateType(MissionCreateType.MAP);
        model.setExtInfo(extInfo);
        return model;
    }

    public static WaylineModel createWaylineModel() {
        WaylineModel model = new WaylineModel();
        model.setAltitude(100.0f);
        model.setAutoFlightSpeed(5.0f);
        model.setGotoFirstPointMode(WaypointMissionGotoWaypointMode.GotoWaypointSafely);
        model.setActionOnFinish(WaypointMissionFinishedAction.GO_HOME);
        model.setHeadingMode(WaypointMissionHeadingMode.AUTO);
        model.setLostAction(WaylineExitOnRCLostAction.GO_BACK);
        model.setGimbalPitchRotationEnable(false);
        model.setDroneInfo(SettingUtils.createDroneInfoModel());
        model.setWaypointTurnMode(PilotWaypointTurnMode.POINT_STOP_STRAIGHT);
        model.setSecureTakeoffHeight(20.0f);
        return model;
    }

    public static DroneInfoModel createDroneInfoModel() {
        DroneInfoModel model = new DroneInfoModel();
        model.setDroneType(WaypointDroneType.PM430);
        return model;
    }

    public static WaypointModel createWaypointModel() {
        WaypointModel waypointModel = new WaypointModel();
        waypointModel.setAltitude(100.0f);
        waypointModel.setSpeed(-1.0f);
        waypointModel.setUseWaylineAltitude(true);
        waypointModel.setUseWaylineSpeed(true);
        waypointModel.setHeading(0);
        waypointModel.setCornerRadius(0.2f);
        waypointModel.setGimbalPitch(0.0f);
        waypointModel.setTurnMode(PointTurnMode.AUTO);
        waypointModel.setActions(new ArrayList<WaypointActionModel>());
        waypointModel.setUseWaylineHeadMode(true);
        waypointModel.setUseWaylinePointType(true);
        return waypointModel;
    }
}

