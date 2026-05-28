/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.rtkbasestation;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class RtcmDataMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String body;
    Integer source;
    Integer index;

    public RtcmDataMsg() {
    }

    public RtcmDataMsg(String string, Integer n, Integer n2) {
    }

    public static RtcmDataMsg fromJson(String string) {
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

    public String getBody() {
        return null;
    }

    public void setBody(String string) {
    }

    public Integer getSource() {
        return null;
    }

    public void setSource(Integer n) {
    }

    public Integer getIndex() {
        return null;
    }

    public void setIndex(Integer n) {
    }

    public String toString() {
        return null;
    }
}

