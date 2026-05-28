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
import dji.sdk.keyvalue.value.common.CommonFileUpdateState;
import org.json.JSONObject;

public class AIModelUploadingInfoMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    CommonFileUpdateState state;
    Integer progress;

    public AIModelUploadingInfoMsg() {
    }

    public AIModelUploadingInfoMsg(CommonFileUpdateState commonFileUpdateState, Integer n) {
    }

    public static AIModelUploadingInfoMsg fromJson(String string) {
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

    public CommonFileUpdateState getState() {
        return null;
    }

    public void setState(CommonFileUpdateState commonFileUpdateState) {
    }

    public Integer getProgress() {
        return null;
    }

    public void setProgress(Integer n) {
    }

    public String toString() {
        return null;
    }
}

