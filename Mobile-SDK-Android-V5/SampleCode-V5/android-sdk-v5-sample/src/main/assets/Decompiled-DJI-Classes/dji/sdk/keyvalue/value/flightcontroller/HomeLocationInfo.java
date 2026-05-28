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
import dji.sdk.keyvalue.value.common.LocationCoordinate2D;
import dji.sdk.keyvalue.value.flightcontroller.HomeLocationType;
import org.json.JSONObject;

public class HomeLocationInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    HomeLocationType type;
    LocationCoordinate2D value;

    public HomeLocationInfo() {
    }

    public HomeLocationInfo(HomeLocationType homeLocationType, LocationCoordinate2D locationCoordinate2D) {
    }

    public static HomeLocationInfo fromJson(String string) {
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

    public HomeLocationType getType() {
        return null;
    }

    public void setType(HomeLocationType homeLocationType) {
    }

    public LocationCoordinate2D getValue() {
        return null;
    }

    public void setValue(LocationCoordinate2D locationCoordinate2D) {
    }

    public String toString() {
        return null;
    }
}

