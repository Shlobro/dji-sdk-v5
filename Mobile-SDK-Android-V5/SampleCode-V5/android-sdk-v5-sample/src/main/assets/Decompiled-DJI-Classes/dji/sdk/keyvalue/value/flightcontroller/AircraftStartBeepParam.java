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
import dji.sdk.keyvalue.value.flightcontroller.AircraftBeepType;
import org.json.JSONObject;

public class AircraftStartBeepParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer index;
    Integer beepTick;
    Boolean isInfinite;
    AircraftBeepType type;

    public AircraftStartBeepParam() {
    }

    public AircraftStartBeepParam(Integer n, Integer n2, Boolean bl, AircraftBeepType aircraftBeepType) {
    }

    public static AircraftStartBeepParam fromJson(String string) {
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

    public Integer getIndex() {
        return null;
    }

    public void setIndex(Integer n) {
    }

    public Integer getBeepTick() {
        return null;
    }

    public void setBeepTick(Integer n) {
    }

    public Boolean getIsInfinite() {
        return null;
    }

    public void setIsInfinite(Boolean bl) {
    }

    public AircraftBeepType getType() {
        return null;
    }

    public void setType(AircraftBeepType aircraftBeepType) {
    }

    public String toString() {
        return null;
    }
}

