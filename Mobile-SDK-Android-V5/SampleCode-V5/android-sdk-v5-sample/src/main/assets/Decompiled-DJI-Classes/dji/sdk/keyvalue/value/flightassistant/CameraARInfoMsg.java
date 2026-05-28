/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.Attitude;
import dji.sdk.keyvalue.value.common.LocationCoordinate3D;
import dji.sdk.keyvalue.value.common.XYZ;
import org.json.JSONObject;

public class CameraARInfoMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer devicePos;
    Integer deltaTimestamp;
    Attitude cameraAttitude;
    XYZ cameraPos;
    LocationCoordinate3D gndOrigin;

    public CameraARInfoMsg() {
    }

    public CameraARInfoMsg(Integer n, Integer n2, Attitude attitude, XYZ xYZ, LocationCoordinate3D locationCoordinate3D) {
    }

    public static CameraARInfoMsg fromJson(String string) {
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

    public Integer getDevicePos() {
        return null;
    }

    public void setDevicePos(Integer n) {
    }

    public Integer getDeltaTimestamp() {
        return null;
    }

    public void setDeltaTimestamp(Integer n) {
    }

    public Attitude getCameraAttitude() {
        return null;
    }

    public void setCameraAttitude(Attitude attitude) {
    }

    public XYZ getCameraPos() {
        return null;
    }

    public void setCameraPos(XYZ xYZ) {
    }

    public LocationCoordinate3D getGndOrigin() {
        return null;
    }

    public void setGndOrigin(LocationCoordinate3D locationCoordinate3D) {
    }

    public String toString() {
        return null;
    }
}

