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
import dji.sdk.keyvalue.value.flightcontroller.IMUCalibrationOrientation;
import dji.sdk.keyvalue.value.flightcontroller.IMUCalibrationState;
import dji.sdk.keyvalue.value.flightcontroller.IMUOrientationCalibrationState;
import java.util.List;
import org.json.JSONObject;

public class IMUCalibrationInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    IMUOrientationCalibrationState orientationCalibrationState;
    IMUCalibrationState calibrationState;
    Integer calibrationProgress;
    List<IMUCalibrationOrientation> orientationsToCalibrate;
    List<IMUCalibrationOrientation> orientationsCalibrated;

    public IMUCalibrationInfo() {
    }

    public IMUCalibrationInfo(IMUOrientationCalibrationState iMUOrientationCalibrationState, IMUCalibrationState iMUCalibrationState, Integer n, List<IMUCalibrationOrientation> list, List<IMUCalibrationOrientation> list2) {
    }

    public static IMUCalibrationInfo fromJson(String string) {
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

    public IMUOrientationCalibrationState getOrientationCalibrationState() {
        return null;
    }

    public void setOrientationCalibrationState(IMUOrientationCalibrationState iMUOrientationCalibrationState) {
    }

    public IMUCalibrationState getCalibrationState() {
        return null;
    }

    public void setCalibrationState(IMUCalibrationState iMUCalibrationState) {
    }

    public Integer getCalibrationProgress() {
        return null;
    }

    public void setCalibrationProgress(Integer n) {
    }

    public List<IMUCalibrationOrientation> getOrientationsToCalibrate() {
        return null;
    }

    public void setOrientationsToCalibrate(List<IMUCalibrationOrientation> list) {
    }

    public List<IMUCalibrationOrientation> getOrientationsCalibrated() {
        return null;
    }

    public void setOrientationsCalibrated(List<IMUCalibrationOrientation> list) {
    }

    public String toString() {
        return null;
    }
}

