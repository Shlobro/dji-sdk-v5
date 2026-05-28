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
import dji.sdk.keyvalue.value.remotecontroller.DroneNestPushRodControl;
import org.json.JSONObject;

public class DroneNestPushRodControlMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    DroneNestPushRodControl value;

    public DroneNestPushRodControlMsg() {
    }

    public DroneNestPushRodControlMsg(DroneNestPushRodControl droneNestPushRodControl) {
    }

    public static DroneNestPushRodControlMsg fromJson(String string) {
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

    public DroneNestPushRodControl getValue() {
        return null;
    }

    public void setValue(DroneNestPushRodControl droneNestPushRodControl) {
    }

    public String toString() {
        return null;
    }
}

