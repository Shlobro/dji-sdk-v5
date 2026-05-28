/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.airlink.Sub2GAuthState;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class Sub2GAuthStateMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Sub2GAuthState state;

    public Sub2GAuthStateMsg() {
    }

    public Sub2GAuthStateMsg(Sub2GAuthState sub2GAuthState) {
    }

    public static Sub2GAuthStateMsg fromJson(String string) {
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

    public Sub2GAuthState getState() {
        return null;
    }

    public void setState(Sub2GAuthState sub2GAuthState) {
    }

    public String toString() {
        return null;
    }
}

