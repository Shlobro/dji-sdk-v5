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
import dji.sdk.keyvalue.value.camera.DateTime;
import dji.sdk.keyvalue.value.camera.MediaFileType;
import org.json.JSONObject;

public class CommonFile
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer fileIndex;
    MediaFileType fileType;
    String fileName;
    Long fileSize;
    DateTime date;
    String md5;

    public CommonFile() {
    }

    public CommonFile(Integer n, MediaFileType mediaFileType, String string, Long l2, DateTime dateTime, String string2) {
    }

    public static CommonFile fromJson(String string) {
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

    public MediaFileType getFileType() {
        return null;
    }

    public void setFileType(MediaFileType mediaFileType) {
    }

    public String getFileName() {
        return null;
    }

    public void setFileName(String string) {
    }

    public Long getFileSize() {
        return null;
    }

    public void setFileSize(Long l2) {
    }

    public DateTime getDate() {
        return null;
    }

    public void setDate(DateTime dateTime) {
    }

    public String getMd5() {
        return null;
    }

    public void setMd5(String string) {
    }

    public String toString() {
        return null;
    }
}

