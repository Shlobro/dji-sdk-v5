/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 *  androidx.annotation.NonNull
 *  dji.sdk.wpmz.value.mission.Wayline
 *  dji.sdk.wpmz.value.mission.WaylineActionGroup
 *  dji.sdk.wpmz.value.mission.WaylineActionType
 *  dji.sdk.wpmz.value.mission.WaylineLocationCoordinate3D
 */
package com.dji.industry.mission.waypointv2.abstraction;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.dji.industry.mission.WaypointV2SuspendType;
import com.dji.industry.mission.natives.util.NativeCallbackUtils;
import com.dji.industry.mission.waypointv2.abstraction.ActionInfo;
import com.dji.industry.mission.waypointv2.action.ActionTypes;
import com.dji.industry.mission.waypointv2.action.NavigationAccurateShootPhotoOperationParam;
import com.dji.industry.mission.waypointv2.action.WaypointActuator;
import com.dji.industry.mission.waypointv2.action.WaypointAircraftControlFlightCalibrationParam;
import com.dji.industry.mission.waypointv2.action.WaypointAircraftControlParam;
import com.dji.industry.mission.waypointv2.action.WaypointAircraftControlRotateYawParam;
import com.dji.industry.mission.waypointv2.action.WaypointAircraftControlStartStopFlyParam;
import com.dji.industry.mission.waypointv2.action.WaypointCameraActuatorParam;
import com.dji.industry.mission.waypointv2.action.WaypointCameraCustomNameParam;
import com.dji.industry.mission.waypointv2.action.WaypointCameraFocusModeParam;
import com.dji.industry.mission.waypointv2.action.WaypointCameraFocusParam;
import com.dji.industry.mission.waypointv2.action.WaypointCameraStartIntervalShotParam;
import com.dji.industry.mission.waypointv2.action.WaypointCameraStopIntervalShotParam;
import com.dji.industry.mission.waypointv2.action.WaypointCameraZoomParam;
import com.dji.industry.mission.waypointv2.action.WaypointComplexReachPointTriggerParam;
import com.dji.industry.mission.waypointv2.action.WaypointDJISYSActuatorParam;
import com.dji.industry.mission.waypointv2.action.WaypointDJISYSRecordPointCloudParam;
import com.dji.industry.mission.waypointv2.action.WaypointGimbalActuatorParam;
import com.dji.industry.mission.waypointv2.action.WaypointIntervalTriggerParam;
import com.dji.industry.mission.waypointv2.action.WaypointNavigationActionParam;
import com.dji.industry.mission.waypointv2.action.WaypointPayloadOperationActuatorParam;
import com.dji.industry.mission.waypointv2.action.WaypointPayloadOperationParam;
import com.dji.industry.mission.waypointv2.action.WaypointReachPointTriggerParam;
import com.dji.industry.mission.waypointv2.action.WaypointTrajectoryTriggerParam;
import com.dji.industry.mission.waypointv2.action.WaypointTrigger;
import com.dji.industry.mission.waypointv2.action.WaypointV2Action;
import com.dji.industry.mission.waypointv2.action.WaypointV2AssociateTriggerParam;
import com.dji.industry.mission.waypointv2.common.waypointv2.AbstractionState;
import com.dji.industry.mission.waypointv2.common.waypointv2.ActionEvent;
import com.dji.industry.mission.waypointv2.common.waypointv2.ActionExecuteData;
import com.dji.industry.mission.waypointv2.common.waypointv2.ActionStateChangeInformation;
import com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorAircraftControlFlightCalibration;
import com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorAircraftControlRotateYawParam;
import com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorAircraftControlStartStopFlyParam;
import com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorCameraCustomNameParam;
import com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorCameraFocusModeParam;
import com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorCameraFocusParam;
import com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorCameraStartIntervalShotParam;
import com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorCameraStopIntervalShotParam;
import com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorCameraZoomLengthParam;
import com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorDJISYSRecordPointCloudParam;
import com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorNavigationAccurateShootPhotoOperatingParam;
import com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorPayloadControlOperatingParam;
import com.dji.industry.mission.waypointv2.common.waypointv2.AircraftControlActionType;
import com.dji.industry.mission.waypointv2.common.waypointv2.AssociateType;
import com.dji.industry.mission.waypointv2.common.waypointv2.CameraActionType;
import com.dji.industry.mission.waypointv2.common.waypointv2.CameraCustomNameCmdType;
import com.dji.industry.mission.waypointv2.common.waypointv2.DJISYSActionType;
import com.dji.industry.mission.waypointv2.common.waypointv2.GimbalActionType;
import com.dji.industry.mission.waypointv2.common.waypointv2.IntervalType;
import com.dji.industry.mission.waypointv2.common.waypointv2.RecordPointCloudOperateType;
import com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionActuator;
import com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionActuatorType;
import com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionAssociateTriggerParam;
import com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionConfig;
import com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionOperatorAircraftControl;
import com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionOperatorCamera;
import com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionOperatorDJISYS;
import com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionOperatorGimbal;
import com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionOperatorNavigation;
import com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionOperatorPayload;
import com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionReachPointsTriggerParam;
import com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionSimpleIntervalParam;
import com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionSimpleReachPointParam;
import com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionTrajectoryTriggerParam;
import com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionTrigger;
import com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionTriggerType;
import com.dji.industry.mission.waypointv2.common.waypointv2.WaypointExecuteData;
import com.dji.industry.mission.waypointv2.common.waypointv2.WaypointStateChangeInformation;
import com.dji.industry.mission.waypointv2.error.DJIWaypointV2Error;
import com.dji.industry.mission.waypointv2.gimbal.Rotation;
import dji.sdk.wpmz.value.mission.Wayline;
import dji.sdk.wpmz.value.mission.WaylineActionGroup;
import dji.sdk.wpmz.value.mission.WaylineActionType;
import dji.sdk.wpmz.value.mission.WaylineLocationCoordinate3D;
import dji.v5.common.KeepProguard;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.common.error.IDJIError;
import dji.v5.manager.aircraft.waypoint3.WaylineExecutingInfoListener;
import dji.v5.manager.aircraft.waypoint3.WaypointActionListener;
import dji.v5.manager.aircraft.waypoint3.WaypointMissionExecuteStateListener;
import dji.v5.manager.aircraft.waypoint3.model.BreakPointInfo;
import dji.v5.manager.aircraft.waypoint3.model.WaylineExecutingInfo;
import dji.v5.manager.aircraft.waypoint3.model.WaypointMissionExecuteState;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class WaypointV2Abstraction
implements KeepProguard {
    private static final String VERSION = "1.0.0";
    private static final long DEVICE_ID = 0L;
    private WaypointV2SuspendType suspendType;
    private static final int GO_BACK_TO_RECORD_POINT = 0;
    private static String currentMissionName;
    private static WaylineExecutingInfo waylineExecutingInfo;
    private static boolean isReachedFirstWaypoint;
    private static final double PROGRESS_BEGIN = 10.0;
    private static final double PROGRESS_HALF = 50.0;
    private static final double PROGRESS_FINISH = 100.0;
    private static final int MISSION_DELAY_TIME = 500;
    private static Integer upLoadErrorCode;
    private static final List<WaypointMissionExecuteStateListener> waypointExecuteStateListeners;
    private static final List<WaylineExecutingInfoListener> waylineExecuteStateListeners;
    private static final List<WaypointActionListener> mActionStateListeners;
    private static List<WaypointV2Action> actionList;
    private static CommonCallbacks.CompletionCallbackWithProgress<Double> uploadProgressCallback;
    private static final HashMap<Integer, ActionInfo> actionsMap;
    private static WaypointMissionExecuteState lastExecuteState;
    private static DJIWaypointV2Error lastError;
    private static boolean isUploadFinish;

    private void init() {
    }

    @Keep
    public static void onWaypointUploadStateChangeCallback(long l2, byte[] byArray) {
    }

    @Keep
    public static void onWaypointDownloadStateChangeCallback(long l2, byte[] byArray) {
    }

    @Keep
    public static void onWaypointExecutionStateChangeCallback(long l2, byte[] byArray) {
    }

    private static int getCurIndex(WaypointExecuteData waypointExecuteData, int n) {
        return 0;
    }

    private static int getWpIndex() {
        return 0;
    }

    private static boolean isExecuteFinish(WaypointStateChangeInformation waypointStateChangeInformation) {
        return false;
    }

    private static boolean isExecuting(WaypointStateChangeInformation waypointStateChangeInformation) {
        return false;
    }

    private static WaypointStateChangeInformation getWaypointStateChangeInformation(byte[] byArray) {
        return null;
    }

    @Keep
    public static void onWaypointSampleStateChangeCallback(long l2, byte[] byArray) {
    }

    @Keep
    public static void onActionUploadStateChangeCallback(long l2, byte[] byArray) {
    }

    @Keep
    public static void onActionDownloadStateChangeCallback(long l2, byte[] byArray) {
    }

    @Keep
    public static void onActionExecutionStateChangeCallback(long l2, byte[] byArray) {
    }

    private static void notifyActionState(ActionEvent actionEvent, Integer n, ActionExecuteData actionExecuteData) {
    }

    @Keep
    public static void onTranjectoryReplayStateChangeCallback(long l2, byte[] byArray) {
    }

    public static void pushKMZFileToAircraft(String string, CommonCallbacks.CompletionCallbackWithProgress<Double> completionCallbackWithProgress) {
    }

    private static void generateActionMap(Wayline wayline) {
    }

    private static boolean isCameraSameType(WaylineActionType waylineActionType, WaypointV2Action waypointV2Action) {
        return false;
    }

    private static boolean isSameType(WaylineActionType waylineActionType, WaypointV2Action waypointV2Action, WaypointV2Action waypointV2Action2, WaypointV2Action waypointV2Action3) {
        return false;
    }

    private static boolean isHoverSameType(WaypointV2Action waypointV2Action, WaypointV2Action waypointV2Action2, WaypointV2Action waypointV2Action3) {
        return false;
    }

    private static WaylineLocationCoordinate3D getLocation3D() {
        return null;
    }

    public static void startMission(String string, CommonCallbacks.CompletionCallback completionCallback) {
    }

    public void interruptMission(CommonCallbacks.CompletionCallback completionCallback) {
    }

    public void recoverMission(CommonCallbacks.CompletionCallback completionCallback) {
    }

    public void recoverMission(BreakPointInfo breakPointInfo, CommonCallbacks.CompletionCallback completionCallback) {
    }

    public void stopMission(CommonCallbacks.CompletionCallback completionCallback) {
    }

    public void addWaypointMissionExecuteStateListener(WaypointMissionExecuteStateListener waypointMissionExecuteStateListener) {
    }

    public void removeWaypointMissionExecuteStateListener(WaypointMissionExecuteStateListener waypointMissionExecuteStateListener) {
    }

    public void clearAllWaypointMissionExecuteStateListener() {
    }

    public void addWaylineExecutingInfoListener(WaylineExecutingInfoListener waylineExecutingInfoListener) {
    }

    public void removeWaylineExecutingInfoListener(WaylineExecutingInfoListener waylineExecutingInfoListener) {
    }

    public void clearAllWaylineExecutingInfoListener() {
    }

    public void addWaypointActionListener(WaypointActionListener waypointActionListener) {
    }

    public void removeWaypointActionListener(WaypointActionListener waypointActionListener) {
    }

    public void clearAllWaypointActionListener() {
    }

    private static void notifyWaylineExecutingInfo(WaylineExecutingInfo waylineExecutingInfo) {
    }

    private static WaypointMissionExecuteState convertFromAbstractionState(AbstractionState abstractionState) {
        return null;
    }

    public void destroy() {
    }

    private static void publishMissionWaylineInfo(int n) {
    }

    private static void publishMissionState(WaypointMissionExecuteState waypointMissionExecuteState) {
    }

    private static void notifyWaylineExecutingInterruptReason(IDJIError iDJIError) {
    }

    private static NativeCallbackUtils.CommonCallback commonCallback(CommonCallbacks.CompletionCallback completionCallback, boolean bl) {
        return null;
    }

    private static ActionStateChangeInformation getActionStateChangeInformation(byte[] byArray) {
        return null;
    }

    private static IDJIError convertMissionErrorCode(int n) {
        return null;
    }

    private static void uploadWaypointActions(@NonNull List<WaypointV2Action> list) {
    }

    private static void uploadFinish() {
    }

    private static void uploadFailed(int n) {
    }

    private static void uploadMission(CommonCallbacks.CompletionCallbackWithProgress<Double> completionCallbackWithProgress) {
    }

    private static void nativeMsgCallback(long l2, byte[] byArray) {
    }

    private void findSuspendType() {
    }

    private NativeCallbackUtils.CommonCallback createCommonCallback(String string) {
        return null;
    }

    private void startListenMissionState() {
    }

    private static void changeActionGroup(Wayline wayline) {
    }

    private static void changeRotateParam(WaylineActionGroup waylineActionGroup) {
    }

    public static int toInt(Integer n) {
        return 0;
    }

    public static boolean toBool(Object object) {
        return false;
    }

    public static boolean toBool(Object object, boolean bl) {
        return false;
    }

    public static float toFloat(Object object) {
        return 0.0f;
    }

    public static WaypointV2Action convertFromJNIWaypointActionConfig(WaypointActionConfig waypointActionConfig) {
        return null;
    }

    private static WaypointActuator convertFromJNIActionActuator(WaypointActionActuator waypointActionActuator) {
        return null;
    }

    private static WaypointTrigger convertFromJNIActionTrigger(WaypointActionTrigger waypointActionTrigger) {
        return null;
    }

    private static WaypointReachPointTriggerParam convertFromJNISimpleReachPoint(WaypointActionSimpleReachPointParam waypointActionSimpleReachPointParam) {
        return null;
    }

    private static WaypointIntervalTriggerParam convertFromJNISimpleInterval(WaypointActionSimpleIntervalParam waypointActionSimpleIntervalParam) {
        return null;
    }

    private static ActionTypes.ActionIntervalType convertFromJNIIntervalType(IntervalType intervalType) {
        return null;
    }

    private static WaypointV2AssociateTriggerParam convertFromJNIAssociateTrigger(WaypointActionAssociateTriggerParam waypointActionAssociateTriggerParam) {
        return null;
    }

    private static ActionTypes.AssociatedTimingType convertFromJNIAssociateType(AssociateType associateType) {
        return null;
    }

    private static WaypointTrajectoryTriggerParam convertFromJNITrajectoryTrigger(WaypointActionTrajectoryTriggerParam waypointActionTrajectoryTriggerParam) {
        return null;
    }

    private static WaypointComplexReachPointTriggerParam convertFromJNIReachPoint(WaypointActionReachPointsTriggerParam waypointActionReachPointsTriggerParam) {
        return null;
    }

    private static ActionTypes.ActionActuatorType convertFromJNIActuatorType(WaypointActionActuatorType waypointActionActuatorType) {
        return null;
    }

    private static WaypointActionActuatorType convertFromActuatorType(ActionTypes.ActionActuatorType actionActuatorType) {
        return null;
    }

    private static WaypointAircraftControlParam convertFromJNIAircraftControl(WaypointActionOperatorAircraftControl waypointActionOperatorAircraftControl) {
        return null;
    }

    private static WaypointAircraftControlStartStopFlyParam convertFromJNIAircraftControl(ActuatorAircraftControlStartStopFlyParam actuatorAircraftControlStartStopFlyParam) {
        return null;
    }

    private static WaypointAircraftControlFlightCalibrationParam convertFromJNIFlightCalibrationParam(ActuatorAircraftControlFlightCalibration actuatorAircraftControlFlightCalibration) {
        return null;
    }

    private static WaypointAircraftControlRotateYawParam convertFromJNIRotateAircraftYaw(ActuatorAircraftControlRotateYawParam actuatorAircraftControlRotateYawParam) {
        return null;
    }

    private static ActionTypes.AircraftControlType convertFromJNIAircraftControlType(AircraftControlActionType aircraftControlActionType) {
        return null;
    }

    private static WaypointCameraActuatorParam convertFromJNICameraActuator(WaypointActionOperatorCamera waypointActionOperatorCamera) {
        return null;
    }

    private static int getRetryTime(WaypointActionOperatorCamera waypointActionOperatorCamera) {
        return 0;
    }

    private static WaypointCameraStopIntervalShotParam convertFromJNIStopIntervalShotParam(ActuatorCameraStopIntervalShotParam actuatorCameraStopIntervalShotParam) {
        return null;
    }

    private static WaypointCameraStartIntervalShotParam convertFromJNIStartIntervalShotParam(ActuatorCameraStartIntervalShotParam actuatorCameraStartIntervalShotParam) {
        return null;
    }

    private static WaypointCameraFocusModeParam convertFromJNICameraFocusModeParam(ActuatorCameraFocusModeParam actuatorCameraFocusModeParam) {
        return null;
    }

    private static WaypointCameraCustomNameParam convertFromJNICameraCustomName(ActuatorCameraCustomNameParam actuatorCameraCustomNameParam) {
        return null;
    }

    private static ActionTypes.CameraCustomNameType convertFromJNICameraCustomNameType(CameraCustomNameCmdType cameraCustomNameCmdType) {
        return null;
    }

    private static WaypointCameraFocusParam convertFromJNICameraFocusParam(ActuatorCameraFocusParam actuatorCameraFocusParam) {
        return null;
    }

    private static ActionTypes.CameraOperationType convertFromJNICameraOperationType(CameraActionType cameraActionType) {
        return null;
    }

    private static void setGimbalParam(WaypointActionOperatorGimbal waypointActionOperatorGimbal, Rotation.Builder builder) {
    }

    private static WaypointGimbalActuatorParam convertFromJNIGimbalActuator(WaypointActionOperatorGimbal waypointActionOperatorGimbal) {
        return null;
    }

    private static ActionTypes.GimbalOperationType convertFromJNIGimbalOperationType(GimbalActionType gimbalActionType) {
        return null;
    }

    private static WaypointPayloadOperationActuatorParam convertFromJNIPayload(WaypointActionOperatorPayload waypointActionOperatorPayload) {
        return null;
    }

    private static WaypointPayloadOperationParam convertFromJNIOperationParam(ActuatorPayloadControlOperatingParam actuatorPayloadControlOperatingParam) {
        return null;
    }

    private static WaypointNavigationActionParam convertFromJNINavigationActuator(WaypointActionOperatorNavigation waypointActionOperatorNavigation) {
        return null;
    }

    private static void setOtherActionInfos(ActuatorNavigationAccurateShootPhotoOperatingParam actuatorNavigationAccurateShootPhotoOperatingParam, NavigationAccurateShootPhotoOperationParam.Builder builder) {
    }

    private static WaypointDJISYSActuatorParam convertFromJNIDJISYSActuator(WaypointActionOperatorDJISYS waypointActionOperatorDJISYS) {
        return null;
    }

    private static ActionTypes.ActionTriggerType convertFromJNITriggerType(WaypointActionTriggerType waypointActionTriggerType) {
        return null;
    }

    private static ActionTypes.DJISYSType convertFromJNIDJISYSActionType(DJISYSActionType dJISYSActionType) {
        return null;
    }

    private static WaypointDJISYSRecordPointCloudParam convertFromJNIDJISYSRecordPointCloud(ActuatorDJISYSRecordPointCloudParam actuatorDJISYSRecordPointCloudParam) {
        return null;
    }

    private static ActionTypes.RecordPointCloudOperateType convertFromJNIRecordPointCloudOperateType(RecordPointCloudOperateType recordPointCloudOperateType) {
        return null;
    }

    private static NavigationAccurateShootPhotoOperationParam.AccurateShootPhotoTargetRect convertFromJNINavigationTargetRect(ActuatorNavigationAccurateShootPhotoOperatingParam actuatorNavigationAccurateShootPhotoOperatingParam) {
        return null;
    }

    private static WaypointActionConfig convertFromWaypointV2Action(WaypointV2Action waypointV2Action) {
        return null;
    }

    private static WaypointActionActuator convertFromActionActuator(WaypointActuator waypointActuator) {
        return null;
    }

    private static WaypointActionOperatorDJISYS convertFromDJISYSActuator(WaypointDJISYSActuatorParam waypointDJISYSActuatorParam) {
        return null;
    }

    private static ActuatorDJISYSRecordPointCloudParam convertFromDJISYSRecordPointCloud(WaypointDJISYSActuatorParam waypointDJISYSActuatorParam) {
        return null;
    }

    private static RecordPointCloudOperateType convertFromRecordPointCloudOperateType(ActionTypes.RecordPointCloudOperateType recordPointCloudOperateType) {
        return null;
    }

    private static DJISYSActionType convertFromDJISYSType(ActionTypes.DJISYSType dJISYSType) {
        return null;
    }

    private static WaypointActionTrigger convertFromActionTrigger(WaypointTrigger waypointTrigger) {
        return null;
    }

    private static WaypointActionSimpleReachPointParam convertFromSimpleReachPoint(WaypointReachPointTriggerParam waypointReachPointTriggerParam) {
        return null;
    }

    private static WaypointActionSimpleIntervalParam convertFromSimpleInterval(WaypointIntervalTriggerParam waypointIntervalTriggerParam) {
        return null;
    }

    private static IntervalType convertFromIntervalType(ActionTypes.ActionIntervalType actionIntervalType) {
        return null;
    }

    private static WaypointActionTrajectoryTriggerParam convertFromTrajectoryTrigger(WaypointTrajectoryTriggerParam waypointTrajectoryTriggerParam) {
        return null;
    }

    private static WaypointActionAssociateTriggerParam convertFromAssociateTrigger(WaypointV2AssociateTriggerParam waypointV2AssociateTriggerParam) {
        return null;
    }

    private static AssociateType convertFromAssociateType(ActionTypes.AssociatedTimingType associatedTimingType) {
        return null;
    }

    private static WaypointActionReachPointsTriggerParam convertFromReachPoint(WaypointComplexReachPointTriggerParam waypointComplexReachPointTriggerParam) {
        return null;
    }

    private static WaypointActionTriggerType convertFromTriggerType(ActionTypes.ActionTriggerType actionTriggerType) {
        return null;
    }

    private static WaypointActionOperatorAircraftControl convertFromAircraftControl(WaypointAircraftControlParam waypointAircraftControlParam) {
        return null;
    }

    private static ActuatorAircraftControlStartStopFlyParam convertFromAircraftControl(WaypointAircraftControlStartStopFlyParam waypointAircraftControlStartStopFlyParam) {
        return null;
    }

    private static ActuatorAircraftControlFlightCalibration convertFromFlightCalibration(WaypointAircraftControlFlightCalibrationParam waypointAircraftControlFlightCalibrationParam) {
        return null;
    }

    private static ActuatorAircraftControlRotateYawParam convertFromRotateAircraftYaw(WaypointAircraftControlRotateYawParam waypointAircraftControlRotateYawParam) {
        return null;
    }

    private static AircraftControlActionType convertFromAircraftControlType(ActionTypes.AircraftControlType aircraftControlType) {
        return null;
    }

    private static WaypointActionOperatorCamera convertFromCameraActuator(WaypointCameraActuatorParam waypointCameraActuatorParam) {
        return null;
    }

    private static CameraActionType convertFromCameraOperationType(ActionTypes.CameraOperationType cameraOperationType) {
        return null;
    }

    private static ActuatorCameraFocusParam convertFromCameraFocusParam(WaypointCameraActuatorParam waypointCameraActuatorParam) {
        return null;
    }

    private static ActuatorCameraFocusModeParam convertFromCameraFocusModeParam(WaypointCameraActuatorParam waypointCameraActuatorParam) {
        return null;
    }

    private static WaypointCameraZoomParam convertFromJNICameraZoom(ActuatorCameraZoomLengthParam actuatorCameraZoomLengthParam) {
        return null;
    }

    private static ActuatorCameraZoomLengthParam convertFromCameraZoom(WaypointCameraActuatorParam waypointCameraActuatorParam) {
        return null;
    }

    private static ActuatorCameraCustomNameParam convertFromCameraCustomName(WaypointCameraActuatorParam waypointCameraActuatorParam) {
        return null;
    }

    private static CameraCustomNameCmdType convertFromCameraCustomNameType(ActionTypes.CameraCustomNameType cameraCustomNameType) {
        return null;
    }

    private static ActuatorCameraStartIntervalShotParam convertFromStartIntervalShotParam(WaypointCameraActuatorParam waypointCameraActuatorParam) {
        return null;
    }

    private static ActuatorCameraStopIntervalShotParam convertFromStopIntervalShotParam(WaypointCameraActuatorParam waypointCameraActuatorParam) {
        return null;
    }

    private static WaypointActionOperatorGimbal convertFromGimbalActuator(WaypointGimbalActuatorParam waypointGimbalActuatorParam) {
        return null;
    }

    private static GimbalActionType convertFromGimbalOperationType(ActionTypes.GimbalOperationType gimbalOperationType) {
        return null;
    }

    private static WaypointActionOperatorPayload convertFromPayloadParam(WaypointPayloadOperationActuatorParam waypointPayloadOperationActuatorParam) {
        return null;
    }

    private static ActuatorPayloadControlOperatingParam convertFromOperationParam(WaypointPayloadOperationParam waypointPayloadOperationParam) {
        return null;
    }

    private static WaypointActionOperatorNavigation convertFromNavigationParam(WaypointNavigationActionParam waypointNavigationActionParam) {
        return null;
    }

    private static /* synthetic */ void lambda$uploadFailed$8(int n) {
    }

    private static /* synthetic */ void lambda$uploadFinish$7() {
    }

    private static /* synthetic */ void lambda$uploadFinish$6() {
    }

    private static /* synthetic */ void lambda$uploadWaypointActions$5() {
    }

    private static /* synthetic */ void lambda$publishMissionState$4(WaypointMissionExecuteState waypointMissionExecuteState) {
    }

    private static /* synthetic */ void lambda$notifyWaylineExecutingInfo$3(WaylineExecutingInfo waylineExecutingInfo) {
    }

    private static /* synthetic */ void lambda$startMission$2(CommonCallbacks.CompletionCallback completionCallback) {
    }

    private static /* synthetic */ void lambda$notifyActionState$1(Integer n, IDJIError iDJIError) {
    }

    private static /* synthetic */ void lambda$notifyActionState$0(Integer n) {
    }

    static /* synthetic */ void access$000(int n) {
    }

    static /* synthetic */ IDJIError access$100(int n) {
        return null;
    }

    static /* synthetic */ void access$200(CommonCallbacks.CompletionCallbackWithProgress completionCallbackWithProgress) {
    }

    static /* synthetic */ void access$300(int n) {
    }

    static /* synthetic */ void access$400(WaypointMissionExecuteState waypointMissionExecuteState) {
    }

    static /* synthetic */ WaypointV2SuspendType access$502(WaypointV2Abstraction waypointV2Abstraction, WaypointV2SuspendType waypointV2SuspendType) {
        return null;
    }

    static {
        isReachedFirstWaypoint = false;
        upLoadErrorCode = null;
        waypointExecuteStateListeners = new CopyOnWriteArrayList<WaypointMissionExecuteStateListener>();
        waylineExecuteStateListeners = new CopyOnWriteArrayList<WaylineExecutingInfoListener>();
        mActionStateListeners = new CopyOnWriteArrayList<WaypointActionListener>();
        actionList = new CopyOnWriteArrayList<WaypointV2Action>();
        actionsMap = new HashMap();
        isUploadFinish = false;
    }
}

