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
import dji.sdk.keyvalue.value.flightcontroller.DestinationInfoBase;
import org.json.JSONObject;

public class TargetPointInfoStruct
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    DestinationInfoBase destinationInfo;
    LocationCoordinate3D location;

    public TargetPointInfoStruct() {
    }

    public TargetPointInfoStruct(DestinationInfoBase destinationInfoBase, LocationCoordinate3D locationCoordinate3D) {
    }

    public static TargetPointInfoStruct fromJson(String string) {
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

    public DestinationInfoBase getDestinationInfo() {
        return null;
    }

    public void setDestinationInfo(DestinationInfoBase destinationInfoBase) {
    }

    public LocationCoordinate3D getLocation() {
        return null;
    }

    public void setLocation(LocationCoordinate3D locationCoordinate3D) {
    }

    public String toString() {
        return null;
    }
}

