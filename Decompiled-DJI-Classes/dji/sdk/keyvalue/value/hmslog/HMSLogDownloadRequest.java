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
import dji.sdk.keyvalue.value.common.ComponentIndexType;
import dji.sdk.keyvalue.value.hmslog.HMSLogDevice;
import dji.sdk.keyvalue.value.hmslog.HMSLogFileInfo;
import dji.sdk.keyvalue.value.hmslog.HMSLogSingleModuleInfo;
import dji.sdk.keyvalue.value.hmslog.HmsLogType;
import java.util.List;
import org.json.JSONObject;

public class HMSLogDownloadRequest
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    HMSLogDevice device;
    HMSLogFileInfo info;
    List<HMSLogSingleModuleInfo> downloadModules;
    String savePath;
    String module0FullPath;
    Boolean isZip;
    Boolean isEncry;
    Boolean isNetEncrypt;
    Boolean onlyError;
    HmsLogType logType;
    ComponentIndexType componentIndex;

    public HMSLogDownloadRequest() {
    }

    public HMSLogDownloadRequest(HMSLogDevice hMSLogDevice, HMSLogFileInfo hMSLogFileInfo, List<HMSLogSingleModuleInfo> list, String string, String string2, Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, HmsLogType hmsLogType, ComponentIndexType componentIndexType) {
    }

    public static HMSLogDownloadRequest fromJson(String string) {
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

    public HMSLogDevice getDevice() {
        return null;
    }

    public void setDevice(HMSLogDevice hMSLogDevice) {
    }

    public HMSLogFileInfo getInfo() {
        return null;
    }

    public void setInfo(HMSLogFileInfo hMSLogFileInfo) {
    }

    public List<HMSLogSingleModuleInfo> getDownloadModules() {
        return null;
    }

    public void setDownloadModules(List<HMSLogSingleModuleInfo> list) {
    }

    public String getSavePath() {
        return null;
    }

    public void setSavePath(String string) {
    }

    public String getModule0FullPath() {
        return null;
    }

    public void setModule0FullPath(String string) {
    }

    public Boolean getIsZip() {
        return null;
    }

    public void setIsZip(Boolean bl) {
    }

    public Boolean getIsEncry() {
        return null;
    }

    public void setIsEncry(Boolean bl) {
    }

    public Boolean getIsNetEncrypt() {
        return null;
    }

    public void setIsNetEncrypt(Boolean bl) {
    }

    public Boolean getOnlyError() {
        return null;
    }

    public void setOnlyError(Boolean bl) {
    }

    public HmsLogType getLogType() {
        return null;
    }

    public void setLogType(HmsLogType hmsLogType) {
    }

    public ComponentIndexType getComponentIndex() {
        return null;
    }

    public void setComponentIndex(ComponentIndexType componentIndexType) {
    }

    public String toString() {
        return null;
    }
}

