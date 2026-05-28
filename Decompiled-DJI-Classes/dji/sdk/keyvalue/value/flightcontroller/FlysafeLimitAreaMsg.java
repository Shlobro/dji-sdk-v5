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
import dji.sdk.keyvalue.value.flightcontroller.FlysafeLimitArea;
import java.util.List;
import org.json.JSONObject;

public class FlysafeLimitAreaMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<FlysafeLimitArea> area;

    public FlysafeLimitAreaMsg() {
    }

    public FlysafeLimitAreaMsg(List<FlysafeLimitArea> list) {
    }

    public static FlysafeLimitAreaMsg fromJson(String string) {
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

    public List<FlysafeLimitArea> getArea() {
        return null;
    }

    public void setArea(List<FlysafeLimitArea> list) {
    }

    public String toString() {
        return null;
    }
}

