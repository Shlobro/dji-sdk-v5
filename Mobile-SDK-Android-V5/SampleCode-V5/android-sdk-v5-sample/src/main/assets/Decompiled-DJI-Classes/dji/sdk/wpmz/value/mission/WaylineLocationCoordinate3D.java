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

public class WaylineLocationCoordinate3D
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double latitude = 0.0;
    Double longitude = 0.0;
    Double altitude = 0.0;

    public WaylineLocationCoordinate3D() {
    }

    public WaylineLocationCoordinate3D(Double latitude, Double longitude, Double altitude) {
        if (latitude != null) {
            this.latitude = latitude;
        }
        if (longitude != null) {
            this.longitude = longitude;
        }
        if (altitude != null) {
            this.altitude = altitude;
        }
    }

    public static WaylineLocationCoordinate3D fromJson(String jsonString) {
        WaylineLocationCoordinate3D tmpValueResult_ = new WaylineLocationCoordinate3D();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.latitude = jsonObj.getDouble("latitude");
            tmpValueResult_.longitude = jsonObj.getDouble("longitude");
            tmpValueResult_.altitude = jsonObj.getDouble("altitude");
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
            if (null != this.latitude) {
                json.put("latitude", (Object)this.latitude);
            }
            if (null != this.longitude) {
                json.put("longitude", (Object)this.longitude);
            }
            if (null != this.altitude) {
                json.put("altitude", (Object)this.altitude);
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
        serializedLength += ByteStreamHelper.doubleGetLength(this.latitude);
        serializedLength += ByteStreamHelper.doubleGetLength(this.longitude);
        return serializedLength += ByteStreamHelper.doubleGetLength(this.altitude);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.latitude, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.longitude, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.altitude, serializedIndex);
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
        ByteResult<Double> tmpLatitude = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.latitude = (Double)tmpLatitude.result;
        deserilizationIndex = tmpLatitude.endIndex;
        ByteResult<Double> tmpLongitude = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.longitude = (Double)tmpLongitude.result;
        deserilizationIndex = tmpLongitude.endIndex;
        ByteResult<Double> tmpAltitude = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.altitude = (Double)tmpAltitude.result;
        deserilizationIndex = tmpAltitude.endIndex;
        return deserilizationIndex;
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getAltitude() {
        return this.altitude;
    }

    public void setAltitude(Double altitude) {
        this.altitude = altitude;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineLocationCoordinate3D)) {
            return false;
        }
        WaylineLocationCoordinate3D that = (WaylineLocationCoordinate3D)o;
        return Objects.equals(this.latitude, that.latitude) && Objects.equals(this.longitude, that.longitude) && Objects.equals(this.altitude, that.altitude);
    }

    public int hashCode() {
        return Objects.hash(this.latitude, this.longitude, this.altitude);
    }
}

