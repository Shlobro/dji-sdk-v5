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
import dji.sdk.keyvalue.value.camera.CameraFocusState;
import org.json.JSONObject;

public class MultiCameraFocusInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer index;
    Double x;
    Double y;
    Double width;
    Double height;
    CameraFocusState focus_state;

    public MultiCameraFocusInfo() {
    }

    public MultiCameraFocusInfo(Integer n, Double d2, Double d3, Double d4, Double d5, CameraFocusState cameraFocusState) {
    }

    public static MultiCameraFocusInfo fromJson(String string) {
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

    public Double getWidth() {
        return null;
    }

    public void setWidth(Double d2) {
    }

    public Double getHeight() {
        return null;
    }

    public void setHeight(Double d2) {
    }

    public CameraFocusState getFocus_state() {
        return null;
    }

    public void setFocus_state(CameraFocusState cameraFocusState) {
    }

    public String toString() {
        return null;
    }
}

