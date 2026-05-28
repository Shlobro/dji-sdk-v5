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

public class RGBColor
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer red;
    Integer green;
    Integer blue;

    public RGBColor() {
    }

    public RGBColor(Integer n, Integer n2, Integer n3) {
    }

    public static RGBColor fromJson(String string) {
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

    public Integer getRed() {
        return null;
    }

    public void setRed(Integer n) {
    }

    public Integer getGreen() {
        return null;
    }

    public void setGreen(Integer n) {
    }

    public Integer getBlue() {
        return null;
    }

    public void setBlue(Integer n) {
    }

    public String toString() {
        return null;
    }
}

