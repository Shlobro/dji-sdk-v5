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

public class GimbalTrimValueMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer roll_trim_value;
    Integer pitch_trim_value;
    Integer yaw_trim_value;

    public GimbalTrimValueMsg() {
    }

    public GimbalTrimValueMsg(Integer n, Integer n2, Integer n3) {
    }

    public static GimbalTrimValueMsg fromJson(String string) {
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

    public Integer getRoll_trim_value() {
        return null;
    }

    public void setRoll_trim_value(Integer n) {
    }

    public Integer getPitch_trim_value() {
        return null;
    }

    public void setPitch_trim_value(Integer n) {
    }

    public Integer getYaw_trim_value() {
        return null;
    }

    public void setYaw_trim_value(Integer n) {
    }

    public String toString() {
        return null;
    }
}

