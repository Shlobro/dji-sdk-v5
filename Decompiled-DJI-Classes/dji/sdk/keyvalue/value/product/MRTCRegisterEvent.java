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
import dji.sdk.keyvalue.value.product.MRTCReturnCode;
import dji.sdk.keyvalue.value.product.MRTCState;
import org.json.JSONObject;

public class MRTCRegisterEvent
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    MRTCState state;
    MRTCReturnCode returnCode;

    public MRTCRegisterEvent() {
    }

    public MRTCRegisterEvent(MRTCState mRTCState, MRTCReturnCode mRTCReturnCode) {
    }

    public static MRTCRegisterEvent fromJson(String string) {
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

    public MRTCState getState() {
        return null;
    }

    public void setState(MRTCState mRTCState) {
    }

    public MRTCReturnCode getReturnCode() {
        return null;
    }

    public void setReturnCode(MRTCReturnCode mRTCReturnCode) {
    }

    public String toString() {
        return null;
    }
}

