/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.product;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class MRTCPlayEvent
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer playType;
    Integer streamID;
    Integer codecID;
    Integer dpiWidth;
    Integer dpiHeight;
    Integer frameRate;
    Integer bitRateTolerance;
    Integer bitRate;
    Integer sampleRate;
    Integer channels;

    public MRTCPlayEvent() {
    }

    public MRTCPlayEvent(Integer n, Integer n2, Integer n3, Integer n4, Integer n5, Integer n6, Integer n7, Integer n8, Integer n9, Integer n10) {
    }

    public static MRTCPlayEvent fromJson(String string) {
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

    public Integer getPlayType() {
        return null;
    }

    public void setPlayType(Integer n) {
    }

    public Integer getStreamID() {
        return null;
    }

    public void setStreamID(Integer n) {
    }

    public Integer getCodecID() {
        return null;
    }

    public void setCodecID(Integer n) {
    }

    public Integer getDpiWidth() {
        return null;
    }

    public void setDpiWidth(Integer n) {
    }

    public Integer getDpiHeight() {
        return null;
    }

    public void setDpiHeight(Integer n) {
    }

    public Integer getFrameRate() {
        return null;
    }

    public void setFrameRate(Integer n) {
    }

    public Integer getBitRateTolerance() {
        return null;
    }

    public void setBitRateTolerance(Integer n) {
    }

    public Integer getBitRate() {
        return null;
    }

    public void setBitRate(Integer n) {
    }

    public Integer getSampleRate() {
        return null;
    }

    public void setSampleRate(Integer n) {
    }

    public Integer getChannels() {
        return null;
    }

    public void setChannels(Integer n) {
    }

    public String toString() {
        return null;
    }
}

