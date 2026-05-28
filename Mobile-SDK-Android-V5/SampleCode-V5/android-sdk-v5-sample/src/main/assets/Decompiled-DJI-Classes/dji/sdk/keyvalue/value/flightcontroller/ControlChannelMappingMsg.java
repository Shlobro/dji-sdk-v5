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
import dji.sdk.keyvalue.value.flightcontroller.ControlChannelMapping;
import org.json.JSONObject;

public class ControlChannelMappingMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    ControlChannelMapping value;

    public ControlChannelMappingMsg() {
    }

    public ControlChannelMappingMsg(ControlChannelMapping controlChannelMapping) {
    }

    public static ControlChannelMappingMsg fromJson(String string) {
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

    public ControlChannelMapping getValue() {
        return null;
    }

    public void setValue(ControlChannelMapping controlChannelMapping) {
    }

    public String toString() {
        return null;
    }
}

