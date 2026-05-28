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
import dji.sdk.keyvalue.value.product.ChannelInfo;
import dji.sdk.keyvalue.value.product.MRTCOptionHeder;
import dji.sdk.keyvalue.value.product.MRTCOptionIndex;
import org.json.JSONObject;

public class StreamHubLiveOptionGetRemainingMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer version;
    ChannelInfo channelInfo;
    MRTCOptionIndex optionIndex;
    MRTCOptionHeder header;

    public StreamHubLiveOptionGetRemainingMsg() {
    }

    public StreamHubLiveOptionGetRemainingMsg(Integer n, ChannelInfo channelInfo, MRTCOptionIndex mRTCOptionIndex, MRTCOptionHeder mRTCOptionHeder) {
    }

    public static StreamHubLiveOptionGetRemainingMsg fromJson(String string) {
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

    public Integer getVersion() {
        return null;
    }

    public void setVersion(Integer n) {
    }

    public ChannelInfo getChannelInfo() {
        return null;
    }

    public void setChannelInfo(ChannelInfo channelInfo) {
    }

    public MRTCOptionIndex getOptionIndex() {
        return null;
    }

    public void setOptionIndex(MRTCOptionIndex mRTCOptionIndex) {
    }

    public MRTCOptionHeder getHeader() {
        return null;
    }

    public void setHeader(MRTCOptionHeder mRTCOptionHeder) {
    }

    public String toString() {
        return null;
    }
}

