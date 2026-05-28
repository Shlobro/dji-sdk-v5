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

public class GimbalFollowSettings
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer yawFollowSpeed;
    Integer pitchFollowSpeed;
    Integer rollFollowSpeed;
    Integer yawFollowDeadzone;
    Integer pitchFollowDeadzone;
    Integer rollFollowDeadzone;
    Integer yawFollowAcce;
    Integer pitchFollowAcce;
    Integer rollFollowAcce;

    public GimbalFollowSettings() {
    }

    public GimbalFollowSettings(Integer n, Integer n2, Integer n3, Integer n4, Integer n5, Integer n6, Integer n7, Integer n8, Integer n9) {
    }

    public static GimbalFollowSettings fromJson(String string) {
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

    public Integer getYawFollowSpeed() {
        return null;
    }

    public void setYawFollowSpeed(Integer n) {
    }

    public Integer getPitchFollowSpeed() {
        return null;
    }

    public void setPitchFollowSpeed(Integer n) {
    }

    public Integer getRollFollowSpeed() {
        return null;
    }

    public void setRollFollowSpeed(Integer n) {
    }

    public Integer getYawFollowDeadzone() {
        return null;
    }

    public void setYawFollowDeadzone(Integer n) {
    }

    public Integer getPitchFollowDeadzone() {
        return null;
    }

    public void setPitchFollowDeadzone(Integer n) {
    }

    public Integer getRollFollowDeadzone() {
        return null;
    }

    public void setRollFollowDeadzone(Integer n) {
    }

    public Integer getYawFollowAcce() {
        return null;
    }

    public void setYawFollowAcce(Integer n) {
    }

    public Integer getPitchFollowAcce() {
        return null;
    }

    public void setPitchFollowAcce(Integer n) {
    }

    public Integer getRollFollowAcce() {
        return null;
    }

    public void setRollFollowAcce(Integer n) {
    }

    public String toString() {
        return null;
    }
}

