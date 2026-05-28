/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.dji.wpmzsdk.common.utils.kml.transfrom;

import com.dji.industry.pilot.data.cache.model.WaypointActionModelGreenDao;
import com.dji.wpmzsdk.common.utils.kml.model.PreciseShotInfo;
import com.dji.wpmzsdk.common.utils.kml.model.WaypointActionType;
import dji.sdk.wpmz.value.mission.ActionAccuratePhotoParam;
import dji.sdk.wpmz.value.mission.ActionAircraftHoverParam;
import dji.sdk.wpmz.value.mission.ActionAircraftRotateYawParam;
import dji.sdk.wpmz.value.mission.ActionCustomDirNameParam;
import dji.sdk.wpmz.value.mission.ActionGimbalRotateParam;
import dji.sdk.wpmz.value.mission.ActionPSDKParam;
import dji.sdk.wpmz.value.mission.ActionRecordPointCloudParam;
import dji.sdk.wpmz.value.mission.ActionStartRecordParam;
import dji.sdk.wpmz.value.mission.ActionStopRecordParam;
import dji.sdk.wpmz.value.mission.ActionTakePhotoParam;
import dji.sdk.wpmz.value.mission.ActionZoomParam;
import dji.sdk.wpmz.value.mission.WaylineActionAccurateShootPhotoCameraStateInformation;
import dji.sdk.wpmz.value.mission.WaylineActionAccurateShootPhotoDeviceInformation;
import dji.sdk.wpmz.value.mission.WaylineActionAccurateShootPhotoFileInformation;
import dji.sdk.wpmz.value.mission.WaylineActionAccurateShootPhotoGimbalStateInformation;
import dji.sdk.wpmz.value.mission.WaylineActionAccurateShootPhotoTargetRect;
import dji.sdk.wpmz.value.mission.WaylineActionAccurateShootPoint;
import dji.sdk.wpmz.value.mission.WaylineActionAccurateShootSize;
import dji.sdk.wpmz.value.mission.WaylineActionInfo;
import dji.sdk.wpmz.value.mission.WaylineActionRecordPointCloudOperateType;
import dji.sdk.wpmz.value.mission.WaylineActionType;
import dji.sdk.wpmz.value.mission.WaylineGimbalActuatorRotateMode;
import dji.sdk.wpmz.value.mission.WaylineWaypointYawPathMode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J&\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u00a8\u0006\u001e"}, d2={"Lcom/dji/wpmzsdk/common/utils/kml/transfrom/WaypointActionEntityTransform;", "", "()V", "trans", "Ldji/sdk/wpmz/value/mission/WaylineActionInfo;", "actionModel", "Lcom/dji/industry/pilot/data/cache/model/WaypointActionModelGreenDao;", "preciseInfos", "", "Lcom/dji/wpmzsdk/common/utils/kml/model/PreciseShotInfo;", "transCameraMkdir", "transCameraZoom", "transGimbalPitch", "transGimbalYaw", "transPSDKActions", "actionType", "Lcom/dji/wpmzsdk/common/utils/kml/model/WaypointActionType;", "transPayloadButton", "transPayloadSeekValue", "transPayloadSwitchOff", "transPayloadSwitchOn", "transPointCloudAction", "transPreciseShot", "frameValid", "", "transRotateAircraft", "transStartRecord", "transStay", "transStopRecord", "transTakePhoto", "wpmzsdk_release"})
public final class WaypointActionEntityTransform {
    @Nullable
    public final WaylineActionInfo trans(@NotNull WaypointActionModelGreenDao actionModel, @NotNull List<? extends PreciseShotInfo> preciseInfos) {
        WaylineActionInfo waylineActionInfo;
        Intrinsics.checkNotNullParameter((Object)actionModel, (String)"actionModel");
        Intrinsics.checkNotNullParameter(preciseInfos, (String)"preciseInfos");
        WaypointActionType waypointActionType = actionModel.getActionType();
        switch (waypointActionType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[waypointActionType.ordinal()]) {
            case 1: {
                waylineActionInfo = this.transStay(actionModel);
                break;
            }
            case 2: 
            case 3: 
            case 4: {
                waylineActionInfo = null;
                break;
            }
            case 5: {
                waylineActionInfo = this.transTakePhoto(actionModel);
                break;
            }
            case 6: {
                waylineActionInfo = this.transStartRecord(actionModel);
                break;
            }
            case 7: {
                waylineActionInfo = this.transStopRecord(actionModel);
                break;
            }
            case 8: {
                waylineActionInfo = this.transRotateAircraft(actionModel);
                break;
            }
            case 9: {
                waylineActionInfo = this.transGimbalPitch(actionModel);
                break;
            }
            case 10: {
                waylineActionInfo = this.transGimbalYaw(actionModel);
                break;
            }
            case 11: {
                waylineActionInfo = this.transCameraZoom(actionModel);
                break;
            }
            case 12: {
                waylineActionInfo = this.transPreciseShot(actionModel, preciseInfos, true);
                break;
            }
            case 13: {
                waylineActionInfo = this.transPreciseShot(actionModel, preciseInfos, false);
                break;
            }
            case 14: {
                waylineActionInfo = this.transCameraMkdir(actionModel);
                break;
            }
            default: {
                waylineActionInfo = this.transPSDKActions(actionModel.getActionType(), actionModel);
            }
        }
        return waylineActionInfo;
    }

