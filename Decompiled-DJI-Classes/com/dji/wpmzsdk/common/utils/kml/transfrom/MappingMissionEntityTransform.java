/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package com.dji.wpmzsdk.common.utils.kml.transfrom;

import com.dji.industry.pilot.data.cache.model.EdgePointModelGreenDao;
import com.dji.industry.pilot.data.cache.model.MappingCameraModelGreenDao;
import com.dji.industry.pilot.data.cache.model.MappingMissionModelGreenDao;
import com.dji.industry.pilot.data.cache.model.MappingWaylineModelGreenDao;
import com.dji.wpmzsdk.common.utils.kml.GpsUtils;
import com.dji.wpmzsdk.common.utils.kml.data.MissionType;
import com.dji.wpmzsdk.common.utils.kml.model.MappingCameraType;
import com.dji.wpmzsdk.common.utils.kml.model.MissionInfoModelGreenDao;
import com.dji.wpmzsdk.common.utils.kml.transfrom.LidarOverlapWTransformKt;
import com.dji.wpmzsdk.common.utils.kml.transfrom.MappingAltitudeModeTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.MappingPayloadInfoTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.MappingShootTypeTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.MissionTransformData;
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
import dji.sdk.wpmz.value.mission.WaylineMission;
import dji.sdk.wpmz.value.mission.WaylineMissionConfig;
import dji.sdk.wpmz.value.mission.WaylineOverlap;
import dji.sdk.wpmz.value.mission.WaylinePayloadFocusMode;
import dji.sdk.wpmz.value.mission.WaylinePayloadParam;
import dji.sdk.wpmz.value.mission.WaylinePayloadReturnMode;
import dji.sdk.wpmz.value.mission.WaylineTemplate;
import dji.sdk.wpmz.value.mission.WaylineTemplateMapping2DInfo;
import dji.sdk.wpmz.value.mission.WaylineTemplateMapping3DInfo;
import dji.sdk.wpmz.value.mission.WaylineTemplateType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u001e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002J \u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\"\u001a\u00020#2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002J\u000e\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u001c2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2={"Lcom/dji/wpmzsdk/common/utils/kml/transfrom/MappingMissionEntityTransform;", "", "()V", "mAltitudeModeTransform", "Lcom/dji/wpmzsdk/common/utils/kml/transfrom/MappingAltitudeModeTransform;", "mEchoModeTransform", "Lcom/dji/wpmzsdk/common/utils/kml/transfrom/WaylineEchoModeTransform;", "mFinishActionTransform", "Lcom/dji/wpmzsdk/common/utils/kml/transfrom/WaylineFinishActionTransform;", "mFocusModeTransform", "Lcom/dji/wpmzsdk/common/utils/kml/transfrom/WaylineMappingFocusModeTransform;", "mMappingCameraTransform", "Lcom/dji/wpmzsdk/common/utils/kml/transfrom/MappingPayloadInfoTransform;", "mShootTypeTransform", "Lcom/dji/wpmzsdk/common/utils/kml/transfrom/MappingShootTypeTransform;", "mWaylinePayloadParamTransform", "Lcom/dji/wpmzsdk/common/utils/kml/transfrom/WaylinePaylodParamTransform;", "mWaylineScanModeTransform", "Lcom/dji/wpmzsdk/common/utils/kml/transfrom/WaylineScanModeTransform;", "createWaylineMission", "Ldji/sdk/wpmz/value/mission/WaylineMission;", "infoModel", "Lcom/dji/wpmzsdk/common/utils/kml/model/MissionInfoModelGreenDao;", "trans2DTemplateFrom", "Ldji/sdk/wpmz/value/mission/WaylineTemplateMapping2DInfo;", "waylineModel", "Lcom/dji/industry/pilot/data/cache/model/MappingWaylineModelGreenDao;", "edgePointModels", "", "Lcom/dji/industry/pilot/data/cache/model/EdgePointModelGreenDao;", "trans3DTemplateFrom", "Ldji/sdk/wpmz/value/mission/WaylineTemplateMapping3DInfo;", "transConfigFrom", "Ldji/sdk/wpmz/value/mission/WaylineMissionConfig;", "transCoordinateParamFrom", "Ldji/sdk/wpmz/value/mission/WaylineCoordinateParam;", "transEdgePoint", "", "Ldji/sdk/wpmz/value/mission/WaylineLocationCoordinate3D;", "points", "transFrom", "Lcom/dji/wpmzsdk/common/utils/kml/transfrom/MissionTransformData;", "model", "Lcom/dji/industry/pilot/data/cache/model/MappingMissionModelGreenDao;", "transPayloadParamsFrom", "Ldji/sdk/wpmz/value/mission/WaylinePayloadParam;", "wpmzsdk_release"})
public final class MappingMissionEntityTransform {
    @NotNull
    private final WaylineFinishActionTransform mFinishActionTransform = new WaylineFinishActionTransform();
    @NotNull
    private final MappingAltitudeModeTransform mAltitudeModeTransform = new MappingAltitudeModeTransform();
    @NotNull
    private final MappingShootTypeTransform mShootTypeTransform = new MappingShootTypeTransform();
    @NotNull
    private final WaylineMappingFocusModeTransform mFocusModeTransform = new WaylineMappingFocusModeTransform();
    @NotNull
    private final WaylineEchoModeTransform mEchoModeTransform = new WaylineEchoModeTransform();
    @NotNull
    private final WaylineScanModeTransform mWaylineScanModeTransform = new WaylineScanModeTransform();
    @NotNull
    private final MappingPayloadInfoTransform mMappingCameraTransform = new MappingPayloadInfoTransform();
    @NotNull
    private final WaylinePaylodParamTransform mWaylinePayloadParamTransform = new WaylinePaylodParamTransform();

