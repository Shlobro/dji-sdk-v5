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
import dji.sdk.wpmz.value.mission.TargetDetectionTargetType;
import java.util.Objects;
import org.json.JSONObject;

public class TargetDetectionTargetParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    TargetDetectionTargetType targetType = TargetDetectionTargetType.UNKNOWN;
    Boolean useMaxThreshold = false;
    Boolean useMinThreshold = false;
    Integer maxThreshold = 0;
    Integer minThreshold = 0;

    public TargetDetectionTargetParam() {
    }

    public TargetDetectionTargetParam(TargetDetectionTargetType targetType, Boolean useMaxThreshold, Boolean useMinThreshold, Integer maxThreshold, Integer minThreshold) {
        if (targetType != null) {
            this.targetType = targetType;
        }
        if (useMaxThreshold != null) {
            this.useMaxThreshold = useMaxThreshold;
        }
        if (useMinThreshold != null) {
            this.useMinThreshold = useMinThreshold;
        }
        if (maxThreshold != null) {
            this.maxThreshold = maxThreshold;
        }
        if (minThreshold != null) {
            this.minThreshold = minThreshold;
        }
    }

    public static TargetDetectionTargetParam fromJson(String jsonString) {
        TargetDetectionTargetParam tmpValueResult_ = new TargetDetectionTargetParam();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.targetType = TargetDetectionTargetType.find(jsonObj.getInt("targetType"));
            tmpValueResult_.useMaxThreshold = jsonObj.getBoolean("useMaxThreshold");
            tmpValueResult_.useMinThreshold = jsonObj.getBoolean("useMinThreshold");
            tmpValueResult_.maxThreshold = jsonObj.getInt("maxThreshold");
            tmpValueResult_.minThreshold = jsonObj.getInt("minThreshold");
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
            if (null != this.targetType) {
                json.put("targetType", this.targetType.value());
            }
            if (null != this.useMaxThreshold) {
                json.put("useMaxThreshold", (Object)this.useMaxThreshold);
            }
            if (null != this.useMinThreshold) {
                json.put("useMinThreshold", (Object)this.useMinThreshold);
            }
            if (null != this.maxThreshold) {
                json.put("maxThreshold", (Object)this.maxThreshold);
            }
            if (null != this.minThreshold) {
                json.put("minThreshold", (Object)this.minThreshold);
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
        serializedLength += ByteStreamHelper.integerGetLength(this.targetType.value());
        serializedLength += ByteStreamHelper.booleanGetLength(this.useMaxThreshold);
        serializedLength += ByteStreamHelper.booleanGetLength(this.useMinThreshold);
        serializedLength += ByteStreamHelper.integerGetLength(this.maxThreshold);
        return serializedLength += ByteStreamHelper.integerGetLength(this.minThreshold);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.targetType.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.useMaxThreshold, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.useMinThreshold, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.maxThreshold, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.minThreshold, serializedIndex);
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
        ByteResult<Integer> tmpTargetType = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.targetType = TargetDetectionTargetType.find((Integer)tmpTargetType.result);
        deserilizationIndex = tmpTargetType.endIndex;
        ByteResult<Boolean> tmpUseMaxThreshold = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.useMaxThreshold = (Boolean)tmpUseMaxThreshold.result;
        deserilizationIndex = tmpUseMaxThreshold.endIndex;
        ByteResult<Boolean> tmpUseMinThreshold = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.useMinThreshold = (Boolean)tmpUseMinThreshold.result;
        deserilizationIndex = tmpUseMinThreshold.endIndex;
        ByteResult<Integer> tmpMaxThreshold = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.maxThreshold = (Integer)tmpMaxThreshold.result;
        deserilizationIndex = tmpMaxThreshold.endIndex;
        ByteResult<Integer> tmpMinThreshold = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.minThreshold = (Integer)tmpMinThreshold.result;
        deserilizationIndex = tmpMinThreshold.endIndex;
        return deserilizationIndex;
    }

    public TargetDetectionTargetType getTargetType() {
        return this.targetType;
    }

    public void setTargetType(TargetDetectionTargetType targetType) {
        this.targetType = targetType;
    }

    public Boolean getUseMaxThreshold() {
        return this.useMaxThreshold;
    }

    public void setUseMaxThreshold(Boolean useMaxThreshold) {
        this.useMaxThreshold = useMaxThreshold;
    }

    public Boolean getUseMinThreshold() {
        return this.useMinThreshold;
    }

    public void setUseMinThreshold(Boolean useMinThreshold) {
        this.useMinThreshold = useMinThreshold;
    }

    public Integer getMaxThreshold() {
        return this.maxThreshold;
    }

    public void setMaxThreshold(Integer maxThreshold) {
        this.maxThreshold = maxThreshold;
    }

    public Integer getMinThreshold() {
        return this.minThreshold;
    }

    public void setMinThreshold(Integer minThreshold) {
        this.minThreshold = minThreshold;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TargetDetectionTargetParam)) {
            return false;
        }
        TargetDetectionTargetParam that = (TargetDetectionTargetParam)o;
        return Objects.equals(this.targetType, that.targetType) && Objects.equals(this.useMaxThreshold, that.useMaxThreshold) && Objects.equals(this.useMinThreshold, that.useMinThreshold) && Objects.equals(this.maxThreshold, that.maxThreshold) && Objects.equals(this.minThreshold, that.minThreshold);
    }

    public int hashCode() {
        return Objects.hash(this.targetType, this.useMaxThreshold, this.useMinThreshold, this.maxThreshold, this.minThreshold);
    }
}

