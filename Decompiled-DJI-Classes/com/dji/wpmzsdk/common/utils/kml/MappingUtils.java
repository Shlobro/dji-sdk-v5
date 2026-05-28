/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 *  androidx.annotation.Nullable
 *  org.jetbrains.annotations.NotNull
 */
package com.dji.wpmzsdk.common.utils.kml;

import android.location.Location;
import androidx.annotation.Nullable;
import com.dji.wpmzsdk.common.utils.kml.CollectionUtil;
import com.dji.wpmzsdk.common.utils.kml.GpsUtils;
import com.dji.wpmzsdk.common.utils.kml.data.MissionType;
import com.dji.wpmzsdk.common.utils.kml.mission.MissionInfoModel;
import com.dji.wpmzsdk.common.utils.kml.mission.WaypointMissionFinishedAction;
import com.dji.wpmzsdk.common.utils.kml.model.CameraType;
import com.dji.wpmzsdk.common.utils.kml.model.DJILatLng;
import com.dji.wpmzsdk.common.utils.kml.model.EdgePointModel;
import com.dji.wpmzsdk.common.utils.kml.model.Mapping2DWaylineModel;
import com.dji.wpmzsdk.common.utils.kml.model.Mapping3DWaylineModel;
import com.dji.wpmzsdk.common.utils.kml.model.MappingCameraModel;
import com.dji.wpmzsdk.common.utils.kml.model.MappingCameraType;
import com.dji.wpmzsdk.common.utils.kml.model.MappingMissionModel;
import com.dji.wpmzsdk.common.utils.kml.model.MissionInfoExtModel;
import dji.sdk.wpmz.value.mission.WaylineExitOnRCLostAction;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;

