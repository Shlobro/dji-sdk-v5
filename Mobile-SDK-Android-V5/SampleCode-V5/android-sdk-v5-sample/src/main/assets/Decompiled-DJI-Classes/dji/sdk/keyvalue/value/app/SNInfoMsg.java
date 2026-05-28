/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.app;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class SNInfoMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String mainControlSN;
    String assembleSN;
    String gimbalSN;

    public SNInfoMsg() {
    }

    public SNInfoMsg(String string, String string2, String string3) {
    }

    public static SNInfoMsg fromJson(String string) {
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

    public String getMainControlSN() {
        return null;
    }

    public void setMainControlSN(String string) {
    }

    public String getAssembleSN() {
        return null;
    }

    public void setAssembleSN(String string) {
    }

    public String getGimbalSN() {
        return null;
    }

    public void setGimbalSN(String string) {
    }

    public String toString() {
        return null;
    }
}

