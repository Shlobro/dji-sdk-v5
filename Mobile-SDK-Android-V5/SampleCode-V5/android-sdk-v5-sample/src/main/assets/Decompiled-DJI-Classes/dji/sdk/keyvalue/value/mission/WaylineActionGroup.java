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
import dji.sdk.keyvalue.value.mission.WaylineActionInfo;
import dji.sdk.keyvalue.value.mission.WaylineActionNodeList;
import dji.sdk.keyvalue.value.mission.WaylineActionTrigger;
import java.util.List;
import org.json.JSONObject;

public class WaylineActionGroup
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer groupId;
    Integer startIndex;
    Integer endIndex;
    WaylineActionTrigger trigger;
    List<WaylineActionNodeList> nodeLists;
    List<WaylineActionInfo> actions;

    public WaylineActionGroup() {
    }

    public WaylineActionGroup(Integer n, Integer n2, Integer n3, WaylineActionTrigger waylineActionTrigger, List<WaylineActionNodeList> list, List<WaylineActionInfo> list2) {
    }

    public static WaylineActionGroup fromJson(String string) {
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

    public Integer getGroupId() {
        return null;
    }

    public void setGroupId(Integer n) {
    }

    public Integer getStartIndex() {
        return null;
    }

    public void setStartIndex(Integer n) {
    }

    public Integer getEndIndex() {
        return null;
    }

    public void setEndIndex(Integer n) {
    }

    public WaylineActionTrigger getTrigger() {
        return null;
    }

    public void setTrigger(WaylineActionTrigger waylineActionTrigger) {
    }

    public List<WaylineActionNodeList> getNodeLists() {
        return null;
    }

    public void setNodeLists(List<WaylineActionNodeList> list) {
    }

    public List<WaylineActionInfo> getActions() {
        return null;
    }

    public void setActions(List<WaylineActionInfo> list) {
    }

    public String toString() {
        return null;
    }
}

