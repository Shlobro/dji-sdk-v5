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
import dji.sdk.keyvalue.value.mission.WpmzVerison;
import org.json.JSONObject;

public class CurrentExcutingWaylineInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String missionID;
    Integer waylineID;
    Integer currentWaypointIndex;
    WpmzVerison wpmzVersion;

    public CurrentExcutingWaylineInfo() {
    }

    public CurrentExcutingWaylineInfo(String string, Integer n, Integer n2, WpmzVerison wpmzVerison) {
    }

    public static CurrentExcutingWaylineInfo fromJson(String string) {
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

    public String getMissionID() {
        return null;
    }

    public void setMissionID(String string) {
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

    public WpmzVerison getWpmzVersion() {
        return null;
    }

    public void setWpmzVersion(WpmzVerison wpmzVerison) {
    }

    public String toString() {
        return null;
    }
}

