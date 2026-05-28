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
import dji.sdk.keyvalue.value.hmslog.HMSErrorInfo;
import dji.sdk.keyvalue.value.hmslog.HMSLogDevice;
import dji.sdk.keyvalue.value.hmslog.HMSLogSingleModuleInfo;
import java.util.List;
import org.json.JSONObject;

public class HMSLogFileInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<HMSLogSingleModuleInfo> modules;
    List<HMSErrorInfo> errorInfos;
    HMSLogDevice device;
    Integer bootIndex;
    Integer flightIndex;
    String enableTime;
    String disableTime;
    String sn;
    String productType;
    Long size;
    String localPath;
    String localHMSFatalLogPath;
    String desc;
    Integer takenOff;
    List<String> exceptionHmsTags;
    Boolean isUserLocked;
    ComponentIndexType componentIndex;

    public HMSLogFileInfo() {
    }

    public HMSLogFileInfo(List<HMSLogSingleModuleInfo> list, List<HMSErrorInfo> list2, HMSLogDevice hMSLogDevice, Integer n, Integer n2, String string, String string2, String string3, String string4, Long l2, String string5, String string6, String string7, Integer n3, List<String> list3, Boolean bl, ComponentIndexType componentIndexType) {
    }

    public static HMSLogFileInfo fromJson(String string) {
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

    public List<HMSLogSingleModuleInfo> getModules() {
        return null;
    }

    public void setModules(List<HMSLogSingleModuleInfo> list) {
    }

    public List<HMSErrorInfo> getErrorInfos() {
        return null;
    }

    public void setErrorInfos(List<HMSErrorInfo> list) {
    }

    public HMSLogDevice getDevice() {
        return null;
    }

    public void setDevice(HMSLogDevice hMSLogDevice) {
    }

    public Integer getBootIndex() {
        return null;
    }

    public void setBootIndex(Integer n) {
    }

    public Integer getFlightIndex() {
        return null;
    }

    public void setFlightIndex(Integer n) {
    }

    public String getEnableTime() {
        return null;
    }

    public void setEnableTime(String string) {
    }

    public String getDisableTime() {
        return null;
    }

    public void setDisableTime(String string) {
    }

    public String getSn() {
        return null;
    }

    public void setSn(String string) {
    }

    public String getProductType() {
        return null;
    }

    public void setProductType(String string) {
    }

    public Long getSize() {
        return null;
    }

    public void setSize(Long l2) {
    }

    public String getLocalPath() {
        return null;
    }

    public void setLocalPath(String string) {
    }

    public String getLocalHMSFatalLogPath() {
        return null;
    }

    public void setLocalHMSFatalLogPath(String string) {
    }

    public String getDesc() {
        return null;
    }

    public void setDesc(String string) {
    }

    public Integer getTakenOff() {
        return null;
    }

    public void setTakenOff(Integer n) {
    }

    public List<String> getExceptionHmsTags() {
        return null;
    }

    public void setExceptionHmsTags(List<String> list) {
    }

    public Boolean getIsUserLocked() {
        return null;
    }

    public void setIsUserLocked(Boolean bl) {
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

