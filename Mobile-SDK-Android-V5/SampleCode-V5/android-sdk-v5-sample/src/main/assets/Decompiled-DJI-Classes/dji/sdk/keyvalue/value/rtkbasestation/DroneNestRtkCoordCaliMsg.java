/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.rtkbasestation;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.LocationCoordinate3D;
import dji.sdk.keyvalue.value.rtkbasestation.DroneNestRtkSelfCaliState;
import org.json.JSONObject;

public class DroneNestRtkCoordCaliMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    LocationCoordinate3D location;
    DroneNestRtkSelfCaliState state;

    public DroneNestRtkCoordCaliMsg() {
    }

    public DroneNestRtkCoordCaliMsg(LocationCoordinate3D locationCoordinate3D, DroneNestRtkSelfCaliState droneNestRtkSelfCaliState) {
    }

    public static DroneNestRtkCoordCaliMsg fromJson(String string) {
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

    public LocationCoordinate3D getLocation() {
        return null;
    }

    public void setLocation(LocationCoordinate3D locationCoordinate3D) {
    }

    public DroneNestRtkSelfCaliState getState() {
        return null;
    }

    public void setState(DroneNestRtkSelfCaliState droneNestRtkSelfCaliState) {
    }

    public String toString() {
        return null;
    }
}

