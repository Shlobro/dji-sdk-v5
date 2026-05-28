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
import dji.sdk.keyvalue.value.common.SDRQualityDetectResultType;
import dji.sdk.keyvalue.value.common.SDRQualityDetectRet;
import dji.sdk.keyvalue.value.common.SDRQualityDetectStage;
import org.json.JSONObject;

public class SDRQualityDetectRspMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    SDRQualityDetectRet ret;
    SDRQualityDetectStage stage;
    Integer progress;
    SDRQualityDetectResultType resultType;
    Double downloadRate;
    Double uploadRate;
    SDRQualityDetectResultType downloadLevel;
    SDRQualityDetectResultType uploadLevel;

    public SDRQualityDetectRspMsg() {
    }

    public SDRQualityDetectRspMsg(SDRQualityDetectRet sDRQualityDetectRet, SDRQualityDetectStage sDRQualityDetectStage, Integer n, SDRQualityDetectResultType sDRQualityDetectResultType, Double d2, Double d3, SDRQualityDetectResultType sDRQualityDetectResultType2, SDRQualityDetectResultType sDRQualityDetectResultType3) {
    }

    public static SDRQualityDetectRspMsg fromJson(String string) {
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

    public SDRQualityDetectRet getRet() {
        return null;
    }

    public void setRet(SDRQualityDetectRet sDRQualityDetectRet) {
    }

    public SDRQualityDetectStage getStage() {
        return null;
    }

    public void setStage(SDRQualityDetectStage sDRQualityDetectStage) {
    }

    public Integer getProgress() {
        return null;
    }

    public void setProgress(Integer n) {
    }

    public SDRQualityDetectResultType getResultType() {
        return null;
    }

    public void setResultType(SDRQualityDetectResultType sDRQualityDetectResultType) {
    }

    public Double getDownloadRate() {
        return null;
    }

    public void setDownloadRate(Double d2) {
    }

    public Double getUploadRate() {
        return null;
    }

    public void setUploadRate(Double d2) {
    }

    public SDRQualityDetectResultType getDownloadLevel() {
        return null;
    }

    public void setDownloadLevel(SDRQualityDetectResultType sDRQualityDetectResultType) {
    }

    public SDRQualityDetectResultType getUploadLevel() {
        return null;
    }

    public void setUploadLevel(SDRQualityDetectResultType sDRQualityDetectResultType) {
    }

    public String toString() {
        return null;
    }
}

