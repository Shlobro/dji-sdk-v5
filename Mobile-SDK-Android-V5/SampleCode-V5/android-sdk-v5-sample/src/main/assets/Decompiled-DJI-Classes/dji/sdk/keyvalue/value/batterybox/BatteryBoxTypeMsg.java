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
import dji.sdk.keyvalue.value.batterybox.BatteryBoxType;
import org.json.JSONObject;

public class BatteryBoxTypeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    BatteryBoxType value;

    public BatteryBoxTypeMsg() {
    }

    public BatteryBoxTypeMsg(BatteryBoxType batteryBoxType) {
    }

    public static BatteryBoxTypeMsg fromJson(String string) {
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

    public BatteryBoxType getValue() {
        return null;
    }

    public void setValue(BatteryBoxType batteryBoxType) {
    }

    public String toString() {
        return null;
    }
}

