/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.flightcontroller.AtmosphereLightMode;
import org.json.JSONObject;

public class AtmosphereLightModeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    AtmosphereLightMode value;

    public AtmosphereLightModeMsg() {
    }

    public AtmosphereLightModeMsg(AtmosphereLightMode atmosphereLightMode) {
    }

    public static AtmosphereLightModeMsg fromJson(String string) {
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

    public AtmosphereLightMode getValue() {
        return null;
    }

    public void setValue(AtmosphereLightMode atmosphereLightMode) {
    }

    public String toString() {
        return null;
    }
}

