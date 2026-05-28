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
import dji.sdk.keyvalue.value.remotecontroller.DroneNestCoverControlResult;
import org.json.JSONObject;

public class DroneNestCoverControlResultMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    DroneNestCoverControlResult value;

    public DroneNestCoverControlResultMsg() {
    }

    public DroneNestCoverControlResultMsg(DroneNestCoverControlResult droneNestCoverControlResult) {
    }

    public static DroneNestCoverControlResultMsg fromJson(String string) {
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

    public DroneNestCoverControlResult getValue() {
        return null;
    }

    public void setValue(DroneNestCoverControlResult droneNestCoverControlResult) {
    }

    public String toString() {
        return null;
    }
}

