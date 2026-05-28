/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.airlink.VideoFeedPhysicalSource;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class MasterLiveVideoCameraMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer rcRole;
    Integer streamIndex;
    Integer cameraPosition;
    VideoFeedPhysicalSource physicalSource;

    public MasterLiveVideoCameraMsg() {
    }

    public MasterLiveVideoCameraMsg(Integer n, Integer n2, Integer n3, VideoFeedPhysicalSource videoFeedPhysicalSource) {
    }

    public static MasterLiveVideoCameraMsg fromJson(String string) {
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

    public Integer getRcRole() {
        return null;
    }

    public void setRcRole(Integer n) {
    }

    public Integer getStreamIndex() {
        return null;
    }

    public void setStreamIndex(Integer n) {
    }

    public Integer getCameraPosition() {
        return null;
    }

    public void setCameraPosition(Integer n) {
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

