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
import dji.sdk.wpmz.value.mission.WaylineAircraftConvertInvalidValueInfo;
import dji.sdk.wpmz.value.mission.WaylineMissionConfig;
import dji.sdk.wpmz.value.mission.WaylineTemplate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class WPMLAircraftConvertInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<WaylineTemplate> templates = new ArrayList<WaylineTemplate>();
    WaylineMissionConfig missionConfig;
    List<WaylineAircraftConvertInvalidValueInfo> invalidList = new ArrayList<WaylineAircraftConvertInvalidValueInfo>();

    public WPMLAircraftConvertInfo() {
    }

    public WPMLAircraftConvertInfo(List<WaylineTemplate> templates, WaylineMissionConfig missionConfig, List<WaylineAircraftConvertInvalidValueInfo> invalidList) {
        if (templates != null) {
            this.templates = templates;
        }
        if (missionConfig != null) {
            this.missionConfig = missionConfig;
        }
        if (invalidList != null) {
            this.invalidList = invalidList;
        }
    }

    public static WPMLAircraftConvertInfo fromJson(String jsonString) {
        WPMLAircraftConvertInfo tmpValueResult_ = new WPMLAircraftConvertInfo();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            JSONArray templatesJsonArr = jsonObj.getJSONArray("templates");
            for (int i = 0; i < templatesJsonArr.length(); ++i) {
                tmpValueResult_.templates.add(WaylineTemplate.fromJson(templatesJsonArr.getString(i)));
            }
            tmpValueResult_.missionConfig = WaylineMissionConfig.fromJson(jsonObj.getJSONObject("missionConfig").toString());
            JSONArray invalidListJsonArr = jsonObj.getJSONArray("invalidList");
            for (int i = 0; i < invalidListJsonArr.length(); ++i) {
                tmpValueResult_.invalidList.add(WaylineAircraftConvertInvalidValueInfo.fromJson(invalidListJsonArr.getString(i)));
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
            int i;
            json = new JSONObject();
            if (null != this.templates) {
                JSONArray json_arr_templates = new JSONArray();
                for (i = 0; i < this.templates.size(); ++i) {
                    json_arr_templates.put((Object)this.templates.get(i).toJson());
                }
                json.put("templates", (Object)json_arr_templates);
            }
            if (null != this.missionConfig) {
                json.put("missionConfig", (Object)this.missionConfig.toJson());
            }
            if (null != this.invalidList) {
                JSONArray json_arr_invalidList = new JSONArray();
                for (i = 0; i < this.invalidList.size(); ++i) {
                    json_arr_invalidList.put((Object)this.invalidList.get(i).toJson());
                }
                json.put("invalidList", (Object)json_arr_invalidList);
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
        serializedLength += ByteStreamHelper.arrayGetLength(this.templates);
        serializedLength += ByteStreamHelper.getLength(this.missionConfig, WaylineMissionConfig.class);
        return serializedLength += ByteStreamHelper.arrayGetLength(this.invalidList);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.arrayToBytes(resultBytes, this.templates, serializedIndex);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.missionConfig, serializedIndex, WaylineMissionConfig.class);
        serializedIndex = ByteStreamHelper.arrayToBytes(resultBytes, this.invalidList, serializedIndex);
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
        ByteResult<List<WaylineTemplate>> tmpTemplates = ByteStreamHelper.arrayFromBytes(data, deserilizationIndex, WaylineTemplate.class);
        this.templates = (List)tmpTemplates.result;
        deserilizationIndex = tmpTemplates.endIndex;
        ByteResult<WaylineMissionConfig> tmpMissionConfig = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineMissionConfig.class);
        this.missionConfig = (WaylineMissionConfig)tmpMissionConfig.result;
        deserilizationIndex = tmpMissionConfig.endIndex;
        ByteResult<List<WaylineAircraftConvertInvalidValueInfo>> tmpInvalidList = ByteStreamHelper.arrayFromBytes(data, deserilizationIndex, WaylineAircraftConvertInvalidValueInfo.class);
        this.invalidList = (List)tmpInvalidList.result;
        deserilizationIndex = tmpInvalidList.endIndex;
        return deserilizationIndex;
    }

    public List<WaylineTemplate> getTemplates() {
        return this.templates;
    }

    public void setTemplates(List<WaylineTemplate> templates) {
        this.templates = templates;
    }

    public WaylineMissionConfig getMissionConfig() {
        return this.missionConfig;
    }

    public void setMissionConfig(WaylineMissionConfig missionConfig) {
        this.missionConfig = missionConfig;
    }

    public List<WaylineAircraftConvertInvalidValueInfo> getInvalidList() {
        return this.invalidList;
    }

    public void setInvalidList(List<WaylineAircraftConvertInvalidValueInfo> invalidList) {
        this.invalidList = invalidList;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WPMLAircraftConvertInfo)) {
            return false;
        }
        WPMLAircraftConvertInfo that = (WPMLAircraftConvertInfo)o;
        return Objects.equals(this.templates, that.templates) && Objects.equals(this.missionConfig, that.missionConfig) && Objects.equals(this.invalidList, that.invalidList);
    }

    public int hashCode() {
        return Objects.hash(this.templates, this.missionConfig, this.invalidList);
    }
}

