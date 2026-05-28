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
import dji.sdk.keyvalue.value.hms.HMSMaintainType;
import org.json.JSONObject;

public class HMSMaintainParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    HMSMaintainType value;

    public HMSMaintainParam() {
    }

    public HMSMaintainParam(HMSMaintainType hMSMaintainType) {
    }

    public static HMSMaintainParam fromJson(String string) {
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

    public HMSMaintainType getValue() {
        return null;
    }

    public void setValue(HMSMaintainType hMSMaintainType) {
    }

    public String toString() {
        return null;
    }
}

