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
import dji.sdk.keyvalue.value.camera.TargetStreamType;
import org.json.JSONObject;

public class ColorRestorationEnabledMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    TargetStreamType targetStream;
    Boolean isEnabled;

    public ColorRestorationEnabledMsg() {
    }

    public ColorRestorationEnabledMsg(TargetStreamType targetStreamType, Boolean bl) {
    }

    public static ColorRestorationEnabledMsg fromJson(String string) {
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

    public TargetStreamType getTargetStream() {
        return null;
    }

    public void setTargetStream(TargetStreamType targetStreamType) {
    }

    public Boolean getIsEnabled() {
        return null;
    }

    public void setIsEnabled(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

