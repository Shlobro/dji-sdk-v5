/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package com.dji.wpmzsdk.common.utils.kml.transfrom;

import android.util.Pair;
import com.dji.industry.pilot.data.cache.model.WaypointActionModelGreenDao;
import com.dji.wpmzsdk.common.utils.kml.GpsUtils;
import com.dji.wpmzsdk.common.utils.kml.data.DroneInfoModel;
import com.dji.wpmzsdk.common.utils.kml.mission.RTKReferenceStationSource;
import com.dji.wpmzsdk.common.utils.kml.mission.WaypointMissionHeadingMode;
import com.dji.wpmzsdk.common.utils.kml.mission.WaypointV2MissionTypes;
import com.dji.wpmzsdk.common.utils.kml.model.DroneCameraModel;
import com.dji.wpmzsdk.common.utils.kml.model.DroneHeightModel;
import com.dji.wpmzsdk.common.utils.kml.model.MissionInfoModelGreenDao;
import com.dji.wpmzsdk.common.utils.kml.model.PayloadConfigInfoModel;
import com.dji.wpmzsdk.common.utils.kml.model.WaylineModelGreenDao;
import com.dji.wpmzsdk.common.utils.kml.model.WaypointActionType;
import com.dji.wpmzsdk.common.utils.kml.model.WaypointMissionModelGreenDao;
import com.dji.wpmzsdk.common.utils.kml.model.WaypointModelGreenDao;
import com.dji.wpmzsdk.common.utils.kml.transfrom.MissionTransformData;
import com.dji.wpmzsdk.common.utils.kml.transfrom.WaylineDroneTypeTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.WaylineFinishActionTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.WaylineHeadingModeTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.WaylineInfoTransformKt;
import com.dji.wpmzsdk.common.utils.kml.transfrom.WaylinePayloadInfoTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.WaylinePaylodParamTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.WaylineRtkTypeTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.WaylineToFirstPointTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.WaylineTurnModeTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.WaypointActionEntityTransform;
import dji.sdk.wpmz.value.mission.ActionTakePhotoParam;
import dji.sdk.wpmz.value.mission.WaylineActionGroup;
import dji.sdk.wpmz.value.mission.WaylineActionInfo;
import dji.sdk.wpmz.value.mission.WaylineActionNodeList;
import dji.sdk.wpmz.value.mission.WaylineActionTreeNode;
import dji.sdk.wpmz.value.mission.WaylineActionTrigger;
import dji.sdk.wpmz.value.mission.WaylineActionTriggerType;
import dji.sdk.wpmz.value.mission.WaylineActionType;
import dji.sdk.wpmz.value.mission.WaylineActionsRelationType;
import dji.sdk.wpmz.value.mission.WaylineAltitudeMode;
import dji.sdk.wpmz.value.mission.WaylineCoordinateMode;
import dji.sdk.wpmz.value.mission.WaylineCoordinateParam;
import dji.sdk.wpmz.value.mission.WaylineExitOnRCLostAction;
import dji.sdk.wpmz.value.mission.WaylineExitOnRCLostBehavior;
import dji.sdk.wpmz.value.mission.WaylineLocationCoordinate2D;
import dji.sdk.wpmz.value.mission.WaylineLocationCoordinate3D;
import dji.sdk.wpmz.value.mission.WaylineMission;
import dji.sdk.wpmz.value.mission.WaylineMissionConfig;
import dji.sdk.wpmz.value.mission.WaylinePayloadInfo;
import dji.sdk.wpmz.value.mission.WaylinePayloadParam;
import dji.sdk.wpmz.value.mission.WaylineTemplate;
import dji.sdk.wpmz.value.mission.WaylineTemplateType;
import dji.sdk.wpmz.value.mission.WaylineTemplateWaypointInfo;
import dji.sdk.wpmz.value.mission.WaylineWaypoint;
import dji.sdk.wpmz.value.mission.WaylineWaypointPitchMode;
import dji.sdk.wpmz.value.mission.WaylineWaypointTurnMode;
import dji.sdk.wpmz.value.mission.WaylineWaypointTurnParam;
import dji.sdk.wpmz.value.mission.WaylineWaypointYawMode;
import dji.sdk.wpmz.value.mission.WaylineWaypointYawParam;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u0000\u00ce\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J&\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J\u000e\u0010'\u001a\u00020(2\u0006\u0010#\u001a\u00020$J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\u0018\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u0010+\u001a\u00020,H\u0002J$\u00101\u001a\u00020\"2\f\u00102\u001a\b\u0012\u0004\u0012\u0002030\u001e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c04H\u0002J\u0016\u00105\u001a\b\u0012\u0004\u0012\u0002060\u001e2\u0006\u00107\u001a\u000208H\u0002J\u001e\u00109\u001a\u00020&2\u0006\u0010+\u001a\u00020,2\f\u0010:\u001a\b\u0012\u0004\u0012\u0002030\u001eH\u0002J\u0018\u0010;\u001a\u00020<2\u0006\u0010+\u001a\u00020,2\u0006\u0010=\u001a\u000203H\u0002J\u001e\u0010>\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020A0?2\b\u0010B\u001a\u0004\u0018\u00010CH\u0002J\u001c\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001e2\f\u00102\u001a\b\u0012\u0004\u0012\u0002030\u001eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006E"}, d2={"Lcom/dji/wpmzsdk/common/utils/kml/transfrom/WaypointMissionEntityTransform;", "", "()V", "mFinishActionTransform", "Lcom/dji/wpmzsdk/common/utils/kml/transfrom/WaylineFinishActionTransform;", "mToFirstPointTransform", "Lcom/dji/wpmzsdk/common/utils/kml/transfrom/WaylineToFirstPointTransform;", "mWaylineDroneTypeTransform", "Lcom/dji/wpmzsdk/common/utils/kml/transfrom/WaylineDroneTypeTransform;", "mWaylineHeadingModeTransform", "Lcom/dji/wpmzsdk/common/utils/kml/transfrom/WaylineHeadingModeTransform;", "mWaylinePayloadInfoTransform", "Lcom/dji/wpmzsdk/common/utils/kml/transfrom/WaylinePayloadInfoTransform;", "mWaylinePaylodParamTransform", "Lcom/dji/wpmzsdk/common/utils/kml/transfrom/WaylinePaylodParamTransform;", "mWaylineRtkTypeTransform", "Lcom/dji/wpmzsdk/common/utils/kml/transfrom/WaylineRtkTypeTransform;", "mWaylineTurnModeTransform", "Lcom/dji/wpmzsdk/common/utils/kml/transfrom/WaylineTurnModeTransform;", "createWaylineMission", "Ldji/sdk/wpmz/value/mission/WaylineMission;", "infoModel", "Lcom/dji/wpmzsdk/common/utils/kml/model/MissionInfoModelGreenDao;", "getActionTrigger", "Ldji/sdk/wpmz/value/mission/WaylineActionTrigger;", "item", "Lcom/dji/industry/pilot/data/cache/model/WaypointActionModelGreenDao;", "getIntevalShootActionGroup", "Ldji/sdk/wpmz/value/mission/WaylineActionGroup;", "actionGroups", "", "waypointIndex", "", "heightModeCheck", "", "waypointMission", "Lcom/dji/wpmzsdk/common/utils/kml/model/WaypointMissionModelGreenDao;", "waypointInfo", "Ldji/sdk/wpmz/value/mission/WaylineTemplateWaypointInfo;", "trans", "Lcom/dji/wpmzsdk/common/utils/kml/transfrom/MissionTransformData;", "transConfigFrom", "Ldji/sdk/wpmz/value/mission/WaylineMissionConfig;", "waylineModel", "Lcom/dji/wpmzsdk/common/utils/kml/model/WaylineModelGreenDao;", "transCoordinateParamFrom", "Ldji/sdk/wpmz/value/mission/WaylineCoordinateParam;", "rtkSource", "Lcom/dji/wpmzsdk/common/utils/kml/mission/RTKReferenceStationSource;", "transFromIntervalActions", "waypoints", "Lcom/dji/wpmzsdk/common/utils/kml/model/WaypointModelGreenDao;", "", "transPayloadParamsFrom", "Ldji/sdk/wpmz/value/mission/WaylinePayloadParam;", "droneInfoModel", "Lcom/dji/wpmzsdk/common/utils/kml/data/DroneInfoModel;", "transWaylineTemplateFrom", "waypointModels", "transWaylineWaypointFrom", "Ldji/sdk/wpmz/value/mission/WaylineWaypoint;", "waypointModel", "transWaypointType", "Landroid/util/Pair;", "Ldji/sdk/wpmz/value/mission/WaylineWaypointTurnMode;", "", "waypointTurnMode", "Lcom/dji/wpmzsdk/common/utils/kml/mission/WaypointV2MissionTypes$WaypointV2FlightPathMode;", "transformActionsFrom", "wpmzsdk_release"})
public final class WaypointMissionEntityTransform {
    @NotNull
    private final WaylineFinishActionTransform mFinishActionTransform = new WaylineFinishActionTransform();
    @NotNull
    private final WaylineToFirstPointTransform mToFirstPointTransform = new WaylineToFirstPointTransform();
    @NotNull
    private final WaylineRtkTypeTransform mWaylineRtkTypeTransform = new WaylineRtkTypeTransform();
    @NotNull
    private final WaylineTurnModeTransform mWaylineTurnModeTransform = new WaylineTurnModeTransform();
    @NotNull
    private final WaylineHeadingModeTransform mWaylineHeadingModeTransform = new WaylineHeadingModeTransform();
    @NotNull
    private final WaylineDroneTypeTransform mWaylineDroneTypeTransform = new WaylineDroneTypeTransform();
    @NotNull
    private final WaylinePayloadInfoTransform mWaylinePayloadInfoTransform = new WaylinePayloadInfoTransform();
    @NotNull
    private final WaylinePaylodParamTransform mWaylinePaylodParamTransform = new WaylinePaylodParamTransform();

