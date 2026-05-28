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
import dji.sdk.keyvalue.value.camera.PhotoPanoramaMode;
import org.json.JSONObject;

public class VisionPhotoPanoramaModeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    PhotoPanoramaMode value;

    public VisionPhotoPanoramaModeMsg() {
    }

    public VisionPhotoPanoramaModeMsg(PhotoPanoramaMode photoPanoramaMode) {
    }

    public static VisionPhotoPanoramaModeMsg fromJson(String string) {
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

    public PhotoPanoramaMode getValue() {
        return null;
    }

    public void setValue(PhotoPanoramaMode photoPanoramaMode) {
    }

    public String toString() {
        return null;
    }
}

