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
import dji.sdk.keyvalue.value.common.CommonFileUpdatingInfo;
import dji.sdk.keyvalue.value.common.FileUploadException;
import org.json.JSONObject;

public class MultiFileUploadingInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String current_uploding_file_path;
    CommonFileUpdatingInfo current_uploading_file_info;
    Integer remain_file_quantity;
    FileUploadException current_file_upload_exception;

    public MultiFileUploadingInfo() {
    }

    public MultiFileUploadingInfo(String string, CommonFileUpdatingInfo commonFileUpdatingInfo, Integer n, FileUploadException fileUploadException) {
    }

    public static MultiFileUploadingInfo fromJson(String string) {
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

    public String getCurrent_uploding_file_path() {
        return null;
    }

    public void setCurrent_uploding_file_path(String string) {
    }

    public CommonFileUpdatingInfo getCurrent_uploading_file_info() {
        return null;
    }

    public void setCurrent_uploading_file_info(CommonFileUpdatingInfo commonFileUpdatingInfo) {
    }

    public Integer getRemain_file_quantity() {
        return null;
    }

    public void setRemain_file_quantity(Integer n) {
    }

    public FileUploadException getCurrent_file_upload_exception() {
        return null;
    }

    public void setCurrent_file_upload_exception(FileUploadException fileUploadException) {
    }

    public String toString() {
        return null;
    }
}