    @NotNull
    public final MissionTransformData trans(@NotNull WaypointMissionModelGreenDao waypointMission) {
        Intrinsics.checkNotNullParameter((Object)waypointMission, (String)"waypointMission");
        List<WaypointModelGreenDao> waypointEntities = waypointMission.getWaypoints();
        WaylineModelGreenDao waylineModelGreenDao = waypointMission.getWayline();
        Intrinsics.checkNotNull((Object)waylineModelGreenDao);
        WaylineModelGreenDao waylineEntity = waylineModelGreenDao;
        WaylineTemplate template = new WaylineTemplate();
        template.setTemplateId(0);
        template.setTemplateType(WaylineTemplateType.WAYPOINT);
        WaylineTemplateWaypointInfo waypointInfo = this.transWaylineTemplateFrom(waylineEntity, waypointEntities);
        template.setWaypointInfo(waypointInfo);
        MissionInfoModelGreenDao missionInfoModelGreenDao = waypointMission.getMissionInfo();
        Intrinsics.checkNotNull((Object)missionInfoModelGreenDao);
        WaylineCoordinateParam coordinateParam = this.transCoordinateParamFrom(missionInfoModelGreenDao.getRtkStation(), waylineEntity);
        template.setCoordinateParam(coordinateParam);
        template.setTransitionalSpeed(Double.valueOf(waylineEntity.getAutoFlightSpeed()));
        template.setAutoFlightSpeed(Double.valueOf(waylineEntity.getAutoFlightSpeed()));
        DroneInfoModel droneInfoModel = waylineEntity.getDroneInfo();
        Intrinsics.checkNotNull((Object)droneInfoModel);
        List<WaylinePayloadParam> payloadParams = this.transPayloadParamsFrom(droneInfoModel);
        template.setPayloadParam(payloadParams);
        this.heightModeCheck(waypointMission, waypointInfo);
        WaylineMissionConfig config = this.transConfigFrom(waylineEntity);
        MissionTransformData data = new MissionTransformData();
        data.setTemplate(template);
        data.setMissionConfig(config);
        MissionInfoModelGreenDao missionInfoModelGreenDao2 = waypointMission.getMissionInfo();
        Intrinsics.checkNotNull((Object)missionInfoModelGreenDao2);
        data.setMission(this.createWaylineMission(missionInfoModelGreenDao2));
        data.setExecuteMissionConfig(WaylineInfoTransformKt.createExecuteConfig(config));
        return data;
    }

