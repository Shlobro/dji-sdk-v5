/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.rtkmobilestation;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.rtkmobilestation.RTKAntennaType;
import org.json.JSONObject;

public class RTKAntennaTypeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    RTKAntennaType value;

    public RTKAntennaTypeMsg() {
    }

    public RTKAntennaTypeMsg(RTKAntennaType rTKAntennaType) {
    }

    public static RTKAntennaTypeMsg fromJson(String string) {
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

    public RTKAntennaType getValue() {
        return null;
    }

    public void setValue(RTKAntennaType rTKAntennaType) {
    }

    public String toString() {
        return null;
    }
}

