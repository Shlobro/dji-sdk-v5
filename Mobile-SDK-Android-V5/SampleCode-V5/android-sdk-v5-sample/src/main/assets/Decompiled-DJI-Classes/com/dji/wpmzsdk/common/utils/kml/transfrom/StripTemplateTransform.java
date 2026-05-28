/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.transfrom;

import com.dji.wpmzsdk.common.utils.kml.data.MissionType;
import com.dji.wpmzsdk.common.utils.kml.model.MappingCameraType;
import com.dji.wpmzsdk.common.utils.kml.model.StripEdgePointModel;
import com.dji.wpmzsdk.common.utils.kml.model.StripMissionModel;
import com.dji.wpmzsdk.common.utils.kml.model.StripWaylineModel;
import com.dji.wpmzsdk.common.utils.kml.transfrom.LidarOverlapWTransformKt;
import com.dji.wpmzsdk.common.utils.kml.transfrom.MappingAltitudeModeTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.MappingPayloadInfoTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.MappingShootTypeTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.MissionTransformData;
import com.dji.wpmzsdk.common.utils.kml.transfrom.ModelTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.StripEdgePointTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.StripPlanModeTransform;
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
import dji.sdk.wpmz.value.mission.WaylineMissionConfig;
import dji.sdk.wpmz.value.mission.WaylineOverlap;
import dji.sdk.wpmz.value.mission.WaylinePayloadFocusMode;
import dji.sdk.wpmz.value.mission.WaylinePayloadInfo;
import dji.sdk.wpmz.value.mission.WaylinePayloadParam;
import dji.sdk.wpmz.value.mission.WaylineTemplate;
import dji.sdk.wpmz.value.mission.WaylineTemplateMappingStripInfo;
import dji.sdk.wpmz.value.mission.WaylineTemplateType;
import java.util.ArrayList;
import java.util.List;