    @NotNull
    public final MissionTransformData transFrom(@NotNull MappingMissionModelGreenDao model) {
        Intrinsics.checkNotNullParameter((Object)model, (String)"model");
        MappingWaylineModelGreenDao mappingWaylineModelGreenDao = model.getMappingWayline();
        Intrinsics.checkNotNull((Object)mappingWaylineModelGreenDao);
        MappingWaylineModelGreenDao mappingWaylineModel = mappingWaylineModelGreenDao;
        List<EdgePointModelGreenDao> list = model.getEdgePoints();
        Intrinsics.checkNotNull(list);
        List<EdgePointModelGreenDao> edgePointModels = list;
        WaylineTemplate template = new WaylineTemplate();
        template.setAutoFlightSpeed(Double.valueOf(mappingWaylineModel.getSpeed()));
        template.setTransitionalSpeed(Double.valueOf(mappingWaylineModel.getTakeoffSpeed()));
        template.setCoordinateParam(this.transCoordinateParamFrom(mappingWaylineModel));
        template.setPayloadParam(this.transPayloadParamsFrom(mappingWaylineModel));
        MissionInfoModelGreenDao missionInfoModelGreenDao = model.getMissionInfo();
        Intrinsics.checkNotNull((Object)missionInfoModelGreenDao);
        if (missionInfoModelGreenDao.getType() == MissionType.Mapping2D) {
            template.setTemplateType(WaylineTemplateType.MAPPING2D);
            template.setMapping2DInfo(this.trans2DTemplateFrom(mappingWaylineModel, edgePointModels));
        } else {
            template.setTemplateType(WaylineTemplateType.MAPPING3D);
            template.setMapping3DInfo(this.trans3DTemplateFrom(mappingWaylineModel, edgePointModels));
        }
        List<WaylinePayloadParam> waylinePayloadParam = this.transPayloadParamsFrom(mappingWaylineModel);
        template.setPayloadParam(waylinePayloadParam);
        WaylineMissionConfig missionConfig = this.transConfigFrom(mappingWaylineModel);
        MissionTransformData transformData = new MissionTransformData();
        MissionInfoModelGreenDao missionInfoModelGreenDao2 = model.getMissionInfo();
        Intrinsics.checkNotNull((Object)missionInfoModelGreenDao2);
        transformData.setMission(this.createWaylineMission(missionInfoModelGreenDao2));
        transformData.setTemplate(template);
        transformData.setMissionConfig(missionConfig);
        transformData.setExecuteMissionConfig(WaylineInfoTransformKt.createExecuteConfig(missionConfig));
        return transformData;
    }

    private final WaylineMission createWaylineMission(MissionInfoModelGreenDao infoModel) {
        WaylineMission mission = new WaylineMission();
        mission.setUpdateTime(Double.valueOf(infoModel.getUpdateTime()));
        mission.setCreateTime(Double.valueOf(infoModel.getCreateTime()));
        return mission;
    }

