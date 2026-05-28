/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.media;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.camera.CameraExposureCompensationMsg;
import dji.sdk.keyvalue.value.camera.CameraShutterSpeedMsg;
import dji.sdk.keyvalue.value.camera.CameraShutterTypeMsg;
import dji.sdk.keyvalue.value.camera.CameraWhiteBalanceInfo;
import dji.sdk.keyvalue.value.camera.CodecProfileParam;
import dji.sdk.keyvalue.value.camera.TimeCodeValueMsg;
import dji.sdk.keyvalue.value.camera.VideoFrameRate;
import org.json.JSONObject;

public class VideoProMeta
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    VideoFrameRate projectFrameRate;
    VideoFrameRate sensorFrameRate;
    TimeCodeValueMsg timecodeStart;
    TimeCodeValueMsg timecodeEnd;
    CameraShutterTypeMsg shutterType;
    CameraShutterSpeedMsg shutterSpeed;
    Integer shutterAngle;
    Double aperture;
    CameraExposureCompensationMsg ev;
    Integer ei;
    CameraWhiteBalanceInfo whiteBalance;
    Integer hue;
    Integer ndFilter;
    CodecProfileParam codecParam;

    public VideoProMeta() {
    }

    public VideoProMeta(VideoFrameRate videoFrameRate, VideoFrameRate videoFrameRate2, TimeCodeValueMsg timeCodeValueMsg, TimeCodeValueMsg timeCodeValueMsg2, CameraShutterTypeMsg cameraShutterTypeMsg, CameraShutterSpeedMsg cameraShutterSpeedMsg, Integer n, Double d2, CameraExposureCompensationMsg cameraExposureCompensationMsg, Integer n2, CameraWhiteBalanceInfo cameraWhiteBalanceInfo, Integer n3, Integer n4, CodecProfileParam codecProfileParam) {
    }

    public static VideoProMeta fromJson(String string) {
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

    public VideoFrameRate getProjectFrameRate() {
        return null;
    }

    public void setProjectFrameRate(VideoFrameRate videoFrameRate) {
    }

    public VideoFrameRate getSensorFrameRate() {
        return null;
    }

    public void setSensorFrameRate(VideoFrameRate videoFrameRate) {
    }

    public TimeCodeValueMsg getTimecodeStart() {
        return null;
    }

    public void setTimecodeStart(TimeCodeValueMsg timeCodeValueMsg) {
    }

    public TimeCodeValueMsg getTimecodeEnd() {
        return null;
    }

    public void setTimecodeEnd(TimeCodeValueMsg timeCodeValueMsg) {
    }

    public CameraShutterTypeMsg getShutterType() {
        return null;
    }

    public void setShutterType(CameraShutterTypeMsg cameraShutterTypeMsg) {
    }

    public CameraShutterSpeedMsg getShutterSpeed() {
        return null;
    }

    public void setShutterSpeed(CameraShutterSpeedMsg cameraShutterSpeedMsg) {
    }

    public Integer getShutterAngle() {
        return null;
    }

    public void setShutterAngle(Integer n) {
    }

    public Double getAperture() {
        return null;
    }

    public void setAperture(Double d2) {
    }

    public CameraExposureCompensationMsg getEv() {
        return null;
    }

    public void setEv(CameraExposureCompensationMsg cameraExposureCompensationMsg) {
    }

    public Integer getEi() {
        return null;
    }

    public void setEi(Integer n) {
    }

    public CameraWhiteBalanceInfo getWhiteBalance() {
        return null;
    }

    public void setWhiteBalance(CameraWhiteBalanceInfo cameraWhiteBalanceInfo) {
    }

    public Integer getHue() {
        return null;
    }

    public void setHue(Integer n) {
    }

    public Integer getNdFilter() {
        return null;
    }

    public void setNdFilter(Integer n) {
    }

    public CodecProfileParam getCodecParam() {
        return null;
    }

    public void setCodecParam(CodecProfileParam codecProfileParam) {
    }

    public String toString() {
        return null;
    }
}

