/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.transfrom;

import com.dji.wpmzsdk.common.utils.kml.model.PreciseShotInfo;
import com.dji.wpmzsdk.common.utils.kml.model.WaypointActionModel;
import com.dji.wpmzsdk.common.utils.kml.model.WaypointActionType;
import dji.sdk.wpmz.value.mission.ActionAccuratePhotoParam;
import dji.sdk.wpmz.value.mission.ActionAircraftHoverParam;
import dji.sdk.wpmz.value.mission.ActionAircraftRotateYawParam;
import dji.sdk.wpmz.value.mission.ActionCustomDirNameParam;
import dji.sdk.wpmz.value.mission.ActionGimbalEvenlyRotateParam;
import dji.sdk.wpmz.value.mission.ActionGimbalRotateParam;
import dji.sdk.wpmz.value.mission.ActionOrientedPhotoParam;
import dji.sdk.wpmz.value.mission.ActionPSDKParam;
import dji.sdk.wpmz.value.mission.ActionPanoShotParam;
import dji.sdk.wpmz.value.mission.ActionRecordPointCloudParam;
import dji.sdk.wpmz.value.mission.ActionStartRecordParam;
import dji.sdk.wpmz.value.mission.ActionStopRecordParam;
import dji.sdk.wpmz.value.mission.ActionTakePhotoParam;
import dji.sdk.wpmz.value.mission.ActionZoomParam;
import dji.sdk.wpmz.value.mission.CameraLensType;
import dji.sdk.wpmz.value.mission.WaylineActionAccurateShootPhotoCameraStateInformation;
import dji.sdk.wpmz.value.mission.WaylineActionAccurateShootPhotoDeviceInformation;
import dji.sdk.wpmz.value.mission.WaylineActionAccurateShootPhotoFileInformation;
import dji.sdk.wpmz.value.mission.WaylineActionAccurateShootPhotoGimbalStateInformation;
import dji.sdk.wpmz.value.mission.WaylineActionAccurateShootPhotoTargetRect;
import dji.sdk.wpmz.value.mission.WaylineActionAccurateShootPoint;
import dji.sdk.wpmz.value.mission.WaylineActionAccurateShootSize;
import dji.sdk.wpmz.value.mission.WaylineActionInfo;
import dji.sdk.wpmz.value.mission.WaylineActionOrientedPhotoCameraStateInformation;
import dji.sdk.wpmz.value.mission.WaylineActionOrientedPhotoDeviceInformation;
import dji.sdk.wpmz.value.mission.WaylineActionOrientedPhotoFileInformation;
import dji.sdk.wpmz.value.mission.WaylineActionOrientedPhotoGimbalStateInformation;
import dji.sdk.wpmz.value.mission.WaylineActionOrientedPhotoTargetRect;
import dji.sdk.wpmz.value.mission.WaylineActionOrientedShootPoint;
import dji.sdk.wpmz.value.mission.WaylineActionOrientedShootSize;
import dji.sdk.wpmz.value.mission.WaylineActionPanoShotSubModeType;
import dji.sdk.wpmz.value.mission.WaylineActionRecordPointCloudOperateType;
import dji.sdk.wpmz.value.mission.WaylineActionType;
import dji.sdk.wpmz.value.mission.WaylineGimbalActuatorRotateMode;
import dji.sdk.wpmz.value.mission.WaylineOrientedPhotoModeParam;
import dji.sdk.wpmz.value.mission.WaylineOrientedPhotoModeType;
import dji.sdk.wpmz.value.mission.WaylineWaypointYawPathMode;
import java.util.ArrayList;

