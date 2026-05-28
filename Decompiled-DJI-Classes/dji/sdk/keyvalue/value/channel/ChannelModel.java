/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.channel;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class ChannelModel
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String modelId;
    byte[] data;

    public ChannelModel() {
    }

    public ChannelModel(String string, byte[] byArray) {
    }

    public static ChannelModel fromJson(String string) {
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

    public String getModelId() {
        return null;
    }

    public void setModelId(String string) {
    }

    public byte[] getData() {
        return null;
    }

    public void setData(byte[] byArray) {
    }

    public String toString() {
        return null;
    }
}

