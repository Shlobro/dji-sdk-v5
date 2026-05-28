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
import dji.sdk.keyvalue.value.lidar.ScanMode;
import org.json.JSONObject;

public class ScanModeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    ScanMode value;

    public ScanModeMsg() {
    }

    public ScanModeMsg(ScanMode scanMode) {
    }

    public static ScanModeMsg fromJson(String string) {
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

    public ScanMode getValue() {
        return null;
    }

    public void setValue(ScanMode scanMode) {
    }

    public String toString() {
        return null;
    }
}

