/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.transfrom;

import com.dji.wpmzsdk.common.utils.kml.data.MissionType;
import com.dji.wpmzsdk.common.utils.kml.model.EdgePointModel;
import com.dji.wpmzsdk.common.utils.kml.model.LocationCoordinate3D;
import com.dji.wpmzsdk.common.utils.kml.model.Mapping2DWaylineModel;
import com.dji.wpmzsdk.common.utils.kml.model.Mapping3DWaylineModel;
import com.dji.wpmzsdk.common.utils.kml.model.MappingCameraType;
import com.dji.wpmzsdk.common.utils.kml.model.MappingMissionModel;
import com.dji.wpmzsdk.common.utils.kml.transfrom.LidarOverlapWTransformKt;
import com.dji.wpmzsdk.common.utils.kml.transfrom.MappingAltitudeModeTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.MappingEdgePointTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.MappingPayloadInfoTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.MappingShootTypeTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.MissionTransformData;
import com.dji.wpmzsdk.common.utils.kml.transfrom.ModelTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.WaylineEchoModeTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.WaylineFinishActionTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.WaylineInfoTransformKt;
import com.dji.wpmzsdk.common.utils.kml.transfrom.WaylineMappingFocusModeTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.WaylinePaylodParamTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.WaylineScanModeTransform;
import dji.sdk.wpmz.value.mission.SurfaceFollowParam;
import dji.sdk.wpmz.value.mission.WaylineCoordinateMode;
import dji.sdk.wpmz.value.mission.WaylineCoordinateParam;
import dji.sdk.wpmz.value.mission.WaylineExitOnRCLostAction;
import dji.sdk.wpmz.value.mission.WaylineExitOnRCLostBehavior;
import dji.sdk.wpmz.value.mission.WaylineFlyToWaylineMode;
import dji.sdk.wpmz.value.mission.WaylineLocationCoordinate3D;
import dji.sdk.wpmz.value.mission.WaylineMappingCameraAngleParam;
import dji.sdk.wpmz.value.mission.WaylineMappingGimbalParam;
import dji.sdk.wpmz.value.mission.WaylineMappingYawParam;
import dji.sdk.wpmz.value.mission.WaylineMissionConfig;
import dji.sdk.wpmz.value.mission.WaylineOverlap;
import dji.sdk.wpmz.value.mission.WaylinePayloadFocusMode;
import dji.sdk.wpmz.value.mission.WaylinePayloadInfo;
import dji.sdk.wpmz.value.mission.WaylinePayloadParam;
import dji.sdk.wpmz.value.mission.WaylineTemplate;
import dji.sdk.wpmz.value.mission.WaylineTemplateMapping2DInfo;
import dji.sdk.wpmz.value.mission.WaylineTemplateMapping3DInfo;
import dji.sdk.wpmz.value.mission.WaylineTemplateType;
import java.util.ArrayList;
import java.util.List;

