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
import dji.sdk.keyvalue.value.flightassistant.MultipleTrackDetectedType;
import dji.sdk.keyvalue.value.flightassistant.MultipleTrackRectMode;
import org.json.JSONObject;

public class MultipleTrackSingleBoxInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer objectIndex;
    MultipleTrackRectMode rectMode;
    Double centerX;
    Double centerY;
    Double rectWidth;
    Double rectHeight;
    MultipleTrackDetectedType objType;

    public MultipleTrackSingleBoxInfo() {
    }

    public MultipleTrackSingleBoxInfo(Integer n, MultipleTrackRectMode multipleTrackRectMode, Double d2, Double d3, Double d4, Double d5, MultipleTrackDetectedType multipleTrackDetectedType) {
    }

    public static MultipleTrackSingleBoxInfo fromJson(String string) {
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

    public Integer getObjectIndex() {
        return null;
    }

    public void setObjectIndex(Integer n) {
    }

    public MultipleTrackRectMode getRectMode() {
        return null;
    }

    public void setRectMode(MultipleTrackRectMode multipleTrackRectMode) {
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

    public Double getRectWidth() {
        return null;
    }

    public void setRectWidth(Double d2) {
    }

    public Double getRectHeight() {
        return null;
    }

    public void setRectHeight(Double d2) {
    }

    public MultipleTrackDetectedType getObjType() {
        return null;
    }

    public void setObjType(MultipleTrackDetectedType multipleTrackDetectedType) {
    }

    public String toString() {
        return null;
    }
}

