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
import dji.sdk.keyvalue.value.remotecontroller.DroneNestLteModeMsg;
import org.json.JSONObject;

public class DroneNestLteMode
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    DroneNestLteModeMsg value;

    public DroneNestLteMode() {
    }

    public DroneNestLteMode(DroneNestLteModeMsg droneNestLteModeMsg) {
    }

    public static DroneNestLteMode fromJson(String string) {
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

    public DroneNestLteModeMsg getValue() {
        return null;
    }

    public void setValue(DroneNestLteModeMsg droneNestLteModeMsg) {
    }

    public String toString() {
        return null;
    }
}