public class MappingUtils {
    public static final int EP800_CALI_POINTS_NUM = 32;
    public static final int MAX_RELATIVE_ALTITUDE = 1500;
    public static final int MIN_RELATIVE_ALTITUDE = 12;
    public static final int DEF_RELATIVE_ALTITUDE = 100;
    public static final int MIN_RELATIVE_TO_TAKEOFF_DISTANCE = -200;
    public static final int MAX_RELATIVE_TO_TAKEOFF_DISTANCE = 1500;
    public static final int DEF_RELATIVE_TO_TAKEOFF_DISTANCE = 0;
    public static final int MAX_ABSOLUTE_ALTITUDE = 10000;
    public static final int MIN_ABSOLUTE_ALTITUDE = -10000;
    public static final int DEF_ABSOLUTE_ALTITUDE = 0;
    public static final int MAX_RELATIVE_TO_TARGET_ALTITUDE = 1500;
    public static final int MIN_RELATIVE_TO_TARGET_ALTITUDE = 0;
    public static final int DEF_RELATIVE_TO_TARGET_ALTITUDE = 100;
    public static final int MAX_ALTITUDE = 10000;
    public static final int MIN_ALTITUDE = -10000;
    public static final int MAX_DIRECTION = 359;
    public static final int MIN_DIRECTION = 0;
    public static final float MARGIN_COE = 1.0f;
    public static final int MAX_GIMBAL_PITCH = -40;
    public static final int MIN_GIMBAL_PITCH = -85;
    public static final int MAX_OVERLAP = 90;
    public static final int MIN_OVERLAP = 10;
    public static final int MAX_SPEED = 15;
    public static final int MIN_SPEED = 1;
    public static final float MIN_SHOT_INTERVAL = 1.0f;
    public static final float MAX_SHOT_INTERVAL = 10.0f;
    public static final float DEF_CAMERA_SHOT_INTERVAL = 2.5f;
    public static final float DEF_GD610_CAMERA_SHOT_INTERVAL = 3.0f;
    public static final float DEF_EP600_CAMERA_SHOT_INTERVAL_WITH_FIVE_WAY_POSE = 5.0f;
    public static final float DEF_EP600_CAMERA_SHOT_INTERVAL_WITH_SINGLE_WAY_POSE = 1.0f;
    public static final int DEF_CAMERA_IMAGE_WIDTH = 3000;
    public static final int DEF_CAMERA_IMAGE_HEIGHT = 3000;
    public static final float DEF_CAMERA_SENSOR_WIDTH = 10.0f;
    public static final float DEF_CAMERA_SENSOR_HEIGHT = 10.0f;
    public static final float DEF_CAMERA_FOCAL_LENGTH = 10.0f;
    public static final float DEF_MAPPING_SPEED = 15.0f;
    public static final float DEF_MAPPING_TAKEOFF_SPEED = 10.0f;
    public static final int DEF_MAPPING_HEIGHT = 100;
    public static final float DEF_MAPPING_MARGIN = 0.0f;
    public static final float DEF_MAPPING_MARGIN_VALUE = 0.25f;
    public static final float DEF_MAPPING_MARGIN_MAX = 1.0f;
    public static final float DEF_MAPPING_MARGIN_STEP = 0.01f;
    public static final int DEF_MAPPING_LIDAR_OVERLAP_W = 20;
    public static final int DEF_MAPPING_LIDAR_OVERLAP_H = 70;
    public static final int DEF_MAPPING_OVERLAP_W = 70;
    public static final int DEF_MAPPING_OVERLAP_H = 80;
    public static final int DEF_MAPPING_INCLINE_OVERLAP_W = 60;
    public static final int DEF_MAPPING_INCLINE_OVERLAP_H = 70;
    public static final int DEF_MAPPING_GIMBAL_PITCH = -45;
    public static final int DEF_MAPPING_DSM_HEIGHT = 150;
    public static final int DEF_MAPPING_MIN_DSM_HEIGHT = 25;
    public static final int DEF_MAPPING_MAX_DSM_HEIGHT = 1500;
    public static final int DEF_MAPPING_MIN_REALTIME_DSM_HEIGHT = 30;
    public static final int DEF_MAPPING_MAX_REALTIME_DSM_HEIGHT = 200;
    public static final double LIDAR_COEFF_K = 0.875;
    public static final double LIDAR_COEFF_B = 0.125;
    public static final double LIDAR_VARIEGATION_OVERLAP_H = 70.0;
    public static final int LIDAR_SCANMODE_NON_REPEAT = 0;
    public static final int LIDAR_SCANMODE_REPEAT = 1;
    public static final int MAPPING_CALI_DRAW_TYPE_NONE = 0;
    public static final int MAPPING_CALI_DRAW_TYPE_NORMAL = 1;
    public static final int MAPPING_CALI_DRAW_TYPE_ELEVATION = 2;
    public static final int MAPPING_METER_TO_CENTIMETER = 100;
    public static final int MAPPING_GSD_FACTOR = 1000;
    public static final double MAX_AREA = 1.0E9;
    public static final float DEF_SECURE_TAKEOFF_HEIGHT = 20.0f;
    public static final float MIN_SECURE_TAKEOFF_HEIGHT = 2.0f;

    public static MappingMissionModel createMappingModel(String name, MissionType type, MappingCameraModel cameraModel, List<? extends DJILatLng> initPoints) {
        MappingMissionModel mappingModel = new MappingMissionModel();
        mappingModel.setMissionInfo(MappingUtils.createMissionInfoMode(name, type));
        mappingModel.setMappingWayline(type == MissionType.Mapping3D ? MappingUtils.createMapping3DWaylineModel(cameraModel) : MappingUtils.createMapping2DWaylineModel(cameraModel));
        MappingUtils.addInitPoints(mappingModel, initPoints);
        return mappingModel;
    }

    private static void addInitPoints(MappingMissionModel mappingModel, List<? extends DJILatLng> initPoints) {
        if (initPoints == null) {
            return;
        }
        ArrayList<EdgePointModel> points = new ArrayList<EdgePointModel>();
        for (DJILatLng dJILatLng : initPoints) {
            points.add(new EdgePointModel(dJILatLng.latitude, dJILatLng.longitude));
        }
        mappingModel.setEdgePoints(points);
    }

    private static MissionInfoModel createMissionInfoMode(String name, MissionType type) {
        MissionInfoModel info = new MissionInfoModel();
        info.setName(name);
        info.setType(type);
        info.setCreateTime(System.currentTimeMillis());
        info.setUpdateTime(System.currentTimeMillis());
        info.setCollected(false);
        info.setUuid(UUID.randomUUID().toString().replace("-", "_"));
        info.setExtInfo(new MissionInfoExtModel());
        return info;
    }

