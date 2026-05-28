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
import dji.sdk.keyvalue.value.flightassistant.QuickShotMode;
import org.json.JSONObject;

public class QuickShotParams
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    QuickShotMode mode;
    Double velocity_x;
    Double velocity_y;
    Double velocity_z;
    Double distance;
    Double time;

    public QuickShotParams() {
    }

    public QuickShotParams(QuickShotMode quickShotMode, Double d2, Double d3, Double d4, Double d5, Double d6) {
    }

    public static QuickShotParams fromJson(String string) {
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

    public QuickShotMode getMode() {
        return null;
    }

    public void setMode(QuickShotMode quickShotMode) {
    }

    public Double getVelocity_x() {
        return null;
    }

    public void setVelocity_x(Double d2) {
    }

    public Double getVelocity_y() {
        return null;
    }

    public void setVelocity_y(Double d2) {
    }

    public Double getVelocity_z() {
        return null;
    }

    public void setVelocity_z(Double d2) {
    }

    public Double getDistance() {
        return null;
    }

    public void setDistance(Double d2) {
    }

    public Double getTime() {
        return null;
    }

    public void setTime(Double d2) {
    }

    public String toString() {
        return null;
    }
}