    private final WaylineMissionConfig transConfigFrom(MappingWaylineModelGreenDao waylineModel) {
        WaylineMissionConfig config = new WaylineMissionConfig();
        config.setFlyToWaylineMode(WaylineFlyToWaylineMode.SAFELY);
        config.setExitOnRCLostBehavior(WaylineExitOnRCLostBehavior.EXCUTE_RC_LOST_ACTION);
        config.setExitOnRCLostType(WaylineExitOnRCLostAction.GO_BACK);
        config.setGlobalTransitionalSpeed(Double.valueOf(waylineModel.getTakeoffSpeed()));
        config.setIsTakeOffPositionRefSet(false);
        config.setIsGlobalRTHHeightSet(false);
        config.setFinishAction(this.mFinishActionTransform.transFrom(waylineModel.getActionOnFinish()));
        if (waylineModel.getCamera() != null) {
            MappingCameraModelGreenDao mappingCameraModelGreenDao = waylineModel.getCamera();
            Intrinsics.checkNotNull((Object)mappingCameraModelGreenDao);
            MappingCameraType cameraType = MappingCameraType.find(mappingCameraModelGreenDao.getName());
            config.setDroneInfo(WaylineInfoTransformKt.getDroneInfoFromCamera(cameraType));
        }
        List payloadInfos = new ArrayList();
        if (waylineModel.getCamera() != null) {
            MappingCameraModelGreenDao mappingCameraModelGreenDao = waylineModel.getCamera();
            Intrinsics.checkNotNull((Object)mappingCameraModelGreenDao);
            payloadInfos.add(this.mMappingCameraTransform.transPayloadInfoFrom(mappingCameraModelGreenDao));
        }
        config.setPayloadInfo(payloadInfos);
        return config;
    }

    private final WaylineCoordinateParam transCoordinateParamFrom(MappingWaylineModelGreenDao waylineModel) {
        WaylineCoordinateParam coordinateParam = new WaylineCoordinateParam();
        coordinateParam.setCoordinateMode(WaylineCoordinateMode.WGS84);
        coordinateParam.setIsWaylinePositioningTypeSet(false);
        coordinateParam.setAltitudeMode(this.mAltitudeModeTransform.transFrom(waylineModel.getAltitudeMode()));
        if (!waylineModel.getEnableDsm()) {
            Integer n = MappingAltitudeModeTransform.ABSOLUTE;
            boolean isAbsolute = n != null && waylineModel.getAltitudeMode() == n.intValue();
            double globalShootHeight = isAbsolute ? (double)waylineModel.getRelativeDistance() : (double)(waylineModel.getAltitude() - waylineModel.getRelativeDistance());
            coordinateParam.setGlobalShootHeight(globalShootHeight);
            coordinateParam.setIsGlobalShootHeightSet(true);
        } else {
            coordinateParam.setIsSurfaceFollowParamSet(true);
            SurfaceFollowParam surfaceFollowParam = new SurfaceFollowParam();
            if (waylineModel.getDsmPath() != null) {
                surfaceFollowParam.setDsmFiles(waylineModel.getDsmPath());
            } else {
                surfaceFollowParam.setDsmFiles(new ArrayList());
            }
            surfaceFollowParam.setSurfaceFollowModeEnable(waylineModel.getEnableDsm());
            surfaceFollowParam.setSurfaceRelativeHeight(Double.valueOf(waylineModel.getDsmAltitude()));
            coordinateParam.setSurfaceFollowParam(surfaceFollowParam);
            coordinateParam.setGlobalShootHeight(Double.valueOf(waylineModel.getDsmAltitude()));
            coordinateParam.setIsGlobalShootHeightSet(true);
        }
        return coordinateParam;
    }

    private final List<WaylinePayloadParam> transPayloadParamsFrom(MappingWaylineModelGreenDao waylineModel) {
        List payloadParams = new ArrayList();
        WaylinePayloadParam payloadParam = new WaylinePayloadParam();
        payloadParam.setFocusMode(this.mFocusModeTransform.transFrom(waylineModel.getFocusMode()));
        payloadParam.setIsDewarpingEnableSet(true);
        payloadParam.setDewarpingEnable(waylineModel.getEnableDewarping());
        payloadParam.setIsModelColoringEnableSet(true);
        payloadParam.setModelColoringEnable(waylineModel.getNeedVariegation());
        payloadParam.setReturnMode(this.mEchoModeTransform.transFrom(waylineModel.getEchoMode()));
        int n = waylineModel.getSampleRate();
        WaylinePayloadReturnMode waylinePayloadReturnMode = payloadParam.getReturnMode();
        Intrinsics.checkNotNullExpressionValue((Object)waylinePayloadReturnMode, (String)"payloadParam.returnMode");
        payloadParam.setSamplingRate(this.mWaylinePayloadParamTransform.transSampleRateFrom(n, waylinePayloadReturnMode));
        payloadParam.setScanningMode(this.mWaylineScanModeTransform.transFrom(waylineModel.getScanMode()));
        if (waylineModel.getCamera() != null) {
            MappingCameraModelGreenDao mappingCameraModelGreenDao = waylineModel.getCamera();
            Intrinsics.checkNotNull((Object)mappingCameraModelGreenDao);
            MappingCameraType cameraType = MappingCameraType.find(mappingCameraModelGreenDao.getName());
            Intrinsics.checkNotNullExpressionValue((Object)((Object)cameraType), (String)"cameraType");
            payloadParam.setImageFormat(this.mWaylinePayloadParamTransform.transImageFormatFrom(cameraType));
            if (!MappingCameraType.isEP600(cameraType)) {
                payloadParam.setFocusMode(WaylinePayloadFocusMode.UNKNOWN);
            }
        }
        payloadParams.add(payloadParam);
        return payloadParams;
    }

