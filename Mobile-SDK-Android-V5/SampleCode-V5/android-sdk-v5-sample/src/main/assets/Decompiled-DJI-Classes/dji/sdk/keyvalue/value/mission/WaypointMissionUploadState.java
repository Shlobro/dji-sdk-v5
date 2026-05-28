/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class WaypointMissionUploadState
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean isSummaryUploaded;
    Integer uploadedWaypointIndex;
    Integer totalWaypointCount;
    Integer errorCode;

    public WaypointMissionUploadState() {
    }

    public WaypointMissionUploadState(Boolean bl, Integer n, Integer n2, Integer n3) {
    }

    public static WaypointMissionUploadState fromJson(String string) {
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

    public Boolean getIsSummaryUploaded() {
        return null;
    }

    public void setIsSummaryUploaded(Boolean bl) {
    }

    public Integer getUploadedWaypointIndex() {
        return null;
    }

    public void setUploadedWaypointIndex(Integer n) {
    }

    public Integer getTotalWaypointCount() {
        return null;
    }

    public void setTotalWaypointCount(Integer n) {
    }

    public Integer getErrorCode() {
        return null;
    }

    public void setErrorCode(Integer n) {
    }

    public String toString() {
        return null;
    }
}

