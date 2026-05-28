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
import org.json.JSONObject;

public class BatteryInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean enabled;
    Integer batteryPower;
    Integer batteryPercent;

    public BatteryInfo() {
    }

    public BatteryInfo(Boolean bl, Integer n, Integer n2) {
    }

    public static BatteryInfo fromJson(String string) {
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

    public Boolean getEnabled() {
        return null;
    }

    public void setEnabled(Boolean bl) {
    }

    public Integer getBatteryPower() {
        return null;
    }

    public void setBatteryPower(Integer n) {
    }

    public Integer getBatteryPercent() {
        return null;
    }

    public void setBatteryPercent(Integer n) {
    }

    public String toString() {
        return null;
    }
}

