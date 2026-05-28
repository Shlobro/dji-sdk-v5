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
import dji.sdk.keyvalue.value.camera.TemperatureControlThreshold;
import org.json.JSONObject;

public class TemperatureControlThresholdMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    TemperatureControlThreshold value;
    Boolean IsSupportHighThreshold;

    public TemperatureControlThresholdMsg() {
    }

    public TemperatureControlThresholdMsg(TemperatureControlThreshold temperatureControlThreshold, Boolean bl) {
    }

    public static TemperatureControlThresholdMsg fromJson(String string) {
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

    public TemperatureControlThreshold getValue() {
        return null;
    }

    public void setValue(TemperatureControlThreshold temperatureControlThreshold) {
    }

    public Boolean getIsSupportHighThreshold() {
        return null;
    }

    public void setIsSupportHighThreshold(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

