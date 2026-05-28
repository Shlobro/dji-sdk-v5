/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.remotecontroller.RcChannelFeature;
import org.json.JSONObject;

public class RcChannelSetting
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    RcChannelFeature featureSetting;
    Integer orientation;

    public RcChannelSetting() {
    }

    public RcChannelSetting(RcChannelFeature rcChannelFeature, Integer n) {
    }

    public static RcChannelSetting fromJson(String string) {
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

    public RcChannelFeature getFeatureSetting() {
        return null;
    }

    public void setFeatureSetting(RcChannelFeature rcChannelFeature) {
    }

    public Integer getOrientation() {
        return null;
    }

    public void setOrientation(Integer n) {
    }

    public String toString() {
        return null;
    }
}

