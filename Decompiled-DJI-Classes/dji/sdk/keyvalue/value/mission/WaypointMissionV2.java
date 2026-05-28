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
import dji.sdk.keyvalue.value.mission.WaypointMissionV2FinishedAction;
import dji.sdk.keyvalue.value.mission.WaypointMissionV2GotoFirstPointMode;
import dji.sdk.keyvalue.value.mission.WaypointMissionV2RCLostConnectionAction;
import dji.sdk.keyvalue.value.mission.WaypointV2;
import java.util.List;
import org.json.JSONObject;

public class WaypointMissionV2
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer missionIndex;
    Integer totalLength;
    Integer currentTotalLength;
    Integer repeatTimes;
    Double globalMaxSpeed;
    Double globalCruiseSpeed;
    Integer startIndex;
    WaypointMissionV2FinishedAction finishedAction;
    WaypointMissionV2RCLostConnectionAction rcLostAction;
    WaypointMissionV2GotoFirstPointMode gotoFirstMode;
    List<WaypointV2> waypointList;

    public WaypointMissionV2() {
    }

    public WaypointMissionV2(Integer n, Integer n2, Integer n3, Integer n4, Double d2, Double d3, Integer n5, WaypointMissionV2FinishedAction waypointMissionV2FinishedAction, WaypointMissionV2RCLostConnectionAction waypointMissionV2RCLostConnectionAction, WaypointMissionV2GotoFirstPointMode waypointMissionV2GotoFirstPointMode, List<WaypointV2> list) {
    }

    public static WaypointMissionV2 fromJson(String string) {
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

    public Integer getMissionIndex() {
        return null;
    }

    public void setMissionIndex(Integer n) {
    }

    public Integer getTotalLength() {
        return null;
    }

    public void setTotalLength(Integer n) {
    }

    public Integer getCurrentTotalLength() {
        return null;
    }

    public void setCurrentTotalLength(Integer n) {
    }

    public Integer getRepeatTimes() {
        return null;
    }

    public void setRepeatTimes(Integer n) {
    }

    public Double getGlobalMaxSpeed() {
        return null;
    }

    public void setGlobalMaxSpeed(Double d2) {
    }

    public Double getGlobalCruiseSpeed() {
        return null;
    }

    public void setGlobalCruiseSpeed(Double d2) {
    }

    public Integer getStartIndex() {
        return null;
    }

    public void setStartIndex(Integer n) {
    }

    public WaypointMissionV2FinishedAction getFinishedAction() {
        return null;
    }

    public void setFinishedAction(WaypointMissionV2FinishedAction waypointMissionV2FinishedAction) {
    }

    public WaypointMissionV2RCLostConnectionAction getRcLostAction() {
        return null;
    }

    public void setRcLostAction(WaypointMissionV2RCLostConnectionAction waypointMissionV2RCLostConnectionAction) {
    }

    public WaypointMissionV2GotoFirstPointMode getGotoFirstMode() {
        return null;
    }

    public void setGotoFirstMode(WaypointMissionV2GotoFirstPointMode waypointMissionV2GotoFirstPointMode) {
    }

    public List<WaypointV2> getWaypointList() {
        return null;
    }

    public void setWaypointList(List<WaypointV2> list) {
    }

    public String toString() {
        return null;
    }
}

