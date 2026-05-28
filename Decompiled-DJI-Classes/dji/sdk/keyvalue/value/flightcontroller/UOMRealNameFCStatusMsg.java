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
import dji.sdk.keyvalue.value.flightcontroller.RealNameRegistrationState;
import org.json.JSONObject;

public class UOMRealNameFCStatusMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    RealNameRegistrationState value;

    public UOMRealNameFCStatusMsg() {
    }

    public UOMRealNameFCStatusMsg(RealNameRegistrationState realNameRegistrationState) {
    }

    public static UOMRealNameFCStatusMsg fromJson(String string) {
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

    public RealNameRegistrationState getValue() {
        return null;
    }

    public void setValue(RealNameRegistrationState realNameRegistrationState) {
    }

    public String toString() {
        return null;
    }
}

