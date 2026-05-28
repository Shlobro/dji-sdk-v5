/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.lidar;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class PosQuaternion
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double qw;
    Double qx;
    Double qy;
    Double qz;

    public PosQuaternion() {
    }

    public PosQuaternion(Double d2, Double d3, Double d4, Double d5) {
    }

    public static PosQuaternion fromJson(String string) {
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

    public Double getQw() {
        return null;
    }

    public void setQw(Double d2) {
    }

    public Double getQx() {
        return null;
    }

    public void setQx(Double d2) {
    }

    public Double getQy() {
        return null;
    }

    public void setQy(Double d2) {
    }

    public Double getQz() {
        return null;
    }

    public void setQz(Double d2) {
    }

    public String toString() {
        return null;
    }
}