public class StripTemplateTransform
implements ModelTransform<StripMissionModel, MissionTransformData> {
    private WaylineFinishActionTransform mFinishActionTransform = new WaylineFinishActionTransform();
    private MappingAltitudeModeTransform mAltitudeModeTransform = new MappingAltitudeModeTransform();
    private MappingShootTypeTransform mShootTypeTransform = new MappingShootTypeTransform();
    private StripPlanModeTransform mStripPlanModeTransform = new StripPlanModeTransform();
    private StripEdgePointTransform mStripEdgePointTransform = new StripEdgePointTransform();
    private WaylineMappingFocusModeTransform mFocusModeTransform = new WaylineMappingFocusModeTransform();
    private WaylineEchoModeTransform mEchoModeTransform = new WaylineEchoModeTransform();
    private WaylineScanModeTransform mWaylineScanModeTransform = new WaylineScanModeTransform();
    private MappingPayloadInfoTransform mMappingCameraTransform = new MappingPayloadInfoTransform();
    private WaylinePaylodParamTransform mWaylinePaylodParamTransform = new WaylinePaylodParamTransform();

    @Override
    public MissionTransformData transFrom(StripMissionModel model) {
        StripWaylineModel stripWaylineModel = model.getStripWayline();
        List<StripEdgePointModel> edgePointModels = model.getEdgePoints();
        WaylineTemplate template = new WaylineTemplate();
        template.setAutoFlightSpeed(Double.valueOf(stripWaylineModel.getSpeed()));
        template.setTransitionalSpeed(Double.valueOf(stripWaylineModel.getTakeoffSpeed()));
        template.setCoordinateParam(this.transCoordinateParamFrom(stripWaylineModel));
        template.setPayloadParam(this.transPayloadParamsFrom(stripWaylineModel));
        template.setTemplateType(WaylineTemplateType.MAPPINGSTRIP);
        template.setMappingStripInfo(this.transStripTemplateFrom(stripWaylineModel, edgePointModels));
        WaylineMissionConfig missionConfig = this.transConfigFrom(stripWaylineModel);
        MissionTransformData transformData = new MissionTransformData();
        transformData.setMission(WaylineInfoTransformKt.createWaylineMission(model.getMissionInfo()));
        transformData.setTemplate(template);
        transformData.setMissionConfig(this.transConfigFrom(stripWaylineModel));
        transformData.setExecuteMissionConfig(WaylineInfoTransformKt.createExecuteConfig(missionConfig));
        return transformData;
    }

    private WaylineTemplateMappingStripInfo transStripTemplateFrom(StripWaylineModel stripWaylineModel, List<StripEdgePointModel> edgePointModels) {
        WaylineTemplateMappingStripInfo stripInfoTemplate = new WaylineTemplateMappingStripInfo();
        stripInfoTemplate.setBoundaryOptimEnable(this.mStripPlanModeTransform.transFrom(stripWaylineModel.getPlanMode()));
        stripInfoTemplate.setCoordinates(this.mStripEdgePointTransform.transFrom(edgePointModels));
        stripInfoTemplate.setCuttingDistance(Double.valueOf(stripWaylineModel.getCutLength()));
        stripInfoTemplate.setIncludeCenterEnable(stripWaylineModel.isHasCenterLine());
        stripInfoTemplate.setLeftExtend((int)stripWaylineModel.getLeftExtend());
        stripInfoTemplate.setRightExtend((int)stripWaylineModel.getRightExtend());
        stripInfoTemplate.setElevationOptimizeEnable(false);
        stripInfoTemplate.setHeight(Double.valueOf(stripWaylineModel.getAltitude()));
        stripInfoTemplate.setEllipsoidHeight(Double.valueOf(stripWaylineModel.getWgs84Altitude()));
        WaylineOverlap overlap = new WaylineOverlap();
        overlap.setIsOrthoCameraOverlapWSet(true);
        int overlapW = stripWaylineModel.getOverlapW();
        if (LidarOverlapWTransformKt.isLidarCamera(stripWaylineModel.getCamera())) {
            overlapW = LidarOverlapWTransformKt.getVisibleOverlapWValue(stripWaylineModel.getOverlapW());
        }
        overlap.setOrthoCameraOverlapW(overlapW);
        overlap.setIsOrthoCameraOverlapHSet(true);
        overlap.setOrthoCameraOverlapH(stripWaylineModel.getOverlapH());
        overlap.setIsOrthoLidarOverlapHSet(true);
        overlap.setOrthoLidarOverlapH(stripWaylineModel.getOverlapH());
        overlap.setIsOrthoLidarOverlapWSet(true);
        overlap.setOrthoLidarOverlapW(stripWaylineModel.getOverlapW());
        stripInfoTemplate.setOverlap(overlap);
        stripInfoTemplate.setBoundaryOptimEnable(this.mStripPlanModeTransform.transFrom(stripWaylineModel.getPlanMode()));
        stripInfoTemplate.setSingleLineEnable(stripWaylineModel.isEnableSingleLine());
        stripInfoTemplate.setShootType(this.mShootTypeTransform.transFrom(stripWaylineModel.getPhotoMode()));
        stripInfoTemplate.setIsShootTypeSet(true);
        stripInfoTemplate.setCaliFlightEnable(stripWaylineModel.isEnableCalibrate());
        return stripInfoTemplate;
    }

    private WaylineMissionConfig transConfigFrom(StripWaylineModel waylineModel) {
        WaylineMissionConfig config = new WaylineMissionConfig();
        config.setFlyToWaylineMode(waylineModel.isStripInclineClimbEnable() ? WaylineFlyToWaylineMode.POINT_TO_POINT : WaylineFlyToWaylineMode.SAFELY);
        if (waylineModel.getLostAction() != null) {
            config.setExitOnRCLostType(waylineModel.getLostAction());
        }
        boolean goOnExecute = waylineModel.getLostAction() == null || waylineModel.getLostAction() == WaylineExitOnRCLostAction.UNKNOWN;
        config.setExitOnRCLostBehavior(goOnExecute ? WaylineExitOnRCLostBehavior.GO_ON : WaylineExitOnRCLostBehavior.EXCUTE_RC_LOST_ACTION);
        config.setGlobalTransitionalSpeed(Double.valueOf(waylineModel.getTakeoffSpeed()));
        config.setIsTakeOffPositionRefSet(false);
        config.setIsGlobalRTHHeightSet(false);
        config.setFinishAction(this.mFinishActionTransform.transFrom(waylineModel.getActionOnFinish()));
        if (waylineModel.getStripSecureTakeoffHeight() > 0.0f) {
            config.setSecurityTakeOffHeight(Double.valueOf(waylineModel.getStripSecureTakeoffHeight()));
            config.setIsSecurityTakeOffHeightSet(true);
        }
        ArrayList<WaylinePayloadInfo> payloadInfos = new ArrayList<WaylinePayloadInfo>();
        if (waylineModel.getCamera() != null) {
            MappingCameraType cameraType = MappingCameraType.find(waylineModel.getCamera().getName());
            config.setDroneInfo(WaylineInfoTransformKt.getDroneInfoFromCamera(cameraType));
            payloadInfos.add(this.mMappingCameraTransform.transPayloadInfoFrom(waylineModel.getCamera()));
        }
        config.setPayloadInfo(payloadInfos);
        return config;
    }

    private WaylineCoordinateParam transCoordinateParamFrom(StripWaylineModel stripWaylineModel) {
        WaylineCoordinateParam waylineCoordinateParam = new WaylineCoordinateParam();
        waylineCoordinateParam.setCoordinateMode(WaylineCoordinateMode.WGS84);
        waylineCoordinateParam.setIsWaylinePositioningTypeSet(false);
        waylineCoordinateParam.setAltitudeMode(this.mAltitudeModeTransform.transFrom(stripWaylineModel.getAltitudeMode()));
        if (!stripWaylineModel.isStripEnableDsm()) {
            boolean isAbsolute = stripWaylineModel.getAltitudeMode() == MappingAltitudeModeTransform.ABSOLUTE.intValue();
            waylineCoordinateParam.setGlobalShootHeight(isAbsolute ? (double)stripWaylineModel.getRelativeDistance() : (double)(stripWaylineModel.getAltitude() - stripWaylineModel.getRelativeDistance()));
            waylineCoordinateParam.setIsGlobalShootHeightSet(true);
        } else if (!stripWaylineModel.isStripRealtimeSurfaceFollow()) {
            waylineCoordinateParam.setIsSurfaceFollowParamSet(true);
            SurfaceFollowParam stripSurfaceFollowParam = new SurfaceFollowParam();
            if (stripWaylineModel.getStripDsmPath() != null) {
                stripSurfaceFollowParam.setDsmFiles(stripWaylineModel.getStripDsmPath());
            } else {
                stripSurfaceFollowParam.setDsmFiles(new ArrayList<String>());
            }
            stripSurfaceFollowParam.setSurfaceFollowModeEnable(stripWaylineModel.isStripEnableDsm());
            stripSurfaceFollowParam.setSurfaceRelativeHeight(Double.valueOf(stripWaylineModel.getStripDsmAltitude()));
            waylineCoordinateParam.setSurfaceFollowParam(stripSurfaceFollowParam);
            waylineCoordinateParam.setGlobalShootHeight(Double.valueOf(stripWaylineModel.getStripDsmAltitude()));
            waylineCoordinateParam.setIsGlobalShootHeightSet(true);
        } else {
            SurfaceFollowParam stripSurfaceFollowParam = new SurfaceFollowParam();
            stripSurfaceFollowParam.setSurfaceFollowModeEnable(true);
            stripSurfaceFollowParam.setIsRealtimeSurfaceFollow(true);
            stripSurfaceFollowParam.setSurfaceRelativeHeight(Double.valueOf(stripWaylineModel.getStripDsmAltitude()));
            waylineCoordinateParam.setSurfaceFollowParam(stripSurfaceFollowParam);
            waylineCoordinateParam.setIsSurfaceFollowParamSet(true);
            waylineCoordinateParam.setGlobalShootHeight(Double.valueOf(stripWaylineModel.getStripDsmAltitude()));
            waylineCoordinateParam.setIsGlobalShootHeightSet(true);
        }
        return waylineCoordinateParam;
    }

    private List<WaylinePayloadParam> transPayloadParamsFrom(StripWaylineModel waylineModel) {
        ArrayList<WaylinePayloadParam> payloadParams = new ArrayList<WaylinePayloadParam>();
        WaylinePayloadParam payloadParam = new WaylinePayloadParam();
        payloadParam.setFocusMode(this.mFocusModeTransform.transFrom(waylineModel.getFocusMode()));
        payloadParam.setIsDewarpingEnableSet(true);
        payloadParam.setDewarpingEnable(waylineModel.isEnableDewarping());
        payloadParam.setIsModelColoringEnableSet(true);
        payloadParam.setModelColoringEnable(waylineModel.isNeedVariegation());
        payloadParam.setReturnMode(this.mEchoModeTransform.transFrom(waylineModel.getEchoMode()));
        payloadParam.setSamplingRate(this.mWaylinePaylodParamTransform.transSampleRateFrom(waylineModel.getSampleRate(), payloadParam.getReturnMode()));
        payloadParam.setScanningMode(this.mWaylineScanModeTransform.transFrom(waylineModel.getScanMode()));
        if (waylineModel.getCamera() != null) {
            MappingCameraType cameraType = MappingCameraType.find(waylineModel.getCamera().getName());
            payloadParam.setImageFormat(this.mWaylinePaylodParamTransform.transImageFormatFrom(cameraType));
            if (!MappingCameraType.isEP600(cameraType)) {
                payloadParam.setFocusMode(WaylinePayloadFocusMode.UNKNOWN);
            }
        }
        payloadParams.add(payloadParam);
        return payloadParams;
    }

    @Override
    public StripMissionModel transTo(MissionTransformData data) {
        WaylineTemplate template = data.getTemplates().get(0);
        WaylineMissionConfig config = data.getMissionConfig();
        WaylineTemplateMappingStripInfo stripInfo = template.getMappingStripInfo();
        List<WaylineLocationCoordinate3D> points = stripInfo.getCoordinates();
        List<StripEdgePointModel> edgePointModels = this.mStripEdgePointTransform.transTo(points);
        WaylineCoordinateParam coordinateParam = template.getCoordinateParam();
        WaylinePayloadParam payloadParam = template.getPayloadParam().get(0);
        StripWaylineModel stripWaylineModel = new StripWaylineModel();
        stripWaylineModel.setStripInclineClimbEnable(config.getFlyToWaylineMode() == WaylineFlyToWaylineMode.POINT_TO_POINT);
        stripWaylineModel.setAltitude(stripInfo.getHeight().floatValue());
        stripWaylineModel.setWgs84Altitude(stripInfo.getEllipsoidHeight().floatValue());
        stripWaylineModel.setAltitudeMode(this.mAltitudeModeTransform.transTo(coordinateParam.getAltitudeMode()));
        if (coordinateParam.getIsSurfaceFollowParamSet().booleanValue()) {
            SurfaceFollowParam surfaceFollowParam = coordinateParam.getSurfaceFollowParam();
            stripWaylineModel.setStripDsmAltitude(surfaceFollowParam.getSurfaceRelativeHeight().floatValue());
            stripWaylineModel.setStripDsmPath(surfaceFollowParam.getDsmFiles());
            stripWaylineModel.setStripEnableDsm(surfaceFollowParam.getSurfaceFollowModeEnable());
            stripWaylineModel.setStripRealtimeSurfaceFollow(surfaceFollowParam.getIsRealtimeSurfaceFollow());
        }
        stripWaylineModel.setCamera(this.mMappingCameraTransform.transPayloadInfoTo(config.getPayloadInfo().get(0), payloadParam));
        boolean isAbsolute = stripWaylineModel.getAltitudeMode() == MappingAltitudeModeTransform.ABSOLUTE.intValue();
        stripWaylineModel.setRelativeDistance(isAbsolute ? coordinateParam.getGlobalShootHeight().floatValue() : stripInfo.getHeight().floatValue() - coordinateParam.getGlobalShootHeight().floatValue());
        stripWaylineModel.setEnableDewarping(payloadParam.getDewarpingEnable());
        stripWaylineModel.setFocusMode(this.mFocusModeTransform.transTo(payloadParam.getFocusMode()));
        stripWaylineModel.setEchoMode(this.mEchoModeTransform.transTo(payloadParam.getReturnMode()));
        stripWaylineModel.setSampleRate(this.mWaylinePaylodParamTransform.transSampleRateTo(payloadParam.getSamplingRate(), payloadParam.getReturnMode()));
        stripWaylineModel.setScanMode(this.mWaylineScanModeTransform.transTo(payloadParam.getScanningMode()));
        stripWaylineModel.setNeedVariegation(payloadParam.getModelColoringEnable());
        stripWaylineModel.setEnableCalibrate(stripInfo.getCaliFlightEnable());
        WaylineOverlap overlap = stripInfo.getOverlap();
        stripWaylineModel.setOverlapH(overlap.getOrthoCameraOverlapH());
        stripWaylineModel.setOverlapW(LidarOverlapWTransformKt.isLidarCamera(stripWaylineModel.getCamera()) ? overlap.getOrthoLidarOverlapW() : overlap.getOrthoCameraOverlapW());
        stripWaylineModel.setSpeed(template.getAutoFlightSpeed().floatValue());
        stripWaylineModel.setTakeoffSpeed(config.getGlobalTransitionalSpeed().floatValue());
        stripWaylineModel.setActionOnFinish(this.mFinishActionTransform.transTo(config.getFinishAction()));
        if (config.getExitOnRCLostBehavior() == WaylineExitOnRCLostBehavior.EXCUTE_RC_LOST_ACTION) {
            stripWaylineModel.setLostAction(config.getExitOnRCLostType());
        } else {
            stripWaylineModel.setLostAction(WaylineExitOnRCLostAction.UNKNOWN);
        }
        stripWaylineModel.setEnableSingleLine(stripInfo.getSingleLineEnable());
        stripWaylineModel.setPhotoMode(this.mShootTypeTransform.transTo(stripInfo.getShootType()));
        stripWaylineModel.setCutLength(stripInfo.getCuttingDistance().intValue());
        stripWaylineModel.setHasCenterLine(stripInfo.getIncludeCenterEnable());
        stripWaylineModel.setPlanMode(this.mStripPlanModeTransform.transTo(stripInfo.getBoundaryOptimEnable()));
        stripWaylineModel.setRightExtend(stripInfo.getRightExtend().intValue());
        stripWaylineModel.setLeftExtend(stripInfo.getLeftExtend().intValue());
        stripWaylineModel.setType(MissionType.Strip);
        stripWaylineModel.setStripSecureTakeoffHeight(config.getSecurityTakeOffHeight().floatValue());
        StripMissionModel model = new StripMissionModel();
        model.setEdgePoints(edgePointModels);
        model.setStripWayline(stripWaylineModel);
        return model;
    }
}

