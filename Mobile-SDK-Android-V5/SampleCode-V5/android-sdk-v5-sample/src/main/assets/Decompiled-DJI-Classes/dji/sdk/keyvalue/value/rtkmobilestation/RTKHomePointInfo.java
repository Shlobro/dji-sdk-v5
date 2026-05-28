/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.rtkmobilestation;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.LocationCoordinate2D;
import dji.sdk.keyvalue.value.rtkmobilestation.RTKHomePointDataSource;
import org.json.JSONObject;

public class RTKHomePointInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    RTKHomePointDataSource homePointDataSource;
    LocationCoordinate2D homePointLocation;

    public RTKHomePointInfo() {
    }

    public RTKHomePointInfo(RTKHomePointDataSource rTKHomePointDataSource, LocationCoordinate2D locationCoordinate2D) {
    }

    public static RTKHomePointInfo fromJson(String string) {
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

    public RTKHomePointDataSource getHomePointDataSource() {
        return null;
    }

    public void setHomePointDataSource(RTKHomePointDataSource rTKHomePointDataSource) {
    }

    public LocationCoordinate2D getHomePointLocation() {
        return null;
    }

    public void setHomePointLocation(LocationCoordinate2D locationCoordinate2D) {
    }

    public String toString() {
        return null;
    }
}

