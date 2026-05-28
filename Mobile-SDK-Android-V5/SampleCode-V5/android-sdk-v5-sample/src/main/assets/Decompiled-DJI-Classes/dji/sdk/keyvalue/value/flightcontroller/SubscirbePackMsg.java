/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.flightcontroller.SubscirbePackType;
import org.json.JSONObject;

public class SubscirbePackMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    SubscirbePackType value;

    public SubscirbePackMsg() {
    }

    public SubscirbePackMsg(SubscirbePackType subscirbePackType) {
    }

    public static SubscirbePackMsg fromJson(String string) {
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

    public SubscirbePackType getValue() {
        return null;
    }

    public void setValue(SubscirbePackType subscirbePackType) {
    }

    public String toString() {
        return null;
    }
}

