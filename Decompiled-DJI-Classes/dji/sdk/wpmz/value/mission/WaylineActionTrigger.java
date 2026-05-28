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
import dji.sdk.wpmz.value.mission.WaylineActionTriggerType;
import java.util.Objects;
import org.json.JSONObject;

public class WaylineActionTrigger
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WaylineActionTriggerType triggerType = WaylineActionTriggerType.UNKNOWN;
    Double timeInterval = 0.0;
    Double distanceInterval = 0.0;

    public WaylineActionTrigger() {
    }

    public WaylineActionTrigger(WaylineActionTriggerType triggerType, Double timeInterval, Double distanceInterval) {
        if (triggerType != null) {
            this.triggerType = triggerType;
        }
        if (timeInterval != null) {
            this.timeInterval = timeInterval;
        }
        if (distanceInterval != null) {
            this.distanceInterval = distanceInterval;
        }
    }

    public static WaylineActionTrigger fromJson(String jsonString) {
        WaylineActionTrigger tmpValueResult_ = new WaylineActionTrigger();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.triggerType = WaylineActionTriggerType.find(jsonObj.getInt("triggerType"));
            tmpValueResult_.timeInterval = jsonObj.getDouble("timeInterval");
            tmpValueResult_.distanceInterval = jsonObj.getDouble("distanceInterval");
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
            if (null != this.triggerType) {
                json.put("triggerType", this.triggerType.value());
            }
            if (null != this.timeInterval) {
                json.put("timeInterval", (Object)this.timeInterval);
            }
            if (null != this.distanceInterval) {
                json.put("distanceInterval", (Object)this.distanceInterval);
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
        serializedLength += ByteStreamHelper.integerGetLength(this.triggerType.value());
        serializedLength += ByteStreamHelper.doubleGetLength(this.timeInterval);
        return serializedLength += ByteStreamHelper.doubleGetLength(this.distanceInterval);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.triggerType.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.timeInterval, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.distanceInterval, serializedIndex);
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
        ByteResult<Integer> tmpTriggerType = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.triggerType = WaylineActionTriggerType.find((Integer)tmpTriggerType.result);
        deserilizationIndex = tmpTriggerType.endIndex;
        ByteResult<Double> tmpTimeInterval = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.timeInterval = (Double)tmpTimeInterval.result;
        deserilizationIndex = tmpTimeInterval.endIndex;
        ByteResult<Double> tmpDistanceInterval = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.distanceInterval = (Double)tmpDistanceInterval.result;
        deserilizationIndex = tmpDistanceInterval.endIndex;
        return deserilizationIndex;
    }

    public WaylineActionTriggerType getTriggerType() {
        return this.triggerType;
    }

    public void setTriggerType(WaylineActionTriggerType triggerType) {
        this.triggerType = triggerType;
    }

    public Double getTimeInterval() {
        return this.timeInterval;
    }

    public void setTimeInterval(Double timeInterval) {
        this.timeInterval = timeInterval;
    }

    public Double getDistanceInterval() {
        return this.distanceInterval;
    }

    public void setDistanceInterval(Double distanceInterval) {
        this.distanceInterval = distanceInterval;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineActionTrigger)) {
            return false;
        }
        WaylineActionTrigger that = (WaylineActionTrigger)o;
        return Objects.equals(this.triggerType, that.triggerType) && Objects.equals(this.timeInterval, that.timeInterval) && Objects.equals(this.distanceInterval, that.distanceInterval);
    }

    public int hashCode() {
        return Objects.hash(this.triggerType, this.timeInterval, this.distanceInterval);
    }
}

