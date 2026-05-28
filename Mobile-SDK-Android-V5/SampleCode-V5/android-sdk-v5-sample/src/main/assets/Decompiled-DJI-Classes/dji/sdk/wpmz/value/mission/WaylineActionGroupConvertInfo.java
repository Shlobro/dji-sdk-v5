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
import dji.sdk.wpmz.value.mission.WaylineActionGroup;
import dji.sdk.wpmz.value.mission.WaylineAircraftConvertInvalidValueInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class WaylineActionGroupConvertInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WaylineActionGroup group;
    List<WaylineAircraftConvertInvalidValueInfo> invalidList = new ArrayList<WaylineAircraftConvertInvalidValueInfo>();

    public WaylineActionGroupConvertInfo() {
    }

    public WaylineActionGroupConvertInfo(WaylineActionGroup group, List<WaylineAircraftConvertInvalidValueInfo> invalidList) {
        if (group != null) {
            this.group = group;
        }
        if (invalidList != null) {
            this.invalidList = invalidList;
        }
    }

    public static WaylineActionGroupConvertInfo fromJson(String jsonString) {
        WaylineActionGroupConvertInfo tmpValueResult_ = new WaylineActionGroupConvertInfo();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.group = WaylineActionGroup.fromJson(jsonObj.getJSONObject("group").toString());
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
            json = new JSONObject();
            if (null != this.group) {
                json.put("group", (Object)this.group.toJson());
            }
            if (null != this.invalidList) {
                JSONArray json_arr_invalidList = new JSONArray();
                for (int i = 0; i < this.invalidList.size(); ++i) {
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
        serializedLength += ByteStreamHelper.getLength(this.group, WaylineActionGroup.class);
        return serializedLength += ByteStreamHelper.arrayGetLength(this.invalidList);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.group, serializedIndex, WaylineActionGroup.class);
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
        ByteResult<WaylineActionGroup> tmpGroup = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineActionGroup.class);
        this.group = (WaylineActionGroup)tmpGroup.result;
        deserilizationIndex = tmpGroup.endIndex;
        ByteResult<List<WaylineAircraftConvertInvalidValueInfo>> tmpInvalidList = ByteStreamHelper.arrayFromBytes(data, deserilizationIndex, WaylineAircraftConvertInvalidValueInfo.class);
        this.invalidList = (List)tmpInvalidList.result;
        deserilizationIndex = tmpInvalidList.endIndex;
        return deserilizationIndex;
    }

    public WaylineActionGroup getGroup() {
        return this.group;
    }

    public void setGroup(WaylineActionGroup group) {
        this.group = group;
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
        if (!(o instanceof WaylineActionGroupConvertInfo)) {
            return false;
        }
        WaylineActionGroupConvertInfo that = (WaylineActionGroupConvertInfo)o;
        return Objects.equals(this.group, that.group) && Objects.equals(this.invalidList, that.invalidList);
    }

    public int hashCode() {
        return Objects.hash(this.group, this.invalidList);
    }
}

