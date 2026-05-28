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

public class WaylineCustomPayloadActionInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer actionType = 0;
    Integer actionIndex = 0;
    String actionName = "";
    Double maxParamValue = 0.0;
    Double minParamValue = 0.0;

    public WaylineCustomPayloadActionInfo() {
    }

    public WaylineCustomPayloadActionInfo(Integer actionType, Integer actionIndex, String actionName, Double maxParamValue, Double minParamValue) {
        if (actionType != null) {
            this.actionType = actionType;
        }
        if (actionIndex != null) {
            this.actionIndex = actionIndex;
        }
        if (actionName != null) {
            this.actionName = actionName;
        }
        if (maxParamValue != null) {
            this.maxParamValue = maxParamValue;
        }
        if (minParamValue != null) {
            this.minParamValue = minParamValue;
        }
    }

    public static WaylineCustomPayloadActionInfo fromJson(String jsonString) {
        WaylineCustomPayloadActionInfo tmpValueResult_ = new WaylineCustomPayloadActionInfo();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.actionType = jsonObj.getInt("actionType");
            tmpValueResult_.actionIndex = jsonObj.getInt("actionIndex");
            tmpValueResult_.actionName = jsonObj.getString("actionName");
            tmpValueResult_.maxParamValue = jsonObj.getDouble("maxParamValue");
            tmpValueResult_.minParamValue = jsonObj.getDouble("minParamValue");
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
            if (null != this.actionType) {
                json.put("actionType", (Object)this.actionType);
            }
            if (null != this.actionIndex) {
                json.put("actionIndex", (Object)this.actionIndex);
            }
            if (null != this.actionName) {
                json.put("actionName", (Object)this.actionName);
            }
            if (null != this.maxParamValue) {
                json.put("maxParamValue", (Object)this.maxParamValue);
            }
            if (null != this.minParamValue) {
                json.put("minParamValue", (Object)this.minParamValue);
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
        serializedLength += ByteStreamHelper.integerGetLength(this.actionType);
        serializedLength += ByteStreamHelper.integerGetLength(this.actionIndex);
        serializedLength += ByteStreamHelper.stringGetLength(this.actionName);
        serializedLength += ByteStreamHelper.doubleGetLength(this.maxParamValue);
        return serializedLength += ByteStreamHelper.doubleGetLength(this.minParamValue);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.actionType, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.actionIndex, serializedIndex);
        serializedIndex = ByteStreamHelper.stringToBytes(resultBytes, this.actionName, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.maxParamValue, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.minParamValue, serializedIndex);
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
        ByteResult<Integer> tmpActionType = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.actionType = (Integer)tmpActionType.result;
        deserilizationIndex = tmpActionType.endIndex;
        ByteResult<Integer> tmpActionIndex = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.actionIndex = (Integer)tmpActionIndex.result;
        deserilizationIndex = tmpActionIndex.endIndex;
        ByteResult<String> tmpActionName = ByteStreamHelper.stringFromBytes(data, deserilizationIndex);
        this.actionName = (String)tmpActionName.result;
        deserilizationIndex = tmpActionName.endIndex;
        ByteResult<Double> tmpMaxParamValue = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.maxParamValue = (Double)tmpMaxParamValue.result;
        deserilizationIndex = tmpMaxParamValue.endIndex;
        ByteResult<Double> tmpMinParamValue = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.minParamValue = (Double)tmpMinParamValue.result;
        deserilizationIndex = tmpMinParamValue.endIndex;
        return deserilizationIndex;
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

    public String getActionName() {
        return this.actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public Double getMaxParamValue() {
        return this.maxParamValue;
    }

    public void setMaxParamValue(Double maxParamValue) {
        this.maxParamValue = maxParamValue;
    }

    public Double getMinParamValue() {
        return this.minParamValue;
    }

    public void setMinParamValue(Double minParamValue) {
        this.minParamValue = minParamValue;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineCustomPayloadActionInfo)) {
            return false;
        }
        WaylineCustomPayloadActionInfo that = (WaylineCustomPayloadActionInfo)o;
        return Objects.equals(this.actionType, that.actionType) && Objects.equals(this.actionIndex, that.actionIndex) && Objects.equals(this.actionName, that.actionName) && Objects.equals(this.maxParamValue, that.maxParamValue) && Objects.equals(this.minParamValue, that.minParamValue);
    }

    public int hashCode() {
        return Objects.hash(this.actionType, this.actionIndex, this.actionName, this.maxParamValue, this.minParamValue);
    }
}

