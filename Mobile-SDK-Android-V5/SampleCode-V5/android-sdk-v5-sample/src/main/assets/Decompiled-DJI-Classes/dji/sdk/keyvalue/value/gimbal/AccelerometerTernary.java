/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class AccelerometerTernary
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double accX;
    Double accY;
    Double accZ;

    public AccelerometerTernary() {
    }

    public AccelerometerTernary(Double d2, Double d3, Double d4) {
    }

    public static AccelerometerTernary fromJson(String string) {
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

    public Double getAccX() {
        return null;
    }

    public void setAccX(Double d2) {
    }

    public Double getAccY() {
        return null;
    }

    public void setAccY(Double d2) {
    }

    public Double getAccZ() {
        return null;
    }

    public void setAccZ(Double d2) {
    }

    public String toString() {
        return null;
    }
}

