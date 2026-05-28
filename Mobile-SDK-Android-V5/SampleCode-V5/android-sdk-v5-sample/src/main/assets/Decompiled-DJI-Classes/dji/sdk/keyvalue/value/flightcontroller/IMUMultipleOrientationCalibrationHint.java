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
import dji.sdk.keyvalue.value.flightcontroller.IMUOrientationCalibrationState;
import java.util.List;
import org.json.JSONObject;

public class IMUMultipleOrientationCalibrationHint
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    IMUOrientationCalibrationState state;
    List<IMUCalibrationOrientation> orientationsToCalibrate;
    List<IMUCalibrationOrientation> orientationsCalibrated;

    public IMUMultipleOrientationCalibrationHint() {
    }

    public IMUMultipleOrientationCalibrationHint(IMUOrientationCalibrationState iMUOrientationCalibrationState, List<IMUCalibrationOrientation> list, List<IMUCalibrationOrientation> list2) {
    }

    public static IMUMultipleOrientationCalibrationHint fromJson(String string) {
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

    public IMUOrientationCalibrationState getState() {
        return null;
    }

    public void setState(IMUOrientationCalibrationState iMUOrientationCalibrationState) {
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

