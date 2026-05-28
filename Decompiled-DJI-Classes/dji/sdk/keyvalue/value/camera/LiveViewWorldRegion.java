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

public class LiveViewWorldRegion
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double left;
    Double top;
    Double right;
    Double bottom;

    public LiveViewWorldRegion() {
    }

    public LiveViewWorldRegion(Double d2, Double d3, Double d4, Double d5) {
    }

    public static LiveViewWorldRegion fromJson(String string) {
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

    public Double getLeft() {
        return null;
    }

    public void setLeft(Double d2) {
    }

    public Double getTop() {
        return null;
    }

    public void setTop(Double d2) {
    }

    public Double getRight() {
        return null;
    }

    public void setRight(Double d2) {
    }

    public Double getBottom() {
        return null;
    }

    public void setBottom(Double d2) {
    }

    public String toString() {
        return null;
    }
}

