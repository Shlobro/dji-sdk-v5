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
import dji.sdk.keyvalue.value.remotecontroller.DroneNestEnvironmentType;
import org.json.JSONObject;

public class DroneNestEnvironmentTypeInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    DroneNestEnvironmentType value;
    Boolean SSLEnable;

    public DroneNestEnvironmentTypeInfo() {
    }

    public DroneNestEnvironmentTypeInfo(DroneNestEnvironmentType droneNestEnvironmentType, Boolean bl) {
    }

    public static DroneNestEnvironmentTypeInfo fromJson(String string) {
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

    public DroneNestEnvironmentType getValue() {
        return null;
    }

    public void setValue(DroneNestEnvironmentType droneNestEnvironmentType) {
    }

    public Boolean getSSLEnable() {
        return null;
    }

    public void setSSLEnable(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

