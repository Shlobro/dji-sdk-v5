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
import dji.sdk.keyvalue.value.remotecontroller.DroneNestAPNConfig;
import org.json.JSONObject;

public class UpdateAPNConfig
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer configID;
    DroneNestAPNConfig value;

    public UpdateAPNConfig() {
    }

    public UpdateAPNConfig(Integer n, DroneNestAPNConfig droneNestAPNConfig) {
    }

    public static UpdateAPNConfig fromJson(String string) {
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

    public Integer getConfigID() {
        return null;
    }

    public void setConfigID(Integer n) {
    }

    public DroneNestAPNConfig getValue() {
        return null;
    }

    public void setValue(DroneNestAPNConfig droneNestAPNConfig) {
    }

    public String toString() {
        return null;
    }
}

