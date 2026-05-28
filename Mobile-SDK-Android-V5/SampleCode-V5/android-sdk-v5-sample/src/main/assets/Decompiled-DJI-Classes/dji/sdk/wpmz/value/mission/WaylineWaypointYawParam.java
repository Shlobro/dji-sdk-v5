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
import dji.sdk.wpmz.value.mission.WaylineWaypointYawMode;
import dji.sdk.wpmz.value.mission.WaylineWaypointYawPathMode;
import java.util.Objects;
import org.json.JSONObject;

public class WaylineWaypointYawParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WaylineWaypointYawMode yawMode = WaylineWaypointYawMode.UNKNOWN;
    Boolean enableYawAngle = false;
    Double yawAngle = 0.0;
    WaylineLocationCoordinate3D poiLocation;
    WaylineWaypointYawPathMode yawPathMode = WaylineWaypointYawPathMode.UNKNOWN;
    Integer poiIndex = 0;

    public WaylineWaypointYawParam() {
    }

    public WaylineWaypointYawParam(WaylineWaypointYawMode yawMode, Boolean enableYawAngle, Double yawAngle, WaylineLocationCoordinate3D poiLocation, WaylineWaypointYawPathMode yawPathMode, Integer poiIndex) {
        if (yawMode != null) {
            this.yawMode = yawMode;
        }
        if (enableYawAngle != null) {
            this.enableYawAngle = enableYawAngle;
        }
        if (yawAngle != null) {
            this.yawAngle = yawAngle;
        }
        if (poiLocation != null) {
            this.poiLocation = poiLocation;
        }
        if (yawPathMode != null) {
            this.yawPathMode = yawPathMode;
        }
        if (poiIndex != null) {
            this.poiIndex = poiIndex;
        }
    }

    public static WaylineWaypointYawParam fromJson(String jsonString) {
        WaylineWaypointYawParam tmpValueResult_ = new WaylineWaypointYawParam();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.yawMode = WaylineWaypointYawMode.find(jsonObj.getInt("yawMode"));
            tmpValueResult_.enableYawAngle = jsonObj.getBoolean("enableYawAngle");
            tmpValueResult_.yawAngle = jsonObj.getDouble("yawAngle");
            tmpValueResult_.poiLocation = WaylineLocationCoordinate3D.fromJson(jsonObj.getJSONObject("poiLocation").toString());
            tmpValueResult_.yawPathMode = WaylineWaypointYawPathMode.find(jsonObj.getInt("yawPathMode"));
            tmpValueResult_.poiIndex = jsonObj.getInt("poiIndex");
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
            if (null != this.enableYawAngle) {
                json.put("enableYawAngle", (Object)this.enableYawAngle);
            }
            if (null != this.yawAngle) {
                json.put("yawAngle", (Object)this.yawAngle);
            }
            if (null != this.poiLocation) {
                json.put("poiLocation", (Object)this.poiLocation.toJson());
            }
            if (null != this.yawPathMode) {
                json.put("yawPathMode", this.yawPathMode.value());
            }
            if (null != this.poiIndex) {
                json.put("poiIndex", (Object)this.poiIndex);
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
        serializedLength += ByteStreamHelper.booleanGetLength(this.enableYawAngle);
        serializedLength += ByteStreamHelper.doubleGetLength(this.yawAngle);
        serializedLength += ByteStreamHelper.getLength(this.poiLocation, WaylineLocationCoordinate3D.class);
        serializedLength += ByteStreamHelper.integerGetLength(this.yawPathMode.value());
        return serializedLength += ByteStreamHelper.integerGetLength(this.poiIndex);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.yawMode.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.enableYawAngle, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.yawAngle, serializedIndex);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.poiLocation, serializedIndex, WaylineLocationCoordinate3D.class);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.yawPathMode.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.poiIndex, serializedIndex);
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
        this.yawMode = WaylineWaypointYawMode.find((Integer)tmpYawMode.result);
        deserilizationIndex = tmpYawMode.endIndex;
        ByteResult<Boolean> tmpEnableYawAngle = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.enableYawAngle = (Boolean)tmpEnableYawAngle.result;
        deserilizationIndex = tmpEnableYawAngle.endIndex;
        ByteResult<Double> tmpYawAngle = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.yawAngle = (Double)tmpYawAngle.result;
        deserilizationIndex = tmpYawAngle.endIndex;
        ByteResult<WaylineLocationCoordinate3D> tmpPoiLocation = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineLocationCoordinate3D.class);
        this.poiLocation = (WaylineLocationCoordinate3D)tmpPoiLocation.result;
        deserilizationIndex = tmpPoiLocation.endIndex;
        ByteResult<Integer> tmpYawPathMode = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.yawPathMode = WaylineWaypointYawPathMode.find((Integer)tmpYawPathMode.result);
        deserilizationIndex = tmpYawPathMode.endIndex;
        ByteResult<Integer> tmpPoiIndex = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.poiIndex = (Integer)tmpPoiIndex.result;
        deserilizationIndex = tmpPoiIndex.endIndex;
        return deserilizationIndex;
    }

    public WaylineWaypointYawMode getYawMode() {
        return this.yawMode;
    }

    public void setYawMode(WaylineWaypointYawMode yawMode) {
        this.yawMode = yawMode;
    }

    public Boolean getEnableYawAngle() {
        return this.enableYawAngle;
    }

    public void setEnableYawAngle(Boolean enableYawAngle) {
        this.enableYawAngle = enableYawAngle;
    }

    public Double getYawAngle() {
        return this.yawAngle;
    }

    public void setYawAngle(Double yawAngle) {
        this.yawAngle = yawAngle;
    }

    public WaylineLocationCoordinate3D getPoiLocation() {
        return this.poiLocation;
    }

    public void setPoiLocation(WaylineLocationCoordinate3D poiLocation) {
        this.poiLocation = poiLocation;
    }

    public WaylineWaypointYawPathMode getYawPathMode() {
        return this.yawPathMode;
    }

    public void setYawPathMode(WaylineWaypointYawPathMode yawPathMode) {
        this.yawPathMode = yawPathMode;
    }

    public Integer getPoiIndex() {
        return this.poiIndex;
    }

    public void setPoiIndex(Integer poiIndex) {
        this.poiIndex = poiIndex;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineWaypointYawParam)) {
            return false;
        }
        WaylineWaypointYawParam that = (WaylineWaypointYawParam)o;
        return Objects.equals(this.yawMode, that.yawMode) && Objects.equals(this.enableYawAngle, that.enableYawAngle) && Objects.equals(this.yawAngle, that.yawAngle) && Objects.equals(this.poiLocation, that.poiLocation) && Objects.equals(this.yawPathMode, that.yawPathMode) && Objects.equals(this.poiIndex, that.poiIndex);
    }

    public int hashCode() {
        return Objects.hash(this.yawMode, this.enableYawAngle, this.yawAngle, this.poiLocation, this.yawPathMode, this.poiIndex);
    }
}

