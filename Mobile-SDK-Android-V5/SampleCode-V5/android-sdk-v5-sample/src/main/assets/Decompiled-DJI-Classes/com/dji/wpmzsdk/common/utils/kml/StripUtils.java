/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml;

import com.dji.wpmzsdk.common.utils.kml.MappingUtils;
import com.dji.wpmzsdk.common.utils.kml.data.MissionType;
import com.dji.wpmzsdk.common.utils.kml.mission.MissionInfoModel;
import com.dji.wpmzsdk.common.utils.kml.mission.WaypointMissionFinishedAction;
import com.dji.wpmzsdk.common.utils.kml.model.MappingCameraModel;
import com.dji.wpmzsdk.common.utils.kml.model.MappingCameraType;
import com.dji.wpmzsdk.common.utils.kml.model.StripMissionModel;
import com.dji.wpmzsdk.common.utils.kml.model.StripWaylineModel;
import dji.sdk.wpmz.value.mission.WaylineExitOnRCLostAction;
import java.util.List;
import java.util.UUID;

public class StripUtils {
    private static final String TAG = StripUtils.class.getSimpleName();
    public static final float MIN_SHOT_INTERVAL = 1.0f;
    public static final float MAX_SHOT_INTERVAL = 10.0f;
    public static final float DEF_CAMERA_SHOT_INTERVAL = 2.5f;
    public static final float DEF_GD610_CAMERA_SHOT_INTERVAL = 3.0f;
    public static final int DEF_CAMERA_IMAGE_WIDTH = 3000;
    public static final int DEF_CAMERA_IMAGE_HEIGHT = 3000;
    public static final float DEF_CAMERA_SENSOR_WIDTH = 10.0f;
    public static final float DEF_CAMERA_SENSOR_HEIGHT = 10.0f;
    public static final float DEF_CAMERA_FOCAL_LENGTH = 10.0f;
    public static final float DEF_STRIP_SPEED = 15.0f;
    public static final float DEF_STRIP_TAKEOFF_SPEED = 10.0f;
    public static final int DEF_STRIP_HEIGHT = 100;
    public static final int DEF_STRIP_OVERLAP_W = 70;
    public static final int DEF_STRIP_OVERLAP_H = 80;
    public static final int DEF_STRIP_LEFT_EXTAND_DISTANCE = 50;
    public static final int DEF_STRIP_RIGHT_EXTAND_DISTANCE = 50;
    public static final int DEF_STRIP_CUT_DISTANCE = 500;
    public static final int DEF_STRIP_TASK_MODE = 0;
    public static final float DEF_STRIP_SECURE_TAKEOFF_HEIGHT = 20.0f;

    public static StripMissionModel createStripModel(String name, MissionType type, MappingCameraModel cameraModel) {
        StripMissionModel stripModel = new StripMissionModel();
        stripModel.setMissionInfo(StripUtils.createMissionInfoMode(name, type));
        stripModel.setStripWayline(StripUtils.createStripWaylineModel(cameraModel));
        return stripModel;
    }

    private static MissionInfoModel createMissionInfoMode(String name, MissionType type) {
        MissionInfoModel info = new MissionInfoModel();
        info.setName(name);
        info.setType(type);
        info.setCreateTime(System.currentTimeMillis());
        info.setUpdateTime(System.currentTimeMillis());
        info.setCollected(false);
        info.setUuid(UUID.randomUUID().toString().replace("-", "_"));
        return info;
    }

    private static StripWaylineModel createStripWaylineModel(MappingCameraModel cameraModel) {
        StripWaylineModel waylineModel = new StripWaylineModel();
        waylineModel.setActionOnFinish(WaypointMissionFinishedAction.GO_HOME);
        waylineModel.setAltitude(100.0f);
        waylineModel.setTakeoffSpeed(10.0f);
        waylineModel.setSpeed(15.0f);
        waylineModel.setOverlapW(70);
        waylineModel.setOverlapH(80);
        waylineModel.setType(MissionType.Strip);
        waylineModel.setCamera(cameraModel);
        waylineModel.setHasCenterLine(false);
        waylineModel.setCutLength(500.0f);
        waylineModel.setLeftExtend(50.0f);
        waylineModel.setRightExtend(50.0f);
        waylineModel.setPlanMode(0);
        waylineModel.setEnableCalibrate(false);
        waylineModel.setScanMode(1);
        waylineModel.setNeedVariegation(false);
        waylineModel.setLostAction(WaylineExitOnRCLostAction.GO_BACK);
        waylineModel.setStripSecureTakeoffHeight(20.0f);
        waylineModel.setStripInclineClimbEnable(false);
        waylineModel.setStripDsmAltitude(150.0f);
        return waylineModel;
    }

    public static MappingCameraModel createStripCameraModel(MappingCameraType cameraType) {
        if (cameraType != MappingCameraType.OTHER) {
            MappingCameraModel cameraModel = new MappingCameraModel();
            cameraModel.setName(cameraType.getNameStr());
            cameraModel.setSensorWidth(cameraType.getSensorW());
            cameraModel.setSensorHeight(cameraType.getSensorH());
            cameraModel.setFocalLength(cameraType.getFocalLength());
            cameraModel.setImageHeight(cameraType.getImageHeight());
            cameraModel.setImageWidth(cameraType.getImageWidth());
            cameraModel.setShotInterval(MappingUtils.getCameraShotInterval(cameraType, false));
            return cameraModel;
        }
        return null;
    }

    private static void handleCopiedStripWayline(StripWaylineModel waylineModel) {
        if (waylineModel != null) {
            waylineModel.setId(null);
        }
    }

    public static float getMaxSpeedValue(double distance, double shotInterval) {
        return (float)(distance / shotInterval);
    }

    public static void createDsmSetting(List<String> models, StripWaylineModel waylineModel) {
        List<String> paths = waylineModel.getStripDsmPath();
        if (paths == null) {
            return;
        }
        models.addAll(paths);
    }
}

