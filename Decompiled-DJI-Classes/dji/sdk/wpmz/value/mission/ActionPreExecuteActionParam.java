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

public class ActionPreExecuteActionParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer payloadPositionIndex = 0;
    Double gimbalPitchRotateAngle = 0.0;
    Double gimbalRollRotateAngle = 0.0;
    Double gimbalYawRotateAngle = 0.0;
    Double heading = 0.0;

    public ActionPreExecuteActionParam() {
    }

    public ActionPreExecuteActionParam(Integer payloadPositionIndex, Double gimbalPitchRotateAngle, Double gimbalRollRotateAngle, Double gimbalYawRotateAngle, Double heading) {
        if (payloadPositionIndex != null) {
            this.payloadPositionIndex = payloadPositionIndex;
        }
        if (gimbalPitchRotateAngle != null) {
            this.gimbalPitchRotateAngle = gimbalPitchRotateAngle;
        }
        if (gimbalRollRotateAngle != null) {
            this.gimbalRollRotateAngle = gimbalRollRotateAngle;
        }
        if (gimbalYawRotateAngle != null) {
            this.gimbalYawRotateAngle = gimbalYawRotateAngle;
        }
        if (heading != null) {
            this.heading = heading;
        }
    }

    public static ActionPreExecuteActionParam fromJson(String jsonString) {
        ActionPreExecuteActionParam tmpValueResult_ = new ActionPreExecuteActionParam();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.payloadPositionIndex = jsonObj.getInt("payloadPositionIndex");
            tmpValueResult_.gimbalPitchRotateAngle = jsonObj.getDouble("gimbalPitchRotateAngle");
            tmpValueResult_.gimbalRollRotateAngle = jsonObj.getDouble("gimbalRollRotateAngle");
            tmpValueResult_.gimbalYawRotateAngle = jsonObj.getDouble("gimbalYawRotateAngle");
            tmpValueResult_.heading = jsonObj.getDouble("heading");
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
            if (null != this.gimbalPitchRotateAngle) {
                json.put("gimbalPitchRotateAngle", (Object)this.gimbalPitchRotateAngle);
            }
            if (null != this.gimbalRollRotateAngle) {
                json.put("gimbalRollRotateAngle", (Object)this.gimbalRollRotateAngle);
            }
            if (null != this.gimbalYawRotateAngle) {
                json.put("gimbalYawRotateAngle", (Object)this.gimbalYawRotateAngle);
            }
            if (null != this.heading) {
                json.put("heading", (Object)this.heading);
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
        serializedLength += ByteStreamHelper.doubleGetLength(this.gimbalPitchRotateAngle);
        serializedLength += ByteStreamHelper.doubleGetLength(this.gimbalRollRotateAngle);
        serializedLength += ByteStreamHelper.doubleGetLength(this.gimbalYawRotateAngle);
        return serializedLength += ByteStreamHelper.doubleGetLength(this.heading);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.payloadPositionIndex, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.gimbalPitchRotateAngle, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.gimbalRollRotateAngle, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.gimbalYawRotateAngle, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.heading, serializedIndex);
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
        ByteResult<Double> tmpGimbalPitchRotateAngle = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.gimbalPitchRotateAngle = (Double)tmpGimbalPitchRotateAngle.result;
        deserilizationIndex = tmpGimbalPitchRotateAngle.endIndex;
        ByteResult<Double> tmpGimbalRollRotateAngle = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.gimbalRollRotateAngle = (Double)tmpGimbalRollRotateAngle.result;
        deserilizationIndex = tmpGimbalRollRotateAngle.endIndex;
        ByteResult<Double> tmpGimbalYawRotateAngle = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.gimbalYawRotateAngle = (Double)tmpGimbalYawRotateAngle.result;
        deserilizationIndex = tmpGimbalYawRotateAngle.endIndex;
        ByteResult<Double> tmpHeading = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.heading = (Double)tmpHeading.result;
        deserilizationIndex = tmpHeading.endIndex;
        return deserilizationIndex;
    }

    public Integer getPayloadPositionIndex() {
        return this.payloadPositionIndex;
    }

    public void setPayloadPositionIndex(Integer payloadPositionIndex) {
        this.payloadPositionIndex = payloadPositionIndex;
    }

    public Double getGimbalPitchRotateAngle() {
        return this.gimbalPitchRotateAngle;
    }

    public void setGimbalPitchRotateAngle(Double gimbalPitchRotateAngle) {
        this.gimbalPitchRotateAngle = gimbalPitchRotateAngle;
    }

    public Double getGimbalRollRotateAngle() {
        return this.gimbalRollRotateAngle;
    }

    public void setGimbalRollRotateAngle(Double gimbalRollRotateAngle) {
        this.gimbalRollRotateAngle = gimbalRollRotateAngle;
    }

    public Double getGimbalYawRotateAngle() {
        return this.gimbalYawRotateAngle;
    }

    public void setGimbalYawRotateAngle(Double gimbalYawRotateAngle) {
        this.gimbalYawRotateAngle = gimbalYawRotateAngle;
    }

    public Double getHeading() {
        return this.heading;
    }

    public void setHeading(Double heading) {
        this.heading = heading;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActionPreExecuteActionParam)) {
            return false;
        }
        ActionPreExecuteActionParam that = (ActionPreExecuteActionParam)o;
        return Objects.equals(this.payloadPositionIndex, that.payloadPositionIndex) && Objects.equals(this.gimbalPitchRotateAngle, that.gimbalPitchRotateAngle) && Objects.equals(this.gimbalRollRotateAngle, that.gimbalRollRotateAngle) && Objects.equals(this.gimbalYawRotateAngle, that.gimbalYawRotateAngle) && Objects.equals(this.heading, that.heading);
    }

    public int hashCode() {
        return Objects.hash(this.payloadPositionIndex, this.gimbalPitchRotateAngle, this.gimbalRollRotateAngle, this.gimbalYawRotateAngle, this.heading);
    }
}

