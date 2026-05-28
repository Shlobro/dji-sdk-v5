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
import dji.sdk.wpmz.value.mission.WPMLParseErrorMsg;
import dji.sdk.wpmz.value.mission.WaylineMission;
import java.util.Objects;
import org.json.JSONObject;

public class WaylineMissionParseInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WPMLParseErrorMsg error;
    WaylineMission mission;

    public WaylineMissionParseInfo() {
    }

    public WaylineMissionParseInfo(WPMLParseErrorMsg error, WaylineMission mission) {
        if (error != null) {
            this.error = error;
        }
        if (mission != null) {
            this.mission = mission;
        }
    }

    public static WaylineMissionParseInfo fromJson(String jsonString) {
        WaylineMissionParseInfo tmpValueResult_ = new WaylineMissionParseInfo();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.error = WPMLParseErrorMsg.fromJson(jsonObj.getJSONObject("error").toString());
            tmpValueResult_.mission = WaylineMission.fromJson(jsonObj.getJSONObject("mission").toString());
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
            if (null != this.error) {
                json.put("error", (Object)this.error.toJson());
            }
            if (null != this.mission) {
                json.put("mission", (Object)this.mission.toJson());
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
        serializedLength += ByteStreamHelper.getLength(this.error, WPMLParseErrorMsg.class);
        return serializedLength += ByteStreamHelper.getLength(this.mission, WaylineMission.class);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.error, serializedIndex, WPMLParseErrorMsg.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.mission, serializedIndex, WaylineMission.class);
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
        ByteResult<WPMLParseErrorMsg> tmpError = ByteStreamHelper.fromBytes(data, deserilizationIndex, WPMLParseErrorMsg.class);
        this.error = (WPMLParseErrorMsg)tmpError.result;
        deserilizationIndex = tmpError.endIndex;
        ByteResult<WaylineMission> tmpMission = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineMission.class);
        this.mission = (WaylineMission)tmpMission.result;
        deserilizationIndex = tmpMission.endIndex;
        return deserilizationIndex;
    }

    public WPMLParseErrorMsg getError() {
        return this.error;
    }

    public void setError(WPMLParseErrorMsg error) {
        this.error = error;
    }

    public WaylineMission getMission() {
        return this.mission;
    }

    public void setMission(WaylineMission mission) {
        this.mission = mission;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineMissionParseInfo)) {
            return false;
        }
        WaylineMissionParseInfo that = (WaylineMissionParseInfo)o;
        return Objects.equals(this.error, that.error) && Objects.equals(this.mission, that.mission);
    }

    public int hashCode() {
        return Objects.hash(this.error, this.mission);
    }
}

