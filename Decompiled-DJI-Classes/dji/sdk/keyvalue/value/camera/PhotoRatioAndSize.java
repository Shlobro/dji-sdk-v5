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

public class PhotoRatioAndSize
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    PhotoRatio ratio;
    PhotoSize size;

    public PhotoRatioAndSize() {
    }

    public PhotoRatioAndSize(PhotoRatio photoRatio, PhotoSize photoSize) {
    }

    public static PhotoRatioAndSize fromJson(String string) {
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

    public PhotoRatio getRatio() {
        return null;
    }

    public void setRatio(PhotoRatio photoRatio) {
    }

    public PhotoSize getSize() {
        return null;
    }

    public void setSize(PhotoSize photoSize) {
    }

    public String toString() {
        return null;
    }
}

