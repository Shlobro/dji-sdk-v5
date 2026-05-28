/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.rtkbasestation;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.rtkbasestation.DPSStatus;
import org.json.JSONObject;

public class DPSStatusMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    DPSStatus value;

    public DPSStatusMsg() {
    }

    public DPSStatusMsg(DPSStatus dPSStatus) {
    }

    public static DPSStatusMsg fromJson(String string) {
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

    public DPSStatus getValue() {
        return null;
    }

    public void setValue(DPSStatus dPSStatus) {
    }

    public String toString() {
        return null;
    }
}

