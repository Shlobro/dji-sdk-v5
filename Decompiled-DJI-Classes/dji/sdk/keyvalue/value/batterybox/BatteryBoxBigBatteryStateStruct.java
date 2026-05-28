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
import dji.sdk.keyvalue.value.batterybox.BatteryBoxBigBatteryState;
import org.json.JSONObject;

public class BatteryBoxBigBatteryStateStruct
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    BatteryBoxBigBatteryState value;

    public BatteryBoxBigBatteryStateStruct() {
    }

    public BatteryBoxBigBatteryStateStruct(BatteryBoxBigBatteryState batteryBoxBigBatteryState) {
    }

    public static BatteryBoxBigBatteryStateStruct fromJson(String string) {
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

    public BatteryBoxBigBatteryState getValue() {
        return null;
    }

    public void setValue(BatteryBoxBigBatteryState batteryBoxBigBatteryState) {
    }

    public String toString() {
        return null;
    }
}

