/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.flightassistant.MasterShotMode;
import dji.sdk.keyvalue.value.flightassistant.MasterShotSeqType;
import org.json.JSONObject;

public class MasterShotVideoInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    MasterShotMode type;
    MasterShotSeqType seqType;
    Long startTimeStamp;
    Long endTimeStamp;

    public MasterShotVideoInfo() {
    }

    public MasterShotVideoInfo(MasterShotMode masterShotMode, MasterShotSeqType masterShotSeqType, Long l2, Long l3) {
    }

    public static MasterShotVideoInfo fromJson(String string) {
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

    public MasterShotMode getType() {
        return null;
    }

    public void setType(MasterShotMode masterShotMode) {
    }

    public MasterShotSeqType getSeqType() {
        return null;
    }

    public void setSeqType(MasterShotSeqType masterShotSeqType) {
    }

    public Long getStartTimeStamp() {
        return null;
    }

    public void setStartTimeStamp(Long l2) {
    }

    public Long getEndTimeStamp() {
        return null;
    }

    public void setEndTimeStamp(Long l2) {
    }

    public String toString() {
        return null;
    }
}

