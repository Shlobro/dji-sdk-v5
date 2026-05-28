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
import org.json.JSONObject;

public class AccessLockerModifyAccountMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String username;
    String currentSecurityCode;
    String newerSecurityCode;

    public AccessLockerModifyAccountMsg() {
    }

    public AccessLockerModifyAccountMsg(String string, String string2, String string3) {
    }

    public static AccessLockerModifyAccountMsg fromJson(String string) {
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

    public String getUsername() {
        return null;
    }

    public void setUsername(String string) {
    }

    public String getCurrentSecurityCode() {
        return null;
    }

    public void setCurrentSecurityCode(String string) {
    }

    public String getNewerSecurityCode() {
        return null;
    }

    public void setNewerSecurityCode(String string) {
    }

    public String toString() {
        return null;
    }
}

