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
import dji.sdk.wpmz.value.mission.WaylineLocationCoordinate3D;
import java.util.Objects;
import org.json.JSONObject;

public class CameraLookAtInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WaylineLocationCoordinate3D coordinates;
    Double yaw = 0.0;
    Double pitch = 0.0;
    Double roll = 0.0;

    public CameraLookAtInfo() {
    }

    public CameraLookAtInfo(WaylineLocationCoordinate3D coordinates, Double yaw, Double pitch, Double roll) {
        if (coordinates != null) {
            this.coordinates = coordinates;
        }
        if (yaw != null) {
            this.yaw = yaw;
        }
        if (pitch != null) {
            this.pitch = pitch;
        }
        if (roll != null) {
            this.roll = roll;
        }
    }

    public static CameraLookAtInfo fromJson(String jsonString) {
        CameraLookAtInfo tmpValueResult_ = new CameraLookAtInfo();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.coordinates = WaylineLocationCoordinate3D.fromJson(jsonObj.getJSONObject("coordinates").toString());
            tmpValueResult_.yaw = jsonObj.getDouble("yaw");
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
            if (null != this.coordinates) {
                json.put("coordinates", (Object)this.coordinates.toJson());
            }
            if (null != this.yaw) {
                json.put("yaw", (Object)this.yaw);
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
        serializedLength += ByteStreamHelper.getLength(this.coordinates, WaylineLocationCoordinate3D.class);
        serializedLength += ByteStreamHelper.doubleGetLength(this.yaw);
        serializedLength += ByteStreamHelper.doubleGetLength(this.pitch);
        return serializedLength += ByteStreamHelper.doubleGetLength(this.roll);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.coordinates, serializedIndex, WaylineLocationCoordinate3D.class);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.yaw, serializedIndex);
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
        ByteResult<WaylineLocationCoordinate3D> tmpCoordinates = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineLocationCoordinate3D.class);
        this.coordinates = (WaylineLocationCoordinate3D)tmpCoordinates.result;
        deserilizationIndex = tmpCoordinates.endIndex;
        ByteResult<Double> tmpYaw = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.yaw = (Double)tmpYaw.result;
        deserilizationIndex = tmpYaw.endIndex;
        ByteResult<Double> tmpPitch = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.pitch = (Double)tmpPitch.result;
        deserilizationIndex = tmpPitch.endIndex;
        ByteResult<Double> tmpRoll = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.roll = (Double)tmpRoll.result;
        deserilizationIndex = tmpRoll.endIndex;
        return deserilizationIndex;
    }

    public WaylineLocationCoordinate3D getCoordinates() {
        return this.coordinates;
    }

    public void setCoordinates(WaylineLocationCoordinate3D coordinates) {
        this.coordinates = coordinates;
    }

    public Double getYaw() {
        return this.yaw;
    }

    public void setYaw(Double yaw) {
        this.yaw = yaw;
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
        if (!(o instanceof CameraLookAtInfo)) {
            return false;
        }
        CameraLookAtInfo that = (CameraLookAtInfo)o;
        return Objects.equals(this.coordinates, that.coordinates) && Objects.equals(this.yaw, that.yaw) && Objects.equals(this.pitch, that.pitch) && Objects.equals(this.roll, that.roll);
    }

    public int hashCode() {
        return Objects.hash(this.coordinates, this.yaw, this.pitch, this.roll);
    }
}

