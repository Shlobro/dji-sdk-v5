/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class QuickShotRect
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double centerXRatio;
    Double centerYRatio;
    Double widthRatio;
    Double heightRatio;

    public QuickShotRect() {
    }

    public QuickShotRect(Double d2, Double d3, Double d4, Double d5) {
    }

    public static QuickShotRect fromJson(String string) {
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

    public Double getCenterXRatio() {
        return null;
    }

    public void setCenterXRatio(Double d2) {
    }

    public Double getCenterYRatio() {
        return null;
    }

    public void setCenterYRatio(Double d2) {
    }

    public Double getWidthRatio() {
        return null;
    }

    public void setWidthRatio(Double d2) {
    }

    public Double getHeightRatio() {
        return null;
    }

    public void setHeightRatio(Double d2) {
    }

    public String toString() {
        return null;
    }
}

