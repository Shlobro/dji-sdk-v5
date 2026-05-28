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
import dji.sdk.keyvalue.value.camera.PictureStylePresetType;
import org.json.JSONObject;

public class PictureStylePresetMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer saturation;
    Integer contrast;
    Integer sharpness;
    PictureStylePresetType type;

    public PictureStylePresetMsg() {
    }

    public PictureStylePresetMsg(Integer n, Integer n2, Integer n3, PictureStylePresetType pictureStylePresetType) {
    }

    public static PictureStylePresetMsg fromJson(String string) {
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

    public Integer getSaturation() {
        return null;
    }

    public void setSaturation(Integer n) {
    }

    public Integer getContrast() {
        return null;
    }

    public void setContrast(Integer n) {
    }

    public Integer getSharpness() {
        return null;
    }

    public void setSharpness(Integer n) {
    }

    public PictureStylePresetType getType() {
        return null;
    }

    public void setType(PictureStylePresetType pictureStylePresetType) {
    }

    public String toString() {
        return null;
    }
}

