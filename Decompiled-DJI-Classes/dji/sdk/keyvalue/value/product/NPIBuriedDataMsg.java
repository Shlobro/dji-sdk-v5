/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.product;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.TLVData;
import java.util.List;
import org.json.JSONObject;

public class NPIBuriedDataMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<TLVData> value;

    public NPIBuriedDataMsg() {
    }

    public NPIBuriedDataMsg(List<TLVData> list) {
    }

    public static NPIBuriedDataMsg fromJson(String string) {
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

    public List<TLVData> getValue() {
        return null;
    }

    public void setValue(List<TLVData> list) {
    }

    public String toString() {
        return null;
    }
}

