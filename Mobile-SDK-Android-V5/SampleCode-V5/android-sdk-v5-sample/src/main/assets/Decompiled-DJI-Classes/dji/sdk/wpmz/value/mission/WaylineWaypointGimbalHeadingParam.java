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
import dji.sdk.wpmz.value.mission.WaylineWaypointGimbalHeadingMode;
import java.util.Objects;
import org.json.JSONObject;

public class WaylineWaypointGimbalHeadingParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WaylineWaypointGimbalHeadingMode headingMode = WaylineWaypointGimbalHeadingMode.UNKNOWN;
    Double yawAngle = 0.0;
    Double pitchAngle = 0.0;

    public WaylineWaypointGimbalHeadingParam() {
    }

    public WaylineWaypointGimbalHeadingParam(WaylineWaypointGimbalHeadingMode headingMode, Double yawAngle, Double pitchAngle) {
        if (headingMode != null) {
            this.headingMode = headingMode;
        }
        if (yawAngle != null) {
            this.yawAngle = yawAngle;
        }
        if (pitchAngle != null) {
            this.pitchAngle = pitchAngle;
        }
    }

    public static WaylineWaypointGimbalHeadingParam fromJson(String jsonString) {
        WaylineWaypointGimbalHeadingParam tmpValueResult_ = new WaylineWaypointGimbalHeadingParam();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.headingMode = WaylineWaypointGimbalHeadingMode.find(jsonObj.getInt("headingMode"));
            tmpValueResult_.yawAngle = jsonObj.getDouble("yawAngle");
            tmpValueResult_.pitchAngle = jsonObj.getDouble("pitchAngle");
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
            if (null != this.headingMode) {
                json.put("headingMode", this.headingMode.value());
            }
            if (null != this.yawAngle) {
                json.put("yawAngle", (Object)this.yawAngle);
            }
            if (null != this.pitchAngle) {
                json.put("pitchAngle", (Object)this.pitchAngle);
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
        serializedLength += ByteStreamHelper.integerGetLength(this.headingMode.value());
        serializedLength += ByteStreamHelper.doubleGetLength(this.yawAngle);
        return serializedLength += ByteStreamHelper.doubleGetLength(this.pitchAngle);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.headingMode.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.yawAngle, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.pitchAngle, serializedIndex);
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
        ByteResult<Integer> tmpHeadingMode = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.headingMode = WaylineWaypointGimbalHeadingMode.find((Integer)tmpHeadingMode.result);
        deserilizationIndex = tmpHeadingMode.endIndex;
        ByteResult<Double> tmpYawAngle = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.yawAngle = (Double)tmpYawAngle.result;
        deserilizationIndex = tmpYawAngle.endIndex;
        ByteResult<Double> tmpPitchAngle = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.pitchAngle = (Double)tmpPitchAngle.result;
        deserilizationIndex = tmpPitchAngle.endIndex;
        return deserilizationIndex;
    }

    public WaylineWaypointGimbalHeadingMode getHeadingMode() {
        return this.headingMode;
    }

    public void setHeadingMode(WaylineWaypointGimbalHeadingMode headingMode) {
        this.headingMode = headingMode;
    }

    public Double getYawAngle() {
        return this.yawAngle;
    }

    public void setYawAngle(Double yawAngle) {
        this.yawAngle = yawAngle;
    }

    public Double getPitchAngle() {
        return this.pitchAngle;
    }

    public void setPitchAngle(Double pitchAngle) {
        this.pitchAngle = pitchAngle;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineWaypointGimbalHeadingParam)) {
            return false;
        }
        WaylineWaypointGimbalHeadingParam that = (WaylineWaypointGimbalHeadingParam)o;
        return Objects.equals(this.headingMode, that.headingMode) && Objects.equals(this.yawAngle, that.yawAngle) && Objects.equals(this.pitchAngle, that.pitchAngle);
    }

    public int hashCode() {
        return Objects.hash(this.headingMode, this.yawAngle, this.pitchAngle);
    }
}

