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
import dji.sdk.keyvalue.value.rtkmobilestation.GNSSType;
import org.json.JSONObject;

public class RTKReceiverInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    GNSSType type;
    Integer count;

    public RTKReceiverInfo() {
    }

    public RTKReceiverInfo(GNSSType gNSSType, Integer n) {
    }

    public static RTKReceiverInfo fromJson(String string) {
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

    public GNSSType getType() {
        return null;
    }

    public void setType(GNSSType gNSSType) {
    }

    public Integer getCount() {
        return null;
    }

    public void setCount(Integer n) {
    }

    public String toString() {
        return null;
    }
}

