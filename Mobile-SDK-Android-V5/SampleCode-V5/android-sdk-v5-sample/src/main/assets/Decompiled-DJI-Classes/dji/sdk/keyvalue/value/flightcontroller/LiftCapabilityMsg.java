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
import dji.sdk.keyvalue.value.flightcontroller.LiftCapabilityLevel;
import org.json.JSONObject;

public class LiftCapabilityMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double liftForce;
    LiftCapabilityLevel liftLevel;

    public LiftCapabilityMsg() {
    }

    public LiftCapabilityMsg(Double d2, LiftCapabilityLevel liftCapabilityLevel) {
    }

    public static LiftCapabilityMsg fromJson(String string) {
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

    public Double getLiftForce() {
        return null;
    }

    public void setLiftForce(Double d2) {
    }

    public LiftCapabilityLevel getLiftLevel() {
        return null;
    }

    public void setLiftLevel(LiftCapabilityLevel liftCapabilityLevel) {
    }

    public String toString() {
        return null;
    }
}

