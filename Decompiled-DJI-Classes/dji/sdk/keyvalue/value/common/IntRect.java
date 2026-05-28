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

public class IntRect
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer x;
    Integer y;
    Integer width;
    Integer height;

    public IntRect() {
    }

    public IntRect(Integer n, Integer n2, Integer n3, Integer n4) {
    }

    public static IntRect fromJson(String string) {
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

    public Integer getX() {
        return null;
    }

    public void setX(Integer n) {
    }

    public Integer getY() {
        return null;
    }

    public void setY(Integer n) {
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

    public String toString() {
        return null;
    }
}

