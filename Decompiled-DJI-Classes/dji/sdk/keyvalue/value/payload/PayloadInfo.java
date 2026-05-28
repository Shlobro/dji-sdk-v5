/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.ComponentIndexType;
import dji.sdk.keyvalue.value.payload.PayloadType;
import org.json.JSONObject;

public class PayloadInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    ComponentIndexType index;
    PayloadType type;

    public PayloadInfo() {
    }

    public PayloadInfo(ComponentIndexType componentIndexType, PayloadType payloadType) {
    }

    public static PayloadInfo fromJson(String string) {
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

    public ComponentIndexType getIndex() {
        return null;
    }

    public void setIndex(ComponentIndexType componentIndexType) {
    }

    public PayloadType getType() {
        return null;
    }

    public void setType(PayloadType payloadType) {
    }

    public String toString() {
        return null;
    }
}

