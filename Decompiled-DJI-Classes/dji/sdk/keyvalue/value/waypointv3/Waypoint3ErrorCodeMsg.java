/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.waypointv3;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.waypointv3.Waypoint3ErrorCode;
import org.json.JSONObject;

public class Waypoint3ErrorCodeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Waypoint3ErrorCode value;

    public Waypoint3ErrorCodeMsg() {
    }

    public Waypoint3ErrorCodeMsg(Waypoint3ErrorCode waypoint3ErrorCode) {
    }

    public static Waypoint3ErrorCodeMsg fromJson(String string) {
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

    public Waypoint3ErrorCode getValue() {
        return null;
    }

    public void setValue(Waypoint3ErrorCode waypoint3ErrorCode) {
    }

    public String toString() {
        return null;
    }
}

