/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.remotecontroller.DroneNestMulitControlOpenDroneResult;
import org.json.JSONObject;

public class DroneNestMulitControlOpenDroneResultMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    DroneNestMulitControlOpenDroneResult value;

    public DroneNestMulitControlOpenDroneResultMsg() {
    }

    public DroneNestMulitControlOpenDroneResultMsg(DroneNestMulitControlOpenDroneResult droneNestMulitControlOpenDroneResult) {
    }

    public static DroneNestMulitControlOpenDroneResultMsg fromJson(String string) {
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

    public DroneNestMulitControlOpenDroneResult getValue() {
        return null;
    }

    public void setValue(DroneNestMulitControlOpenDroneResult droneNestMulitControlOpenDroneResult) {
    }

    public String toString() {
        return null;
    }
}

