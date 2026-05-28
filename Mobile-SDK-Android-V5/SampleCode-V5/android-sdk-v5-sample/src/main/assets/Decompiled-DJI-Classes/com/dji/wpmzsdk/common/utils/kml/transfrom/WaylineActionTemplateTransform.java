/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.transfrom;

import com.dji.wpmzsdk.common.utils.kml.model.PayloadWidgetModel;
import com.dji.wpmzsdk.common.utils.kml.model.PreciseShotInfo;
import com.dji.wpmzsdk.common.utils.kml.model.WaypointActionModel;
import com.dji.wpmzsdk.common.utils.kml.model.WaypointActionType;
import dji.sdk.wpmz.value.mission.ActionAccuratePhotoParam;
import dji.sdk.wpmz.value.mission.ActionAircraftHoverParam;
import dji.sdk.wpmz.value.mission.ActionAircraftRotateYawParam;
import dji.sdk.wpmz.value.mission.ActionCustomDirNameParam;
import dji.sdk.wpmz.value.mission.ActionGimbalRotateParam;
import dji.sdk.wpmz.value.mission.ActionOrientedPhotoParam;
import dji.sdk.wpmz.value.mission.ActionPSDKParam;
import dji.sdk.wpmz.value.mission.ActionRecordPointCloudParam;
import dji.sdk.wpmz.value.mission.ActionStartRecordParam;
import dji.sdk.wpmz.value.mission.ActionStopRecordParam;
import dji.sdk.wpmz.value.mission.ActionTakePhotoParam;
import dji.sdk.wpmz.value.mission.ActionZoomParam;
import dji.sdk.wpmz.value.mission.CameraLensType;
import dji.sdk.wpmz.value.mission.WaylineActionInfo;
import dji.sdk.wpmz.value.mission.WaylineActionRecordPointCloudOperateType;
import dji.sdk.wpmz.value.mission.WaylineActionType;
import dji.sdk.wpmz.value.mission.WaylineOrientedPhotoModeType;
import java.io.File;
import java.util.HashSet;

public class WaylineActionTemplateTransform {
    public WaypointActionModel trans(WaylineActionInfo actionInfo) {
        WaylineActionType actuatorType = actionInfo.getActionType();
        if (actuatorType == WaylineActionType.TAKE_PHOTO) {
            return this.tranTakePhotoAction(actionInfo);
        }
        if (actuatorType == WaylineActionType.START_RECORD) {
            return this.tranStartRecordAction(actionInfo);
        }
        if (actuatorType == WaylineActionType.STOP_RECORD) {
            return this.tranStopRecordAction(actionInfo);
        }
        if (actuatorType == WaylineActionType.ZOOM) {
            return this.tranZoomAction(actionInfo);
        }
        if (actuatorType == WaylineActionType.CUSTOM_DIR_NAME) {
            return this.tranCustomDirAction(actionInfo);
        }
        if (actuatorType == WaylineActionType.GIMBAL_ROTATE) {
            return this.tranGimbalRotateAction(actionInfo);
        }
        if (actuatorType == WaylineActionType.HOVER) {
            return this.tranAircraftHover(actionInfo);
        }
        if (actuatorType == WaylineActionType.ROTATE_YAW) {
            return this.tranAircraftRotateYaw(actionInfo);
        }
        if (actuatorType == WaylineActionType.ACCURATE_PHOTO) {
            return this.tranPreciseShootAction(actionInfo);
        }
        if (actuatorType == WaylineActionType.ORIENTED_PHOTO) {
            return this.tranOrientShootAction(actionInfo);
        }
        if (actuatorType == WaylineActionType.RECORD_POINT_CLOUD) {
            return this.transRecordPointCloudAction(actionInfo);
        }
        if (actuatorType == WaylineActionType.PSDK_ACTION) {
            return this.transPsdkAction(actionInfo);
        }
        if (actuatorType == WaylineActionType.PANO_SHOT) {
            return this.transPanoAction(actionInfo);
        }
        if (actuatorType == WaylineActionType.MEGAPHONE) {
            return this.transMegaPhoneAction(actionInfo);
        }
        if (actuatorType == WaylineActionType.SEARCHLIGHT) {
            return this.transSearchLightAction(actionInfo);
        }
        return null;
    }

