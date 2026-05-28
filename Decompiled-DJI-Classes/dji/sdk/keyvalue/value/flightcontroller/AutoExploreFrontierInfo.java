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
import org.json.JSONObject;

public class AutoExploreFrontierInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    LocationCoordinate3D view_point;
    LocationCoordinate3D frontier;

    public AutoExploreFrontierInfo() {
    }

    public AutoExploreFrontierInfo(LocationCoordinate3D locationCoordinate3D, LocationCoordinate3D locationCoordinate3D2) {
    }

    public static AutoExploreFrontierInfo fromJson(String string) {
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

    public LocationCoordinate3D getView_point() {
        return null;
    }

    public void setView_point(LocationCoordinate3D locationCoordinate3D) {
    }

    public LocationCoordinate3D getFrontier() {
        return null;
    }

    public void setFrontier(LocationCoordinate3D locationCoordinate3D) {
    }

    public String toString() {
        return null;
    }
}

