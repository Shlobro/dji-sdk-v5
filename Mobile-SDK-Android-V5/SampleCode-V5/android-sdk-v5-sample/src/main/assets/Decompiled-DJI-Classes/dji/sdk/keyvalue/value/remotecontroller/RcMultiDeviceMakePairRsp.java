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
import dji.sdk.keyvalue.value.remotecontroller.RcCurrentPairState;
import org.json.JSONObject;

public class RcMultiDeviceMakePairRsp
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    RcCurrentPairState value;

    public RcMultiDeviceMakePairRsp() {
    }

    public RcMultiDeviceMakePairRsp(RcCurrentPairState rcCurrentPairState) {
    }

    public static RcMultiDeviceMakePairRsp fromJson(String string) {
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

    public RcCurrentPairState getValue() {
        return null;
    }

    public void setValue(RcCurrentPairState rcCurrentPairState) {
    }

    public String toString() {
        return null;
    }
}