    private WaypointActionModel transMegaPhoneAction(WaylineActionInfo actionInfo) {
        WaypointActionModel actionModel = new WaypointActionModel();
        actionModel.setActionType(WaypointActionType.MEGAPHONE);
        actionModel.setMegaphoneParam(actionInfo.getMegaphoneParam());
        return actionModel;
    }

    private WaypointActionModel transSearchLightAction(WaylineActionInfo actionInfo) {
        WaypointActionModel actionModel = new WaypointActionModel();
        actionModel.setActionType(WaypointActionType.SEARCHLIGHT);
        actionModel.setSearchlightParam(actionInfo.getSearchlightParam());
        return actionModel;
    }

    private WaypointActionModel transPanoAction(WaylineActionInfo actionInfo) {
        WaypointActionModel actionModel = new WaypointActionModel();
        actionModel.setActionType(WaypointActionType.PANO_SHOT);
        actionModel.setCameraIndex(actionInfo.getPanoShotParam().getPayloadPositionIndex());
        return actionModel;
    }

    private WaypointActionModel tranTakePhotoAction(WaylineActionInfo actionInfo) {
        ActionTakePhotoParam param = actionInfo.getTakePhotoParam();
        WaypointActionModel actionModel = new WaypointActionModel();
        actionModel.setCameraIndex(param.getPayloadPositionIndex());
        actionModel.setActionType(WaypointActionType.START_TAKE_PHOTO);
        actionModel.setMediaPathName(param.getFileSuffix());
        actionModel.setFollowPhotoType(param.getUseGlobalPayloadLensIndex());
        actionModel.setPhotoTypes(new HashSet<CameraLensType>(param.getPayloadLensIndex()));
        return actionModel;
    }

    private WaypointActionModel tranStartRecordAction(WaylineActionInfo actionInfo) {
        ActionStartRecordParam param = actionInfo.getStartRecordParam();
        WaypointActionModel actionModel = new WaypointActionModel();
        actionModel.setCameraIndex(param.getPayloadPositionIndex());
        actionModel.setActionType(WaypointActionType.START_RECORD);
        actionModel.setMediaPathName(param.getFileSuffix());
        actionModel.setFollowPhotoType(param.getUseGlobalPayloadLensIndex());
        actionModel.setPhotoTypes(new HashSet<CameraLensType>(param.getPayloadLensIndex()));
        return actionModel;
    }

    private WaypointActionModel tranStopRecordAction(WaylineActionInfo actionInfo) {
        ActionStopRecordParam param = actionInfo.getStopRecordParam();
        WaypointActionModel actionModel = new WaypointActionModel();
        actionModel.setCameraIndex(param.getPayloadPositionIndex());
        actionModel.setActionType(WaypointActionType.STOP_RECORD);
        return actionModel;
    }

    private WaypointActionModel tranZoomAction(WaylineActionInfo actionInfo) {
        ActionZoomParam param = actionInfo.getZoomParam();
        WaypointActionModel actionModel = new WaypointActionModel();
        actionModel.setCameraIndex(param.getPayloadPositionIndex());
        actionModel.setActionType(WaypointActionType.CAMERA_ZOOM);
        actionModel.setParam((int)(param.getFocalLength() * 10.0));
        actionModel.setAccuracy(1);
        return actionModel;
    }

    private WaypointActionModel tranCustomDirAction(WaylineActionInfo actionInfo) {
        ActionCustomDirNameParam param = actionInfo.getCustomDirNameParam();
        WaypointActionModel actionModel = new WaypointActionModel();
        actionModel.setCameraIndex(param.getPayloadPositionIndex());
        actionModel.setActionType(WaypointActionType.CAMERA_MKDIR);
        actionModel.setMediaPathName(param.getDirectoryName());
        return actionModel;
    }

    private WaypointActionModel tranGimbalRotateAction(WaylineActionInfo actionInfo) {
        ActionGimbalRotateParam param = actionInfo.getGimbalRotateParam();
        WaypointActionModel actionModel = new WaypointActionModel();
        actionModel.setCameraIndex(param.getPayloadPositionIndex());
        if (param.getEnablePitch().booleanValue()) {
            actionModel.setActionType(WaypointActionType.GIMBAL_PITCH);
            actionModel.setParam((int)(param.getPitch() * 10.0));
            actionModel.setAccuracy(1);
            return actionModel;
        }
        if (param.getEnableYaw().booleanValue()) {
            actionModel.setActionType(WaypointActionType.GIMBAL_YAW);
            actionModel.setParam((int)(param.getYaw() * 10.0));
            actionModel.setAccuracy(1);
            return actionModel;
        }
        return null;
    }

