/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.multiclientsync;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.channel.ChannelMode;
import org.json.JSONObject;

public class TimeDeltaData
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Long client_id;
    ChannelMode remoteChannelMode;
    Long delta;
    Boolean isConnected;

    public TimeDeltaData() {
    }

    public TimeDeltaData(Long l2, ChannelMode channelMode, Long l3, Boolean bl) {
    }

    public static TimeDeltaData fromJson(String string) {
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

    public Long getClient_id() {
        return null;
    }

    public void setClient_id(Long l2) {
    }

    public ChannelMode getRemoteChannelMode() {
        return null;
    }

    public void setRemoteChannelMode(ChannelMode channelMode) {
    }

    public Long getDelta() {
        return null;
    }

    public void setDelta(Long l2) {
    }

    public Boolean getIsConnected() {
        return null;
    }

    public void setIsConnected(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

