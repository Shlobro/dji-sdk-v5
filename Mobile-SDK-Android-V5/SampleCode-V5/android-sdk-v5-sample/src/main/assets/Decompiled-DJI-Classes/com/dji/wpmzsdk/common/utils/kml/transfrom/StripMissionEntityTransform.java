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
import com.dji.industry.pilot.data.cache.model.StripMissionModelGreenDao;
import com.dji.industry.pilot.data.cache.model.StripWaylineModelGreenDao;
import com.dji.wpmzsdk.common.utils.kml.GpsUtils;
import com.dji.wpmzsdk.common.utils.kml.model.MappingCameraType;
import com.dji.wpmzsdk.common.utils.kml.model.MissionInfoModelGreenDao;
import com.dji.wpmzsdk.common.utils.kml.transfrom.LidarOverlapWTransformKt;
import com.dji.wpmzsdk.common.utils.kml.transfrom.MappingAltitudeModeTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.MappingPayloadInfoTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.MappingShootTypeTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.MissionTransformData;
import com.dji.wpmzsdk.common.utils.kml.transfrom.StripPlanModeTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.WaylineEchoModeTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.WaylineFinishActionTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.WaylineInfoTransformKt;
import com.dji.wpmzsdk.common.utils.kml.transfrom.WaylineMappingFocusModeTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.WaylinePaylodParamTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.WaylineScanModeTransform;
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
import dji.sdk.wpmz.value.mission.WaylineTemplateMappingStripInfo;
import dji.sdk.wpmz.value.mission.WaylineTemplateType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020$2\u0006\u0010!\u001a\u00020\"H\u0002J\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0&J\u000e\u0010*\u001a\u00020+2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020-0&2\u0006\u0010!\u001a\u00020\"H\u0002J\u001e\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\"2\f\u00100\u001a\b\u0012\u0004\u0012\u00020)0&H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2={"Lcom/dji/wpmzsdk/common/utils/kml/transfrom/StripMissionEntityTransform;", "", "()V", "mAltitudeModeTransform", "Lcom/dji/wpmzsdk/common/utils/kml/transfrom/MappingAltitudeModeTransform;", "mEchoModeTransform", "Lcom/dji/wpmzsdk/common/utils/kml/transfrom/WaylineEchoModeTransform;", "mFinishActionTransform", "Lcom/dji/wpmzsdk/common/utils/kml/transfrom/WaylineFinishActionTransform;", "mFocusModeTransform", "Lcom/dji/wpmzsdk/common/utils/kml/transfrom/WaylineMappingFocusModeTransform;", "mMappingCameraTransform", "Lcom/dji/wpmzsdk/common/utils/kml/transfrom/MappingPayloadInfoTransform;", "mShootTypeTransform", "Lcom/dji/wpmzsdk/common/utils/kml/transfrom/MappingShootTypeTransform;", "mStripPlanModeTransform", "Lcom/dji/wpmzsdk/common/utils/kml/transfrom/StripPlanModeTransform;", "mWaylinePaylodParamTransform", "Lcom/dji/wpmzsdk/common/utils/kml/transfrom/WaylinePaylodParamTransform;", "mWaylineScanModeTransform", "Lcom/dji/wpmzsdk/common/utils/kml/transfrom/WaylineScanModeTransform;", "createWaylineMission", "Ldji/sdk/wpmz/value/mission/WaylineMission;", "infoModel", "Lcom/dji/wpmzsdk/common/utils/kml/model/MissionInfoModelGreenDao;", "heightModeCheck", "", "model", "Lcom/dji/industry/pilot/data/cache/model/StripMissionModelGreenDao;", "template", "Ldji/sdk/wpmz/value/mission/WaylineTemplateMappingStripInfo;", "transConfigFrom", "Ldji/sdk/wpmz/value/mission/WaylineMissionConfig;", "waylineModel", "Lcom/dji/industry/pilot/data/cache/model/StripWaylineModelGreenDao;", "transCoordinateParamFrom", "Ldji/sdk/wpmz/value/mission/WaylineCoordinateParam;", "transEdgePoint", "", "Ldji/sdk/wpmz/value/mission/WaylineLocationCoordinate3D;", "points", "Lcom/dji/industry/pilot/data/cache/model/EdgePointModelGreenDao;", "transFrom", "Lcom/dji/wpmzsdk/common/utils/kml/transfrom/MissionTransformData;", "transPayloadParamsFrom", "Ldji/sdk/wpmz/value/mission/WaylinePayloadParam;", "transStripTemplateFrom", "stripWaylineModel", "edgePointModels", "wpmzsdk_release"})
public final class StripMissionEntityTransform {
    @NotNull
    private final WaylineFinishActionTransform mFinishActionTransform = new WaylineFinishActionTransform();
    @NotNull
    private final MappingAltitudeModeTransform mAltitudeModeTransform = new MappingAltitudeModeTransform();
    @NotNull
    private final MappingShootTypeTransform mShootTypeTransform = new MappingShootTypeTransform();
    @NotNull
    private final StripPlanModeTransform mStripPlanModeTransform = new StripPlanModeTransform();
    @NotNull
    private final WaylineMappingFocusModeTransform mFocusModeTransform = new WaylineMappingFocusModeTransform();
    @NotNull
    private final WaylineEchoModeTransform mEchoModeTransform = new WaylineEchoModeTransform();
    @NotNull
    private final WaylineScanModeTransform mWaylineScanModeTransform = new WaylineScanModeTransform();
    @NotNull
    private final MappingPayloadInfoTransform mMappingCameraTransform = new MappingPayloadInfoTransform();
    @NotNull
    private final WaylinePaylodParamTransform mWaylinePaylodParamTransform = new WaylinePaylodParamTransform();

