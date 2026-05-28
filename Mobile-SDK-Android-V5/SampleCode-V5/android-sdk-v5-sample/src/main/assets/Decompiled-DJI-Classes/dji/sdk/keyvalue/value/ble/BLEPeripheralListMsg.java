/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.ble;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.ble.BLEPeripheral;
import java.util.List;
import org.json.JSONObject;

public class BLEPeripheralListMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<BLEPeripheral> datas;

    public BLEPeripheralListMsg() {
    }

    public BLEPeripheralListMsg(List<BLEPeripheral> list) {
    }

    public static BLEPeripheralListMsg fromJson(String string) {
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

    public List<BLEPeripheral> getDatas() {
        return null;
    }

    public void setDatas(List<BLEPeripheral> list) {
    }

    public String toString() {
        return null;
    }
}

