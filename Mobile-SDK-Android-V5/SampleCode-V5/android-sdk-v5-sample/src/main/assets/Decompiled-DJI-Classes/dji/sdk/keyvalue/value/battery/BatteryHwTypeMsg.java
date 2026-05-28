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
import dji.sdk.keyvalue.value.battery.BatteryHwType;
import org.json.JSONObject;

public class BatteryHwTypeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    BatteryHwType value;

    public BatteryHwTypeMsg() {
    }

    public BatteryHwTypeMsg(BatteryHwType batteryHwType) {
    }

    public static BatteryHwTypeMsg fromJson(String string) {
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

    public BatteryHwType getValue() {
        return null;
    }

    public void setValue(BatteryHwType batteryHwType) {
    }

    public String toString() {
        return null;
    }
}

