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
import dji.sdk.keyvalue.value.flightassistant.TimelapseFrameRate;
import dji.sdk.keyvalue.value.flightassistant.TimelapseSubmodeType;
import org.json.JSONObject;

public class TimelapseStartInformation
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    TimelapseSubmodeType submodeType;
    Integer duration;
    Integer deltaTime;
    Long trajID;
    Integer direction;
    TimelapseFrameRate frameRate;

    public TimelapseStartInformation() {
    }

    public TimelapseStartInformation(TimelapseSubmodeType timelapseSubmodeType, Integer n, Integer n2, Long l2, Integer n3, TimelapseFrameRate timelapseFrameRate) {
    }

    public static TimelapseStartInformation fromJson(String string) {
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

    public TimelapseSubmodeType getSubmodeType() {
        return null;
    }

    public void setSubmodeType(TimelapseSubmodeType timelapseSubmodeType) {
    }

    public Integer getDuration() {
        return null;
    }

    public void setDuration(Integer n) {
    }

    public Integer getDeltaTime() {
        return null;
    }

    public void setDeltaTime(Integer n) {
    }

    public Long getTrajID() {
        return null;
    }

    public void setTrajID(Long l2) {
    }

    public Integer getDirection() {
        return null;
    }

    public void setDirection(Integer n) {
    }

    public TimelapseFrameRate getFrameRate() {
        return null;
    }

    public void setFrameRate(TimelapseFrameRate timelapseFrameRate) {
    }

    public String toString() {
        return null;
    }
}

