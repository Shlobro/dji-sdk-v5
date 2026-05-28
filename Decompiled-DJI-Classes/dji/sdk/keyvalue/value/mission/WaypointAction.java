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
import dji.sdk.keyvalue.value.mission.WaypointActionType;
import org.json.JSONObject;

public class WaypointAction
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WaypointActionType actionType;
    Integer actionParam;

    public WaypointAction() {
    }

    public WaypointAction(WaypointActionType waypointActionType, Integer n) {
    }

    public static WaypointAction fromJson(String string) {
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

    public WaypointActionType getActionType() {
        return null;
    }

    public void setActionType(WaypointActionType waypointActionType) {
    }

    public Integer getActionParam() {
        return null;
    }

    public void setActionParam(Integer n) {
    }

    public String toString() {
        return null;
    }
}

