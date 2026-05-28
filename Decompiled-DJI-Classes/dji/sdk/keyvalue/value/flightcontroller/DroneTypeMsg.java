/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.flightcontroller.DroneType;
import org.json.JSONObject;

public class DroneTypeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    DroneType value;

    public DroneTypeMsg() {
    }

    public DroneTypeMsg(DroneType droneType) {
    }

    public static DroneTypeMsg fromJson(String string) {
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

    public DroneType getValue() {
        return null;
    }

    public void setValue(DroneType droneType) {
    }

    public String toString() {
        return null;
    }
}

