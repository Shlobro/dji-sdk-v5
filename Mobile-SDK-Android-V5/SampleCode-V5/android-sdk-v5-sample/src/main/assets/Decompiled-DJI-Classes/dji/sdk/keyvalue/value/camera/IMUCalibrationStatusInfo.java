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
import dji.sdk.keyvalue.value.camera.IMUCalibrationStatus;
import org.json.JSONObject;

public class IMUCalibrationStatusInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean ctrl;
    IMUCalibrationStatus status;
    Boolean needToCalibrate;

    public IMUCalibrationStatusInfo() {
    }

    public IMUCalibrationStatusInfo(Boolean bl, IMUCalibrationStatus iMUCalibrationStatus, Boolean bl2) {
    }

    public static IMUCalibrationStatusInfo fromJson(String string) {
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

    public Boolean getCtrl() {
        return null;
    }

    public void setCtrl(Boolean bl) {
    }

    public IMUCalibrationStatus getStatus() {
        return null;
    }

    public void setStatus(IMUCalibrationStatus iMUCalibrationStatus) {
    }

    public Boolean getNeedToCalibrate() {
        return null;
    }

    public void setNeedToCalibrate(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

