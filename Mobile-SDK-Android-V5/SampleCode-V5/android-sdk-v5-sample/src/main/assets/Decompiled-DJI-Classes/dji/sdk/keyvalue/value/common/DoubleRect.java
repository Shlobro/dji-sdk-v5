/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class DoubleRect
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double x;
    Double y;
    Double width;
    Double height;

    public DoubleRect() {
    }

    public DoubleRect(Double d2, Double d3, Double d4, Double d5) {
    }

    public static DoubleRect fromJson(String string) {
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

    public Double getX() {
        return null;
    }

    public void setX(Double d2) {
    }

    public Double getY() {
        return null;
    }

    public void setY(Double d2) {
    }

    public Double getWidth() {
        return null;
    }

    public void setWidth(Double d2) {
    }

    public Double getHeight() {
        return null;
    }

    public void setHeight(Double d2) {
    }

    public String toString() {
        return null;
    }
}

