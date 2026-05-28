/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.remotecontroller.RelayConnectionResult;
import org.json.JSONObject;

public class RelayConnectionResultMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    RelayConnectionResult result;
    Integer backoff_time;

    public RelayConnectionResultMsg() {
    }

    public RelayConnectionResultMsg(RelayConnectionResult relayConnectionResult, Integer n) {
    }

    public static RelayConnectionResultMsg fromJson(String string) {
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

    public RelayConnectionResult getResult() {
        return null;
    }

    public void setResult(RelayConnectionResult relayConnectionResult) {
    }

    public Integer getBackoff_time() {
        return null;
    }

    public void setBackoff_time(Integer n) {
    }

    public String toString() {
        return null;
    }
}