    private final void heightModeCheck(WaypointMissionModelGreenDao waypointMission, WaylineTemplateWaypointInfo waypointInfo) {
        WaylineModelGreenDao waylineModelGreenDao = waypointMission.getWayline();
        Intrinsics.checkNotNull((Object)waylineModelGreenDao);
        DroneInfoModel droneInfoModel = waylineModelGreenDao.getDroneInfo();
        Intrinsics.checkNotNull((Object)droneInfoModel);
        DroneHeightModel droneHeightModel = droneInfoModel.getDroneHeight();
        if (!droneHeightModel.isUseAbsolute()) {
            List<WaylineWaypoint> list = waypointInfo.getWaypoints();
            Intrinsics.checkNotNullExpressionValue(list, (String)"waypointInfo.waypoints");
            Iterable $this$forEach$iv = list;
            boolean $i$f$forEach = false;
            for (Object element$iv : $this$forEach$iv) {
                WaylineWaypoint it = (WaylineWaypoint)element$iv;
                boolean bl = false;
                Boolean bl2 = it.getUseGlobalFlightHeight();
                Intrinsics.checkNotNullExpressionValue((Object)bl2, (String)"it.useGlobalFlightHeight");
                if (bl2.booleanValue()) {
                    WaylineModelGreenDao waylineModelGreenDao2 = waypointMission.getWayline();
                    Intrinsics.checkNotNull((Object)waylineModelGreenDao2);
                    it.setEllipsoidHeight(Double.valueOf(waylineModelGreenDao2.getAltitude()));
                    it.setHeight(it.getEllipsoidHeight());
                    continue;
                }
                it.setEllipsoidHeight(it.getHeight());
                it.setHeight(it.getEllipsoidHeight());
            }
        } else {
            double takeoffHeight = droneHeightModel.isHasTakeoffHeight() ? (double)droneHeightModel.getTakeoffHeight() : 0.0;
            WaylineModelGreenDao waylineModelGreenDao3 = waypointMission.getWayline();
            Intrinsics.checkNotNull((Object)waylineModelGreenDao3);
            double waylineWgs84Height = (double)waylineModelGreenDao3.getAltitude() + takeoffHeight;
            if (!((Collection)waypointMission.getWaypoints()).isEmpty()) {
                waypointInfo.setGlobalFlightHeight(GpsUtils.egm96Altitude(waylineWgs84Height, waypointMission.getWaypoints().get(0).getLatitude(), waypointMission.getWaypoints().get(0).getLongitude()));
            } else {
                waypointInfo.setGlobalFlightHeight(waylineWgs84Height);
            }
            List<WaylineWaypoint> it = waypointInfo.getWaypoints();
            Intrinsics.checkNotNullExpressionValue(it, (String)"waypointInfo.waypoints");
            Iterable $this$forEach$iv = it;
            boolean $i$f$forEach = false;
            for (Object element$iv : $this$forEach$iv) {
                WaylineWaypoint it2 = (WaylineWaypoint)element$iv;
                boolean bl = false;
                Comparable<Boolean> comparable = it2.getUseGlobalFlightHeight();
                Intrinsics.checkNotNullExpressionValue((Object)comparable, (String)"it.useGlobalFlightHeight");
                if (comparable.booleanValue()) {
                    it2.setEllipsoidHeight(waylineWgs84Height);
                    comparable = it2.getEllipsoidHeight();
                    Intrinsics.checkNotNullExpressionValue((Object)comparable, (String)"it.ellipsoidHeight");
                    double d = ((Number)((Object)comparable)).doubleValue();
                    comparable = it2.getLocation().getLatitude();
                    Intrinsics.checkNotNullExpressionValue((Object)comparable, (String)"it.location.latitude");
                    double d2 = ((Number)((Object)comparable)).doubleValue();
                    comparable = it2.getLocation().getLongitude();
                    Intrinsics.checkNotNullExpressionValue((Object)comparable, (String)"it.location.longitude");
                    it2.setHeight(GpsUtils.egm96Altitude(d, d2, ((Number)((Object)comparable)).doubleValue()));
                    continue;
                }
                it2.setEllipsoidHeight(it2.getHeight() + takeoffHeight);
                comparable = it2.getEllipsoidHeight();
                Intrinsics.checkNotNullExpressionValue((Object)comparable, (String)"it.ellipsoidHeight");
                double d = ((Number)((Object)comparable)).doubleValue();
                comparable = it2.getLocation().getLatitude();
                Intrinsics.checkNotNullExpressionValue((Object)comparable, (String)"it.location.latitude");
                double d3 = ((Number)((Object)comparable)).doubleValue();
                comparable = it2.getLocation().getLongitude();
                Intrinsics.checkNotNullExpressionValue((Object)comparable, (String)"it.location.longitude");
                it2.setHeight(GpsUtils.egm96Altitude(d, d3, ((Number)((Object)comparable)).doubleValue()));
            }
        }
    }

