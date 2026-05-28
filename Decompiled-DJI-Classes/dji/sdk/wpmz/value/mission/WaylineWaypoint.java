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

public class WaylineWaypoint
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer waypointIndex = 0;
    WaylineLocationCoordinate2D location;
    Double height = 0.0;
    Boolean useGlobalFlightHeight = false;
    Double ellipsoidHeight = 0.0;
    WaylineWaypointYawParam yawParam;
    Boolean isWaylineWaypointYawParamSet = false;
    Boolean useGlobalYawParam = false;
    WaylineWaypointGimbalHeadingParam gimbalHeadingParam;
    Boolean isWaylineWaypointGimbalHeadingParamSet = false;
    Boolean useGlobalGimbalHeadingParam = false;
    WaylineWaypointTurnParam turnParam;
    Boolean isWaylineWaypointTurnParamSet = false;
    Boolean useGlobalTurnParam = false;
    Double speed = 0.0;
    Boolean useGlobalAutoFlightSpeed = false;
    Boolean useStraightLine = false;
    Double gimbalPitchAngle = 0.0;
    Boolean useGlobalActionGroup = false;
    Boolean isRisky = false;

    public WaylineWaypoint() {
    }

    public WaylineWaypoint(Integer waypointIndex, WaylineLocationCoordinate2D location, Double height, Boolean useGlobalFlightHeight, Double ellipsoidHeight, WaylineWaypointYawParam yawParam, Boolean isWaylineWaypointYawParamSet, Boolean useGlobalYawParam, WaylineWaypointGimbalHeadingParam gimbalHeadingParam, Boolean isWaylineWaypointGimbalHeadingParamSet, Boolean useGlobalGimbalHeadingParam, WaylineWaypointTurnParam turnParam, Boolean isWaylineWaypointTurnParamSet, Boolean useGlobalTurnParam, Double speed, Boolean useGlobalAutoFlightSpeed, Boolean useStraightLine, Double gimbalPitchAngle, Boolean useGlobalActionGroup, Boolean isRisky) {
        if (waypointIndex != null) {
            this.waypointIndex = waypointIndex;
        }
        if (location != null) {
            this.location = location;
        }
        if (height != null) {
            this.height = height;
        }
        if (useGlobalFlightHeight != null) {
            this.useGlobalFlightHeight = useGlobalFlightHeight;
        }
        if (ellipsoidHeight != null) {
            this.ellipsoidHeight = ellipsoidHeight;
        }
        if (yawParam != null) {
            this.yawParam = yawParam;
        }
        if (isWaylineWaypointYawParamSet != null) {
            this.isWaylineWaypointYawParamSet = isWaylineWaypointYawParamSet;
        }
        if (useGlobalYawParam != null) {
            this.useGlobalYawParam = useGlobalYawParam;
        }
        if (gimbalHeadingParam != null) {
            this.gimbalHeadingParam = gimbalHeadingParam;
        }
        if (isWaylineWaypointGimbalHeadingParamSet != null) {
            this.isWaylineWaypointGimbalHeadingParamSet = isWaylineWaypointGimbalHeadingParamSet;
        }
        if (useGlobalGimbalHeadingParam != null) {
            this.useGlobalGimbalHeadingParam = useGlobalGimbalHeadingParam;
        }
        if (turnParam != null) {
            this.turnParam = turnParam;
        }
        if (isWaylineWaypointTurnParamSet != null) {
            this.isWaylineWaypointTurnParamSet = isWaylineWaypointTurnParamSet;
        }
        if (useGlobalTurnParam != null) {
            this.useGlobalTurnParam = useGlobalTurnParam;
        }
        if (speed != null) {
            this.speed = speed;
        }
        if (useGlobalAutoFlightSpeed != null) {
            this.useGlobalAutoFlightSpeed = useGlobalAutoFlightSpeed;
        }
        if (useStraightLine != null) {
            this.useStraightLine = useStraightLine;
        }
        if (gimbalPitchAngle != null) {
            this.gimbalPitchAngle = gimbalPitchAngle;
        }
        if (useGlobalActionGroup != null) {
            this.useGlobalActionGroup = useGlobalActionGroup;
        }
        if (isRisky != null) {
            this.isRisky = isRisky;
        }
    }

    public static WaylineWaypoint fromJson(String jsonString) {
        WaylineWaypoint tmpValueResult_ = new WaylineWaypoint();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.waypointIndex = jsonObj.getInt("waypointIndex");
            tmpValueResult_.location = WaylineLocationCoordinate2D.fromJson(jsonObj.getJSONObject("location").toString());
            tmpValueResult_.height = jsonObj.getDouble("height");
            tmpValueResult_.useGlobalFlightHeight = jsonObj.getBoolean("useGlobalFlightHeight");
            tmpValueResult_.ellipsoidHeight = jsonObj.getDouble("ellipsoidHeight");
            tmpValueResult_.yawParam = WaylineWaypointYawParam.fromJson(jsonObj.getJSONObject("yawParam").toString());
            tmpValueResult_.isWaylineWaypointYawParamSet = jsonObj.getBoolean("isWaylineWaypointYawParamSet");
            tmpValueResult_.useGlobalYawParam = jsonObj.getBoolean("useGlobalYawParam");
            tmpValueResult_.gimbalHeadingParam = WaylineWaypointGimbalHeadingParam.fromJson(jsonObj.getJSONObject("gimbalHeadingParam").toString());
            tmpValueResult_.isWaylineWaypointGimbalHeadingParamSet = jsonObj.getBoolean("isWaylineWaypointGimbalHeadingParamSet");
            tmpValueResult_.useGlobalGimbalHeadingParam = jsonObj.getBoolean("useGlobalGimbalHeadingParam");
            tmpValueResult_.turnParam = WaylineWaypointTurnParam.fromJson(jsonObj.getJSONObject("turnParam").toString());
            tmpValueResult_.isWaylineWaypointTurnParamSet = jsonObj.getBoolean("isWaylineWaypointTurnParamSet");
            tmpValueResult_.useGlobalTurnParam = jsonObj.getBoolean("useGlobalTurnParam");
            tmpValueResult_.speed = jsonObj.getDouble("speed");
            tmpValueResult_.useGlobalAutoFlightSpeed = jsonObj.getBoolean("useGlobalAutoFlightSpeed");
            tmpValueResult_.useStraightLine = jsonObj.getBoolean("useStraightLine");
            tmpValueResult_.gimbalPitchAngle = jsonObj.getDouble("gimbalPitchAngle");
            tmpValueResult_.useGlobalActionGroup = jsonObj.getBoolean("useGlobalActionGroup");
            tmpValueResult_.isRisky = jsonObj.getBoolean("isRisky");
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
            if (null != this.height) {
                json.put("height", (Object)this.height);
            }
            if (null != this.useGlobalFlightHeight) {
                json.put("useGlobalFlightHeight", (Object)this.useGlobalFlightHeight);
            }
            if (null != this.ellipsoidHeight) {
                json.put("ellipsoidHeight", (Object)this.ellipsoidHeight);
            }
            if (null != this.yawParam) {
                json.put("yawParam", (Object)this.yawParam.toJson());
            }
            if (null != this.isWaylineWaypointYawParamSet) {
                json.put("isWaylineWaypointYawParamSet", (Object)this.isWaylineWaypointYawParamSet);
            }
            if (null != this.useGlobalYawParam) {
                json.put("useGlobalYawParam", (Object)this.useGlobalYawParam);
            }
            if (null != this.gimbalHeadingParam) {
                json.put("gimbalHeadingParam", (Object)this.gimbalHeadingParam.toJson());
            }
            if (null != this.isWaylineWaypointGimbalHeadingParamSet) {
                json.put("isWaylineWaypointGimbalHeadingParamSet", (Object)this.isWaylineWaypointGimbalHeadingParamSet);
            }
            if (null != this.useGlobalGimbalHeadingParam) {
                json.put("useGlobalGimbalHeadingParam", (Object)this.useGlobalGimbalHeadingParam);
            }
            if (null != this.turnParam) {
                json.put("turnParam", (Object)this.turnParam.toJson());
            }
            if (null != this.isWaylineWaypointTurnParamSet) {
                json.put("isWaylineWaypointTurnParamSet", (Object)this.isWaylineWaypointTurnParamSet);
            }
            if (null != this.useGlobalTurnParam) {
                json.put("useGlobalTurnParam", (Object)this.useGlobalTurnParam);
            }
            if (null != this.speed) {
                json.put("speed", (Object)this.speed);
            }
            if (null != this.useGlobalAutoFlightSpeed) {
                json.put("useGlobalAutoFlightSpeed", (Object)this.useGlobalAutoFlightSpeed);
            }
            if (null != this.useStraightLine) {
                json.put("useStraightLine", (Object)this.useStraightLine);
            }
            if (null != this.gimbalPitchAngle) {
                json.put("gimbalPitchAngle", (Object)this.gimbalPitchAngle);
            }
            if (null != this.useGlobalActionGroup) {
                json.put("useGlobalActionGroup", (Object)this.useGlobalActionGroup);
            }
            if (null != this.isRisky) {
                json.put("isRisky", (Object)this.isRisky);
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
        serializedLength += ByteStreamHelper.doubleGetLength(this.height);
        serializedLength += ByteStreamHelper.booleanGetLength(this.useGlobalFlightHeight);
        serializedLength += ByteStreamHelper.doubleGetLength(this.ellipsoidHeight);
        serializedLength += ByteStreamHelper.getLength(this.yawParam, WaylineWaypointYawParam.class);
        serializedLength += ByteStreamHelper.booleanGetLength(this.isWaylineWaypointYawParamSet);
        serializedLength += ByteStreamHelper.booleanGetLength(this.useGlobalYawParam);
        serializedLength += ByteStreamHelper.getLength(this.gimbalHeadingParam, WaylineWaypointGimbalHeadingParam.class);
        serializedLength += ByteStreamHelper.booleanGetLength(this.isWaylineWaypointGimbalHeadingParamSet);
        serializedLength += ByteStreamHelper.booleanGetLength(this.useGlobalGimbalHeadingParam);
        serializedLength += ByteStreamHelper.getLength(this.turnParam, WaylineWaypointTurnParam.class);
        serializedLength += ByteStreamHelper.booleanGetLength(this.isWaylineWaypointTurnParamSet);
        serializedLength += ByteStreamHelper.booleanGetLength(this.useGlobalTurnParam);
        serializedLength += ByteStreamHelper.doubleGetLength(this.speed);
        serializedLength += ByteStreamHelper.booleanGetLength(this.useGlobalAutoFlightSpeed);
        serializedLength += ByteStreamHelper.booleanGetLength(this.useStraightLine);
        serializedLength += ByteStreamHelper.doubleGetLength(this.gimbalPitchAngle);
        serializedLength += ByteStreamHelper.booleanGetLength(this.useGlobalActionGroup);
        return serializedLength += ByteStreamHelper.booleanGetLength(this.isRisky);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.waypointIndex, serializedIndex);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.location, serializedIndex, WaylineLocationCoordinate2D.class);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.height, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.useGlobalFlightHeight, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.ellipsoidHeight, serializedIndex);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.yawParam, serializedIndex, WaylineWaypointYawParam.class);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isWaylineWaypointYawParamSet, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.useGlobalYawParam, serializedIndex);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.gimbalHeadingParam, serializedIndex, WaylineWaypointGimbalHeadingParam.class);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isWaylineWaypointGimbalHeadingParamSet, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.useGlobalGimbalHeadingParam, serializedIndex);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.turnParam, serializedIndex, WaylineWaypointTurnParam.class);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isWaylineWaypointTurnParamSet, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.useGlobalTurnParam, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.speed, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.useGlobalAutoFlightSpeed, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.useStraightLine, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.gimbalPitchAngle, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.useGlobalActionGroup, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isRisky, serializedIndex);
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
        ByteResult<Double> tmpHeight = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.height = (Double)tmpHeight.result;
        deserilizationIndex = tmpHeight.endIndex;
        ByteResult<Boolean> tmpUseGlobalFlightHeight = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.useGlobalFlightHeight = (Boolean)tmpUseGlobalFlightHeight.result;
        deserilizationIndex = tmpUseGlobalFlightHeight.endIndex;
        ByteResult<Double> tmpEllipsoidHeight = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.ellipsoidHeight = (Double)tmpEllipsoidHeight.result;
        deserilizationIndex = tmpEllipsoidHeight.endIndex;
        ByteResult<WaylineWaypointYawParam> tmpYawParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineWaypointYawParam.class);
        this.yawParam = (WaylineWaypointYawParam)tmpYawParam.result;
        deserilizationIndex = tmpYawParam.endIndex;
        ByteResult<Boolean> tmpIsWaylineWaypointYawParamSet = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isWaylineWaypointYawParamSet = (Boolean)tmpIsWaylineWaypointYawParamSet.result;
        deserilizationIndex = tmpIsWaylineWaypointYawParamSet.endIndex;
        ByteResult<Boolean> tmpUseGlobalYawParam = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.useGlobalYawParam = (Boolean)tmpUseGlobalYawParam.result;
        deserilizationIndex = tmpUseGlobalYawParam.endIndex;
        ByteResult<WaylineWaypointGimbalHeadingParam> tmpGimbalHeadingParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineWaypointGimbalHeadingParam.class);
        this.gimbalHeadingParam = (WaylineWaypointGimbalHeadingParam)tmpGimbalHeadingParam.result;
        deserilizationIndex = tmpGimbalHeadingParam.endIndex;
        ByteResult<Boolean> tmpIsWaylineWaypointGimbalHeadingParamSet = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isWaylineWaypointGimbalHeadingParamSet = (Boolean)tmpIsWaylineWaypointGimbalHeadingParamSet.result;
        deserilizationIndex = tmpIsWaylineWaypointGimbalHeadingParamSet.endIndex;
        ByteResult<Boolean> tmpUseGlobalGimbalHeadingParam = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.useGlobalGimbalHeadingParam = (Boolean)tmpUseGlobalGimbalHeadingParam.result;
        deserilizationIndex = tmpUseGlobalGimbalHeadingParam.endIndex;
        ByteResult<WaylineWaypointTurnParam> tmpTurnParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineWaypointTurnParam.class);
        this.turnParam = (WaylineWaypointTurnParam)tmpTurnParam.result;
        deserilizationIndex = tmpTurnParam.endIndex;
        ByteResult<Boolean> tmpIsWaylineWaypointTurnParamSet = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isWaylineWaypointTurnParamSet = (Boolean)tmpIsWaylineWaypointTurnParamSet.result;
        deserilizationIndex = tmpIsWaylineWaypointTurnParamSet.endIndex;
        ByteResult<Boolean> tmpUseGlobalTurnParam = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.useGlobalTurnParam = (Boolean)tmpUseGlobalTurnParam.result;
        deserilizationIndex = tmpUseGlobalTurnParam.endIndex;
        ByteResult<Double> tmpSpeed = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.speed = (Double)tmpSpeed.result;
        deserilizationIndex = tmpSpeed.endIndex;
        ByteResult<Boolean> tmpUseGlobalAutoFlightSpeed = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.useGlobalAutoFlightSpeed = (Boolean)tmpUseGlobalAutoFlightSpeed.result;
        deserilizationIndex = tmpUseGlobalAutoFlightSpeed.endIndex;
        ByteResult<Boolean> tmpUseStraightLine = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.useStraightLine = (Boolean)tmpUseStraightLine.result;
        deserilizationIndex = tmpUseStraightLine.endIndex;
        ByteResult<Double> tmpGimbalPitchAngle = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.gimbalPitchAngle = (Double)tmpGimbalPitchAngle.result;
        deserilizationIndex = tmpGimbalPitchAngle.endIndex;
        ByteResult<Boolean> tmpUseGlobalActionGroup = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.useGlobalActionGroup = (Boolean)tmpUseGlobalActionGroup.result;
        deserilizationIndex = tmpUseGlobalActionGroup.endIndex;
        ByteResult<Boolean> tmpIsRisky = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isRisky = (Boolean)tmpIsRisky.result;
        deserilizationIndex = tmpIsRisky.endIndex;
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

    public Double getHeight() {
        return this.height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Boolean getUseGlobalFlightHeight() {
        return this.useGlobalFlightHeight;
    }

    public void setUseGlobalFlightHeight(Boolean useGlobalFlightHeight) {
        this.useGlobalFlightHeight = useGlobalFlightHeight;
    }

    public Double getEllipsoidHeight() {
        return this.ellipsoidHeight;
    }

    public void setEllipsoidHeight(Double ellipsoidHeight) {
        this.ellipsoidHeight = ellipsoidHeight;
    }

    public WaylineWaypointYawParam getYawParam() {
        return this.yawParam;
    }

    public void setYawParam(WaylineWaypointYawParam yawParam) {
        this.yawParam = yawParam;
    }

    public Boolean getIsWaylineWaypointYawParamSet() {
        return this.isWaylineWaypointYawParamSet;
    }

    public void setIsWaylineWaypointYawParamSet(Boolean isWaylineWaypointYawParamSet) {
        this.isWaylineWaypointYawParamSet = isWaylineWaypointYawParamSet;
    }

    public Boolean getUseGlobalYawParam() {
        return this.useGlobalYawParam;
    }

    public void setUseGlobalYawParam(Boolean useGlobalYawParam) {
        this.useGlobalYawParam = useGlobalYawParam;
    }

    public WaylineWaypointGimbalHeadingParam getGimbalHeadingParam() {
        return this.gimbalHeadingParam;
    }

    public void setGimbalHeadingParam(WaylineWaypointGimbalHeadingParam gimbalHeadingParam) {
        this.gimbalHeadingParam = gimbalHeadingParam;
    }

    public Boolean getIsWaylineWaypointGimbalHeadingParamSet() {
        return this.isWaylineWaypointGimbalHeadingParamSet;
    }

    public void setIsWaylineWaypointGimbalHeadingParamSet(Boolean isWaylineWaypointGimbalHeadingParamSet) {
        this.isWaylineWaypointGimbalHeadingParamSet = isWaylineWaypointGimbalHeadingParamSet;
    }

    public Boolean getUseGlobalGimbalHeadingParam() {
        return this.useGlobalGimbalHeadingParam;
    }

    public void setUseGlobalGimbalHeadingParam(Boolean useGlobalGimbalHeadingParam) {
        this.useGlobalGimbalHeadingParam = useGlobalGimbalHeadingParam;
    }

    public WaylineWaypointTurnParam getTurnParam() {
        return this.turnParam;
    }

    public void setTurnParam(WaylineWaypointTurnParam turnParam) {
        this.turnParam = turnParam;
    }

    public Boolean getIsWaylineWaypointTurnParamSet() {
        return this.isWaylineWaypointTurnParamSet;
    }

    public void setIsWaylineWaypointTurnParamSet(Boolean isWaylineWaypointTurnParamSet) {
        this.isWaylineWaypointTurnParamSet = isWaylineWaypointTurnParamSet;
    }

    public Boolean getUseGlobalTurnParam() {
        return this.useGlobalTurnParam;
    }

    public void setUseGlobalTurnParam(Boolean useGlobalTurnParam) {
        this.useGlobalTurnParam = useGlobalTurnParam;
    }

    public Double getSpeed() {
        return this.speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Boolean getUseGlobalAutoFlightSpeed() {
        return this.useGlobalAutoFlightSpeed;
    }

    public void setUseGlobalAutoFlightSpeed(Boolean useGlobalAutoFlightSpeed) {
        this.useGlobalAutoFlightSpeed = useGlobalAutoFlightSpeed;
    }

    public Boolean getUseStraightLine() {
        return this.useStraightLine;
    }

    public void setUseStraightLine(Boolean useStraightLine) {
        this.useStraightLine = useStraightLine;
    }

    public Double getGimbalPitchAngle() {
        return this.gimbalPitchAngle;
    }

    public void setGimbalPitchAngle(Double gimbalPitchAngle) {
        this.gimbalPitchAngle = gimbalPitchAngle;
    }

    public Boolean getUseGlobalActionGroup() {
        return this.useGlobalActionGroup;
    }

    public void setUseGlobalActionGroup(Boolean useGlobalActionGroup) {
        this.useGlobalActionGroup = useGlobalActionGroup;
    }

    public Boolean getIsRisky() {
        return this.isRisky;
    }

    public void setIsRisky(Boolean isRisky) {
        this.isRisky = isRisky;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineWaypoint)) {
            return false;
        }
        WaylineWaypoint that = (WaylineWaypoint)o;
        return Objects.equals(this.waypointIndex, that.waypointIndex) && Objects.equals(this.location, that.location) && Objects.equals(this.height, that.height) && Objects.equals(this.useGlobalFlightHeight, that.useGlobalFlightHeight) && Objects.equals(this.ellipsoidHeight, that.ellipsoidHeight) && Objects.equals(this.yawParam, that.yawParam) && Objects.equals(this.isWaylineWaypointYawParamSet, that.isWaylineWaypointYawParamSet) && Objects.equals(this.useGlobalYawParam, that.useGlobalYawParam) && Objects.equals(this.gimbalHeadingParam, that.gimbalHeadingParam) && Objects.equals(this.isWaylineWaypointGimbalHeadingParamSet, that.isWaylineWaypointGimbalHeadingParamSet) && Objects.equals(this.useGlobalGimbalHeadingParam, that.useGlobalGimbalHeadingParam) && Objects.equals(this.turnParam, that.turnParam) && Objects.equals(this.isWaylineWaypointTurnParamSet, that.isWaylineWaypointTurnParamSet) && Objects.equals(this.useGlobalTurnParam, that.useGlobalTurnParam) && Objects.equals(this.speed, that.speed) && Objects.equals(this.useGlobalAutoFlightSpeed, that.useGlobalAutoFlightSpeed) && Objects.equals(this.useStraightLine, that.useStraightLine) && Objects.equals(this.gimbalPitchAngle, that.gimbalPitchAngle) && Objects.equals(this.useGlobalActionGroup, that.useGlobalActionGroup) && Objects.equals(this.isRisky, that.isRisky);
    }

    public int hashCode() {
        return Objects.hash(this.waypointIndex, this.location, this.height, this.useGlobalFlightHeight, this.ellipsoidHeight, this.yawParam, this.isWaylineWaypointYawParamSet, this.useGlobalYawParam, this.gimbalHeadingParam, this.isWaylineWaypointGimbalHeadingParamSet, this.useGlobalGimbalHeadingParam, this.turnParam, this.isWaylineWaypointTurnParamSet, this.useGlobalTurnParam, this.speed, this.useGlobalAutoFlightSpeed, this.useStraightLine, this.gimbalPitchAngle, this.useGlobalActionGroup, this.isRisky);
    }
}

