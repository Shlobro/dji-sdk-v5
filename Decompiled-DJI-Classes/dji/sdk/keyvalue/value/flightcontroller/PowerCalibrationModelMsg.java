/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import java.util.List;
import org.json.JSONObject;

public class PowerCalibrationModelMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String payload_name;
    String uav_name;
    String firmware_version;
    List<Double> power_modle;

    public PowerCalibrationModelMsg() {
    }

    public PowerCalibrationModelMsg(String string, String string2, String string3, List<Double> list) {
    }

    public static PowerCalibrationModelMsg fromJson(String string) {
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

    public String getPayload_name() {
        return null;
    }

    public void setPayload_name(String string) {
    }

    public String getUav_name() {
        return null;
    }

    public void setUav_name(String string) {
    }

    public String getFirmware_version() {
        return null;
    }

    public void setFirmware_version(String string) {
    }

    public List<Double> getPower_modle() {
        return null;
    }

    public void setPower_modle(List<Double> list) {
    }

    public String toString() {
        return null;
    }
}

