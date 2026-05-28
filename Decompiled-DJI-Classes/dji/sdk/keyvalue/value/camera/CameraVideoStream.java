/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.airlink.VideoFeedPhysicalSource;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.camera.CameraCType;
import dji.sdk.keyvalue.value.camera.VideoStreamIndex;
import org.json.JSONObject;

public class CameraVideoStream
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    CameraCType cameraType;
    VideoStreamIndex videoStreamIndex;
    VideoFeedPhysicalSource physicalSource;

    public CameraVideoStream() {
    }

    public CameraVideoStream(CameraCType cameraCType, VideoStreamIndex videoStreamIndex, VideoFeedPhysicalSource videoFeedPhysicalSource) {
    }

    public static CameraVideoStream fromJson(String string) {
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

    public CameraCType getCameraType() {
        return null;
    }

    public void setCameraType(CameraCType cameraCType) {
    }

    public VideoStreamIndex getVideoStreamIndex() {
        return null;
    }

    public void setVideoStreamIndex(VideoStreamIndex videoStreamIndex) {
    }

    public VideoFeedPhysicalSource getPhysicalSource() {
        return null;
    }

    public void setPhysicalSource(VideoFeedPhysicalSource videoFeedPhysicalSource) {
    }

    public String toString() {
        return null;
    }
}