    @NotNull
    public final MissionTransformData transFrom(@NotNull StripMissionModelGreenDao model) {
        Intrinsics.checkNotNullParameter((Object)model, (String)"model");
        StripWaylineModelGreenDao stripWaylineModelGreenDao = model.getStripWayline();
        Intrinsics.checkNotNull((Object)stripWaylineModelGreenDao);
        StripWaylineModelGreenDao stripWaylineModel = stripWaylineModelGreenDao;
        List<EdgePointModelGreenDao> list = model.getEdgePoints();
        Intrinsics.checkNotNull(list);
        List<EdgePointModelGreenDao> edgePointModels = list;
        WaylineTemplate template = new WaylineTemplate();
        template.setAutoFlightSpeed(Double.valueOf(stripWaylineModel.getSpeed()));
        template.setTransitionalSpeed(Double.valueOf(stripWaylineModel.getTakeoffSpeed()));
        template.setCoordinateParam(this.transCoordinateParamFrom(stripWaylineModel));
        template.setPayloadParam(this.transPayloadParamsFrom(stripWaylineModel));
        template.setTemplateType(WaylineTemplateType.MAPPINGSTRIP);
        template.setMappingStripInfo(this.transStripTemplateFrom(stripWaylineModel, edgePointModels));
        WaylineTemplateMappingStripInfo waylineTemplateMappingStripInfo = template.getMappingStripInfo();
        Intrinsics.checkNotNullExpressionValue((Object)waylineTemplateMappingStripInfo, (String)"template.mappingStripInfo");
        this.heightModeCheck(model, waylineTemplateMappingStripInfo);
        WaylineMissionConfig missionConfig = this.transConfigFrom(stripWaylineModel);
        MissionTransformData transformData = new MissionTransformData();
        MissionInfoModelGreenDao missionInfoModelGreenDao = model.getMissionInfo();
        Intrinsics.checkNotNull((Object)missionInfoModelGreenDao);
        transformData.setMission(this.createWaylineMission(missionInfoModelGreenDao));
        transformData.setTemplate(template);
        transformData.setMissionConfig(this.transConfigFrom(stripWaylineModel));
        transformData.setExecuteMissionConfig(WaylineInfoTransformKt.createExecuteConfig(missionConfig));
        return transformData;
    }

