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
import dji.sdk.keyvalue.value.camera.TapZoomMode;
import org.json.JSONObject;

public class ZoomTargetPointInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double x;
    Double y;
    Boolean tapZoomModeEnable;
    TapZoomMode mode;

    public ZoomTargetPointInfo() {
    }

    public ZoomTargetPointInfo(Double d2, Double d3, Boolean bl, TapZoomMode tapZoomMode) {
    }

    public static ZoomTargetPointInfo fromJson(String string) {
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

    public Boolean getTapZoomModeEnable() {
        return null;
    }

    public void setTapZoomModeEnable(Boolean bl) {
    }

    public TapZoomMode getMode() {
        return null;
    }

    public void setMode(TapZoomMode tapZoomMode) {
    }

    public String toString() {
        return null;
    }
}

