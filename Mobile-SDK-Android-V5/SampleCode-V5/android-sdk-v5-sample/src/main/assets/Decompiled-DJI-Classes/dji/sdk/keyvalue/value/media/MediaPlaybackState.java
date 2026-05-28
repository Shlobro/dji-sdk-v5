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
import dji.sdk.keyvalue.value.media.PlaybackStatus;
import org.json.JSONObject;

public class MediaPlaybackState
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer fileIndex;
    PlaybackStatus status;
    Double playingPosition;
    Double totalDuration;
    Integer bufferProgress;

    public MediaPlaybackState() {
    }

    public MediaPlaybackState(Integer n, PlaybackStatus playbackStatus, Double d2, Double d3, Integer n2) {
    }

    public static MediaPlaybackState fromJson(String string) {
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

    public Integer getFileIndex() {
        return null;
    }

    public void setFileIndex(Integer n) {
    }

    public PlaybackStatus getStatus() {
        return null;
    }

    public void setStatus(PlaybackStatus playbackStatus) {
    }

    public Double getPlayingPosition() {
        return null;
    }

    public void setPlayingPosition(Double d2) {
    }

    public Double getTotalDuration() {
        return null;
    }

    public void setTotalDuration(Double d2) {
    }

    public Integer getBufferProgress() {
        return null;
    }

    public void setBufferProgress(Integer n) {
    }

    public String toString() {
        return null;
    }
}

