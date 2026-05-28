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
import dji.sdk.wpmz.value.mission.SurfaceFollowParam;
import dji.sdk.wpmz.value.mission.WaylineAltitudeMode;
import dji.sdk.wpmz.value.mission.WaylineCoordinateMode;
import dji.sdk.wpmz.value.mission.WaylinePositioningType;
import java.util.Objects;
import org.json.JSONObject;

public class WaylineCoordinateParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WaylineCoordinateMode coordinateMode = WaylineCoordinateMode.UNKNOWN;
    WaylineAltitudeMode altitudeMode = WaylineAltitudeMode.UNKNOWN;
    Double globalShootHeight = 0.0;
    Boolean isGlobalShootHeightSet = false;
    SurfaceFollowParam surfaceFollowParam;
    Boolean isSurfaceFollowParamSet = false;
    WaylinePositioningType positioningType = WaylinePositioningType.UNKNOWN;
    Boolean isWaylinePositioningTypeSet = false;

    public WaylineCoordinateParam() {
    }

    public WaylineCoordinateParam(WaylineCoordinateMode coordinateMode, WaylineAltitudeMode altitudeMode, Double globalShootHeight, Boolean isGlobalShootHeightSet, SurfaceFollowParam surfaceFollowParam, Boolean isSurfaceFollowParamSet, WaylinePositioningType positioningType, Boolean isWaylinePositioningTypeSet) {
        if (coordinateMode != null) {
            this.coordinateMode = coordinateMode;
        }
        if (altitudeMode != null) {
            this.altitudeMode = altitudeMode;
        }
        if (globalShootHeight != null) {
            this.globalShootHeight = globalShootHeight;
        }
        if (isGlobalShootHeightSet != null) {
            this.isGlobalShootHeightSet = isGlobalShootHeightSet;
        }
        if (surfaceFollowParam != null) {
            this.surfaceFollowParam = surfaceFollowParam;
        }
        if (isSurfaceFollowParamSet != null) {
            this.isSurfaceFollowParamSet = isSurfaceFollowParamSet;
        }
        if (positioningType != null) {
            this.positioningType = positioningType;
        }
        if (isWaylinePositioningTypeSet != null) {
            this.isWaylinePositioningTypeSet = isWaylinePositioningTypeSet;
        }
    }

    public static WaylineCoordinateParam fromJson(String jsonString) {
        WaylineCoordinateParam tmpValueResult_ = new WaylineCoordinateParam();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.coordinateMode = WaylineCoordinateMode.find(jsonObj.getInt("coordinateMode"));
            tmpValueResult_.altitudeMode = WaylineAltitudeMode.find(jsonObj.getInt("altitudeMode"));
            tmpValueResult_.globalShootHeight = jsonObj.getDouble("globalShootHeight");
            tmpValueResult_.isGlobalShootHeightSet = jsonObj.getBoolean("isGlobalShootHeightSet");
            tmpValueResult_.surfaceFollowParam = SurfaceFollowParam.fromJson(jsonObj.getJSONObject("surfaceFollowParam").toString());
            tmpValueResult_.isSurfaceFollowParamSet = jsonObj.getBoolean("isSurfaceFollowParamSet");
            tmpValueResult_.positioningType = WaylinePositioningType.find(jsonObj.getInt("positioningType"));
            tmpValueResult_.isWaylinePositioningTypeSet = jsonObj.getBoolean("isWaylinePositioningTypeSet");
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
            if (null != this.coordinateMode) {
                json.put("coordinateMode", this.coordinateMode.value());
            }
            if (null != this.altitudeMode) {
                json.put("altitudeMode", this.altitudeMode.value());
            }
            if (null != this.globalShootHeight) {
                json.put("globalShootHeight", (Object)this.globalShootHeight);
            }
            if (null != this.isGlobalShootHeightSet) {
                json.put("isGlobalShootHeightSet", (Object)this.isGlobalShootHeightSet);
            }
            if (null != this.surfaceFollowParam) {
                json.put("surfaceFollowParam", (Object)this.surfaceFollowParam.toJson());
            }
            if (null != this.isSurfaceFollowParamSet) {
                json.put("isSurfaceFollowParamSet", (Object)this.isSurfaceFollowParamSet);
            }
            if (null != this.positioningType) {
                json.put("positioningType", this.positioningType.value());
            }
            if (null != this.isWaylinePositioningTypeSet) {
                json.put("isWaylinePositioningTypeSet", (Object)this.isWaylinePositioningTypeSet);
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
        serializedLength += ByteStreamHelper.integerGetLength(this.coordinateMode.value());
        serializedLength += ByteStreamHelper.integerGetLength(this.altitudeMode.value());
        serializedLength += ByteStreamHelper.doubleGetLength(this.globalShootHeight);
        serializedLength += ByteStreamHelper.booleanGetLength(this.isGlobalShootHeightSet);
        serializedLength += ByteStreamHelper.getLength(this.surfaceFollowParam, SurfaceFollowParam.class);
        serializedLength += ByteStreamHelper.booleanGetLength(this.isSurfaceFollowParamSet);
        serializedLength += ByteStreamHelper.integerGetLength(this.positioningType.value());
        return serializedLength += ByteStreamHelper.booleanGetLength(this.isWaylinePositioningTypeSet);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.coordinateMode.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.altitudeMode.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.globalShootHeight, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isGlobalShootHeightSet, serializedIndex);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.surfaceFollowParam, serializedIndex, SurfaceFollowParam.class);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isSurfaceFollowParamSet, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.positioningType.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isWaylinePositioningTypeSet, serializedIndex);
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
        ByteResult<Integer> tmpCoordinateMode = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.coordinateMode = WaylineCoordinateMode.find((Integer)tmpCoordinateMode.result);
        deserilizationIndex = tmpCoordinateMode.endIndex;
        ByteResult<Integer> tmpAltitudeMode = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.altitudeMode = WaylineAltitudeMode.find((Integer)tmpAltitudeMode.result);
        deserilizationIndex = tmpAltitudeMode.endIndex;
        ByteResult<Double> tmpGlobalShootHeight = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.globalShootHeight = (Double)tmpGlobalShootHeight.result;
        deserilizationIndex = tmpGlobalShootHeight.endIndex;
        ByteResult<Boolean> tmpIsGlobalShootHeightSet = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isGlobalShootHeightSet = (Boolean)tmpIsGlobalShootHeightSet.result;
        deserilizationIndex = tmpIsGlobalShootHeightSet.endIndex;
        ByteResult<SurfaceFollowParam> tmpSurfaceFollowParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, SurfaceFollowParam.class);
        this.surfaceFollowParam = (SurfaceFollowParam)tmpSurfaceFollowParam.result;
        deserilizationIndex = tmpSurfaceFollowParam.endIndex;
        ByteResult<Boolean> tmpIsSurfaceFollowParamSet = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isSurfaceFollowParamSet = (Boolean)tmpIsSurfaceFollowParamSet.result;
        deserilizationIndex = tmpIsSurfaceFollowParamSet.endIndex;
        ByteResult<Integer> tmpPositioningType = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.positioningType = WaylinePositioningType.find((Integer)tmpPositioningType.result);
        deserilizationIndex = tmpPositioningType.endIndex;
        ByteResult<Boolean> tmpIsWaylinePositioningTypeSet = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isWaylinePositioningTypeSet = (Boolean)tmpIsWaylinePositioningTypeSet.result;
        deserilizationIndex = tmpIsWaylinePositioningTypeSet.endIndex;
        return deserilizationIndex;
    }

    public WaylineCoordinateMode getCoordinateMode() {
        return this.coordinateMode;
    }

    public void setCoordinateMode(WaylineCoordinateMode coordinateMode) {
        this.coordinateMode = coordinateMode;
    }

    public WaylineAltitudeMode getAltitudeMode() {
        return this.altitudeMode;
    }

    public void setAltitudeMode(WaylineAltitudeMode altitudeMode) {
        this.altitudeMode = altitudeMode;
    }

    public Double getGlobalShootHeight() {
        return this.globalShootHeight;
    }

    public void setGlobalShootHeight(Double globalShootHeight) {
        this.globalShootHeight = globalShootHeight;
    }

    public Boolean getIsGlobalShootHeightSet() {
        return this.isGlobalShootHeightSet;
    }

    public void setIsGlobalShootHeightSet(Boolean isGlobalShootHeightSet) {
        this.isGlobalShootHeightSet = isGlobalShootHeightSet;
    }

    public SurfaceFollowParam getSurfaceFollowParam() {
        return this.surfaceFollowParam;
    }

    public void setSurfaceFollowParam(SurfaceFollowParam surfaceFollowParam) {
        this.surfaceFollowParam = surfaceFollowParam;
    }

    public Boolean getIsSurfaceFollowParamSet() {
        return this.isSurfaceFollowParamSet;
    }

    public void setIsSurfaceFollowParamSet(Boolean isSurfaceFollowParamSet) {
        this.isSurfaceFollowParamSet = isSurfaceFollowParamSet;
    }

    public WaylinePositioningType getPositioningType() {
        return this.positioningType;
    }

    public void setPositioningType(WaylinePositioningType positioningType) {
        this.positioningType = positioningType;
    }

    public Boolean getIsWaylinePositioningTypeSet() {
        return this.isWaylinePositioningTypeSet;
    }

    public void setIsWaylinePositioningTypeSet(Boolean isWaylinePositioningTypeSet) {
        this.isWaylinePositioningTypeSet = isWaylinePositioningTypeSet;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineCoordinateParam)) {
            return false;
        }
        WaylineCoordinateParam that = (WaylineCoordinateParam)o;
        return Objects.equals(this.coordinateMode, that.coordinateMode) && Objects.equals(this.altitudeMode, that.altitudeMode) && Objects.equals(this.globalShootHeight, that.globalShootHeight) && Objects.equals(this.isGlobalShootHeightSet, that.isGlobalShootHeightSet) && Objects.equals(this.surfaceFollowParam, that.surfaceFollowParam) && Objects.equals(this.isSurfaceFollowParamSet, that.isSurfaceFollowParamSet) && Objects.equals(this.positioningType, that.positioningType) && Objects.equals(this.isWaylinePositioningTypeSet, that.isWaylinePositioningTypeSet);
    }

    public int hashCode() {
        return Objects.hash(this.coordinateMode, this.altitudeMode, this.globalShootHeight, this.isGlobalShootHeightSet, this.surfaceFollowParam, this.isSurfaceFollowParamSet, this.positioningType, this.isWaylinePositioningTypeSet);
    }
}