public class MappingTemplateTransform
implements ModelTransform<MappingMissionModel, MissionTransformData> {
    private WaylineFinishActionTransform mFinishActionTransform = new WaylineFinishActionTransform();
    private MappingAltitudeModeTransform mAltitudeModeTransform = new MappingAltitudeModeTransform();
    private MappingShootTypeTransform mShootTypeTransform = new MappingShootTypeTransform();
    private MappingEdgePointTransform mEdgePointTransform = new MappingEdgePointTransform();
    private WaylineMappingFocusModeTransform mFocusModeTransform = new WaylineMappingFocusModeTransform();
    private WaylineEchoModeTransform mEchoModeTransform = new WaylineEchoModeTransform();
    private WaylineScanModeTransform mWaylineScanModeTransform = new WaylineScanModeTransform();
    private MappingPayloadInfoTransform mMappingCameraTransform = new MappingPayloadInfoTransform();
    private WaylinePaylodParamTransform mWaylinePayloadParamTransform = new WaylinePaylodParamTransform();

    @Override
    public MissionTransformData transFrom(MappingMissionModel model) {
        Mapping2DWaylineModel mapping2DWaylineModel = model.getMappingWayline();
        List<EdgePointModel> edgePointModels = model.getEdgePoints();
        WaylineTemplate template = new WaylineTemplate();
        template.setAutoFlightSpeed(Double.valueOf(mapping2DWaylineModel.getSpeed()));
        template.setTransitionalSpeed(Double.valueOf(mapping2DWaylineModel.getTakeoffSpeed()));
        template.setCoordinateParam(this.transCoordinateParamFrom(mapping2DWaylineModel));
        if (model.getMissionInfo().getType() == MissionType.Mapping2D) {
            template.setTemplateType(WaylineTemplateType.MAPPING2D);
            template.setMapping2DInfo(this.trans2DTemplateFrom(mapping2DWaylineModel, edgePointModels));
        } else {
            template.setTemplateType(WaylineTemplateType.MAPPING3D);
            template.setMapping3DInfo(this.trans3DTemplateFrom((Mapping3DWaylineModel)mapping2DWaylineModel, edgePointModels));
        }
        List<WaylinePayloadParam> waylinePayloadParam = this.transPayloadParamsFrom(mapping2DWaylineModel);
        template.setPayloadParam(waylinePayloadParam);
        WaylineMissionConfig missionConfig = this.transConfigFrom(mapping2DWaylineModel);
        MissionTransformData transformData = new MissionTransformData();
        transformData.setMission(WaylineInfoTransformKt.createWaylineMission(model.getMissionInfo()));
        transformData.setTemplate(template);
        transformData.setMissionConfig(missionConfig);
        transformData.setExecuteMissionConfig(WaylineInfoTransformKt.createExecuteConfig(missionConfig));
        return transformData;
    }

    private WaylineMissionConfig transConfigFrom(Mapping2DWaylineModel waylineModel) {
        WaylineMissionConfig config = new WaylineMissionConfig();
        config.setFlyToWaylineMode(waylineModel.isMappingInclineClimbEnable() ? WaylineFlyToWaylineMode.POINT_TO_POINT : WaylineFlyToWaylineMode.SAFELY);
        if (waylineModel.getLostAction() != null) {
            config.setExitOnRCLostType(waylineModel.getLostAction());
        }
        boolean goOnExecute = waylineModel.getLostAction() == null || waylineModel.getLostAction() == WaylineExitOnRCLostAction.UNKNOWN;
        config.setExitOnRCLostBehavior(goOnExecute ? WaylineExitOnRCLostBehavior.GO_ON : WaylineExitOnRCLostBehavior.EXCUTE_RC_LOST_ACTION);
        config.setGlobalTransitionalSpeed(Double.valueOf(waylineModel.getTakeoffSpeed()));
        if (waylineModel.getTakeOffPositionRef() != null) {
            config.setIsTakeOffPositionRefSet(true);
            WaylineLocationCoordinate3D takeoffLocation = new WaylineLocationCoordinate3D(waylineModel.getTakeOffPositionRef().getLatitude(), waylineModel.getTakeOffPositionRef().getLongitude(), waylineModel.getTakeOffPositionRef().getAltitude());
            config.setTakeOffPositionRef(takeoffLocation);
        } else {
            config.setIsTakeOffPositionRefSet(false);
        }
        config.setIsGlobalRTHHeightSet(false);
        config.setFinishAction(this.mFinishActionTransform.transFrom(waylineModel.getActionOnFinish()));
        if (waylineModel.getSecureTakeoffHeight() > 0.0f) {
            config.setSecurityTakeOffHeight(Double.valueOf(waylineModel.getSecureTakeoffHeight()));
            config.setIsSecurityTakeOffHeightSet(true);
        }
        if (waylineModel.getCamera() != null) {
            MappingCameraType cameraType = MappingCameraType.find(waylineModel.getCamera().getName());
            config.setDroneInfo(WaylineInfoTransformKt.getDroneInfoFromCamera(cameraType));
        }
        ArrayList<WaylinePayloadInfo> payloadInfos = new ArrayList<WaylinePayloadInfo>();
        if (waylineModel.getCamera() != null) {
            payloadInfos.add(this.mMappingCameraTransform.transPayloadInfoFrom(waylineModel.getCamera()));
        }
        config.setPayloadInfo(payloadInfos);
        return config;
    }

    private WaylineCoordinateParam transCoordinateParamFrom(Mapping2DWaylineModel waylineModel) {
        WaylineCoordinateParam coordinateParam = new WaylineCoordinateParam();
        coordinateParam.setCoordinateMode(WaylineCoordinateMode.WGS84);
        coordinateParam.setIsWaylinePositioningTypeSet(false);
        coordinateParam.setAltitudeMode(this.mAltitudeModeTransform.transFrom(waylineModel.getAltitudeMode()));
        if (!waylineModel.isEnableDsm()) {
            boolean isAbsolute = waylineModel.getAltitudeMode() == MappingAltitudeModeTransform.ABSOLUTE.intValue();
            coordinateParam.setGlobalShootHeight(isAbsolute ? (double)waylineModel.getRelativeDistance() : (double)(waylineModel.getAltitude() - waylineModel.getRelativeDistance()));
            coordinateParam.setIsGlobalShootHeightSet(true);
        } else if (!waylineModel.isRealtimeSurfaceFollow()) {
            coordinateParam.setIsSurfaceFollowParamSet(true);
            SurfaceFollowParam surfaceFollowParam = new SurfaceFollowParam();
            if (waylineModel.getDsmPath() != null) {
                surfaceFollowParam.setDsmFiles(waylineModel.getDsmPath());
            } else {
                surfaceFollowParam.setDsmFiles(new ArrayList<String>());
            }
            surfaceFollowParam.setSurfaceFollowModeEnable(waylineModel.isEnableDsm());
            surfaceFollowParam.setSurfaceRelativeHeight(Double.valueOf(waylineModel.getDsmAltitude()));
            coordinateParam.setSurfaceFollowParam(surfaceFollowParam);
            coordinateParam.setGlobalShootHeight(Double.valueOf(waylineModel.getDsmAltitude()));
            coordinateParam.setIsGlobalShootHeightSet(true);
        } else {
            SurfaceFollowParam surfaceFollowParam = new SurfaceFollowParam();
            surfaceFollowParam.setSurfaceFollowModeEnable(true);
            surfaceFollowParam.setIsRealtimeSurfaceFollow(true);
            surfaceFollowParam.setSurfaceRelativeHeight(Double.valueOf(waylineModel.getDsmAltitude()));
            coordinateParam.setSurfaceFollowParam(surfaceFollowParam);
            coordinateParam.setIsSurfaceFollowParamSet(true);
            coordinateParam.setGlobalShootHeight(Double.valueOf(waylineModel.getDsmAltitude()));
            coordinateParam.setIsGlobalShootHeightSet(true);
        }
        return coordinateParam;
    }

    private WaylineTemplateMapping2DInfo trans2DTemplateFrom(Mapping2DWaylineModel waylineModel, List<EdgePointModel> edgePointModels) {
        WaylineTemplateMapping2DInfo template2DInfo = new WaylineTemplateMapping2DInfo();
        template2DInfo.setCoordinates(this.mEdgePointTransform.transFrom(edgePointModels));
        template2DInfo.setDirection(waylineModel.getDirection());
        template2DInfo.setMargin(Double.valueOf(waylineModel.getMargin()));
        template2DInfo.setCaliFlightEnable(waylineModel.isEnableCalibrate());
        template2DInfo.setHeight(Double.valueOf(waylineModel.getAltitude()));
        template2DInfo.setEllipsoidHeight(Double.valueOf(waylineModel.getWgs84Altitude()));
        WaylineOverlap overlap = new WaylineOverlap();
        overlap.setIsOrthoCameraOverlapHSet(true);
        overlap.setOrthoCameraOverlapH(waylineModel.getOverlapH());
        overlap.setIsOrthoCameraOverlapWSet(true);
        int overlapW = waylineModel.getOverlapW();
        if (LidarOverlapWTransformKt.isLidarCamera(waylineModel.getCamera())) {
            overlapW = LidarOverlapWTransformKt.getVisibleOverlapWValue(waylineModel.getOverlapW());
        }
        overlap.setOrthoCameraOverlapW(overlapW);
        overlap.setIsOrthoLidarOverlapHSet(true);
        overlap.setOrthoLidarOverlapH(waylineModel.getOverlapH());
        overlap.setIsOrthoLidarOverlapWSet(true);
        overlap.setOrthoLidarOverlapW(waylineModel.getOverlapW());
        template2DInfo.setOverlap(overlap);
        template2DInfo.setElevationOptimizeEnable(waylineModel.isElevationOptimize());
        template2DInfo.setIsSmartObliqueGimbalPitchSet(true);
        template2DInfo.setSmartObliqueGimbalPitch(waylineModel.getFiveWayPoseWithGimbalPitch());
        template2DInfo.setShootType(this.mShootTypeTransform.transFrom(waylineModel.getPhotoMode()));
        template2DInfo.setSmartObliqueEnable(waylineModel.isFiveWayPose());
        if (waylineModel.isYawParamEnable()) {
            template2DInfo.setIsCameraAngleParamSet(true);
            WaylineMappingCameraAngleParam param = new WaylineMappingCameraAngleParam();
            WaylineMappingYawParam yawParam = new WaylineMappingYawParam(waylineModel.getYawParamMode(), Double.valueOf(waylineModel.getYawParamAngle()));
            param.setYawParam(yawParam);
            WaylineMappingGimbalParam gimbalParam = new WaylineMappingGimbalParam(waylineModel.getYawParamGimbalPitchMode(), Double.valueOf(waylineModel.getYawParamGimbalPitchAngle()));
            param.setGimbalParam(gimbalParam);
            template2DInfo.setCameraAngleParam(param);
        }
        return template2DInfo;
    }

    private WaylineTemplateMapping3DInfo trans3DTemplateFrom(Mapping3DWaylineModel waylineModel, List<EdgePointModel> edgePointModels) {
        WaylineTemplateMapping3DInfo template3DInfo = new WaylineTemplateMapping3DInfo();
        template3DInfo.setCoordinates(this.mEdgePointTransform.transFrom(edgePointModels));
        template3DInfo.setDirection(waylineModel.getDirection());
        template3DInfo.setMargin(Double.valueOf(waylineModel.getMargin()));
        template3DInfo.setHeight(Double.valueOf(waylineModel.getAltitude()));
        template3DInfo.setEllipsoidHeight(Double.valueOf(waylineModel.getWgs84Altitude()));
        WaylineOverlap overlap = new WaylineOverlap();
        overlap.setIsOrthoCameraOverlapHSet(true);
        overlap.setOrthoCameraOverlapH(waylineModel.getOverlapH());
        overlap.setIsOrthoCameraOverlapWSet(true);
        overlap.setOrthoCameraOverlapW(waylineModel.getOverlapW());
        overlap.setIsOrthoLidarOverlapHSet(true);
        overlap.setOrthoLidarOverlapH(waylineModel.getOverlapH());
        overlap.setIsOrthoLidarOverlapWSet(true);
        overlap.setOrthoLidarOverlapW(waylineModel.getOverlapW());
        overlap.setIsInclinedCameraOverlapHSet(true);
        overlap.setInclinedCameraOverlapH(waylineModel.getInclineOverlapH());
        overlap.setIsInclinedCameraOverlapWSet(true);
        overlap.setInclinedCameraOverlapW(waylineModel.getInclineOverlapW());
        overlap.setIsInclinedLidarOverlapHSet(true);
        overlap.setInclinedLidarOverlapH(waylineModel.getInclineOverlapH());
        overlap.setIsInclinedLidarOverlapWSet(true);
        overlap.setInclinedLidarOverlapW(waylineModel.getInclineOverlapW());
        template3DInfo.setOverlap(overlap);
        template3DInfo.setCaliFlightEnable(waylineModel.isEnableCalibrate());
        template3DInfo.setInclinedFlightSpeed(Double.valueOf(waylineModel.getInclineSpeed()));
        template3DInfo.setInclinedGimbalPitch(waylineModel.getGimbalPitch());
        template3DInfo.setShootType(this.mShootTypeTransform.transFrom(waylineModel.getPhotoMode()));
        template3DInfo.setIsShootTypeSet(true);
        return template3DInfo;
    }

    private List<WaylinePayloadParam> transPayloadParamsFrom(Mapping2DWaylineModel waylineModel) {
        ArrayList<WaylinePayloadParam> payloadParams = new ArrayList<WaylinePayloadParam>();
        WaylinePayloadParam payloadParam = new WaylinePayloadParam();
        payloadParam.setFocusMode(this.mFocusModeTransform.transFrom(waylineModel.getFocusMode()));
        payloadParam.setIsDewarpingEnableSet(true);
        payloadParam.setDewarpingEnable(waylineModel.isEnableDewarping());
        payloadParam.setIsModelColoringEnableSet(true);
        payloadParam.setModelColoringEnable(waylineModel.isNeedVariegation());
        payloadParam.setReturnMode(this.mEchoModeTransform.transFrom(waylineModel.getEchoMode()));
        payloadParam.setSamplingRate(this.mWaylinePayloadParamTransform.transSampleRateFrom(waylineModel.getSampleRate(), payloadParam.getReturnMode()));
        payloadParam.setScanningMode(this.mWaylineScanModeTransform.transFrom(waylineModel.getScanMode()));
        if (waylineModel.getCamera() != null) {
            MappingCameraType cameraType = MappingCameraType.find(waylineModel.getCamera().getName());
            payloadParam.setImageFormat(this.mWaylinePayloadParamTransform.transImageFormatFrom(cameraType));
            if (!MappingCameraType.isEP600(cameraType)) {
                payloadParam.setFocusMode(WaylinePayloadFocusMode.UNKNOWN);
            }
        }
        payloadParams.add(payloadParam);
        return payloadParams;
    }

    @Override
    public MappingMissionModel transTo(MissionTransformData data) {
        WaylineTemplate template = data.getTemplates().get(0);
        WaylineMissionConfig missionConfig = data.getMissionConfig();
        WaylineCoordinateParam coordinateParam = template.getCoordinateParam();
        WaylinePayloadParam payloadParam = template.getPayloadParam().get(0);
        if (template.getTemplateType() == WaylineTemplateType.MAPPING2D) {
            WaylineTemplateMapping2DInfo mapping2DInfo = template.getMapping2DInfo();
            List<WaylineLocationCoordinate3D> points = mapping2DInfo.getCoordinates();
            ArrayList<EdgePointModel> edgePointModels = new ArrayList<EdgePointModel>();
            for (WaylineLocationCoordinate3D item : points) {
                EdgePointModel edgePoint = new EdgePointModel();
                edgePoint.setLatitude(item.getLatitude());
                edgePoint.setLongitude(item.getLongitude());
                edgePointModels.add(edgePoint);
            }
            Mapping2DWaylineModel mapping2DWaylineModel = this.trans2DTemplateTo(template, mapping2DInfo, missionConfig, coordinateParam, payloadParam);
            MappingMissionModel model = new MappingMissionModel();
            model.setEdgePoints(edgePointModels);
            model.setMappingWayline(mapping2DWaylineModel);
            return model;
        }
        WaylineTemplateMapping3DInfo mapping3DInfo = template.getMapping3DInfo();
        List<WaylineLocationCoordinate3D> points = mapping3DInfo.getCoordinates();
        ArrayList<EdgePointModel> edgePointModels = new ArrayList<EdgePointModel>();
        for (WaylineLocationCoordinate3D item : points) {
            EdgePointModel edgePoint = new EdgePointModel();
            edgePoint.setLatitude(item.getLatitude());
            edgePoint.setLongitude(item.getLongitude());
            edgePointModels.add(edgePoint);
        }
        Mapping3DWaylineModel mapping3DWaylineModel = this.trans3DTemplateTo(template, mapping3DInfo, missionConfig, coordinateParam, payloadParam);
        MappingMissionModel model = new MappingMissionModel();
        model.setEdgePoints(edgePointModels);
        model.setMappingWayline(mapping3DWaylineModel);
        return model;
    }

    private Mapping2DWaylineModel trans2DTemplateTo(WaylineTemplate template, WaylineTemplateMapping2DInfo mapping2DInfo, WaylineMissionConfig missionConfig, WaylineCoordinateParam coordinateParam, WaylinePayloadParam payloadParam) {
        MissionType missionType = MissionType.Mapping2D;
        Mapping2DWaylineModel mapping2DWaylineModel = new Mapping2DWaylineModel();
        mapping2DWaylineModel.setActionOnFinish(this.mFinishActionTransform.transTo(missionConfig.getFinishAction()));
        if (missionConfig.getExitOnRCLostBehavior() == WaylineExitOnRCLostBehavior.EXCUTE_RC_LOST_ACTION) {
            mapping2DWaylineModel.setLostAction(missionConfig.getExitOnRCLostType());
        } else {
            mapping2DWaylineModel.setLostAction(WaylineExitOnRCLostAction.UNKNOWN);
        }
        mapping2DWaylineModel.setAltitude(mapping2DInfo.getHeight().floatValue());
        mapping2DWaylineModel.setWgs84Altitude(mapping2DInfo.getEllipsoidHeight().floatValue());
        mapping2DWaylineModel.setAltitudeMode(this.mAltitudeModeTransform.transTo(coordinateParam.getAltitudeMode()));
        if (coordinateParam.getIsSurfaceFollowParamSet().booleanValue()) {
            SurfaceFollowParam surfaceFollowParam = coordinateParam.getSurfaceFollowParam();
            mapping2DWaylineModel.setDsmAltitude(surfaceFollowParam.getSurfaceRelativeHeight().floatValue());
            mapping2DWaylineModel.setDsmPath(surfaceFollowParam.getDsmFiles());
            mapping2DWaylineModel.setEnableDsm(surfaceFollowParam.getSurfaceFollowModeEnable());
            mapping2DWaylineModel.setRealtimeSurfaceFollow(surfaceFollowParam.getIsRealtimeSurfaceFollow());
        }
        mapping2DWaylineModel.setCamera(this.mMappingCameraTransform.transPayloadInfoTo(missionConfig.getPayloadInfo().get(0), payloadParam));
        mapping2DWaylineModel.setDirection(mapping2DInfo.getDirection());
        mapping2DWaylineModel.setElevationOptimize(mapping2DInfo.getElevationOptimizeEnable());
        mapping2DWaylineModel.setFiveWayPose(mapping2DInfo.getSmartObliqueEnable());
        mapping2DWaylineModel.setFiveWayPoseWithGimbalPitch(mapping2DInfo.getSmartObliqueGimbalPitch());
        mapping2DWaylineModel.setMargin(mapping2DInfo.getMargin().floatValue());
        mapping2DWaylineModel.setEnableCalibrate(mapping2DInfo.getCaliFlightEnable());
        WaylineOverlap overlap = mapping2DInfo.getOverlap();
        mapping2DWaylineModel.setOverlapH(overlap.getOrthoCameraOverlapH());
        mapping2DWaylineModel.setOverlapW(LidarOverlapWTransformKt.isLidarCamera(mapping2DWaylineModel.getCamera()) ? overlap.getOrthoLidarOverlapW() : overlap.getOrthoCameraOverlapW());
        mapping2DWaylineModel.setEnableDewarping(payloadParam.getDewarpingEnable());
        mapping2DWaylineModel.setFocusMode(this.mFocusModeTransform.transTo(payloadParam.getFocusMode()));
        mapping2DWaylineModel.setEchoMode(this.mEchoModeTransform.transTo(payloadParam.getReturnMode()));
        mapping2DWaylineModel.setSampleRate(this.mWaylinePayloadParamTransform.transSampleRateTo(payloadParam.getSamplingRate(), payloadParam.getReturnMode()));
        mapping2DWaylineModel.setScanMode(this.mWaylineScanModeTransform.transTo(payloadParam.getScanningMode()));
        mapping2DWaylineModel.setNeedVariegation(payloadParam.getModelColoringEnable());
        mapping2DWaylineModel.setPhotoMode(this.mShootTypeTransform.transTo(mapping2DInfo.getShootType()));
        boolean isAbsolute = mapping2DWaylineModel.getAltitudeMode() == MappingAltitudeModeTransform.ABSOLUTE.intValue();
        mapping2DWaylineModel.setRelativeDistance(isAbsolute ? coordinateParam.getGlobalShootHeight().floatValue() : mapping2DInfo.getHeight().floatValue() - coordinateParam.getGlobalShootHeight().floatValue());
        mapping2DWaylineModel.setSpeed(template.getAutoFlightSpeed().floatValue());
        mapping2DWaylineModel.setTakeoffSpeed(missionConfig.getGlobalTransitionalSpeed().floatValue());
        if (missionConfig.getIsTakeOffPositionRefSet() != null && missionConfig.getIsTakeOffPositionRefSet().booleanValue()) {
            WaylineLocationCoordinate3D locationCoordinate3D = missionConfig.getTakeOffPositionRef();
            mapping2DWaylineModel.setTakeOffPositionRef(new LocationCoordinate3D(locationCoordinate3D.getLatitude(), locationCoordinate3D.getLongitude(), locationCoordinate3D.getAltitude()));
        }
        mapping2DWaylineModel.setSecureTakeoffHeight(missionConfig.getSecurityTakeOffHeight().floatValue());
        mapping2DWaylineModel.setMappingInclineClimbEnable(missionConfig.getFlyToWaylineMode() == WaylineFlyToWaylineMode.POINT_TO_POINT);
        if (mapping2DInfo.getIsCameraAngleParamSet().booleanValue()) {
            mapping2DWaylineModel.setYawParamEnable(true);
            WaylineMappingYawParam yawParam = mapping2DInfo.getCameraAngleParam().getYawParam();
            mapping2DWaylineModel.setYawParamMode(yawParam.getYawMode());
            mapping2DWaylineModel.setYawParamAngle(yawParam.getYawAngle().floatValue());
            WaylineMappingGimbalParam gimbalParam = mapping2DInfo.getCameraAngleParam().getGimbalParam();
            mapping2DWaylineModel.setYawParamGimbalPitchMode(gimbalParam.getPitchMode());
            mapping2DWaylineModel.setYawParamGimbalPitchAngle(gimbalParam.getPitchAngle().floatValue());
        }
        return mapping2DWaylineModel;
    }

    private Mapping3DWaylineModel trans3DTemplateTo(WaylineTemplate template, WaylineTemplateMapping3DInfo mapping3DInfo, WaylineMissionConfig missionConfig, WaylineCoordinateParam coordinateParam, WaylinePayloadParam payloadParam) {
        MissionType missionType = MissionType.Mapping3D;
        Mapping3DWaylineModel mapping3DWaylineModel = new Mapping3DWaylineModel();
        mapping3DWaylineModel.setActionOnFinish(this.mFinishActionTransform.transTo(missionConfig.getFinishAction()));
        if (missionConfig.getExitOnRCLostBehavior() == WaylineExitOnRCLostBehavior.EXCUTE_RC_LOST_ACTION) {
            mapping3DWaylineModel.setLostAction(missionConfig.getExitOnRCLostType());
        } else {
            mapping3DWaylineModel.setLostAction(WaylineExitOnRCLostAction.UNKNOWN);
        }
        mapping3DWaylineModel.setAltitude(mapping3DInfo.getHeight().floatValue());
        mapping3DWaylineModel.setWgs84Altitude(mapping3DInfo.getEllipsoidHeight().floatValue());
        mapping3DWaylineModel.setAltitudeMode(this.mAltitudeModeTransform.transTo(coordinateParam.getAltitudeMode()));
        if (coordinateParam.getIsSurfaceFollowParamSet().booleanValue()) {
            SurfaceFollowParam surfaceFollowParam = coordinateParam.getSurfaceFollowParam();
            mapping3DWaylineModel.setDsmAltitude(surfaceFollowParam.getSurfaceRelativeHeight().floatValue());
            mapping3DWaylineModel.setDsmPath(surfaceFollowParam.getDsmFiles());
            mapping3DWaylineModel.setEnableDsm(surfaceFollowParam.getSurfaceFollowModeEnable());
        }
        mapping3DWaylineModel.setEnableCalibrate(mapping3DInfo.getCaliFlightEnable());
        mapping3DWaylineModel.setCamera(this.mMappingCameraTransform.transPayloadInfoTo(missionConfig.getPayloadInfo().get(0), payloadParam));
        mapping3DWaylineModel.setDirection(mapping3DInfo.getDirection());
        mapping3DWaylineModel.setElevationOptimize(false);
        mapping3DWaylineModel.setFiveWayPoseWithGimbalPitch(mapping3DInfo.getInclinedGimbalPitch());
        mapping3DWaylineModel.setMargin(mapping3DInfo.getMargin().floatValue());
        mapping3DWaylineModel.setGimbalPitch(mapping3DInfo.getInclinedGimbalPitch());
        mapping3DWaylineModel.setInclineSpeed(mapping3DInfo.getInclinedFlightSpeed().floatValue());
        WaylineOverlap overlap = mapping3DInfo.getOverlap();
        mapping3DWaylineModel.setOverlapH(overlap.getOrthoCameraOverlapH());
        mapping3DWaylineModel.setOverlapW(overlap.getOrthoCameraOverlapW());
        mapping3DWaylineModel.setInclineOverlapW(overlap.getInclinedCameraOverlapW());
        mapping3DWaylineModel.setInclineOverlapH(overlap.getInclinedCameraOverlapH());
        mapping3DWaylineModel.setEnableDewarping(payloadParam.getDewarpingEnable());
        mapping3DWaylineModel.setFocusMode(this.mFocusModeTransform.transTo(payloadParam.getFocusMode()));
        mapping3DWaylineModel.setEchoMode(this.mEchoModeTransform.transTo(payloadParam.getReturnMode()));
        mapping3DWaylineModel.setSampleRate(this.mWaylinePayloadParamTransform.transSampleRateTo(payloadParam.getSamplingRate(), payloadParam.getReturnMode()));
        mapping3DWaylineModel.setScanMode(this.mWaylineScanModeTransform.transTo(payloadParam.getScanningMode()));
        mapping3DWaylineModel.setNeedVariegation(payloadParam.getModelColoringEnable());
        mapping3DWaylineModel.setPhotoMode(this.mShootTypeTransform.transTo(mapping3DInfo.getShootType()));
        boolean isAbsolute = mapping3DWaylineModel.getAltitudeMode() == MappingAltitudeModeTransform.ABSOLUTE.intValue();
        mapping3DWaylineModel.setRelativeDistance(isAbsolute ? coordinateParam.getGlobalShootHeight().floatValue() : mapping3DInfo.getHeight().floatValue() - coordinateParam.getGlobalShootHeight().floatValue());
        mapping3DWaylineModel.setSpeed(template.getAutoFlightSpeed().floatValue());
        mapping3DWaylineModel.setTakeoffSpeed(missionConfig.getGlobalTransitionalSpeed().floatValue());
        if (missionConfig.getIsTakeOffPositionRefSet() != null && missionConfig.getIsTakeOffPositionRefSet().booleanValue()) {
            WaylineLocationCoordinate3D locationCoordinate3D = missionConfig.getTakeOffPositionRef();
            mapping3DWaylineModel.setTakeOffPositionRef(new LocationCoordinate3D(locationCoordinate3D.getLatitude(), locationCoordinate3D.getLongitude(), locationCoordinate3D.getAltitude()));
        }
        mapping3DWaylineModel.setSecureTakeoffHeight(missionConfig.getSecurityTakeOffHeight().floatValue());
        mapping3DWaylineModel.setMappingInclineClimbEnable(missionConfig.getFlyToWaylineMode() == WaylineFlyToWaylineMode.POINT_TO_POINT);
        return mapping3DWaylineModel;
    }
}

