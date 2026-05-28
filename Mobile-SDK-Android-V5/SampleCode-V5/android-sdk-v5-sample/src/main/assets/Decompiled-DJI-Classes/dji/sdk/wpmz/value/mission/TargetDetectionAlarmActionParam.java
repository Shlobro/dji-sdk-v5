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
import dji.sdk.wpmz.value.mission.TargetDetectionAlarmActionType;
import java.util.Objects;
import org.json.JSONObject;

public class TargetDetectionAlarmActionParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    TargetDetectionAlarmActionType actionType = TargetDetectionAlarmActionType.UNKNOWN;
    Integer maxDuration = 0;

    public TargetDetectionAlarmActionParam() {
    }

    public TargetDetectionAlarmActionParam(TargetDetectionAlarmActionType actionType, Integer maxDuration) {
        if (actionType != null) {
            this.actionType = actionType;
        }
        if (maxDuration != null) {
            this.maxDuration = maxDuration;
        }
    }

    public static TargetDetectionAlarmActionParam fromJson(String jsonString) {
        TargetDetectionAlarmActionParam tmpValueResult_ = new TargetDetectionAlarmActionParam();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.actionType = TargetDetectionAlarmActionType.find(jsonObj.getInt("actionType"));
            tmpValueResult_.maxDuration = jsonObj.getInt("maxDuration");
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
            if (null != this.actionType) {
                json.put("actionType", this.actionType.value());
            }
            if (null != this.maxDuration) {
                json.put("maxDuration", (Object)this.maxDuration);
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
        serializedLength += ByteStreamHelper.integerGetLength(this.actionType.value());
        return serializedLength += ByteStreamHelper.integerGetLength(this.maxDuration);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.actionType.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.maxDuration, serializedIndex);
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
        ByteResult<Integer> tmpActionType = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.actionType = TargetDetectionAlarmActionType.find((Integer)tmpActionType.result);
        deserilizationIndex = tmpActionType.endIndex;
        ByteResult<Integer> tmpMaxDuration = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.maxDuration = (Integer)tmpMaxDuration.result;
        deserilizationIndex = tmpMaxDuration.endIndex;
        return deserilizationIndex;
    }

    public TargetDetectionAlarmActionType getActionType() {
        return this.actionType;
    }

    public void setActionType(TargetDetectionAlarmActionType actionType) {
        this.actionType = actionType;
    }

    public Integer getMaxDuration() {
        return this.maxDuration;
    }

    public void setMaxDuration(Integer maxDuration) {
        this.maxDuration = maxDuration;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TargetDetectionAlarmActionParam)) {
            return false;
        }
        TargetDetectionAlarmActionParam that = (TargetDetectionAlarmActionParam)o;
        return Objects.equals(this.actionType, that.actionType) && Objects.equals(this.maxDuration, that.maxDuration);
    }

    public int hashCode() {
        return Objects.hash(this.actionType, this.maxDuration);
    }
}

