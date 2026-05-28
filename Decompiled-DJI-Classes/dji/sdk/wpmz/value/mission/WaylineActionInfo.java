/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;
import dji.sdk.wpmz.value.ByteResult;
import dji.sdk.wpmz.value.ByteStream;
import dji.sdk.wpmz.value.ByteStreamHelper;
import dji.sdk.wpmz.value.base.DJIValue;
import dji.sdk.wpmz.value.mission.ActionAccuratePhotoParam;
import dji.sdk.wpmz.value.mission.ActionAircraftCaliParam;
import dji.sdk.wpmz.value.mission.ActionAircraftFlyControlParam;
import dji.sdk.wpmz.value.mission.ActionAircraftHoverParam;
import dji.sdk.wpmz.value.mission.ActionAircraftRotateFollowSpeedParam;
import dji.sdk.wpmz.value.mission.ActionAircraftRotateYawParam;
import dji.sdk.wpmz.value.mission.ActionCustomDirNameParam;
import dji.sdk.wpmz.value.mission.ActionFocusParam;
import dji.sdk.wpmz.value.mission.ActionGimbalEvenlyRotateParam;
import dji.sdk.wpmz.value.mission.ActionGimbalRotateParam;
import dji.sdk.wpmz.value.mission.ActionHoistUnloadParam;
import dji.sdk.wpmz.value.mission.ActionLowLightSmartShootingParam;
import dji.sdk.wpmz.value.mission.ActionMegaphoneParam;
import dji.sdk.wpmz.value.mission.ActionOrientedPhotoParam;
import dji.sdk.wpmz.value.mission.ActionPSDKParam;
import dji.sdk.wpmz.value.mission.ActionPanoShotParam;
import dji.sdk.wpmz.value.mission.ActionPreExecuteActionParam;
import dji.sdk.wpmz.value.mission.ActionRecordPointCloudParam;
import dji.sdk.wpmz.value.mission.ActionSearchlightParam;
import dji.sdk.wpmz.value.mission.ActionSetFocusTypeParam;
import dji.sdk.wpmz.value.mission.ActionSprayCapacityParam;
import dji.sdk.wpmz.value.mission.ActionSprayCloseParam;
import dji.sdk.wpmz.value.mission.ActionSprayOpenParam;
import dji.sdk.wpmz.value.mission.ActionStartContinuousShootingParam;
import dji.sdk.wpmz.value.mission.ActionStartRecordParam;
import dji.sdk.wpmz.value.mission.ActionStartSmartObliqueParam;
import dji.sdk.wpmz.value.mission.ActionStartTimeLapseParam;
import dji.sdk.wpmz.value.mission.ActionStopContinuousShootingParam;
import dji.sdk.wpmz.value.mission.ActionStopRecordParam;
import dji.sdk.wpmz.value.mission.ActionStopSmartObliqueParam;
import dji.sdk.wpmz.value.mission.ActionStopTimeLapseParam;
import dji.sdk.wpmz.value.mission.ActionTakePhotoParam;
import dji.sdk.wpmz.value.mission.ActionTargetDetectionParam;
import dji.sdk.wpmz.value.mission.ActionZoomParam;
import dji.sdk.wpmz.value.mission.WaylineActionType;
import java.util.Objects;
import org.json.JSONObject;