    private final WaylineTemplateMapping2DInfo trans2DTemplateFrom(MappingWaylineModelGreenDao waylineModel, List<EdgePointModelGreenDao> edgePointModels) {
        WaylineTemplateMapping2DInfo template2DInfo = new WaylineTemplateMapping2DInfo();
        template2DInfo.setCoordinates(this.transEdgePoint(edgePointModels));
        template2DInfo.setDirection(waylineModel.getDirection());
        template2DInfo.setMargin(Double.valueOf(waylineModel.getMargin()));
        template2DInfo.setCaliFlightEnable(waylineModel.getEnableCalibrate());
        template2DInfo.setHeight(Double.valueOf(waylineModel.getAltitude()));
        template2DInfo.setEllipsoidHeight(Double.valueOf(waylineModel.getAltitude()));
        if (waylineModel.getAltitudeMode() == 1 && !((Collection)edgePointModels).isEmpty()) {
            EdgePointModelGreenDao firstPoint = edgePointModels.get(0);
            template2DInfo.setHeight(GpsUtils.egm96Altitude(waylineModel.getAltitude(), firstPoint.getLatitude(), firstPoint.getLongitude()));
        }
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
        template2DInfo.setElevationOptimizeEnable(waylineModel.getElevationOptimize());
        template2DInfo.setIsSmartObliqueGimbalPitchSet(true);
        template2DInfo.setSmartObliqueGimbalPitch(waylineModel.getFiveWayPoseWithGimbalPitch());
        template2DInfo.setShootType(this.mShootTypeTransform.transFrom(waylineModel.getPhotoMode()));
        template2DInfo.setSmartObliqueEnable(waylineModel.getFiveWayPose());
        return template2DInfo;
    }

    private final WaylineTemplateMapping3DInfo trans3DTemplateFrom(MappingWaylineModelGreenDao waylineModel, List<EdgePointModelGreenDao> edgePointModels) {
        WaylineTemplateMapping3DInfo template3DInfo = new WaylineTemplateMapping3DInfo();
        template3DInfo.setCoordinates(this.transEdgePoint(edgePointModels));
        template3DInfo.setDirection(waylineModel.getDirection());
        template3DInfo.setMargin(Double.valueOf(waylineModel.getMargin()));
        template3DInfo.setHeight(Double.valueOf(waylineModel.getAltitude()));
        if (waylineModel.getAltitudeMode() == 1) {
            template3DInfo.setEllipsoidHeight(Double.valueOf(waylineModel.getAltitude()));
            if (!((Collection)edgePointModels).isEmpty()) {
                EdgePointModelGreenDao firstPoint = edgePointModels.get(0);
                template3DInfo.setHeight(GpsUtils.egm96Altitude(waylineModel.getAltitude(), firstPoint.getLatitude(), firstPoint.getLongitude()));
                template3DInfo.setEllipsoidHeight(Double.valueOf(waylineModel.getAltitude()));
            }
        } else {
            template3DInfo.setEllipsoidHeight(Double.valueOf(waylineModel.getAltitude()));
        }
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
        template3DInfo.setCaliFlightEnable(waylineModel.getEnableCalibrate());
        template3DInfo.setInclinedFlightSpeed(Double.valueOf(waylineModel.getInclineSpeed()));
        template3DInfo.setInclinedGimbalPitch(waylineModel.getGimbalPitch());
        template3DInfo.setShootType(this.mShootTypeTransform.transFrom(waylineModel.getPhotoMode()));
        template3DInfo.setIsShootTypeSet(true);
        return template3DInfo;
    }

    private final List<WaylineLocationCoordinate3D> transEdgePoint(List<EdgePointModelGreenDao> points) {
        List edgePoint = new ArrayList();
        for (EdgePointModelGreenDao item : points) {
            WaylineLocationCoordinate3D location = new WaylineLocationCoordinate3D();
            location.setLatitude(item.getLatitude());
            location.setLongitude(item.getLongitude());
            edgePoint.add(location);
        }
        return edgePoint;
    }
}

