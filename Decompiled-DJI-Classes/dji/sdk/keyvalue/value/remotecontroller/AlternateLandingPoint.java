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
import dji.sdk.keyvalue.value.common.LocationCoordinate3D;
import org.json.JSONObject;

public class AlternateLandingPoint
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    LocationCoordinate3D location;
    Integer direction;
    Integer height;

    public AlternateLandingPoint() {
    }

    public AlternateLandingPoint(LocationCoordinate3D locationCoordinate3D, Integer n, Integer n2) {
    }

    public static AlternateLandingPoint fromJson(String string) {
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

    public Integer getDirection() {
        return null;
    }

    public void setDirection(Integer n) {
    }

    public Integer getHeight() {
        return null;
    }

    public void setHeight(Integer n) {
    }

    public String toString() {
        return null;
    }
}

