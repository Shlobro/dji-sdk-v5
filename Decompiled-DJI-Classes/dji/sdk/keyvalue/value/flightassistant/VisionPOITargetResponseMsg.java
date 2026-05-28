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
import dji.sdk.keyvalue.value.flightassistant.VisionPOIResponseStatus;
import org.json.JSONObject;

public class VisionPOITargetResponseMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    VisionPOIResponseStatus status;
    Double centerX;
    Double centerY;
    Double rectW;
    Double rectH;

    public VisionPOITargetResponseMsg() {
    }

    public VisionPOITargetResponseMsg(VisionPOIResponseStatus visionPOIResponseStatus, Double d2, Double d3, Double d4, Double d5) {
    }

    public static VisionPOITargetResponseMsg fromJson(String string) {
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

    public VisionPOIResponseStatus getStatus() {
        return null;
    }

    public void setStatus(VisionPOIResponseStatus visionPOIResponseStatus) {
    }

    public Double getCenterX() {
        return null;
    }

    public void setCenterX(Double d2) {
    }

    public Double getCenterY() {
        return null;
    }

    public void setCenterY(Double d2) {
    }

    public Double getRectW() {
        return null;
    }

    public void setRectW(Double d2) {
    }

    public Double getRectH() {
        return null;
    }

    public void setRectH(Double d2) {
    }

    public String toString() {
        return null;
    }
}

