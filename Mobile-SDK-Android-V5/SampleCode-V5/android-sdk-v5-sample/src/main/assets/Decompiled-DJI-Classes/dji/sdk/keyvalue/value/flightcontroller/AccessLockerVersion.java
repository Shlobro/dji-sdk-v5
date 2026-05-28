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

public class AccessLockerVersion
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer majorVersion;
    Integer minorVersion;

    public AccessLockerVersion() {
    }

    public AccessLockerVersion(Integer n, Integer n2) {
    }

    public static AccessLockerVersion fromJson(String string) {
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

    public Integer getMajorVersion() {
        return null;
    }

    public void setMajorVersion(Integer n) {
    }

    public Integer getMinorVersion() {
        return null;
    }

    public void setMinorVersion(Integer n) {
    }

    public String toString() {
        return null;
    }
}