    private final WaylineActionInfo transPSDKActions(WaypointActionType actionType, WaypointActionModelGreenDao actionModel) {
        WaylineActionInfo waylineActionInfo;
        WaypointActionType waypointActionType = actionType;
        switch (waypointActionType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[waypointActionType.ordinal()]) {
            case 15: {
                waylineActionInfo = this.transPayloadButton(actionModel);
                break;
            }
            case 16: {
                waylineActionInfo = this.transPayloadSwitchOn(actionModel);
                break;
            }
            case 17: {
                waylineActionInfo = this.transPayloadSwitchOff(actionModel);
                break;
            }
            case 18: {
                waylineActionInfo = this.transPayloadSeekValue(actionModel);
                break;
            }
            case 19: 
            case 20: 
            case 21: 
            case 22: {
                waylineActionInfo = this.transPointCloudAction(actionType, actionModel);
                break;
            }
            default: {
                waylineActionInfo = null;
            }
        }
        return waylineActionInfo;
    }

    private final WaylineActionInfo transTakePhoto(WaypointActionModelGreenDao actionModel) {
        WaylineActionInfo info = new WaylineActionInfo();
        info.setActionType(WaylineActionType.TAKE_PHOTO);
        List photoTypes = new ArrayList();
        ActionTakePhotoParam param = new ActionTakePhotoParam(actionModel.getCameraIndex(), false, photoTypes, actionModel.getMediaPathName());
        param.setPayloadPositionIndex(actionModel.getCameraIndex());
        info.setTakePhotoParam(param);
        return info;
    }

    private final WaylineActionInfo transStartRecord(WaypointActionModelGreenDao actionModel) {
        WaylineActionInfo info = new WaylineActionInfo();
        info.setActionType(WaylineActionType.START_RECORD);
        List photoTypes = new ArrayList();
        ActionStartRecordParam param = new ActionStartRecordParam(actionModel.getCameraIndex(), false, photoTypes, actionModel.getMediaPathName());
        info.setStartRecordParam(param);
        return info;
    }

    private final WaylineActionInfo transStopRecord(WaypointActionModelGreenDao actionModel) {
        WaylineActionInfo info = new WaylineActionInfo();
        info.setActionType(WaylineActionType.STOP_RECORD);
        ActionStopRecordParam param = new ActionStopRecordParam();
        param.setPayloadPositionIndex(actionModel.getCameraIndex());
        info.setStopRecordParam(param);
        return info;
    }

    private final WaylineActionInfo transStay(WaypointActionModelGreenDao actionModel) {
        WaylineActionInfo info = new WaylineActionInfo();
        info.setActionType(WaylineActionType.HOVER);
        ActionAircraftHoverParam param = new ActionAircraftHoverParam();
        param.setHoverTime((double)actionModel.getRealParam() / 1000.0);
        info.setAircraftHoverParam(param);
        return info;
    }

    private final WaylineActionInfo transRotateAircraft(WaypointActionModelGreenDao actionModel) {
        WaylineActionInfo info = new WaylineActionInfo();
        info.setActionType(WaylineActionType.ROTATE_YAW);
        ActionAircraftRotateYawParam param = new ActionAircraftRotateYawParam();
        param.setHeading(Double.valueOf(actionModel.getParam()));
        param.setPathMode(WaylineWaypointYawPathMode.FOLLOW_BAD_ARC);
        info.setAircraftRotateYawParam(param);
        return info;
    }

