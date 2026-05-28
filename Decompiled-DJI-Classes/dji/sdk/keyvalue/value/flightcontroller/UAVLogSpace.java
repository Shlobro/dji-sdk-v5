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
import dji.sdk.keyvalue.value.flightcontroller.UAVLogComponentType;
import org.json.JSONObject;

public class UAVLogSpace
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    UAVLogComponentType type;
    Integer value;

    public UAVLogSpace() {
    }

    public UAVLogSpace(UAVLogComponentType uAVLogComponentType, Integer n) {
    }

    public static UAVLogSpace fromJson(String string) {
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

    public UAVLogComponentType getType() {
        return null;
    }

    public void setType(UAVLogComponentType uAVLogComponentType) {
    }

    public Integer getValue() {
        return null;
    }

    public void setValue(Integer n) {
    }

    public String toString() {
        return null;
    }
}

