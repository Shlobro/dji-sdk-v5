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
import dji.sdk.keyvalue.value.battery.BatteryOverviewValue;
import java.util.List;
import org.json.JSONObject;

public class BatteryOverviewMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<BatteryOverviewValue> value;

    public BatteryOverviewMsg() {
    }

    public BatteryOverviewMsg(List<BatteryOverviewValue> list) {
    }

    public static BatteryOverviewMsg fromJson(String string) {
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

    public List<BatteryOverviewValue> getValue() {
        return null;
    }

    public void setValue(List<BatteryOverviewValue> list) {
    }

    public String toString() {
        return null;
    }
}

