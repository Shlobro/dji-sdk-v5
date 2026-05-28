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
import dji.sdk.keyvalue.value.camera.CameraColor;
import dji.sdk.keyvalue.value.camera.CameraEISCtrlMode;
import dji.sdk.keyvalue.value.camera.CameraExposureMode;
import dji.sdk.keyvalue.value.camera.CameraFlatMode;
import dji.sdk.keyvalue.value.camera.CameraISO;
import dji.sdk.keyvalue.value.camera.CameraShutterSpeed;
import dji.sdk.keyvalue.value.camera.CameraTimeLapseFileFormat;
import dji.sdk.keyvalue.value.camera.CameraWhiteBalanceInfo;
import dji.sdk.keyvalue.value.camera.CustomModeIndex;
import dji.sdk.keyvalue.value.camera.HyperlapseRatio;
import dji.sdk.keyvalue.value.camera.PhotoFileFormat;
import dji.sdk.keyvalue.value.camera.PhotoRatio;
import dji.sdk.keyvalue.value.camera.SlowMotionRatio;
import dji.sdk.keyvalue.value.camera.VideoFrameRate;
import dji.sdk.keyvalue.value.camera.VideoResolution;
import org.json.JSONObject;

public class CustomModeParmas
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    CustomModeIndex index;
    CameraFlatMode cameraMode;
    Boolean isVaild;
    CameraExposureMode exposureMode;
    CameraISO iso;
    CameraISO isoAutoMax;
    CameraShutterSpeed shutterSpeed;
    PhotoFileFormat photoStorageFormat;
    PhotoRatio photoRatio;
    Double countdown;
    VideoResolution resolution;
    CameraColor cameraColor;
    CameraWhiteBalanceInfo whiteBalance;
    VideoFrameRate frameRate;
    CameraEISCtrlMode eisStatus;
    Integer loopRecordDuration;
    SlowMotionRatio slowMotionRatio;
    CameraTimeLapseFileFormat timelapseStorageFormat;
    Integer timelapseInterval;
    Double timelapseDuration;
    HyperlapseRatio hyperlapseRatio;

    public CustomModeParmas() {
    }

    public CustomModeParmas(CustomModeIndex customModeIndex, CameraFlatMode cameraFlatMode, Boolean bl, CameraExposureMode cameraExposureMode, CameraISO cameraISO, CameraISO cameraISO2, CameraShutterSpeed cameraShutterSpeed, PhotoFileFormat photoFileFormat, PhotoRatio photoRatio, Double d2, VideoResolution videoResolution, CameraColor cameraColor, CameraWhiteBalanceInfo cameraWhiteBalanceInfo, VideoFrameRate videoFrameRate, CameraEISCtrlMode cameraEISCtrlMode, Integer n, SlowMotionRatio slowMotionRatio, CameraTimeLapseFileFormat cameraTimeLapseFileFormat, Integer n2, Double d3, HyperlapseRatio hyperlapseRatio) {
    }

    public static CustomModeParmas fromJson(String string) {
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

    public CustomModeIndex getIndex() {
        return null;
    }

    public void setIndex(CustomModeIndex customModeIndex) {
    }

    public CameraFlatMode getCameraMode() {
        return null;
    }

    public void setCameraMode(CameraFlatMode cameraFlatMode) {
    }

    public Boolean getIsVaild() {
        return null;
    }

    public void setIsVaild(Boolean bl) {
    }

    public CameraExposureMode getExposureMode() {
        return null;
    }

    public void setExposureMode(CameraExposureMode cameraExposureMode) {
    }

    public CameraISO getIso() {
        return null;
    }

    public void setIso(CameraISO cameraISO) {
    }

    public CameraISO getIsoAutoMax() {
        return null;
    }

    public void setIsoAutoMax(CameraISO cameraISO) {
    }

    public CameraShutterSpeed getShutterSpeed() {
        return null;
    }

    public void setShutterSpeed(CameraShutterSpeed cameraShutterSpeed) {
    }

    public PhotoFileFormat getPhotoStorageFormat() {
        return null;
    }

    public void setPhotoStorageFormat(PhotoFileFormat photoFileFormat) {
    }

    public PhotoRatio getPhotoRatio() {
        return null;
    }

    public void setPhotoRatio(PhotoRatio photoRatio) {
    }

    public Double getCountdown() {
        return null;
    }

    public void setCountdown(Double d2) {
    }

    public VideoResolution getResolution() {
        return null;
    }

    public void setResolution(VideoResolution videoResolution) {
    }

    public CameraColor getCameraColor() {
        return null;
    }

    public void setCameraColor(CameraColor cameraColor) {
    }

    public CameraWhiteBalanceInfo getWhiteBalance() {
        return null;
    }

    public void setWhiteBalance(CameraWhiteBalanceInfo cameraWhiteBalanceInfo) {
    }

    public VideoFrameRate getFrameRate() {
        return null;
    }

    public void setFrameRate(VideoFrameRate videoFrameRate) {
    }

    public CameraEISCtrlMode getEisStatus() {
        return null;
    }

    public void setEisStatus(CameraEISCtrlMode cameraEISCtrlMode) {
    }

    public Integer getLoopRecordDuration() {
        return null;
    }

    public void setLoopRecordDuration(Integer n) {
    }

    public SlowMotionRatio getSlowMotionRatio() {
        return null;
    }

    public void setSlowMotionRatio(SlowMotionRatio slowMotionRatio) {
    }

    public CameraTimeLapseFileFormat getTimelapseStorageFormat() {
        return null;
    }

    public void setTimelapseStorageFormat(CameraTimeLapseFileFormat cameraTimeLapseFileFormat) {
    }

    public Integer getTimelapseInterval() {
        return null;
    }

    public void setTimelapseInterval(Integer n) {
    }

    public Double getTimelapseDuration() {
        return null;
    }

    public void setTimelapseDuration(Double d2) {
    }

    public HyperlapseRatio getHyperlapseRatio() {
        return null;
    }

    public void setHyperlapseRatio(HyperlapseRatio hyperlapseRatio) {
    }

    public String toString() {
        return null;
    }
}

