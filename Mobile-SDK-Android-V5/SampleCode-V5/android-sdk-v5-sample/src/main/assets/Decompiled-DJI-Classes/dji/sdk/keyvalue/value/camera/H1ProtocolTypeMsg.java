/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.camera.H1ProtocolType;
import org.json.JSONObject;

public class H1ProtocolTypeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    H1ProtocolType value;

    public H1ProtocolTypeMsg() {
    }

    public H1ProtocolTypeMsg(H1ProtocolType h1ProtocolType) {
    }

    public static H1ProtocolTypeMsg fromJson(String string) {
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

    public H1ProtocolType getValue() {
        return null;
    }

    public void setValue(H1ProtocolType h1ProtocolType) {
    }

    public String toString() {
        return null;
    }
}

