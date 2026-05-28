/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.airlink.SDRDistanceLossReason;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class SDRDistanceLossReasonMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    SDRDistanceLossReason value;

    public SDRDistanceLossReasonMsg() {
    }

    public SDRDistanceLossReasonMsg(SDRDistanceLossReason sDRDistanceLossReason) {
    }

    public static SDRDistanceLossReasonMsg fromJson(String string) {
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

    public SDRDistanceLossReason getValue() {
        return null;
    }

    public void setValue(SDRDistanceLossReason sDRDistanceLossReason) {
    }

    public String toString() {
        return null;
    }
}

