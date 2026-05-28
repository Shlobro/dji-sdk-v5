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

public class AttitudeQuaternion
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double rotationX;
    Double rotationy;
    Double rotationZ;
    Double orientation;

    public AttitudeQuaternion() {
    }

    public AttitudeQuaternion(Double d2, Double d3, Double d4, Double d5) {
    }

    public static AttitudeQuaternion fromJson(String string) {
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

    public Double getRotationX() {
        return null;
    }

    public void setRotationX(Double d2) {
    }

    public Double getRotationy() {
        return null;
    }

    public void setRotationy(Double d2) {
    }

    public Double getRotationZ() {
        return null;
    }

    public void setRotationZ(Double d2) {
    }

    public Double getOrientation() {
        return null;
    }

    public void setOrientation(Double d2) {
    }

    public String toString() {
        return null;
    }
}

