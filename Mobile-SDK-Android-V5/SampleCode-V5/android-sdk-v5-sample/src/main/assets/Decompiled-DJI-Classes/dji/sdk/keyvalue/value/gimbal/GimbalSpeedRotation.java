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
import dji.sdk.keyvalue.value.gimbal.CtrlInfo;
import org.json.JSONObject;

public class GimbalSpeedRotation
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double pitch;
    Double yaw;
    Double roll;
    CtrlInfo ctrlInfo;

    public GimbalSpeedRotation() {
    }

    public GimbalSpeedRotation(Double d2, Double d3, Double d4, CtrlInfo ctrlInfo) {
    }

    public static GimbalSpeedRotation fromJson(String string) {
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

    public Double getPitch() {
        return null;
    }

    public void setPitch(Double d2) {
    }

    public Double getYaw() {
        return null;
    }

    public void setYaw(Double d2) {
    }

    public Double getRoll() {
        return null;
    }

    public void setRoll(Double d2) {
    }

    public CtrlInfo getCtrlInfo() {
        return null;
    }

    public void setCtrlInfo(CtrlInfo ctrlInfo) {
    }

    public String toString() {
        return null;
    }
}