    private final WaylineTemplateWaypointInfo transWaylineTemplateFrom(WaylineModelGreenDao waylineModel, List<WaypointModelGreenDao> waypointModels) {
        List waypoints = new ArrayList();
        int n = 0;
        int n2 = waypointModels.size();
        while (n < n2) {
            int i = n++;
            WaypointModelGreenDao waypointModel = waypointModels.get(i);
            WaylineWaypoint waypoint = this.transWaylineWaypointFrom(waylineModel, waypointModel);
            waypoint.setWaypointIndex(i);
            waypoints.add(waypoint);
        }
        WaylineTemplateWaypointInfo waypointInfo = new WaylineTemplateWaypointInfo();
        waypointInfo.setWaypoints(waypoints);
        waypointInfo.setActionGroups(this.transformActionsFrom(waypointModels));
        waypointInfo.setGlobalFlightHeight(Double.valueOf(waylineModel.getAltitude()));
        waypointInfo.setIsGlobalFlightHeightSet(true);
        waypointInfo.setIsGlobalActionSet(false);
        Pair<WaylineWaypointTurnMode, Boolean> turnModePair = this.transWaypointType(waylineModel.getWaypointType());
        waypointInfo.setGlobalTurnMode((WaylineWaypointTurnMode)turnModePair.first);
        waypointInfo.setUseStraightLine((Boolean)turnModePair.second);
        waypointInfo.setIsTemplateGlobalTurnModeSet(true);
        WaylineWaypointYawParam yawParam = new WaylineWaypointYawParam();
        yawParam.setYawMode(this.mWaylineHeadingModeTransform.transFrom(waylineModel.getHeadingMode()));
        if (yawParam.getYawMode() == WaylineWaypointYawMode.TOWARD_POI) {
            yawParam.setPoiLocation(new WaylineLocationCoordinate3D(waylineModel.getPoiLatitude(), waylineModel.getPoiLongitude(), 0.0));
        }
        waypointInfo.setGlobalYawParam(yawParam);
        waypointInfo.setIsTemplateGlobalYawParamSet(true);
        waypointInfo.setPitchMode(waylineModel.getGimbalPitchRotationEnable() ? WaylineWaypointPitchMode.USE_POINT_SETTING : WaylineWaypointPitchMode.MANUALLY);
        waypointInfo.setCaliFlightEnable(waylineModel.getFlightCali());
        return waypointInfo;
    }

