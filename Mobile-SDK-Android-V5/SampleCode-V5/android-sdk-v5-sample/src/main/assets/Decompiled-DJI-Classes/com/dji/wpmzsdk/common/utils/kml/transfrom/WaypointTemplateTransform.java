/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
package com.dji.wpmzsdk.common.utils.kml.transfrom;

import android.util.Pair;
import com.dji.wpmzsdk.common.utils.kml.data.DroneInfoModel;
import com.dji.wpmzsdk.common.utils.kml.mission.RTKReferenceStationSource;
import com.dji.wpmzsdk.common.utils.kml.mission.WaypointMissionHeadingMode;
import com.dji.wpmzsdk.common.utils.kml.model.DroneCameraModel;
import com.dji.wpmzsdk.common.utils.kml.model.DroneHeightModel;
import com.dji.wpmzsdk.common.utils.kml.model.PayloadConfigInfoModel;
import com.dji.wpmzsdk.common.utils.kml.model.PointTurnMode;
import com.dji.wpmzsdk.common.utils.kml.model.WaylineModel;
import com.dji.wpmzsdk.common.utils.kml.model.WaypointActionModel;
import com.dji.wpmzsdk.common.utils.kml.model.WaypointActionType;
import com.dji.wpmzsdk.common.utils.kml.model.WaypointMissionModel;
import com.dji.wpmzsdk.common.utils.kml.model.WaypointModel;
import com.dji.wpmzsdk.common.utils.kml.transfrom.MissionTransformData;
import com.dji.wpmzsdk.common.utils.kml.transfrom.ModelTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.WaylineActionTemplateTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.WaylineDroneTypeTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.WaylineFinishActionTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.WaylineHeadingModeTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.WaylineInfoTransformKt;
import com.dji.wpmzsdk.common.utils.kml.transfrom.WaylinePayloadInfoTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.WaylinePaylodParamTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.WaylineRtkTypeTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.WaylineToFirstPointTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.WaylineTurnModeTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.WaylineWaypointTypeTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.WaypointActionTemplateTransform;
import dji.sdk.wpmz.value.mission.ActionTakePhotoParam;
import dji.sdk.wpmz.value.mission.CameraLensType;
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
import dji.sdk.wpmz.value.mission.WaylineWaypointYawParam;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

