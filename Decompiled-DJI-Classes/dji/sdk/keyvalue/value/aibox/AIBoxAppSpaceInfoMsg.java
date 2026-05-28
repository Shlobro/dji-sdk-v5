/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.aibox;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class AIBoxAppSpaceInfoMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double usedSize;
    Double totalSize;

    public AIBoxAppSpaceInfoMsg() {
    }

    public AIBoxAppSpaceInfoMsg(Double d2, Double d3) {
    }

    public static AIBoxAppSpaceInfoMsg fromJson(String string) {
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

    public Double getUsedSize() {
        return null;
    }

    public void setUsedSize(Double d2) {
    }

    public Double getTotalSize() {
        return null;
    }

    public void setTotalSize(Double d2) {
    }

    public String toString() {
        return null;
    }
}

