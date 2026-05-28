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
import dji.sdk.keyvalue.value.common.PhysicalSource;
import org.json.JSONObject;

public class PinPointParamMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    LocationCoordinate3D pinPointLocation;
    PhysicalSource physicalSource;

    public PinPointParamMsg() {
    }

    public PinPointParamMsg(LocationCoordinate3D locationCoordinate3D, PhysicalSource physicalSource) {
    }

    public static PinPointParamMsg fromJson(String string) {
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

    public LocationCoordinate3D getPinPointLocation() {
        return null;
    }

    public void setPinPointLocation(LocationCoordinate3D locationCoordinate3D) {
    }

    public PhysicalSource getPhysicalSource() {
        return null;
    }

    public void setPhysicalSource(PhysicalSource physicalSource) {
    }

    public String toString() {
        return null;
    }
}

