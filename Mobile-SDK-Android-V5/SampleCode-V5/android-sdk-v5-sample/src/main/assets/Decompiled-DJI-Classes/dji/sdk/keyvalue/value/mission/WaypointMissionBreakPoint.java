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
import dji.sdk.keyvalue.value.mission.WaypointMissionBreakPointState;
import org.json.JSONObject;

public class WaypointMissionBreakPoint
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double longitude;
    Double latitude;
    Double height;
    Integer currentWaypointIndex;
    Integer missionID;
    WaypointMissionBreakPointState state;

    public WaypointMissionBreakPoint() {
    }

    public WaypointMissionBreakPoint(Double d2, Double d3, Double d4, Integer n, Integer n2, WaypointMissionBreakPointState waypointMissionBreakPointState) {
    }

    public static WaypointMissionBreakPoint fromJson(String string) {
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

    public Double getLongitude() {
        return null;
    }

    public void setLongitude(Double d2) {
    }

    public Double getLatitude() {
        return null;
    }

    public void setLatitude(Double d2) {
    }

    public Double getHeight() {
        return null;
    }

    public void setHeight(Double d2) {
    }

    public Integer getCurrentWaypointIndex() {
        return null;
    }

    public void setCurrentWaypointIndex(Integer n) {
    }

    public Integer getMissionID() {
        return null;
    }

    public void setMissionID(Integer n) {
    }

    public WaypointMissionBreakPointState getState() {
        return null;
    }

    public void setState(WaypointMissionBreakPointState waypointMissionBreakPointState) {
    }

    public String toString() {
        return null;
    }
}

