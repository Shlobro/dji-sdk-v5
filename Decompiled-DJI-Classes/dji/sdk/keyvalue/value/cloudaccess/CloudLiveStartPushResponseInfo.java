/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.cloudaccess;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.cloudaccess.CloudLiveStartPushResponseOutput;
import org.json.JSONObject;

public class CloudLiveStartPushResponseInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer result;
    CloudLiveStartPushResponseOutput output;

    public CloudLiveStartPushResponseInfo() {
    }

    public CloudLiveStartPushResponseInfo(Integer n, CloudLiveStartPushResponseOutput cloudLiveStartPushResponseOutput) {
    }

    public static CloudLiveStartPushResponseInfo fromJson(String string) {
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

    public Integer getResult() {
        return null;
    }

    public void setResult(Integer n) {
    }

    public CloudLiveStartPushResponseOutput getOutput() {
        return null;
    }

    public void setOutput(CloudLiveStartPushResponseOutput cloudLiveStartPushResponseOutput) {
    }

    public String toString() {
        return null;
    }
}

