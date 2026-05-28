/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class WlmDongleSubscribeInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String sn;
    Long curTime;
    Long startTime;
    Long expTime;

    public WlmDongleSubscribeInfo() {
    }

    public WlmDongleSubscribeInfo(String string, Long l2, Long l3, Long l4) {
    }

    public static WlmDongleSubscribeInfo fromJson(String string) {
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

    public String getSn() {
        return null;
    }

    public void setSn(String string) {
    }

    public Long getCurTime() {
        return null;
    }

    public void setCurTime(Long l2) {
    }

    public Long getStartTime() {
        return null;
    }

    public void setStartTime(Long l2) {
    }

    public Long getExpTime() {
        return null;
    }

    public void setExpTime(Long l2) {
    }

    public String toString() {
        return null;
    }
}

