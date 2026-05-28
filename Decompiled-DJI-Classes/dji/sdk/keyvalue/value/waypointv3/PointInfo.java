/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.waypointv3;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.waypointv3.PointState;
import org.json.JSONObject;

public class PointInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer index;
    PointState state;
    Double progress;

    public PointInfo() {
    }

    public PointInfo(Integer n, PointState pointState, Double d2) {
    }

    public static PointInfo fromJson(String string) {
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

    public Integer getIndex() {
        return null;
    }

    public void setIndex(Integer n) {
    }

    public PointState getState() {
        return null;
    }

    public void setState(PointState pointState) {
    }

    public Double getProgress() {
        return null;
    }

    public void setProgress(Double d2) {
    }

    public String toString() {
        return null;
    }
}

