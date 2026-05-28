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
import dji.sdk.keyvalue.value.waypointv3.WaypointV3MissionState;
import org.json.JSONObject;

public class WaypointV3MissionStateMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WaypointV3MissionState value;

    public WaypointV3MissionStateMsg() {
    }

    public WaypointV3MissionStateMsg(WaypointV3MissionState waypointV3MissionState) {
    }

    public static WaypointV3MissionStateMsg fromJson(String string) {
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

    public WaypointV3MissionState getValue() {
        return null;
    }

    public void setValue(WaypointV3MissionState waypointV3MissionState) {
    }

    public String toString() {
        return null;
    }
}

