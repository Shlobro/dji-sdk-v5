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

public class ActionAircraftHoverParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double hoverTime = 0.0;

    public ActionAircraftHoverParam() {
    }

    public ActionAircraftHoverParam(Double hoverTime) {
        if (hoverTime != null) {
            this.hoverTime = hoverTime;
        }
    }

    public static ActionAircraftHoverParam fromJson(String jsonString) {
        ActionAircraftHoverParam tmpValueResult_ = new ActionAircraftHoverParam();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.hoverTime = jsonObj.getDouble("hoverTime");
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
            if (null != this.hoverTime) {
                json.put("hoverTime", (Object)this.hoverTime);
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
        return serializedLength += ByteStreamHelper.doubleGetLength(this.hoverTime);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.hoverTime, serializedIndex);
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
        ByteResult<Double> tmpHoverTime = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.hoverTime = (Double)tmpHoverTime.result;
        deserilizationIndex = tmpHoverTime.endIndex;
        return deserilizationIndex;
    }

    public Double getHoverTime() {
        return this.hoverTime;
    }

    public void setHoverTime(Double hoverTime) {
        this.hoverTime = hoverTime;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActionAircraftHoverParam)) {
            return false;
        }
        ActionAircraftHoverParam that = (ActionAircraftHoverParam)o;
        return Objects.equals(this.hoverTime, that.hoverTime);
    }

    public int hashCode() {
        return Objects.hash(this.hoverTime);
    }
}

