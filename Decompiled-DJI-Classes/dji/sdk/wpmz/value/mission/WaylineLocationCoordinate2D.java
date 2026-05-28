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

public class WaylineLocationCoordinate2D
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double latitude = 0.0;
    Double longitude = 0.0;

    public WaylineLocationCoordinate2D() {
    }

    public WaylineLocationCoordinate2D(Double latitude, Double longitude) {
        if (latitude != null) {
            this.latitude = latitude;
        }
        if (longitude != null) {
            this.longitude = longitude;
        }
    }

    public static WaylineLocationCoordinate2D fromJson(String jsonString) {
        WaylineLocationCoordinate2D tmpValueResult_ = new WaylineLocationCoordinate2D();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.latitude = jsonObj.getDouble("latitude");
            tmpValueResult_.longitude = jsonObj.getDouble("longitude");
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
        return serializedLength += ByteStreamHelper.doubleGetLength(this.longitude);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.latitude, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.longitude, serializedIndex);
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

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineLocationCoordinate2D)) {
            return false;
        }
        WaylineLocationCoordinate2D that = (WaylineLocationCoordinate2D)o;
        return Objects.equals(this.latitude, that.latitude) && Objects.equals(this.longitude, that.longitude);
    }

    public int hashCode() {
        return Objects.hash(this.latitude, this.longitude);
    }
}

