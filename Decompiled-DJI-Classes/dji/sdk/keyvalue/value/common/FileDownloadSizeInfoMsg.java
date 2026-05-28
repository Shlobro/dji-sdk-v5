/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.FileDownloadState;
import org.json.JSONObject;

public class FileDownloadSizeInfoMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    FileDownloadState state;
    Long downloadSize;
    Long totalSize;
    Integer progress;

    public FileDownloadSizeInfoMsg() {
    }

    public FileDownloadSizeInfoMsg(FileDownloadState fileDownloadState, Long l2, Long l3, Integer n) {
    }

    public static FileDownloadSizeInfoMsg fromJson(String string) {
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

    public FileDownloadState getState() {
        return null;
    }

    public void setState(FileDownloadState fileDownloadState) {
    }

    public Long getDownloadSize() {
        return null;
    }

    public void setDownloadSize(Long l2) {
    }

    public Long getTotalSize() {
        return null;
    }

    public void setTotalSize(Long l2) {
    }

    public Integer getProgress() {
        return null;
    }

    public void setProgress(Integer n) {
    }

    public String toString() {
        return null;
    }
}

