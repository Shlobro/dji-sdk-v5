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

public class TimeLapseTimeSettings
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer interval;
    Integer duration;

    public TimeLapseTimeSettings() {
    }

    public TimeLapseTimeSettings(Integer n, Integer n2) {
    }

    public static TimeLapseTimeSettings fromJson(String string) {
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

    public Integer getInterval() {
        return null;
    }

    public void setInterval(Integer n) {
    }

    public Integer getDuration() {
        return null;
    }

    public void setDuration(Integer n) {
    }

    public String toString() {
        return null;
    }
}

