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
import dji.sdk.keyvalue.value.flightcontroller.EscState;
import org.json.JSONObject;

public class EscStateInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    EscState state;
    Integer speed;

    public EscStateInfo() {
    }

    public EscStateInfo(EscState escState, Integer n) {
    }

    public static EscStateInfo fromJson(String string) {
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

    public EscState getState() {
        return null;
    }

    public void setState(EscState escState) {
    }

    public Integer getSpeed() {
        return null;
    }

    public void setSpeed(Integer n) {
    }

    public String toString() {
        return null;
    }
}