    private WaypointActionModel tranAircraftHover(WaylineActionInfo actionInfo) {
        ActionAircraftHoverParam param = actionInfo.getAircraftHoverParam();
        WaypointActionModel actionModel = new WaypointActionModel();
        actionModel.setActionType(WaypointActionType.STAY);
        actionModel.setParam((int)(param.getHoverTime() * 1000.0));
        return actionModel;
    }

    private WaypointActionModel tranAircraftRotateYaw(WaylineActionInfo actionInfo) {
        ActionAircraftRotateYawParam param = actionInfo.getAircraftRotateYawParam();
        WaypointActionModel actionModel = new WaypointActionModel();
        actionModel.setActionType(WaypointActionType.ROTATE_AIRCRAFT);
        actionModel.setParam(param.getHeading().intValue());
        return actionModel;
    }

    private WaypointActionModel tranPreciseShootAction(WaylineActionInfo actionInfo) {
        ActionAccuratePhotoParam param = actionInfo.getAccuratePhotoParam();
        WaypointActionModel actionModel = new WaypointActionModel();
        if (param.getIsFrameValid().booleanValue()) {
            actionModel.setActionType(WaypointActionType.PRECISE_SHOT);
        } else {
            actionModel.setActionType(WaypointActionType.NORMAL_PRECISE_SHOT);
        }
        actionModel.setMediaPathName(param.getFile_infos().getFileSuffix());
        actionModel.setCameraIndex(param.getDevice_infos().getGimbal_port());
        actionModel.setFollowPhotoType(param.getUseGlobalPayloadLensIndex());
        actionModel.setPhotoTypes(new HashSet<CameraLensType>(param.getPayloadLensIndex()));
        actionModel.setPreciseShotInfo(this.getPreciseInfo(actionInfo));
        return actionModel;
    }

    private WaypointActionModel tranOrientShootAction(WaylineActionInfo actionInfo) {
        ActionOrientedPhotoParam param = actionInfo.getOrientedPhotoParam();
        WaypointActionModel actionModel = new WaypointActionModel();
        actionModel.setActionType(WaypointActionType.ORIENTED_SHOT);
        actionModel.setMediaPathName(param.getFile_infos().getFileSuffix());
        actionModel.setCameraIndex(param.getDevice_infos().getGimbal_port());
        actionModel.setFollowPhotoType(param.getUseGlobalPayloadLensIndex());
        actionModel.setPhotoTypes(new HashSet<CameraLensType>(param.getPayloadLensIndex()));
        actionModel.setPreciseShotInfo(this.getOrientPreciseInfo(actionInfo));
        return actionModel;
    }

    private WaypointActionModel transPsdkAction(WaylineActionInfo actionInfo) {
        ActionPSDKParam param = actionInfo.getPsdkParam();
        WaypointActionModel actionModel = new WaypointActionModel();
        actionModel.setCameraIndex(param.getPayloadPositionIndex());
        actionModel.setPayloadType(param.getActionType());
        actionModel.setPayloadIndex(param.getActionIndex());
        actionModel.setParam(param.getActionParam().intValue());
        if (param.getActionType().intValue() == PayloadWidgetModel.TypeEnum.BUTTON.getValue()) {
            actionModel.setActionType(WaypointActionType.PAYLOAD_BUTTON);
        } else if (param.getActionType().intValue() == PayloadWidgetModel.TypeEnum.SWITCH.getValue()) {
            if (param.getActionParam().intValue() == 1) {
                actionModel.setActionType(WaypointActionType.PAYLOAD_SWITCH_ON);
            } else {
                actionModel.setActionType(WaypointActionType.PAYLOAD_SWITCH_OFF);
            }
        } else if (param.getActionType().intValue() == PayloadWidgetModel.TypeEnum.SEEK_BAR.getValue()) {
            actionModel.setActionType(WaypointActionType.PAYLOAD_SEEK_VALUE);
        }
        return actionModel;
    }

