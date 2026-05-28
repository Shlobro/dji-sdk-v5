/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.gimbal.GimbalTimeLapseState;
import org.json.JSONObject;

public class GimbalTimeLapseProgressMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean isPreview;
    GimbalTimeLapseState state;
    Integer currentRoadNumber;
    Integer currentRoadPercent;
    Integer wholeRoadPercent;

    public GimbalTimeLapseProgressMsg() {
    }

    public GimbalTimeLapseProgressMsg(Boolean bl, GimbalTimeLapseState gimbalTimeLapseState, Integer n, Integer n2, Integer n3) {
    }

    public static GimbalTimeLapseProgressMsg fromJson(String string) {
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

    public Boolean getIsPreview() {
        return null;
    }

    public void setIsPreview(Boolean bl) {
    }

    public GimbalTimeLapseState getState() {
        return null;
    }

    public void setState(GimbalTimeLapseState gimbalTimeLapseState) {
    }

    public Integer getCurrentRoadNumber() {
        return null;
    }

    public void setCurrentRoadNumber(Integer n) {
    }

    public Integer getCurrentRoadPercent() {
        return null;
    }

    public void setCurrentRoadPercent(Integer n) {
    }

    public Integer getWholeRoadPercent() {
        return null;
    }

    public void setWholeRoadPercent(Integer n) {
    }

    public String toString() {
        return null;
    }
}

