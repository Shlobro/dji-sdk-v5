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
import dji.sdk.wpmz.value.mission.WaylineWaypointYawPathMode;
import java.util.Objects;
import org.json.JSONObject;

public class ActionAircraftRotateFollowSpeedParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double yawSpeed = 0.0;
    WaylineWaypointYawPathMode pathMode = WaylineWaypointYawPathMode.UNKNOWN;

    public ActionAircraftRotateFollowSpeedParam() {
    }

    public ActionAircraftRotateFollowSpeedParam(Double yawSpeed, WaylineWaypointYawPathMode pathMode) {
        if (yawSpeed != null) {
            this.yawSpeed = yawSpeed;
        }
        if (pathMode != null) {
            this.pathMode = pathMode;
        }
    }

    public static ActionAircraftRotateFollowSpeedParam fromJson(String jsonString) {
        ActionAircraftRotateFollowSpeedParam tmpValueResult_ = new ActionAircraftRotateFollowSpeedParam();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.yawSpeed = jsonObj.getDouble("yawSpeed");
            tmpValueResult_.pathMode = WaylineWaypointYawPathMode.find(jsonObj.getInt("pathMode"));
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
            if (null != this.yawSpeed) {
                json.put("yawSpeed", (Object)this.yawSpeed);
            }
            if (null != this.pathMode) {
                json.put("pathMode", this.pathMode.value());
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
        serializedLength += ByteStreamHelper.doubleGetLength(this.yawSpeed);
        return serializedLength += ByteStreamHelper.integerGetLength(this.pathMode.value());
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.yawSpeed, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.pathMode.value(), serializedIndex);
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
        ByteResult<Double> tmpYawSpeed = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.yawSpeed = (Double)tmpYawSpeed.result;
        deserilizationIndex = tmpYawSpeed.endIndex;
        ByteResult<Integer> tmpPathMode = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.pathMode = WaylineWaypointYawPathMode.find((Integer)tmpPathMode.result);
        deserilizationIndex = tmpPathMode.endIndex;
        return deserilizationIndex;
    }

    public Double getYawSpeed() {
        return this.yawSpeed;
    }

    public void setYawSpeed(Double yawSpeed) {
        this.yawSpeed = yawSpeed;
    }

    public WaylineWaypointYawPathMode getPathMode() {
        return this.pathMode;
    }

    public void setPathMode(WaylineWaypointYawPathMode pathMode) {
        this.pathMode = pathMode;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActionAircraftRotateFollowSpeedParam)) {
            return false;
        }
        ActionAircraftRotateFollowSpeedParam that = (ActionAircraftRotateFollowSpeedParam)o;
        return Objects.equals(this.yawSpeed, that.yawSpeed) && Objects.equals(this.pathMode, that.pathMode);
    }

    public int hashCode() {
        return Objects.hash(this.yawSpeed, this.pathMode);
    }
}