    private final void heightModeCheck(StripMissionModelGreenDao model, WaylineTemplateMappingStripInfo template) {
        StripWaylineModelGreenDao stripWaylineModelGreenDao = model.getStripWayline();
        Intrinsics.checkNotNull((Object)stripWaylineModelGreenDao);
        template.setEllipsoidHeight(Double.valueOf(stripWaylineModelGreenDao.getAltitude()));
        StripWaylineModelGreenDao stripWaylineModelGreenDao2 = model.getStripWayline();
        Intrinsics.checkNotNull((Object)stripWaylineModelGreenDao2);
        if (stripWaylineModelGreenDao2.getAltitudeMode() == 1 && model.getEdgePoints() != null) {
            List<EdgePointModelGreenDao> list = model.getEdgePoints();
            Intrinsics.checkNotNull(list);
            if (!((Collection)list).isEmpty()) {
                List<EdgePointModelGreenDao> list2 = model.getEdgePoints();
                Intrinsics.checkNotNull(list2);
                EdgePointModelGreenDao firstPoint = list2.get(0);
                StripWaylineModelGreenDao stripWaylineModelGreenDao3 = model.getStripWayline();
                Intrinsics.checkNotNull((Object)stripWaylineModelGreenDao3);
                template.setHeight(GpsUtils.egm96Altitude(stripWaylineModelGreenDao3.getAltitude(), firstPoint.getLatitude(), firstPoint.getLongitude()));
            }
        }
        StripWaylineModelGreenDao stripWaylineModelGreenDao4 = model.getStripWayline();
        Intrinsics.checkNotNull((Object)stripWaylineModelGreenDao4);
        MappingCameraModelGreenDao mappingCameraModelGreenDao = stripWaylineModelGreenDao4.getCamera();
        Intrinsics.checkNotNull((Object)mappingCameraModelGreenDao);
        if (MappingCameraType.find(mappingCameraModelGreenDao.getName()) != MappingCameraType.EP800_LIDAR) {
            template.setCaliFlightEnable(false);
        }
    }

    private final WaylineMission createWaylineMission(MissionInfoModelGreenDao infoModel) {
        WaylineMission mission = new WaylineMission();
        mission.setUpdateTime(Double.valueOf(infoModel.getUpdateTime()));
        mission.setCreateTime(Double.valueOf(infoModel.getCreateTime()));
        return mission;
    }

    private final WaylineTemplateMappingStripInfo transStripTemplateFrom(StripWaylineModelGreenDao stripWaylineModel, List<EdgePointModelGreenDao> edgePointModels) {
        WaylineTemplateMappingStripInfo stripInfoTemplate = new WaylineTemplateMappingStripInfo();
        stripInfoTemplate.setBoundaryOptimEnable(this.mStripPlanModeTransform.transFrom(stripWaylineModel.getPlanMode()));
        stripInfoTemplate.setCoordinates(this.transEdgePoint(edgePointModels));
        stripInfoTemplate.setCuttingDistance(Double.valueOf(stripWaylineModel.getCutLength()));
        stripInfoTemplate.setIncludeCenterEnable(stripWaylineModel.getHasCenterLine());
        stripInfoTemplate.setLeftExtend(stripWaylineModel.getLeftExtend());
        stripInfoTemplate.setRightExtend(stripWaylineModel.getRightExtend());
        stripInfoTemplate.setElevationOptimizeEnable(false);
        stripInfoTemplate.setHeight(Double.valueOf(stripWaylineModel.getAltitude()));
        stripInfoTemplate.setEllipsoidHeight(Double.valueOf(stripWaylineModel.getAltitude()));
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
        stripInfoTemplate.setSingleLineEnable(stripWaylineModel.getEnableSingleLine());
        stripInfoTemplate.setShootType(this.mShootTypeTransform.transFrom(stripWaylineModel.getPhotoMode()));
        stripInfoTemplate.setIsShootTypeSet(true);
        stripInfoTemplate.setCaliFlightEnable(stripWaylineModel.getEnableCalibrate());
        return stripInfoTemplate;
    }

    @NotNull
    public final List<WaylineLocationCoordinate3D> transEdgePoint(@NotNull List<EdgePointModelGreenDao> points) {
        Intrinsics.checkNotNullParameter(points, (String)"points");
        List edgePoint = new ArrayList();
        for (EdgePointModelGreenDao item : points) {
            WaylineLocationCoordinate3D location = new WaylineLocationCoordinate3D();
            location.setLatitude(item.getLatitude());
            location.setLongitude(item.getLongitude());
            edgePoint.add(location);
        }
        return edgePoint;
    }

