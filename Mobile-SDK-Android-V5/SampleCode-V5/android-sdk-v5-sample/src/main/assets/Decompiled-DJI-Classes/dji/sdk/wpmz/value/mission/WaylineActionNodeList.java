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
import dji.sdk.wpmz.value.mission.WaylineActionTreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class WaylineActionNodeList
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<WaylineActionTreeNode> nodes = new ArrayList<WaylineActionTreeNode>();

    public WaylineActionNodeList() {
    }

    public WaylineActionNodeList(List<WaylineActionTreeNode> nodes) {
        if (nodes != null) {
            this.nodes = nodes;
        }
    }

    public static WaylineActionNodeList fromJson(String jsonString) {
        WaylineActionNodeList tmpValueResult_ = new WaylineActionNodeList();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            JSONArray nodesJsonArr = jsonObj.getJSONArray("nodes");
            for (int i = 0; i < nodesJsonArr.length(); ++i) {
                tmpValueResult_.nodes.add(WaylineActionTreeNode.fromJson(nodesJsonArr.getString(i)));
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
            if (null != this.nodes) {
                JSONArray json_arr_nodes = new JSONArray();
                for (int i = 0; i < this.nodes.size(); ++i) {
                    json_arr_nodes.put((Object)this.nodes.get(i).toJson());
                }
                json.put("nodes", (Object)json_arr_nodes);
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
        return serializedLength += ByteStreamHelper.arrayGetLength(this.nodes);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.arrayToBytes(resultBytes, this.nodes, serializedIndex);
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
        ByteResult<List<WaylineActionTreeNode>> tmpNodes = ByteStreamHelper.arrayFromBytes(data, deserilizationIndex, WaylineActionTreeNode.class);
        this.nodes = (List)tmpNodes.result;
        deserilizationIndex = tmpNodes.endIndex;
        return deserilizationIndex;
    }

    public List<WaylineActionTreeNode> getNodes() {
        return this.nodes;
    }

    public void setNodes(List<WaylineActionTreeNode> nodes) {
        this.nodes = nodes;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineActionNodeList)) {
            return false;
        }
        WaylineActionNodeList that = (WaylineActionNodeList)o;
        return Objects.equals(this.nodes, that.nodes);
    }

    public int hashCode() {
        return Objects.hash(this.nodes);
    }
}

