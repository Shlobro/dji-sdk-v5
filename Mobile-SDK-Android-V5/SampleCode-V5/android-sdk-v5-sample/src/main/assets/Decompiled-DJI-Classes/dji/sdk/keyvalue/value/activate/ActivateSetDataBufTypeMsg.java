/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.activate;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.activate.ActivateSetDataBufType;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class ActivateSetDataBufTypeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    ActivateSetDataBufType setType;

    public ActivateSetDataBufTypeMsg() {
    }

    public ActivateSetDataBufTypeMsg(ActivateSetDataBufType activateSetDataBufType) {
    }

    public static ActivateSetDataBufTypeMsg fromJson(String string) {
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

    public ActivateSetDataBufType getSetType() {
        return null;
    }

    public void setSetType(ActivateSetDataBufType activateSetDataBufType) {
    }

    public String toString() {
        return null;
    }
}

