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
import dji.sdk.keyvalue.value.flightassistant.NavigationTrackingMode;
import org.json.JSONObject;

public class ActiveTrackMovementModeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    NavigationTrackingMode value;

    public ActiveTrackMovementModeMsg() {
    }

    public ActiveTrackMovementModeMsg(NavigationTrackingMode navigationTrackingMode) {
    }

    public static ActiveTrackMovementModeMsg fromJson(String string) {
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

    public NavigationTrackingMode getValue() {
        return null;
    }

    public void setValue(NavigationTrackingMode navigationTrackingMode) {
    }

    public String toString() {
        return null;
    }
}

