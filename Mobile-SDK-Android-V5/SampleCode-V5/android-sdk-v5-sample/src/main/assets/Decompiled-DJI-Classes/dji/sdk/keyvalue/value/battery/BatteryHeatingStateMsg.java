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
import dji.sdk.keyvalue.value.battery.BatteryHeatingState;
import org.json.JSONObject;

public class BatteryHeatingStateMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    BatteryHeatingState value;

    public BatteryHeatingStateMsg() {
    }

    public BatteryHeatingStateMsg(BatteryHeatingState batteryHeatingState) {
    }

    public static BatteryHeatingStateMsg fromJson(String string) {
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

    public BatteryHeatingState getValue() {
        return null;
    }

    public void setValue(BatteryHeatingState batteryHeatingState) {
    }

    public String toString() {
        return null;
    }
}

