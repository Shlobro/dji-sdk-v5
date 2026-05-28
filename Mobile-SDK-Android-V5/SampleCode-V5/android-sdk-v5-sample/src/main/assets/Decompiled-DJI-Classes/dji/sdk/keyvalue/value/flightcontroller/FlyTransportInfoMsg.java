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
import dji.sdk.keyvalue.value.flightcontroller.FlyTransportContainer;
import dji.sdk.keyvalue.value.flightcontroller.FlyTransportMode;
import org.json.JSONObject;

public class FlyTransportInfoMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    FlyTransportMode mode;
    Integer weight;
    FlyTransportContainer container_type;
    Integer lifting_length;

    public FlyTransportInfoMsg() {
    }

    public FlyTransportInfoMsg(FlyTransportMode flyTransportMode, Integer n, FlyTransportContainer flyTransportContainer, Integer n2) {
    }

    public static FlyTransportInfoMsg fromJson(String string) {
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

    public FlyTransportMode getMode() {
        return null;
    }

    public void setMode(FlyTransportMode flyTransportMode) {
    }

    public Integer getWeight() {
        return null;
    }

    public void setWeight(Integer n) {
    }

    public FlyTransportContainer getContainer_type() {
        return null;
    }

    public void setContainer_type(FlyTransportContainer flyTransportContainer) {
    }

    public Integer getLifting_length() {
        return null;
    }

    public void setLifting_length(Integer n) {
    }

    public String toString() {
        return null;
    }
}

