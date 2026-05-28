/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.gimbal.TypeLengthValue;
import java.util.List;
import org.json.JSONObject;

public class GimbalTLVsMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<TypeLengthValue> value;

    public GimbalTLVsMsg() {
    }

    public GimbalTLVsMsg(List<TypeLengthValue> list) {
    }

    public static GimbalTLVsMsg fromJson(String string) {
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

    public List<TypeLengthValue> getValue() {
        return null;
    }

    public void setValue(List<TypeLengthValue> list) {
    }

    public String toString() {
        return null;
    }
}

