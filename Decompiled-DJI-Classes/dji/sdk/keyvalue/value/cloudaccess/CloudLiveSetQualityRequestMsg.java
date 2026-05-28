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
import dji.sdk.keyvalue.value.cloudaccess.CloudLiveSetQualityInfo;
import org.json.JSONObject;

public class CloudLiveSetQualityRequestMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String method;
    String tid;
    String bid;
    CloudLiveSetQualityInfo data;

    public CloudLiveSetQualityRequestMsg() {
    }

    public CloudLiveSetQualityRequestMsg(String string, String string2, String string3, CloudLiveSetQualityInfo cloudLiveSetQualityInfo) {
    }

    public static CloudLiveSetQualityRequestMsg fromJson(String string) {
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

    public String getMethod() {
        return null;
    }

    public void setMethod(String string) {
    }

    public String getTid() {
        return null;
    }

    public void setTid(String string) {
    }

    public String getBid() {
        return null;
    }

    public void setBid(String string) {
    }

    public CloudLiveSetQualityInfo getData() {
        return null;
    }

    public void setData(CloudLiveSetQualityInfo cloudLiveSetQualityInfo) {
    }

    public String toString() {
        return null;
    }
}

