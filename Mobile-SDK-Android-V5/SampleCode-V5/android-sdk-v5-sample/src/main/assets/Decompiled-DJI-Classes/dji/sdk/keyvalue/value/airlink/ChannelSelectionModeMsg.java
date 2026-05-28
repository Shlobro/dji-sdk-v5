/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.airlink.ChannelSelectionMode;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class ChannelSelectionModeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    ChannelSelectionMode value;

    public ChannelSelectionModeMsg() {
    }

    public ChannelSelectionModeMsg(ChannelSelectionMode channelSelectionMode) {
    }

    public static ChannelSelectionModeMsg fromJson(String string) {
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

    public ChannelSelectionMode getValue() {
        return null;
    }

    public void setValue(ChannelSelectionMode channelSelectionMode) {
    }

    public String toString() {
        return null;
    }
}

