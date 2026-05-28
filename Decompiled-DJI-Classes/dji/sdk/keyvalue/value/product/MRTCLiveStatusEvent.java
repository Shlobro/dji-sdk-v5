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

public class MRTCLiveStatusEvent
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer streamID;
    Integer onlineStatus;
    Integer streamingStatus;
    Integer onlineTime;
    Integer streamingTime;

    public MRTCLiveStatusEvent() {
    }

    public MRTCLiveStatusEvent(Integer n, Integer n2, Integer n3, Integer n4, Integer n5) {
    }

    public static MRTCLiveStatusEvent fromJson(String string) {
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

    public Integer getOnlineStatus() {
        return null;
    }

    public void setOnlineStatus(Integer n) {
    }

    public Integer getStreamingStatus() {
        return null;
    }

    public void setStreamingStatus(Integer n) {
    }

    public Integer getOnlineTime() {
        return null;
    }

    public void setOnlineTime(Integer n) {
    }

    public Integer getStreamingTime() {
        return null;
    }

    public void setStreamingTime(Integer n) {
    }

    public String toString() {
        return null;
    }
}

