/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.airlink.ChannelPriority;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class ChannelPriorityParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer sourceId;
    ChannelPriority priority;

    public ChannelPriorityParam() {
    }

    public ChannelPriorityParam(Integer n, ChannelPriority channelPriority) {
    }

    public static ChannelPriorityParam fromJson(String string) {
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

    public Integer getSourceId() {
        return null;
    }

    public void setSourceId(Integer n) {
    }

    public ChannelPriority getPriority() {
        return null;
    }

    public void setPriority(ChannelPriority channelPriority) {
    }

    public String toString() {
        return null;
    }
}

