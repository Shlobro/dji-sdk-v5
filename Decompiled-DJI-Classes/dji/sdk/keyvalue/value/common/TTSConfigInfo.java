/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class TTSConfigInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer type;
    Integer language;
    Integer volume;
    Integer speed;

    public TTSConfigInfo() {
    }

    public TTSConfigInfo(Integer n, Integer n2, Integer n3, Integer n4) {
    }

    public static TTSConfigInfo fromJson(String string) {
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

    public Integer getType() {
        return null;
    }

    public void setType(Integer n) {
    }

    public Integer getLanguage() {
        return null;
    }

    public void setLanguage(Integer n) {
    }

    public Integer getVolume() {
        return null;
    }

    public void setVolume(Integer n) {
    }

    public Integer getSpeed() {
        return null;
    }

    public void setSpeed(Integer n) {
    }

    public String toString() {
        return null;
    }
}

