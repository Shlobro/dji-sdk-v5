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
import dji.sdk.keyvalue.value.flightassistant.SmartTrackSubMode;
import org.json.JSONObject;

public class SmartEyeSubModeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    SmartTrackSubMode value;

    public SmartEyeSubModeMsg() {
    }

    public SmartEyeSubModeMsg(SmartTrackSubMode smartTrackSubMode) {
    }

    public static SmartEyeSubModeMsg fromJson(String string) {
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

    public SmartTrackSubMode getValue() {
        return null;
    }

    public void setValue(SmartTrackSubMode smartTrackSubMode) {
    }

    public String toString() {
        return null;
    }
}

