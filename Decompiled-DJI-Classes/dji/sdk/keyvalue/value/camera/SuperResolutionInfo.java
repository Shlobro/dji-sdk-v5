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
import dji.sdk.keyvalue.value.camera.SuperResolutionState;
import dji.sdk.keyvalue.value.common.DoubleRect4Sides;
import org.json.JSONObject;

public class SuperResolutionInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean isStorageOverflow;
    Integer sessionId;
    Integer captureColumnCount;
    Integer captureRowCount;
    Integer captureRemainingTime;
    Integer progress;
    Integer zoomCapturedCount;
    Integer zoomTotalCount;
    Integer wideCapturedCount;
    Integer wideTotalCount;
    DoubleRect4Sides captureArea;
    DoubleRect4Sides maxArea;
    SuperResolutionState status;

    public SuperResolutionInfo() {
    }

    public SuperResolutionInfo(Boolean bl, Integer n, Integer n2, Integer n3, Integer n4, Integer n5, Integer n6, Integer n7, Integer n8, Integer n9, DoubleRect4Sides doubleRect4Sides, DoubleRect4Sides doubleRect4Sides2, SuperResolutionState superResolutionState) {
    }

    public static SuperResolutionInfo fromJson(String string) {
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

    public Boolean getIsStorageOverflow() {
        return null;
    }

    public void setIsStorageOverflow(Boolean bl) {
    }

    public Integer getSessionId() {
        return null;
    }

    public void setSessionId(Integer n) {
    }

    public Integer getCaptureColumnCount() {
        return null;
    }

    public void setCaptureColumnCount(Integer n) {
    }

    public Integer getCaptureRowCount() {
        return null;
    }

    public void setCaptureRowCount(Integer n) {
    }

    public Integer getCaptureRemainingTime() {
        return null;
    }

    public void setCaptureRemainingTime(Integer n) {
    }

    public Integer getProgress() {
        return null;
    }

    public void setProgress(Integer n) {
    }

    public Integer getZoomCapturedCount() {
        return null;
    }

    public void setZoomCapturedCount(Integer n) {
    }

    public Integer getZoomTotalCount() {
        return null;
    }

    public void setZoomTotalCount(Integer n) {
    }

    public Integer getWideCapturedCount() {
        return null;
    }

    public void setWideCapturedCount(Integer n) {
    }

    public Integer getWideTotalCount() {
        return null;
    }

    public void setWideTotalCount(Integer n) {
    }

    public DoubleRect4Sides getCaptureArea() {
        return null;
    }

    public void setCaptureArea(DoubleRect4Sides doubleRect4Sides) {
    }

    public DoubleRect4Sides getMaxArea() {
        return null;
    }

    public void setMaxArea(DoubleRect4Sides doubleRect4Sides) {
    }

    public SuperResolutionState getStatus() {
        return null;
    }

    public void setStatus(SuperResolutionState superResolutionState) {
    }

    public String toString() {
        return null;
    }
}

