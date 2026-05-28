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

public class ActionHoistUnloadParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double aboveGroundHeightM = 0.0;
    Integer retryLimit = 0;

    public ActionHoistUnloadParam() {
    }

    public ActionHoistUnloadParam(Double aboveGroundHeightM, Integer retryLimit) {
        if (aboveGroundHeightM != null) {
            this.aboveGroundHeightM = aboveGroundHeightM;
        }
        if (retryLimit != null) {
            this.retryLimit = retryLimit;
        }
    }

    public static ActionHoistUnloadParam fromJson(String jsonString) {
        ActionHoistUnloadParam tmpValueResult_ = new ActionHoistUnloadParam();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.aboveGroundHeightM = jsonObj.getDouble("aboveGroundHeightM");
            tmpValueResult_.retryLimit = jsonObj.getInt("retryLimit");
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
            if (null != this.aboveGroundHeightM) {
                json.put("aboveGroundHeightM", (Object)this.aboveGroundHeightM);
            }
            if (null != this.retryLimit) {
                json.put("retryLimit", (Object)this.retryLimit);
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
        serializedLength += ByteStreamHelper.doubleGetLength(this.aboveGroundHeightM);
        return serializedLength += ByteStreamHelper.integerGetLength(this.retryLimit);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.aboveGroundHeightM, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.retryLimit, serializedIndex);
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
        ByteResult<Double> tmpAboveGroundHeightM = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.aboveGroundHeightM = (Double)tmpAboveGroundHeightM.result;
        deserilizationIndex = tmpAboveGroundHeightM.endIndex;
        ByteResult<Integer> tmpRetryLimit = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.retryLimit = (Integer)tmpRetryLimit.result;
        deserilizationIndex = tmpRetryLimit.endIndex;
        return deserilizationIndex;
    }

    public Double getAboveGroundHeightM() {
        return this.aboveGroundHeightM;
    }

    public void setAboveGroundHeightM(Double aboveGroundHeightM) {
        this.aboveGroundHeightM = aboveGroundHeightM;
    }

    public Integer getRetryLimit() {
        return this.retryLimit;
    }

    public void setRetryLimit(Integer retryLimit) {
        this.retryLimit = retryLimit;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActionHoistUnloadParam)) {
            return false;
        }
        ActionHoistUnloadParam that = (ActionHoistUnloadParam)o;
        return Objects.equals(this.aboveGroundHeightM, that.aboveGroundHeightM) && Objects.equals(this.retryLimit, that.retryLimit);
    }

    public int hashCode() {
        return Objects.hash(this.aboveGroundHeightM, this.retryLimit);
    }
}

