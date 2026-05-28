/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class PhotoIntervalShootSettings
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer count;
    Double interval;

    public PhotoIntervalShootSettings() {
    }

    public PhotoIntervalShootSettings(Integer n, Double d2) {
    }

    public static PhotoIntervalShootSettings fromJson(String string) {
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

    public Integer getCount() {
        return null;
    }

    public void setCount(Integer n) {
    }

    public Double getInterval() {
        return null;
    }

    public void setInterval(Double d2) {
    }

    public String toString() {
        return null;
    }
}

