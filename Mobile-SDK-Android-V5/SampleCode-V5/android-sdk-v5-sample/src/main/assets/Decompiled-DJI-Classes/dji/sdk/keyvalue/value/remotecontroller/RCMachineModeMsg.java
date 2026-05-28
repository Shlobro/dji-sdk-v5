/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.remotecontroller.RCMode;
import org.json.JSONObject;

public class RCMachineModeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    RCMode value;

    public RCMachineModeMsg() {
    }

    public RCMachineModeMsg(RCMode rCMode) {
    }

    public static RCMachineModeMsg fromJson(String string) {
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

    public RCMode getValue() {
        return null;
    }

    public void setValue(RCMode rCMode) {
    }

    public String toString() {
        return null;
    }
}

