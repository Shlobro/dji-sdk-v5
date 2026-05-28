/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;
import dji.sdk.wpmz.value.ByteResult;
import dji.sdk.wpmz.value.ByteStream;
import dji.sdk.wpmz.value.ByteStreamHelper;
import dji.sdk.wpmz.value.base.DJIValue;
import dji.sdk.wpmz.value.mission.CameraLensType;
import dji.sdk.wpmz.value.mission.WaylineActionOrientedPhotoCameraStateInformation;
import dji.sdk.wpmz.value.mission.WaylineActionOrientedPhotoDeviceInformation;
import dji.sdk.wpmz.value.mission.WaylineActionOrientedPhotoFileInformation;
import dji.sdk.wpmz.value.mission.WaylineActionOrientedPhotoGimbalStateInformation;
import dji.sdk.wpmz.value.mission.WaylineActionOrientedPhotoTargetRect;
import dji.sdk.wpmz.value.mission.WaylineActionOrientedShootSize;
import dji.sdk.wpmz.value.mission.WaylineOrientedPhotoModeParam;
import dji.sdk.wpmz.value.mission.WaylineWaypointYawPathMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class ActionOrientedPhotoParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String actionUUID = "";
    Boolean isFrameValid = false;
    Boolean useGlobalPayloadLensIndex = false;
    List<CameraLensType> payloadLensIndex = new ArrayList<CameraLensType>();
    WaylineActionOrientedPhotoTargetRect target_rect;
    WaylineActionOrientedShootSize image_size;
    WaylineActionOrientedPhotoCameraStateInformation camera_infos;
    WaylineActionOrientedPhotoGimbalStateInformation gimbal_infos;
    WaylineActionOrientedPhotoDeviceInformation device_infos;
    WaylineActionOrientedPhotoFileInformation file_infos;
    WaylineOrientedPhotoModeParam modeParam;
    Double heading = 0.0;
    WaylineWaypointYawPathMode pathMode = WaylineWaypointYawPathMode.UNKNOWN;

    public ActionOrientedPhotoParam() {
    }

    public ActionOrientedPhotoParam(String actionUUID, Boolean isFrameValid, Boolean useGlobalPayloadLensIndex, List<CameraLensType> payloadLensIndex, WaylineActionOrientedPhotoTargetRect target_rect, WaylineActionOrientedShootSize image_size, WaylineActionOrientedPhotoCameraStateInformation camera_infos, WaylineActionOrientedPhotoGimbalStateInformation gimbal_infos, WaylineActionOrientedPhotoDeviceInformation device_infos, WaylineActionOrientedPhotoFileInformation file_infos, WaylineOrientedPhotoModeParam modeParam, Double heading, WaylineWaypointYawPathMode pathMode) {
        if (actionUUID != null) {
            this.actionUUID = actionUUID;
        }
        if (isFrameValid != null) {
            this.isFrameValid = isFrameValid;
        }
        if (useGlobalPayloadLensIndex != null) {
            this.useGlobalPayloadLensIndex = useGlobalPayloadLensIndex;
        }
        if (payloadLensIndex != null) {
            this.payloadLensIndex = payloadLensIndex;
        }
        if (target_rect != null) {
            this.target_rect = target_rect;
        }
        if (image_size != null) {
            this.image_size = image_size;
        }
        if (camera_infos != null) {
            this.camera_infos = camera_infos;
        }
        if (gimbal_infos != null) {
            this.gimbal_infos = gimbal_infos;
        }
        if (device_infos != null) {
            this.device_infos = device_infos;
        }
        if (file_infos != null) {
            this.file_infos = file_infos;
        }
        if (modeParam != null) {
            this.modeParam = modeParam;
        }
        if (heading != null) {
            this.heading = heading;
        }
        if (pathMode != null) {
            this.pathMode = pathMode;
        }
    }

    public static ActionOrientedPhotoParam fromJson(String jsonString) {
        ActionOrientedPhotoParam tmpValueResult_ = new ActionOrientedPhotoParam();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.actionUUID = jsonObj.getString("actionUUID");
            tmpValueResult_.isFrameValid = jsonObj.getBoolean("isFrameValid");
            tmpValueResult_.useGlobalPayloadLensIndex = jsonObj.getBoolean("useGlobalPayloadLensIndex");
            JSONArray payloadLensIndexJsonArr = jsonObj.getJSONArray("payloadLensIndex");
            for (int i = 0; i < payloadLensIndexJsonArr.length(); ++i) {
                tmpValueResult_.payloadLensIndex.add(CameraLensType.find(payloadLensIndexJsonArr.getInt(i)));
            }
            tmpValueResult_.target_rect = WaylineActionOrientedPhotoTargetRect.fromJson(jsonObj.getJSONObject("target_rect").toString());
            tmpValueResult_.image_size = WaylineActionOrientedShootSize.fromJson(jsonObj.getJSONObject("image_size").toString());
            tmpValueResult_.camera_infos = WaylineActionOrientedPhotoCameraStateInformation.fromJson(jsonObj.getJSONObject("camera_infos").toString());
            tmpValueResult_.gimbal_infos = WaylineActionOrientedPhotoGimbalStateInformation.fromJson(jsonObj.getJSONObject("gimbal_infos").toString());
            tmpValueResult_.device_infos = WaylineActionOrientedPhotoDeviceInformation.fromJson(jsonObj.getJSONObject("device_infos").toString());
            tmpValueResult_.file_infos = WaylineActionOrientedPhotoFileInformation.fromJson(jsonObj.getJSONObject("file_infos").toString());
            tmpValueResult_.modeParam = WaylineOrientedPhotoModeParam.fromJson(jsonObj.getJSONObject("modeParam").toString());
            tmpValueResult_.heading = jsonObj.getDouble("heading");
            tmpValueResult_.pathMode = WaylineWaypointYawPathMode.find(jsonObj.getInt("pathMode"));
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
            if (null != this.actionUUID) {
                json.put("actionUUID", (Object)this.actionUUID);
            }
            if (null != this.isFrameValid) {
                json.put("isFrameValid", (Object)this.isFrameValid);
            }
            if (null != this.useGlobalPayloadLensIndex) {
                json.put("useGlobalPayloadLensIndex", (Object)this.useGlobalPayloadLensIndex);
            }
            if (null != this.payloadLensIndex) {
                JSONArray json_arr_payloadLensIndex = new JSONArray();
                for (int i = 0; i < this.payloadLensIndex.size(); ++i) {
                    json_arr_payloadLensIndex.put(this.payloadLensIndex.get(i).value());
                }
                json.put("payloadLensIndex", (Object)json_arr_payloadLensIndex);
            }
            if (null != this.target_rect) {
                json.put("target_rect", (Object)this.target_rect.toJson());
            }
            if (null != this.image_size) {
                json.put("image_size", (Object)this.image_size.toJson());
            }
            if (null != this.camera_infos) {
                json.put("camera_infos", (Object)this.camera_infos.toJson());
            }
            if (null != this.gimbal_infos) {
                json.put("gimbal_infos", (Object)this.gimbal_infos.toJson());
            }
            if (null != this.device_infos) {
                json.put("device_infos", (Object)this.device_infos.toJson());
            }
            if (null != this.file_infos) {
                json.put("file_infos", (Object)this.file_infos.toJson());
            }
            if (null != this.modeParam) {
                json.put("modeParam", (Object)this.modeParam.toJson());
            }
            if (null != this.heading) {
                json.put("heading", (Object)this.heading);
            }
            if (null != this.pathMode) {
                json.put("pathMode", this.pathMode.value());
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
        serializedLength += ByteStreamHelper.stringGetLength(this.actionUUID);
        serializedLength += ByteStreamHelper.booleanGetLength(this.isFrameValid);
        serializedLength += ByteStreamHelper.booleanGetLength(this.useGlobalPayloadLensIndex);
        serializedLength += 4;
        for (int i = 0; i < this.payloadLensIndex.size(); ++i) {
            serializedLength += ByteStreamHelper.integerGetLength(this.payloadLensIndex.get(i).value());
        }
        serializedLength += ByteStreamHelper.getLength(this.target_rect, WaylineActionOrientedPhotoTargetRect.class);
        serializedLength += ByteStreamHelper.getLength(this.image_size, WaylineActionOrientedShootSize.class);
        serializedLength += ByteStreamHelper.getLength(this.camera_infos, WaylineActionOrientedPhotoCameraStateInformation.class);
        serializedLength += ByteStreamHelper.getLength(this.gimbal_infos, WaylineActionOrientedPhotoGimbalStateInformation.class);
        serializedLength += ByteStreamHelper.getLength(this.device_infos, WaylineActionOrientedPhotoDeviceInformation.class);
        serializedLength += ByteStreamHelper.getLength(this.file_infos, WaylineActionOrientedPhotoFileInformation.class);
        serializedLength += ByteStreamHelper.getLength(this.modeParam, WaylineOrientedPhotoModeParam.class);
        serializedLength += ByteStreamHelper.doubleGetLength(this.heading);
        return serializedLength += ByteStreamHelper.integerGetLength(this.pathMode.value());
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.stringToBytes(resultBytes, this.actionUUID, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isFrameValid, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.useGlobalPayloadLensIndex, serializedIndex);
        int arrlength = this.payloadLensIndex.size();
        ByteStreamHelper.intArrayTobyte(resultBytes, serializedIndex, arrlength);
        serializedIndex += 4;
        for (int i = 0; i < arrlength; ++i) {
            serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.payloadLensIndex.get(i).value(), serializedIndex);
        }
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.target_rect, serializedIndex, WaylineActionOrientedPhotoTargetRect.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.image_size, serializedIndex, WaylineActionOrientedShootSize.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.camera_infos, serializedIndex, WaylineActionOrientedPhotoCameraStateInformation.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.gimbal_infos, serializedIndex, WaylineActionOrientedPhotoGimbalStateInformation.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.device_infos, serializedIndex, WaylineActionOrientedPhotoDeviceInformation.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.file_infos, serializedIndex, WaylineActionOrientedPhotoFileInformation.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.modeParam, serializedIndex, WaylineOrientedPhotoModeParam.class);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.heading, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.pathMode.value(), serializedIndex);
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
        ByteResult<String> tmpActionUUID = ByteStreamHelper.stringFromBytes(data, deserilizationIndex);
        this.actionUUID = (String)tmpActionUUID.result;
        deserilizationIndex = tmpActionUUID.endIndex;
        ByteResult<Boolean> tmpIsFrameValid = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isFrameValid = (Boolean)tmpIsFrameValid.result;
        deserilizationIndex = tmpIsFrameValid.endIndex;
        ByteResult<Boolean> tmpUseGlobalPayloadLensIndex = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.useGlobalPayloadLensIndex = (Boolean)tmpUseGlobalPayloadLensIndex.result;
        deserilizationIndex = tmpUseGlobalPayloadLensIndex.endIndex;
        this.payloadLensIndex = new ArrayList<CameraLensType>();
        int length = ByteBuffer.wrap(data, deserilizationIndex, 4).order(ByteOrder.LITTLE_ENDIAN).getInt();
        deserilizationIndex += 4;
        for (int i = 0; i < length; ++i) {
            ByteResult<Integer> member = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
            deserilizationIndex = member.endIndex;
            this.payloadLensIndex.add(CameraLensType.find((Integer)member.result));
        }
        ByteResult<WaylineActionOrientedPhotoTargetRect> tmpTarget_rect = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineActionOrientedPhotoTargetRect.class);
        this.target_rect = (WaylineActionOrientedPhotoTargetRect)tmpTarget_rect.result;
        deserilizationIndex = tmpTarget_rect.endIndex;
        ByteResult<WaylineActionOrientedShootSize> tmpImage_size = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineActionOrientedShootSize.class);
        this.image_size = (WaylineActionOrientedShootSize)tmpImage_size.result;
        deserilizationIndex = tmpImage_size.endIndex;
        ByteResult<WaylineActionOrientedPhotoCameraStateInformation> tmpCamera_infos = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineActionOrientedPhotoCameraStateInformation.class);
        this.camera_infos = (WaylineActionOrientedPhotoCameraStateInformation)tmpCamera_infos.result;
        deserilizationIndex = tmpCamera_infos.endIndex;
        ByteResult<WaylineActionOrientedPhotoGimbalStateInformation> tmpGimbal_infos = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineActionOrientedPhotoGimbalStateInformation.class);
        this.gimbal_infos = (WaylineActionOrientedPhotoGimbalStateInformation)tmpGimbal_infos.result;
        deserilizationIndex = tmpGimbal_infos.endIndex;
        ByteResult<WaylineActionOrientedPhotoDeviceInformation> tmpDevice_infos = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineActionOrientedPhotoDeviceInformation.class);
        this.device_infos = (WaylineActionOrientedPhotoDeviceInformation)tmpDevice_infos.result;
        deserilizationIndex = tmpDevice_infos.endIndex;
        ByteResult<WaylineActionOrientedPhotoFileInformation> tmpFile_infos = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineActionOrientedPhotoFileInformation.class);
        this.file_infos = (WaylineActionOrientedPhotoFileInformation)tmpFile_infos.result;
        deserilizationIndex = tmpFile_infos.endIndex;
        ByteResult<WaylineOrientedPhotoModeParam> tmpModeParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineOrientedPhotoModeParam.class);
        this.modeParam = (WaylineOrientedPhotoModeParam)tmpModeParam.result;
        deserilizationIndex = tmpModeParam.endIndex;
        ByteResult<Double> tmpHeading = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.heading = (Double)tmpHeading.result;
        deserilizationIndex = tmpHeading.endIndex;
        ByteResult<Integer> tmpPathMode = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.pathMode = WaylineWaypointYawPathMode.find((Integer)tmpPathMode.result);
        deserilizationIndex = tmpPathMode.endIndex;
        return deserilizationIndex;
    }

    public String getActionUUID() {
        return this.actionUUID;
    }

    public void setActionUUID(String actionUUID) {
        this.actionUUID = actionUUID;
    }

    public Boolean getIsFrameValid() {
        return this.isFrameValid;
    }

    public void setIsFrameValid(Boolean isFrameValid) {
        this.isFrameValid = isFrameValid;
    }

    public Boolean getUseGlobalPayloadLensIndex() {
        return this.useGlobalPayloadLensIndex;
    }

    public void setUseGlobalPayloadLensIndex(Boolean useGlobalPayloadLensIndex) {
        this.useGlobalPayloadLensIndex = useGlobalPayloadLensIndex;
    }

    public List<CameraLensType> getPayloadLensIndex() {
        return this.payloadLensIndex;
    }

    public void setPayloadLensIndex(List<CameraLensType> payloadLensIndex) {
        this.payloadLensIndex = payloadLensIndex;
    }

    public WaylineActionOrientedPhotoTargetRect getTarget_rect() {
        return this.target_rect;
    }

    public void setTarget_rect(WaylineActionOrientedPhotoTargetRect target_rect) {
        this.target_rect = target_rect;
    }

    public WaylineActionOrientedShootSize getImage_size() {
        return this.image_size;
    }

    public void setImage_size(WaylineActionOrientedShootSize image_size) {
        this.image_size = image_size;
    }

    public WaylineActionOrientedPhotoCameraStateInformation getCamera_infos() {
        return this.camera_infos;
    }

    public void setCamera_infos(WaylineActionOrientedPhotoCameraStateInformation camera_infos) {
        this.camera_infos = camera_infos;
    }

    public WaylineActionOrientedPhotoGimbalStateInformation getGimbal_infos() {
        return this.gimbal_infos;
    }

    public void setGimbal_infos(WaylineActionOrientedPhotoGimbalStateInformation gimbal_infos) {
        this.gimbal_infos = gimbal_infos;
    }

    public WaylineActionOrientedPhotoDeviceInformation getDevice_infos() {
        return this.device_infos;
    }

    public void setDevice_infos(WaylineActionOrientedPhotoDeviceInformation device_infos) {
        this.device_infos = device_infos;
    }

    public WaylineActionOrientedPhotoFileInformation getFile_infos() {
        return this.file_infos;
    }

    public void setFile_infos(WaylineActionOrientedPhotoFileInformation file_infos) {
        this.file_infos = file_infos;
    }

    public WaylineOrientedPhotoModeParam getModeParam() {
        return this.modeParam;
    }

    public void setModeParam(WaylineOrientedPhotoModeParam modeParam) {
        this.modeParam = modeParam;
    }

    public Double getHeading() {
        return this.heading;
    }

    public void setHeading(Double heading) {
        this.heading = heading;
    }

    public WaylineWaypointYawPathMode getPathMode() {
        return this.pathMode;
    }

    public void setPathMode(WaylineWaypointYawPathMode pathMode) {
        this.pathMode = pathMode;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActionOrientedPhotoParam)) {
            return false;
        }
        ActionOrientedPhotoParam that = (ActionOrientedPhotoParam)o;
        return Objects.equals(this.actionUUID, that.actionUUID) && Objects.equals(this.isFrameValid, that.isFrameValid) && Objects.equals(this.useGlobalPayloadLensIndex, that.useGlobalPayloadLensIndex) && Objects.equals(this.payloadLensIndex, that.payloadLensIndex) && Objects.equals(this.target_rect, that.target_rect) && Objects.equals(this.image_size, that.image_size) && Objects.equals(this.camera_infos, that.camera_infos) && Objects.equals(this.gimbal_infos, that.gimbal_infos) && Objects.equals(this.device_infos, that.device_infos) && Objects.equals(this.file_infos, that.file_infos) && Objects.equals(this.modeParam, that.modeParam) && Objects.equals(this.heading, that.heading) && Objects.equals(this.pathMode, that.pathMode);
    }

    public int hashCode() {
        return Objects.hash(this.actionUUID, this.isFrameValid, this.useGlobalPayloadLensIndex, this.payloadLensIndex, this.target_rect, this.image_size, this.camera_infos, this.gimbal_infos, this.device_infos, this.file_infos, this.modeParam, this.heading, this.pathMode);
    }
}

