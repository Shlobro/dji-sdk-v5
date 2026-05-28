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
import dji.sdk.keyvalue.value.flightassistant.GoHomeType;
import org.json.JSONObject;

public class GoHomeTypeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    GoHomeType value;

    public GoHomeTypeMsg() {
    }

    public GoHomeTypeMsg(GoHomeType goHomeType) {
    }

    public static GoHomeTypeMsg fromJson(String string) {
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

    public GoHomeType getValue() {
        return null;
    }

    public void setValue(GoHomeType goHomeType) {
    }

    public String toString() {
        return null;
    }
}

