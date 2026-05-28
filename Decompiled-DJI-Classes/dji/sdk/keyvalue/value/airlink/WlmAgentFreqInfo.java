/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.airlink.RadioBandType;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class WlmAgentFreqInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean isWiFiConnected;
    Integer connectDeviceCnt;
    Double centerFreq;
    Double bandWith;
    RadioBandType radioBandType;

    public WlmAgentFreqInfo() {
    }

    public WlmAgentFreqInfo(Boolean bl, Integer n, Double d2, Double d3, RadioBandType radioBandType) {
    }

    public static WlmAgentFreqInfo fromJson(String string) {
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

    public Boolean getIsWiFiConnected() {
        return null;
    }

    public void setIsWiFiConnected(Boolean bl) {
    }

    public Integer getConnectDeviceCnt() {
        return null;
    }

    public void setConnectDeviceCnt(Integer n) {
    }

    public Double getCenterFreq() {
        return null;
    }

    public void setCenterFreq(Double d2) {
    }

    public Double getBandWith() {
        return null;
    }

    public void setBandWith(Double d2) {
    }

    public RadioBandType getRadioBandType() {
        return null;
    }

    public void setRadioBandType(RadioBandType radioBandType) {
    }

    public String toString() {
        return null;
    }
}