public class WaypointTemplateTransform
implements ModelTransform<WaypointMissionModel, MissionTransformData> {
    private final WaylineFinishActionTransform mFinishActionTransform = new WaylineFinishActionTransform();
    private final WaylineToFirstPointTransform mToFirstPointTransform = new WaylineToFirstPointTransform();
    private final WaylineRtkTypeTransform mWaylineRtkTypeTransform = new WaylineRtkTypeTransform();
    private final WaylineTurnModeTransform mWaylineTurnModeTransform = new WaylineTurnModeTransform();
    private final WaylineWaypointTypeTransform mWaylineWaypointTypeTransform = new WaylineWaypointTypeTransform();
    private final WaylineHeadingModeTransform mWaylineHeadingModeTransform = new WaylineHeadingModeTransform();
    private final WaypointActionTemplateTransform mWaypointActionTemplateTransform = new WaypointActionTemplateTransform();
    private final WaylineActionTemplateTransform mWaylineActionTemplateTransform = new WaylineActionTemplateTransform();
    private final WaylineDroneTypeTransform mWaylineDroneTypeTransform = new WaylineDroneTypeTransform();
    private final WaylinePayloadInfoTransform mWaylinePayloadInfoTransform = new WaylinePayloadInfoTransform();
    private final WaylinePaylodParamTransform mWaylinePaylodParamTransform = new WaylinePaylodParamTransform();

    @Override
    public MissionTransformData transFrom(WaypointMissionModel waypointMissionModel) {
        List<WaypointModel> waypointModels = waypointMissionModel.getWaypoints();
        WaylineModel waylineModel = waypointMissionModel.getWayline();
        WaylineTemplate template = new WaylineTemplate();
        template.setTemplateId(0);
        template.setTemplateType(WaylineTemplateType.WAYPOINT);
        WaylineTemplateWaypointInfo waypointInfo = this.transWaylineTemplateFrom(waylineModel, waypointModels);
        template.setWaypointInfo(waypointInfo);
        WaylineCoordinateParam coordinateParam = this.transCoordinateParamFrom(waypointMissionModel.getMissionInfo().getRtkStation(), waylineModel);
        template.setCoordinateParam(coordinateParam);
        template.setUseGlobalTransitionalSpeed(true);
        template.setAutoFlightSpeed(Double.valueOf(waylineModel.getAutoFlightSpeed()));
        List<WaylinePayloadParam> payloadParams = this.transPayloadParamsFrom(waylineModel.getDroneInfo());
        template.setPayloadParam(payloadParams);
        WaylineMissionConfig config = this.transConfigFrom(waylineModel);
        MissionTransformData data = new MissionTransformData();
        data.setTemplate(template);
        data.setMissionConfig(config);
        data.setMission(WaylineInfoTransformKt.createWaylineMission(waypointMissionModel.getMissionInfo()));
        data.setExecuteMissionConfig(WaylineInfoTransformKt.createExecuteConfig(config));
        return data;
    }

    private WaylineWaypoint transWaylineWaypointFrom(WaylineModel waylineModel, WaypointModel waypointModel) {
        boolean setWaypointYawParam;
        WaylineWaypoint waypoint = new WaylineWaypoint();
        WaylineLocationCoordinate2D location = new WaylineLocationCoordinate2D();
        location.setLongitude(waypointModel.getLongitude());
        location.setLatitude(waypointModel.getLatitude());
        waypoint.setLocation(location);
        waypoint.setHeight(Double.valueOf(waypointModel.getAltitude()));
        waypoint.setEllipsoidHeight(Double.valueOf(waypointModel.getWgs84Altitude()));
        waypoint.setUseGlobalFlightHeight(waypointModel.isUseWaylineAltitude());
        if (!waypointModel.isUseWaylineSpeed()) {
            waypoint.setSpeed(Double.valueOf(waypointModel.getSpeed()));
        }
        waypoint.setUseGlobalAutoFlightSpeed(waypointModel.isUseWaylineSpeed());
        waypoint.setGimbalPitchAngle(Double.valueOf(waypointModel.getGimbalPitch()));
        waypoint.setUseGlobalActionGroup(waypointModel.isUseWaylineAction());
        boolean bl = setWaypointYawParam = !waypointModel.isUseWaylineHeadMode() || waylineModel.getHeadingMode() == WaypointMissionHeadingMode.USING_WAYPOINT_HEADING;
        if (setWaypointYawParam) {
            WaypointMissionHeadingMode headingMode = waypointModel.getHeadingMode();
            if (waypointModel.isUseWaylineHeadMode() && waylineModel.getHeadingMode() == WaypointMissionHeadingMode.USING_WAYPOINT_HEADING) {
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
        if (!waypointModel.isUseWaylinePointType()) {
            WaylineWaypointTurnParam turnParam = new WaylineWaypointTurnParam();
            turnParam.setTurnDampingDistance(Double.valueOf(waypointModel.getCornerRadius()));
            Pair<WaylineWaypointTurnMode, Boolean> turnModePair = this.mWaylineWaypointTypeTransform.transFrom(waypointModel.getWaypointTurnMode());
            turnParam.setTurnMode((WaylineWaypointTurnMode)turnModePair.first);
            waypoint.setUseStraightLine((Boolean)turnModePair.second);
            waypoint.setTurnParam(turnParam);
        }
        waypoint.setIsWaylineWaypointTurnParamSet(!waypointModel.isUseWaylinePointType());
        waypoint.setUseGlobalTurnParam(waypointModel.isUseWaylinePointType());
        return waypoint;
    }

    private WaylineTemplateWaypointInfo transWaylineTemplateFrom(WaylineModel waylineModel, List<WaypointModel> waypointModels) {
        ArrayList<WaylineWaypoint> waypoints = new ArrayList<WaylineWaypoint>();
        for (int i = 0; i < waypointModels.size(); ++i) {
            WaypointModel waypointModel = waypointModels.get(i);
            WaylineWaypoint waypoint = this.transWaylineWaypointFrom(waylineModel, waypointModel);
            waypoint.setWaypointIndex(i);
            waypoints.add(waypoint);
        }
        WaylineTemplateWaypointInfo waypointInfo = new WaylineTemplateWaypointInfo();
        waypointInfo.setWaypoints(waypoints);
        waypointInfo.setActionGroups(this.transformActionsFrom(waypointModels));
        waypointInfo.setGlobalFlightHeight(Double.valueOf(waylineModel.getAltitude()));
        waypointInfo.setIsGlobalFlightHeightSet(true);
        if (waylineModel.getActions() == null || waylineModel.getActions().isEmpty()) {
            waypointInfo.setIsGlobalActionSet(false);
        } else {
            WaylineActionGroup globalAction = this.transWaylineActionGroupFrom(waylineModel.getActions());
            waypointInfo.setGlobalAction(globalAction);
            waypointInfo.setIsGlobalActionSet(true);
        }
        Pair<WaylineWaypointTurnMode, Boolean> turnModePair = this.mWaylineWaypointTypeTransform.transFrom(waylineModel.getWaypointTurnMode());
        waypointInfo.setGlobalTurnMode((WaylineWaypointTurnMode)turnModePair.first);
        waypointInfo.setUseStraightLine((Boolean)turnModePair.second);
        waypointInfo.setIsTemplateGlobalTurnModeSet(true);
        WaylineWaypointYawParam yawParam = new WaylineWaypointYawParam();
        yawParam.setYawMode(this.mWaylineHeadingModeTransform.transFrom(waylineModel.getHeadingMode()));
        yawParam.setPoiLocation(new WaylineLocationCoordinate3D(waylineModel.getPoiLatitude(), waylineModel.getPoiLongitude(), 0.0));
        waypointInfo.setGlobalYawParam(yawParam);
        waypointInfo.setIsTemplateGlobalYawParamSet(true);
        waypointInfo.setPitchMode(waylineModel.isGimbalPitchRotationEnable() ? WaylineWaypointPitchMode.USE_POINT_SETTING : WaylineWaypointPitchMode.MANUALLY);
        waypointInfo.setCaliFlightEnable(waylineModel.isFlightCali());
        return waypointInfo;
    }

    private WaylineActionGroup transWaylineActionGroupFrom(List<WaypointActionModel> actions) {
        WaylineActionGroup actionGroup = new WaylineActionGroup();
        ArrayList<WaylineActionInfo> actionInfo = new ArrayList<WaylineActionInfo>();
        for (WaypointActionModel item : actions) {
            WaylineActionInfo info = this.mWaypointActionTemplateTransform.trans(item);
            if (info == null || info.getActionType() == WaylineActionType.UNKNOWN) continue;
            actionInfo.add(info);
        }
        WaylineActionTrigger trigger = new WaylineActionTrigger();
        trigger.setTriggerType(WaylineActionTriggerType.REACH_POINT);
        actionGroup.setTrigger(trigger);
        actionGroup.setActions(actionInfo);
        ArrayList<WaylineActionNodeList> nodeLists = new ArrayList<WaylineActionNodeList>();
        WaylineActionNodeList root = new WaylineActionNodeList();
        ArrayList<WaylineActionTreeNode> treeNodes = new ArrayList<WaylineActionTreeNode>();
        WaylineActionTreeNode rootNode = new WaylineActionTreeNode();
        rootNode.setNodeType(WaylineActionsRelationType.SEQUENCE);
        rootNode.setChildrenNum(actionInfo.size());
        treeNodes.add(rootNode);
        root.setNodes(treeNodes);
        nodeLists.add(root);
        WaylineActionNodeList children = new WaylineActionNodeList();
        ArrayList<WaylineActionTreeNode> childrenNodeList = new ArrayList<WaylineActionTreeNode>();
        for (int i = 0; i < actionInfo.size(); ++i) {
            WaylineActionTreeNode child = new WaylineActionTreeNode();
            child.setNodeType(WaylineActionsRelationType.LEAF);
            child.setActionIndex(i);
            childrenNodeList.add(child);
        }
        children.setNodes(childrenNodeList);
        nodeLists.add(children);
        actionGroup.setNodeLists(nodeLists);
        return actionGroup;
    }

    private WaylineMissionConfig transConfigFrom(WaylineModel waylineModel) {
        WaylineMissionConfig config = new WaylineMissionConfig();
        config.setFlyToWaylineMode(this.mToFirstPointTransform.transFrom(waylineModel.getGotoFirstPointMode()));
        config.setFinishAction(this.mFinishActionTransform.transFrom(waylineModel.getActionOnFinish()));
        config.setDroneInfo(this.mWaylineDroneTypeTransform.transFrom(waylineModel.getDroneInfo().getDroneType()));
        config.setSecurityTakeOffHeight(Double.valueOf(waylineModel.getSecureTakeoffHeight()));
        config.setIsSecurityTakeOffHeightSet(true);
        boolean goOnExecute = waylineModel.getLostAction() == null || waylineModel.getLostAction() == WaylineExitOnRCLostAction.UNKNOWN;
        config.setExitOnRCLostBehavior(goOnExecute ? WaylineExitOnRCLostBehavior.GO_ON : WaylineExitOnRCLostBehavior.EXCUTE_RC_LOST_ACTION);
        if (waylineModel.getLostAction() != null) {
            config.setExitOnRCLostType(waylineModel.getLostAction());
        }
        config.setGlobalTransitionalSpeed(15.0);
        DroneHeightModel droneHeightModel = waylineModel.getDroneInfo().getDroneHeight();
        if (droneHeightModel.isHasTakeoffHeight()) {
            config.setIsTakeOffPositionRefSet(true);
            WaylineLocationCoordinate3D takeoffLocation = new WaylineLocationCoordinate3D(droneHeightModel.getTakeoffLat(), droneHeightModel.getTakeoffLng(), Double.valueOf(droneHeightModel.getTakeoffHeight()));
            config.setTakeOffPositionRef(takeoffLocation);
        } else {
            config.setIsTakeOffPositionRefSet(false);
        }
        config.setIsGlobalRTHHeightSet(false);
        ArrayList<WaylinePayloadInfo> payloadInfos = new ArrayList<WaylinePayloadInfo>();
        List<DroneCameraModel> droneCameras = waylineModel.getDroneInfo().getCameras();
        for (DroneCameraModel cameraModel : droneCameras) {
            WaylinePayloadInfo payloadInfo = this.mWaylinePayloadInfoTransform.transFrom(cameraModel);
            payloadInfos.add(payloadInfo);
        }
        config.setPayloadInfo(payloadInfos);
        return config;
    }

    private WaylineCoordinateParam transCoordinateParamFrom(RTKReferenceStationSource rtkSource, WaylineModel waylineModel) {
        WaylineCoordinateParam coordinateParam = new WaylineCoordinateParam();
        coordinateParam.setCoordinateMode(WaylineCoordinateMode.WGS84);
        coordinateParam.setPositioningType(this.mWaylineRtkTypeTransform.transFrom(rtkSource));
        coordinateParam.setIsGlobalShootHeightSet(false);
        coordinateParam.setIsWaylinePositioningTypeSet(true);
        coordinateParam.setIsSurfaceFollowParamSet(false);
        boolean useAbsolute = waylineModel.getDroneInfo().getDroneHeight().isUseAbsolute();
        coordinateParam.setAltitudeMode(useAbsolute ? WaylineAltitudeMode.EGM96 : WaylineAltitudeMode.RELATIVE_TO_START_POINT);
        return coordinateParam;
    }

    private List<WaylinePayloadParam> transPayloadParamsFrom(DroneInfoModel droneInfoModel) {
        ArrayList<WaylinePayloadParam> payloadParams = new ArrayList<WaylinePayloadParam>();
        List<DroneCameraModel> droneCameras = droneInfoModel.getCameras();
        for (DroneCameraModel cameraModel : droneCameras) {
            WaylinePayloadParam payloadParam = new WaylinePayloadParam();
            if (cameraModel.getPayloadConfigInfo() != null) {
                payloadParam = this.mWaylinePaylodParamTransform.transFrom(cameraModel.getPayloadConfigInfo());
            }
            if (cameraModel.getPhotoTypes() != null) {
                payloadParam.setImageFormat(new ArrayList<CameraLensType>(cameraModel.getPhotoTypes()));
            }
            payloadParam.setPayloadPositionIndex(cameraModel.getCameraIndex());
            payloadParam.setIsPayloadPositionIndexSet(true);
            payloadParams.add(payloadParam);
        }
        return payloadParams;
    }

    @Override
    public WaypointMissionModel transTo(MissionTransformData data) {
        WaylineTemplate template = data.getTemplates().get(0);
        WaylineMissionConfig config = data.getMissionConfig();
        WaypointMissionModel model = new WaypointMissionModel();
        WaylineModel waylineModel = this.transWaylineTemplateTo(template, config);
        model.setWayline(waylineModel);
        List<WaypointModel> waypointModels = this.transWaypointTemplateTo(template.getWaypointInfo());
        model.setWaypoints(waypointModels);
        return model;
    }

    private WaylineModel transWaylineTemplateTo(WaylineTemplate template, WaylineMissionConfig config) {
        WaylineModel waylineModel = new WaylineModel();
        waylineModel.setAltitude(template.getWaypointInfo().getGlobalFlightHeight().floatValue());
        waylineModel.setAutoFlightSpeed(template.getAutoFlightSpeed().floatValue());
        waylineModel.setGotoFirstPointMode(this.mToFirstPointTransform.transTo(config.getFlyToWaylineMode()));
        waylineModel.setActionOnFinish(this.mFinishActionTransform.transTo(config.getFinishAction()));
        if (config.getExitOnRCLostBehavior() == WaylineExitOnRCLostBehavior.EXCUTE_RC_LOST_ACTION) {
            waylineModel.setLostAction(config.getExitOnRCLostType());
        } else {
            waylineModel.setLostAction(WaylineExitOnRCLostAction.UNKNOWN);
        }
        Pair turnModePair = Pair.create((Object)template.getWaypointInfo().getGlobalTurnMode(), (Object)template.getWaypointInfo().getUseStraightLine());
        waylineModel.setWaypointTurnMode(this.mWaylineWaypointTypeTransform.transTo((Pair<WaylineWaypointTurnMode, Boolean>)turnModePair));
        WaylineWaypointPitchMode pitchMode = template.getWaypointInfo().getPitchMode();
        waylineModel.setGimbalPitchRotationEnable(pitchMode == WaylineWaypointPitchMode.USE_POINT_SETTING);
        waylineModel.setSecureTakeoffHeight(config.getSecurityTakeOffHeight().floatValue());
        waylineModel.setFlightCali(template.getWaypointInfo().getCaliFlightEnable());
        waylineModel.setActions(this.transWaylineGlobalActionsTo(template.getWaypointInfo().getGlobalAction()));
        WaylineWaypointYawParam yawParam = template.getWaypointInfo().getGlobalYawParam();
        waylineModel.setHeadingMode(this.mWaylineHeadingModeTransform.transTo(yawParam.getYawMode()));
        if (waylineModel.getHeadingMode() == WaypointMissionHeadingMode.TOWARD_POINT_OF_INTEREST && yawParam.getPoiLocation() != null) {
            waylineModel.setPoiLatitude(yawParam.getPoiLocation().getLatitude());
            waylineModel.setPoiLongitude(yawParam.getPoiLocation().getLongitude());
        }
        List<WaylinePayloadInfo> payloadInfos = config.getPayloadInfo();
        LinkedHashMap<Integer, Object> droneCameras = new LinkedHashMap<Integer, Object>();
        for (int i = 0; i < payloadInfos.size(); ++i) {
            DroneCameraModel droneCameraModel = this.mWaylinePayloadInfoTransform.transTo(payloadInfos.get(i));
            droneCameras.put(droneCameraModel.getCameraIndex(), droneCameraModel);
        }
        List<WaylinePayloadParam> payloadParams = template.getPayloadParam();
        for (WaylinePayloadParam payloadParam : payloadParams) {
            int index = payloadParam.getPayloadPositionIndex();
            PayloadConfigInfoModel configInfoModel = this.mWaylinePaylodParamTransform.transTo(payloadParam);
            DroneCameraModel cameraModel = (DroneCameraModel)droneCameras.get(index);
            if (cameraModel == null) continue;
            cameraModel.setPayloadConfigInfo(configInfoModel);
            if (payloadParam.getImageFormat() == null) continue;
            cameraModel.setPhotoTypes(new HashSet<CameraLensType>(payloadParam.getImageFormat()));
        }
        DroneHeightModel droneHeightModel = new DroneHeightModel();
        droneHeightModel.setUseAbsolute(template.getCoordinateParam().getAltitudeMode() == WaylineAltitudeMode.EGM96);
        droneHeightModel.setAboveGroundMode(template.getCoordinateParam().getAltitudeMode() == WaylineAltitudeMode.ABOVE_GROUND_LEVEL);
        if (config.getIsTakeOffPositionRefSet().booleanValue()) {
            droneHeightModel.setTakeoffHeight(config.getTakeOffPositionRef().getAltitude().floatValue());
            droneHeightModel.setTakeoffLat(config.getTakeOffPositionRef().getLatitude());
            droneHeightModel.setTakeoffLng(config.getTakeOffPositionRef().getLongitude());
            droneHeightModel.setHasTakeoffHeight(true);
        }
        DroneInfoModel droneInfoModel = new DroneInfoModel();
        droneInfoModel.setDroneCamera(new ArrayList<DroneCameraModel>(droneCameras.values()));
        droneInfoModel.setDroneHeight(droneHeightModel);
        droneInfoModel.setDroneType(this.mWaylineDroneTypeTransform.transTo(config.getDroneInfo()));
        waylineModel.setDroneInfo(droneInfoModel);
        return waylineModel;
    }

    private List<WaypointActionModel> transWaylineGlobalActionsTo(WaylineActionGroup globalAction) {
        ArrayList<WaypointActionModel> actionModels = new ArrayList<WaypointActionModel>();
        if (globalAction == null) {
            return actionModels;
        }
        WaylineActionTrigger trigger = globalAction.getTrigger();
        WaylineActionTriggerType triggerType = trigger.getTriggerType();
        if (triggerType == WaylineActionTriggerType.REACH_POINT) {
            List<WaylineActionInfo> actionInfos = globalAction.getActions();
            for (WaylineActionInfo actionInfo : actionInfos) {
                WaypointActionModel actionModel = this.mWaylineActionTemplateTransform.trans(actionInfo);
                if (actionModel == null) continue;
                actionModels.add(actionModel);
            }
        }
        return actionModels;
    }

    private List<WaypointModel> transWaypointTemplateTo(WaylineTemplateWaypointInfo template) {
        ArrayList<WaypointModel> waypointModels = new ArrayList<WaypointModel>();
        for (int i = 0; i < template.getWaypoints().size(); ++i) {
            WaylineWaypoint waypoint = template.getWaypoints().get(i);
            WaypointModel waypointModel = new WaypointModel();
            waypointModel.setLatitude(waypoint.getLocation().getLatitude());
            waypointModel.setLongitude(waypoint.getLocation().getLongitude());
            waypointModel.setUseWaylineAltitude(waypoint.getUseGlobalFlightHeight());
            waypointModel.setUseWaylineHeadMode(waypoint.getUseGlobalYawParam());
            waypointModel.setUseWaylinePointType(waypoint.getUseGlobalTurnParam());
            waypointModel.setUseWaylineSpeed(waypoint.getUseGlobalAutoFlightSpeed());
            waypointModel.setAltitude(waypoint.getHeight().floatValue());
            waypointModel.setWgs84Altitude(waypoint.getEllipsoidHeight().floatValue());
            if (waypoint.getIsWaylineWaypointTurnParamSet().booleanValue()) {
                waypointModel.setCornerRadius(waypoint.getTurnParam().getTurnDampingDistance().floatValue());
                Pair turnModePair = Pair.create((Object)waypoint.getTurnParam().getTurnMode(), (Object)waypoint.getUseStraightLine());
                waypointModel.setWaypointTurnMode(this.mWaylineWaypointTypeTransform.transTo((Pair<WaylineWaypointTurnMode, Boolean>)turnModePair));
            }
            if (waypoint.getIsWaylineWaypointYawParamSet().booleanValue()) {
                waypointModel.setTurnMode(this.mWaylineTurnModeTransform.transTo(waypoint.getYawParam().getYawPathMode()));
                waypointModel.setHeadingMode(this.mWaylineHeadingModeTransform.transTo(waypoint.getYawParam().getYawMode()));
                waypointModel.setHeading(waypoint.getYawParam().getYawAngle().intValue());
            } else {
                waypointModel.setTurnMode(PointTurnMode.CLOCKWISE);
            }
            if (!waypoint.getUseGlobalAutoFlightSpeed().booleanValue()) {
                waypointModel.setSpeed(waypoint.getSpeed().floatValue());
            }
            waypointModel.setGimbalPitch(waypoint.getGimbalPitchAngle().floatValue());
            waypointModel.setIndex(waypoint.getWaypointIndex());
            waypointModel.setActions(new ArrayList<WaypointActionModel>());
            waypointModels.add(waypointModel);
        }
        this.transformActionTo(template.getActionGroups(), waypointModels);
        return waypointModels;
    }

    private List<WaylineActionGroup> transformActionsFrom(List<WaypointModel> waypoints) {
        ArrayList<WaylineActionGroup> actionGroups = new ArrayList<WaylineActionGroup>();
        for (int i = 0; i < waypoints.size(); ++i) {
            WaypointModel waypoint = waypoints.get(i);
            List<WaypointActionModel> actionModels = waypoint.getActions();
            ArrayList<WaylineActionInfo> actionInfos = new ArrayList<WaylineActionInfo>();
            for (WaypointActionModel item : actionModels) {
                WaylineActionInfo actionInfo = this.mWaypointActionTemplateTransform.trans(item);
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
            ArrayList<WaylineActionNodeList> nodeLists = new ArrayList<WaylineActionNodeList>();
            WaylineActionNodeList root = new WaylineActionNodeList();
            ArrayList<WaylineActionTreeNode> treeNodes = new ArrayList<WaylineActionTreeNode>();
            WaylineActionTreeNode rootNode = new WaylineActionTreeNode();
            rootNode.setNodeType(WaylineActionsRelationType.SEQUENCE);
            rootNode.setChildrenNum(actionInfos.size());
            treeNodes.add(rootNode);
            root.setNodes(treeNodes);
            nodeLists.add(root);
            WaylineActionNodeList children = new WaylineActionNodeList();
            ArrayList<WaylineActionTreeNode> childrenNodeList = new ArrayList<WaylineActionTreeNode>();
            for (int j = 0; j < actionInfos.size(); ++j) {
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

    private void transFromIntervalActions(List<WaypointModel> waypoints, List<WaylineActionGroup> actionGroups) {
        WaylineActionGroup intervalShotAction = null;
        for (int i = 0; i < waypoints.size(); ++i) {
            List<WaypointActionModel> actionModels = waypoints.get(i).getActions();
            for (WaypointActionModel item : actionModels) {
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

    private WaylineActionGroup getIntevalShootActionGroup(List<WaylineActionGroup> actionGroups, int waypointIndex, WaypointActionModel item) {
        WaylineActionGroup actionGroup = new WaylineActionGroup();
        actionGroup.setGroupId(actionGroups.size());
        actionGroup.setStartIndex(waypointIndex);
        actionGroup.setTrigger(this.getActionTrigger(item));
        ArrayList<WaylineActionInfo> actionInfos = new ArrayList<WaylineActionInfo>();
        WaylineActionInfo actionInfo = new WaylineActionInfo();
        actionInfo.setActionId(actionInfos.size());
        actionInfo.setActionType(WaylineActionType.TAKE_PHOTO);
        ArrayList<CameraLensType> photoTypes = new ArrayList<CameraLensType>();
        if (item.getPhotoTypes() != null) {
            photoTypes.addAll(item.getPhotoTypes());
        }
        ActionTakePhotoParam param = new ActionTakePhotoParam(item.getCameraIndex(), item.isFollowPhotoType(), photoTypes, null);
        actionInfo.setTakePhotoParam(param);
        actionInfos.add(actionInfo);
        actionGroup.setActions(actionInfos);
        ArrayList<WaylineActionNodeList> nodeLists = new ArrayList<WaylineActionNodeList>();
        WaylineActionNodeList root = new WaylineActionNodeList();
        ArrayList<WaylineActionTreeNode> treeNodes = new ArrayList<WaylineActionTreeNode>();
        WaylineActionTreeNode rootNode = new WaylineActionTreeNode();
        rootNode.setNodeType(WaylineActionsRelationType.SEQUENCE);
        rootNode.setChildrenNum(actionInfos.size());
        treeNodes.add(rootNode);
        root.setNodes(treeNodes);
        nodeLists.add(root);
        WaylineActionNodeList children = new WaylineActionNodeList();
        ArrayList<WaylineActionTreeNode> childrenNodeList = new ArrayList<WaylineActionTreeNode>();
        for (int j = 0; j < actionInfos.size(); ++j) {
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

    private WaylineActionTrigger getActionTrigger(WaypointActionModel item) {
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

    private void transformActionTo(List<WaylineActionGroup> waylineActionGroups, List<WaypointModel> waypointModels) {
        for (WaylineActionGroup actionGroup : waylineActionGroups) {
            WaylineActionTrigger trigger = actionGroup.getTrigger();
            WaylineActionTriggerType triggerType = trigger.getTriggerType();
            int pointIndex = actionGroup.getStartIndex();
            WaypointModel waypointModel = waypointModels.get(pointIndex);
            if (waypointModel.getActions() == null) {
                waypointModel.setActions(new ArrayList<WaypointActionModel>());
            }
            List<WaypointActionModel> actionModels = waypointModel.getActions();
            if (triggerType == WaylineActionTriggerType.REACH_POINT) {
                this.transReachPointActionsTo(actionGroup, waypointModel, actionModels);
                continue;
            }
            if (triggerType == WaylineActionTriggerType.MULTIPLE_TIMING) {
                this.transMultiTimeActionsTo(actionGroup, waypointModels, trigger.getTimeInterval().intValue(), actionModels);
                continue;
            }
            if (triggerType != WaylineActionTriggerType.MULTIPLE_DISTANCE) continue;
            this.transMultiDistanceActionsTo(actionGroup, waypointModels, trigger.getDistanceInterval().intValue(), actionModels);
        }
    }

    private void transReachPointActionsTo(WaylineActionGroup actionGroup, WaypointModel waypointModel, List<WaypointActionModel> actionModels) {
        List<WaylineActionInfo> actionInfos = actionGroup.getActions();
        for (WaylineActionInfo actionInfo : actionInfos) {
            WaypointActionModel actionModel = this.mWaylineActionTemplateTransform.trans(actionInfo);
            if (actionModel == null) continue;
            actionModels.add(actionModel);
        }
    }

    private void transMultiTimeActionsTo(WaylineActionGroup actionGroup, List<WaypointModel> waypointModels, int timeInterval, List<WaypointActionModel> actionModels) {
        List<WaylineActionInfo> infoList = actionGroup.getActions();
        ActionTakePhotoParam takePhotoParam = infoList.get(0).getTakePhotoParam();
        int actuatorIndex = takePhotoParam.getPayloadPositionIndex();
        WaypointActionModel actionModel = this.mWaylineActionTemplateTransform.getTimeIntervalShotAction(actuatorIndex, timeInterval);
        actionModel.setFollowPhotoType(takePhotoParam.getUseGlobalPayloadLensIndex());
        actionModel.setPhotoTypes(new HashSet<CameraLensType>(takePhotoParam.getPayloadLensIndex()));
        actionModels.add(actionModel);
        int endIndex = actionGroup.getEndIndex();
        WaypointModel endWaypointModel = waypointModels.get(endIndex);
        if (endWaypointModel.getActions() == null) {
            endWaypointModel.setActions(new ArrayList<WaypointActionModel>());
        }
        List<WaypointActionModel> endWaypointActions = endWaypointModel.getActions();
        endWaypointActions.add(this.mWaylineActionTemplateTransform.getIntervalShotStopAction(actuatorIndex));
    }

    private void transMultiDistanceActionsTo(WaylineActionGroup actionGroup, List<WaypointModel> waypointModels, int distanceInterval, List<WaypointActionModel> actionModels) {
        List<WaylineActionInfo> infoList = actionGroup.getActions();
        ActionTakePhotoParam takePhotoParam = infoList.get(0).getTakePhotoParam();
        int actuatorIndex = takePhotoParam.getPayloadPositionIndex();
        WaypointActionModel actionModel = this.mWaylineActionTemplateTransform.getDistanceIntervalShotAction(actuatorIndex, distanceInterval);
        actionModel.setFollowPhotoType(takePhotoParam.getUseGlobalPayloadLensIndex());
        actionModel.setPhotoTypes(new HashSet<CameraLensType>(takePhotoParam.getPayloadLensIndex()));
        actionModels.add(actionModel);
        int endIndex = actionGroup.getEndIndex();
        WaypointModel endWaypointModel = waypointModels.get(endIndex);
        if (endWaypointModel.getActions() == null) {
            endWaypointModel.setActions(new ArrayList<WaypointActionModel>());
        }
        List<WaypointActionModel> endWaypointActions = endWaypointModel.getActions();
        endWaypointActions.add(this.mWaylineActionTemplateTransform.getIntervalShotStopAction(actuatorIndex));
    }
}