    private final Pair<WaylineWaypointTurnMode, Boolean> transWaypointType(WaypointV2MissionTypes.WaypointV2FlightPathMode waypointTurnMode) {
        WaylineWaypointTurnMode turnMode = WaylineWaypointTurnMode.TO_POINT_AND_STOP_WITH_DISCONTINUITY_CURVATURE;
        boolean useStraightLine = true;
        if (waypointTurnMode != null) {
            switch (WhenMappings.$EnumSwitchMapping$0[waypointTurnMode.ordinal()]) {
                case 1: {
                    turnMode = WaylineWaypointTurnMode.TO_POINT_AND_PASS_WITH_CONTINUITY_CURVATURE;
                    useStraightLine = false;
                    break;
                }
                case 2: {
                    turnMode = WaylineWaypointTurnMode.TO_POINT_AND_STOP_WITH_CONTINUITY_CURVATURE;
                    useStraightLine = false;
                    break;
                }
                case 3: {
                    turnMode = WaylineWaypointTurnMode.COORDINATE_TURN;
                    useStraightLine = true;
                }
            }
        }
        Pair pair = Pair.create((Object)turnMode, (Object)useStraightLine);
        Intrinsics.checkNotNullExpressionValue((Object)pair, (String)"create(turnMode, useStraightLine)");
        return pair;
    }

    private final WaylineWaypoint transWaylineWaypointFrom(WaylineModelGreenDao waylineModel, WaypointModelGreenDao waypointModel) {
        boolean setWaypointYawParam;
        WaylineWaypoint waypoint = new WaylineWaypoint();
        WaylineLocationCoordinate2D location = new WaylineLocationCoordinate2D();
        location.setLongitude(waypointModel.getLongitude());
        location.setLatitude(waypointModel.getLatitude());
        waypoint.setLocation(location);
        waypoint.setHeight(Double.valueOf(waypointModel.getAltitude()));
        waypoint.setUseGlobalFlightHeight(waypointModel.getUseWaylineAltitude());
        if (!waypointModel.getUseWaylineSpeed()) {
            waypoint.setSpeed(Double.valueOf(waypointModel.getSpeed()));
        }
        waypoint.setUseGlobalAutoFlightSpeed(waypointModel.getUseWaylineSpeed());
        waypoint.setGimbalPitchAngle(Double.valueOf(waypointModel.getGimbalPitch()));
        boolean bl = setWaypointYawParam = !waypointModel.getUseWaylineHeadMode() || waylineModel.getHeadingMode() == WaypointMissionHeadingMode.USING_WAYPOINT_HEADING;
        if (setWaypointYawParam) {
            WaypointMissionHeadingMode headingMode = waypointModel.getHeadingMode();
            if (waypointModel.getUseWaylineHeadMode() && waylineModel.getHeadingMode() == WaypointMissionHeadingMode.USING_WAYPOINT_HEADING) {
                headingMode = WaypointMissionHeadingMode.USING_WAYPOINT_HEADING;
            }
            WaylineWaypointYawParam yawParam = new WaylineWaypointYawParam();
            yawParam.setEnableYawAngle(headingMode == WaypointMissionHeadingMode.USING_WAYPOINT_HEADING);
            yawParam.setYawAngle(Double.valueOf(waypointModel.getHeading()));
            yawParam.setYawMode(this.mWaylineHeadingModeTransform.transFrom(headingMode));
            yawParam.setYawPathMode(this.mWaylineTurnModeTransform.transFrom(waypointModel.getTurnMode()));
            yawParam.setPoiLocation(new WaylineLocationCoordinate3D(waylineModel.getPoiLatitude(), waylineModel.getPoiLongitude(), 0.0));
            waypoint.setYawParam(yawParam);
        }
        waypoint.setIsWaylineWaypointYawParamSet(setWaypointYawParam);
        waypoint.setUseGlobalYawParam(!setWaypointYawParam);
        if (!waypointModel.getUseWaylinePointType()) {
            WaylineWaypointTurnParam turnParam = new WaylineWaypointTurnParam();
            turnParam.setTurnDampingDistance(Double.valueOf(waypointModel.getCornerRadius()));
            Pair<WaylineWaypointTurnMode, Boolean> turnModePair = this.transWaypointType(waypointModel.getWaypointType());
            turnParam.setTurnMode((WaylineWaypointTurnMode)turnModePair.first);
            waypoint.setUseStraightLine((Boolean)turnModePair.second);
            waypoint.setTurnParam(turnParam);
        }
        waypoint.setIsWaylineWaypointTurnParamSet(!waypointModel.getUseWaylinePointType());
        waypoint.setUseGlobalTurnParam(waypointModel.getUseWaylinePointType());
        return waypoint;
    }

