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
import java.util.Objects;
import org.json.JSONObject;

public class ActionAircraftCaliParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer caliTimes = 0;
    Double caliDistance = 0.0;
    Boolean heading = false;

    public ActionAircraftCaliParam() {
    }

    public ActionAircraftCaliParam(Integer caliTimes, Double caliDistance, Boolean heading) {
        if (caliTimes != null) {
            this.caliTimes = caliTimes;
        }
        if (caliDistance != null) {
            this.caliDistance = caliDistance;
        }
        if (heading != null) {
            this.heading = heading;
        }
    }

    public static ActionAircraftCaliParam fromJson(String jsonString) {
        ActionAircraftCaliParam tmpValueResult_ = new ActionAircraftCaliParam();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.caliTimes = jsonObj.getInt("caliTimes");
            tmpValueResult_.caliDistance = jsonObj.getDouble("caliDistance");
            tmpValueResult_.heading = jsonObj.getBoolean("heading");
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
            if (null != this.caliTimes) {
                json.put("caliTimes", (Object)this.caliTimes);
            }
            if (null != this.caliDistance) {
                json.put("caliDistance", (Object)this.caliDistance);
            }
            if (null != this.heading) {
                json.put("heading", (Object)this.heading);
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
        serializedLength += ByteStreamHelper.integerGetLength(this.caliTimes);
        serializedLength += ByteStreamHelper.doubleGetLength(this.caliDistance);
        return serializedLength += ByteStreamHelper.booleanGetLength(this.heading);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.caliTimes, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.caliDistance, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.heading, serializedIndex);
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
        ByteResult<Integer> tmpCaliTimes = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.caliTimes = (Integer)tmpCaliTimes.result;
        deserilizationIndex = tmpCaliTimes.endIndex;
        ByteResult<Double> tmpCaliDistance = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.caliDistance = (Double)tmpCaliDistance.result;
        deserilizationIndex = tmpCaliDistance.endIndex;
        ByteResult<Boolean> tmpHeading = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.heading = (Boolean)tmpHeading.result;
        deserilizationIndex = tmpHeading.endIndex;
        return deserilizationIndex;
    }

    public Integer getCaliTimes() {
        return this.caliTimes;
    }

    public void setCaliTimes(Integer caliTimes) {
        this.caliTimes = caliTimes;
    }

    public Double getCaliDistance() {
        return this.caliDistance;
    }

    public void setCaliDistance(Double caliDistance) {
        this.caliDistance = caliDistance;
    }

    public Boolean getHeading() {
        return this.heading;
    }

    public void setHeading(Boolean heading) {
        this.heading = heading;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActionAircraftCaliParam)) {
            return false;
        }
        ActionAircraftCaliParam that = (ActionAircraftCaliParam)o;
        return Objects.equals(this.caliTimes, that.caliTimes) && Objects.equals(this.caliDistance, that.caliDistance) && Objects.equals(this.heading, that.heading);
    }

    public int hashCode() {
        return Objects.hash(this.caliTimes, this.caliDistance, this.heading);
    }
}

