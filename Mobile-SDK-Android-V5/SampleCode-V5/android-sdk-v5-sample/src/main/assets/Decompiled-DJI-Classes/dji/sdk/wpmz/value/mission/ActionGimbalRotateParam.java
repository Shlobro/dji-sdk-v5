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
import dji.sdk.wpmz.value.mission.GimbalHeadingYawBase;
import dji.sdk.wpmz.value.mission.WaylineGimbalActuatorRotateMode;
import java.util.Objects;
import org.json.JSONObject;

public class ActionGimbalRotateParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer payloadPositionIndex = 0;
    WaylineGimbalActuatorRotateMode rotateMode = WaylineGimbalActuatorRotateMode.UNKNOWN;
    Boolean enablePitch = false;
    Double pitch = 0.0;
    Boolean enableRoll = false;
    Double roll = 0.0;
    Boolean enableYaw = false;
    Double yaw = 0.0;
    Boolean enableRotateTime = false;
    Double rotateTime = 0.0;
    GimbalHeadingYawBase base = GimbalHeadingYawBase.UNKNOWN;

    public ActionGimbalRotateParam() {
    }

    public ActionGimbalRotateParam(Integer payloadPositionIndex, WaylineGimbalActuatorRotateMode rotateMode, Boolean enablePitch, Double pitch, Boolean enableRoll, Double roll, Boolean enableYaw, Double yaw, Boolean enableRotateTime, Double rotateTime, GimbalHeadingYawBase base) {
        if (payloadPositionIndex != null) {
            this.payloadPositionIndex = payloadPositionIndex;
        }
        if (rotateMode != null) {
            this.rotateMode = rotateMode;
        }
        if (enablePitch != null) {
            this.enablePitch = enablePitch;
        }
        if (pitch != null) {
            this.pitch = pitch;
        }
        if (enableRoll != null) {
            this.enableRoll = enableRoll;
        }
        if (roll != null) {
            this.roll = roll;
        }
        if (enableYaw != null) {
            this.enableYaw = enableYaw;
        }
        if (yaw != null) {
            this.yaw = yaw;
        }
        if (enableRotateTime != null) {
            this.enableRotateTime = enableRotateTime;
        }
        if (rotateTime != null) {
            this.rotateTime = rotateTime;
        }
        if (base != null) {
            this.base = base;
        }
    }

    public static ActionGimbalRotateParam fromJson(String jsonString) {
        ActionGimbalRotateParam tmpValueResult_ = new ActionGimbalRotateParam();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.payloadPositionIndex = jsonObj.getInt("payloadPositionIndex");
            tmpValueResult_.rotateMode = WaylineGimbalActuatorRotateMode.find(jsonObj.getInt("rotateMode"));
            tmpValueResult_.enablePitch = jsonObj.getBoolean("enablePitch");
            tmpValueResult_.pitch = jsonObj.getDouble("pitch");
            tmpValueResult_.enableRoll = jsonObj.getBoolean("enableRoll");
            tmpValueResult_.roll = jsonObj.getDouble("roll");
            tmpValueResult_.enableYaw = jsonObj.getBoolean("enableYaw");
            tmpValueResult_.yaw = jsonObj.getDouble("yaw");
            tmpValueResult_.enableRotateTime = jsonObj.getBoolean("enableRotateTime");
            tmpValueResult_.rotateTime = jsonObj.getDouble("rotateTime");
            tmpValueResult_.base = GimbalHeadingYawBase.find(jsonObj.getInt("base"));
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
            if (null != this.payloadPositionIndex) {
                json.put("payloadPositionIndex", (Object)this.payloadPositionIndex);
            }
            if (null != this.rotateMode) {
                json.put("rotateMode", this.rotateMode.value());
            }
            if (null != this.enablePitch) {
                json.put("enablePitch", (Object)this.enablePitch);
            }
            if (null != this.pitch) {
                json.put("pitch", (Object)this.pitch);
            }
            if (null != this.enableRoll) {
                json.put("enableRoll", (Object)this.enableRoll);
            }
            if (null != this.roll) {
                json.put("roll", (Object)this.roll);
            }
            if (null != this.enableYaw) {
                json.put("enableYaw", (Object)this.enableYaw);
            }
            if (null != this.yaw) {
                json.put("yaw", (Object)this.yaw);
            }
            if (null != this.enableRotateTime) {
                json.put("enableRotateTime", (Object)this.enableRotateTime);
            }
            if (null != this.rotateTime) {
                json.put("rotateTime", (Object)this.rotateTime);
            }
            if (null != this.base) {
                json.put("base", this.base.value());
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
        serializedLength += ByteStreamHelper.integerGetLength(this.payloadPositionIndex);
        serializedLength += ByteStreamHelper.integerGetLength(this.rotateMode.value());
        serializedLength += ByteStreamHelper.booleanGetLength(this.enablePitch);
        serializedLength += ByteStreamHelper.doubleGetLength(this.pitch);
        serializedLength += ByteStreamHelper.booleanGetLength(this.enableRoll);
        serializedLength += ByteStreamHelper.doubleGetLength(this.roll);
        serializedLength += ByteStreamHelper.booleanGetLength(this.enableYaw);
        serializedLength += ByteStreamHelper.doubleGetLength(this.yaw);
        serializedLength += ByteStreamHelper.booleanGetLength(this.enableRotateTime);
        serializedLength += ByteStreamHelper.doubleGetLength(this.rotateTime);
        return serializedLength += ByteStreamHelper.integerGetLength(this.base.value());
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.payloadPositionIndex, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.rotateMode.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.enablePitch, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.pitch, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.enableRoll, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.roll, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.enableYaw, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.yaw, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.enableRotateTime, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.rotateTime, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.base.value(), serializedIndex);
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
        ByteResult<Integer> tmpPayloadPositionIndex = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.payloadPositionIndex = (Integer)tmpPayloadPositionIndex.result;
        deserilizationIndex = tmpPayloadPositionIndex.endIndex;
        ByteResult<Integer> tmpRotateMode = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.rotateMode = WaylineGimbalActuatorRotateMode.find((Integer)tmpRotateMode.result);
        deserilizationIndex = tmpRotateMode.endIndex;
        ByteResult<Boolean> tmpEnablePitch = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.enablePitch = (Boolean)tmpEnablePitch.result;
        deserilizationIndex = tmpEnablePitch.endIndex;
        ByteResult<Double> tmpPitch = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.pitch = (Double)tmpPitch.result;
        deserilizationIndex = tmpPitch.endIndex;
        ByteResult<Boolean> tmpEnableRoll = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.enableRoll = (Boolean)tmpEnableRoll.result;
        deserilizationIndex = tmpEnableRoll.endIndex;
        ByteResult<Double> tmpRoll = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.roll = (Double)tmpRoll.result;
        deserilizationIndex = tmpRoll.endIndex;
        ByteResult<Boolean> tmpEnableYaw = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.enableYaw = (Boolean)tmpEnableYaw.result;
        deserilizationIndex = tmpEnableYaw.endIndex;
        ByteResult<Double> tmpYaw = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.yaw = (Double)tmpYaw.result;
        deserilizationIndex = tmpYaw.endIndex;
        ByteResult<Boolean> tmpEnableRotateTime = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.enableRotateTime = (Boolean)tmpEnableRotateTime.result;
        deserilizationIndex = tmpEnableRotateTime.endIndex;
        ByteResult<Double> tmpRotateTime = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.rotateTime = (Double)tmpRotateTime.result;
        deserilizationIndex = tmpRotateTime.endIndex;
        ByteResult<Integer> tmpBase = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.base = GimbalHeadingYawBase.find((Integer)tmpBase.result);
        deserilizationIndex = tmpBase.endIndex;
        return deserilizationIndex;
    }

    public Integer getPayloadPositionIndex() {
        return this.payloadPositionIndex;
    }

    public void setPayloadPositionIndex(Integer payloadPositionIndex) {
        this.payloadPositionIndex = payloadPositionIndex;
    }

    public WaylineGimbalActuatorRotateMode getRotateMode() {
        return this.rotateMode;
    }

    public void setRotateMode(WaylineGimbalActuatorRotateMode rotateMode) {
        this.rotateMode = rotateMode;
    }

    public Boolean getEnablePitch() {
        return this.enablePitch;
    }

    public void setEnablePitch(Boolean enablePitch) {
        this.enablePitch = enablePitch;
    }

    public Double getPitch() {
        return this.pitch;
    }

    public void setPitch(Double pitch) {
        this.pitch = pitch;
    }

    public Boolean getEnableRoll() {
        return this.enableRoll;
    }

    public void setEnableRoll(Boolean enableRoll) {
        this.enableRoll = enableRoll;
    }

    public Double getRoll() {
        return this.roll;
    }

    public void setRoll(Double roll) {
        this.roll = roll;
    }

    public Boolean getEnableYaw() {
        return this.enableYaw;
    }

    public void setEnableYaw(Boolean enableYaw) {
        this.enableYaw = enableYaw;
    }

    public Double getYaw() {
        return this.yaw;
    }

    public void setYaw(Double yaw) {
        this.yaw = yaw;
    }

    public Boolean getEnableRotateTime() {
        return this.enableRotateTime;
    }

    public void setEnableRotateTime(Boolean enableRotateTime) {
        this.enableRotateTime = enableRotateTime;
    }

    public Double getRotateTime() {
        return this.rotateTime;
    }

    public void setRotateTime(Double rotateTime) {
        this.rotateTime = rotateTime;
    }

    public GimbalHeadingYawBase getBase() {
        return this.base;
    }

    public void setBase(GimbalHeadingYawBase base) {
        this.base = base;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActionGimbalRotateParam)) {
            return false;
        }
        ActionGimbalRotateParam that = (ActionGimbalRotateParam)o;
        return Objects.equals(this.payloadPositionIndex, that.payloadPositionIndex) && Objects.equals(this.rotateMode, that.rotateMode) && Objects.equals(this.enablePitch, that.enablePitch) && Objects.equals(this.pitch, that.pitch) && Objects.equals(this.enableRoll, that.enableRoll) && Objects.equals(this.roll, that.roll) && Objects.equals(this.enableYaw, that.enableYaw) && Objects.equals(this.yaw, that.yaw) && Objects.equals(this.enableRotateTime, that.enableRotateTime) && Objects.equals(this.rotateTime, that.rotateTime) && Objects.equals(this.base, that.base);
    }

    public int hashCode() {
        return Objects.hash(this.payloadPositionIndex, this.rotateMode, this.enablePitch, this.pitch, this.enableRoll, this.roll, this.enableYaw, this.yaw, this.enableRotateTime, this.rotateTime, this.base);
    }
}

