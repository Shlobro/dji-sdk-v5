/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.cloudaccess;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.cloudaccess.CloudVideoConnectState;
import dji.sdk.keyvalue.value.cloudaccess.CloudVideoStreamQuality;
import org.json.JSONObject;

public class CloudVideoStatus
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String videoID;
    CloudVideoStreamQuality videoQuality;
    CloudVideoConnectState state;

    public CloudVideoStatus() {
    }

    public CloudVideoStatus(String string, CloudVideoStreamQuality cloudVideoStreamQuality, CloudVideoConnectState cloudVideoConnectState) {
    }

    public static CloudVideoStatus fromJson(String string) {
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

    public String getVideoID() {
        return null;
    }

    public void setVideoID(String string) {
    }

    public CloudVideoStreamQuality getVideoQuality() {
        return null;
    }

    public void setVideoQuality(CloudVideoStreamQuality cloudVideoStreamQuality) {
    }

    public CloudVideoConnectState getState() {
        return null;
    }

    public void setState(CloudVideoConnectState cloudVideoConnectState) {
    }

    public String toString() {
        return null;
    }
}

