/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.flightassistant.TimelapseStopSaveType;
import dji.sdk.keyvalue.value.flightassistant.TimelapseStopType;
import org.json.JSONObject;

public class TimelapseStopSettingsInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    TimelapseStopType stopType;
    TimelapseStopSaveType saveType;

    public TimelapseStopSettingsInfo() {
    }

    public TimelapseStopSettingsInfo(TimelapseStopType timelapseStopType, TimelapseStopSaveType timelapseStopSaveType) {
    }

    public static TimelapseStopSettingsInfo fromJson(String string) {
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

    public TimelapseStopType getStopType() {
        return null;
    }

    public void setStopType(TimelapseStopType timelapseStopType) {
    }

    public TimelapseStopSaveType getSaveType() {
        return null;
    }

    public void setSaveType(TimelapseStopSaveType timelapseStopSaveType) {
    }

    public String toString() {
        return null;
    }
}