    private static Mapping2DWaylineModel createMapping2DWaylineModel(MappingCameraModel cameraModel) {
        Mapping2DWaylineModel waylineModel = new Mapping2DWaylineModel();
        waylineModel.setActionOnFinish(WaypointMissionFinishedAction.GO_HOME);
        waylineModel.setAltitude(100.0f);
        waylineModel.setTakeoffSpeed(10.0f);
        waylineModel.setSpeed(15.0f);
        waylineModel.setMargin(0.0f);
        waylineModel.setOverlapW(70);
        waylineModel.setOverlapH(80);
        waylineModel.setDirection(0);
        waylineModel.setCamera(cameraModel);
        waylineModel.setDsmAltitude(150.0f);
        waylineModel.setFiveWayPoseWithGimbalPitch(-45);
        waylineModel.setScanMode(1);
        waylineModel.setNeedVariegation(true);
        waylineModel.setLostAction(WaylineExitOnRCLostAction.GO_BACK);
        waylineModel.setSecureTakeoffHeight(20.0f);
        waylineModel.setMappingInclineClimbEnable(false);
        waylineModel.setElevationOptimize(true);
        return waylineModel;
    }

    public static MappingCameraModel createMappingCameraModel(MappingCameraType cameraType) {
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

    public static Mapping3DWaylineModel createMapping3DWaylineModel(MappingCameraModel cameraModel) {
        Mapping3DWaylineModel waylineModel = new Mapping3DWaylineModel();
        waylineModel.setActionOnFinish(WaypointMissionFinishedAction.GO_HOME);
        waylineModel.setAltitude(100.0f);
        waylineModel.setTakeoffSpeed(10.0f);
        waylineModel.setSpeed(15.0f);
        waylineModel.setMargin(0.0f);
        waylineModel.setOverlapW(70);
        waylineModel.setOverlapH(80);
        waylineModel.setDirection(0);
        waylineModel.setCamera(cameraModel);
        waylineModel.setInclineOverlapH(70);
        waylineModel.setInclineOverlapW(60);
        waylineModel.setInclineSpeed(15.0f);
        waylineModel.setGimbalPitch(-45);
        waylineModel.setScanMode(1);
        waylineModel.setNeedVariegation(true);
        waylineModel.setLostAction(WaylineExitOnRCLostAction.GO_BACK);
        waylineModel.setSecureTakeoffHeight(20.0f);
        waylineModel.setMappingInclineClimbEnable(false);
        return waylineModel;
    }

    public static void createDsmSetting(List<String> models, Mapping2DWaylineModel waylineModel) {
        List<String> paths = waylineModel.getDsmPath();
        if (paths == null) {
            return;
        }
        models.addAll(paths);
    }

    private static void handleCopiedMappingWayline(Mapping2DWaylineModel waylineModel) {
        if (waylineModel != null) {
            waylineModel.setId(null);
        }
    }

    public static float getMaxSpeedValue(double distance, double shotInterval) {
        return (float)(distance / shotInterval);
    }

    public static MappingCameraType getMappingCameraType(CameraType cameraType) {
        MappingCameraType type = MappingCameraType.OTHER;
        if (cameraType == null) {
            return type;
        }
        switch (cameraType) {
            case DJICameraTypeFC330X: {
                type = MappingCameraType.P4;
                break;
            }
            case DJICameraTypeFC300X: {
                type = MappingCameraType.P4P;
                break;
            }
            case DJICameraTypeFC6310A: {
                type = MappingCameraType.P4A;
                break;
            }
            case P4P_V2_CAMERA: {
                type = MappingCameraType.P4PV2;
                break;
            }
            default: {
                type = MappingCameraType.P4;
            }
        }
        return type;
    }

    @Nullable
    public static DJILatLng getCenter(List<EdgePointModel> edgePoints) {
        if (edgePoints == null || edgePoints.size() == 0) {
            return null;
        }
        double minLat = edgePoints.get(0).getLatitude();
        double minLng = edgePoints.get(0).getLongitude();
        double maxLat = edgePoints.get(0).getLatitude();
        double maxLng = edgePoints.get(0).getLongitude();
        for (int i = 0; i != edgePoints.size(); ++i) {
            double curLat = edgePoints.get(i).getLatitude();
            double curLng = edgePoints.get(i).getLongitude();
            if (curLat > maxLat) {
                maxLat = curLat;
            }
            if (curLat < minLat) {
                minLat = curLat;
            }
            if (curLng > maxLng) {
                maxLng = curLng;
            }
            if (!(curLng < minLng)) continue;
            minLng = curLng;
        }
        return new DJILatLng((maxLat + minLat) / 2.0, (maxLng + minLng) / 2.0);
    }

    public static float getCameraShotInterval(MappingCameraType cameraType, boolean needFivePose) {
        if (MappingCameraType.isGD610Series(cameraType)) {
            return 3.0f;
        }
        if (cameraType == MappingCameraType.SHARE_102S) {
            return 1.0f;
        }
        if (MappingCameraType.isEP600(cameraType)) {
            if (needFivePose) {
                return 5.0f;
            }
            return 1.0f;
        }
        return 2.5f;
    }

    public static boolean isMappingCamera(MappingCameraType type) {
        return MappingCameraType.isEP600(type) || MappingCameraType.isEP800(type);
    }

    public static float calculateGsdValueWithImageSize(float height, MappingCameraType cameraType, MappingCameraModel cameraModel) {
        if (cameraType == MappingCameraType.NULL) {
            return 0.0f;
        }
        if (cameraType != MappingCameraType.OTHER) {
            if (cameraType == MappingCameraType.EP800_LIDAR) {
                return Math.max(100.0f * height * MappingCameraType.EP800_VISUAL.getSensorH() / (MappingCameraType.EP800_VISUAL.getFocalLength() * (float)MappingCameraType.EP800_VISUAL.getImageHeight()), 100.0f * height * MappingCameraType.EP800_VISUAL.getSensorW() / (MappingCameraType.EP800_VISUAL.getFocalLength() * (float)MappingCameraType.EP800_VISUAL.getImageWidth()));
            }
            return Math.max(100.0f * height * cameraType.getSensorH() / (cameraType.getFocalLength() * (float)cameraType.getImageHeight()), 100.0f * height * cameraType.getSensorW() / (cameraType.getFocalLength() * (float)cameraType.getImageWidth()));
        }
        if (cameraModel != null) {
            if (cameraModel.getImageHeight() == 0 || cameraModel.getImageWidth() == 0) {
                return MappingUtils.calculateGsdValueWithGsdBase(height, cameraType, cameraModel);
            }
            return Math.max(100.0f * height * cameraType.getSensorH() / (cameraType.getFocalLength() * (float)cameraType.getImageHeight()), 100.0f * height * cameraType.getSensorW() / (cameraType.getFocalLength() * (float)cameraType.getImageWidth()));
        }
        return 0.0f;
    }

    public static float calculateTerraGsdValue(float height, MappingCameraType cameraType, boolean terraMappingUseIrLens) {
        boolean isIrCamera;
        int imageWidth = 960;
        int imageHeight = 720;
        boolean bl = isIrCamera = cameraType == MappingCameraType.PM320_IR || cameraType == MappingCameraType.GD610_IR || cameraType == MappingCameraType.GD612_IR;
        if (isIrCamera || terraMappingUseIrLens) {
            imageWidth = 640;
            imageHeight = 512;
        }
        return Math.max(100.0f * height * cameraType.getSensorH() / (cameraType.getFocalLength() * (float)imageHeight), 100.0f * height * cameraType.getSensorW() / (cameraType.getFocalLength() * (float)imageWidth));
    }

    public static DJILatLng calculateCenterLocation(@NotNull List<DJILatLng> areaPoints) {
        Location centerLocation = GpsUtils.getCenter(CollectionUtil.transform(areaPoints, GpsUtils::convertToLocation));
        return new DJILatLng(centerLocation.getLatitude(), centerLocation.getLongitude(), centerLocation.getAltitude(), centerLocation.getAccuracy());
    }

    public static float calculateGsdValueWithGsdBase(float height, MappingCameraType cameraType, MappingCameraModel cameraModel) {
        double gsdBase;
        if (cameraType != MappingCameraType.OTHER) {
            return height * 100.0f / cameraType.getGsdBase();
        }
        if (cameraModel != null && (gsdBase = (double)(1000.0f * cameraModel.getSensorWidth() * cameraModel.getFocalLength() / 35.0f)) != 0.0) {
            return height * 100.0f / (float)gsdBase;
        }
        return 0.0f;
    }
}

