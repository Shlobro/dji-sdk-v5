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

public class WlmStartLinkTestInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer test_case_id;
    Integer test_cnt;
    Integer test_interval;

    public WlmStartLinkTestInfo() {
    }

    public WlmStartLinkTestInfo(Integer n, Integer n2, Integer n3) {
    }

    public static WlmStartLinkTestInfo fromJson(String string) {
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

    public Integer getTest_case_id() {
        return null;
    }

    public void setTest_case_id(Integer n) {
    }

    public Integer getTest_cnt() {
        return null;
    }

    public void setTest_cnt(Integer n) {
    }

    public Integer getTest_interval() {
        return null;
    }

    public void setTest_interval(Integer n) {
    }

    public String toString() {
        return null;
    }
}

