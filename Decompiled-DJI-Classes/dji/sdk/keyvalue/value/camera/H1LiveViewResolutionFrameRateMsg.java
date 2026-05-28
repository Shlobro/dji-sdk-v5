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
import dji.sdk.keyvalue.value.camera.H1LiveViewResolutionFrameRate;
import org.json.JSONObject;

public class H1LiveViewResolutionFrameRateMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    H1LiveViewResolutionFrameRate value;

    public H1LiveViewResolutionFrameRateMsg() {
    }

    public H1LiveViewResolutionFrameRateMsg(H1LiveViewResolutionFrameRate h1LiveViewResolutionFrameRate) {
    }

    public static H1LiveViewResolutionFrameRateMsg fromJson(String string) {
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

    public H1LiveViewResolutionFrameRate getValue() {
        return null;
    }

    public void setValue(H1LiveViewResolutionFrameRate h1LiveViewResolutionFrameRate) {
    }

    public String toString() {
        return null;
    }
}

