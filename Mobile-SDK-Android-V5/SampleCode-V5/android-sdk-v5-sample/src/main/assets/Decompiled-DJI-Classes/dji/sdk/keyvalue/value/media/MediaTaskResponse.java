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
import dji.sdk.keyvalue.value.file.FileList;
import dji.sdk.keyvalue.value.file.FileType;
import dji.sdk.keyvalue.value.media.MediaFileDownloadRequest;
import dji.sdk.keyvalue.value.media.MediaFileListRequest;
import dji.sdk.keyvalue.value.media.MediaTaskType;
import org.json.JSONObject;

public class MediaTaskResponse
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    MediaTaskType type;
    FileType fileType;
    MediaFileListRequest listReq;
    MediaFileDownloadRequest dataReq;
    Boolean requestClear;
    Integer listLeft;
    Integer dataLeft;
    FileList fileList;
    Long bitSpeed;

    public MediaTaskResponse() {
    }

    public MediaTaskResponse(MediaTaskType mediaTaskType, FileType fileType, MediaFileListRequest mediaFileListRequest, MediaFileDownloadRequest mediaFileDownloadRequest, Boolean bl, Integer n, Integer n2, FileList fileList, Long l2) {
    }

    public static MediaTaskResponse fromJson(String string) {
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

    public MediaTaskType getType() {
        return null;
    }

    public void setType(MediaTaskType mediaTaskType) {
    }

    public FileType getFileType() {
        return null;
    }

    public void setFileType(FileType fileType) {
    }

    public MediaFileListRequest getListReq() {
        return null;
    }

    public void setListReq(MediaFileListRequest mediaFileListRequest) {
    }

    public MediaFileDownloadRequest getDataReq() {
        return null;
    }

    public void setDataReq(MediaFileDownloadRequest mediaFileDownloadRequest) {
    }

    public Boolean getRequestClear() {
        return null;
    }

    public void setRequestClear(Boolean bl) {
    }

    public Integer getListLeft() {
        return null;
    }

    public void setListLeft(Integer n) {
    }

    public Integer getDataLeft() {
        return null;
    }

    public void setDataLeft(Integer n) {
    }

    public FileList getFileList() {
        return null;
    }

    public void setFileList(FileList fileList) {
    }

    public Long getBitSpeed() {
        return null;
    }

    public void setBitSpeed(Long l2) {
    }

    public String toString() {
        return null;
    }
}

