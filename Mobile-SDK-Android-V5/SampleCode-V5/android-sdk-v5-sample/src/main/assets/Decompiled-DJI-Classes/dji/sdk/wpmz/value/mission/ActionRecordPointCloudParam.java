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
import dji.sdk.wpmz.value.mission.WaylineActionRecordPointCloudOperateType;
import java.util.Objects;
import org.json.JSONObject;

public class ActionRecordPointCloudParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer payloadPositionIndex = 0;
    WaylineActionRecordPointCloudOperateType pointCloudOperateType = WaylineActionRecordPointCloudOperateType.UNKNOWN;

    public ActionRecordPointCloudParam() {
    }

    public ActionRecordPointCloudParam(Integer payloadPositionIndex, WaylineActionRecordPointCloudOperateType pointCloudOperateType) {
        if (payloadPositionIndex != null) {
            this.payloadPositionIndex = payloadPositionIndex;
        }
        if (pointCloudOperateType != null) {
            this.pointCloudOperateType = pointCloudOperateType;
        }
    }

    public static ActionRecordPointCloudParam fromJson(String jsonString) {
        ActionRecordPointCloudParam tmpValueResult_ = new ActionRecordPointCloudParam();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.payloadPositionIndex = jsonObj.getInt("payloadPositionIndex");
            tmpValueResult_.pointCloudOperateType = WaylineActionRecordPointCloudOperateType.find(jsonObj.getInt("pointCloudOperateType"));
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
            if (null != this.payloadPositionIndex) {
                json.put("payloadPositionIndex", (Object)this.payloadPositionIndex);
            }
            if (null != this.pointCloudOperateType) {
                json.put("pointCloudOperateType", this.pointCloudOperateType.value());
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
        serializedLength += ByteStreamHelper.integerGetLength(this.payloadPositionIndex);
        return serializedLength += ByteStreamHelper.integerGetLength(this.pointCloudOperateType.value());
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.payloadPositionIndex, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.pointCloudOperateType.value(), serializedIndex);
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
        ByteResult<Integer> tmpPayloadPositionIndex = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.payloadPositionIndex = (Integer)tmpPayloadPositionIndex.result;
        deserilizationIndex = tmpPayloadPositionIndex.endIndex;
        ByteResult<Integer> tmpPointCloudOperateType = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.pointCloudOperateType = WaylineActionRecordPointCloudOperateType.find((Integer)tmpPointCloudOperateType.result);
        deserilizationIndex = tmpPointCloudOperateType.endIndex;
        return deserilizationIndex;
    }

    public Integer getPayloadPositionIndex() {
        return this.payloadPositionIndex;
    }

    public void setPayloadPositionIndex(Integer payloadPositionIndex) {
        this.payloadPositionIndex = payloadPositionIndex;
    }

    public WaylineActionRecordPointCloudOperateType getPointCloudOperateType() {
        return this.pointCloudOperateType;
    }

    public void setPointCloudOperateType(WaylineActionRecordPointCloudOperateType pointCloudOperateType) {
        this.pointCloudOperateType = pointCloudOperateType;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActionRecordPointCloudParam)) {
            return false;
        }
        ActionRecordPointCloudParam that = (ActionRecordPointCloudParam)o;
        return Objects.equals(this.payloadPositionIndex, that.payloadPositionIndex) && Objects.equals(this.pointCloudOperateType, that.pointCloudOperateType);
    }

    public int hashCode() {
        return Objects.hash(this.payloadPositionIndex, this.pointCloudOperateType);
    }
}

