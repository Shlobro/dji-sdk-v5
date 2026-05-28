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

public class TimelapseLiveviewMargin
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double x;
    Double y;

    public TimelapseLiveviewMargin() {
    }

    public TimelapseLiveviewMargin(Double d2, Double d3) {
    }

    public static TimelapseLiveviewMargin fromJson(String string) {
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

    public String toString() {
        return null;
    }
}

