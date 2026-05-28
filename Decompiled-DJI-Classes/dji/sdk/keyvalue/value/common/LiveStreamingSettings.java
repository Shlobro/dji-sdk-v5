/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.LiveStreamingParams;
import org.json.JSONObject;

public class LiveStreamingSettings
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    LiveStreamingParams param;
    String ssid;

    public LiveStreamingSettings() {
    }

    public LiveStreamingSettings(LiveStreamingParams liveStreamingParams, String string) {
    }

    public static LiveStreamingSettings fromJson(String string) {
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

    public LiveStreamingParams getParam() {
        return null;
    }

    public void setParam(LiveStreamingParams liveStreamingParams) {
    }

    public String getSsid() {
        return null;
    }

    public void setSsid(String string) {
    }

    public String toString() {
        return null;
    }
}

