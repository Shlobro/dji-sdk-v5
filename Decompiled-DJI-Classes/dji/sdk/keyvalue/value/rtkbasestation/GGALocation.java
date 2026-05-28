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
import org.json.JSONObject;

public class GGALocation
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer quality;
    Integer satNum;
    LocationCoordinate3D location;

    public GGALocation() {
    }

    public GGALocation(Integer n, Integer n2, LocationCoordinate3D locationCoordinate3D) {
    }

    public static GGALocation fromJson(String string) {
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

    public Integer getQuality() {
        return null;
    }

    public void setQuality(Integer n) {
    }

    public Integer getSatNum() {
        return null;
    }

    public void setSatNum(Integer n) {
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

