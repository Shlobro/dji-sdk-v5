/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.lidar;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.Attitude;
import dji.sdk.keyvalue.value.common.LocationCoordinate3D;
import dji.sdk.keyvalue.value.common.XYZ;
import dji.sdk.keyvalue.value.lidar.FcFlag;
import dji.sdk.keyvalue.value.lidar.GeoFlag;
import dji.sdk.keyvalue.value.lidar.POSStatus;
import dji.sdk.keyvalue.value.lidar.PosQuaternion;
import dji.sdk.keyvalue.value.lidar.RecordingError;
import org.json.JSONObject;

public class PayloadPOSStatusInfoMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    FcFlag fcFlag;
    GeoFlag geoFlag;
    LocationCoordinate3D posLocation;
    XYZ posCoordinate;
    PosQuaternion posQuaternion;
    Attitude attitude;
    POSStatus posStatus;
    Double recordingTime;
    RecordingError recordingError;

    public PayloadPOSStatusInfoMsg() {
    }

    public PayloadPOSStatusInfoMsg(FcFlag fcFlag, GeoFlag geoFlag, LocationCoordinate3D locationCoordinate3D, XYZ xYZ, PosQuaternion posQuaternion, Attitude attitude, POSStatus pOSStatus, Double d2, RecordingError recordingError) {
    }

    public static PayloadPOSStatusInfoMsg fromJson(String string) {
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

    public FcFlag getFcFlag() {
        return null;
    }

    public void setFcFlag(FcFlag fcFlag) {
    }

    public GeoFlag getGeoFlag() {
        return null;
    }

    public void setGeoFlag(GeoFlag geoFlag) {
    }

    public LocationCoordinate3D getPosLocation() {
        return null;
    }

    public void setPosLocation(LocationCoordinate3D locationCoordinate3D) {
    }

    public XYZ getPosCoordinate() {
        return null;
    }

    public void setPosCoordinate(XYZ xYZ) {
    }

    public PosQuaternion getPosQuaternion() {
        return null;
    }

    public void setPosQuaternion(PosQuaternion posQuaternion) {
    }

    public Attitude getAttitude() {
        return null;
    }

    public void setAttitude(Attitude attitude) {
    }

    public POSStatus getPosStatus() {
        return null;
    }

    public void setPosStatus(POSStatus pOSStatus) {
    }

    public Double getRecordingTime() {
        return null;
    }

    public void setRecordingTime(Double d2) {
    }

    public RecordingError getRecordingError() {
        return null;
    }

    public void setRecordingError(RecordingError recordingError) {
    }

    public String toString() {
        return null;
    }
}

