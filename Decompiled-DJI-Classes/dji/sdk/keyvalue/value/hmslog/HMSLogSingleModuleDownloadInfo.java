/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.hmslog;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.hmslog.HMSLogDownloadErrorInfo;
import dji.sdk.keyvalue.value.hmslog.HMSLogSingleModuleDownloadState;
import dji.sdk.keyvalue.value.hmslog.HMSLogSingleModuleInfo;
import org.json.JSONObject;

public class HMSLogSingleModuleDownloadInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    HMSLogSingleModuleDownloadState state;
    HMSLogSingleModuleInfo downloadInfo;
    String sigleModuleSavedPath;
    Long sigleModuleDownloadedSize;
    Long sigleModuleTotalSize;
    Long sigleModuleCostTimeInSeconds;
    HMSLogDownloadErrorInfo sigleModuleDownloadError;

    public HMSLogSingleModuleDownloadInfo() {
    }

    public HMSLogSingleModuleDownloadInfo(HMSLogSingleModuleDownloadState hMSLogSingleModuleDownloadState, HMSLogSingleModuleInfo hMSLogSingleModuleInfo, String string, Long l2, Long l3, Long l4, HMSLogDownloadErrorInfo hMSLogDownloadErrorInfo) {
    }

    public static HMSLogSingleModuleDownloadInfo fromJson(String string) {
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

    public HMSLogSingleModuleDownloadState getState() {
        return null;
    }

    public void setState(HMSLogSingleModuleDownloadState hMSLogSingleModuleDownloadState) {
    }

    public HMSLogSingleModuleInfo getDownloadInfo() {
        return null;
    }

    public void setDownloadInfo(HMSLogSingleModuleInfo hMSLogSingleModuleInfo) {
    }

    public String getSigleModuleSavedPath() {
        return null;
    }

    public void setSigleModuleSavedPath(String string) {
    }

    public Long getSigleModuleDownloadedSize() {
        return null;
    }

    public void setSigleModuleDownloadedSize(Long l2) {
    }

    public Long getSigleModuleTotalSize() {
        return null;
    }

    public void setSigleModuleTotalSize(Long l2) {
    }

    public Long getSigleModuleCostTimeInSeconds() {
        return null;
    }

    public void setSigleModuleCostTimeInSeconds(Long l2) {
    }

    public HMSLogDownloadErrorInfo getSigleModuleDownloadError() {
        return null;
    }

    public void setSigleModuleDownloadError(HMSLogDownloadErrorInfo hMSLogDownloadErrorInfo) {
    }

    public String toString() {
        return null;
    }
}

