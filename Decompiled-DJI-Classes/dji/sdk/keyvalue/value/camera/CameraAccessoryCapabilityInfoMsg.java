/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class CameraAccessoryCapabilityInfoMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean isSupportLiveStreaming;
    Boolean isSupportWirelessMic;
    Boolean isSupportWiFiShare;

    public CameraAccessoryCapabilityInfoMsg() {
    }

    public CameraAccessoryCapabilityInfoMsg(Boolean bl, Boolean bl2, Boolean bl3) {
    }

    public static CameraAccessoryCapabilityInfoMsg fromJson(String string) {
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

    public Boolean getIsSupportLiveStreaming() {
        return null;
    }

    public void setIsSupportLiveStreaming(Boolean bl) {
    }

    public Boolean getIsSupportWirelessMic() {
        return null;
    }

    public void setIsSupportWirelessMic(Boolean bl) {
    }

    public Boolean getIsSupportWiFiShare() {
        return null;
    }

    public void setIsSupportWiFiShare(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

