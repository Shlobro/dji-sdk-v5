/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.flightassistant.SmartEyeSpeedMode;
import org.json.JSONObject;

public class SmartEyeSpeedModeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    SmartEyeSpeedMode value;

    public SmartEyeSpeedModeMsg() {
    }

    public SmartEyeSpeedModeMsg(SmartEyeSpeedMode smartEyeSpeedMode) {
    }

    public static SmartEyeSpeedModeMsg fromJson(String string) {
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

    public SmartEyeSpeedMode getValue() {
        return null;
    }

    public void setValue(SmartEyeSpeedMode smartEyeSpeedMode) {
    }

    public String toString() {
        return null;
    }
}

