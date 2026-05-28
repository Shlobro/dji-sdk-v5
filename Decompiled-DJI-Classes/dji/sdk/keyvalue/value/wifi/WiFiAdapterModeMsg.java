/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.wifi;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.wifi.WiFiAdapterMode;
import org.json.JSONObject;

public class WiFiAdapterModeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WiFiAdapterMode value;

    public WiFiAdapterModeMsg() {
    }

    public WiFiAdapterModeMsg(WiFiAdapterMode wiFiAdapterMode) {
    }

    public static WiFiAdapterModeMsg fromJson(String string) {
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

    public WiFiAdapterMode getValue() {
        return null;
    }

    public void setValue(WiFiAdapterMode wiFiAdapterMode) {
    }

    public String toString() {
        return null;
    }
}

