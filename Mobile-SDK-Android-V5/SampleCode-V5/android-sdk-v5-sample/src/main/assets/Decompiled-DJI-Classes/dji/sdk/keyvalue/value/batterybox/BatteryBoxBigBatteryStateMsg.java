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
import dji.sdk.keyvalue.value.batterybox.BatteryBoxBigBatteryStateStruct;
import java.util.List;
import org.json.JSONObject;

public class BatteryBoxBigBatteryStateMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<BatteryBoxBigBatteryStateStruct> value;

    public BatteryBoxBigBatteryStateMsg() {
    }

    public BatteryBoxBigBatteryStateMsg(List<BatteryBoxBigBatteryStateStruct> list) {
    }

    public static BatteryBoxBigBatteryStateMsg fromJson(String string) {
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

    public List<BatteryBoxBigBatteryStateStruct> getValue() {
        return null;
    }

    public void setValue(List<BatteryBoxBigBatteryStateStruct> list) {
    }

    public String toString() {
        return null;
    }
}

