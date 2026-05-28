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

public class WaylineActionSmartObliquePointInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double running_time = 0.0;
    Double stay_time = 0.0;
    Double euler_roll = 0.0;
    Double euler_pitch = 0.0;
    Double euler_yaw = 0.0;

    public WaylineActionSmartObliquePointInfo() {
    }

    public WaylineActionSmartObliquePointInfo(Double running_time, Double stay_time, Double euler_roll, Double euler_pitch, Double euler_yaw) {
        if (running_time != null) {
            this.running_time = running_time;
        }
        if (stay_time != null) {
            this.stay_time = stay_time;
        }
        if (euler_roll != null) {
            this.euler_roll = euler_roll;
        }
        if (euler_pitch != null) {
            this.euler_pitch = euler_pitch;
        }
        if (euler_yaw != null) {
            this.euler_yaw = euler_yaw;
        }
    }

    public static WaylineActionSmartObliquePointInfo fromJson(String jsonString) {
        WaylineActionSmartObliquePointInfo tmpValueResult_ = new WaylineActionSmartObliquePointInfo();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.running_time = jsonObj.getDouble("running_time");
            tmpValueResult_.stay_time = jsonObj.getDouble("stay_time");
            tmpValueResult_.euler_roll = jsonObj.getDouble("euler_roll");
            tmpValueResult_.euler_pitch = jsonObj.getDouble("euler_pitch");
            tmpValueResult_.euler_yaw = jsonObj.getDouble("euler_yaw");
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
            if (null != this.running_time) {
                json.put("running_time", (Object)this.running_time);
            }
            if (null != this.stay_time) {
                json.put("stay_time", (Object)this.stay_time);
            }
            if (null != this.euler_roll) {
                json.put("euler_roll", (Object)this.euler_roll);
            }
            if (null != this.euler_pitch) {
                json.put("euler_pitch", (Object)this.euler_pitch);
            }
            if (null != this.euler_yaw) {
                json.put("euler_yaw", (Object)this.euler_yaw);
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
        serializedLength += ByteStreamHelper.doubleGetLength(this.running_time);
        serializedLength += ByteStreamHelper.doubleGetLength(this.stay_time);
        serializedLength += ByteStreamHelper.doubleGetLength(this.euler_roll);
        serializedLength += ByteStreamHelper.doubleGetLength(this.euler_pitch);
        return serializedLength += ByteStreamHelper.doubleGetLength(this.euler_yaw);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.running_time, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.stay_time, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.euler_roll, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.euler_pitch, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.euler_yaw, serializedIndex);
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
        ByteResult<Double> tmpRunning_time = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.running_time = (Double)tmpRunning_time.result;
        deserilizationIndex = tmpRunning_time.endIndex;
        ByteResult<Double> tmpStay_time = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.stay_time = (Double)tmpStay_time.result;
        deserilizationIndex = tmpStay_time.endIndex;
        ByteResult<Double> tmpEuler_roll = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.euler_roll = (Double)tmpEuler_roll.result;
        deserilizationIndex = tmpEuler_roll.endIndex;
        ByteResult<Double> tmpEuler_pitch = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.euler_pitch = (Double)tmpEuler_pitch.result;
        deserilizationIndex = tmpEuler_pitch.endIndex;
        ByteResult<Double> tmpEuler_yaw = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.euler_yaw = (Double)tmpEuler_yaw.result;
        deserilizationIndex = tmpEuler_yaw.endIndex;
        return deserilizationIndex;
    }

    public Double getRunning_time() {
        return this.running_time;
    }

    public void setRunning_time(Double running_time) {
        this.running_time = running_time;
    }

    public Double getStay_time() {
        return this.stay_time;
    }

    public void setStay_time(Double stay_time) {
        this.stay_time = stay_time;
    }

    public Double getEuler_roll() {
        return this.euler_roll;
    }

    public void setEuler_roll(Double euler_roll) {
        this.euler_roll = euler_roll;
    }

    public Double getEuler_pitch() {
        return this.euler_pitch;
    }

    public void setEuler_pitch(Double euler_pitch) {
        this.euler_pitch = euler_pitch;
    }

    public Double getEuler_yaw() {
        return this.euler_yaw;
    }

    public void setEuler_yaw(Double euler_yaw) {
        this.euler_yaw = euler_yaw;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineActionSmartObliquePointInfo)) {
            return false;
        }
        WaylineActionSmartObliquePointInfo that = (WaylineActionSmartObliquePointInfo)o;
        return Objects.equals(this.running_time, that.running_time) && Objects.equals(this.stay_time, that.stay_time) && Objects.equals(this.euler_roll, that.euler_roll) && Objects.equals(this.euler_pitch, that.euler_pitch) && Objects.equals(this.euler_yaw, that.euler_yaw);
    }

    public int hashCode() {
        return Objects.hash(this.running_time, this.stay_time, this.euler_roll, this.euler_pitch, this.euler_yaw);
    }
}