    private final WaylineCoordinateParam transCoordinateParamFrom(RTKReferenceStationSource rtkSource, WaylineModelGreenDao waylineModel) {
        WaylineCoordinateParam coordinateParam = new WaylineCoordinateParam();
        coordinateParam.setCoordinateMode(WaylineCoordinateMode.WGS84);
        coordinateParam.setPositioningType(this.mWaylineRtkTypeTransform.transFrom(rtkSource));
        coordinateParam.setIsGlobalShootHeightSet(false);
        coordinateParam.setIsWaylinePositioningTypeSet(true);
        coordinateParam.setIsSurfaceFollowParamSet(false);
        DroneInfoModel droneInfoModel = waylineModel.getDroneInfo();
        Intrinsics.checkNotNull((Object)droneInfoModel);
        boolean useAbsolute = droneInfoModel.getDroneHeight().isUseAbsolute();
        coordinateParam.setAltitudeMode(useAbsolute ? WaylineAltitudeMode.EGM96 : WaylineAltitudeMode.RELATIVE_TO_START_POINT);
        return coordinateParam;
    }

    private final List<WaylinePayloadParam> transPayloadParamsFrom(DroneInfoModel droneInfoModel) {
        List payloadParams = new ArrayList();
        List<DroneCameraModel> droneCameras = droneInfoModel.getCameras();
        for (DroneCameraModel cameraModel : droneCameras) {
            WaylinePayloadParam payloadParam = new WaylinePayloadParam();
            if (cameraModel.getPayloadConfigInfo() != null) {
                PayloadConfigInfoModel payloadConfigInfoModel = cameraModel.getPayloadConfigInfo();
                Intrinsics.checkNotNullExpressionValue((Object)payloadConfigInfoModel, (String)"cameraModel.payloadConfigInfo");
                payloadParam = this.mWaylinePaylodParamTransform.transFrom(payloadConfigInfoModel);
            }
            if (cameraModel.getPhotoTypes() != null) {
                payloadParam.setImageFormat(new ArrayList(cameraModel.getPhotoTypes()));
            }
            payloadParam.setPayloadPositionIndex(cameraModel.getCameraIndex());
            payloadParam.setIsPayloadPositionIndexSet(true);
            payloadParams.add(payloadParam);
        }
        return payloadParams;
    }

