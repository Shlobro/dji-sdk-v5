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
import dji.sdk.keyvalue.value.camera.LiveViewSourceCameraType;
import java.util.List;
import org.json.JSONObject;

public class CameraStreamSettingsMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean requestCurrentScreen;
    List<LiveViewSourceCameraType> cameraVideoStreamSources;

    public CameraStreamSettingsMsg() {
    }

    public CameraStreamSettingsMsg(Boolean bl, List<LiveViewSourceCameraType> list) {
    }

    public static CameraStreamSettingsMsg fromJson(String string) {
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

    public Boolean getRequestCurrentScreen() {
        return null;
    }

    public void setRequestCurrentScreen(Boolean bl) {
    }

    public List<LiveViewSourceCameraType> getCameraVideoStreamSources() {
        return null;
    }

    public void setCameraVideoStreamSources(List<LiveViewSourceCameraType> list) {
    }

    public String toString() {
        return null;
    }
}

