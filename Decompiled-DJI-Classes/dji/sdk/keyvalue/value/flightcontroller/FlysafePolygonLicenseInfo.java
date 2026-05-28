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
import dji.sdk.keyvalue.value.flightcontroller.FlysafeLicenseBaseInfo;
import java.util.List;
import org.json.JSONObject;

public class FlysafePolygonLicenseInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    FlysafeLicenseBaseInfo baseInfo;
    List<LocationCoordinate2D> points;

    public FlysafePolygonLicenseInfo() {
    }

    public FlysafePolygonLicenseInfo(FlysafeLicenseBaseInfo flysafeLicenseBaseInfo, List<LocationCoordinate2D> list) {
    }

    public static FlysafePolygonLicenseInfo fromJson(String string) {
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

    public FlysafeLicenseBaseInfo getBaseInfo() {
        return null;
    }

    public void setBaseInfo(FlysafeLicenseBaseInfo flysafeLicenseBaseInfo) {
    }

    public List<LocationCoordinate2D> getPoints() {
        return null;
    }

    public void setPoints(List<LocationCoordinate2D> list) {
    }

    public String toString() {
        return null;
    }
}

