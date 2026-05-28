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
import java.util.List;
import org.json.JSONObject;

public class FlyToTrajectoryInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer sequence;
    Integer num;
    List<LocationCoordinate3D> trackPoints;

    public FlyToTrajectoryInfo() {
    }

    public FlyToTrajectoryInfo(Integer n, Integer n2, List<LocationCoordinate3D> list) {
    }

    public static FlyToTrajectoryInfo fromJson(String string) {
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

    public Integer getSequence() {
        return null;
    }

    public void setSequence(Integer n) {
    }

    public Integer getNum() {
        return null;
    }

    public void setNum(Integer n) {
    }

    public List<LocationCoordinate3D> getTrackPoints() {
        return null;
    }

    public void setTrackPoints(List<LocationCoordinate3D> list) {
    }

    public String toString() {
        return null;
    }
}

