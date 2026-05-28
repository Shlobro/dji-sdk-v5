/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.hms.HMSMaintainRecordState;
import org.json.JSONObject;

public class MaintainInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    HMSMaintainRecordState state;
    Long maintainUtcTime;
    Long basestationActivationUtcTime;
    Long basestationTotalRunningTime;
    Integer basestationTotalSorities;
    Long lastMaintainUTCTime;
    Long lastMaintainTotalRunningTime;
    Integer lastMaintainTotalSorties;

    public MaintainInfo() {
    }

    public MaintainInfo(HMSMaintainRecordState hMSMaintainRecordState, Long l2, Long l3, Long l4, Integer n, Long l5, Long l6, Integer n2) {
    }

    public static MaintainInfo fromJson(String string) {
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

    public HMSMaintainRecordState getState() {
        return null;
    }

    public void setState(HMSMaintainRecordState hMSMaintainRecordState) {
    }

    public Long getMaintainUtcTime() {
        return null;
    }

    public void setMaintainUtcTime(Long l2) {
    }

    public Long getBasestationActivationUtcTime() {
        return null;
    }

    public void setBasestationActivationUtcTime(Long l2) {
    }

    public Long getBasestationTotalRunningTime() {
        return null;
    }

    public void setBasestationTotalRunningTime(Long l2) {
    }

    public Integer getBasestationTotalSorities() {
        return null;
    }

    public void setBasestationTotalSorities(Integer n) {
    }

    public Long getLastMaintainUTCTime() {
        return null;
    }

    public void setLastMaintainUTCTime(Long l2) {
    }

    public Long getLastMaintainTotalRunningTime() {
        return null;
    }

    public void setLastMaintainTotalRunningTime(Long l2) {
    }

    public Integer getLastMaintainTotalSorties() {
        return null;
    }

    public void setLastMaintainTotalSorties(Integer n) {
    }

    public String toString() {
        return null;
    }
}

