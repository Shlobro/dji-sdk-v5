/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.gimbal.AccelerometerTernary;
import dji.sdk.keyvalue.value.gimbal.AttitudeQuaternion;
import org.json.JSONObject;

public class ManualCalibrateGimbalParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    AttitudeQuaternion atti;
    AccelerometerTernary acc;

    public ManualCalibrateGimbalParam() {
    }

    public ManualCalibrateGimbalParam(AttitudeQuaternion attitudeQuaternion, AccelerometerTernary accelerometerTernary) {
    }

    public static ManualCalibrateGimbalParam fromJson(String string) {
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

    public AttitudeQuaternion getAtti() {
        return null;
    }

    public void setAtti(AttitudeQuaternion attitudeQuaternion) {
    }

    public AccelerometerTernary getAcc() {
        return null;
    }

    public void setAcc(AccelerometerTernary accelerometerTernary) {
    }

    public String toString() {
        return null;
    }
}

