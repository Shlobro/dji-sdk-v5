/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.product;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.product.LiveviewUUID;
import dji.sdk.keyvalue.value.product.MRTCProtocol;
import org.json.JSONObject;

public class ChannelInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer channelId;
    LiveviewUUID UUID;
    Integer mrtcStreamId;
    MRTCProtocol liveProtocol;

    public ChannelInfo() {
    }

    public ChannelInfo(Integer n, LiveviewUUID liveviewUUID, Integer n2, MRTCProtocol mRTCProtocol) {
    }

    public static ChannelInfo fromJson(String string) {
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

    public Integer getChannelId() {
        return null;
    }

    public void setChannelId(Integer n) {
    }

    public LiveviewUUID getUUID() {
        return null;
    }

    public void setUUID(LiveviewUUID liveviewUUID) {
    }

    public Integer getMrtcStreamId() {
        return null;
    }

    public void setMrtcStreamId(Integer n) {
    }

    public MRTCProtocol getLiveProtocol() {
        return null;
    }

    public void setLiveProtocol(MRTCProtocol mRTCProtocol) {
    }

    public String toString() {
        return null;
    }
}

