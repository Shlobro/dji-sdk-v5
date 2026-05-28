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
import dji.sdk.keyvalue.value.gimbal.AttitudeQuaternion;
import org.json.JSONObject;

public class GimbalAttitudeQuaternionInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    AttitudeQuaternion atti;

    public GimbalAttitudeQuaternionInfo() {
    }

    public GimbalAttitudeQuaternionInfo(AttitudeQuaternion attitudeQuaternion) {
    }

    public static GimbalAttitudeQuaternionInfo fromJson(String string) {
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

    public String toString() {
        return null;
    }
}

