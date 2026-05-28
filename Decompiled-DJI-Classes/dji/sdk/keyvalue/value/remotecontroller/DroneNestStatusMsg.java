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
import dji.sdk.keyvalue.value.remotecontroller.DroneNestLandingState;
import dji.sdk.keyvalue.value.remotecontroller.DroneNestState;
import dji.sdk.keyvalue.value.remotecontroller.DroneNestTakeoffState;
import org.json.JSONObject;

public class DroneNestStatusMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    DroneNestState state;
    DroneNestLandingState landingState;
    DroneNestTakeoffState takeoffState;

    public DroneNestStatusMsg() {
    }

    public DroneNestStatusMsg(DroneNestState droneNestState, DroneNestLandingState droneNestLandingState, DroneNestTakeoffState droneNestTakeoffState) {
    }

    public static DroneNestStatusMsg fromJson(String string) {
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

    public DroneNestState getState() {
        return null;
    }

    public void setState(DroneNestState droneNestState) {
    }

    public DroneNestLandingState getLandingState() {
        return null;
    }

    public void setLandingState(DroneNestLandingState droneNestLandingState) {
    }

    public DroneNestTakeoffState getTakeoffState() {
        return null;
    }

    public void setTakeoffState(DroneNestTakeoffState droneNestTakeoffState) {
    }

    public String toString() {
        return null;
    }
}

