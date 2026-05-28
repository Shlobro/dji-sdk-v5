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
import java.util.Objects;
import org.json.JSONObject;

public class WaylineActionAccurateShootPhotoDeviceInformation
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer camera_type = 0;
    Integer payloadPositionIndex = 0;
    Integer gimbal_port = 0;

    public WaylineActionAccurateShootPhotoDeviceInformation() {
    }

    public WaylineActionAccurateShootPhotoDeviceInformation(Integer camera_type, Integer payloadPositionIndex, Integer gimbal_port) {
        if (camera_type != null) {
            this.camera_type = camera_type;
        }
        if (payloadPositionIndex != null) {
            this.payloadPositionIndex = payloadPositionIndex;
        }
        if (gimbal_port != null) {
            this.gimbal_port = gimbal_port;
        }
    }

    public static WaylineActionAccurateShootPhotoDeviceInformation fromJson(String jsonString) {
        WaylineActionAccurateShootPhotoDeviceInformation tmpValueResult_ = new WaylineActionAccurateShootPhotoDeviceInformation();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.camera_type = jsonObj.getInt("camera_type");
            tmpValueResult_.payloadPositionIndex = jsonObj.getInt("payloadPositionIndex");
            tmpValueResult_.gimbal_port = jsonObj.getInt("gimbal_port");
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
            if (null != this.camera_type) {
                json.put("camera_type", (Object)this.camera_type);
            }
            if (null != this.payloadPositionIndex) {
                json.put("payloadPositionIndex", (Object)this.payloadPositionIndex);
            }
            if (null != this.gimbal_port) {
                json.put("gimbal_port", (Object)this.gimbal_port);
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
        serializedLength += ByteStreamHelper.integerGetLength(this.camera_type);
        serializedLength += ByteStreamHelper.integerGetLength(this.payloadPositionIndex);
        return serializedLength += ByteStreamHelper.integerGetLength(this.gimbal_port);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.camera_type, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.payloadPositionIndex, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.gimbal_port, serializedIndex);
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
        ByteResult<Integer> tmpCamera_type = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.camera_type = (Integer)tmpCamera_type.result;
        deserilizationIndex = tmpCamera_type.endIndex;
        ByteResult<Integer> tmpPayloadPositionIndex = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.payloadPositionIndex = (Integer)tmpPayloadPositionIndex.result;
        deserilizationIndex = tmpPayloadPositionIndex.endIndex;
        ByteResult<Integer> tmpGimbal_port = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.gimbal_port = (Integer)tmpGimbal_port.result;
        deserilizationIndex = tmpGimbal_port.endIndex;
        return deserilizationIndex;
    }

    public Integer getCamera_type() {
        return this.camera_type;
    }

    public void setCamera_type(Integer camera_type) {
        this.camera_type = camera_type;
    }

    public Integer getPayloadPositionIndex() {
        return this.payloadPositionIndex;
    }

    public void setPayloadPositionIndex(Integer payloadPositionIndex) {
        this.payloadPositionIndex = payloadPositionIndex;
    }

    public Integer getGimbal_port() {
        return this.gimbal_port;
    }

    public void setGimbal_port(Integer gimbal_port) {
        this.gimbal_port = gimbal_port;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineActionAccurateShootPhotoDeviceInformation)) {
            return false;
        }
        WaylineActionAccurateShootPhotoDeviceInformation that = (WaylineActionAccurateShootPhotoDeviceInformation)o;
        return Objects.equals(this.camera_type, that.camera_type) && Objects.equals(this.payloadPositionIndex, that.payloadPositionIndex) && Objects.equals(this.gimbal_port, that.gimbal_port);
    }

    public int hashCode() {
        return Objects.hash(this.camera_type, this.payloadPositionIndex, this.gimbal_port);
    }
}

