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
import dji.sdk.wpmz.value.mission.WaylineTemplate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class WaylineTemplatesParseInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WPMLParseErrorMsg error;
    List<WaylineTemplate> templates = new ArrayList<WaylineTemplate>();

    public WaylineTemplatesParseInfo() {
    }

    public WaylineTemplatesParseInfo(WPMLParseErrorMsg error, List<WaylineTemplate> templates) {
        if (error != null) {
            this.error = error;
        }
        if (templates != null) {
            this.templates = templates;
        }
    }

    public static WaylineTemplatesParseInfo fromJson(String jsonString) {
        WaylineTemplatesParseInfo tmpValueResult_ = new WaylineTemplatesParseInfo();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.error = WPMLParseErrorMsg.fromJson(jsonObj.getJSONObject("error").toString());
            JSONArray templatesJsonArr = jsonObj.getJSONArray("templates");
            for (int i = 0; i < templatesJsonArr.length(); ++i) {
                tmpValueResult_.templates.add(WaylineTemplate.fromJson(templatesJsonArr.getString(i)));
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
            if (null != this.templates) {
                JSONArray json_arr_templates = new JSONArray();
                for (int i = 0; i < this.templates.size(); ++i) {
                    json_arr_templates.put((Object)this.templates.get(i).toJson());
                }
                json.put("templates", (Object)json_arr_templates);
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
        return serializedLength += ByteStreamHelper.arrayGetLength(this.templates);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.error, serializedIndex, WPMLParseErrorMsg.class);
        serializedIndex = ByteStreamHelper.arrayToBytes(resultBytes, this.templates, serializedIndex);
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
        ByteResult<List<WaylineTemplate>> tmpTemplates = ByteStreamHelper.arrayFromBytes(data, deserilizationIndex, WaylineTemplate.class);
        this.templates = (List)tmpTemplates.result;
        deserilizationIndex = tmpTemplates.endIndex;
        return deserilizationIndex;
    }

    public WPMLParseErrorMsg getError() {
        return this.error;
    }

    public void setError(WPMLParseErrorMsg error) {
        this.error = error;
    }

    public List<WaylineTemplate> getTemplates() {
        return this.templates;
    }

    public void setTemplates(List<WaylineTemplate> templates) {
        this.templates = templates;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineTemplatesParseInfo)) {
            return false;
        }
        WaylineTemplatesParseInfo that = (WaylineTemplatesParseInfo)o;
        return Objects.equals(this.error, that.error) && Objects.equals(this.templates, that.templates);
    }

    public int hashCode() {
        return Objects.hash(this.error, this.templates);
    }
}

