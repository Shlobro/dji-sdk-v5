/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.mop;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class PointCloudData
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double x;
    Double y;
    Double z;
    Integer reflectances;
    Integer r;
    Integer g;
    Integer b;

    public PointCloudData() {
    }

    public PointCloudData(Double d2, Double d3, Double d4, Integer n, Integer n2, Integer n3, Integer n4) {
    }

    public static PointCloudData fromJson(String string) {
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

    public Double getZ() {
        return null;
    }

    public void setZ(Double d2) {
    }

    public Integer getReflectances() {
        return null;
    }

    public void setReflectances(Integer n) {
    }

    public Integer getR() {
        return null;
    }

    public void setR(Integer n) {
    }

    public Integer getG() {
        return null;
    }

    public void setG(Integer n) {
    }

    public Integer getB() {
        return null;
    }

    public void setB(Integer n) {
    }

    public String toString() {
        return null;
    }
}

