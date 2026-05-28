/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.radar;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class RadarUserData
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer flightTime;
    Integer radarServiceTimer;
    Integer emergencyBrakeCount;
    Integer successAvoidCount;
    Integer triggerAutoDetourCount;
    Integer successAutoDetourCount;

    public RadarUserData() {
    }

    public RadarUserData(Integer n, Integer n2, Integer n3, Integer n4, Integer n5, Integer n6) {
    }

    public static RadarUserData fromJson(String string) {
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

    public Integer getFlightTime() {
        return null;
    }

    public void setFlightTime(Integer n) {
    }

    public Integer getRadarServiceTimer() {
        return null;
    }

    public void setRadarServiceTimer(Integer n) {
    }

    public Integer getEmergencyBrakeCount() {
        return null;
    }

    public void setEmergencyBrakeCount(Integer n) {
    }

    public Integer getSuccessAvoidCount() {
        return null;
    }

    public void setSuccessAvoidCount(Integer n) {
    }

    public Integer getTriggerAutoDetourCount() {
        return null;
    }

    public void setTriggerAutoDetourCount(Integer n) {
    }

    public Integer getSuccessAutoDetourCount() {
        return null;
    }

    public void setSuccessAutoDetourCount(Integer n) {
    }

    public String toString() {
        return null;
    }
}

