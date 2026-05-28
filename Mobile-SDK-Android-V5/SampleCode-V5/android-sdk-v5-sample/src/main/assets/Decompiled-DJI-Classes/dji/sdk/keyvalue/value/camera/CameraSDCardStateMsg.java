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
import dji.sdk.keyvalue.value.camera.CameraSDCardState;
import org.json.JSONObject;

public class CameraSDCardStateMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    CameraSDCardState value;

    public CameraSDCardStateMsg() {
    }

    public CameraSDCardStateMsg(CameraSDCardState cameraSDCardState) {
    }

    public static CameraSDCardStateMsg fromJson(String string) {
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

    public CameraSDCardState getValue() {
        return null;
    }

    public void setValue(CameraSDCardState cameraSDCardState) {
    }

    public String toString() {
        return null;
    }
}

