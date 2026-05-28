/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.DataLinkType;
import org.json.JSONObject;

public class DataLinkTypeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    DataLinkType value;

    public DataLinkTypeMsg() {
    }

    public DataLinkTypeMsg(DataLinkType dataLinkType) {
    }

    public static DataLinkTypeMsg fromJson(String string) {
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

    public DataLinkType getValue() {
        return null;
    }

    public void setValue(DataLinkType dataLinkType) {
    }

    public String toString() {
        return null;
    }
}

