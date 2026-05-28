/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.file;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.file.FileDataRequest;
import dji.sdk.keyvalue.value.file.FileList;
import dji.sdk.keyvalue.value.file.FileListRequest;
import dji.sdk.keyvalue.value.file.FileTaskType;
import dji.sdk.keyvalue.value.file.FileType;
import org.json.JSONObject;

public class FileTaskResponse
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    FileTaskType taskType;
    FileType fileType;
    FileListRequest listReq;
    FileDataRequest dataReq;
    Boolean requestClear;
    Integer listLeft;
    Integer dataLeft;
    FileList fileList;
    Long bitSpeed;
    Long receivedDataSize;
    Long totalDataSize;

    public FileTaskResponse() {
    }

    public FileTaskResponse(FileTaskType fileTaskType, FileType fileType, FileListRequest fileListRequest, FileDataRequest fileDataRequest, Boolean bl, Integer n, Integer n2, FileList fileList, Long l2, Long l3, Long l4) {
    }

    public static FileTaskResponse fromJson(String string) {
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

    public FileTaskType getTaskType() {
        return null;
    }

    public void setTaskType(FileTaskType fileTaskType) {
    }

    public FileType getFileType() {
        return null;
    }

    public void setFileType(FileType fileType) {
    }

    public FileListRequest getListReq() {
        return null;
    }

    public void setListReq(FileListRequest fileListRequest) {
    }

    public FileDataRequest getDataReq() {
        return null;
    }

    public void setDataReq(FileDataRequest fileDataRequest) {
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

    public Long getReceivedDataSize() {
        return null;
    }

    public void setReceivedDataSize(Long l2) {
    }

    public Long getTotalDataSize() {
        return null;
    }

    public void setTotalDataSize(Long l2) {
    }

    public String toString() {
        return null;
    }
}

