/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.activate;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class ActivateUsedInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer usedTimes;
    Integer totolTimes;

    public ActivateUsedInfo() {
    }

    public ActivateUsedInfo(Integer n, Integer n2) {
    }

    public static ActivateUsedInfo fromJson(String string) {
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

    public Integer getUsedTimes() {
        return null;
    }

    public void setUsedTimes(Integer n) {
    }

    public Integer getTotolTimes() {
        return null;
    }

    public void setTotolTimes(Integer n) {
    }

    public String toString() {
        return null;
    }
}

