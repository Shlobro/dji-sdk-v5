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
import dji.sdk.wpmz.value.mission.WaylineWaypointTurnMode;
import java.util.Objects;
import org.json.JSONObject;

public class WaylineWaypointTurnParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WaylineWaypointTurnMode turnMode = WaylineWaypointTurnMode.UNKNOWN;
    Double turnDampingDistance = 0.0;

    public WaylineWaypointTurnParam() {
    }

    public WaylineWaypointTurnParam(WaylineWaypointTurnMode turnMode, Double turnDampingDistance) {
        if (turnMode != null) {
            this.turnMode = turnMode;
        }
        if (turnDampingDistance != null) {
            this.turnDampingDistance = turnDampingDistance;
        }
    }

    public static WaylineWaypointTurnParam fromJson(String jsonString) {
        WaylineWaypointTurnParam tmpValueResult_ = new WaylineWaypointTurnParam();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.turnMode = WaylineWaypointTurnMode.find(jsonObj.getInt("turnMode"));
            tmpValueResult_.turnDampingDistance = jsonObj.getDouble("turnDampingDistance");
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
            if (null != this.turnMode) {
                json.put("turnMode", this.turnMode.value());
            }
            if (null != this.turnDampingDistance) {
                json.put("turnDampingDistance", (Object)this.turnDampingDistance);
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
        serializedLength += ByteStreamHelper.integerGetLength(this.turnMode.value());
        return serializedLength += ByteStreamHelper.doubleGetLength(this.turnDampingDistance);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.turnMode.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.turnDampingDistance, serializedIndex);
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
        ByteResult<Integer> tmpTurnMode = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.turnMode = WaylineWaypointTurnMode.find((Integer)tmpTurnMode.result);
        deserilizationIndex = tmpTurnMode.endIndex;
        ByteResult<Double> tmpTurnDampingDistance = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.turnDampingDistance = (Double)tmpTurnDampingDistance.result;
        deserilizationIndex = tmpTurnDampingDistance.endIndex;
        return deserilizationIndex;
    }

    public WaylineWaypointTurnMode getTurnMode() {
        return this.turnMode;
    }

    public void setTurnMode(WaylineWaypointTurnMode turnMode) {
        this.turnMode = turnMode;
    }

    public Double getTurnDampingDistance() {
        return this.turnDampingDistance;
    }

    public void setTurnDampingDistance(Double turnDampingDistance) {
        this.turnDampingDistance = turnDampingDistance;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineWaypointTurnParam)) {
            return false;
        }
        WaylineWaypointTurnParam that = (WaylineWaypointTurnParam)o;
        return Objects.equals(this.turnMode, that.turnMode) && Objects.equals(this.turnDampingDistance, that.turnDampingDistance);
    }

    public int hashCode() {
        return Objects.hash(this.turnMode, this.turnDampingDistance);
    }
}

