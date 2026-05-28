/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.media;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class VideoBeautifySettingsInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean control;
    Integer effectSlimming;
    Integer effectSmoother;
    Integer effectWhitening;
    Integer effectEyeEnlarge;
    Integer effectExposure;
    Integer effectToning;
    Integer effectEyeCircle;

    public VideoBeautifySettingsInfo() {
    }

    public VideoBeautifySettingsInfo(Boolean bl, Integer n, Integer n2, Integer n3, Integer n4, Integer n5, Integer n6, Integer n7) {
    }

    public static VideoBeautifySettingsInfo fromJson(String string) {
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

    public Boolean getControl() {
        return null;
    }

    public void setControl(Boolean bl) {
    }

    public Integer getEffectSlimming() {
        return null;
    }

    public void setEffectSlimming(Integer n) {
    }

    public Integer getEffectSmoother() {
        return null;
    }

    public void setEffectSmoother(Integer n) {
    }

    public Integer getEffectWhitening() {
        return null;
    }

    public void setEffectWhitening(Integer n) {
    }

    public Integer getEffectEyeEnlarge() {
        return null;
    }

    public void setEffectEyeEnlarge(Integer n) {
    }

    public Integer getEffectExposure() {
        return null;
    }

    public void setEffectExposure(Integer n) {
    }

    public Integer getEffectToning() {
        return null;
    }

    public void setEffectToning(Integer n) {
    }

    public Integer getEffectEyeCircle() {
        return null;
    }

    public void setEffectEyeCircle(Integer n) {
    }

    public String toString() {
        return null;
    }
}

