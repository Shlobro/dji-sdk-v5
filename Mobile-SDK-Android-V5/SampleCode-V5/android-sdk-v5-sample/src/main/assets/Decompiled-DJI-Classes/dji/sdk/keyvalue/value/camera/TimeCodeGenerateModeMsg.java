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
import dji.sdk.keyvalue.value.camera.TimeCodeGenerateMode;
import org.json.JSONObject;

public class TimeCodeGenerateModeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    TimeCodeGenerateMode value;

    public TimeCodeGenerateModeMsg() {
    }

    public TimeCodeGenerateModeMsg(TimeCodeGenerateMode timeCodeGenerateMode) {
    }

    public static TimeCodeGenerateModeMsg fromJson(String string) {
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

    public TimeCodeGenerateMode getValue() {
        return null;
    }

    public void setValue(TimeCodeGenerateMode timeCodeGenerateMode) {
    }

    public String toString() {
        return null;
    }
}

