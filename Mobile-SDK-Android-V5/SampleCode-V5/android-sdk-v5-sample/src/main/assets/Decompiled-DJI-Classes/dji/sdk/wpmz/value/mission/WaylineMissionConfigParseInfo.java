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
import dji.sdk.wpmz.value.mission.WaylineMissionConfig;
import java.util.Objects;
import org.json.JSONObject;

public class WaylineMissionConfigParseInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WPMLParseErrorMsg error;
    WaylineMissionConfig config;

    public WaylineMissionConfigParseInfo() {
    }

    public WaylineMissionConfigParseInfo(WPMLParseErrorMsg error, WaylineMissionConfig config) {
        if (error != null) {
            this.error = error;
        }
        if (config != null) {
            this.config = config;
        }
    }

    public static WaylineMissionConfigParseInfo fromJson(String jsonString) {
        WaylineMissionConfigParseInfo tmpValueResult_ = new WaylineMissionConfigParseInfo();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.error = WPMLParseErrorMsg.fromJson(jsonObj.getJSONObject("error").toString());
            tmpValueResult_.config = WaylineMissionConfig.fromJson(jsonObj.getJSONObject("config").toString());
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
            if (null != this.config) {
                json.put("config", (Object)this.config.toJson());
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
        return serializedLength += ByteStreamHelper.getLength(this.config, WaylineMissionConfig.class);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.error, serializedIndex, WPMLParseErrorMsg.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.config, serializedIndex, WaylineMissionConfig.class);
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
        ByteResult<WaylineMissionConfig> tmpConfig = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineMissionConfig.class);
        this.config = (WaylineMissionConfig)tmpConfig.result;
        deserilizationIndex = tmpConfig.endIndex;
        return deserilizationIndex;
    }

    public WPMLParseErrorMsg getError() {
        return this.error;
    }

    public void setError(WPMLParseErrorMsg error) {
        this.error = error;
    }

    public WaylineMissionConfig getConfig() {
        return this.config;
    }

    public void setConfig(WaylineMissionConfig config) {
        this.config = config;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineMissionConfigParseInfo)) {
            return false;
        }
        WaylineMissionConfigParseInfo that = (WaylineMissionConfigParseInfo)o;
        return Objects.equals(this.error, that.error) && Objects.equals(this.config, that.config);
    }

    public int hashCode() {
        return Objects.hash(this.error, this.config);
    }
}

