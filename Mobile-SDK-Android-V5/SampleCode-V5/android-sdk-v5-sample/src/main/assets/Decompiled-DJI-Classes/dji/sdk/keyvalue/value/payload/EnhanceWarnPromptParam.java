/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.payload.EnhanceWarnControlParam;
import dji.sdk.keyvalue.value.payload.EnhanceWarnType;
import org.json.JSONObject;

public class EnhanceWarnPromptParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    EnhanceWarnType promptType;
    EnhanceWarnControlParam controlParam;

    public EnhanceWarnPromptParam() {
    }

    public EnhanceWarnPromptParam(EnhanceWarnType enhanceWarnType, EnhanceWarnControlParam enhanceWarnControlParam) {
    }

    public static EnhanceWarnPromptParam fromJson(String string) {
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

    public EnhanceWarnType getPromptType() {
        return null;
    }

    public void setPromptType(EnhanceWarnType enhanceWarnType) {
    }

    public EnhanceWarnControlParam getControlParam() {
        return null;
    }

    public void setControlParam(EnhanceWarnControlParam enhanceWarnControlParam) {
    }

    public String toString() {
        return null;
    }
}

