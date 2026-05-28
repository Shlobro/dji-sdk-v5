/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.flightassistant.SmartEyeException;
import org.json.JSONObject;

public class SmartEyeExceptionMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    SmartEyeException value;

    public SmartEyeExceptionMsg() {
    }

    public SmartEyeExceptionMsg(SmartEyeException smartEyeException) {
    }

    public static SmartEyeExceptionMsg fromJson(String string) {
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

    public SmartEyeException getValue() {
        return null;
    }

    public void setValue(SmartEyeException smartEyeException) {
    }

    public String toString() {
        return null;
    }
}

