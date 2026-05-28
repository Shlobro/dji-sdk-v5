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
import org.json.JSONObject;

public class ClearLogQueryHistoryForFC
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String reqTime;
    Integer req;
    String resTime;
    Integer res;
    Boolean hadTakeOff;

    public ClearLogQueryHistoryForFC() {
    }

    public ClearLogQueryHistoryForFC(String string, Integer n, String string2, Integer n2, Boolean bl) {
    }

    public static ClearLogQueryHistoryForFC fromJson(String string) {
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

    public String getReqTime() {
        return null;
    }

    public void setReqTime(String string) {
    }

    public Integer getReq() {
        return null;
    }

    public void setReq(Integer n) {
    }

    public String getResTime() {
        return null;
    }

    public void setResTime(String string) {
    }

    public Integer getRes() {
        return null;
    }

    public void setRes(Integer n) {
    }

    public Boolean getHadTakeOff() {
        return null;
    }

    public void setHadTakeOff(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

