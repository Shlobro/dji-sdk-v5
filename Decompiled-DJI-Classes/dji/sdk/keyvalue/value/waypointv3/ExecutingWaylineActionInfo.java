/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.waypointv3;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.waypointv3.WaypointV3ActionState;
import org.json.JSONObject;

public class ExecutingWaylineActionInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer waylineID;
    Integer currentWaypointIndex;
    Integer actionGroupID;
    Integer actionID;
    WaypointV3ActionState actionState;

    public ExecutingWaylineActionInfo() {
    }

    public ExecutingWaylineActionInfo(Integer n, Integer n2, Integer n3, Integer n4, WaypointV3ActionState waypointV3ActionState) {
    }

    public static ExecutingWaylineActionInfo fromJson(String string) {
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

    public Integer getWaylineID() {
        return null;
    }

    public void setWaylineID(Integer n) {
    }

    public Integer getCurrentWaypointIndex() {
        return null;
    }

    public void setCurrentWaypointIndex(Integer n) {
    }

    public Integer getActionGroupID() {
        return null;
    }

    public void setActionGroupID(Integer n) {
    }

    public Integer getActionID() {
        return null;
    }

    public void setActionID(Integer n) {
    }

    public WaypointV3ActionState getActionState() {
        return null;
    }

    public void setActionState(WaypointV3ActionState waypointV3ActionState) {
    }

    public String toString() {
        return null;
    }
}

