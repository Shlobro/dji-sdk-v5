/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.lidar;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.lidar.EchoMode;
import org.json.JSONObject;

public class EchoModeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    EchoMode value;

    public EchoModeMsg() {
    }

    public EchoModeMsg(EchoMode echoMode) {
    }

    public static EchoModeMsg fromJson(String string) {
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

    public EchoMode getValue() {
        return null;
    }

    public void setValue(EchoMode echoMode) {
    }

    public String toString() {
        return null;
    }
}