    private final WaylineMissionConfig transConfigFrom(StripWaylineModelGreenDao waylineModel) {
        WaylineMissionConfig config = new WaylineMissionConfig();
        config.setFlyToWaylineMode(WaylineFlyToWaylineMode.SAFELY);
        config.setExitOnRCLostBehavior(WaylineExitOnRCLostBehavior.EXCUTE_RC_LOST_ACTION);
        config.setExitOnRCLostType(WaylineExitOnRCLostAction.GO_BACK);
        config.setGlobalTransitionalSpeed(Double.valueOf(waylineModel.getTakeoffSpeed()));
        config.setIsTakeOffPositionRefSet(false);
        config.setIsGlobalRTHHeightSet(false);
        config.setFinishAction(this.mFinishActionTransform.transFrom(waylineModel.getActionOnFinish()));
        List payloadInfos = new ArrayList();
        if (waylineModel.getCamera() != null) {
            MappingCameraModelGreenDao mappingCameraModelGreenDao = waylineModel.getCamera();
            Intrinsics.checkNotNull((Object)mappingCameraModelGreenDao);
            MappingCameraType cameraType = MappingCameraType.find(mappingCameraModelGreenDao.getName());
            config.setDroneInfo(WaylineInfoTransformKt.getDroneInfoFromCamera(cameraType));
            MappingCameraModelGreenDao mappingCameraModelGreenDao2 = waylineModel.getCamera();
            Intrinsics.checkNotNull((Object)mappingCameraModelGreenDao2);
            payloadInfos.add(this.mMappingCameraTransform.transPayloadInfoFrom(mappingCameraModelGreenDao2));
        }
        config.setPayloadInfo(payloadInfos);
        return config;
    }

    private final WaylineCoordinateParam transCoordinateParamFrom(StripWaylineModelGreenDao waylineModel) {
        WaylineCoordinateParam coordinateParam = new WaylineCoordinateParam();
        coordinateParam.setCoordinateMode(WaylineCoordinateMode.WGS84);
        coordinateParam.setIsWaylinePositioningTypeSet(false);
        Integer n = MappingAltitudeModeTransform.ABSOLUTE;
        boolean isAbsolute = n != null && waylineModel.getAltitudeMode() == n.intValue();
        double globalShootHeight = isAbsolute ? (double)waylineModel.getRelativeDistance() : (double)(waylineModel.getAltitude() - waylineModel.getRelativeDistance());
        coordinateParam.setGlobalShootHeight(globalShootHeight);
        coordinateParam.setIsGlobalShootHeightSet(true);
        coordinateParam.setAltitudeMode(this.mAltitudeModeTransform.transFrom(waylineModel.getAltitudeMode()));
        return coordinateParam;
    }

    private final List<WaylinePayloadParam> transPayloadParamsFrom(StripWaylineModelGreenDao waylineModel) {
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
        payloadParam.setSamplingRate(this.mWaylinePaylodParamTransform.transSampleRateFrom(n, waylinePayloadReturnMode));
        payloadParam.setScanningMode(this.mWaylineScanModeTransform.transFrom(waylineModel.getScanMode()));
        if (waylineModel.getCamera() != null) {
            MappingCameraModelGreenDao mappingCameraModelGreenDao = waylineModel.getCamera();
            Intrinsics.checkNotNull((Object)mappingCameraModelGreenDao);
            MappingCameraType cameraType = MappingCameraType.find(mappingCameraModelGreenDao.getName());
            Intrinsics.checkNotNullExpressionValue((Object)((Object)cameraType), (String)"cameraType");
            payloadParam.setImageFormat(this.mWaylinePaylodParamTransform.transImageFormatFrom(cameraType));
            if (!MappingCameraType.isEP600(cameraType)) {
                payloadParam.setFocusMode(WaylinePayloadFocusMode.UNKNOWN);
            }
        }
        payloadParams.add(payloadParam);
        return payloadParams;
    }
}

