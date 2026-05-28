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

public class ActionAircraftFlyControlParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer startStopMode = 0;

    public ActionAircraftFlyControlParam() {
    }

    public ActionAircraftFlyControlParam(Integer startStopMode) {
        if (startStopMode != null) {
            this.startStopMode = startStopMode;
        }
    }

    public static ActionAircraftFlyControlParam fromJson(String jsonString) {
        ActionAircraftFlyControlParam tmpValueResult_ = new ActionAircraftFlyControlParam();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.startStopMode = jsonObj.getInt("startStopMode");
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
            if (null != this.startStopMode) {
                json.put("startStopMode", (Object)this.startStopMode);
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
        return serializedLength += ByteStreamHelper.integerGetLength(this.startStopMode);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.startStopMode, serializedIndex);
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
        ByteResult<Integer> tmpStartStopMode = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.startStopMode = (Integer)tmpStartStopMode.result;
        deserilizationIndex = tmpStartStopMode.endIndex;
        return deserilizationIndex;
    }

    public Integer getStartStopMode() {
        return this.startStopMode;
    }

    public void setStartStopMode(Integer startStopMode) {
        this.startStopMode = startStopMode;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActionAircraftFlyControlParam)) {
            return false;
        }
        ActionAircraftFlyControlParam that = (ActionAircraftFlyControlParam)o;
        return Objects.equals(this.startStopMode, that.startStopMode);
    }

    public int hashCode() {
        return Objects.hash(this.startStopMode);
    }
}

