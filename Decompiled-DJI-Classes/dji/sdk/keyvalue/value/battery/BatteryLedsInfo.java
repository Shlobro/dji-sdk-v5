/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.battery;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class BatteryLedsInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean aircraftLed;
    Boolean batteryLed;

    public BatteryLedsInfo() {
    }

    public BatteryLedsInfo(Boolean bl, Boolean bl2) {
    }

    public static BatteryLedsInfo fromJson(String string) {
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

    public Boolean getAircraftLed() {
        return null;
    }

    public void setAircraftLed(Boolean bl) {
    }

    public Boolean getBatteryLed() {
        return null;
    }

    public void setBatteryLed(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

