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
import dji.sdk.keyvalue.value.camera.PlaybackFileType;
import dji.sdk.keyvalue.value.camera.PlaybackMode;
import dji.sdk.keyvalue.value.camera.PlaybackPhotoResolution;
import dji.sdk.keyvalue.value.common.IntPoint2D;
import org.json.JSONObject;

public class PlaybackSystemState
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    PlaybackMode mode;
    PlaybackFileType fileType;
    Integer visibleThumbnail;
    Integer totalFileCount;
    Integer selectedFileIndex;
    Integer videoPlaybackProgress;
    Integer videoDuration;
    Integer videoPlaybackPosition;
    Integer selectedFileCount;
    Integer zoomRatio;
    Integer photoCount;
    Integer videoCount;
    PlaybackPhotoResolution photoResolution;
    IntPoint2D centerPosition;
    Integer areAllFilesSelected;
    Integer isDeletingFile;
    Integer isFileValid;
    Integer isFileDownloaded;

    public PlaybackSystemState() {
    }

    public PlaybackSystemState(PlaybackMode playbackMode, PlaybackFileType playbackFileType, Integer n, Integer n2, Integer n3, Integer n4, Integer n5, Integer n6, Integer n7, Integer n8, Integer n9, Integer n10, PlaybackPhotoResolution playbackPhotoResolution, IntPoint2D intPoint2D, Integer n11, Integer n12, Integer n13, Integer n14) {
    }

    public static PlaybackSystemState fromJson(String string) {
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

    public PlaybackMode getMode() {
        return null;
    }

    public void setMode(PlaybackMode playbackMode) {
    }

    public PlaybackFileType getFileType() {
        return null;
    }

    public void setFileType(PlaybackFileType playbackFileType) {
    }

    public Integer getVisibleThumbnail() {
        return null;
    }

    public void setVisibleThumbnail(Integer n) {
    }

    public Integer getTotalFileCount() {
        return null;
    }

    public void setTotalFileCount(Integer n) {
    }

    public Integer getSelectedFileIndex() {
        return null;
    }

    public void setSelectedFileIndex(Integer n) {
    }

    public Integer getVideoPlaybackProgress() {
        return null;
    }

    public void setVideoPlaybackProgress(Integer n) {
    }

    public Integer getVideoDuration() {
        return null;
    }

    public void setVideoDuration(Integer n) {
    }

    public Integer getVideoPlaybackPosition() {
        return null;
    }

    public void setVideoPlaybackPosition(Integer n) {
    }

    public Integer getSelectedFileCount() {
        return null;
    }

    public void setSelectedFileCount(Integer n) {
    }

    public Integer getZoomRatio() {
        return null;
    }

    public void setZoomRatio(Integer n) {
    }

    public Integer getPhotoCount() {
        return null;
    }

    public void setPhotoCount(Integer n) {
    }

    public Integer getVideoCount() {
        return null;
    }

    public void setVideoCount(Integer n) {
    }

    public PlaybackPhotoResolution getPhotoResolution() {
        return null;
    }

    public void setPhotoResolution(PlaybackPhotoResolution playbackPhotoResolution) {
    }

    public IntPoint2D getCenterPosition() {
        return null;
    }

    public void setCenterPosition(IntPoint2D intPoint2D) {
    }

    public Integer getAreAllFilesSelected() {
        return null;
    }

    public void setAreAllFilesSelected(Integer n) {
    }

    public Integer getIsDeletingFile() {
        return null;
    }

    public void setIsDeletingFile(Integer n) {
    }

    public Integer getIsFileValid() {
        return null;
    }

    public void setIsFileValid(Integer n) {
    }

    public Integer getIsFileDownloaded() {
        return null;
    }

    public void setIsFileDownloaded(Integer n) {
    }

    public String toString() {
        return null;
    }
}

