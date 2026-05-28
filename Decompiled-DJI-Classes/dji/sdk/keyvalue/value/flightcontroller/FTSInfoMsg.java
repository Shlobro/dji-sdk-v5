/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.flightcontroller.FTSInfoStatus;
import org.json.JSONObject;

public class FTSInfoMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    FTSInfoStatus value;
    String verification;
    Integer valid_duration;
    Long timestamp;
    String fts_sn;
    String fts_firmware_version;

    public FTSInfoMsg() {
    }

    public FTSInfoMsg(FTSInfoStatus fTSInfoStatus, String string, Integer n, Long l2, String string2, String string3) {
    }

    public static FTSInfoMsg fromJson(String string) {
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

    public FTSInfoStatus getValue() {
        return null;
    }

    public void setValue(FTSInfoStatus fTSInfoStatus) {
    }

    public String getVerification() {
        return null;
    }

    public void setVerification(String string) {
    }

    public Integer getValid_duration() {
        return null;
    }

    public void setValid_duration(Integer n) {
    }

    public Long getTimestamp() {
        return null;
    }

    public void setTimestamp(Long l2) {
    }

    public String getFts_sn() {
        return null;
    }

    public void setFts_sn(String string) {
    }

    public String getFts_firmware_version() {
        return null;
    }

    public void setFts_firmware_version(String string) {
    }

    public String toString() {
        return null;
    }
}

