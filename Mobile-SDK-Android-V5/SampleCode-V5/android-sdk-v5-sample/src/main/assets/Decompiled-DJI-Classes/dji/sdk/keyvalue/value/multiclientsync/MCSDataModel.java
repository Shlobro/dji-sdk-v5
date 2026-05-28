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
import dji.sdk.keyvalue.value.channel.ChannelModel;
import dji.sdk.keyvalue.value.multiclientsync.MCSOperationType;
import org.json.JSONObject;

public class MCSDataModel
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    MCSOperationType operation;
    Long timestamp;
    ChannelModel dataModel;

    public MCSDataModel() {
    }

    public MCSDataModel(MCSOperationType mCSOperationType, Long l2, ChannelModel channelModel) {
    }

    public static MCSDataModel fromJson(String string) {
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

    public MCSOperationType getOperation() {
        return null;
    }

    public void setOperation(MCSOperationType mCSOperationType) {
    }

    public Long getTimestamp() {
        return null;
    }

    public void setTimestamp(Long l2) {
    }

    public ChannelModel getDataModel() {
        return null;
    }

    public void setDataModel(ChannelModel channelModel) {
    }

    public String toString() {
        return null;
    }
}