    private final WaylineMissionConfig transConfigFrom(WaylineModelGreenDao waylineModel) {
        WaylineMissionConfig config = new WaylineMissionConfig();
        config.setFlyToWaylineMode(this.mToFirstPointTransform.transFrom(waylineModel.getGotoFirstPointMode()));
        config.setFinishAction(this.mFinishActionTransform.transFrom(waylineModel.getActionOnFinish()));
        DroneInfoModel droneInfoModel = waylineModel.getDroneInfo();
        Intrinsics.checkNotNull((Object)droneInfoModel);
        config.setDroneInfo(this.mWaylineDroneTypeTransform.transFrom(droneInfoModel.getDroneType()));
        config.setIsSecurityTakeOffHeightSet(false);
        boolean goOnExecute = !waylineModel.getExitOnRCLost();
        config.setExitOnRCLostBehavior(goOnExecute ? WaylineExitOnRCLostBehavior.GO_ON : WaylineExitOnRCLostBehavior.EXCUTE_RC_LOST_ACTION);
        config.setExitOnRCLostType(WaylineExitOnRCLostAction.GO_BACK);
        config.setGlobalTransitionalSpeed(Double.valueOf(waylineModel.getAutoFlightSpeed()));
        DroneInfoModel droneInfoModel2 = waylineModel.getDroneInfo();
        Intrinsics.checkNotNull((Object)droneInfoModel2);
        DroneHeightModel droneHeightModel = droneInfoModel2.getDroneHeight();
        if (droneHeightModel.isHasTakeoffHeight()) {
            config.setIsTakeOffPositionRefSet(true);
            WaylineLocationCoordinate3D takeoffLocation = new WaylineLocationCoordinate3D(droneHeightModel.getTakeoffLat(), droneHeightModel.getTakeoffLng(), Double.valueOf(droneHeightModel.getTakeoffHeight()));
            config.setTakeOffPositionRef(takeoffLocation);
        } else {
            config.setIsTakeOffPositionRefSet(false);
        }
        config.setIsGlobalRTHHeightSet(false);
        List payloadInfos = new ArrayList();
        DroneInfoModel droneInfoModel3 = waylineModel.getDroneInfo();
        Intrinsics.checkNotNull((Object)droneInfoModel3);
        List<DroneCameraModel> droneCameras = droneInfoModel3.getCameras();
        for (DroneCameraModel cameraModel : droneCameras) {
            Intrinsics.checkNotNullExpressionValue((Object)cameraModel, (String)"cameraModel");
            WaylinePayloadInfo payloadInfo = this.mWaylinePayloadInfoTransform.transFrom(cameraModel);
            payloadInfos.add(payloadInfo);
        }
        config.setPayloadInfo(payloadInfos);
        return config;
    }

    private final WaylineMission createWaylineMission(MissionInfoModelGreenDao infoModel) {
        WaylineMission mission = new WaylineMission();
        mission.setUpdateTime(Double.valueOf(infoModel.getUpdateTime()));
        mission.setCreateTime(Double.valueOf(infoModel.getCreateTime()));
        return mission;
    }

    private final List<WaylineActionGroup> transformActionsFrom(List<WaypointModelGreenDao> waypoints) {
        List actionGroups = new ArrayList();
        int n = 0;
        int n2 = waypoints.size();
        while (n < n2) {
            int i = n++;
            WaypointModelGreenDao waypoint = waypoints.get(i);
            List<WaypointActionModelGreenDao> actionModels = waypoint.getActions();
            List actionInfos = new ArrayList();
            for (WaypointActionModelGreenDao item : actionModels) {
                WaylineActionInfo actionInfo = new WaypointActionEntityTransform().trans(item, waypoint.getPreciseShotInfo());
                if (actionInfo == null) continue;
                actionInfos.add(actionInfo);
            }
            if (actionInfos.size() <= 0) continue;
            WaylineActionGroup actionGroup = new WaylineActionGroup();
            WaylineActionTrigger trigger = new WaylineActionTrigger();
            trigger.setTriggerType(WaylineActionTriggerType.REACH_POINT);
            actionGroup.setTrigger(trigger);
            actionGroup.setGroupId(actionGroups.size());
            actionGroup.setStartIndex(i);
            actionGroup.setEndIndex(i);
            actionGroups.add(actionGroup);
            actionGroup.setActions(actionInfos);
            List nodeLists = new ArrayList();
            WaylineActionNodeList root = new WaylineActionNodeList();
            List treeNodes = new ArrayList();
            WaylineActionTreeNode rootNode = new WaylineActionTreeNode();
            rootNode.setNodeType(WaylineActionsRelationType.SEQUENCE);
            rootNode.setChildrenNum(actionInfos.size());
            treeNodes.add(rootNode);
            root.setNodes(treeNodes);
            nodeLists.add(root);
            WaylineActionNodeList children = new WaylineActionNodeList();
            List childrenNodeList = new ArrayList();
            int n3 = 0;
            int n4 = actionInfos.size();
            while (n3 < n4) {
                int j = n3++;
                WaylineActionTreeNode child = new WaylineActionTreeNode();
                child.setNodeType(WaylineActionsRelationType.LEAF);
                child.setActionIndex(j);
                childrenNodeList.add(child);
            }
            children.setNodes(childrenNodeList);
            nodeLists.add(children);
            actionGroup.setNodeLists(nodeLists);
        }
        this.transFromIntervalActions(waypoints, actionGroups);
        return actionGroups;
    }

