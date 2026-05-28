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
import dji.sdk.keyvalue.value.flightcontroller.CableFollowExitReason;
import org.json.JSONObject;

public class CableFollowExitReasonMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    CableFollowExitReason reason;

    public CableFollowExitReasonMsg() {
    }

    public CableFollowExitReasonMsg(CableFollowExitReason cableFollowExitReason) {
    }

    public static CableFollowExitReasonMsg fromJson(String string) {
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

    public CableFollowExitReason getReason() {
        return null;
    }

    public void setReason(CableFollowExitReason cableFollowExitReason) {
    }

    public String toString() {
        return null;
    }
}

