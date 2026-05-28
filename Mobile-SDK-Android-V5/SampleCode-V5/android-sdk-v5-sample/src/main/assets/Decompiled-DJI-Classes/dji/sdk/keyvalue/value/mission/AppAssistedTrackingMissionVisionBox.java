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
import org.json.JSONObject;

public class AppAssistedTrackingMissionVisionBox
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Long timestamp;
    Integer rectMode;
    Double centerX;
    Double centerY;
    Double rectW;
    Double rectH;
    Integer fovH;
    Integer fovV;
    Integer targetType;
    Integer controlSense;

    public AppAssistedTrackingMissionVisionBox() {
    }

    public AppAssistedTrackingMissionVisionBox(Long l2, Integer n, Double d2, Double d3, Double d4, Double d5, Integer n2, Integer n3, Integer n4, Integer n5) {
    }

    public static AppAssistedTrackingMissionVisionBox fromJson(String string) {
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

    public Long getTimestamp() {
        return null;
    }

    public void setTimestamp(Long l2) {
    }

    public Integer getRectMode() {
        return null;
    }

    public void setRectMode(Integer n) {
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

    public Integer getFovH() {
        return null;
    }

    public void setFovH(Integer n) {
    }

    public Integer getFovV() {
        return null;
    }

    public void setFovV(Integer n) {
    }

    public Integer getTargetType() {
        return null;
    }

    public void setTargetType(Integer n) {
    }

    public Integer getControlSense() {
        return null;
    }

    public void setControlSense(Integer n) {
    }

    public String toString() {
        return null;
    }
}

