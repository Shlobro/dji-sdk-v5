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
import dji.sdk.keyvalue.value.common.MultiControlChannel;
import org.json.JSONObject;

public class MultiControlChannelInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    MultiControlChannel value;

    public MultiControlChannelInfo() {
    }

    public MultiControlChannelInfo(MultiControlChannel multiControlChannel) {
    }

    public static MultiControlChannelInfo fromJson(String string) {
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

    public MultiControlChannel getValue() {
        return null;
    }

    public void setValue(MultiControlChannel multiControlChannel) {
    }

    public String toString() {
        return null;
    }
}

