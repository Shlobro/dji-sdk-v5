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
import dji.sdk.keyvalue.value.flightcontroller.DistanceLimitedReason;
import org.json.JSONObject;

public class DistanceLimitedReasonMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    DistanceLimitedReason value;

    public DistanceLimitedReasonMsg() {
    }

    public DistanceLimitedReasonMsg(DistanceLimitedReason distanceLimitedReason) {
    }

    public static DistanceLimitedReasonMsg fromJson(String string) {
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

    public DistanceLimitedReason getValue() {
        return null;
    }

    public void setValue(DistanceLimitedReason distanceLimitedReason) {
    }

    public String toString() {
        return null;
    }
}

