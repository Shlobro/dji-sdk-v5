/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.mission.WaylineActionsRelationType;
import org.json.JSONObject;

public class WaylineActionTreeNode
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WaylineActionsRelationType nodeType;
    Integer childrenNum;
    Integer actionIndex;

    public WaylineActionTreeNode() {
    }

    public WaylineActionTreeNode(WaylineActionsRelationType waylineActionsRelationType, Integer n, Integer n2) {
    }

    public static WaylineActionTreeNode fromJson(String string) {
        return null;
    }

    @Override
    public JSONObject toJson() {
        return null;
    }

    @Override
    public int serializedLength() {
        return 0;
    }

    @Override
    public int toBytes(byte[] byArray, int n) {
        return 0;
    }

    @Override
    public byte[] toBytes() {
        return null;
    }

    @Override
    public int fromBytes(byte[] byArray, int n) {
        return 0;
    }

    public WaylineActionsRelationType getNodeType() {
        return null;
    }

    public void setNodeType(WaylineActionsRelationType waylineActionsRelationType) {
    }

    public Integer getChildrenNum() {
        return null;
    }

    public void setChildrenNum(Integer n) {
    }

    public Integer getActionIndex() {
        return null;
    }

    public void setActionIndex(Integer n) {
    }

    public String toString() {
        return null;
    }
}

