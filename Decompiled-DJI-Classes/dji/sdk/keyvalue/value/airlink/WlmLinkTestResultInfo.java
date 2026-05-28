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

public class WlmLinkTestResultInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer test_case_id;
    Integer test_pass_cnt;
    Integer test_fail_cnt;

    public WlmLinkTestResultInfo() {
    }

    public WlmLinkTestResultInfo(Integer n, Integer n2, Integer n3) {
    }

    public static WlmLinkTestResultInfo fromJson(String string) {
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

    public Integer getTest_pass_cnt() {
        return null;
    }

    public void setTest_pass_cnt(Integer n) {
    }

    public Integer getTest_fail_cnt() {
        return null;
    }

    public void setTest_fail_cnt(Integer n) {
    }

    public String toString() {
        return null;
    }
}

