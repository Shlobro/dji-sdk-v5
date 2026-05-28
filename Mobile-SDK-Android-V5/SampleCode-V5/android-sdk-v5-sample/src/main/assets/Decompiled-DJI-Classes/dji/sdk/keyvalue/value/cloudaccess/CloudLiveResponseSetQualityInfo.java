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
import dji.sdk.keyvalue.value.cloudaccess.CloudLiveResponseSetQualityOutput;
import org.json.JSONObject;

public class CloudLiveResponseSetQualityInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer result;
    CloudLiveResponseSetQualityOutput output;

    public CloudLiveResponseSetQualityInfo() {
    }

    public CloudLiveResponseSetQualityInfo(Integer n, CloudLiveResponseSetQualityOutput cloudLiveResponseSetQualityOutput) {
    }

    public static CloudLiveResponseSetQualityInfo fromJson(String string) {
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

    public CloudLiveResponseSetQualityOutput getOutput() {
        return null;
    }

    public void setOutput(CloudLiveResponseSetQualityOutput cloudLiveResponseSetQualityOutput) {
    }

    public String toString() {
        return null;
    }
}

