/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.batterybox;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.batterybox.BatteryBoxChargerMode;
import org.json.JSONObject;

public class BatteryBoxChargerModeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    BatteryBoxChargerMode value;

    public BatteryBoxChargerModeMsg() {
    }

    public BatteryBoxChargerModeMsg(BatteryBoxChargerMode batteryBoxChargerMode) {
    }

    public static BatteryBoxChargerModeMsg fromJson(String string) {
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

    public BatteryBoxChargerMode getValue() {
        return null;
    }

    public void setValue(BatteryBoxChargerMode batteryBoxChargerMode) {
    }

    public String toString() {
        return null;
    }
}