    private final void transFromIntervalActions(List<WaypointModelGreenDao> waypoints, List<WaylineActionGroup> actionGroups) {
        WaylineActionGroup intervalShotAction = null;
        int n = 0;
        int n2 = waypoints.size();
        while (n < n2) {
            int i = n++;
            List<WaypointActionModelGreenDao> actionModels = waypoints.get(i).getActions();
            for (WaypointActionModelGreenDao item : actionModels) {
                if (intervalShotAction == null && (item.getActionType() == WaypointActionType.START_TIME_INTERVAL_SHOT || item.getActionType() == WaypointActionType.START_DISTANCE_INTERVAL_SHOT)) {
                    intervalShotAction = this.getIntevalShootActionGroup(actionGroups, i, item);
                    continue;
                }
                if (item.getActionType() != WaypointActionType.STOP_INTERVAL_SHOT || intervalShotAction == null) continue;
                intervalShotAction.setEndIndex(i);
                actionGroups.add(intervalShotAction);
                intervalShotAction = null;
            }
        }
        if (intervalShotAction != null) {
            intervalShotAction.setEndIndex(waypoints.size() - 1);
            actionGroups.add(intervalShotAction);
        }
    }

    private final WaylineActionGroup getIntevalShootActionGroup(List<? extends WaylineActionGroup> actionGroups, int waypointIndex, WaypointActionModelGreenDao item) {
        WaylineActionGroup actionGroup = new WaylineActionGroup();
        actionGroup.setGroupId(actionGroups.size());
        actionGroup.setStartIndex(waypointIndex);
        actionGroup.setTrigger(this.getActionTrigger(item));
        List actionInfos = new ArrayList();
        WaylineActionInfo actionInfo = new WaylineActionInfo();
        actionInfo.setActionId(actionInfos.size());
        actionInfo.setActionType(WaylineActionType.TAKE_PHOTO);
        List photoTypes = new ArrayList();
        ActionTakePhotoParam param = new ActionTakePhotoParam(item.getCameraIndex(), false, photoTypes, null);
        actionInfo.setTakePhotoParam(param);
        actionInfos.add(actionInfo);
        actionGroup.setActions(actionInfos);
        List nodeLists = new ArrayList();
        WaylineActionNodeList root = new WaylineActionNodeList();
        List treeNodes = new ArrayList();
        WaylineActionTreeNode rootNode = new WaylineActionTreeNode();
        rootNode.setNodeType(WaylineActionsRelationType.SEQUENCE);
        rootNode.setChildrenNum(actionInfos.size());
        treeNodes.add(rootNode);
        root.setNodes(treeNodes);
        nodeLists.add(root);
        WaylineActionNodeList children = new WaylineActionNodeList();
        List childrenNodeList = new ArrayList();
        int n = 0;
        int n2 = actionInfos.size();
        while (n < n2) {
            int j = n++;
            WaylineActionTreeNode child = new WaylineActionTreeNode();
            child.setNodeType(WaylineActionsRelationType.LEAF);
            child.setActionIndex(j);
            childrenNodeList.add(child);
        }
        children.setNodes(childrenNodeList);
        nodeLists.add(children);
        actionGroup.setNodeLists(nodeLists);
        return actionGroup;
    }

    private final WaylineActionTrigger getActionTrigger(WaypointActionModelGreenDao item) {
        WaylineActionTrigger trigger = new WaylineActionTrigger();
        if (item.getActionType() == WaypointActionType.START_TIME_INTERVAL_SHOT) {
            trigger.setTriggerType(WaylineActionTriggerType.MULTIPLE_TIMING);
            trigger.setTimeInterval(Double.valueOf(item.getParam()));
        } else {
            trigger.setTriggerType(WaylineActionTriggerType.MULTIPLE_DISTANCE);
            trigger.setDistanceInterval(Double.valueOf(item.getParam()));
        }
        return trigger;
    }

    @Metadata(mv={1, 6, 0}, k=3, xi=48)
    public final class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] nArray = new int[WaypointV2MissionTypes.WaypointV2FlightPathMode.values().length];
            nArray[WaypointV2MissionTypes.WaypointV2FlightPathMode.CURVATURE_CONTINUOUS_PASSED.ordinal()] = 1;
            nArray[WaypointV2MissionTypes.WaypointV2FlightPathMode.GOTO_POINT_CURVE_AND_STOP.ordinal()] = 2;
            nArray[WaypointV2MissionTypes.WaypointV2FlightPathMode.COORDINATE_TURN.ordinal()] = 3;
            $EnumSwitchMapping$0 = nArray;
        }
    }
}

