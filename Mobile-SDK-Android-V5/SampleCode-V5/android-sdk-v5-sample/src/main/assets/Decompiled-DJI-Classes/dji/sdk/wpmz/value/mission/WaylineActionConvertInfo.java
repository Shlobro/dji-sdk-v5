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
import dji.sdk.wpmz.value.mission.WaylineActionInfo;
import dji.sdk.wpmz.value.mission.WaylineAircraftConvertInvalidValueInfo;
import java.util.Objects;
import org.json.JSONObject;

public class WaylineActionConvertInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WaylineActionInfo action;
    Boolean isInvalid = false;
    WaylineAircraftConvertInvalidValueInfo invalidInfo;

    public WaylineActionConvertInfo() {
    }

    public WaylineActionConvertInfo(WaylineActionInfo action, Boolean isInvalid, WaylineAircraftConvertInvalidValueInfo invalidInfo) {
        if (action != null) {
            this.action = action;
        }
        if (isInvalid != null) {
            this.isInvalid = isInvalid;
        }
        if (invalidInfo != null) {
            this.invalidInfo = invalidInfo;
        }
    }

    public static WaylineActionConvertInfo fromJson(String jsonString) {
        WaylineActionConvertInfo tmpValueResult_ = new WaylineActionConvertInfo();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.action = WaylineActionInfo.fromJson(jsonObj.getJSONObject("action").toString());
            tmpValueResult_.isInvalid = jsonObj.getBoolean("isInvalid");
            tmpValueResult_.invalidInfo = WaylineAircraftConvertInvalidValueInfo.fromJson(jsonObj.getJSONObject("invalidInfo").toString());
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
            if (null != this.action) {
                json.put("action", (Object)this.action.toJson());
            }
            if (null != this.isInvalid) {
                json.put("isInvalid", (Object)this.isInvalid);
            }
            if (null != this.invalidInfo) {
                json.put("invalidInfo", (Object)this.invalidInfo.toJson());
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
        serializedLength += ByteStreamHelper.getLength(this.action, WaylineActionInfo.class);
        serializedLength += ByteStreamHelper.booleanGetLength(this.isInvalid);
        return serializedLength += ByteStreamHelper.getLength(this.invalidInfo, WaylineAircraftConvertInvalidValueInfo.class);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.action, serializedIndex, WaylineActionInfo.class);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isInvalid, serializedIndex);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.invalidInfo, serializedIndex, WaylineAircraftConvertInvalidValueInfo.class);
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
        ByteResult<WaylineActionInfo> tmpAction = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineActionInfo.class);
        this.action = (WaylineActionInfo)tmpAction.result;
        deserilizationIndex = tmpAction.endIndex;
        ByteResult<Boolean> tmpIsInvalid = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isInvalid = (Boolean)tmpIsInvalid.result;
        deserilizationIndex = tmpIsInvalid.endIndex;
        ByteResult<WaylineAircraftConvertInvalidValueInfo> tmpInvalidInfo = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineAircraftConvertInvalidValueInfo.class);
        this.invalidInfo = (WaylineAircraftConvertInvalidValueInfo)tmpInvalidInfo.result;
        deserilizationIndex = tmpInvalidInfo.endIndex;
        return deserilizationIndex;
    }

    public WaylineActionInfo getAction() {
        return this.action;
    }

    public void setAction(WaylineActionInfo action) {
        this.action = action;
    }

    public Boolean getIsInvalid() {
        return this.isInvalid;
    }

    public void setIsInvalid(Boolean isInvalid) {
        this.isInvalid = isInvalid;
    }

    public WaylineAircraftConvertInvalidValueInfo getInvalidInfo() {
        return this.invalidInfo;
    }

    public void setInvalidInfo(WaylineAircraftConvertInvalidValueInfo invalidInfo) {
        this.invalidInfo = invalidInfo;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineActionConvertInfo)) {
            return false;
        }
        WaylineActionConvertInfo that = (WaylineActionConvertInfo)o;
        return Objects.equals(this.action, that.action) && Objects.equals(this.isInvalid, that.isInvalid) && Objects.equals(this.invalidInfo, that.invalidInfo);
    }

    public int hashCode() {
        return Objects.hash(this.action, this.isInvalid, this.invalidInfo);
    }
}

