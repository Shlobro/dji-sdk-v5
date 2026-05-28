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

public class WaylineActionOrientedPhotoGimbalStateInformation
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double pitch = 0.0;
    Double roll = 0.0;
    Double yaw = 0.0;

    public WaylineActionOrientedPhotoGimbalStateInformation() {
    }

    public WaylineActionOrientedPhotoGimbalStateInformation(Double pitch, Double roll, Double yaw) {
        if (pitch != null) {
            this.pitch = pitch;
        }
        if (roll != null) {
            this.roll = roll;
        }
        if (yaw != null) {
            this.yaw = yaw;
        }
    }

    public static WaylineActionOrientedPhotoGimbalStateInformation fromJson(String jsonString) {
        WaylineActionOrientedPhotoGimbalStateInformation tmpValueResult_ = new WaylineActionOrientedPhotoGimbalStateInformation();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.pitch = jsonObj.getDouble("pitch");
            tmpValueResult_.roll = jsonObj.getDouble("roll");
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
            if (null != this.pitch) {
                json.put("pitch", (Object)this.pitch);
            }
            if (null != this.roll) {
                json.put("roll", (Object)this.roll);
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
        serializedLength += ByteStreamHelper.doubleGetLength(this.pitch);
        serializedLength += ByteStreamHelper.doubleGetLength(this.roll);
        return serializedLength += ByteStreamHelper.doubleGetLength(this.yaw);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.pitch, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.roll, serializedIndex);
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
        ByteResult<Double> tmpPitch = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.pitch = (Double)tmpPitch.result;
        deserilizationIndex = tmpPitch.endIndex;
        ByteResult<Double> tmpRoll = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.roll = (Double)tmpRoll.result;
        deserilizationIndex = tmpRoll.endIndex;
        ByteResult<Double> tmpYaw = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.yaw = (Double)tmpYaw.result;
        deserilizationIndex = tmpYaw.endIndex;
        return deserilizationIndex;
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
        if (!(o instanceof WaylineActionOrientedPhotoGimbalStateInformation)) {
            return false;
        }
        WaylineActionOrientedPhotoGimbalStateInformation that = (WaylineActionOrientedPhotoGimbalStateInformation)o;
        return Objects.equals(this.pitch, that.pitch) && Objects.equals(this.roll, that.roll) && Objects.equals(this.yaw, that.yaw);
    }

    public int hashCode() {
        return Objects.hash(this.pitch, this.roll, this.yaw);
    }
}

