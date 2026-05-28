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
import dji.sdk.keyvalue.value.product.ChannelID;
import org.json.JSONObject;

public class LiveStateItem
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    ChannelID channelID;
    Integer errorCode;

    public LiveStateItem() {
    }

    public LiveStateItem(ChannelID channelID, Integer n) {
    }

    public static LiveStateItem fromJson(String string) {
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

    public ChannelID getChannelID() {
        return null;
    }

    public void setChannelID(ChannelID channelID) {
    }

    public Integer getErrorCode() {
        return null;
    }

    public void setErrorCode(Integer n) {
    }

    public String toString() {
        return null;
    }
}

