/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.glass;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.glass.CpStatus;
import org.json.JSONObject;

public class CpStatusMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    CpStatus value;

    public CpStatusMsg() {
    }

    public CpStatusMsg(CpStatus cpStatus) {
    }

    public static CpStatusMsg fromJson(String string) {
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

    public CpStatus getValue() {
        return null;
    }

    public void setValue(CpStatus cpStatus) {
    }

    public String toString() {
        return null;
    }
}

