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
import dji.sdk.keyvalue.value.common.TimeSyncSource;
import org.json.JSONObject;

public class TimeSyncInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    TimeSyncSource source;
    Long timeStamp;
    Integer timeZone;

    public TimeSyncInfo() {
    }

    public TimeSyncInfo(TimeSyncSource timeSyncSource, Long l2, Integer n) {
    }

    public static TimeSyncInfo fromJson(String string) {
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

    public TimeSyncSource getSource() {
        return null;
    }

    public void setSource(TimeSyncSource timeSyncSource) {
    }

    public Long getTimeStamp() {
        return null;
    }

    public void setTimeStamp(Long l2) {
    }

    public Integer getTimeZone() {
        return null;
    }

    public void setTimeZone(Integer n) {
    }

    public String toString() {
        return null;
    }
}

