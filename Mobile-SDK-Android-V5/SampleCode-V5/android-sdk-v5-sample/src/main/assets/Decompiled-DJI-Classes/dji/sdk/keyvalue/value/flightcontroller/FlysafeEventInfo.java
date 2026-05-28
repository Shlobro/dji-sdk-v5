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
import dji.sdk.keyvalue.value.flightcontroller.FlysafeEventType;
import org.json.JSONObject;

public class FlysafeEventInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    FlysafeEventType eventType;
    String eventInfo;

    public FlysafeEventInfo() {
    }

    public FlysafeEventInfo(FlysafeEventType flysafeEventType, String string) {
    }

    public static FlysafeEventInfo fromJson(String string) {
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

    public FlysafeEventType getEventType() {
        return null;
    }

    public void setEventType(FlysafeEventType flysafeEventType) {
    }

    public String getEventInfo() {
        return null;
    }

    public void setEventInfo(String string) {
    }

    public String toString() {
        return null;
    }
}

