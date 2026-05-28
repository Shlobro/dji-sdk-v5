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
import dji.sdk.wpmz.value.mission.WaylineActionsRelationType;
import java.util.Objects;
import org.json.JSONObject;

public class WaylineActionTreeNode
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WaylineActionsRelationType nodeType = WaylineActionsRelationType.UNKNOWN;
    Integer childrenNum = 0;
    Integer actionIndex = 0;

    public WaylineActionTreeNode() {
    }

    public WaylineActionTreeNode(WaylineActionsRelationType nodeType, Integer childrenNum, Integer actionIndex) {
        if (nodeType != null) {
            this.nodeType = nodeType;
        }
        if (childrenNum != null) {
            this.childrenNum = childrenNum;
        }
        if (actionIndex != null) {
            this.actionIndex = actionIndex;
        }
    }

    public static WaylineActionTreeNode fromJson(String jsonString) {
        WaylineActionTreeNode tmpValueResult_ = new WaylineActionTreeNode();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.nodeType = WaylineActionsRelationType.find(jsonObj.getInt("nodeType"));
            tmpValueResult_.childrenNum = jsonObj.getInt("childrenNum");
            tmpValueResult_.actionIndex = jsonObj.getInt("actionIndex");
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
            if (null != this.nodeType) {
                json.put("nodeType", this.nodeType.value());
            }
            if (null != this.childrenNum) {
                json.put("childrenNum", (Object)this.childrenNum);
            }
            if (null != this.actionIndex) {
                json.put("actionIndex", (Object)this.actionIndex);
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
        serializedLength += ByteStreamHelper.integerGetLength(this.nodeType.value());
        serializedLength += ByteStreamHelper.integerGetLength(this.childrenNum);
        return serializedLength += ByteStreamHelper.integerGetLength(this.actionIndex);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.nodeType.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.childrenNum, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.actionIndex, serializedIndex);
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
        ByteResult<Integer> tmpNodeType = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.nodeType = WaylineActionsRelationType.find((Integer)tmpNodeType.result);
        deserilizationIndex = tmpNodeType.endIndex;
        ByteResult<Integer> tmpChildrenNum = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.childrenNum = (Integer)tmpChildrenNum.result;
        deserilizationIndex = tmpChildrenNum.endIndex;
        ByteResult<Integer> tmpActionIndex = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.actionIndex = (Integer)tmpActionIndex.result;
        deserilizationIndex = tmpActionIndex.endIndex;
        return deserilizationIndex;
    }

    public WaylineActionsRelationType getNodeType() {
        return this.nodeType;
    }

    public void setNodeType(WaylineActionsRelationType nodeType) {
        this.nodeType = nodeType;
    }

    public Integer getChildrenNum() {
        return this.childrenNum;
    }

    public void setChildrenNum(Integer childrenNum) {
        this.childrenNum = childrenNum;
    }

    public Integer getActionIndex() {
        return this.actionIndex;
    }

    public void setActionIndex(Integer actionIndex) {
        this.actionIndex = actionIndex;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineActionTreeNode)) {
            return false;
        }
        WaylineActionTreeNode that = (WaylineActionTreeNode)o;
        return Objects.equals(this.nodeType, that.nodeType) && Objects.equals(this.childrenNum, that.childrenNum) && Objects.equals(this.actionIndex, that.actionIndex);
    }

    public int hashCode() {
        return Objects.hash(this.nodeType, this.childrenNum, this.actionIndex);
    }
}

