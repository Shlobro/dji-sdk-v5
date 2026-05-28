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

public class HG211FirmwareSupportInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean supportHDRVideo;
    Boolean supportTrackingInFpv;
    Boolean supportMachineStory;
    Boolean supportHuaWeiShare;
    Boolean supportPlayWithDownload;

    public HG211FirmwareSupportInfo() {
    }

    public HG211FirmwareSupportInfo(Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5) {
    }

    public static HG211FirmwareSupportInfo fromJson(String string) {
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

    public Boolean getSupportHDRVideo() {
        return null;
    }

    public void setSupportHDRVideo(Boolean bl) {
    }

    public Boolean getSupportTrackingInFpv() {
        return null;
    }

    public void setSupportTrackingInFpv(Boolean bl) {
    }

    public Boolean getSupportMachineStory() {
        return null;
    }

    public void setSupportMachineStory(Boolean bl) {
    }

    public Boolean getSupportHuaWeiShare() {
        return null;
    }

    public void setSupportHuaWeiShare(Boolean bl) {
    }

    public Boolean getSupportPlayWithDownload() {
        return null;
    }

    public void setSupportPlayWithDownload(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

