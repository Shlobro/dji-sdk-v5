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
import dji.sdk.keyvalue.value.camera.CameraExposureMode;
import java.util.List;
import org.json.JSONObject;

public class CameraExposureModeRangeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<CameraExposureMode> value;

    public CameraExposureModeRangeMsg() {
    }

    public CameraExposureModeRangeMsg(List<CameraExposureMode> list) {
    }

    public static CameraExposureModeRangeMsg fromJson(String string) {
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

    public List<CameraExposureMode> getValue() {
        return null;
    }

    public void setValue(List<CameraExposureMode> list) {
    }

    public String toString() {
        return null;
    }
}