public class WaypointActionTemplateTransform {
    public WaylineActionInfo trans(WaypointActionModel actionModel) {
        WaypointActionType actionType = actionModel.getActionType();
        switch (actionType) {
            case STAY: {
                return this.transStay(actionModel);
            }
            case START_TIME_INTERVAL_SHOT: 
            case START_DISTANCE_INTERVAL_SHOT: 
            case STOP_INTERVAL_SHOT: {
                return null;
            }
            case START_TAKE_PHOTO: {
                return this.transTakePhoto(actionModel);
            }
            case START_RECORD: {
                return this.transStartRecord(actionModel);
            }
            case STOP_RECORD: {
                return this.transStopRecord(actionModel);
            }
            case ROTATE_AIRCRAFT: {
                return this.transRotateAircraft(actionModel);
            }
            case GIMBAL_PITCH: {
                return this.transGimbalPitch(actionModel);
            }
            case GIMBAL_YAW: {
                return this.transGimbalYaw(actionModel);
            }
            case CAMERA_ZOOM: {
                return this.transCameraZoom(actionModel);
            }
            case PRECISE_SHOT: {
                return this.transPreciseShot(actionModel, true);
            }
            case NORMAL_PRECISE_SHOT: {
                return this.transPreciseShot(actionModel, false);
            }
            case ORIENTED_SHOT: {
                return this.transOrientPhoto(actionModel);
            }
            case CAMERA_MKDIR: {
                return this.transCameraMkdir(actionModel);
            }
            case PANO_SHOT: {
                return this.transPanoShot(actionModel);
            }
            case MEGAPHONE: {
                return this.transMegaPhone(actionModel);
            }
            case SEARCHLIGHT: {
                return this.transSearchLight(actionModel);
            }
        }
        return this.transPSDKActions(actionType, actionModel);
    }

    private WaylineActionInfo transPSDKActions(WaypointActionType actionType, WaypointActionModel actionModel) {
        switch (actionType) {
            case PAYLOAD_BUTTON: {
                return this.transPayloadButton(actionModel);
            }
            case PAYLOAD_SWITCH_ON: {
                return this.transPayloadSwitchOn(actionModel);
            }
            case PAYLOAD_SWITCH_OFF: {
                return this.transPayloadSwitchOff(actionModel);
            }
            case PAYLOAD_SEEK_VALUE: {
                return this.transPayloadSeekValue(actionModel);
            }
            case START_POINT_CLOUD: 
            case PAUSE_POINT_CLOUD: 
            case CONTINUE_POINT_CLOUD: 
            case FINISH_POINT_CLOUD: {
                return this.transPointCloudAction(actionType, actionModel);
            }
        }
        return null;
    }

    public WaylineActionInfo transWaypointGimbalPitch(double gimbalPitch) {
        WaylineActionInfo info = new WaylineActionInfo();
        info.setActionType(WaylineActionType.GIMBAL_EVENLY_ROTATE);
        ActionGimbalEvenlyRotateParam param = new ActionGimbalEvenlyRotateParam();
        param.setPayloadPositionIndex(0);
        param.setPitch(gimbalPitch);
        info.setGimbalEvenlyRotateParam(param);
        return info;
    }

    private WaylineActionInfo transMegaPhone(WaypointActionModel actionModel) {
        WaylineActionInfo info = new WaylineActionInfo();
        info.setActionType(WaylineActionType.MEGAPHONE);
        info.setMegaphoneParam(actionModel.getMegaphoneParam());
        return info;
    }

    private WaylineActionInfo transSearchLight(WaypointActionModel actionModel) {
        WaylineActionInfo info = new WaylineActionInfo();
        info.setActionType(WaylineActionType.SEARCHLIGHT);
        info.setSearchlightParam(actionModel.getSearchlightParam());
        return info;
    }

    private WaylineActionInfo transPanoShot(WaypointActionModel actionModel) {
        WaylineActionInfo info = new WaylineActionInfo();
        info.setActionType(WaylineActionType.PANO_SHOT);
        ActionPanoShotParam param = new ActionPanoShotParam();
        param.setSubMode(WaylineActionPanoShotSubModeType.PANO_SHOT_360);
        param.setPayloadPositionIndex(actionModel.getCameraIndex());
        ArrayList<CameraLensType> payloadLensIndex = new ArrayList<CameraLensType>();
        payloadLensIndex.add(CameraLensType.WIDE);
        param.setPayloadLensIndex(payloadLensIndex);
        info.setPanoShotParam(param);
        return info;
    }

    private WaylineActionInfo transTakePhoto(WaypointActionModel actionModel) {
        WaylineActionInfo info = new WaylineActionInfo();
        info.setActionType(WaylineActionType.TAKE_PHOTO);
        ArrayList<CameraLensType> photoTypes = new ArrayList<CameraLensType>();
        if (actionModel.getPhotoTypes() != null && !actionModel.isFollowPhotoType()) {
            photoTypes.addAll(actionModel.getPhotoTypes());
        }
        ActionTakePhotoParam param = new ActionTakePhotoParam(actionModel.getCameraIndex(), actionModel.isFollowPhotoType(), photoTypes, actionModel.getMediaPathName());
        param.setPayloadPositionIndex(actionModel.getCameraIndex());
        info.setTakePhotoParam(param);
        return info;
    }

