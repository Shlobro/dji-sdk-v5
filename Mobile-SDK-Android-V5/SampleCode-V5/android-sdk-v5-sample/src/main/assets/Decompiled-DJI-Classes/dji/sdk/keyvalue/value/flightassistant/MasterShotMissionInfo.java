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
import dji.sdk.keyvalue.value.flightassistant.MasterShotSeqType;
import java.util.List;
import org.json.JSONObject;

public class MasterShotMissionInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer totalSegment;
    Integer currentSegment;
    MasterShotSeqType currentType;
    List<Integer> segmentDuration;

    public MasterShotMissionInfo() {
    }

    public MasterShotMissionInfo(Integer n, Integer n2, MasterShotSeqType masterShotSeqType, List<Integer> list) {
    }

    public static MasterShotMissionInfo fromJson(String string) {
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

    public Integer getTotalSegment() {
        return null;
    }

    public void setTotalSegment(Integer n) {
    }

    public Integer getCurrentSegment() {
        return null;
    }

    public void setCurrentSegment(Integer n) {
    }

    public MasterShotSeqType getCurrentType() {
        return null;
    }

    public void setCurrentType(MasterShotSeqType masterShotSeqType) {
    }

    public List<Integer> getSegmentDuration() {
        return null;
    }

    public void setSegmentDuration(List<Integer> list) {
    }

    public String toString() {
        return null;
    }
}

