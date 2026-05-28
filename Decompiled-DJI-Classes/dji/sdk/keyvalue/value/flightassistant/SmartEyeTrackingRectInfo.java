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
import dji.sdk.keyvalue.value.flightassistant.SmartEyeMode;
import org.json.JSONObject;

public class SmartEyeTrackingRectInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double centerX;
    Double centerY;
    Double width;
    Double height;
    SmartEyeMode mode;

    public SmartEyeTrackingRectInfo() {
    }

    public SmartEyeTrackingRectInfo(Double d2, Double d3, Double d4, Double d5, SmartEyeMode smartEyeMode) {
    }

    public static SmartEyeTrackingRectInfo fromJson(String string) {
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

    public SmartEyeMode getMode() {
        return null;
    }

    public void setMode(SmartEyeMode smartEyeMode) {
    }

    public String toString() {
        return null;
    }
}

