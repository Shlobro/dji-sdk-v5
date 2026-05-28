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
import dji.sdk.keyvalue.value.flightcontroller.IOStateIndex;
import org.json.JSONObject;

public class IOStateIndexMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    IOStateIndex value;

    public IOStateIndexMsg() {
    }

    public IOStateIndexMsg(IOStateIndex iOStateIndex) {
    }

    public static IOStateIndexMsg fromJson(String string) {
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

    public IOStateIndex getValue() {
        return null;
    }

    public void setValue(IOStateIndex iOStateIndex) {
    }

    public String toString() {
        return null;
    }
}

