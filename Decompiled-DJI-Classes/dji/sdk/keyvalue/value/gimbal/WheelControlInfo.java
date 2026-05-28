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
import org.json.JSONObject;

public class WheelControlInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer factor;
    Integer speed;
    Integer degree;

    public WheelControlInfo() {
    }

    public WheelControlInfo(Integer n, Integer n2, Integer n3) {
    }

    public static WheelControlInfo fromJson(String string) {
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

    public Integer getFactor() {
        return null;
    }

    public void setFactor(Integer n) {
    }

    public Integer getSpeed() {
        return null;
    }

    public void setSpeed(Integer n) {
    }

    public Integer getDegree() {
        return null;
    }

    public void setDegree(Integer n) {
    }

    public String toString() {
        return null;
    }
}

