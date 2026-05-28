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

public class LimitCircleAreaParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String uuid = "";
    String hash = "";
    WaylineLocationCoordinate3D center;
    Double radius = 0.0;

    public LimitCircleAreaParam() {
    }

    public LimitCircleAreaParam(String uuid, String hash, WaylineLocationCoordinate3D center, Double radius) {
        if (uuid != null) {
            this.uuid = uuid;
        }
        if (hash != null) {
            this.hash = hash;
        }
        if (center != null) {
            this.center = center;
        }
        if (radius != null) {
            this.radius = radius;
        }
    }

    public static LimitCircleAreaParam fromJson(String jsonString) {
        LimitCircleAreaParam tmpValueResult_ = new LimitCircleAreaParam();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.uuid = jsonObj.getString("uuid");
            tmpValueResult_.hash = jsonObj.getString("hash");
            tmpValueResult_.center = WaylineLocationCoordinate3D.fromJson(jsonObj.getJSONObject("center").toString());
            tmpValueResult_.radius = jsonObj.getDouble("radius");
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
            if (null != this.uuid) {
                json.put("uuid", (Object)this.uuid);
            }
            if (null != this.hash) {
                json.put("hash", (Object)this.hash);
            }
            if (null != this.center) {
                json.put("center", (Object)this.center.toJson());
            }
            if (null != this.radius) {
                json.put("radius", (Object)this.radius);
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
        serializedLength += ByteStreamHelper.stringGetLength(this.uuid);
        serializedLength += ByteStreamHelper.stringGetLength(this.hash);
        serializedLength += ByteStreamHelper.getLength(this.center, WaylineLocationCoordinate3D.class);
        return serializedLength += ByteStreamHelper.doubleGetLength(this.radius);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.stringToBytes(resultBytes, this.uuid, serializedIndex);
        serializedIndex = ByteStreamHelper.stringToBytes(resultBytes, this.hash, serializedIndex);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.center, serializedIndex, WaylineLocationCoordinate3D.class);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.radius, serializedIndex);
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
        ByteResult<String> tmpUuid = ByteStreamHelper.stringFromBytes(data, deserilizationIndex);
        this.uuid = (String)tmpUuid.result;
        deserilizationIndex = tmpUuid.endIndex;
        ByteResult<String> tmpHash = ByteStreamHelper.stringFromBytes(data, deserilizationIndex);
        this.hash = (String)tmpHash.result;
        deserilizationIndex = tmpHash.endIndex;
        ByteResult<WaylineLocationCoordinate3D> tmpCenter = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineLocationCoordinate3D.class);
        this.center = (WaylineLocationCoordinate3D)tmpCenter.result;
        deserilizationIndex = tmpCenter.endIndex;
        ByteResult<Double> tmpRadius = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.radius = (Double)tmpRadius.result;
        deserilizationIndex = tmpRadius.endIndex;
        return deserilizationIndex;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getHash() {
        return this.hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public WaylineLocationCoordinate3D getCenter() {
        return this.center;
    }

    public void setCenter(WaylineLocationCoordinate3D center) {
        this.center = center;
    }

    public Double getRadius() {
        return this.radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LimitCircleAreaParam)) {
            return false;
        }
        LimitCircleAreaParam that = (LimitCircleAreaParam)o;
        return Objects.equals(this.uuid, that.uuid) && Objects.equals(this.hash, that.hash) && Objects.equals(this.center, that.center) && Objects.equals(this.radius, that.radius);
    }

    public int hashCode() {
        return Objects.hash(this.uuid, this.hash, this.center, this.radius);
    }
}

