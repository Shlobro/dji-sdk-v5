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

public class WaylineEulerAngle
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double roll = 0.0;
    Double pitch = 0.0;
    Double yaw = 0.0;

    public WaylineEulerAngle() {
    }

    public WaylineEulerAngle(Double roll, Double pitch, Double yaw) {
        if (roll != null) {
            this.roll = roll;
        }
        if (pitch != null) {
            this.pitch = pitch;
        }
        if (yaw != null) {
            this.yaw = yaw;
        }
    }

    public static WaylineEulerAngle fromJson(String jsonString) {
        WaylineEulerAngle tmpValueResult_ = new WaylineEulerAngle();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.roll = jsonObj.getDouble("roll");
            tmpValueResult_.pitch = jsonObj.getDouble("pitch");
            tmpValueResult_.yaw = jsonObj.getDouble("yaw");
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
            if (null != this.roll) {
                json.put("roll", (Object)this.roll);
            }
            if (null != this.pitch) {
                json.put("pitch", (Object)this.pitch);
            }
            if (null != this.yaw) {
                json.put("yaw", (Object)this.yaw);
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
        serializedLength += ByteStreamHelper.doubleGetLength(this.roll);
        serializedLength += ByteStreamHelper.doubleGetLength(this.pitch);
        return serializedLength += ByteStreamHelper.doubleGetLength(this.yaw);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.roll, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.pitch, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.yaw, serializedIndex);
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
        ByteResult<Double> tmpRoll = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.roll = (Double)tmpRoll.result;
        deserilizationIndex = tmpRoll.endIndex;
        ByteResult<Double> tmpPitch = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.pitch = (Double)tmpPitch.result;
        deserilizationIndex = tmpPitch.endIndex;
        ByteResult<Double> tmpYaw = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.yaw = (Double)tmpYaw.result;
        deserilizationIndex = tmpYaw.endIndex;
        return deserilizationIndex;
    }

    public Double getRoll() {
        return this.roll;
    }

    public void setRoll(Double roll) {
        this.roll = roll;
    }

    public Double getPitch() {
        return this.pitch;
    }

    public void setPitch(Double pitch) {
        this.pitch = pitch;
    }

    public Double getYaw() {
        return this.yaw;
    }

    public void setYaw(Double yaw) {
        this.yaw = yaw;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineEulerAngle)) {
            return false;
        }
        WaylineEulerAngle that = (WaylineEulerAngle)o;
        return Objects.equals(this.roll, that.roll) && Objects.equals(this.pitch, that.pitch) && Objects.equals(this.yaw, that.yaw);
    }

    public int hashCode() {
        return Objects.hash(this.roll, this.pitch, this.yaw);
    }
}

