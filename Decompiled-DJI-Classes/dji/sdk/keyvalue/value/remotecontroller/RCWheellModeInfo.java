/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.remotecontroller.RCWheelMode;
import org.json.JSONObject;

public class RCWheellModeInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    RCWheelMode leftWheel;
    RCWheelMode rightWheel;

    public RCWheellModeInfo() {
    }

    public RCWheellModeInfo(RCWheelMode rCWheelMode, RCWheelMode rCWheelMode2) {
    }

    public static RCWheellModeInfo fromJson(String string) {
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

    public RCWheelMode getLeftWheel() {
        return null;
    }

    public void setLeftWheel(RCWheelMode rCWheelMode) {
    }

    public RCWheelMode getRightWheel() {
        return null;
    }

    public void setRightWheel(RCWheelMode rCWheelMode) {
    }

    public String toString() {
        return null;
    }
}

