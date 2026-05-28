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
import dji.sdk.keyvalue.value.remotecontroller.DroneNestLTENetworkState;
import dji.sdk.keyvalue.value.remotecontroller.DroneNestWiredNetworkState;
import dji.sdk.keyvalue.value.remotecontroller.NetworkConnectType;
import org.json.JSONObject;

public class DroneNestNetworkState
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer version;
    NetworkConnectType type;
    DroneNestLTENetworkState lteState;
    DroneNestWiredNetworkState wiredState;

    public DroneNestNetworkState() {
    }

    public DroneNestNetworkState(Integer n, NetworkConnectType networkConnectType, DroneNestLTENetworkState droneNestLTENetworkState, DroneNestWiredNetworkState droneNestWiredNetworkState) {
    }

    public static DroneNestNetworkState fromJson(String string) {
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

    public Integer getVersion() {
        return null;
    }

    public void setVersion(Integer n) {
    }

    public NetworkConnectType getType() {
        return null;
    }

    public void setType(NetworkConnectType networkConnectType) {
    }

    public DroneNestLTENetworkState getLteState() {
        return null;
    }

    public void setLteState(DroneNestLTENetworkState droneNestLTENetworkState) {
    }

    public DroneNestWiredNetworkState getWiredState() {
        return null;
    }

    public void setWiredState(DroneNestWiredNetworkState droneNestWiredNetworkState) {
    }

    public String toString() {
        return null;
    }
}