public class WaylineActionInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer actionId = 0;
    WaylineActionType actionType = WaylineActionType.UNKNOWN;
    ActionTakePhotoParam takePhotoParam;
    ActionStartRecordParam startRecordParam;
    ActionStopRecordParam stopRecordParam;
    ActionFocusParam focusParam;
    ActionZoomParam zoomParam;
    ActionCustomDirNameParam customDirNameParam;
    ActionSetFocusTypeParam setFocusTypeParam;
    ActionStartTimeLapseParam startTimeLapseParam;
    ActionStopTimeLapseParam stopTimeLapseParam;
    ActionGimbalRotateParam gimbalRotateParam;
    ActionGimbalEvenlyRotateParam gimbalEvenlyRotateParam;
    ActionStartSmartObliqueParam startSmartObliqueParam;
    ActionStopSmartObliqueParam stopSmartObliqueParam;
    ActionAircraftHoverParam aircraftHoverParam;
    ActionAircraftRotateYawParam aircraftRotateYawParam;
    ActionAircraftFlyControlParam aircraftFlyControlParam;
    ActionAccuratePhotoParam accuratePhotoParam;
    ActionRecordPointCloudParam recordPointCloudParam;
    ActionPSDKParam psdkParam;
    ActionAircraftCaliParam aircraftCaliParam;
    ActionStartContinuousShootingParam startContinuousShootingParam;
    ActionStopContinuousShootingParam stopContinuousShootingParam;
    ActionSprayOpenParam sprayOpenParam;
    ActionSprayCloseParam sprayCloseParam;
    ActionSprayCapacityParam sprayCapacityParam;
    ActionAircraftRotateFollowSpeedParam aircraftRotateFollowSpeedParam;
    ActionLowLightSmartShootingParam lowLightSmartShootingParam;
    ActionOrientedPhotoParam orientedPhotoParam;
    ActionPanoShotParam panoShotParam;
    ActionPreExecuteActionParam preExecuteActionParam;
    ActionHoistUnloadParam hoistUnloadParam;
    ActionSearchlightParam searchlightParam;
    ActionMegaphoneParam megaphoneParam;
    ActionTargetDetectionParam targetDetectionParam;

    public WaylineActionInfo() {
    }

    public WaylineActionInfo(Integer actionId, WaylineActionType actionType, ActionTakePhotoParam takePhotoParam, ActionStartRecordParam startRecordParam, ActionStopRecordParam stopRecordParam, ActionFocusParam focusParam, ActionZoomParam zoomParam, ActionCustomDirNameParam customDirNameParam, ActionSetFocusTypeParam setFocusTypeParam, ActionStartTimeLapseParam startTimeLapseParam, ActionStopTimeLapseParam stopTimeLapseParam, ActionGimbalRotateParam gimbalRotateParam, ActionGimbalEvenlyRotateParam gimbalEvenlyRotateParam, ActionStartSmartObliqueParam startSmartObliqueParam, ActionStopSmartObliqueParam stopSmartObliqueParam, ActionAircraftHoverParam aircraftHoverParam, ActionAircraftRotateYawParam aircraftRotateYawParam, ActionAircraftFlyControlParam aircraftFlyControlParam, ActionAccuratePhotoParam accuratePhotoParam, ActionRecordPointCloudParam recordPointCloudParam, ActionPSDKParam psdkParam, ActionAircraftCaliParam aircraftCaliParam, ActionStartContinuousShootingParam startContinuousShootingParam, ActionStopContinuousShootingParam stopContinuousShootingParam, ActionSprayOpenParam sprayOpenParam, ActionSprayCloseParam sprayCloseParam, ActionSprayCapacityParam sprayCapacityParam, ActionAircraftRotateFollowSpeedParam aircraftRotateFollowSpeedParam, ActionLowLightSmartShootingParam lowLightSmartShootingParam, ActionOrientedPhotoParam orientedPhotoParam, ActionPanoShotParam panoShotParam, ActionPreExecuteActionParam preExecuteActionParam, ActionHoistUnloadParam hoistUnloadParam, ActionSearchlightParam searchlightParam, ActionMegaphoneParam megaphoneParam, ActionTargetDetectionParam targetDetectionParam) {
        if (actionId != null) {
            this.actionId = actionId;
        }
        if (actionType != null) {
            this.actionType = actionType;
        }
        if (takePhotoParam != null) {
            this.takePhotoParam = takePhotoParam;
        }
        if (startRecordParam != null) {
            this.startRecordParam = startRecordParam;
        }
        if (stopRecordParam != null) {
            this.stopRecordParam = stopRecordParam;
        }
        if (focusParam != null) {
            this.focusParam = focusParam;
        }
        if (zoomParam != null) {
            this.zoomParam = zoomParam;
        }
        if (customDirNameParam != null) {
            this.customDirNameParam = customDirNameParam;
        }
        if (setFocusTypeParam != null) {
            this.setFocusTypeParam = setFocusTypeParam;
        }
        if (startTimeLapseParam != null) {
            this.startTimeLapseParam = startTimeLapseParam;
        }
        if (stopTimeLapseParam != null) {
            this.stopTimeLapseParam = stopTimeLapseParam;
        }
        if (gimbalRotateParam != null) {
            this.gimbalRotateParam = gimbalRotateParam;
        }
        if (gimbalEvenlyRotateParam != null) {
            this.gimbalEvenlyRotateParam = gimbalEvenlyRotateParam;
        }
        if (startSmartObliqueParam != null) {
            this.startSmartObliqueParam = startSmartObliqueParam;
        }
        if (stopSmartObliqueParam != null) {
            this.stopSmartObliqueParam = stopSmartObliqueParam;
        }
        if (aircraftHoverParam != null) {
            this.aircraftHoverParam = aircraftHoverParam;
        }
        if (aircraftRotateYawParam != null) {
            this.aircraftRotateYawParam = aircraftRotateYawParam;
        }
        if (aircraftFlyControlParam != null) {
            this.aircraftFlyControlParam = aircraftFlyControlParam;
        }
        if (accuratePhotoParam != null) {
            this.accuratePhotoParam = accuratePhotoParam;
        }
        if (recordPointCloudParam != null) {
            this.recordPointCloudParam = recordPointCloudParam;
        }
        if (psdkParam != null) {
            this.psdkParam = psdkParam;
        }
        if (aircraftCaliParam != null) {
            this.aircraftCaliParam = aircraftCaliParam;
        }
        if (startContinuousShootingParam != null) {
            this.startContinuousShootingParam = startContinuousShootingParam;
        }
        if (stopContinuousShootingParam != null) {
            this.stopContinuousShootingParam = stopContinuousShootingParam;
        }
        if (sprayOpenParam != null) {
            this.sprayOpenParam = sprayOpenParam;
        }
        if (sprayCloseParam != null) {
            this.sprayCloseParam = sprayCloseParam;
        }
        if (sprayCapacityParam != null) {
            this.sprayCapacityParam = sprayCapacityParam;
        }
        if (aircraftRotateFollowSpeedParam != null) {
            this.aircraftRotateFollowSpeedParam = aircraftRotateFollowSpeedParam;
        }
        if (lowLightSmartShootingParam != null) {
            this.lowLightSmartShootingParam = lowLightSmartShootingParam;
        }
        if (orientedPhotoParam != null) {
            this.orientedPhotoParam = orientedPhotoParam;
        }
        if (panoShotParam != null) {
            this.panoShotParam = panoShotParam;
        }
        if (preExecuteActionParam != null) {
            this.preExecuteActionParam = preExecuteActionParam;
        }
        if (hoistUnloadParam != null) {
            this.hoistUnloadParam = hoistUnloadParam;
        }
        if (searchlightParam != null) {
            this.searchlightParam = searchlightParam;
        }
        if (megaphoneParam != null) {
            this.megaphoneParam = megaphoneParam;
        }
        if (targetDetectionParam != null) {
            this.targetDetectionParam = targetDetectionParam;
        }
    }

    public static WaylineActionInfo fromJson(String jsonString) {
        WaylineActionInfo tmpValueResult_ = new WaylineActionInfo();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.actionId = jsonObj.getInt("actionId");
            tmpValueResult_.actionType = WaylineActionType.find(jsonObj.getInt("actionType"));
            tmpValueResult_.takePhotoParam = ActionTakePhotoParam.fromJson(jsonObj.getJSONObject("takePhotoParam").toString());
            tmpValueResult_.startRecordParam = ActionStartRecordParam.fromJson(jsonObj.getJSONObject("startRecordParam").toString());
            tmpValueResult_.stopRecordParam = ActionStopRecordParam.fromJson(jsonObj.getJSONObject("stopRecordParam").toString());
            tmpValueResult_.focusParam = ActionFocusParam.fromJson(jsonObj.getJSONObject("focusParam").toString());
            tmpValueResult_.zoomParam = ActionZoomParam.fromJson(jsonObj.getJSONObject("zoomParam").toString());
            tmpValueResult_.customDirNameParam = ActionCustomDirNameParam.fromJson(jsonObj.getJSONObject("customDirNameParam").toString());
            tmpValueResult_.setFocusTypeParam = ActionSetFocusTypeParam.fromJson(jsonObj.getJSONObject("setFocusTypeParam").toString());
            tmpValueResult_.startTimeLapseParam = ActionStartTimeLapseParam.fromJson(jsonObj.getJSONObject("startTimeLapseParam").toString());
            tmpValueResult_.stopTimeLapseParam = ActionStopTimeLapseParam.fromJson(jsonObj.getJSONObject("stopTimeLapseParam").toString());
            tmpValueResult_.gimbalRotateParam = ActionGimbalRotateParam.fromJson(jsonObj.getJSONObject("gimbalRotateParam").toString());
            tmpValueResult_.gimbalEvenlyRotateParam = ActionGimbalEvenlyRotateParam.fromJson(jsonObj.getJSONObject("gimbalEvenlyRotateParam").toString());
            tmpValueResult_.startSmartObliqueParam = ActionStartSmartObliqueParam.fromJson(jsonObj.getJSONObject("startSmartObliqueParam").toString());
            tmpValueResult_.stopSmartObliqueParam = ActionStopSmartObliqueParam.fromJson(jsonObj.getJSONObject("stopSmartObliqueParam").toString());
            tmpValueResult_.aircraftHoverParam = ActionAircraftHoverParam.fromJson(jsonObj.getJSONObject("aircraftHoverParam").toString());
            tmpValueResult_.aircraftRotateYawParam = ActionAircraftRotateYawParam.fromJson(jsonObj.getJSONObject("aircraftRotateYawParam").toString());
            tmpValueResult_.aircraftFlyControlParam = ActionAircraftFlyControlParam.fromJson(jsonObj.getJSONObject("aircraftFlyControlParam").toString());
            tmpValueResult_.accuratePhotoParam = ActionAccuratePhotoParam.fromJson(jsonObj.getJSONObject("accuratePhotoParam").toString());
            tmpValueResult_.recordPointCloudParam = ActionRecordPointCloudParam.fromJson(jsonObj.getJSONObject("recordPointCloudParam").toString());
            tmpValueResult_.psdkParam = ActionPSDKParam.fromJson(jsonObj.getJSONObject("psdkParam").toString());
            tmpValueResult_.aircraftCaliParam = ActionAircraftCaliParam.fromJson(jsonObj.getJSONObject("aircraftCaliParam").toString());
            tmpValueResult_.startContinuousShootingParam = ActionStartContinuousShootingParam.fromJson(jsonObj.getJSONObject("startContinuousShootingParam").toString());
            tmpValueResult_.stopContinuousShootingParam = ActionStopContinuousShootingParam.fromJson(jsonObj.getJSONObject("stopContinuousShootingParam").toString());
            tmpValueResult_.sprayOpenParam = ActionSprayOpenParam.fromJson(jsonObj.getJSONObject("sprayOpenParam").toString());
            tmpValueResult_.sprayCloseParam = ActionSprayCloseParam.fromJson(jsonObj.getJSONObject("sprayCloseParam").toString());
            tmpValueResult_.sprayCapacityParam = ActionSprayCapacityParam.fromJson(jsonObj.getJSONObject("sprayCapacityParam").toString());
            tmpValueResult_.aircraftRotateFollowSpeedParam = ActionAircraftRotateFollowSpeedParam.fromJson(jsonObj.getJSONObject("aircraftRotateFollowSpeedParam").toString());
            tmpValueResult_.lowLightSmartShootingParam = ActionLowLightSmartShootingParam.fromJson(jsonObj.getJSONObject("lowLightSmartShootingParam").toString());
            tmpValueResult_.orientedPhotoParam = ActionOrientedPhotoParam.fromJson(jsonObj.getJSONObject("orientedPhotoParam").toString());
            tmpValueResult_.panoShotParam = ActionPanoShotParam.fromJson(jsonObj.getJSONObject("panoShotParam").toString());
            tmpValueResult_.preExecuteActionParam = ActionPreExecuteActionParam.fromJson(jsonObj.getJSONObject("preExecuteActionParam").toString());
            tmpValueResult_.hoistUnloadParam = ActionHoistUnloadParam.fromJson(jsonObj.getJSONObject("hoistUnloadParam").toString());
            tmpValueResult_.searchlightParam = ActionSearchlightParam.fromJson(jsonObj.getJSONObject("searchlightParam").toString());
            tmpValueResult_.megaphoneParam = ActionMegaphoneParam.fromJson(jsonObj.getJSONObject("megaphoneParam").toString());
            tmpValueResult_.targetDetectionParam = ActionTargetDetectionParam.fromJson(jsonObj.getJSONObject("targetDetectionParam").toString());
        }
        catch (Exception e) {
            tmpValueResult_ = null;
        }
        return tmpValueResult_;
    }

    @Override
    public JSONObject toJson() {
        JSONObject json = null;
        try {
            json = new JSONObject();
            if (null != this.actionId) {
                json.put("actionId", (Object)this.actionId);
            }
            if (null != this.actionType) {
                json.put("actionType", this.actionType.value());
            }
            if (null != this.takePhotoParam) {
                json.put("takePhotoParam", (Object)this.takePhotoParam.toJson());
            }
            if (null != this.startRecordParam) {
                json.put("startRecordParam", (Object)this.startRecordParam.toJson());
            }
            if (null != this.stopRecordParam) {
                json.put("stopRecordParam", (Object)this.stopRecordParam.toJson());
            }
            if (null != this.focusParam) {
                json.put("focusParam", (Object)this.focusParam.toJson());
            }
            if (null != this.zoomParam) {
                json.put("zoomParam", (Object)this.zoomParam.toJson());
            }
            if (null != this.customDirNameParam) {
                json.put("customDirNameParam", (Object)this.customDirNameParam.toJson());
            }
            if (null != this.setFocusTypeParam) {
                json.put("setFocusTypeParam", (Object)this.setFocusTypeParam.toJson());
            }
            if (null != this.startTimeLapseParam) {
                json.put("startTimeLapseParam", (Object)this.startTimeLapseParam.toJson());
            }
            if (null != this.stopTimeLapseParam) {
                json.put("stopTimeLapseParam", (Object)this.stopTimeLapseParam.toJson());
            }
            if (null != this.gimbalRotateParam) {
                json.put("gimbalRotateParam", (Object)this.gimbalRotateParam.toJson());
            }
            if (null != this.gimbalEvenlyRotateParam) {
                json.put("gimbalEvenlyRotateParam", (Object)this.gimbalEvenlyRotateParam.toJson());
            }
            if (null != this.startSmartObliqueParam) {
                json.put("startSmartObliqueParam", (Object)this.startSmartObliqueParam.toJson());
            }
            if (null != this.stopSmartObliqueParam) {
                json.put("stopSmartObliqueParam", (Object)this.stopSmartObliqueParam.toJson());
            }
            if (null != this.aircraftHoverParam) {
                json.put("aircraftHoverParam", (Object)this.aircraftHoverParam.toJson());
            }
            if (null != this.aircraftRotateYawParam) {
                json.put("aircraftRotateYawParam", (Object)this.aircraftRotateYawParam.toJson());
            }
            if (null != this.aircraftFlyControlParam) {
                json.put("aircraftFlyControlParam", (Object)this.aircraftFlyControlParam.toJson());
            }
            if (null != this.accuratePhotoParam) {
                json.put("accuratePhotoParam", (Object)this.accuratePhotoParam.toJson());
            }
            if (null != this.recordPointCloudParam) {
                json.put("recordPointCloudParam", (Object)this.recordPointCloudParam.toJson());
            }
            if (null != this.psdkParam) {
                json.put("psdkParam", (Object)this.psdkParam.toJson());
            }
            if (null != this.aircraftCaliParam) {
                json.put("aircraftCaliParam", (Object)this.aircraftCaliParam.toJson());
            }
            if (null != this.startContinuousShootingParam) {
                json.put("startContinuousShootingParam", (Object)this.startContinuousShootingParam.toJson());
            }
            if (null != this.stopContinuousShootingParam) {
                json.put("stopContinuousShootingParam", (Object)this.stopContinuousShootingParam.toJson());
            }
            if (null != this.sprayOpenParam) {
                json.put("sprayOpenParam", (Object)this.sprayOpenParam.toJson());
            }
            if (null != this.sprayCloseParam) {
                json.put("sprayCloseParam", (Object)this.sprayCloseParam.toJson());
            }
            if (null != this.sprayCapacityParam) {
                json.put("sprayCapacityParam", (Object)this.sprayCapacityParam.toJson());
            }
            if (null != this.aircraftRotateFollowSpeedParam) {
                json.put("aircraftRotateFollowSpeedParam", (Object)this.aircraftRotateFollowSpeedParam.toJson());
            }
            if (null != this.lowLightSmartShootingParam) {
                json.put("lowLightSmartShootingParam", (Object)this.lowLightSmartShootingParam.toJson());
            }
            if (null != this.orientedPhotoParam) {
                json.put("orientedPhotoParam", (Object)this.orientedPhotoParam.toJson());
            }
            if (null != this.panoShotParam) {
                json.put("panoShotParam", (Object)this.panoShotParam.toJson());
            }
            if (null != this.preExecuteActionParam) {
                json.put("preExecuteActionParam", (Object)this.preExecuteActionParam.toJson());
            }
            if (null != this.hoistUnloadParam) {
                json.put("hoistUnloadParam", (Object)this.hoistUnloadParam.toJson());
            }
            if (null != this.searchlightParam) {
                json.put("searchlightParam", (Object)this.searchlightParam.toJson());
            }
            if (null != this.megaphoneParam) {
                json.put("megaphoneParam", (Object)this.megaphoneParam.toJson());
            }
            if (null != this.targetDetectionParam) {
                json.put("targetDetectionParam", (Object)this.targetDetectionParam.toJson());
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return json;
    }

    @Override
    public int serializedLength() {
        int serializedLength = 0;
        serializedLength += ByteStreamHelper.integerGetLength(this.actionId);
        serializedLength += ByteStreamHelper.integerGetLength(this.actionType.value());
        serializedLength += ByteStreamHelper.getLength(this.takePhotoParam, ActionTakePhotoParam.class);
        serializedLength += ByteStreamHelper.getLength(this.startRecordParam, ActionStartRecordParam.class);
        serializedLength += ByteStreamHelper.getLength(this.stopRecordParam, ActionStopRecordParam.class);
        serializedLength += ByteStreamHelper.getLength(this.focusParam, ActionFocusParam.class);
        serializedLength += ByteStreamHelper.getLength(this.zoomParam, ActionZoomParam.class);
        serializedLength += ByteStreamHelper.getLength(this.customDirNameParam, ActionCustomDirNameParam.class);
        serializedLength += ByteStreamHelper.getLength(this.setFocusTypeParam, ActionSetFocusTypeParam.class);
        serializedLength += ByteStreamHelper.getLength(this.startTimeLapseParam, ActionStartTimeLapseParam.class);
        serializedLength += ByteStreamHelper.getLength(this.stopTimeLapseParam, ActionStopTimeLapseParam.class);
        serializedLength += ByteStreamHelper.getLength(this.gimbalRotateParam, ActionGimbalRotateParam.class);
        serializedLength += ByteStreamHelper.getLength(this.gimbalEvenlyRotateParam, ActionGimbalEvenlyRotateParam.class);
        serializedLength += ByteStreamHelper.getLength(this.startSmartObliqueParam, ActionStartSmartObliqueParam.class);
        serializedLength += ByteStreamHelper.getLength(this.stopSmartObliqueParam, ActionStopSmartObliqueParam.class);
        serializedLength += ByteStreamHelper.getLength(this.aircraftHoverParam, ActionAircraftHoverParam.class);
        serializedLength += ByteStreamHelper.getLength(this.aircraftRotateYawParam, ActionAircraftRotateYawParam.class);
        serializedLength += ByteStreamHelper.getLength(this.aircraftFlyControlParam, ActionAircraftFlyControlParam.class);
        serializedLength += ByteStreamHelper.getLength(this.accuratePhotoParam, ActionAccuratePhotoParam.class);
        serializedLength += ByteStreamHelper.getLength(this.recordPointCloudParam, ActionRecordPointCloudParam.class);
        serializedLength += ByteStreamHelper.getLength(this.psdkParam, ActionPSDKParam.class);
        serializedLength += ByteStreamHelper.getLength(this.aircraftCaliParam, ActionAircraftCaliParam.class);
        serializedLength += ByteStreamHelper.getLength(this.startContinuousShootingParam, ActionStartContinuousShootingParam.class);
        serializedLength += ByteStreamHelper.getLength(this.stopContinuousShootingParam, ActionStopContinuousShootingParam.class);
        serializedLength += ByteStreamHelper.getLength(this.sprayOpenParam, ActionSprayOpenParam.class);
        serializedLength += ByteStreamHelper.getLength(this.sprayCloseParam, ActionSprayCloseParam.class);
        serializedLength += ByteStreamHelper.getLength(this.sprayCapacityParam, ActionSprayCapacityParam.class);
        serializedLength += ByteStreamHelper.getLength(this.aircraftRotateFollowSpeedParam, ActionAircraftRotateFollowSpeedParam.class);
        serializedLength += ByteStreamHelper.getLength(this.lowLightSmartShootingParam, ActionLowLightSmartShootingParam.class);
        serializedLength += ByteStreamHelper.getLength(this.orientedPhotoParam, ActionOrientedPhotoParam.class);
        serializedLength += ByteStreamHelper.getLength(this.panoShotParam, ActionPanoShotParam.class);
        serializedLength += ByteStreamHelper.getLength(this.preExecuteActionParam, ActionPreExecuteActionParam.class);
        serializedLength += ByteStreamHelper.getLength(this.hoistUnloadParam, ActionHoistUnloadParam.class);
        serializedLength += ByteStreamHelper.getLength(this.searchlightParam, ActionSearchlightParam.class);
        serializedLength += ByteStreamHelper.getLength(this.megaphoneParam, ActionMegaphoneParam.class);
        return serializedLength += ByteStreamHelper.getLength(this.targetDetectionParam, ActionTargetDetectionParam.class);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.actionId, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.actionType.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.takePhotoParam, serializedIndex, ActionTakePhotoParam.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.startRecordParam, serializedIndex, ActionStartRecordParam.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.stopRecordParam, serializedIndex, ActionStopRecordParam.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.focusParam, serializedIndex, ActionFocusParam.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.zoomParam, serializedIndex, ActionZoomParam.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.customDirNameParam, serializedIndex, ActionCustomDirNameParam.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.setFocusTypeParam, serializedIndex, ActionSetFocusTypeParam.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.startTimeLapseParam, serializedIndex, ActionStartTimeLapseParam.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.stopTimeLapseParam, serializedIndex, ActionStopTimeLapseParam.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.gimbalRotateParam, serializedIndex, ActionGimbalRotateParam.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.gimbalEvenlyRotateParam, serializedIndex, ActionGimbalEvenlyRotateParam.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.startSmartObliqueParam, serializedIndex, ActionStartSmartObliqueParam.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.stopSmartObliqueParam, serializedIndex, ActionStopSmartObliqueParam.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.aircraftHoverParam, serializedIndex, ActionAircraftHoverParam.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.aircraftRotateYawParam, serializedIndex, ActionAircraftRotateYawParam.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.aircraftFlyControlParam, serializedIndex, ActionAircraftFlyControlParam.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.accuratePhotoParam, serializedIndex, ActionAccuratePhotoParam.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.recordPointCloudParam, serializedIndex, ActionRecordPointCloudParam.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.psdkParam, serializedIndex, ActionPSDKParam.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.aircraftCaliParam, serializedIndex, ActionAircraftCaliParam.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.startContinuousShootingParam, serializedIndex, ActionStartContinuousShootingParam.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.stopContinuousShootingParam, serializedIndex, ActionStopContinuousShootingParam.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.sprayOpenParam, serializedIndex, ActionSprayOpenParam.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.sprayCloseParam, serializedIndex, ActionSprayCloseParam.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.sprayCapacityParam, serializedIndex, ActionSprayCapacityParam.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.aircraftRotateFollowSpeedParam, serializedIndex, ActionAircraftRotateFollowSpeedParam.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.lowLightSmartShootingParam, serializedIndex, ActionLowLightSmartShootingParam.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.orientedPhotoParam, serializedIndex, ActionOrientedPhotoParam.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.panoShotParam, serializedIndex, ActionPanoShotParam.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.preExecuteActionParam, serializedIndex, ActionPreExecuteActionParam.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.hoistUnloadParam, serializedIndex, ActionHoistUnloadParam.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.searchlightParam, serializedIndex, ActionSearchlightParam.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.megaphoneParam, serializedIndex, ActionMegaphoneParam.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.targetDetectionParam, serializedIndex, ActionTargetDetectionParam.class);
        return serializedIndex;
    }

    @Override
    public byte[] toBytes() {
        byte[] resultBytes = new byte[this.serializedLength()];
        this.toBytes(resultBytes, 0);
        return resultBytes;
    }

    @Override
    public int fromBytes(byte[] data, int deserilizationIndex) {
        ByteResult<Integer> tmpActionId = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.actionId = (Integer)tmpActionId.result;
        deserilizationIndex = tmpActionId.endIndex;
        ByteResult<Integer> tmpActionType = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.actionType = WaylineActionType.find((Integer)tmpActionType.result);
        deserilizationIndex = tmpActionType.endIndex;
        ByteResult<ActionTakePhotoParam> tmpTakePhotoParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, ActionTakePhotoParam.class);
        this.takePhotoParam = (ActionTakePhotoParam)tmpTakePhotoParam.result;
        deserilizationIndex = tmpTakePhotoParam.endIndex;
        ByteResult<ActionStartRecordParam> tmpStartRecordParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, ActionStartRecordParam.class);
        this.startRecordParam = (ActionStartRecordParam)tmpStartRecordParam.result;
        deserilizationIndex = tmpStartRecordParam.endIndex;
        ByteResult<ActionStopRecordParam> tmpStopRecordParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, ActionStopRecordParam.class);
        this.stopRecordParam = (ActionStopRecordParam)tmpStopRecordParam.result;
        deserilizationIndex = tmpStopRecordParam.endIndex;
        ByteResult<ActionFocusParam> tmpFocusParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, ActionFocusParam.class);
        this.focusParam = (ActionFocusParam)tmpFocusParam.result;
        deserilizationIndex = tmpFocusParam.endIndex;
        ByteResult<ActionZoomParam> tmpZoomParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, ActionZoomParam.class);
        this.zoomParam = (ActionZoomParam)tmpZoomParam.result;
        deserilizationIndex = tmpZoomParam.endIndex;
        ByteResult<ActionCustomDirNameParam> tmpCustomDirNameParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, ActionCustomDirNameParam.class);
        this.customDirNameParam = (ActionCustomDirNameParam)tmpCustomDirNameParam.result;
        deserilizationIndex = tmpCustomDirNameParam.endIndex;
        ByteResult<ActionSetFocusTypeParam> tmpSetFocusTypeParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, ActionSetFocusTypeParam.class);
        this.setFocusTypeParam = (ActionSetFocusTypeParam)tmpSetFocusTypeParam.result;
        deserilizationIndex = tmpSetFocusTypeParam.endIndex;
        ByteResult<ActionStartTimeLapseParam> tmpStartTimeLapseParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, ActionStartTimeLapseParam.class);
        this.startTimeLapseParam = (ActionStartTimeLapseParam)tmpStartTimeLapseParam.result;
        deserilizationIndex = tmpStartTimeLapseParam.endIndex;
        ByteResult<ActionStopTimeLapseParam> tmpStopTimeLapseParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, ActionStopTimeLapseParam.class);
        this.stopTimeLapseParam = (ActionStopTimeLapseParam)tmpStopTimeLapseParam.result;
        deserilizationIndex = tmpStopTimeLapseParam.endIndex;
        ByteResult<ActionGimbalRotateParam> tmpGimbalRotateParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, ActionGimbalRotateParam.class);
        this.gimbalRotateParam = (ActionGimbalRotateParam)tmpGimbalRotateParam.result;
        deserilizationIndex = tmpGimbalRotateParam.endIndex;
        ByteResult<ActionGimbalEvenlyRotateParam> tmpGimbalEvenlyRotateParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, ActionGimbalEvenlyRotateParam.class);
        this.gimbalEvenlyRotateParam = (ActionGimbalEvenlyRotateParam)tmpGimbalEvenlyRotateParam.result;
        deserilizationIndex = tmpGimbalEvenlyRotateParam.endIndex;
        ByteResult<ActionStartSmartObliqueParam> tmpStartSmartObliqueParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, ActionStartSmartObliqueParam.class);
        this.startSmartObliqueParam = (ActionStartSmartObliqueParam)tmpStartSmartObliqueParam.result;
        deserilizationIndex = tmpStartSmartObliqueParam.endIndex;
        ByteResult<ActionStopSmartObliqueParam> tmpStopSmartObliqueParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, ActionStopSmartObliqueParam.class);
        this.stopSmartObliqueParam = (ActionStopSmartObliqueParam)tmpStopSmartObliqueParam.result;
        deserilizationIndex = tmpStopSmartObliqueParam.endIndex;
        ByteResult<ActionAircraftHoverParam> tmpAircraftHoverParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, ActionAircraftHoverParam.class);
        this.aircraftHoverParam = (ActionAircraftHoverParam)tmpAircraftHoverParam.result;
        deserilizationIndex = tmpAircraftHoverParam.endIndex;
        ByteResult<ActionAircraftRotateYawParam> tmpAircraftRotateYawParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, ActionAircraftRotateYawParam.class);
        this.aircraftRotateYawParam = (ActionAircraftRotateYawParam)tmpAircraftRotateYawParam.result;
        deserilizationIndex = tmpAircraftRotateYawParam.endIndex;
        ByteResult<ActionAircraftFlyControlParam> tmpAircraftFlyControlParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, ActionAircraftFlyControlParam.class);
        this.aircraftFlyControlParam = (ActionAircraftFlyControlParam)tmpAircraftFlyControlParam.result;
        deserilizationIndex = tmpAircraftFlyControlParam.endIndex;
        ByteResult<ActionAccuratePhotoParam> tmpAccuratePhotoParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, ActionAccuratePhotoParam.class);
        this.accuratePhotoParam = (ActionAccuratePhotoParam)tmpAccuratePhotoParam.result;
        deserilizationIndex = tmpAccuratePhotoParam.endIndex;
        ByteResult<ActionRecordPointCloudParam> tmpRecordPointCloudParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, ActionRecordPointCloudParam.class);
        this.recordPointCloudParam = (ActionRecordPointCloudParam)tmpRecordPointCloudParam.result;
        deserilizationIndex = tmpRecordPointCloudParam.endIndex;
        ByteResult<ActionPSDKParam> tmpPsdkParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, ActionPSDKParam.class);
        this.psdkParam = (ActionPSDKParam)tmpPsdkParam.result;
        deserilizationIndex = tmpPsdkParam.endIndex;
        ByteResult<ActionAircraftCaliParam> tmpAircraftCaliParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, ActionAircraftCaliParam.class);
        this.aircraftCaliParam = (ActionAircraftCaliParam)tmpAircraftCaliParam.result;
        deserilizationIndex = tmpAircraftCaliParam.endIndex;
        ByteResult<ActionStartContinuousShootingParam> tmpStartContinuousShootingParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, ActionStartContinuousShootingParam.class);
        this.startContinuousShootingParam = (ActionStartContinuousShootingParam)tmpStartContinuousShootingParam.result;
        deserilizationIndex = tmpStartContinuousShootingParam.endIndex;
        ByteResult<ActionStopContinuousShootingParam> tmpStopContinuousShootingParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, ActionStopContinuousShootingParam.class);
        this.stopContinuousShootingParam = (ActionStopContinuousShootingParam)tmpStopContinuousShootingParam.result;
        deserilizationIndex = tmpStopContinuousShootingParam.endIndex;
        ByteResult<ActionSprayOpenParam> tmpSprayOpenParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, ActionSprayOpenParam.class);
        this.sprayOpenParam = (ActionSprayOpenParam)tmpSprayOpenParam.result;
        deserilizationIndex = tmpSprayOpenParam.endIndex;
        ByteResult<ActionSprayCloseParam> tmpSprayCloseParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, ActionSprayCloseParam.class);
        this.sprayCloseParam = (ActionSprayCloseParam)tmpSprayCloseParam.result;
        deserilizationIndex = tmpSprayCloseParam.endIndex;
        ByteResult<ActionSprayCapacityParam> tmpSprayCapacityParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, ActionSprayCapacityParam.class);
        this.sprayCapacityParam = (ActionSprayCapacityParam)tmpSprayCapacityParam.result;
        deserilizationIndex = tmpSprayCapacityParam.endIndex;
        ByteResult<ActionAircraftRotateFollowSpeedParam> tmpAircraftRotateFollowSpeedParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, ActionAircraftRotateFollowSpeedParam.class);
        this.aircraftRotateFollowSpeedParam = (ActionAircraftRotateFollowSpeedParam)tmpAircraftRotateFollowSpeedParam.result;
        deserilizationIndex = tmpAircraftRotateFollowSpeedParam.endIndex;
        ByteResult<ActionLowLightSmartShootingParam> tmpLowLightSmartShootingParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, ActionLowLightSmartShootingParam.class);
        this.lowLightSmartShootingParam = (ActionLowLightSmartShootingParam)tmpLowLightSmartShootingParam.result;
        deserilizationIndex = tmpLowLightSmartShootingParam.endIndex;
        ByteResult<ActionOrientedPhotoParam> tmpOrientedPhotoParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, ActionOrientedPhotoParam.class);
        this.orientedPhotoParam = (ActionOrientedPhotoParam)tmpOrientedPhotoParam.result;
        deserilizationIndex = tmpOrientedPhotoParam.endIndex;
        ByteResult<ActionPanoShotParam> tmpPanoShotParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, ActionPanoShotParam.class);
        this.panoShotParam = (ActionPanoShotParam)tmpPanoShotParam.result;
        deserilizationIndex = tmpPanoShotParam.endIndex;
        ByteResult<ActionPreExecuteActionParam> tmpPreExecuteActionParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, ActionPreExecuteActionParam.class);
        this.preExecuteActionParam = (ActionPreExecuteActionParam)tmpPreExecuteActionParam.result;
        deserilizationIndex = tmpPreExecuteActionParam.endIndex;
        ByteResult<ActionHoistUnloadParam> tmpHoistUnloadParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, ActionHoistUnloadParam.class);
        this.hoistUnloadParam = (ActionHoistUnloadParam)tmpHoistUnloadParam.result;
        deserilizationIndex = tmpHoistUnloadParam.endIndex;
        ByteResult<ActionSearchlightParam> tmpSearchlightParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, ActionSearchlightParam.class);
        this.searchlightParam = (ActionSearchlightParam)tmpSearchlightParam.result;
        deserilizationIndex = tmpSearchlightParam.endIndex;
        ByteResult<ActionMegaphoneParam> tmpMegaphoneParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, ActionMegaphoneParam.class);
        this.megaphoneParam = (ActionMegaphoneParam)tmpMegaphoneParam.result;
        deserilizationIndex = tmpMegaphoneParam.endIndex;
        ByteResult<ActionTargetDetectionParam> tmpTargetDetectionParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, ActionTargetDetectionParam.class);
        this.targetDetectionParam = (ActionTargetDetectionParam)tmpTargetDetectionParam.result;
        deserilizationIndex = tmpTargetDetectionParam.endIndex;
        return deserilizationIndex;
    }

    public Integer getActionId() {
        return this.actionId;
    }

    public void setActionId(Integer actionId) {
        this.actionId = actionId;
    }

    public WaylineActionType getActionType() {
        return this.actionType;
    }

    public void setActionType(WaylineActionType actionType) {
        this.actionType = actionType;
    }

    public ActionTakePhotoParam getTakePhotoParam() {
        return this.takePhotoParam;
    }

    public void setTakePhotoParam(ActionTakePhotoParam takePhotoParam) {
        this.takePhotoParam = takePhotoParam;
    }

    public ActionStartRecordParam getStartRecordParam() {
        return this.startRecordParam;
    }

    public void setStartRecordParam(ActionStartRecordParam startRecordParam) {
        this.startRecordParam = startRecordParam;
    }

    public ActionStopRecordParam getStopRecordParam() {
        return this.stopRecordParam;
    }

    public void setStopRecordParam(ActionStopRecordParam stopRecordParam) {
        this.stopRecordParam = stopRecordParam;
    }

    public ActionFocusParam getFocusParam() {
        return this.focusParam;
    }

    public void setFocusParam(ActionFocusParam focusParam) {
        this.focusParam = focusParam;
    }

    public ActionZoomParam getZoomParam() {
        return this.zoomParam;
    }

    public void setZoomParam(ActionZoomParam zoomParam) {
        this.zoomParam = zoomParam;
    }

    public ActionCustomDirNameParam getCustomDirNameParam() {
        return this.customDirNameParam;
    }

    public void setCustomDirNameParam(ActionCustomDirNameParam customDirNameParam) {
        this.customDirNameParam = customDirNameParam;
    }

    public ActionSetFocusTypeParam getSetFocusTypeParam() {
        return this.setFocusTypeParam;
    }

    public void setSetFocusTypeParam(ActionSetFocusTypeParam setFocusTypeParam) {
        this.setFocusTypeParam = setFocusTypeParam;
    }

    public ActionStartTimeLapseParam getStartTimeLapseParam() {
        return this.startTimeLapseParam;
    }

    public void setStartTimeLapseParam(ActionStartTimeLapseParam startTimeLapseParam) {
        this.startTimeLapseParam = startTimeLapseParam;
    }

    public ActionStopTimeLapseParam getStopTimeLapseParam() {
        return this.stopTimeLapseParam;
    }

    public void setStopTimeLapseParam(ActionStopTimeLapseParam stopTimeLapseParam) {
        this.stopTimeLapseParam = stopTimeLapseParam;
    }

    public ActionGimbalRotateParam getGimbalRotateParam() {
        return this.gimbalRotateParam;
    }

    public void setGimbalRotateParam(ActionGimbalRotateParam gimbalRotateParam) {
        this.gimbalRotateParam = gimbalRotateParam;
    }

    public ActionGimbalEvenlyRotateParam getGimbalEvenlyRotateParam() {
        return this.gimbalEvenlyRotateParam;
    }

    public void setGimbalEvenlyRotateParam(ActionGimbalEvenlyRotateParam gimbalEvenlyRotateParam) {
        this.gimbalEvenlyRotateParam = gimbalEvenlyRotateParam;
    }

    public ActionStartSmartObliqueParam getStartSmartObliqueParam() {
        return this.startSmartObliqueParam;
    }

    public void setStartSmartObliqueParam(ActionStartSmartObliqueParam startSmartObliqueParam) {
        this.startSmartObliqueParam = startSmartObliqueParam;
    }

    public ActionStopSmartObliqueParam getStopSmartObliqueParam() {
        return this.stopSmartObliqueParam;
    }

    public void setStopSmartObliqueParam(ActionStopSmartObliqueParam stopSmartObliqueParam) {
        this.stopSmartObliqueParam = stopSmartObliqueParam;
    }

    public ActionAircraftHoverParam getAircraftHoverParam() {
        return this.aircraftHoverParam;
    }

    public void setAircraftHoverParam(ActionAircraftHoverParam aircraftHoverParam) {
        this.aircraftHoverParam = aircraftHoverParam;
    }

    public ActionAircraftRotateYawParam getAircraftRotateYawParam() {
        return this.aircraftRotateYawParam;
    }

    public void setAircraftRotateYawParam(ActionAircraftRotateYawParam aircraftRotateYawParam) {
        this.aircraftRotateYawParam = aircraftRotateYawParam;
    }

    public ActionAircraftFlyControlParam getAircraftFlyControlParam() {
        return this.aircraftFlyControlParam;
    }

    public void setAircraftFlyControlParam(ActionAircraftFlyControlParam aircraftFlyControlParam) {
        this.aircraftFlyControlParam = aircraftFlyControlParam;
    }

    public ActionAccuratePhotoParam getAccuratePhotoParam() {
        return this.accuratePhotoParam;
    }

    public void setAccuratePhotoParam(ActionAccuratePhotoParam accuratePhotoParam) {
        this.accuratePhotoParam = accuratePhotoParam;
    }

    public ActionRecordPointCloudParam getRecordPointCloudParam() {
        return this.recordPointCloudParam;
    }

    public void setRecordPointCloudParam(ActionRecordPointCloudParam recordPointCloudParam) {
        this.recordPointCloudParam = recordPointCloudParam;
    }

    public ActionPSDKParam getPsdkParam() {
        return this.psdkParam;
    }

    public void setPsdkParam(ActionPSDKParam psdkParam) {
        this.psdkParam = psdkParam;
    }

    public ActionAircraftCaliParam getAircraftCaliParam() {
        return this.aircraftCaliParam;
    }

    public void setAircraftCaliParam(ActionAircraftCaliParam aircraftCaliParam) {
        this.aircraftCaliParam = aircraftCaliParam;
    }

    public ActionStartContinuousShootingParam getStartContinuousShootingParam() {
        return this.startContinuousShootingParam;
    }

    public void setStartContinuousShootingParam(ActionStartContinuousShootingParam startContinuousShootingParam) {
        this.startContinuousShootingParam = startContinuousShootingParam;
    }

    public ActionStopContinuousShootingParam getStopContinuousShootingParam() {
        return this.stopContinuousShootingParam;
    }

    public void setStopContinuousShootingParam(ActionStopContinuousShootingParam stopContinuousShootingParam) {
        this.stopContinuousShootingParam = stopContinuousShootingParam;
    }

    public ActionSprayOpenParam getSprayOpenParam() {
        return this.sprayOpenParam;
    }

    public void setSprayOpenParam(ActionSprayOpenParam sprayOpenParam) {
        this.sprayOpenParam = sprayOpenParam;
    }

    public ActionSprayCloseParam getSprayCloseParam() {
        return this.sprayCloseParam;
    }

    public void setSprayCloseParam(ActionSprayCloseParam sprayCloseParam) {
        this.sprayCloseParam = sprayCloseParam;
    }

    public ActionSprayCapacityParam getSprayCapacityParam() {
        return this.sprayCapacityParam;
    }

    public void setSprayCapacityParam(ActionSprayCapacityParam sprayCapacityParam) {
        this.sprayCapacityParam = sprayCapacityParam;
    }

    public ActionAircraftRotateFollowSpeedParam getAircraftRotateFollowSpeedParam() {
        return this.aircraftRotateFollowSpeedParam;
    }

    public void setAircraftRotateFollowSpeedParam(ActionAircraftRotateFollowSpeedParam aircraftRotateFollowSpeedParam) {
        this.aircraftRotateFollowSpeedParam = aircraftRotateFollowSpeedParam;
    }

    public ActionLowLightSmartShootingParam getLowLightSmartShootingParam() {
        return this.lowLightSmartShootingParam;
    }

    public void setLowLightSmartShootingParam(ActionLowLightSmartShootingParam lowLightSmartShootingParam) {
        this.lowLightSmartShootingParam = lowLightSmartShootingParam;
    }

    public ActionOrientedPhotoParam getOrientedPhotoParam() {
        return this.orientedPhotoParam;
    }

    public void setOrientedPhotoParam(ActionOrientedPhotoParam orientedPhotoParam) {
        this.orientedPhotoParam = orientedPhotoParam;
    }

    public ActionPanoShotParam getPanoShotParam() {
        return this.panoShotParam;
    }

    public void setPanoShotParam(ActionPanoShotParam panoShotParam) {
        this.panoShotParam = panoShotParam;
    }

    public ActionPreExecuteActionParam getPreExecuteActionParam() {
        return this.preExecuteActionParam;
    }

    public void setPreExecuteActionParam(ActionPreExecuteActionParam preExecuteActionParam) {
        this.preExecuteActionParam = preExecuteActionParam;
    }

    public ActionHoistUnloadParam getHoistUnloadParam() {
        return this.hoistUnloadParam;
    }

    public void setHoistUnloadParam(ActionHoistUnloadParam hoistUnloadParam) {
        this.hoistUnloadParam = hoistUnloadParam;
    }

    public ActionSearchlightParam getSearchlightParam() {
        return this.searchlightParam;
    }

    public void setSearchlightParam(ActionSearchlightParam searchlightParam) {
        this.searchlightParam = searchlightParam;
    }

    public ActionMegaphoneParam getMegaphoneParam() {
        return this.megaphoneParam;
    }

    public void setMegaphoneParam(ActionMegaphoneParam megaphoneParam) {
        this.megaphoneParam = megaphoneParam;
    }

    public ActionTargetDetectionParam getTargetDetectionParam() {
        return this.targetDetectionParam;
    }

    public void setTargetDetectionParam(ActionTargetDetectionParam targetDetectionParam) {
        this.targetDetectionParam = targetDetectionParam;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineActionInfo)) {
            return false;
        }
        WaylineActionInfo that = (WaylineActionInfo)o;
        return Objects.equals(this.actionId, that.actionId) && Objects.equals(this.actionType, that.actionType) && Objects.equals(this.takePhotoParam, that.takePhotoParam) && Objects.equals(this.startRecordParam, that.startRecordParam) && Objects.equals(this.stopRecordParam, that.stopRecordParam) && Objects.equals(this.focusParam, that.focusParam) && Objects.equals(this.zoomParam, that.zoomParam) && Objects.equals(this.customDirNameParam, that.customDirNameParam) && Objects.equals(this.setFocusTypeParam, that.setFocusTypeParam) && Objects.equals(this.startTimeLapseParam, that.startTimeLapseParam) && Objects.equals(this.stopTimeLapseParam, that.stopTimeLapseParam) && Objects.equals(this.gimbalRotateParam, that.gimbalRotateParam) && Objects.equals(this.gimbalEvenlyRotateParam, that.gimbalEvenlyRotateParam) && Objects.equals(this.startSmartObliqueParam, that.startSmartObliqueParam) && Objects.equals(this.stopSmartObliqueParam, that.stopSmartObliqueParam) && Objects.equals(this.aircraftHoverParam, that.aircraftHoverParam) && Objects.equals(this.aircraftRotateYawParam, that.aircraftRotateYawParam) && Objects.equals(this.aircraftFlyControlParam, that.aircraftFlyControlParam) && Objects.equals(this.accuratePhotoParam, that.accuratePhotoParam) && Objects.equals(this.recordPointCloudParam, that.recordPointCloudParam) && Objects.equals(this.psdkParam, that.psdkParam) && Objects.equals(this.aircraftCaliParam, that.aircraftCaliParam) && Objects.equals(this.startContinuousShootingParam, that.startContinuousShootingParam) && Objects.equals(this.stopContinuousShootingParam, that.stopContinuousShootingParam) && Objects.equals(this.sprayOpenParam, that.sprayOpenParam) && Objects.equals(this.sprayCloseParam, that.sprayCloseParam) && Objects.equals(this.sprayCapacityParam, that.sprayCapacityParam) && Objects.equals(this.aircraftRotateFollowSpeedParam, that.aircraftRotateFollowSpeedParam) && Objects.equals(this.lowLightSmartShootingParam, that.lowLightSmartShootingParam) && Objects.equals(this.orientedPhotoParam, that.orientedPhotoParam) && Objects.equals(this.panoShotParam, that.panoShotParam) && Objects.equals(this.preExecuteActionParam, that.preExecuteActionParam) && Objects.equals(this.hoistUnloadParam, that.hoistUnloadParam) && Objects.equals(this.searchlightParam, that.searchlightParam) && Objects.equals(this.megaphoneParam, that.megaphoneParam) && Objects.equals(this.targetDetectionParam, that.targetDetectionParam);
    }

    public int hashCode() {
        return Objects.hash(this.actionId, this.actionType, this.takePhotoParam, this.startRecordParam, this.stopRecordParam, this.focusParam, this.zoomParam, this.customDirNameParam, this.setFocusTypeParam, this.startTimeLapseParam, this.stopTimeLapseParam, this.gimbalRotateParam, this.gimbalEvenlyRotateParam, this.startSmartObliqueParam, this.stopSmartObliqueParam, this.aircraftHoverParam, this.aircraftRotateYawParam, this.aircraftFlyControlParam, this.accuratePhotoParam, this.recordPointCloudParam, this.psdkParam, this.aircraftCaliParam, this.startContinuousShootingParam, this.stopContinuousShootingParam, this.sprayOpenParam, this.sprayCloseParam, this.sprayCapacityParam, this.aircraftRotateFollowSpeedParam, this.lowLightSmartShootingParam, this.orientedPhotoParam, this.panoShotParam, this.preExecuteActionParam, this.hoistUnloadParam, this.searchlightParam, this.megaphoneParam, this.targetDetectionParam);
    }
}

