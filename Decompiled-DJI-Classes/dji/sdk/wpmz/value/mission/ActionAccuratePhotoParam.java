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
import dji.sdk.wpmz.value.mission.WaylineActionAccurateShootPhotoCameraStateInformation;
import dji.sdk.wpmz.value.mission.WaylineActionAccurateShootPhotoDeviceInformation;
import dji.sdk.wpmz.value.mission.WaylineActionAccurateShootPhotoFileInformation;
import dji.sdk.wpmz.value.mission.WaylineActionAccurateShootPhotoGimbalStateInformation;
import dji.sdk.wpmz.value.mission.WaylineActionAccurateShootPhotoTargetRect;
import dji.sdk.wpmz.value.mission.WaylineActionAccurateShootSize;
import dji.sdk.wpmz.value.mission.WaylineWaypointYawPathMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class ActionAccuratePhotoParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String actionUUID = "";
    Boolean isFrameValid = false;
    Boolean useGlobalPayloadLensIndex = false;
    List<CameraLensType> payloadLensIndex = new ArrayList<CameraLensType>();
    WaylineActionAccurateShootPhotoTargetRect target_rect;
    WaylineActionAccurateShootSize image_size;
    WaylineActionAccurateShootPhotoCameraStateInformation camera_infos;
    WaylineActionAccurateShootPhotoGimbalStateInformation gimbal_infos;
    WaylineActionAccurateShootPhotoDeviceInformation device_infos;
    WaylineActionAccurateShootPhotoFileInformation file_infos;
    Double heading = 0.0;
    WaylineWaypointYawPathMode pathMode = WaylineWaypointYawPathMode.UNKNOWN;

    public ActionAccuratePhotoParam() {
    }

    public ActionAccuratePhotoParam(String actionUUID, Boolean isFrameValid, Boolean useGlobalPayloadLensIndex, List<CameraLensType> payloadLensIndex, WaylineActionAccurateShootPhotoTargetRect target_rect, WaylineActionAccurateShootSize image_size, WaylineActionAccurateShootPhotoCameraStateInformation camera_infos, WaylineActionAccurateShootPhotoGimbalStateInformation gimbal_infos, WaylineActionAccurateShootPhotoDeviceInformation device_infos, WaylineActionAccurateShootPhotoFileInformation file_infos, Double heading, WaylineWaypointYawPathMode pathMode) {
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
        if (heading != null) {
            this.heading = heading;
        }
        if (pathMode != null) {
            this.pathMode = pathMode;
        }
    }

    public static ActionAccuratePhotoParam fromJson(String jsonString) {
        ActionAccuratePhotoParam tmpValueResult_ = new ActionAccuratePhotoParam();
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
            tmpValueResult_.target_rect = WaylineActionAccurateShootPhotoTargetRect.fromJson(jsonObj.getJSONObject("target_rect").toString());
            tmpValueResult_.image_size = WaylineActionAccurateShootSize.fromJson(jsonObj.getJSONObject("image_size").toString());
            tmpValueResult_.camera_infos = WaylineActionAccurateShootPhotoCameraStateInformation.fromJson(jsonObj.getJSONObject("camera_infos").toString());
            tmpValueResult_.gimbal_infos = WaylineActionAccurateShootPhotoGimbalStateInformation.fromJson(jsonObj.getJSONObject("gimbal_infos").toString());
            tmpValueResult_.device_infos = WaylineActionAccurateShootPhotoDeviceInformation.fromJson(jsonObj.getJSONObject("device_infos").toString());
            tmpValueResult_.file_infos = WaylineActionAccurateShootPhotoFileInformation.fromJson(jsonObj.getJSONObject("file_infos").toString());
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
        serializedLength += ByteStreamHelper.getLength(this.target_rect, WaylineActionAccurateShootPhotoTargetRect.class);
        serializedLength += ByteStreamHelper.getLength(this.image_size, WaylineActionAccurateShootSize.class);
        serializedLength += ByteStreamHelper.getLength(this.camera_infos, WaylineActionAccurateShootPhotoCameraStateInformation.class);
        serializedLength += ByteStreamHelper.getLength(this.gimbal_infos, WaylineActionAccurateShootPhotoGimbalStateInformation.class);
        serializedLength += ByteStreamHelper.getLength(this.device_infos, WaylineActionAccurateShootPhotoDeviceInformation.class);
        serializedLength += ByteStreamHelper.getLength(this.file_infos, WaylineActionAccurateShootPhotoFileInformation.class);
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
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.target_rect, serializedIndex, WaylineActionAccurateShootPhotoTargetRect.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.image_size, serializedIndex, WaylineActionAccurateShootSize.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.camera_infos, serializedIndex, WaylineActionAccurateShootPhotoCameraStateInformation.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.gimbal_infos, serializedIndex, WaylineActionAccurateShootPhotoGimbalStateInformation.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.device_infos, serializedIndex, WaylineActionAccurateShootPhotoDeviceInformation.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.file_infos, serializedIndex, WaylineActionAccurateShootPhotoFileInformation.class);
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
        ByteResult<WaylineActionAccurateShootPhotoTargetRect> tmpTarget_rect = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineActionAccurateShootPhotoTargetRect.class);
        this.target_rect = (WaylineActionAccurateShootPhotoTargetRect)tmpTarget_rect.result;
        deserilizationIndex = tmpTarget_rect.endIndex;
        ByteResult<WaylineActionAccurateShootSize> tmpImage_size = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineActionAccurateShootSize.class);
        this.image_size = (WaylineActionAccurateShootSize)tmpImage_size.result;
        deserilizationIndex = tmpImage_size.endIndex;
        ByteResult<WaylineActionAccurateShootPhotoCameraStateInformation> tmpCamera_infos = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineActionAccurateShootPhotoCameraStateInformation.class);
        this.camera_infos = (WaylineActionAccurateShootPhotoCameraStateInformation)tmpCamera_infos.result;
        deserilizationIndex = tmpCamera_infos.endIndex;
        ByteResult<WaylineActionAccurateShootPhotoGimbalStateInformation> tmpGimbal_infos = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineActionAccurateShootPhotoGimbalStateInformation.class);
        this.gimbal_infos = (WaylineActionAccurateShootPhotoGimbalStateInformation)tmpGimbal_infos.result;
        deserilizationIndex = tmpGimbal_infos.endIndex;
        ByteResult<WaylineActionAccurateShootPhotoDeviceInformation> tmpDevice_infos = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineActionAccurateShootPhotoDeviceInformation.class);
        this.device_infos = (WaylineActionAccurateShootPhotoDeviceInformation)tmpDevice_infos.result;
        deserilizationIndex = tmpDevice_infos.endIndex;
        ByteResult<WaylineActionAccurateShootPhotoFileInformation> tmpFile_infos = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineActionAccurateShootPhotoFileInformation.class);
        this.file_infos = (WaylineActionAccurateShootPhotoFileInformation)tmpFile_infos.result;
        deserilizationIndex = tmpFile_infos.endIndex;
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

    public WaylineActionAccurateShootPhotoTargetRect getTarget_rect() {
        return this.target_rect;
    }

    public void setTarget_rect(WaylineActionAccurateShootPhotoTargetRect target_rect) {
        this.target_rect = target_rect;
    }

    public WaylineActionAccurateShootSize getImage_size() {
        return this.image_size;
    }

    public void setImage_size(WaylineActionAccurateShootSize image_size) {
        this.image_size = image_size;
    }

    public WaylineActionAccurateShootPhotoCameraStateInformation getCamera_infos() {
        return this.camera_infos;
    }

    public void setCamera_infos(WaylineActionAccurateShootPhotoCameraStateInformation camera_infos) {
        this.camera_infos = camera_infos;
    }

    public WaylineActionAccurateShootPhotoGimbalStateInformation getGimbal_infos() {
        return this.gimbal_infos;
    }

    public void setGimbal_infos(WaylineActionAccurateShootPhotoGimbalStateInformation gimbal_infos) {
        this.gimbal_infos = gimbal_infos;
    }

    public WaylineActionAccurateShootPhotoDeviceInformation getDevice_infos() {
        return this.device_infos;
    }

    public void setDevice_infos(WaylineActionAccurateShootPhotoDeviceInformation device_infos) {
        this.device_infos = device_infos;
    }

    public WaylineActionAccurateShootPhotoFileInformation getFile_infos() {
        return this.file_infos;
    }

    public void setFile_infos(WaylineActionAccurateShootPhotoFileInformation file_infos) {
        this.file_infos = file_infos;
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
        if (!(o instanceof ActionAccuratePhotoParam)) {
            return false;
        }
        ActionAccuratePhotoParam that = (ActionAccuratePhotoParam)o;
        return Objects.equals(this.actionUUID, that.actionUUID) && Objects.equals(this.isFrameValid, that.isFrameValid) && Objects.equals(this.useGlobalPayloadLensIndex, that.useGlobalPayloadLensIndex) && Objects.equals(this.payloadLensIndex, that.payloadLensIndex) && Objects.equals(this.target_rect, that.target_rect) && Objects.equals(this.image_size, that.image_size) && Objects.equals(this.camera_infos, that.camera_infos) && Objects.equals(this.gimbal_infos, that.gimbal_infos) && Objects.equals(this.device_infos, that.device_infos) && Objects.equals(this.file_infos, that.file_infos) && Objects.equals(this.heading, that.heading) && Objects.equals(this.pathMode, that.pathMode);
    }

    public int hashCode() {
        return Objects.hash(this.actionUUID, this.isFrameValid, this.useGlobalPayloadLensIndex, this.payloadLensIndex, this.target_rect, this.image_size, this.camera_infos, this.gimbal_infos, this.device_infos, this.file_infos, this.heading, this.pathMode);
    }
}

