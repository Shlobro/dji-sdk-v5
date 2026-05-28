/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.LocationCoordinate3D;
import dji.sdk.keyvalue.value.flightcontroller.FlyToOperationType;
import org.json.JSONObject;

public class FlyToPointInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    FlyToOperationType operation;
    LocationCoordinate3D point;
    Double maxSpeed;
    Double mea;

    public FlyToPointInfo() {
    }

    public FlyToPointInfo(FlyToOperationType flyToOperationType, LocationCoordinate3D locationCoordinate3D, Double d2, Double d3) {
    }

    public static FlyToPointInfo fromJson(String string) {
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

    public FlyToOperationType getOperation() {
        return null;
    }

    public void setOperation(FlyToOperationType flyToOperationType) {
    }

    public LocationCoordinate3D getPoint() {
        return null;
    }

    public void setPoint(LocationCoordinate3D locationCoordinate3D) {
    }

    public Double getMaxSpeed() {
        return null;
    }

    public void setMaxSpeed(Double d2) {
    }

    public Double getMea() {
        return null;
    }

    public void setMea(Double d2) {
    }

    public String toString() {
        return null;
    }
}

