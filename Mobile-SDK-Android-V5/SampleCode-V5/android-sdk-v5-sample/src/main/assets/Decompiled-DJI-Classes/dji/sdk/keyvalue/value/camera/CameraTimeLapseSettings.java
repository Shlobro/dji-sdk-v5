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
import dji.sdk.keyvalue.value.camera.CameraShootPhotoMode;
import dji.sdk.keyvalue.value.camera.CameraTimeLapseFileFormat;
import dji.sdk.keyvalue.value.common.Attitude;
import java.util.List;
import org.json.JSONObject;

public class CameraTimeLapseSettings
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    CameraShootPhotoMode timeLapseMode;
    CameraTimeLapseFileFormat format;
    List<Attitude> gimbalPositions;
    Integer interval;
    Integer duration;

    public CameraTimeLapseSettings() {
    }

    public CameraTimeLapseSettings(CameraShootPhotoMode cameraShootPhotoMode, CameraTimeLapseFileFormat cameraTimeLapseFileFormat, List<Attitude> list, Integer n, Integer n2) {
    }

    public static CameraTimeLapseSettings fromJson(String string) {
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

    public CameraShootPhotoMode getTimeLapseMode() {
        return null;
    }

    public void setTimeLapseMode(CameraShootPhotoMode cameraShootPhotoMode) {
    }

    public CameraTimeLapseFileFormat getFormat() {
        return null;
    }

    public void setFormat(CameraTimeLapseFileFormat cameraTimeLapseFileFormat) {
    }

    public List<Attitude> getGimbalPositions() {
        return null;
    }

    public void setGimbalPositions(List<Attitude> list) {
    }

    public Integer getInterval() {
        return null;
    }

    public void setInterval(Integer n) {
    }

    public Integer getDuration() {
        return null;
    }

    public void setDuration(Integer n) {
    }

    public String toString() {
        return null;
    }
}

