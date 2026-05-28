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
import org.json.JSONObject;

public class RoutePointInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer index;
    Boolean valid;
    LocationCoordinate2D position;

    public RoutePointInfo() {
    }

    public RoutePointInfo(Integer n, Boolean bl, LocationCoordinate2D locationCoordinate2D) {
    }

    public static RoutePointInfo fromJson(String string) {
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

    public Integer getIndex() {
        return null;
    }

    public void setIndex(Integer n) {
    }

    public Boolean getValid() {
        return null;
    }

    public void setValid(Boolean bl) {
    }

    public LocationCoordinate2D getPosition() {
        return null;
    }

    public void setPosition(LocationCoordinate2D locationCoordinate2D) {
    }

    public String toString() {
        return null;
    }
}

