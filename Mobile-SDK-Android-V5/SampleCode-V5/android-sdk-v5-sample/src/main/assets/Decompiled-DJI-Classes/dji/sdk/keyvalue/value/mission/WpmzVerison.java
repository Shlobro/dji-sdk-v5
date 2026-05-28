/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class WpmzVerison
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer major;
    Integer minor;
    Integer patch;

    public WpmzVerison() {
    }

    public WpmzVerison(Integer n, Integer n2, Integer n3) {
    }

    public static WpmzVerison fromJson(String string) {
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

    public Integer getMajor() {
        return null;
    }

    public void setMajor(Integer n) {
    }

    public Integer getMinor() {
        return null;
    }

    public void setMinor(Integer n) {
    }

    public Integer getPatch() {
        return null;
    }

    public void setPatch(Integer n) {
    }

    public String toString() {
        return null;
    }
}

