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

public class ActionPSDKParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer payloadPositionIndex = 0;
    Integer actionType = 0;
    Integer actionIndex = 0;
    Double actionParam = 0.0;

    public ActionPSDKParam() {
    }

    public ActionPSDKParam(Integer payloadPositionIndex, Integer actionType, Integer actionIndex, Double actionParam) {
        if (payloadPositionIndex != null) {
            this.payloadPositionIndex = payloadPositionIndex;
        }
        if (actionType != null) {
            this.actionType = actionType;
        }
        if (actionIndex != null) {
            this.actionIndex = actionIndex;
        }
        if (actionParam != null) {
            this.actionParam = actionParam;
        }
    }

    public static ActionPSDKParam fromJson(String jsonString) {
        ActionPSDKParam tmpValueResult_ = new ActionPSDKParam();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.payloadPositionIndex = jsonObj.getInt("payloadPositionIndex");
            tmpValueResult_.actionType = jsonObj.getInt("actionType");
            tmpValueResult_.actionIndex = jsonObj.getInt("actionIndex");
            tmpValueResult_.actionParam = jsonObj.getDouble("actionParam");
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
            if (null != this.actionType) {
                json.put("actionType", (Object)this.actionType);
            }
            if (null != this.actionIndex) {
                json.put("actionIndex", (Object)this.actionIndex);
            }
            if (null != this.actionParam) {
                json.put("actionParam", (Object)this.actionParam);
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
        serializedLength += ByteStreamHelper.integerGetLength(this.actionType);
        serializedLength += ByteStreamHelper.integerGetLength(this.actionIndex);
        return serializedLength += ByteStreamHelper.doubleGetLength(this.actionParam);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.payloadPositionIndex, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.actionType, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.actionIndex, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.actionParam, serializedIndex);
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
        ByteResult<Integer> tmpActionType = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.actionType = (Integer)tmpActionType.result;
        deserilizationIndex = tmpActionType.endIndex;
        ByteResult<Integer> tmpActionIndex = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.actionIndex = (Integer)tmpActionIndex.result;
        deserilizationIndex = tmpActionIndex.endIndex;
        ByteResult<Double> tmpActionParam = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.actionParam = (Double)tmpActionParam.result;
        deserilizationIndex = tmpActionParam.endIndex;
        return deserilizationIndex;
    }

    public Integer getPayloadPositionIndex() {
        return this.payloadPositionIndex;
    }

    public void setPayloadPositionIndex(Integer payloadPositionIndex) {
        this.payloadPositionIndex = payloadPositionIndex;
    }

    public Integer getActionType() {
        return this.actionType;
    }

    public void setActionType(Integer actionType) {
        this.actionType = actionType;
    }

    public Integer getActionIndex() {
        return this.actionIndex;
    }

    public void setActionIndex(Integer actionIndex) {
        this.actionIndex = actionIndex;
    }

    public Double getActionParam() {
        return this.actionParam;
    }

    public void setActionParam(Double actionParam) {
        this.actionParam = actionParam;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActionPSDKParam)) {
            return false;
        }
        ActionPSDKParam that = (ActionPSDKParam)o;
        return Objects.equals(this.payloadPositionIndex, that.payloadPositionIndex) && Objects.equals(this.actionType, that.actionType) && Objects.equals(this.actionIndex, that.actionIndex) && Objects.equals(this.actionParam, that.actionParam);
    }

    public int hashCode() {
        return Objects.hash(this.payloadPositionIndex, this.actionType, this.actionIndex, this.actionParam);
    }
}

