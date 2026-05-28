/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.aibox;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.aibox.AIBoxCPUInfo;
import dji.sdk.keyvalue.value.aibox.AIBoxGPUInfo;
import dji.sdk.keyvalue.value.aibox.AIBoxMemoryInfo;
import dji.sdk.keyvalue.value.base.DJIValue;
import java.util.List;
import org.json.JSONObject;

public class AIBoxDeviceOperatingInfoMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    AIBoxMemoryInfo memoryInfo;
    List<AIBoxCPUInfo> cupInfoList;
    AIBoxGPUInfo gpuInfo;
    Double powerUsage;
    Double temperature;
    Integer ramUsed;
    Integer ramTotal;
    Integer ssdUsed;
    Integer ssdTotal;

    public AIBoxDeviceOperatingInfoMsg() {
    }

    public AIBoxDeviceOperatingInfoMsg(AIBoxMemoryInfo aIBoxMemoryInfo, List<AIBoxCPUInfo> list, AIBoxGPUInfo aIBoxGPUInfo, Double d2, Double d3, Integer n, Integer n2, Integer n3, Integer n4) {
    }

    public static AIBoxDeviceOperatingInfoMsg fromJson(String string) {
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

    public AIBoxMemoryInfo getMemoryInfo() {
        return null;
    }

    public void setMemoryInfo(AIBoxMemoryInfo aIBoxMemoryInfo) {
    }

    public List<AIBoxCPUInfo> getCupInfoList() {
        return null;
    }

    public void setCupInfoList(List<AIBoxCPUInfo> list) {
    }

    public AIBoxGPUInfo getGpuInfo() {
        return null;
    }

    public void setGpuInfo(AIBoxGPUInfo aIBoxGPUInfo) {
    }

    public Double getPowerUsage() {
        return null;
    }

    public void setPowerUsage(Double d2) {
    }

    public Double getTemperature() {
        return null;
    }

    public void setTemperature(Double d2) {
    }

    public Integer getRamUsed() {
        return null;
    }

    public void setRamUsed(Integer n) {
    }

    public Integer getRamTotal() {
        return null;
    }

    public void setRamTotal(Integer n) {
    }

    public Integer getSsdUsed() {
        return null;
    }

    public void setSsdUsed(Integer n) {
    }

    public Integer getSsdTotal() {
        return null;
    }

    public void setSsdTotal(Integer n) {
    }

    public String toString() {
        return null;
    }
}

