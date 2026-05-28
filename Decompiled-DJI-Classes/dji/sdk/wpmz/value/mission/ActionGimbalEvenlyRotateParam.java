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

public class ActionGimbalEvenlyRotateParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer payloadPositionIndex = 0;
    Double pitch = 0.0;
    Double roll = 0.0;

    public ActionGimbalEvenlyRotateParam() {
    }

    public ActionGimbalEvenlyRotateParam(Integer payloadPositionIndex, Double pitch, Double roll) {
        if (payloadPositionIndex != null) {
            this.payloadPositionIndex = payloadPositionIndex;
        }
        if (pitch != null) {
            this.pitch = pitch;
        }
        if (roll != null) {
            this.roll = roll;
        }
    }

    public static ActionGimbalEvenlyRotateParam fromJson(String jsonString) {
        ActionGimbalEvenlyRotateParam tmpValueResult_ = new ActionGimbalEvenlyRotateParam();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.payloadPositionIndex = jsonObj.getInt("payloadPositionIndex");
            tmpValueResult_.pitch = jsonObj.getDouble("pitch");
            tmpValueResult_.roll = jsonObj.getDouble("roll");
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
            if (null != this.pitch) {
                json.put("pitch", (Object)this.pitch);
            }
            if (null != this.roll) {
                json.put("roll", (Object)this.roll);
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
        serializedLength += ByteStreamHelper.doubleGetLength(this.pitch);
        return serializedLength += ByteStreamHelper.doubleGetLength(this.roll);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.payloadPositionIndex, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.pitch, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.roll, serializedIndex);
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
        ByteResult<Double> tmpPitch = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.pitch = (Double)tmpPitch.result;
        deserilizationIndex = tmpPitch.endIndex;
        ByteResult<Double> tmpRoll = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.roll = (Double)tmpRoll.result;
        deserilizationIndex = tmpRoll.endIndex;
        return deserilizationIndex;
    }

    public Integer getPayloadPositionIndex() {
        return this.payloadPositionIndex;
    }

    public void setPayloadPositionIndex(Integer payloadPositionIndex) {
        this.payloadPositionIndex = payloadPositionIndex;
    }

    public Double getPitch() {
        return this.pitch;
    }

    public void setPitch(Double pitch) {
        this.pitch = pitch;
    }

    public Double getRoll() {
        return this.roll;
    }

    public void setRoll(Double roll) {
        this.roll = roll;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActionGimbalEvenlyRotateParam)) {
            return false;
        }
        ActionGimbalEvenlyRotateParam that = (ActionGimbalEvenlyRotateParam)o;
        return Objects.equals(this.payloadPositionIndex, that.payloadPositionIndex) && Objects.equals(this.pitch, that.pitch) && Objects.equals(this.roll, that.roll);
    }

    public int hashCode() {
        return Objects.hash(this.payloadPositionIndex, this.pitch, this.roll);
    }
}