    private final WaylineActionInfo transGimbalPitch(WaypointActionModelGreenDao actionModel) {
        WaylineActionInfo info = new WaylineActionInfo();
        info.setActionType(WaylineActionType.GIMBAL_ROTATE);
        ActionGimbalRotateParam param = new ActionGimbalRotateParam();
        param.setEnablePitch(true);
        param.setPitch(Double.valueOf(actionModel.getRealParam()));
        param.setRotateMode(WaylineGimbalActuatorRotateMode.ABSOLUTE_ANGLE);
        param.setPayloadPositionIndex(actionModel.getCameraIndex());
        info.setGimbalRotateParam(param);
        return info;
    }

    private final WaylineActionInfo transGimbalYaw(WaypointActionModelGreenDao actionModel) {
        WaylineActionInfo info = new WaylineActionInfo();
        info.setActionType(WaylineActionType.GIMBAL_ROTATE);
        ActionGimbalRotateParam param = new ActionGimbalRotateParam();
        param.setEnableYaw(true);
        param.setYaw(Double.valueOf(actionModel.getRealParam()));
        param.setRotateMode(WaylineGimbalActuatorRotateMode.ABSOLUTE_ANGLE);
        param.setPayloadPositionIndex(actionModel.getCameraIndex());
        info.setGimbalRotateParam(param);
        return info;
    }

    private final WaylineActionInfo transCameraZoom(WaypointActionModelGreenDao actionModel) {
        WaylineActionInfo info = new WaylineActionInfo();
        info.setActionType(WaylineActionType.ZOOM);
        ActionZoomParam param = new ActionZoomParam();
        param.setFocalLength(Double.valueOf(actionModel.getRealParam()));
        param.setPayloadPositionIndex(actionModel.getCameraIndex());
        info.setZoomParam(param);
        return info;
    }

    private final WaylineActionInfo transPreciseShot(WaypointActionModelGreenDao actionModel, List<? extends PreciseShotInfo> preciseInfos, boolean frameValid) {
        PreciseShotInfo shotInfo;
        Object v0;
        ActionAccuratePhotoParam param;
        WaylineActionInfo info;
        block2: {
            info = new WaylineActionInfo();
            info.setActionType(WaylineActionType.ACCURATE_PHOTO);
            param = new ActionAccuratePhotoParam();
            for (Object t : (Iterable)preciseInfos) {
                PreciseShotInfo it = (PreciseShotInfo)t;
                boolean bl = false;
                if (!Intrinsics.areEqual((Object)it.getCacheFileName(), (Object)actionModel.getPreciseInfoName())) continue;
                v0 = t;
                break block2;
            }
            v0 = null;
        }
        PreciseShotInfo preciseShotInfo = shotInfo = (PreciseShotInfo)v0;
        if (preciseShotInfo != null) {
            PreciseShotInfo preciseShotInfo2;
            PreciseShotInfo preciseShotInfo3 = preciseShotInfo2 = preciseShotInfo;
            boolean bl = false;
            WaylineActionAccurateShootPhotoCameraStateInformation cameraInfo = new WaylineActionAccurateShootPhotoCameraStateInformation();
            cameraInfo.setFocal_distance(preciseShotInfo3.getFocalDistance());
            cameraInfo.setAF_position(preciseShotInfo3.getAfPosition());
            param.setCamera_infos(cameraInfo);
            WaylineActionAccurateShootPhotoDeviceInformation deviceInfo = new WaylineActionAccurateShootPhotoDeviceInformation();
            deviceInfo.setCamera_type(preciseShotInfo3.getCameraType());
            deviceInfo.setGimbal_port(preciseShotInfo3.getCameraIndex());
            param.setDevice_infos(deviceInfo);
            WaylineActionAccurateShootPhotoFileInformation fileInfo = new WaylineActionAccurateShootPhotoFileInformation();
            fileInfo.setFile_size((int)preciseShotInfo3.getFileSize());
            fileInfo.setFile_path(preciseShotInfo3.getCacheFileName());
            fileInfo.setFile_md5(preciseShotInfo3.getFileMD5());
            fileInfo.setFileSuffix(actionModel.getMediaPathName());
            param.setFile_infos(fileInfo);
            WaylineActionAccurateShootPhotoGimbalStateInformation gimbalInfo = new WaylineActionAccurateShootPhotoGimbalStateInformation();
            gimbalInfo.setPitch(Double.valueOf(preciseShotInfo3.getGimbalPitch()));
            gimbalInfo.setRoll(Double.valueOf(preciseShotInfo3.getGimbalRoll()));
            gimbalInfo.setYaw(Double.valueOf(preciseShotInfo3.getGimbalYaw()));
            param.setGimbal_infos(gimbalInfo);
            WaylineActionAccurateShootSize imageSize = new WaylineActionAccurateShootSize();
            imageSize.setHeight(preciseShotInfo3.getImageHeight());
            imageSize.setWidth(preciseShotInfo3.getImageWidth());
            param.setImage_size(imageSize);
            WaylineActionAccurateShootPhotoTargetRect targetRect = new WaylineActionAccurateShootPhotoTargetRect();
            targetRect.setAngle(Double.valueOf(preciseShotInfo3.getCropAngle()));
            WaylineActionAccurateShootPoint targetPos = new WaylineActionAccurateShootPoint();
            targetPos.setX((int)preciseShotInfo3.getCropPosX());
            targetPos.setY((int)preciseShotInfo3.getCropPosY());
            targetRect.setPosition(targetPos);
            WaylineActionAccurateShootSize cropSize = new WaylineActionAccurateShootSize();
            cropSize.setWidth((int)preciseShotInfo3.getCropWidth());
            cropSize.setHeight((int)preciseShotInfo3.getCropHeight());
            targetRect.setSize(cropSize);
            param.setTarget_rect(targetRect);
            param.setHeading(Double.valueOf(preciseShotInfo3.getDroneYaw()));
            param.setIsFrameValid(frameValid);
            param.setActionUUID(preciseShotInfo3.getUuid());
        }
        param.setUseGlobalPayloadLensIndex(false);
        List photoTypes = new ArrayList();
        param.setPayloadLensIndex(photoTypes);
        info.setAccuratePhotoParam(param);
        return info;
    }

