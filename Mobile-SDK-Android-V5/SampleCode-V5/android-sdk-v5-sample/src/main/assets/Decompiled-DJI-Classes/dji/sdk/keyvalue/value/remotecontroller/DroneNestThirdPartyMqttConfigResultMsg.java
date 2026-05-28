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
import dji.sdk.keyvalue.value.remotecontroller.DroneNestThirdPartyMqttConfigResult;
import org.json.JSONObject;

public class DroneNestThirdPartyMqttConfigResultMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    DroneNestThirdPartyMqttConfigResult value;

    public DroneNestThirdPartyMqttConfigResultMsg() {
    }

    public DroneNestThirdPartyMqttConfigResultMsg(DroneNestThirdPartyMqttConfigResult droneNestThirdPartyMqttConfigResult) {
    }

    public static DroneNestThirdPartyMqttConfigResultMsg fromJson(String string) {
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

    public DroneNestThirdPartyMqttConfigResult getValue() {
        return null;
    }

    public void setValue(DroneNestThirdPartyMqttConfigResult droneNestThirdPartyMqttConfigResult) {
    }

    public String toString() {
        return null;
    }
}

