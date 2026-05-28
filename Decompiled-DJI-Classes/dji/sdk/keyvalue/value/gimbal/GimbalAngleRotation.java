/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.gimbal.GimbalAngleRotationMode;
import org.json.JSONObject;

public class GimbalAngleRotation
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    GimbalAngleRotationMode mode;
    Double pitch;
    Double roll;
    Double yaw;
    Boolean pitchIgnored;
    Boolean rollIgnored;
    Boolean yawIgnored;
    Double duration;
    Boolean jointReferenceUsed;
    Integer timeout;

    public GimbalAngleRotation() {
    }

    public GimbalAngleRotation(GimbalAngleRotationMode gimbalAngleRotationMode, Double d2, Double d3, Double d4, Boolean bl, Boolean bl2, Boolean bl3, Double d5, Boolean bl4, Integer n) {
    }

    public static GimbalAngleRotation fromJson(String string) {
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

    public GimbalAngleRotationMode getMode() {
        return null;
    }

    public void setMode(GimbalAngleRotationMode gimbalAngleRotationMode) {
    }

    public Double getPitch() {
        return null;
    }

    public void setPitch(Double d2) {
    }

    public Double getRoll() {
        return null;
    }

    public void setRoll(Double d2) {
    }

    public Double getYaw() {
        return null;
    }

    public void setYaw(Double d2) {
    }

    public Boolean getPitchIgnored() {
        return null;
    }

    public void setPitchIgnored(Boolean bl) {
    }

    public Boolean getRollIgnored() {
        return null;
    }

    public void setRollIgnored(Boolean bl) {
    }

    public Boolean getYawIgnored() {
        return null;
    }

    public void setYawIgnored(Boolean bl) {
    }

    public Double getDuration() {
        return null;
    }

    public void setDuration(Double d2) {
    }

    public Boolean getJointReferenceUsed() {
        return null;
    }

    public void setJointReferenceUsed(Boolean bl) {
    }

    public Integer getTimeout() {
        return null;
    }

    public void setTimeout(Integer n) {
    }

    public String toString() {
        return null;
    }
}

