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
import dji.sdk.keyvalue.value.camera.CameraRotateAngle;
import org.json.JSONObject;

public class CameraRotateState
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean liveViewNeedReverse;
    CameraRotateAngle deviceAngle;
    CameraRotateAngle sensorAngle;

    public CameraRotateState() {
    }

    public CameraRotateState(Boolean bl, CameraRotateAngle cameraRotateAngle, CameraRotateAngle cameraRotateAngle2) {
    }

    public static CameraRotateState fromJson(String string) {
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

    public Boolean getLiveViewNeedReverse() {
        return null;
    }

    public void setLiveViewNeedReverse(Boolean bl) {
    }

    public CameraRotateAngle getDeviceAngle() {
        return null;
    }

    public void setDeviceAngle(CameraRotateAngle cameraRotateAngle) {
    }

    public CameraRotateAngle getSensorAngle() {
        return null;
    }

    public void setSensorAngle(CameraRotateAngle cameraRotateAngle) {
    }

    public String toString() {
        return null;
    }
}

