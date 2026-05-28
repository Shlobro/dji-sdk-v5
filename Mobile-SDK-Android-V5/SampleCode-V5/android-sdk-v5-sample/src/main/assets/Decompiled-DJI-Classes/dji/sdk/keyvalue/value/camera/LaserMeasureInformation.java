/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.camera.LaserMeasureState;
import dji.sdk.keyvalue.value.common.DoublePoint2D;
import dji.sdk.keyvalue.value.common.LocationCoordinate3D;
import org.json.JSONObject;

public class LaserMeasureInformation
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    LocationCoordinate3D location3D;
    Double distance;
    DoublePoint2D targetPoint;
    LaserMeasureState laserMeasureState;

    public LaserMeasureInformation() {
    }

    public LaserMeasureInformation(LocationCoordinate3D locationCoordinate3D, Double d2, DoublePoint2D doublePoint2D, LaserMeasureState laserMeasureState) {
    }

    public static LaserMeasureInformation fromJson(String string) {
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

    public LocationCoordinate3D getLocation3D() {
        return null;
    }

    public void setLocation3D(LocationCoordinate3D locationCoordinate3D) {
    }

    public Double getDistance() {
        return null;
    }

    public void setDistance(Double d2) {
    }

    public DoublePoint2D getTargetPoint() {
        return null;
    }

    public void setTargetPoint(DoublePoint2D doublePoint2D) {
    }

    public LaserMeasureState getLaserMeasureState() {
        return null;
    }

    public void setLaserMeasureState(LaserMeasureState laserMeasureState) {
    }

    public String toString() {
        return null;
    }
}

