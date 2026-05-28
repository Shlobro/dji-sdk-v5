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
import org.json.JSONObject;

public class DrcOsdInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double attitude_head;
    Double latitude;
    Double longitude;
    Double height;
    Double speed_x;
    Double speed_y;
    Double speed_z;
    Double gimbal_pitch;
    Double gimbal_roll;
    Double gimbal_yaw;

    public DrcOsdInfo() {
    }

    public DrcOsdInfo(Double d2, Double d3, Double d4, Double d5, Double d6, Double d7, Double d8, Double d9, Double d10, Double d11) {
    }

    public static DrcOsdInfo fromJson(String string) {
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

    public Double getAttitude_head() {
        return null;
    }

    public void setAttitude_head(Double d2) {
    }

    public Double getLatitude() {
        return null;
    }

    public void setLatitude(Double d2) {
    }

    public Double getLongitude() {
        return null;
    }

    public void setLongitude(Double d2) {
    }

    public Double getHeight() {
        return null;
    }

    public void setHeight(Double d2) {
    }

    public Double getSpeed_x() {
        return null;
    }

    public void setSpeed_x(Double d2) {
    }

    public Double getSpeed_y() {
        return null;
    }

    public void setSpeed_y(Double d2) {
    }

    public Double getSpeed_z() {
        return null;
    }

    public void setSpeed_z(Double d2) {
    }

    public Double getGimbal_pitch() {
        return null;
    }

    public void setGimbal_pitch(Double d2) {
    }

    public Double getGimbal_roll() {
        return null;
    }

    public void setGimbal_roll(Double d2) {
    }

    public Double getGimbal_yaw() {
        return null;
    }

    public void setGimbal_yaw(Double d2) {
    }

    public String toString() {
        return null;
    }
}

