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
import dji.sdk.keyvalue.value.hmslog.HMSLogSingleModuleDownloadInfo;
import java.util.List;
import org.json.JSONObject;

public class HMSLogDownloadState
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double progress;
    Double downloadSpeed;
    Integer moduleIndex;
    Integer currentModuleIndexDownloadTimes;
    Integer moduleNum;
    Long moduleDownloadedSize;
    Long downloadModulesSize;
    Long downloadedSize;
    Long totalSize;
    Long timestamp;
    String savedPath;
    Double compressRate;
    HMSLogDownloadErrorInfo error;
    List<HMSLogSingleModuleDownloadInfo> downloadingSubModuleInfos;

    public HMSLogDownloadState() {
    }

    public HMSLogDownloadState(Double d2, Double d3, Integer n, Integer n2, Integer n3, Long l2, Long l3, Long l4, Long l5, Long l6, String string, Double d4, HMSLogDownloadErrorInfo hMSLogDownloadErrorInfo, List<HMSLogSingleModuleDownloadInfo> list) {
    }

    public static HMSLogDownloadState fromJson(String string) {
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

    public Double getProgress() {
        return null;
    }

    public void setProgress(Double d2) {
    }

    public Double getDownloadSpeed() {
        return null;
    }

    public void setDownloadSpeed(Double d2) {
    }

    public Integer getModuleIndex() {
        return null;
    }

    public void setModuleIndex(Integer n) {
    }

    public Integer getCurrentModuleIndexDownloadTimes() {
        return null;
    }

    public void setCurrentModuleIndexDownloadTimes(Integer n) {
    }

    public Integer getModuleNum() {
        return null;
    }

    public void setModuleNum(Integer n) {
    }

    public Long getModuleDownloadedSize() {
        return null;
    }

    public void setModuleDownloadedSize(Long l2) {
    }

    public Long getDownloadModulesSize() {
        return null;
    }

    public void setDownloadModulesSize(Long l2) {
    }

    public Long getDownloadedSize() {
        return null;
    }

    public void setDownloadedSize(Long l2) {
    }

    public Long getTotalSize() {
        return null;
    }

    public void setTotalSize(Long l2) {
    }

    public Long getTimestamp() {
        return null;
    }

    public void setTimestamp(Long l2) {
    }

    public String getSavedPath() {
        return null;
    }

    public void setSavedPath(String string) {
    }

    public Double getCompressRate() {
        return null;
    }

    public void setCompressRate(Double d2) {
    }

    public HMSLogDownloadErrorInfo getError() {
        return null;
    }

    public void setError(HMSLogDownloadErrorInfo hMSLogDownloadErrorInfo) {
    }

    public List<HMSLogSingleModuleDownloadInfo> getDownloadingSubModuleInfos() {
        return null;
    }

    public void setDownloadingSubModuleInfos(List<HMSLogSingleModuleDownloadInfo> list) {
    }

    public String toString() {
        return null;
    }
}

