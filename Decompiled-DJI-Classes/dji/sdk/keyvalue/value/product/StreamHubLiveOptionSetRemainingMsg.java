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
import dji.sdk.keyvalue.value.product.MRTCOptionIndex;
import dji.sdk.keyvalue.value.product.MRTCOptionSetVideoAttributeMsg;
import org.json.JSONObject;

public class StreamHubLiveOptionSetRemainingMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer version;
    ChannelInfo channelInfo;
    MRTCOptionIndex optionIndex;
    MRTCOptionSetVideoAttributeMsg attribute;

    public StreamHubLiveOptionSetRemainingMsg() {
    }

    public StreamHubLiveOptionSetRemainingMsg(Integer n, ChannelInfo channelInfo, MRTCOptionIndex mRTCOptionIndex, MRTCOptionSetVideoAttributeMsg mRTCOptionSetVideoAttributeMsg) {
    }

    public static StreamHubLiveOptionSetRemainingMsg fromJson(String string) {
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

    public MRTCOptionSetVideoAttributeMsg getAttribute() {
        return null;
    }

    public void setAttribute(MRTCOptionSetVideoAttributeMsg mRTCOptionSetVideoAttributeMsg) {
    }

    public String toString() {
        return null;
    }
}

