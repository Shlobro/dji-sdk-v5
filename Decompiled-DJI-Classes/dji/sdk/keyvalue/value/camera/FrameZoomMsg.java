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
import dji.sdk.keyvalue.value.camera.LiveViewSourceCameraType;
import org.json.JSONObject;

public class FrameZoomMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean lockGimbal;
    Boolean switchLiveview;
    LiveViewSourceCameraType targetCamera;
    Double x;
    Double y;
    Double length;
    Double width;

    public FrameZoomMsg() {
    }

    public FrameZoomMsg(Boolean bl, Boolean bl2, LiveViewSourceCameraType liveViewSourceCameraType, Double d2, Double d3, Double d4, Double d5) {
    }

    public static FrameZoomMsg fromJson(String string) {
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

    public Boolean getLockGimbal() {
        return null;
    }

    public void setLockGimbal(Boolean bl) {
    }

    public Boolean getSwitchLiveview() {
        return null;
    }

    public void setSwitchLiveview(Boolean bl) {
    }

    public LiveViewSourceCameraType getTargetCamera() {
        return null;
    }

    public void setTargetCamera(LiveViewSourceCameraType liveViewSourceCameraType) {
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

    public Double getLength() {
        return null;
    }

    public void setLength(Double d2) {
    }

    public Double getWidth() {
        return null;
    }

    public void setWidth(Double d2) {
    }

    public String toString() {
        return null;
    }
}

