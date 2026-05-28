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
import dji.sdk.wpmz.value.mission.WaylineMappingGimbalParam;
import dji.sdk.wpmz.value.mission.WaylineMappingYawParam;
import java.util.Objects;
import org.json.JSONObject;

public class WaylineMappingCameraAngleParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WaylineMappingYawParam yawParam;
    WaylineMappingGimbalParam gimbalParam;

    public WaylineMappingCameraAngleParam() {
    }

    public WaylineMappingCameraAngleParam(WaylineMappingYawParam yawParam, WaylineMappingGimbalParam gimbalParam) {
        if (yawParam != null) {
            this.yawParam = yawParam;
        }
        if (gimbalParam != null) {
            this.gimbalParam = gimbalParam;
        }
    }

    public static WaylineMappingCameraAngleParam fromJson(String jsonString) {
        WaylineMappingCameraAngleParam tmpValueResult_ = new WaylineMappingCameraAngleParam();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.yawParam = WaylineMappingYawParam.fromJson(jsonObj.getJSONObject("yawParam").toString());
            tmpValueResult_.gimbalParam = WaylineMappingGimbalParam.fromJson(jsonObj.getJSONObject("gimbalParam").toString());
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
            if (null != this.yawParam) {
                json.put("yawParam", (Object)this.yawParam.toJson());
            }
            if (null != this.gimbalParam) {
                json.put("gimbalParam", (Object)this.gimbalParam.toJson());
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
        serializedLength += ByteStreamHelper.getLength(this.yawParam, WaylineMappingYawParam.class);
        return serializedLength += ByteStreamHelper.getLength(this.gimbalParam, WaylineMappingGimbalParam.class);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.yawParam, serializedIndex, WaylineMappingYawParam.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.gimbalParam, serializedIndex, WaylineMappingGimbalParam.class);
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
        ByteResult<WaylineMappingYawParam> tmpYawParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineMappingYawParam.class);
        this.yawParam = (WaylineMappingYawParam)tmpYawParam.result;
        deserilizationIndex = tmpYawParam.endIndex;
        ByteResult<WaylineMappingGimbalParam> tmpGimbalParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineMappingGimbalParam.class);
        this.gimbalParam = (WaylineMappingGimbalParam)tmpGimbalParam.result;
        deserilizationIndex = tmpGimbalParam.endIndex;
        return deserilizationIndex;
    }

    public WaylineMappingYawParam getYawParam() {
        return this.yawParam;
    }

    public void setYawParam(WaylineMappingYawParam yawParam) {
        this.yawParam = yawParam;
    }

    public WaylineMappingGimbalParam getGimbalParam() {
        return this.gimbalParam;
    }

    public void setGimbalParam(WaylineMappingGimbalParam gimbalParam) {
        this.gimbalParam = gimbalParam;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineMappingCameraAngleParam)) {
            return false;
        }
        WaylineMappingCameraAngleParam that = (WaylineMappingCameraAngleParam)o;
        return Objects.equals(this.yawParam, that.yawParam) && Objects.equals(this.gimbalParam, that.gimbalParam);
    }

    public int hashCode() {
        return Objects.hash(this.yawParam, this.gimbalParam);
    }
}

