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
import dji.sdk.keyvalue.value.gimbal.GimbalPanoMode;
import org.json.JSONObject;

public class GimbalPanoSettings
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean isYawMotionRelative;
    Boolean isPitchMotionRelative;
    Boolean isRollMotionRelative;
    Boolean unableReturnCenter;
    Boolean returnCenterWhenFinished;
    GimbalPanoMode panoMode;
    Integer timeout;
    Integer taskID;

    public GimbalPanoSettings() {
    }

    public GimbalPanoSettings(Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, GimbalPanoMode gimbalPanoMode, Integer n, Integer n2) {
    }

    public static GimbalPanoSettings fromJson(String string) {
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

    public Boolean getIsYawMotionRelative() {
        return null;
    }

    public void setIsYawMotionRelative(Boolean bl) {
    }

    public Boolean getIsPitchMotionRelative() {
        return null;
    }

    public void setIsPitchMotionRelative(Boolean bl) {
    }

    public Boolean getIsRollMotionRelative() {
        return null;
    }

    public void setIsRollMotionRelative(Boolean bl) {
    }

    public Boolean getUnableReturnCenter() {
        return null;
    }

    public void setUnableReturnCenter(Boolean bl) {
    }

    public Boolean getReturnCenterWhenFinished() {
        return null;
    }

    public void setReturnCenterWhenFinished(Boolean bl) {
    }

    public GimbalPanoMode getPanoMode() {
        return null;
    }

    public void setPanoMode(GimbalPanoMode gimbalPanoMode) {
    }

    public Integer getTimeout() {
        return null;
    }

    public void setTimeout(Integer n) {
    }

    public Integer getTaskID() {
        return null;
    }

    public void setTaskID(Integer n) {
    }

    public String toString() {
        return null;
    }
}

