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
import dji.sdk.keyvalue.value.product.MRTCVersion;
import org.json.JSONObject;

public class MRTCOptionSetVideoAttributeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    MRTCVersion version;
    Integer streamId;
    Integer videoWidth;
    Integer videoHeight;
    Integer videoFps;
    Integer videoBps;
    Boolean enableAdaptiveResolution;

    public MRTCOptionSetVideoAttributeMsg() {
    }

    public MRTCOptionSetVideoAttributeMsg(MRTCVersion mRTCVersion, Integer n, Integer n2, Integer n3, Integer n4, Integer n5, Boolean bl) {
    }

    public static MRTCOptionSetVideoAttributeMsg fromJson(String string) {
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

    public MRTCVersion getVersion() {
        return null;
    }

    public void setVersion(MRTCVersion mRTCVersion) {
    }

    public Integer getStreamId() {
        return null;
    }

    public void setStreamId(Integer n) {
    }

    public Integer getVideoWidth() {
        return null;
    }

    public void setVideoWidth(Integer n) {
    }

    public Integer getVideoHeight() {
        return null;
    }

    public void setVideoHeight(Integer n) {
    }

    public Integer getVideoFps() {
        return null;
    }

    public void setVideoFps(Integer n) {
    }

    public Integer getVideoBps() {
        return null;
    }

    public void setVideoBps(Integer n) {
    }

    public Boolean getEnableAdaptiveResolution() {
        return null;
    }

    public void setEnableAdaptiveResolution(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