    private WaypointActionModel transRecordPointCloudAction(WaylineActionInfo actionInfo) {
        ActionRecordPointCloudParam param = actionInfo.getRecordPointCloudParam();
        WaypointActionModel actionModel = new WaypointActionModel();
        actionModel.setCameraIndex(param.getPayloadPositionIndex());
        WaylineActionRecordPointCloudOperateType operateType = param.getPointCloudOperateType();
        if (operateType == WaylineActionRecordPointCloudOperateType.START_RECORD) {
            actionModel.setActionType(WaypointActionType.START_POINT_CLOUD);
        } else if (operateType == WaylineActionRecordPointCloudOperateType.PAUSE_RECORD) {
            actionModel.setActionType(WaypointActionType.PAUSE_POINT_CLOUD);
        } else if (operateType == WaylineActionRecordPointCloudOperateType.RESUME_RECORD) {
            actionModel.setActionType(WaypointActionType.CONTINUE_POINT_CLOUD);
        } else if (operateType == WaylineActionRecordPointCloudOperateType.STOP_RECORD) {
            actionModel.setActionType(WaypointActionType.FINISH_POINT_CLOUD);
        }
        return actionModel;
    }

    private PreciseShotInfo getPreciseInfo(WaylineActionInfo actionInfo) {
        ActionAccuratePhotoParam operatingParam = actionInfo.getAccuratePhotoParam();
        PreciseShotInfo shotInfo = new PreciseShotInfo();
        shotInfo.setAfPosition(operatingParam.getCamera_infos().getAF_position());
        shotInfo.setCameraType(operatingParam.getDevice_infos().getCamera_type());
        File file = new File(operatingParam.getFile_infos().getFile_path());
        shotInfo.setCacheFileName(file.getName());
        shotInfo.setCacheFilePath(file.getParent());
        shotInfo.setFileMD5(operatingParam.getFile_infos().getFile_md5());
        shotInfo.setCameraIndex(operatingParam.getDevice_infos().getGimbal_port());
        shotInfo.setCropAngle(operatingParam.getTarget_rect().getAngle().floatValue());
        shotInfo.setCropHeight(operatingParam.getTarget_rect().getSize().getHeight().floatValue());
        shotInfo.setCropPosX(operatingParam.getTarget_rect().getPosition().getX().floatValue());
        shotInfo.setCropPosY(operatingParam.getTarget_rect().getPosition().getY().floatValue());
        shotInfo.setCropWidth(operatingParam.getTarget_rect().getSize().getWidth().floatValue());
        shotInfo.setDroneYaw(operatingParam.getHeading().floatValue());
        shotInfo.setFileSize(operatingParam.getFile_infos().getFile_size().intValue());
        shotInfo.setFocalDistance(operatingParam.getCamera_infos().getFocal_distance());
        shotInfo.setGimbalPitch(operatingParam.getGimbal_infos().getPitch().floatValue());
        shotInfo.setGimbalPort(operatingParam.getDevice_infos().getGimbal_port());
        shotInfo.setGimbalRoll(operatingParam.getGimbal_infos().getRoll().floatValue());
        shotInfo.setGimbalYaw(operatingParam.getGimbal_infos().getYaw().floatValue());
        shotInfo.setImageHeight(operatingParam.getImage_size().getHeight());
        shotInfo.setImageWidth(operatingParam.getImage_size().getWidth());
        shotInfo.setUuid(operatingParam.getActionUUID());
        shotInfo.setIsoParam(operatingParam.getCamera_infos().getCameraISO());
        shotInfo.setApertureSize(operatingParam.getCamera_infos().getCameraApertue());
        shotInfo.setExposureCompensation(operatingParam.getCamera_infos().getCameraEvBias());
        shotInfo.setObjectFocusDistance(operatingParam.getCamera_infos().getCameraObjectDistance());
        shotInfo.setShutterSpeed(operatingParam.getCamera_infos().getCameraShutterTime());
        shotInfo.setLuminance(operatingParam.getCamera_infos().getCameraLuminance());
        return shotInfo;
    }

