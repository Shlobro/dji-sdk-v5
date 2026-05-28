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
import dji.sdk.wpmz.value.mission.WaylineMappingPitchMode;
import java.util.Objects;
import org.json.JSONObject;

public class WaylineMappingGimbalParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WaylineMappingPitchMode pitchMode = WaylineMappingPitchMode.UNKNOWN;
    Double pitchAngle = 0.0;

    public WaylineMappingGimbalParam() {
    }

    public WaylineMappingGimbalParam(WaylineMappingPitchMode pitchMode, Double pitchAngle) {
        if (pitchMode != null) {
            this.pitchMode = pitchMode;
        }
        if (pitchAngle != null) {
            this.pitchAngle = pitchAngle;
        }
    }

    public static WaylineMappingGimbalParam fromJson(String jsonString) {
        WaylineMappingGimbalParam tmpValueResult_ = new WaylineMappingGimbalParam();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.pitchMode = WaylineMappingPitchMode.find(jsonObj.getInt("pitchMode"));
            tmpValueResult_.pitchAngle = jsonObj.getDouble("pitchAngle");
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
            if (null != this.pitchMode) {
                json.put("pitchMode", this.pitchMode.value());
            }
            if (null != this.pitchAngle) {
                json.put("pitchAngle", (Object)this.pitchAngle);
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
        serializedLength += ByteStreamHelper.integerGetLength(this.pitchMode.value());
        return serializedLength += ByteStreamHelper.doubleGetLength(this.pitchAngle);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.pitchMode.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.pitchAngle, serializedIndex);
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
        ByteResult<Integer> tmpPitchMode = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.pitchMode = WaylineMappingPitchMode.find((Integer)tmpPitchMode.result);
        deserilizationIndex = tmpPitchMode.endIndex;
        ByteResult<Double> tmpPitchAngle = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.pitchAngle = (Double)tmpPitchAngle.result;
        deserilizationIndex = tmpPitchAngle.endIndex;
        return deserilizationIndex;
    }

    public WaylineMappingPitchMode getPitchMode() {
        return this.pitchMode;
    }

    public void setPitchMode(WaylineMappingPitchMode pitchMode) {
        this.pitchMode = pitchMode;
    }

    public Double getPitchAngle() {
        return this.pitchAngle;
    }

    public void setPitchAngle(Double pitchAngle) {
        this.pitchAngle = pitchAngle;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineMappingGimbalParam)) {
            return false;
        }
        WaylineMappingGimbalParam that = (WaylineMappingGimbalParam)o;
        return Objects.equals(this.pitchMode, that.pitchMode) && Objects.equals(this.pitchAngle, that.pitchAngle);
    }

    public int hashCode() {
        return Objects.hash(this.pitchMode, this.pitchAngle);
    }
}

