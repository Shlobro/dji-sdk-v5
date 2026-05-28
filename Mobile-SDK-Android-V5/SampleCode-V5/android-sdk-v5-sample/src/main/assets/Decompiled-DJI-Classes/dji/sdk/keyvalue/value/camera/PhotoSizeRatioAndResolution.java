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
import dji.sdk.keyvalue.value.camera.PhotoRatio;
import dji.sdk.keyvalue.value.camera.PhotoSize;
import org.json.JSONObject;

public class PhotoSizeRatioAndResolution
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    PhotoSize size;
    PhotoRatio ratio;
    Integer resolution;

    public PhotoSizeRatioAndResolution() {
    }

    public PhotoSizeRatioAndResolution(PhotoSize photoSize, PhotoRatio photoRatio, Integer n) {
    }

    public static PhotoSizeRatioAndResolution fromJson(String string) {
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

    public PhotoSize getSize() {
        return null;
    }

    public void setSize(PhotoSize photoSize) {
    }

    public PhotoRatio getRatio() {
        return null;
    }

    public void setRatio(PhotoRatio photoRatio) {
    }

    public Integer getResolution() {
        return null;
    }

    public void setResolution(Integer n) {
    }

    public String toString() {
        return null;
    }
}