    private final WaylineActionInfo transCameraMkdir(WaypointActionModelGreenDao actionModel) {
        WaylineActionInfo info = new WaylineActionInfo();
        info.setActionType(WaylineActionType.CUSTOM_DIR_NAME);
        ActionCustomDirNameParam param = new ActionCustomDirNameParam();
        param.setDirectoryName(actionModel.getMediaPathName());
        param.setPayloadPositionIndex(actionModel.getCameraIndex());
        info.setCustomDirNameParam(param);
        return info;
    }

    private final WaylineActionInfo transPayloadButton(WaypointActionModelGreenDao actionModel) {
        WaylineActionInfo info = new WaylineActionInfo();
        info.setActionType(WaylineActionType.PSDK_ACTION);
        ActionPSDKParam param = new ActionPSDKParam();
        param.setActionType(actionModel.getPayloadType());
        param.setActionIndex(actionModel.getPayloadIndex());
        param.setActionParam(1.0);
        param.setPayloadPositionIndex(actionModel.getCameraIndex());
        info.setPsdkParam(param);
        return info;
    }

    private final WaylineActionInfo transPayloadSwitchOn(WaypointActionModelGreenDao actionModel) {
        WaylineActionInfo info = new WaylineActionInfo();
        info.setActionType(WaylineActionType.PSDK_ACTION);
        ActionPSDKParam param = new ActionPSDKParam();
        param.setActionType(actionModel.getPayloadType());
        param.setActionIndex(actionModel.getPayloadIndex());
        param.setActionParam(1.0);
        param.setPayloadPositionIndex(actionModel.getCameraIndex());
        info.setPsdkParam(param);
        return info;
    }

    private final WaylineActionInfo transPayloadSwitchOff(WaypointActionModelGreenDao actionModel) {
        WaylineActionInfo info = new WaylineActionInfo();
        info.setActionType(WaylineActionType.PSDK_ACTION);
        ActionPSDKParam param = new ActionPSDKParam();
        param.setActionType(actionModel.getPayloadType());
        param.setActionIndex(actionModel.getPayloadIndex());
        param.setActionParam(0.0);
        param.setPayloadPositionIndex(actionModel.getCameraIndex());
        info.setPsdkParam(param);
        return info;
    }

