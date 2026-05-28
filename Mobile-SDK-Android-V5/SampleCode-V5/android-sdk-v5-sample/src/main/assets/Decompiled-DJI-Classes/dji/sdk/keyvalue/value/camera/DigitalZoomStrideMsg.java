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
import dji.sdk.keyvalue.value.camera.DigitalZoomType;
import org.json.JSONObject;

public class DigitalZoomStrideMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    DigitalZoomType type;
    Integer value;

    public DigitalZoomStrideMsg() {
    }

    public DigitalZoomStrideMsg(DigitalZoomType digitalZoomType, Integer n) {
    }

    public static DigitalZoomStrideMsg fromJson(String string) {
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

    public DigitalZoomType getType() {
        return null;
    }

    public void setType(DigitalZoomType digitalZoomType) {
    }

    public Integer getValue() {
        return null;
    }

    public void setValue(Integer n) {
    }

    public String toString() {
        return null;
    }
}

