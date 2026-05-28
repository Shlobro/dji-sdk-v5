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
import dji.sdk.keyvalue.value.flightcontroller.FCMassCenterCaliExitReason;
import dji.sdk.keyvalue.value.flightcontroller.FCMassCenterCaliState;
import org.json.JSONObject;

public class GravityCenterStateMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    FCMassCenterCaliState state;
    FCMassCenterCaliExitReason exitReason;

    public GravityCenterStateMsg() {
    }

    public GravityCenterStateMsg(FCMassCenterCaliState fCMassCenterCaliState, FCMassCenterCaliExitReason fCMassCenterCaliExitReason) {
    }

    public static GravityCenterStateMsg fromJson(String string) {
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

    public FCMassCenterCaliState getState() {
        return null;
    }

    public void setState(FCMassCenterCaliState fCMassCenterCaliState) {
    }

    public FCMassCenterCaliExitReason getExitReason() {
        return null;
    }

    public void setExitReason(FCMassCenterCaliExitReason fCMassCenterCaliExitReason) {
    }

    public String toString() {
        return null;
    }
}

