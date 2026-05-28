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
import dji.sdk.keyvalue.value.common.Attitude;
import dji.sdk.keyvalue.value.gimbal.GimbalMode;
import org.json.JSONObject;

public class GimbalMotionControlReq
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Attitude jointAttitude;
    GimbalMode workMode;
    Integer reset;

    public GimbalMotionControlReq() {
    }

    public GimbalMotionControlReq(Attitude attitude, GimbalMode gimbalMode, Integer n) {
    }

    public static GimbalMotionControlReq fromJson(String string) {
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

    public Attitude getJointAttitude() {
        return null;
    }

    public void setJointAttitude(Attitude attitude) {
    }

    public GimbalMode getWorkMode() {
        return null;
    }

    public void setWorkMode(GimbalMode gimbalMode) {
    }

    public Integer getReset() {
        return null;
    }

    public void setReset(Integer n) {
    }

    public String toString() {
        return null;
    }
}

