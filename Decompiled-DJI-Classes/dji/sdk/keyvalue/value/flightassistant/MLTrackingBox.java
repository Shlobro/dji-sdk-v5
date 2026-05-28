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
import dji.sdk.keyvalue.value.flightassistant.MLTargetObjectType;
import dji.sdk.keyvalue.value.flightassistant.MLTrackingMode;
import org.json.JSONObject;

public class MLTrackingBox
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double centerXRatio;
    Double centerYRatio;
    Double widthRatio;
    Double heightRatio;
    MLTrackingMode mode;
    Long timeStamp;
    MLTargetObjectType type;
    Integer screenWidth;
    Integer screenHeight;

    public MLTrackingBox() {
    }

    public MLTrackingBox(Double d2, Double d3, Double d4, Double d5, MLTrackingMode mLTrackingMode, Long l2, MLTargetObjectType mLTargetObjectType, Integer n, Integer n2) {
    }

    public static MLTrackingBox fromJson(String string) {
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

    public Double getCenterXRatio() {
        return null;
    }

    public void setCenterXRatio(Double d2) {
    }

    public Double getCenterYRatio() {
        return null;
    }

    public void setCenterYRatio(Double d2) {
    }

    public Double getWidthRatio() {
        return null;
    }

    public void setWidthRatio(Double d2) {
    }

    public Double getHeightRatio() {
        return null;
    }

    public void setHeightRatio(Double d2) {
    }

    public MLTrackingMode getMode() {
        return null;
    }

    public void setMode(MLTrackingMode mLTrackingMode) {
    }

    public Long getTimeStamp() {
        return null;
    }

    public void setTimeStamp(Long l2) {
    }

    public MLTargetObjectType getType() {
        return null;
    }

    public void setType(MLTargetObjectType mLTargetObjectType) {
    }

    public Integer getScreenWidth() {
        return null;
    }

    public void setScreenWidth(Integer n) {
    }

    public Integer getScreenHeight() {
        return null;
    }

    public void setScreenHeight(Integer n) {
    }

    public String toString() {
        return null;
    }
}

