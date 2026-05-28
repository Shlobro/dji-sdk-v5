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
import dji.sdk.wpmz.value.mission.WaylineMappingYawMode;
import java.util.Objects;
import org.json.JSONObject;

public class WaylineMappingYawParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WaylineMappingYawMode yawMode = WaylineMappingYawMode.UNKNOWN;
    Double yawAngle = 0.0;

    public WaylineMappingYawParam() {
    }

    public WaylineMappingYawParam(WaylineMappingYawMode yawMode, Double yawAngle) {
        if (yawMode != null) {
            this.yawMode = yawMode;
        }
        if (yawAngle != null) {
            this.yawAngle = yawAngle;
        }
    }

    public static WaylineMappingYawParam fromJson(String jsonString) {
        WaylineMappingYawParam tmpValueResult_ = new WaylineMappingYawParam();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.yawMode = WaylineMappingYawMode.find(jsonObj.getInt("yawMode"));
            tmpValueResult_.yawAngle = jsonObj.getDouble("yawAngle");
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
            if (null != this.yawMode) {
                json.put("yawMode", this.yawMode.value());
            }
            if (null != this.yawAngle) {
                json.put("yawAngle", (Object)this.yawAngle);
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
        serializedLength += ByteStreamHelper.integerGetLength(this.yawMode.value());
        return serializedLength += ByteStreamHelper.doubleGetLength(this.yawAngle);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.yawMode.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.yawAngle, serializedIndex);
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
        ByteResult<Integer> tmpYawMode = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.yawMode = WaylineMappingYawMode.find((Integer)tmpYawMode.result);
        deserilizationIndex = tmpYawMode.endIndex;
        ByteResult<Double> tmpYawAngle = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.yawAngle = (Double)tmpYawAngle.result;
        deserilizationIndex = tmpYawAngle.endIndex;
        return deserilizationIndex;
    }

    public WaylineMappingYawMode getYawMode() {
        return this.yawMode;
    }

    public void setYawMode(WaylineMappingYawMode yawMode) {
        this.yawMode = yawMode;
    }

    public Double getYawAngle() {
        return this.yawAngle;
    }

    public void setYawAngle(Double yawAngle) {
        this.yawAngle = yawAngle;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineMappingYawParam)) {
            return false;
        }
        WaylineMappingYawParam that = (WaylineMappingYawParam)o;
        return Objects.equals(this.yawMode, that.yawMode) && Objects.equals(this.yawAngle, that.yawAngle);
    }

    public int hashCode() {
        return Objects.hash(this.yawMode, this.yawAngle);
    }
}

