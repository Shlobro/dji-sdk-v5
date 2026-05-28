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
import dji.sdk.keyvalue.value.camera.ZoomSpeed;
import dji.sdk.keyvalue.value.camera.ZoomType;
import org.json.JSONObject;

public class OpticalZoomFocalLengthParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    ZoomType zoomType;
    ZoomSpeed zoomSpeed;
    Integer value;
    Boolean enableCompletionTime;
    Integer completionTime;

    public OpticalZoomFocalLengthParam() {
    }

    public OpticalZoomFocalLengthParam(ZoomType zoomType, ZoomSpeed zoomSpeed, Integer n, Boolean bl, Integer n2) {
    }

    public static OpticalZoomFocalLengthParam fromJson(String string) {
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

    public ZoomType getZoomType() {
        return null;
    }

    public void setZoomType(ZoomType zoomType) {
    }

    public ZoomSpeed getZoomSpeed() {
        return null;
    }

    public void setZoomSpeed(ZoomSpeed zoomSpeed) {
    }

    public Integer getValue() {
        return null;
    }

    public void setValue(Integer n) {
    }

    public Boolean getEnableCompletionTime() {
        return null;
    }

    public void setEnableCompletionTime(Boolean bl) {
    }

    public Integer getCompletionTime() {
        return null;
    }

    public void setCompletionTime(Integer n) {
    }

    public String toString() {
        return null;
    }
}

