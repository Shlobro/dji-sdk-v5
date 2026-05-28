/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.hms;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.hms.MGHMSComponentType;
import org.json.JSONObject;

public class MGHMSSubscribeComponentMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    MGHMSComponentType value;

    public MGHMSSubscribeComponentMsg() {
    }

    public MGHMSSubscribeComponentMsg(MGHMSComponentType mGHMSComponentType) {
    }

    public static MGHMSSubscribeComponentMsg fromJson(String string) {
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

    public MGHMSComponentType getValue() {
        return null;
    }

    public void setValue(MGHMSComponentType mGHMSComponentType) {
    }

    public String toString() {
        return null;
    }
}

