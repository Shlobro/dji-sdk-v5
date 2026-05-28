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

public class FOVInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer width;
    Integer height;
    Integer imageRatio;
    Integer lensFocalLength;
    Integer originalWidth;
    Integer originalHeight;

    public FOVInfo() {
    }

    public FOVInfo(Integer n, Integer n2, Integer n3, Integer n4, Integer n5, Integer n6) {
    }

    public static FOVInfo fromJson(String string) {
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

    public Integer getWidth() {
        return null;
    }

    public void setWidth(Integer n) {
    }

    public Integer getHeight() {
        return null;
    }

    public void setHeight(Integer n) {
    }

    public Integer getImageRatio() {
        return null;
    }

    public void setImageRatio(Integer n) {
    }

    public Integer getLensFocalLength() {
        return null;
    }

    public void setLensFocalLength(Integer n) {
    }

    public Integer getOriginalWidth() {
        return null;
    }

    public void setOriginalWidth(Integer n) {
    }

    public Integer getOriginalHeight() {
        return null;
    }

    public void setOriginalHeight(Integer n) {
    }

    public String toString() {
        return null;
    }
}

