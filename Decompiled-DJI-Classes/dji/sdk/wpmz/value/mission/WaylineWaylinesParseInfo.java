/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;
import dji.sdk.wpmz.value.ByteResult;
import dji.sdk.wpmz.value.ByteStream;
import dji.sdk.wpmz.value.ByteStreamHelper;
import dji.sdk.wpmz.value.base.DJIValue;
import dji.sdk.wpmz.value.mission.WPMLParseErrorMsg;
import dji.sdk.wpmz.value.mission.Wayline;
import dji.sdk.wpmz.value.mission.WaylineExecuteMissionConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class WaylineWaylinesParseInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WPMLParseErrorMsg error;
    WaylineExecuteMissionConfig config;
    List<Wayline> waylines = new ArrayList<Wayline>();

    public WaylineWaylinesParseInfo() {
    }

    public WaylineWaylinesParseInfo(WPMLParseErrorMsg error, WaylineExecuteMissionConfig config, List<Wayline> waylines) {
        if (error != null) {
            this.error = error;
        }
        if (config != null) {
            this.config = config;
        }
        if (waylines != null) {
            this.waylines = waylines;
        }
    }

    public static WaylineWaylinesParseInfo fromJson(String jsonString) {
        WaylineWaylinesParseInfo tmpValueResult_ = new WaylineWaylinesParseInfo();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.error = WPMLParseErrorMsg.fromJson(jsonObj.getJSONObject("error").toString());
            tmpValueResult_.config = WaylineExecuteMissionConfig.fromJson(jsonObj.getJSONObject("config").toString());
            JSONArray waylinesJsonArr = jsonObj.getJSONArray("waylines");
            for (int i = 0; i < waylinesJsonArr.length(); ++i) {
                tmpValueResult_.waylines.add(Wayline.fromJson(waylinesJsonArr.getString(i)));
            }
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
            if (null != this.waylines) {
                JSONArray json_arr_waylines = new JSONArray();
                for (int i = 0; i < this.waylines.size(); ++i) {
                    json_arr_waylines.put((Object)this.waylines.get(i).toJson());
                }
                json.put("waylines", (Object)json_arr_waylines);
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
        serializedLength += ByteStreamHelper.getLength(this.config, WaylineExecuteMissionConfig.class);
        return serializedLength += ByteStreamHelper.arrayGetLength(this.waylines);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.error, serializedIndex, WPMLParseErrorMsg.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.config, serializedIndex, WaylineExecuteMissionConfig.class);
        serializedIndex = ByteStreamHelper.arrayToBytes(resultBytes, this.waylines, serializedIndex);
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
        ByteResult<WaylineExecuteMissionConfig> tmpConfig = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineExecuteMissionConfig.class);
        this.config = (WaylineExecuteMissionConfig)tmpConfig.result;
        deserilizationIndex = tmpConfig.endIndex;
        ByteResult<List<Wayline>> tmpWaylines = ByteStreamHelper.arrayFromBytes(data, deserilizationIndex, Wayline.class);
        this.waylines = (List)tmpWaylines.result;
        deserilizationIndex = tmpWaylines.endIndex;
        return deserilizationIndex;
    }

    public WPMLParseErrorMsg getError() {
        return this.error;
    }

    public void setError(WPMLParseErrorMsg error) {
        this.error = error;
    }

    public WaylineExecuteMissionConfig getConfig() {
        return this.config;
    }

    public void setConfig(WaylineExecuteMissionConfig config) {
        this.config = config;
    }

    public List<Wayline> getWaylines() {
        return this.waylines;
    }

    public void setWaylines(List<Wayline> waylines) {
        this.waylines = waylines;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineWaylinesParseInfo)) {
            return false;
        }
        WaylineWaylinesParseInfo that = (WaylineWaylinesParseInfo)o;
        return Objects.equals(this.error, that.error) && Objects.equals(this.config, that.config) && Objects.equals(this.waylines, that.waylines);
    }

    public int hashCode() {
        return Objects.hash(this.error, this.config, this.waylines);
    }
}

