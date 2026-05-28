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
import dji.sdk.keyvalue.value.rtkbasestation.DroneNestRtkCoordConfigType;
import org.json.JSONObject;

public class DroneNestRtkCoordConfigMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    LocationCoordinate3D location;
    DroneNestRtkCoordConfigType type;
    Integer accuracy;

    public DroneNestRtkCoordConfigMsg() {
    }

    public DroneNestRtkCoordConfigMsg(LocationCoordinate3D locationCoordinate3D, DroneNestRtkCoordConfigType droneNestRtkCoordConfigType, Integer n) {
    }

    public static DroneNestRtkCoordConfigMsg fromJson(String string) {
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

    public DroneNestRtkCoordConfigType getType() {
        return null;
    }

    public void setType(DroneNestRtkCoordConfigType droneNestRtkCoordConfigType) {
    }

    public Integer getAccuracy() {
        return null;
    }

    public void setAccuracy(Integer n) {
    }

    public String toString() {
        return null;
    }
}

