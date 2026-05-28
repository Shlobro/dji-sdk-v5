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
import dji.sdk.keyvalue.value.camera.TimeCodeCountMode;
import dji.sdk.keyvalue.value.camera.TimeCodeGenerateMode;
import dji.sdk.keyvalue.value.camera.TimeCodeRunMode;
import org.json.JSONObject;

public class TimeCodeModeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    TimeCodeRunMode runMode;
    TimeCodeGenerateMode generateMode;
    TimeCodeCountMode countMode;

    public TimeCodeModeMsg() {
    }

    public TimeCodeModeMsg(TimeCodeRunMode timeCodeRunMode, TimeCodeGenerateMode timeCodeGenerateMode, TimeCodeCountMode timeCodeCountMode) {
    }

    public static TimeCodeModeMsg fromJson(String string) {
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

    public TimeCodeRunMode getRunMode() {
        return null;
    }

    public void setRunMode(TimeCodeRunMode timeCodeRunMode) {
    }

    public TimeCodeGenerateMode getGenerateMode() {
        return null;
    }

    public void setGenerateMode(TimeCodeGenerateMode timeCodeGenerateMode) {
    }

    public TimeCodeCountMode getCountMode() {
        return null;
    }

    public void setCountMode(TimeCodeCountMode timeCodeCountMode) {
    }

    public String toString() {
        return null;
    }
}

