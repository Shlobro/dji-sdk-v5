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
import dji.sdk.keyvalue.value.common.Attitude;
import java.util.List;
import org.json.JSONObject;

public class GimbalTimeLapseSettings
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean isPreview;
    Boolean isTripodMode;
    Boolean isUniform;
    Boolean isMotionOn;
    Integer duration;
    Integer interval;
    Integer gimbalPositionNum;
    List<Attitude> gimbalPositions;

    public GimbalTimeLapseSettings() {
    }

    public GimbalTimeLapseSettings(Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, Integer n, Integer n2, Integer n3, List<Attitude> list) {
    }

    public static GimbalTimeLapseSettings fromJson(String string) {
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

    public Boolean getIsTripodMode() {
        return null;
    }

    public void setIsTripodMode(Boolean bl) {
    }

    public Boolean getIsUniform() {
        return null;
    }

    public void setIsUniform(Boolean bl) {
    }

    public Boolean getIsMotionOn() {
        return null;
    }

    public void setIsMotionOn(Boolean bl) {
    }

    public Integer getDuration() {
        return null;
    }

    public void setDuration(Integer n) {
    }

    public Integer getInterval() {
        return null;
    }

    public void setInterval(Integer n) {
    }

    public Integer getGimbalPositionNum() {
        return null;
    }

    public void setGimbalPositionNum(Integer n) {
    }

    public List<Attitude> getGimbalPositions() {
        return null;
    }

    public void setGimbalPositions(List<Attitude> list) {
    }

    public String toString() {
        return null;
    }
}