    private PreciseShotInfo getOrientPreciseInfo(WaylineActionInfo actionInfo) {
        ActionOrientedPhotoParam operatingParam = actionInfo.getOrientedPhotoParam();
        PreciseShotInfo shotInfo = new PreciseShotInfo();
        shotInfo.setAfPosition(operatingParam.getCamera_infos().getAF_position());
        shotInfo.setCameraType(operatingParam.getDevice_infos().getCamera_type());
        File file = new File(operatingParam.getFile_infos().getFile_path());
        shotInfo.setCacheFileName(file.getName());
        shotInfo.setCacheFilePath(file.getParent());
        shotInfo.setFileMD5(operatingParam.getFile_infos().getFile_md5());
        shotInfo.setCameraIndex(operatingParam.getDevice_infos().getGimbal_port());
        shotInfo.setCropAngle(operatingParam.getTarget_rect().getAngle().floatValue());
        shotInfo.setCropHeight(operatingParam.getTarget_rect().getSize().getHeight().floatValue());
        shotInfo.setCropPosX(operatingParam.getTarget_rect().getPosition().getX().floatValue());
        shotInfo.setCropPosY(operatingParam.getTarget_rect().getPosition().getY().floatValue());
        shotInfo.setCropWidth(operatingParam.getTarget_rect().getSize().getWidth().floatValue());
        shotInfo.setDroneYaw(operatingParam.getHeading().floatValue());
        shotInfo.setFileSize(operatingParam.getFile_infos().getFile_size().intValue());
        shotInfo.setFocalDistance(operatingParam.getCamera_infos().getFocal_distance());
        shotInfo.setGimbalPitch(operatingParam.getGimbal_infos().getPitch().floatValue());
        shotInfo.setGimbalPort(operatingParam.getDevice_infos().getGimbal_port());
        shotInfo.setGimbalRoll(operatingParam.getGimbal_infos().getRoll().floatValue());
        shotInfo.setGimbalYaw(operatingParam.getGimbal_infos().getYaw().floatValue());
        shotInfo.setImageHeight(operatingParam.getImage_size().getHeight());
        shotInfo.setImageWidth(operatingParam.getImage_size().getWidth());
        shotInfo.setUuid(operatingParam.getActionUUID());
        shotInfo.setIsoParam(operatingParam.getCamera_infos().getCameraISO());
        shotInfo.setApertureSize(operatingParam.getCamera_infos().getCameraApertue());
        shotInfo.setExposureCompensation(operatingParam.getCamera_infos().getCameraEvBias());
        shotInfo.setObjectFocusDistance(operatingParam.getCamera_infos().getCameraObjectDistance());
        shotInfo.setShutterSpeed(operatingParam.getCamera_infos().getCameraShutterTime());
        shotInfo.setLuminance(operatingParam.getCamera_infos().getCameraLuminance());
        if (operatingParam.getModeParam().getModeType() == WaylineOrientedPhotoModeType.LOW_LIGHT_SMART_SHOOTING) {
            shotInfo.setPhotoMode(PreciseShotInfo.PhotoMode.LOW_LIGHT_SMART);
        } else {
            shotInfo.setPhotoMode(PreciseShotInfo.PhotoMode.NORMAL);
        }
        return shotInfo;
    }

    public WaypointActionModel getTimeIntervalShotAction(int cameraIndex, int param) {
        WaypointActionModel actionModel = new WaypointActionModel();
        actionModel.setCameraIndex(cameraIndex);
        actionModel.setActionType(WaypointActionType.START_TIME_INTERVAL_SHOT);
        actionModel.setParam(param);
        return actionModel;
    }

    public WaypointActionModel getDistanceIntervalShotAction(int cameraIndex, int param) {
        WaypointActionModel actionModel = new WaypointActionModel();
        actionModel.setCameraIndex(cameraIndex);
        actionModel.setActionType(WaypointActionType.START_DISTANCE_INTERVAL_SHOT);
        actionModel.setParam(param);
        return actionModel;
    }

    public WaypointActionModel getIntervalShotStopAction(int cameraIndex) {
        WaypointActionModel actionModel = new WaypointActionModel();
        actionModel.setCameraIndex(cameraIndex);
        actionModel.setActionType(WaypointActionType.STOP_INTERVAL_SHOT);
        return actionModel;
    }
}

