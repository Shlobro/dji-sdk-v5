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

public class MRTCVideoParamEvent
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer streamID;
    Integer width;
    Integer height;
    Integer fps;
    Integer bps;
    Integer packetCacheLen;
    Integer packetLoss;
    Integer packetAutoReansmission;
    Integer rtt;
    Integer jitter;
    Integer trendline;

    public MRTCVideoParamEvent() {
    }

    public MRTCVideoParamEvent(Integer n, Integer n2, Integer n3, Integer n4, Integer n5, Integer n6, Integer n7, Integer n8, Integer n9, Integer n10, Integer n11) {
    }

    public static MRTCVideoParamEvent fromJson(String string) {
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

    public Integer getStreamID() {
        return null;
    }

    public void setStreamID(Integer n) {
    }

    public Integer getWidth() {
        return null;
    }

    public void setWidth(Integer n) {
    }

    public Integer getHeight() {
        return null;
    }

    public void setHeight(Integer n) {
    }

    public Integer getFps() {
        return null;
    }

    public void setFps(Integer n) {
    }

    public Integer getBps() {
        return null;
    }

    public void setBps(Integer n) {
    }

    public Integer getPacketCacheLen() {
        return null;
    }

    public void setPacketCacheLen(Integer n) {
    }

    public Integer getPacketLoss() {
        return null;
    }

    public void setPacketLoss(Integer n) {
    }

    public Integer getPacketAutoReansmission() {
        return null;
    }

    public void setPacketAutoReansmission(Integer n) {
    }

    public Integer getRtt() {
        return null;
    }

    public void setRtt(Integer n) {
    }

    public Integer getJitter() {
        return null;
    }

    public void setJitter(Integer n) {
    }

    public Integer getTrendline() {
        return null;
    }

    public void setTrendline(Integer n) {
    }

    public String toString() {
        return null;
    }
}

