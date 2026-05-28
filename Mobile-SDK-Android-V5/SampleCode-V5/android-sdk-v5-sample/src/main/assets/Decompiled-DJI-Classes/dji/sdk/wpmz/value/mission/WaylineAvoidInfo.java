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
import dji.sdk.wpmz.value.mission.WaylineMissionAvoidAroundMode;
import dji.sdk.wpmz.value.mission.WaylineTransitionalAvoidAroundMode;
import java.util.Objects;
import org.json.JSONObject;

public class WaylineAvoidInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WaylineTransitionalAvoidAroundMode transitionalAvoidAroundMode = WaylineTransitionalAvoidAroundMode.UNKNOWN;
    WaylineMissionAvoidAroundMode missionAvoidAroundMode = WaylineMissionAvoidAroundMode.UNKNOWN;

    public WaylineAvoidInfo() {
    }

    public WaylineAvoidInfo(WaylineTransitionalAvoidAroundMode transitionalAvoidAroundMode, WaylineMissionAvoidAroundMode missionAvoidAroundMode) {
        if (transitionalAvoidAroundMode != null) {
            this.transitionalAvoidAroundMode = transitionalAvoidAroundMode;
        }
        if (missionAvoidAroundMode != null) {
            this.missionAvoidAroundMode = missionAvoidAroundMode;
        }
    }

    public static WaylineAvoidInfo fromJson(String jsonString) {
        WaylineAvoidInfo tmpValueResult_ = new WaylineAvoidInfo();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.transitionalAvoidAroundMode = WaylineTransitionalAvoidAroundMode.find(jsonObj.getInt("transitionalAvoidAroundMode"));
            tmpValueResult_.missionAvoidAroundMode = WaylineMissionAvoidAroundMode.find(jsonObj.getInt("missionAvoidAroundMode"));
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
            if (null != this.transitionalAvoidAroundMode) {
                json.put("transitionalAvoidAroundMode", this.transitionalAvoidAroundMode.value());
            }
            if (null != this.missionAvoidAroundMode) {
                json.put("missionAvoidAroundMode", this.missionAvoidAroundMode.value());
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
        serializedLength += ByteStreamHelper.integerGetLength(this.transitionalAvoidAroundMode.value());
        return serializedLength += ByteStreamHelper.integerGetLength(this.missionAvoidAroundMode.value());
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.transitionalAvoidAroundMode.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.missionAvoidAroundMode.value(), serializedIndex);
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
        ByteResult<Integer> tmpTransitionalAvoidAroundMode = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.transitionalAvoidAroundMode = WaylineTransitionalAvoidAroundMode.find((Integer)tmpTransitionalAvoidAroundMode.result);
        deserilizationIndex = tmpTransitionalAvoidAroundMode.endIndex;
        ByteResult<Integer> tmpMissionAvoidAroundMode = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.missionAvoidAroundMode = WaylineMissionAvoidAroundMode.find((Integer)tmpMissionAvoidAroundMode.result);
        deserilizationIndex = tmpMissionAvoidAroundMode.endIndex;
        return deserilizationIndex;
    }

    public WaylineTransitionalAvoidAroundMode getTransitionalAvoidAroundMode() {
        return this.transitionalAvoidAroundMode;
    }

    public void setTransitionalAvoidAroundMode(WaylineTransitionalAvoidAroundMode transitionalAvoidAroundMode) {
        this.transitionalAvoidAroundMode = transitionalAvoidAroundMode;
    }

    public WaylineMissionAvoidAroundMode getMissionAvoidAroundMode() {
        return this.missionAvoidAroundMode;
    }

    public void setMissionAvoidAroundMode(WaylineMissionAvoidAroundMode missionAvoidAroundMode) {
        this.missionAvoidAroundMode = missionAvoidAroundMode;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineAvoidInfo)) {
            return false;
        }
        WaylineAvoidInfo that = (WaylineAvoidInfo)o;
        return Objects.equals(this.transitionalAvoidAroundMode, that.transitionalAvoidAroundMode) && Objects.equals(this.missionAvoidAroundMode, that.missionAvoidAroundMode);
    }

    public int hashCode() {
        return Objects.hash(this.transitionalAvoidAroundMode, this.missionAvoidAroundMode);
    }
}

