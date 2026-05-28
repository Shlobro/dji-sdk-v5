/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.ComponentIndexType;
import dji.sdk.keyvalue.value.common.MultiControlChannel;
import org.json.JSONObject;

public class MultiRCExclusiveTaskAuthOwnerMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    MultiControlChannel owner;
    ComponentIndexType payloadIndex;

    public MultiRCExclusiveTaskAuthOwnerMsg() {
    }

    public MultiRCExclusiveTaskAuthOwnerMsg(MultiControlChannel multiControlChannel, ComponentIndexType componentIndexType) {
    }

    public static MultiRCExclusiveTaskAuthOwnerMsg fromJson(String string) {
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

    public MultiControlChannel getOwner() {
        return null;
    }

    public void setOwner(MultiControlChannel multiControlChannel) {
    }

    public ComponentIndexType getPayloadIndex() {
        return null;
    }

    public void setPayloadIndex(ComponentIndexType componentIndexType) {
    }

    public String toString() {
        return null;
    }
}

