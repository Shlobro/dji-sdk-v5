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
import dji.sdk.keyvalue.value.mission.WaypointMissionState;
import org.json.JSONObject;

public class WaypointMissionStateTransition
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WaypointMissionState previous;
    WaypointMissionState current;

    public WaypointMissionStateTransition() {
    }

    public WaypointMissionStateTransition(WaypointMissionState waypointMissionState, WaypointMissionState waypointMissionState2) {
    }

    public static WaypointMissionStateTransition fromJson(String string) {
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

    public WaypointMissionState getPrevious() {
        return null;
    }

    public void setPrevious(WaypointMissionState waypointMissionState) {
    }

    public WaypointMissionState getCurrent() {
        return null;
    }

    public void setCurrent(WaypointMissionState waypointMissionState) {
    }

    public String toString() {
        return null;
    }
}