    private WaylineActionInfo transStartRecord(WaypointActionModel actionModel) {
        WaylineActionInfo info = new WaylineActionInfo();
        info.setActionType(WaylineActionType.START_RECORD);
        ArrayList<CameraLensType> photoTypes = new ArrayList<CameraLensType>();
        if (actionModel.getPhotoTypes() != null && !actionModel.isFollowPhotoType()) {
            photoTypes.addAll(actionModel.getPhotoTypes());
        }
        ActionStartRecordParam param = new ActionStartRecordParam(actionModel.getCameraIndex(), actionModel.isFollowPhotoType(), photoTypes, actionModel.getMediaPathName());
        info.setStartRecordParam(param);
        return info;
    }

    private WaylineActionInfo transStopRecord(WaypointActionModel actionModel) {
        WaylineActionInfo info = new WaylineActionInfo();
        info.setActionType(WaylineActionType.STOP_RECORD);
        ActionStopRecordParam param = new ActionStopRecordParam();
        param.setPayloadPositionIndex(actionModel.getCameraIndex());
        info.setStopRecordParam(param);
        return info;
    }

    private WaylineActionInfo transStay(WaypointActionModel actionModel) {
        WaylineActionInfo info = new WaylineActionInfo();
        info.setActionType(WaylineActionType.HOVER);
        ActionAircraftHoverParam param = new ActionAircraftHoverParam();
        param.setHoverTime((double)actionModel.getRealParam() / 1000.0);
        info.setAircraftHoverParam(param);
        return info;
    }

    private WaylineActionInfo transRotateAircraft(WaypointActionModel actionModel) {
        WaylineActionInfo info = new WaylineActionInfo();
        info.setActionType(WaylineActionType.ROTATE_YAW);
        ActionAircraftRotateYawParam param = new ActionAircraftRotateYawParam();
        param.setHeading(Double.valueOf(actionModel.getParam()));
        param.setPathMode(WaylineWaypointYawPathMode.FOLLOW_BAD_ARC);
        info.setAircraftRotateYawParam(param);
        return info;
    }

