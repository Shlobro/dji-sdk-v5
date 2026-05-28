/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.flightcontroller.CableFollowAirState;
import dji.sdk.keyvalue.value.flightcontroller.CableFollowDirection;
import java.util.List;
import org.json.JSONObject;

public class CableFollowDirectionList
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean manualMode;
    Boolean wannaUserChoice;
    CableFollowAirState state;
    List<CableFollowDirection> directionList;
    Integer camPosition;

    public CableFollowDirectionList() {
    }

    public CableFollowDirectionList(Boolean bl, Boolean bl2, CableFollowAirState cableFollowAirState, List<CableFollowDirection> list, Integer n) {
    }

    public static CableFollowDirectionList fromJson(String string) {
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

    public Boolean getManualMode() {
        return null;
    }

    public void setManualMode(Boolean bl) {
    }

    public Boolean getWannaUserChoice() {
        return null;
    }

    public void setWannaUserChoice(Boolean bl) {
    }

    public CableFollowAirState getState() {
        return null;
    }

    public void setState(CableFollowAirState cableFollowAirState) {
    }

    public List<CableFollowDirection> getDirectionList() {
        return null;
    }

    public void setDirectionList(List<CableFollowDirection> list) {
    }

    public Integer getCamPosition() {
        return null;
    }

    public void setCamPosition(Integer n) {
    }

    public String toString() {
        return null;
    }
}

