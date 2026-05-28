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

public class CameraLensFOVInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double fovDiagonal;
    Double fovHorizontal;
    Double fovVertical;

    public CameraLensFOVInfo() {
    }

    public CameraLensFOVInfo(Double d2, Double d3, Double d4) {
    }

    public static CameraLensFOVInfo fromJson(String string) {
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

    public Double getFovDiagonal() {
        return null;
    }

    public void setFovDiagonal(Double d2) {
    }

    public Double getFovHorizontal() {
        return null;
    }

    public void setFovHorizontal(Double d2) {
    }

    public Double getFovVertical() {
        return null;
    }

    public void setFovVertical(Double d2) {
    }

    public String toString() {
        return null;
    }
}

