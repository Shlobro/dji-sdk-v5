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
import dji.sdk.wpmz.value.mission.WaylineActionInfo;
import dji.sdk.wpmz.value.mission.WaylineActionNodeList;
import dji.sdk.wpmz.value.mission.WaylineActionTrigger;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class WaylineActionGroup
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer groupId = 0;
    Integer startIndex = 0;
    Integer endIndex = 0;
    WaylineActionTrigger trigger;
    List<WaylineActionNodeList> nodeLists = new ArrayList<WaylineActionNodeList>();
    List<WaylineActionInfo> actions = new ArrayList<WaylineActionInfo>();

    public WaylineActionGroup() {
    }

    public WaylineActionGroup(Integer groupId, Integer startIndex, Integer endIndex, WaylineActionTrigger trigger, List<WaylineActionNodeList> nodeLists, List<WaylineActionInfo> actions) {
        if (groupId != null) {
            this.groupId = groupId;
        }
        if (startIndex != null) {
            this.startIndex = startIndex;
        }
        if (endIndex != null) {
            this.endIndex = endIndex;
        }
        if (trigger != null) {
            this.trigger = trigger;
        }
        if (nodeLists != null) {
            this.nodeLists = nodeLists;
        }
        if (actions != null) {
            this.actions = actions;
        }
    }

    public static WaylineActionGroup fromJson(String jsonString) {
        WaylineActionGroup tmpValueResult_ = new WaylineActionGroup();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.groupId = jsonObj.getInt("groupId");
            tmpValueResult_.startIndex = jsonObj.getInt("startIndex");
            tmpValueResult_.endIndex = jsonObj.getInt("endIndex");
            tmpValueResult_.trigger = WaylineActionTrigger.fromJson(jsonObj.getJSONObject("trigger").toString());
            JSONArray nodeListsJsonArr = jsonObj.getJSONArray("nodeLists");
            for (int i = 0; i < nodeListsJsonArr.length(); ++i) {
                tmpValueResult_.nodeLists.add(WaylineActionNodeList.fromJson(nodeListsJsonArr.getString(i)));
            }
            JSONArray actionsJsonArr = jsonObj.getJSONArray("actions");
            for (int i = 0; i < actionsJsonArr.length(); ++i) {
                tmpValueResult_.actions.add(WaylineActionInfo.fromJson(actionsJsonArr.getString(i)));
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
            if (null != this.groupId) {
                json.put("groupId", (Object)this.groupId);
            }
            if (null != this.startIndex) {
                json.put("startIndex", (Object)this.startIndex);
            }
            if (null != this.endIndex) {
                json.put("endIndex", (Object)this.endIndex);
            }
            if (null != this.trigger) {
                json.put("trigger", (Object)this.trigger.toJson());
            }
            if (null != this.nodeLists) {
                JSONArray json_arr_nodeLists = new JSONArray();
                for (i = 0; i < this.nodeLists.size(); ++i) {
                    json_arr_nodeLists.put((Object)this.nodeLists.get(i).toJson());
                }
                json.put("nodeLists", (Object)json_arr_nodeLists);
            }
            if (null != this.actions) {
                JSONArray json_arr_actions = new JSONArray();
                for (i = 0; i < this.actions.size(); ++i) {
                    json_arr_actions.put((Object)this.actions.get(i).toJson());
                }
                json.put("actions", (Object)json_arr_actions);
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
        serializedLength += ByteStreamHelper.integerGetLength(this.groupId);
        serializedLength += ByteStreamHelper.integerGetLength(this.startIndex);
        serializedLength += ByteStreamHelper.integerGetLength(this.endIndex);
        serializedLength += ByteStreamHelper.getLength(this.trigger, WaylineActionTrigger.class);
        serializedLength += ByteStreamHelper.arrayGetLength(this.nodeLists);
        return serializedLength += ByteStreamHelper.arrayGetLength(this.actions);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.groupId, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.startIndex, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.endIndex, serializedIndex);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.trigger, serializedIndex, WaylineActionTrigger.class);
        serializedIndex = ByteStreamHelper.arrayToBytes(resultBytes, this.nodeLists, serializedIndex);
        serializedIndex = ByteStreamHelper.arrayToBytes(resultBytes, this.actions, serializedIndex);
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
        ByteResult<Integer> tmpGroupId = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.groupId = (Integer)tmpGroupId.result;
        deserilizationIndex = tmpGroupId.endIndex;
        ByteResult<Integer> tmpStartIndex = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.startIndex = (Integer)tmpStartIndex.result;
        deserilizationIndex = tmpStartIndex.endIndex;
        ByteResult<Integer> tmpEndIndex = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.endIndex = (Integer)tmpEndIndex.result;
        deserilizationIndex = tmpEndIndex.endIndex;
        ByteResult<WaylineActionTrigger> tmpTrigger = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineActionTrigger.class);
        this.trigger = (WaylineActionTrigger)tmpTrigger.result;
        deserilizationIndex = tmpTrigger.endIndex;
        ByteResult<List<WaylineActionNodeList>> tmpNodeLists = ByteStreamHelper.arrayFromBytes(data, deserilizationIndex, WaylineActionNodeList.class);
        this.nodeLists = (List)tmpNodeLists.result;
        deserilizationIndex = tmpNodeLists.endIndex;
        ByteResult<List<WaylineActionInfo>> tmpActions = ByteStreamHelper.arrayFromBytes(data, deserilizationIndex, WaylineActionInfo.class);
        this.actions = (List)tmpActions.result;
        deserilizationIndex = tmpActions.endIndex;
        return deserilizationIndex;
    }

    public Integer getGroupId() {
        return this.groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getStartIndex() {
        return this.startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public Integer getEndIndex() {
        return this.endIndex;
    }

    public void setEndIndex(Integer endIndex) {
        this.endIndex = endIndex;
    }

    public WaylineActionTrigger getTrigger() {
        return this.trigger;
    }

    public void setTrigger(WaylineActionTrigger trigger) {
        this.trigger = trigger;
    }

    public List<WaylineActionNodeList> getNodeLists() {
        return this.nodeLists;
    }

    public void setNodeLists(List<WaylineActionNodeList> nodeLists) {
        this.nodeLists = nodeLists;
    }

    public List<WaylineActionInfo> getActions() {
        return this.actions;
    }

    public void setActions(List<WaylineActionInfo> actions) {
        this.actions = actions;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineActionGroup)) {
            return false;
        }
        WaylineActionGroup that = (WaylineActionGroup)o;
        return Objects.equals(this.groupId, that.groupId) && Objects.equals(this.startIndex, that.startIndex) && Objects.equals(this.endIndex, that.endIndex) && Objects.equals(this.trigger, that.trigger) && Objects.equals(this.nodeLists, that.nodeLists) && Objects.equals(this.actions, that.actions);
    }

    public int hashCode() {
        return Objects.hash(this.groupId, this.startIndex, this.endIndex, this.trigger, this.nodeLists, this.actions);
    }
}

