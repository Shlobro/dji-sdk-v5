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
import dji.sdk.keyvalue.value.flightcontroller.DistanceToHomeSourceType;
import org.json.JSONObject;

public class DistanceToHomeSourceMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    DistanceToHomeSourceType level;

    public DistanceToHomeSourceMsg() {
    }

    public DistanceToHomeSourceMsg(DistanceToHomeSourceType distanceToHomeSourceType) {
    }

    public static DistanceToHomeSourceMsg fromJson(String string) {
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

    public DistanceToHomeSourceType getLevel() {
        return null;
    }

    public void setLevel(DistanceToHomeSourceType distanceToHomeSourceType) {
    }

    public String toString() {
        return null;
    }
}

