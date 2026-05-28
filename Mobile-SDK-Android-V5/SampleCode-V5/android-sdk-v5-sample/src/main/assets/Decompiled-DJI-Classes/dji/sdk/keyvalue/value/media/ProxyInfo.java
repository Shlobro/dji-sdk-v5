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
import dji.sdk.keyvalue.value.camera.CameraRotateAngle;
import dji.sdk.keyvalue.value.camera.VideoFrameRate;
import dji.sdk.keyvalue.value.camera.VideoResolution;
import org.json.JSONObject;

public class ProxyInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer proxyIndex;
    Long proxySize;
    Long proxyDuration;
    VideoFrameRate proxyFrameRate;
    CameraRotateAngle proxyRotation;
    VideoResolution proxyResolution;

    public ProxyInfo() {
    }

    public ProxyInfo(Integer n, Long l2, Long l3, VideoFrameRate videoFrameRate, CameraRotateAngle cameraRotateAngle, VideoResolution videoResolution) {
    }

    public static ProxyInfo fromJson(String string) {
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

    public Integer getProxyIndex() {
        return null;
    }

    public void setProxyIndex(Integer n) {
    }

    public Long getProxySize() {
        return null;
    }

    public void setProxySize(Long l2) {
    }

    public Long getProxyDuration() {
        return null;
    }

    public void setProxyDuration(Long l2) {
    }

    public VideoFrameRate getProxyFrameRate() {
        return null;
    }

    public void setProxyFrameRate(VideoFrameRate videoFrameRate) {
    }

    public CameraRotateAngle getProxyRotation() {
        return null;
    }

    public void setProxyRotation(CameraRotateAngle cameraRotateAngle) {
    }

    public VideoResolution getProxyResolution() {
        return null;
    }

    public void setProxyResolution(VideoResolution videoResolution) {
    }

    public String toString() {
        return null;
    }
}

