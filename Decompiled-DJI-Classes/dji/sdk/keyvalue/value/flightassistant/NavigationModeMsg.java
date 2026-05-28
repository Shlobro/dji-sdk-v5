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
import dji.sdk.keyvalue.value.flightassistant.NavigationMode;
import org.json.JSONObject;

public class NavigationModeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    NavigationMode value;

    public NavigationModeMsg() {
    }

    public NavigationModeMsg(NavigationMode navigationMode) {
    }

    public static NavigationModeMsg fromJson(String string) {
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

    public NavigationMode getValue() {
        return null;
    }

    public void setValue(NavigationMode navigationMode) {
    }

    public String toString() {
        return null;
    }
}

