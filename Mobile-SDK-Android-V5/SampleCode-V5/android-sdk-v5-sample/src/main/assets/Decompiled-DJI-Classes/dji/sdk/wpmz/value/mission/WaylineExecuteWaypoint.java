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
import dji.sdk.wpmz.value.mission.WaylineLocationCoordinate2D;
import dji.sdk.wpmz.value.mission.WaylineWaypointGimbalHeadingParam;
import dji.sdk.wpmz.value.mission.WaylineWaypointTurnParam;
import dji.sdk.wpmz.value.mission.WaylineWaypointYawParam;
import java.util.Objects;
import org.json.JSONObject;

public class WaylineExecuteWaypoint
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer waypointIndex = 0;
    WaylineLocationCoordinate2D location;
    Double executeHeight = 0.0;
    WaylineWaypointYawParam yawParam;
    WaylineWaypointGimbalHeadingParam gimbalHeadingParam;
    WaylineWaypointTurnParam turnParam;
    Double speed = 0.0;
    Boolean useStraightLine = false;
    Boolean isRisky = false;
    Integer waypointWorkType = 0;

    public WaylineExecuteWaypoint() {
    }

    public WaylineExecuteWaypoint(Integer waypointIndex, WaylineLocationCoordinate2D location, Double executeHeight, WaylineWaypointYawParam yawParam, WaylineWaypointGimbalHeadingParam gimbalHeadingParam, WaylineWaypointTurnParam turnParam, Double speed, Boolean useStraightLine, Boolean isRisky, Integer waypointWorkType) {
        if (waypointIndex != null) {
            this.waypointIndex = waypointIndex;
        }
        if (location != null) {
            this.location = location;
        }
        if (executeHeight != null) {
            this.executeHeight = executeHeight;
        }
        if (yawParam != null) {
            this.yawParam = yawParam;
        }
        if (gimbalHeadingParam != null) {
            this.gimbalHeadingParam = gimbalHeadingParam;
        }
        if (turnParam != null) {
            this.turnParam = turnParam;
        }
        if (speed != null) {
            this.speed = speed;
        }
        if (useStraightLine != null) {
            this.useStraightLine = useStraightLine;
        }
        if (isRisky != null) {
            this.isRisky = isRisky;
        }
        if (waypointWorkType != null) {
            this.waypointWorkType = waypointWorkType;
        }
    }

    public static WaylineExecuteWaypoint fromJson(String jsonString) {
        WaylineExecuteWaypoint tmpValueResult_ = new WaylineExecuteWaypoint();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.waypointIndex = jsonObj.getInt("waypointIndex");
            tmpValueResult_.location = WaylineLocationCoordinate2D.fromJson(jsonObj.getJSONObject("location").toString());
            tmpValueResult_.executeHeight = jsonObj.getDouble("executeHeight");
            tmpValueResult_.yawParam = WaylineWaypointYawParam.fromJson(jsonObj.getJSONObject("yawParam").toString());
            tmpValueResult_.gimbalHeadingParam = WaylineWaypointGimbalHeadingParam.fromJson(jsonObj.getJSONObject("gimbalHeadingParam").toString());
            tmpValueResult_.turnParam = WaylineWaypointTurnParam.fromJson(jsonObj.getJSONObject("turnParam").toString());
            tmpValueResult_.speed = jsonObj.getDouble("speed");
            tmpValueResult_.useStraightLine = jsonObj.getBoolean("useStraightLine");
            tmpValueResult_.isRisky = jsonObj.getBoolean("isRisky");
            tmpValueResult_.waypointWorkType = jsonObj.getInt("waypointWorkType");
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
            if (null != this.waypointIndex) {
                json.put("waypointIndex", (Object)this.waypointIndex);
            }
            if (null != this.location) {
                json.put("location", (Object)this.location.toJson());
            }
            if (null != this.executeHeight) {
                json.put("executeHeight", (Object)this.executeHeight);
            }
            if (null != this.yawParam) {
                json.put("yawParam", (Object)this.yawParam.toJson());
            }
            if (null != this.gimbalHeadingParam) {
                json.put("gimbalHeadingParam", (Object)this.gimbalHeadingParam.toJson());
            }
            if (null != this.turnParam) {
                json.put("turnParam", (Object)this.turnParam.toJson());
            }
            if (null != this.speed) {
                json.put("speed", (Object)this.speed);
            }
            if (null != this.useStraightLine) {
                json.put("useStraightLine", (Object)this.useStraightLine);
            }
            if (null != this.isRisky) {
                json.put("isRisky", (Object)this.isRisky);
            }
            if (null != this.waypointWorkType) {
                json.put("waypointWorkType", (Object)this.waypointWorkType);
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
        serializedLength += ByteStreamHelper.integerGetLength(this.waypointIndex);
        serializedLength += ByteStreamHelper.getLength(this.location, WaylineLocationCoordinate2D.class);
        serializedLength += ByteStreamHelper.doubleGetLength(this.executeHeight);
        serializedLength += ByteStreamHelper.getLength(this.yawParam, WaylineWaypointYawParam.class);
        serializedLength += ByteStreamHelper.getLength(this.gimbalHeadingParam, WaylineWaypointGimbalHeadingParam.class);
        serializedLength += ByteStreamHelper.getLength(this.turnParam, WaylineWaypointTurnParam.class);
        serializedLength += ByteStreamHelper.doubleGetLength(this.speed);
        serializedLength += ByteStreamHelper.booleanGetLength(this.useStraightLine);
        serializedLength += ByteStreamHelper.booleanGetLength(this.isRisky);
        return serializedLength += ByteStreamHelper.integerGetLength(this.waypointWorkType);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.waypointIndex, serializedIndex);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.location, serializedIndex, WaylineLocationCoordinate2D.class);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.executeHeight, serializedIndex);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.yawParam, serializedIndex, WaylineWaypointYawParam.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.gimbalHeadingParam, serializedIndex, WaylineWaypointGimbalHeadingParam.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.turnParam, serializedIndex, WaylineWaypointTurnParam.class);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.speed, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.useStraightLine, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isRisky, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.waypointWorkType, serializedIndex);
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
        ByteResult<Integer> tmpWaypointIndex = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.waypointIndex = (Integer)tmpWaypointIndex.result;
        deserilizationIndex = tmpWaypointIndex.endIndex;
        ByteResult<WaylineLocationCoordinate2D> tmpLocation = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineLocationCoordinate2D.class);
        this.location = (WaylineLocationCoordinate2D)tmpLocation.result;
        deserilizationIndex = tmpLocation.endIndex;
        ByteResult<Double> tmpExecuteHeight = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.executeHeight = (Double)tmpExecuteHeight.result;
        deserilizationIndex = tmpExecuteHeight.endIndex;
        ByteResult<WaylineWaypointYawParam> tmpYawParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineWaypointYawParam.class);
        this.yawParam = (WaylineWaypointYawParam)tmpYawParam.result;
        deserilizationIndex = tmpYawParam.endIndex;
        ByteResult<WaylineWaypointGimbalHeadingParam> tmpGimbalHeadingParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineWaypointGimbalHeadingParam.class);
        this.gimbalHeadingParam = (WaylineWaypointGimbalHeadingParam)tmpGimbalHeadingParam.result;
        deserilizationIndex = tmpGimbalHeadingParam.endIndex;
        ByteResult<WaylineWaypointTurnParam> tmpTurnParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineWaypointTurnParam.class);
        this.turnParam = (WaylineWaypointTurnParam)tmpTurnParam.result;
        deserilizationIndex = tmpTurnParam.endIndex;
        ByteResult<Double> tmpSpeed = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.speed = (Double)tmpSpeed.result;
        deserilizationIndex = tmpSpeed.endIndex;
        ByteResult<Boolean> tmpUseStraightLine = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.useStraightLine = (Boolean)tmpUseStraightLine.result;
        deserilizationIndex = tmpUseStraightLine.endIndex;
        ByteResult<Boolean> tmpIsRisky = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isRisky = (Boolean)tmpIsRisky.result;
        deserilizationIndex = tmpIsRisky.endIndex;
        ByteResult<Integer> tmpWaypointWorkType = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.waypointWorkType = (Integer)tmpWaypointWorkType.result;
        deserilizationIndex = tmpWaypointWorkType.endIndex;
        return deserilizationIndex;
    }

    public Integer getWaypointIndex() {
        return this.waypointIndex;
    }

    public void setWaypointIndex(Integer waypointIndex) {
        this.waypointIndex = waypointIndex;
    }

    public WaylineLocationCoordinate2D getLocation() {
        return this.location;
    }

    public void setLocation(WaylineLocationCoordinate2D location) {
        this.location = location;
    }

    public Double getExecuteHeight() {
        return this.executeHeight;
    }

    public void setExecuteHeight(Double executeHeight) {
        this.executeHeight = executeHeight;
    }

    public WaylineWaypointYawParam getYawParam() {
        return this.yawParam;
    }

    public void setYawParam(WaylineWaypointYawParam yawParam) {
        this.yawParam = yawParam;
    }

    public WaylineWaypointGimbalHeadingParam getGimbalHeadingParam() {
        return this.gimbalHeadingParam;
    }

    public void setGimbalHeadingParam(WaylineWaypointGimbalHeadingParam gimbalHeadingParam) {
        this.gimbalHeadingParam = gimbalHeadingParam;
    }

    public WaylineWaypointTurnParam getTurnParam() {
        return this.turnParam;
    }

    public void setTurnParam(WaylineWaypointTurnParam turnParam) {
        this.turnParam = turnParam;
    }

    public Double getSpeed() {
        return this.speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Boolean getUseStraightLine() {
        return this.useStraightLine;
    }

    public void setUseStraightLine(Boolean useStraightLine) {
        this.useStraightLine = useStraightLine;
    }

    public Boolean getIsRisky() {
        return this.isRisky;
    }

    public void setIsRisky(Boolean isRisky) {
        this.isRisky = isRisky;
    }

    public Integer getWaypointWorkType() {
        return this.waypointWorkType;
    }

    public void setWaypointWorkType(Integer waypointWorkType) {
        this.waypointWorkType = waypointWorkType;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineExecuteWaypoint)) {
            return false;
        }
        WaylineExecuteWaypoint that = (WaylineExecuteWaypoint)o;
        return Objects.equals(this.waypointIndex, that.waypointIndex) && Objects.equals(this.location, that.location) && Objects.equals(this.executeHeight, that.executeHeight) && Objects.equals(this.yawParam, that.yawParam) && Objects.equals(this.gimbalHeadingParam, that.gimbalHeadingParam) && Objects.equals(this.turnParam, that.turnParam) && Objects.equals(this.speed, that.speed) && Objects.equals(this.useStraightLine, that.useStraightLine) && Objects.equals(this.isRisky, that.isRisky) && Objects.equals(this.waypointWorkType, that.waypointWorkType);
    }

    public int hashCode() {
        return Objects.hash(this.waypointIndex, this.location, this.executeHeight, this.yawParam, this.gimbalHeadingParam, this.turnParam, this.speed, this.useStraightLine, this.isRisky, this.waypointWorkType);
    }
}

