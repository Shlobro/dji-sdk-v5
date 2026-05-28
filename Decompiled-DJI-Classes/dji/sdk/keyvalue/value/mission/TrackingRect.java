/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.mission.TrackingRectPoint;
import dji.sdk.keyvalue.value.mission.TrackingRectSize;
import org.json.JSONObject;

public class TrackingRect
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    TrackingRectPoint point;
    TrackingRectSize size;

    public TrackingRect() {
    }

    public TrackingRect(TrackingRectPoint trackingRectPoint, TrackingRectSize trackingRectSize) {
    }

    public static TrackingRect fromJson(String string) {
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

    public TrackingRectPoint getPoint() {
        return null;
    }

    public void setPoint(TrackingRectPoint trackingRectPoint) {
    }

    public TrackingRectSize getSize() {
        return null;
    }

    public void setSize(TrackingRectSize trackingRectSize) {
    }

    public String toString() {
        return null;
    }
}

