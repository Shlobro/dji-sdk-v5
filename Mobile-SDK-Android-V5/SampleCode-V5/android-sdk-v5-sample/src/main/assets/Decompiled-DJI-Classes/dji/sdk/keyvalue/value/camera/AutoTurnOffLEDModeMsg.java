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
import dji.sdk.keyvalue.value.camera.AutoTurnOffLEDMode;
import org.json.JSONObject;

public class AutoTurnOffLEDModeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    AutoTurnOffLEDMode value;

    public AutoTurnOffLEDModeMsg() {
    }

    public AutoTurnOffLEDModeMsg(AutoTurnOffLEDMode autoTurnOffLEDMode) {
    }

    public static AutoTurnOffLEDModeMsg fromJson(String string) {
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

    public AutoTurnOffLEDMode getValue() {
        return null;
    }

    public void setValue(AutoTurnOffLEDMode autoTurnOffLEDMode) {
    }

    public String toString() {
        return null;
    }
}