    private final WaylineActionInfo transPayloadSeekValue(WaypointActionModelGreenDao actionModel) {
        WaylineActionInfo info = new WaylineActionInfo();
        info.setActionType(WaylineActionType.PSDK_ACTION);
        ActionPSDKParam param = new ActionPSDKParam();
        param.setActionType(actionModel.getPayloadType());
        param.setActionIndex(actionModel.getPayloadIndex());
        param.setActionParam(Double.valueOf(actionModel.getParam()));
        param.setPayloadPositionIndex(actionModel.getCameraIndex());
        info.setPsdkParam(param);
        return info;
    }

    private final WaylineActionInfo transPointCloudAction(WaypointActionType actionType, WaypointActionModelGreenDao actionModel) {
        WaylineActionInfo info = new WaylineActionInfo();
        info.setActionType(WaylineActionType.RECORD_POINT_CLOUD);
        ActionRecordPointCloudParam param = new ActionRecordPointCloudParam();
        if (actionType == WaypointActionType.START_POINT_CLOUD) {
            param.setPointCloudOperateType(WaylineActionRecordPointCloudOperateType.START_RECORD);
        } else if (actionType == WaypointActionType.PAUSE_POINT_CLOUD) {
            param.setPointCloudOperateType(WaylineActionRecordPointCloudOperateType.PAUSE_RECORD);
        } else if (actionType == WaypointActionType.CONTINUE_POINT_CLOUD) {
            param.setPointCloudOperateType(WaylineActionRecordPointCloudOperateType.RESUME_RECORD);
        } else if (actionType == WaypointActionType.FINISH_POINT_CLOUD) {
            param.setPointCloudOperateType(WaylineActionRecordPointCloudOperateType.STOP_RECORD);
        }
        param.setPayloadPositionIndex(actionModel.getCameraIndex());
        info.setRecordPointCloudParam(param);
        return info;
    }

    @Metadata(mv={1, 6, 0}, k=3, xi=48)
    public final class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] nArray = new int[WaypointActionType.values().length];
            nArray[WaypointActionType.STAY.ordinal()] = 1;
            nArray[WaypointActionType.START_TIME_INTERVAL_SHOT.ordinal()] = 2;
            nArray[WaypointActionType.START_DISTANCE_INTERVAL_SHOT.ordinal()] = 3;
            nArray[WaypointActionType.STOP_INTERVAL_SHOT.ordinal()] = 4;
            nArray[WaypointActionType.START_TAKE_PHOTO.ordinal()] = 5;
            nArray[WaypointActionType.START_RECORD.ordinal()] = 6;
            nArray[WaypointActionType.STOP_RECORD.ordinal()] = 7;
            nArray[WaypointActionType.ROTATE_AIRCRAFT.ordinal()] = 8;
            nArray[WaypointActionType.GIMBAL_PITCH.ordinal()] = 9;
            nArray[WaypointActionType.GIMBAL_YAW.ordinal()] = 10;
            nArray[WaypointActionType.CAMERA_ZOOM.ordinal()] = 11;
            nArray[WaypointActionType.PRECISE_SHOT.ordinal()] = 12;
            nArray[WaypointActionType.NORMAL_PRECISE_SHOT.ordinal()] = 13;
            nArray[WaypointActionType.CAMERA_MKDIR.ordinal()] = 14;
            nArray[WaypointActionType.PAYLOAD_BUTTON.ordinal()] = 15;
            nArray[WaypointActionType.PAYLOAD_SWITCH_ON.ordinal()] = 16;
            nArray[WaypointActionType.PAYLOAD_SWITCH_OFF.ordinal()] = 17;
            nArray[WaypointActionType.PAYLOAD_SEEK_VALUE.ordinal()] = 18;
            nArray[WaypointActionType.START_POINT_CLOUD.ordinal()] = 19;
            nArray[WaypointActionType.PAUSE_POINT_CLOUD.ordinal()] = 20;
            nArray[WaypointActionType.CONTINUE_POINT_CLOUD.ordinal()] = 21;
            nArray[WaypointActionType.FINISH_POINT_CLOUD.ordinal()] = 22;
            $EnumSwitchMapping$0 = nArray;
        }
    }
}

