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
import org.json.JSONObject;

public class GimbalJoystickSettings
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer yawExpo;
    Integer pitchExpo;
    Integer rollExpo;
    Integer yawSmooth;
    Integer pitchSmooth;
    Integer rollSmooth;
    Integer yawMaxSpeed;
    Integer pitchMaxSpeed;
    Integer rollMaxSpeed;
    Integer yawDeadzone;
    Integer pitchDeadzone;
    Integer rollDeadzone;
    Integer pitchRangeExtensionEnabled;
    Integer yawControlEnable;

    public GimbalJoystickSettings() {
    }

    public GimbalJoystickSettings(Integer n, Integer n2, Integer n3, Integer n4, Integer n5, Integer n6, Integer n7, Integer n8, Integer n9, Integer n10, Integer n11, Integer n12, Integer n13, Integer n14) {
    }

    public static GimbalJoystickSettings fromJson(String string) {
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

    public Integer getYawExpo() {
        return null;
    }

    public void setYawExpo(Integer n) {
    }

    public Integer getPitchExpo() {
        return null;
    }

    public void setPitchExpo(Integer n) {
    }

    public Integer getRollExpo() {
        return null;
    }

    public void setRollExpo(Integer n) {
    }

    public Integer getYawSmooth() {
        return null;
    }

    public void setYawSmooth(Integer n) {
    }

    public Integer getPitchSmooth() {
        return null;
    }

    public void setPitchSmooth(Integer n) {
    }

    public Integer getRollSmooth() {
        return null;
    }

    public void setRollSmooth(Integer n) {
    }

    public Integer getYawMaxSpeed() {
        return null;
    }

    public void setYawMaxSpeed(Integer n) {
    }

    public Integer getPitchMaxSpeed() {
        return null;
    }

    public void setPitchMaxSpeed(Integer n) {
    }

    public Integer getRollMaxSpeed() {
        return null;
    }

    public void setRollMaxSpeed(Integer n) {
    }

    public Integer getYawDeadzone() {
        return null;
    }

    public void setYawDeadzone(Integer n) {
    }

    public Integer getPitchDeadzone() {
        return null;
    }

    public void setPitchDeadzone(Integer n) {
    }

    public Integer getRollDeadzone() {
        return null;
    }

    public void setRollDeadzone(Integer n) {
    }

    public Integer getPitchRangeExtensionEnabled() {
        return null;
    }

    public void setPitchRangeExtensionEnabled(Integer n) {
    }

    public Integer getYawControlEnable() {
        return null;
    }

    public void setYawControlEnable(Integer n) {
    }

    public String toString() {
        return null;
    }
}

