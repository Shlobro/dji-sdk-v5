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
import dji.sdk.keyvalue.value.common.DoubleMinMax;
import org.json.JSONObject;

public class GimbalAttitudeRange
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    DoubleMinMax roll;
    DoubleMinMax pitch;
    DoubleMinMax yaw;

    public GimbalAttitudeRange() {
    }

    public GimbalAttitudeRange(DoubleMinMax doubleMinMax, DoubleMinMax doubleMinMax2, DoubleMinMax doubleMinMax3) {
    }

    public static GimbalAttitudeRange fromJson(String string) {
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

    public DoubleMinMax getRoll() {
        return null;
    }

    public void setRoll(DoubleMinMax doubleMinMax) {
    }

    public DoubleMinMax getPitch() {
        return null;
    }

    public void setPitch(DoubleMinMax doubleMinMax) {
    }

    public DoubleMinMax getYaw() {
        return null;
    }

    public void setYaw(DoubleMinMax doubleMinMax) {
    }

    public String toString() {
        return null;
    }
}

