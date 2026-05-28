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
import dji.sdk.wpmz.value.mission.Wayline;
import dji.sdk.wpmz.value.mission.WaylineExecuteMissionConfig;
import dji.sdk.wpmz.value.mission.WaylineMission;
import dji.sdk.wpmz.value.mission.WaylineMissionConfig;
import dji.sdk.wpmz.value.mission.WaylineTemplate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class AllKMZData
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WaylineMission mission;
    WaylineMissionConfig config;
    List<WaylineTemplate> templates = new ArrayList<WaylineTemplate>();
    WaylineExecuteMissionConfig executeMissionConfig;
    List<Wayline> waylines = new ArrayList<Wayline>();
    List<String> dsmFilePaths = new ArrayList<String>();
    List<String> accurateFilePaths = new ArrayList<String>();

    public AllKMZData() {
    }

    public AllKMZData(WaylineMission mission, WaylineMissionConfig config, List<WaylineTemplate> templates, WaylineExecuteMissionConfig executeMissionConfig, List<Wayline> waylines, List<String> dsmFilePaths, List<String> accurateFilePaths) {
        if (mission != null) {
            this.mission = mission;
        }
        if (config != null) {
            this.config = config;
        }
        if (templates != null) {
            this.templates = templates;
        }
        if (executeMissionConfig != null) {
            this.executeMissionConfig = executeMissionConfig;
        }
        if (waylines != null) {
            this.waylines = waylines;
        }
        if (dsmFilePaths != null) {
            this.dsmFilePaths = dsmFilePaths;
        }
        if (accurateFilePaths != null) {
            this.accurateFilePaths = accurateFilePaths;
        }
    }

    public static AllKMZData fromJson(String jsonString) {
        AllKMZData tmpValueResult_ = new AllKMZData();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.mission = WaylineMission.fromJson(jsonObj.getJSONObject("mission").toString());
            tmpValueResult_.config = WaylineMissionConfig.fromJson(jsonObj.getJSONObject("config").toString());
            JSONArray templatesJsonArr = jsonObj.getJSONArray("templates");
            for (int i = 0; i < templatesJsonArr.length(); ++i) {
                tmpValueResult_.templates.add(WaylineTemplate.fromJson(templatesJsonArr.getString(i)));
            }
            tmpValueResult_.executeMissionConfig = WaylineExecuteMissionConfig.fromJson(jsonObj.getJSONObject("executeMissionConfig").toString());
            JSONArray waylinesJsonArr = jsonObj.getJSONArray("waylines");
            for (int i = 0; i < waylinesJsonArr.length(); ++i) {
                tmpValueResult_.waylines.add(Wayline.fromJson(waylinesJsonArr.getString(i)));
            }
            JSONArray dsmFilePathsJsonArr = jsonObj.getJSONArray("dsmFilePaths");
            for (int i = 0; i < dsmFilePathsJsonArr.length(); ++i) {
                tmpValueResult_.dsmFilePaths.add(dsmFilePathsJsonArr.getString(i));
            }
            JSONArray accurateFilePathsJsonArr = jsonObj.getJSONArray("accurateFilePaths");
            for (int i = 0; i < accurateFilePathsJsonArr.length(); ++i) {
                tmpValueResult_.accurateFilePaths.add(accurateFilePathsJsonArr.getString(i));
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
            if (null != this.mission) {
                json.put("mission", (Object)this.mission.toJson());
            }
            if (null != this.config) {
                json.put("config", (Object)this.config.toJson());
            }
            if (null != this.templates) {
                JSONArray json_arr_templates = new JSONArray();
                for (i = 0; i < this.templates.size(); ++i) {
                    json_arr_templates.put((Object)this.templates.get(i).toJson());
                }
                json.put("templates", (Object)json_arr_templates);
            }
            if (null != this.executeMissionConfig) {
                json.put("executeMissionConfig", (Object)this.executeMissionConfig.toJson());
            }
            if (null != this.waylines) {
                JSONArray json_arr_waylines = new JSONArray();
                for (i = 0; i < this.waylines.size(); ++i) {
                    json_arr_waylines.put((Object)this.waylines.get(i).toJson());
                }
                json.put("waylines", (Object)json_arr_waylines);
            }
            if (null != this.dsmFilePaths) {
                JSONArray json_arr_dsmFilePaths = new JSONArray();
                for (i = 0; i < this.dsmFilePaths.size(); ++i) {
                    json_arr_dsmFilePaths.put((Object)this.dsmFilePaths.get(i));
                }
                json.put("dsmFilePaths", (Object)json_arr_dsmFilePaths);
            }
            if (null != this.accurateFilePaths) {
                JSONArray json_arr_accurateFilePaths = new JSONArray();
                for (i = 0; i < this.accurateFilePaths.size(); ++i) {
                    json_arr_accurateFilePaths.put((Object)this.accurateFilePaths.get(i));
                }
                json.put("accurateFilePaths", (Object)json_arr_accurateFilePaths);
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
        serializedLength += ByteStreamHelper.getLength(this.mission, WaylineMission.class);
        serializedLength += ByteStreamHelper.getLength(this.config, WaylineMissionConfig.class);
        serializedLength += ByteStreamHelper.arrayGetLength(this.templates);
        serializedLength += ByteStreamHelper.getLength(this.executeMissionConfig, WaylineExecuteMissionConfig.class);
        serializedLength += ByteStreamHelper.arrayGetLength(this.waylines);
        serializedLength += ByteStreamHelper.stringArrayGetLength(this.dsmFilePaths);
        return serializedLength += ByteStreamHelper.stringArrayGetLength(this.accurateFilePaths);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.mission, serializedIndex, WaylineMission.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.config, serializedIndex, WaylineMissionConfig.class);
        serializedIndex = ByteStreamHelper.arrayToBytes(resultBytes, this.templates, serializedIndex);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.executeMissionConfig, serializedIndex, WaylineExecuteMissionConfig.class);
        serializedIndex = ByteStreamHelper.arrayToBytes(resultBytes, this.waylines, serializedIndex);
        serializedIndex = ByteStreamHelper.stringArrayToBytes(resultBytes, this.dsmFilePaths, serializedIndex);
        serializedIndex = ByteStreamHelper.stringArrayToBytes(resultBytes, this.accurateFilePaths, serializedIndex);
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
        ByteResult<WaylineMission> tmpMission = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineMission.class);
        this.mission = (WaylineMission)tmpMission.result;
        deserilizationIndex = tmpMission.endIndex;
        ByteResult<WaylineMissionConfig> tmpConfig = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineMissionConfig.class);
        this.config = (WaylineMissionConfig)tmpConfig.result;
        deserilizationIndex = tmpConfig.endIndex;
        ByteResult<List<WaylineTemplate>> tmpTemplates = ByteStreamHelper.arrayFromBytes(data, deserilizationIndex, WaylineTemplate.class);
        this.templates = (List)tmpTemplates.result;
        deserilizationIndex = tmpTemplates.endIndex;
        ByteResult<WaylineExecuteMissionConfig> tmpExecuteMissionConfig = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineExecuteMissionConfig.class);
        this.executeMissionConfig = (WaylineExecuteMissionConfig)tmpExecuteMissionConfig.result;
        deserilizationIndex = tmpExecuteMissionConfig.endIndex;
        ByteResult<List<Wayline>> tmpWaylines = ByteStreamHelper.arrayFromBytes(data, deserilizationIndex, Wayline.class);
        this.waylines = (List)tmpWaylines.result;
        deserilizationIndex = tmpWaylines.endIndex;
        ByteResult<List<String>> tmpDsmFilePaths = ByteStreamHelper.stringArrayFromBytes(data, deserilizationIndex);
        this.dsmFilePaths = (List)tmpDsmFilePaths.result;
        deserilizationIndex = tmpDsmFilePaths.endIndex;
        ByteResult<List<String>> tmpAccurateFilePaths = ByteStreamHelper.stringArrayFromBytes(data, deserilizationIndex);
        this.accurateFilePaths = (List)tmpAccurateFilePaths.result;
        deserilizationIndex = tmpAccurateFilePaths.endIndex;
        return deserilizationIndex;
    }

    public WaylineMission getMission() {
        return this.mission;
    }

    public void setMission(WaylineMission mission) {
        this.mission = mission;
    }

    public WaylineMissionConfig getConfig() {
        return this.config;
    }

    public void setConfig(WaylineMissionConfig config) {
        this.config = config;
    }

    public List<WaylineTemplate> getTemplates() {
        return this.templates;
    }

    public void setTemplates(List<WaylineTemplate> templates) {
        this.templates = templates;
    }

    public WaylineExecuteMissionConfig getExecuteMissionConfig() {
        return this.executeMissionConfig;
    }

    public void setExecuteMissionConfig(WaylineExecuteMissionConfig executeMissionConfig) {
        this.executeMissionConfig = executeMissionConfig;
    }

    public List<Wayline> getWaylines() {
        return this.waylines;
    }

    public void setWaylines(List<Wayline> waylines) {
        this.waylines = waylines;
    }

    public List<String> getDsmFilePaths() {
        return this.dsmFilePaths;
    }

    public void setDsmFilePaths(List<String> dsmFilePaths) {
        this.dsmFilePaths = dsmFilePaths;
    }

    public List<String> getAccurateFilePaths() {
        return this.accurateFilePaths;
    }

    public void setAccurateFilePaths(List<String> accurateFilePaths) {
        this.accurateFilePaths = accurateFilePaths;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AllKMZData)) {
            return false;
        }
        AllKMZData that = (AllKMZData)o;
        return Objects.equals(this.mission, that.mission) && Objects.equals(this.config, that.config) && Objects.equals(this.templates, that.templates) && Objects.equals(this.executeMissionConfig, that.executeMissionConfig) && Objects.equals(this.waylines, that.waylines) && Objects.equals(this.dsmFilePaths, that.dsmFilePaths) && Objects.equals(this.accurateFilePaths, that.accurateFilePaths);
    }

    public int hashCode() {
        return Objects.hash(this.mission, this.config, this.templates, this.executeMissionConfig, this.waylines, this.dsmFilePaths, this.accurateFilePaths);
    }
}

