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
import org.json.JSONObject;

public class FcWaypointBreakMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double breakPointLong;
    Double breakPointLati;
    Double breakPointAlti;
    Integer missionId;
    Integer breakPointIndex;
    Boolean breakInfoIsValid;

    public FcWaypointBreakMsg() {
    }

    public FcWaypointBreakMsg(Double d2, Double d3, Double d4, Integer n, Integer n2, Boolean bl) {
    }

    public static FcWaypointBreakMsg fromJson(String string) {
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

    public Double getBreakPointLong() {
        return null;
    }

    public void setBreakPointLong(Double d2) {
    }

    public Double getBreakPointLati() {
        return null;
    }

    public void setBreakPointLati(Double d2) {
    }

    public Double getBreakPointAlti() {
        return null;
    }

    public void setBreakPointAlti(Double d2) {
    }

    public Integer getMissionId() {
        return null;
    }

    public void setMissionId(Integer n) {
    }

    public Integer getBreakPointIndex() {
        return null;
    }

    public void setBreakPointIndex(Integer n) {
    }

    public Boolean getBreakInfoIsValid() {
        return null;
    }

    public void setBreakInfoIsValid(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