    private WaylineActionInfo transGimbalPitch(WaypointActionModel actionModel) {
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

    private WaylineActionInfo transGimbalYaw(WaypointActionModel actionModel) {
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

    private WaylineActionInfo transCameraZoom(WaypointActionModel actionModel) {
        WaylineActionInfo info = new WaylineActionInfo();
        info.setActionType(WaylineActionType.ZOOM);
        ActionZoomParam param = new ActionZoomParam();
        param.setFocalLength(Double.valueOf(actionModel.getRealParam()));
        param.setPayloadPositionIndex(actionModel.getCameraIndex());
        info.setZoomParam(param);
        return info;
    }

    private WaylineActionInfo transPreciseShot(WaypointActionModel actionModel, boolean frameValid) {
        WaylineActionInfo info = new WaylineActionInfo();
        info.setActionType(WaylineActionType.ACCURATE_PHOTO);
        PreciseShotInfo preciseShotInfo = actionModel.getPreciseShotInfo();
        ActionAccuratePhotoParam param = new ActionAccuratePhotoParam();
        WaylineActionAccurateShootPhotoCameraStateInformation cameraInfo = new WaylineActionAccurateShootPhotoCameraStateInformation();
        cameraInfo.setAF_position(preciseShotInfo.getAfPosition());
        cameraInfo.setFocal_distance(preciseShotInfo.getFocalDistance());
        cameraInfo.setCameraApertue(preciseShotInfo.getApertureSize());
        cameraInfo.setCameraISO(preciseShotInfo.getIsoParam());
        cameraInfo.setCameraEvBias(preciseShotInfo.getExposureCompensation());
        cameraInfo.setCameraLuminance(preciseShotInfo.getLuminance());
        cameraInfo.setCameraObjectDistance(preciseShotInfo.getObjectFocusDistance());
        cameraInfo.setCameraShutterTime(preciseShotInfo.getShutterSpeed());
        param.setCamera_infos(cameraInfo);
        WaylineActionAccurateShootPhotoDeviceInformation deviceInfo = new WaylineActionAccurateShootPhotoDeviceInformation();
        deviceInfo.setCamera_type(preciseShotInfo.getCameraType());
        deviceInfo.setGimbal_port(preciseShotInfo.getCameraIndex());
        param.setDevice_infos(deviceInfo);
        WaylineActionAccurateShootPhotoFileInformation fileInfo = new WaylineActionAccurateShootPhotoFileInformation();
        fileInfo.setFile_size((int)preciseShotInfo.getFileSize());
        fileInfo.setFile_path(preciseShotInfo.getCacheFileName());
        fileInfo.setFile_md5(preciseShotInfo.getFileMD5());
        fileInfo.setFileSuffix(actionModel.getMediaPathName());
        param.setFile_infos(fileInfo);
        WaylineActionAccurateShootPhotoGimbalStateInformation gimbalInfo = new WaylineActionAccurateShootPhotoGimbalStateInformation();
        gimbalInfo.setPitch(Double.valueOf(preciseShotInfo.getGimbalPitch()));
        gimbalInfo.setRoll(Double.valueOf(preciseShotInfo.getGimbalRoll()));
        gimbalInfo.setYaw(Double.valueOf(preciseShotInfo.getGimbalYaw()));
        param.setGimbal_infos(gimbalInfo);
        WaylineActionAccurateShootSize imageSize = new WaylineActionAccurateShootSize();
        imageSize.setHeight(preciseShotInfo.getImageHeight());
        imageSize.setWidth(preciseShotInfo.getImageWidth());
        param.setImage_size(imageSize);
        WaylineActionAccurateShootPhotoTargetRect targetRect = new WaylineActionAccurateShootPhotoTargetRect();
        targetRect.setAngle(Double.valueOf(preciseShotInfo.getCropAngle()));
        WaylineActionAccurateShootPoint targetPos = new WaylineActionAccurateShootPoint();
        targetPos.setX((int)preciseShotInfo.getCropPosX());
        targetPos.setY((int)preciseShotInfo.getCropPosY());
        targetRect.setPosition(targetPos);
        WaylineActionAccurateShootSize cropSize = new WaylineActionAccurateShootSize();
        cropSize.setWidth((int)preciseShotInfo.getCropWidth());
        cropSize.setHeight((int)preciseShotInfo.getCropHeight());
        targetRect.setSize(cropSize);
        param.setTarget_rect(targetRect);
        param.setHeading(Double.valueOf(preciseShotInfo.getDroneYaw()));
        param.setIsFrameValid(frameValid);
        param.setActionUUID(preciseShotInfo.getUuid());
        param.setUseGlobalPayloadLensIndex(actionModel.isFollowPhotoType());
        ArrayList<CameraLensType> photoTypes = new ArrayList<CameraLensType>();
        if (actionModel.getPhotoTypes() != null && !actionModel.isFollowPhotoType()) {
            photoTypes.addAll(actionModel.getPhotoTypes());
        }
        param.setPayloadLensIndex(photoTypes);
        info.setAccuratePhotoParam(param);
        return info;
    }

    private WaylineActionInfo transOrientPhoto(WaypointActionModel actionModel) {
        WaylineActionInfo info = new WaylineActionInfo();
        info.setActionType(WaylineActionType.ORIENTED_PHOTO);
        PreciseShotInfo preciseShotInfo = actionModel.getPreciseShotInfo();
        ActionOrientedPhotoParam param = new ActionOrientedPhotoParam();
        WaylineActionOrientedPhotoCameraStateInformation cameraInfo = new WaylineActionOrientedPhotoCameraStateInformation();
        cameraInfo.setAF_position(preciseShotInfo.getAfPosition());
        cameraInfo.setFocal_distance(preciseShotInfo.getFocalDistance());
        cameraInfo.setCameraApertue(preciseShotInfo.getApertureSize());
        cameraInfo.setCameraISO(preciseShotInfo.getIsoParam());
        cameraInfo.setCameraEvBias(preciseShotInfo.getExposureCompensation());
        cameraInfo.setCameraLuminance(preciseShotInfo.getLuminance());
        cameraInfo.setCameraObjectDistance(preciseShotInfo.getObjectFocusDistance());
        cameraInfo.setCameraShutterTime(preciseShotInfo.getShutterSpeed());
        param.setCamera_infos(cameraInfo);
        WaylineActionOrientedPhotoDeviceInformation deviceInfo = new WaylineActionOrientedPhotoDeviceInformation();
        deviceInfo.setCamera_type(preciseShotInfo.getCameraType());
        deviceInfo.setGimbal_port(preciseShotInfo.getCameraIndex());
        param.setDevice_infos(deviceInfo);
        WaylineActionOrientedPhotoFileInformation fileInfo = new WaylineActionOrientedPhotoFileInformation();
        fileInfo.setFile_size((int)preciseShotInfo.getFileSize());
        fileInfo.setFile_path(preciseShotInfo.getCacheFileName());
        fileInfo.setFile_md5(preciseShotInfo.getFileMD5());
        fileInfo.setFileSuffix(actionModel.getMediaPathName());
        param.setFile_infos(fileInfo);
        WaylineActionOrientedPhotoGimbalStateInformation gimbalInfo = new WaylineActionOrientedPhotoGimbalStateInformation();
        gimbalInfo.setPitch(Double.valueOf(preciseShotInfo.getGimbalPitch()));
        gimbalInfo.setRoll(Double.valueOf(preciseShotInfo.getGimbalRoll()));
        gimbalInfo.setYaw(Double.valueOf(preciseShotInfo.getGimbalYaw()));
        param.setGimbal_infos(gimbalInfo);
        WaylineActionOrientedShootSize imageSize = new WaylineActionOrientedShootSize();
        imageSize.setHeight(preciseShotInfo.getImageHeight());
        imageSize.setWidth(preciseShotInfo.getImageWidth());
        param.setImage_size(imageSize);
        WaylineActionOrientedPhotoTargetRect targetRect = new WaylineActionOrientedPhotoTargetRect();
        targetRect.setAngle(Double.valueOf(preciseShotInfo.getCropAngle()));
        WaylineActionOrientedShootPoint targetPos = new WaylineActionOrientedShootPoint();
        targetPos.setX((int)preciseShotInfo.getCropPosX());
        targetPos.setY((int)preciseShotInfo.getCropPosY());
        targetRect.setPosition(targetPos);
        WaylineActionOrientedShootSize cropSize = new WaylineActionOrientedShootSize();
        cropSize.setWidth((int)preciseShotInfo.getCropWidth());
        cropSize.setHeight((int)preciseShotInfo.getCropHeight());
        targetRect.setSize(cropSize);
        param.setTarget_rect(targetRect);
        WaylineOrientedPhotoModeParam modeParam = new WaylineOrientedPhotoModeParam();
        if (preciseShotInfo.getPhotoMode() == PreciseShotInfo.PhotoMode.LOW_LIGHT_SMART) {
            modeParam.setModeType(WaylineOrientedPhotoModeType.LOW_LIGHT_SMART_SHOOTING);
        } else {
            modeParam.setModeType(WaylineOrientedPhotoModeType.NORMAL_PHOTO);
        }
        param.setModeParam(modeParam);
        param.setHeading(Double.valueOf(preciseShotInfo.getDroneYaw()));
        param.setIsFrameValid(preciseShotInfo.getCropHeight() > 0.0f && preciseShotInfo.getCropWidth() > 0.0f);
        param.setActionUUID(preciseShotInfo.getUuid());
        param.setUseGlobalPayloadLensIndex(actionModel.isFollowPhotoType());
        ArrayList<CameraLensType> photoTypes = new ArrayList<CameraLensType>();
        if (actionModel.getPhotoTypes() != null && !actionModel.isFollowPhotoType()) {
            photoTypes.addAll(actionModel.getPhotoTypes());
        }
        param.setPayloadLensIndex(photoTypes);
        info.setOrientedPhotoParam(param);
        return info;
    }

    private WaylineActionInfo transCameraMkdir(WaypointActionModel actionModel) {
        WaylineActionInfo info = new WaylineActionInfo();
        info.setActionType(WaylineActionType.CUSTOM_DIR_NAME);
        ActionCustomDirNameParam param = new ActionCustomDirNameParam();
        param.setDirectoryName(actionModel.getMediaPathName());
        param.setPayloadPositionIndex(actionModel.getCameraIndex());
        info.setCustomDirNameParam(param);
        return info;
    }

    private WaylineActionInfo transPayloadButton(WaypointActionModel actionModel) {
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

    private WaylineActionInfo transPayloadSwitchOn(WaypointActionModel actionModel) {
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

    private WaylineActionInfo transPayloadSwitchOff(WaypointActionModel actionModel) {
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

    private WaylineActionInfo transPayloadSeekValue(WaypointActionModel actionModel) {
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

    private WaylineActionInfo transPointCloudAction(WaypointActionType actionType, WaypointActionModel actionModel) {
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
}

