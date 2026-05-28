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
import dji.sdk.wpmz.value.mission.WaylineActionSearchlightOperateType;
import java.util.Objects;
import org.json.JSONObject;

public class ActionSearchlightParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String actionUUID = "";
    Integer payloadPositionIndex = 0;
    WaylineActionSearchlightOperateType searchlightOperateType = WaylineActionSearchlightOperateType.UNKNOWN;
    Integer brightness = 0;

    public ActionSearchlightParam() {
    }

    public ActionSearchlightParam(String actionUUID, Integer payloadPositionIndex, WaylineActionSearchlightOperateType searchlightOperateType, Integer brightness) {
        if (actionUUID != null) {
            this.actionUUID = actionUUID;
        }
        if (payloadPositionIndex != null) {
            this.payloadPositionIndex = payloadPositionIndex;
        }
        if (searchlightOperateType != null) {
            this.searchlightOperateType = searchlightOperateType;
        }
        if (brightness != null) {
            this.brightness = brightness;
        }
    }

    public static ActionSearchlightParam fromJson(String jsonString) {
        ActionSearchlightParam tmpValueResult_ = new ActionSearchlightParam();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.actionUUID = jsonObj.getString("actionUUID");
            tmpValueResult_.payloadPositionIndex = jsonObj.getInt("payloadPositionIndex");
            tmpValueResult_.searchlightOperateType = WaylineActionSearchlightOperateType.find(jsonObj.getInt("searchlightOperateType"));
            tmpValueResult_.brightness = jsonObj.getInt("brightness");
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
            if (null != this.payloadPositionIndex) {
                json.put("payloadPositionIndex", (Object)this.payloadPositionIndex);
            }
            if (null != this.searchlightOperateType) {
                json.put("searchlightOperateType", this.searchlightOperateType.value());
            }
            if (null != this.brightness) {
                json.put("brightness", (Object)this.brightness);
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
        serializedLength += ByteStreamHelper.integerGetLength(this.payloadPositionIndex);
        serializedLength += ByteStreamHelper.integerGetLength(this.searchlightOperateType.value());
        return serializedLength += ByteStreamHelper.integerGetLength(this.brightness);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.stringToBytes(resultBytes, this.actionUUID, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.payloadPositionIndex, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.searchlightOperateType.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.brightness, serializedIndex);
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
        ByteResult<Integer> tmpPayloadPositionIndex = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.payloadPositionIndex = (Integer)tmpPayloadPositionIndex.result;
        deserilizationIndex = tmpPayloadPositionIndex.endIndex;
        ByteResult<Integer> tmpSearchlightOperateType = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.searchlightOperateType = WaylineActionSearchlightOperateType.find((Integer)tmpSearchlightOperateType.result);
        deserilizationIndex = tmpSearchlightOperateType.endIndex;
        ByteResult<Integer> tmpBrightness = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.brightness = (Integer)tmpBrightness.result;
        deserilizationIndex = tmpBrightness.endIndex;
        return deserilizationIndex;
    }

    public String getActionUUID() {
        return this.actionUUID;
    }

    public void setActionUUID(String actionUUID) {
        this.actionUUID = actionUUID;
    }

    public Integer getPayloadPositionIndex() {
        return this.payloadPositionIndex;
    }

    public void setPayloadPositionIndex(Integer payloadPositionIndex) {
        this.payloadPositionIndex = payloadPositionIndex;
    }

    public WaylineActionSearchlightOperateType getSearchlightOperateType() {
        return this.searchlightOperateType;
    }

    public void setSearchlightOperateType(WaylineActionSearchlightOperateType searchlightOperateType) {
        this.searchlightOperateType = searchlightOperateType;
    }

    public Integer getBrightness() {
        return this.brightness;
    }

    public void setBrightness(Integer brightness) {
        this.brightness = brightness;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActionSearchlightParam)) {
            return false;
        }
        ActionSearchlightParam that = (ActionSearchlightParam)o;
        return Objects.equals(this.actionUUID, that.actionUUID) && Objects.equals(this.payloadPositionIndex, that.payloadPositionIndex) && Objects.equals(this.searchlightOperateType, that.searchlightOperateType) && Objects.equals(this.brightness, that.brightness);
    }

    public int hashCode() {
        return Objects.hash(this.actionUUID, this.payloadPositionIndex, this.searchlightOperateType, this.brightness);
    }
}

