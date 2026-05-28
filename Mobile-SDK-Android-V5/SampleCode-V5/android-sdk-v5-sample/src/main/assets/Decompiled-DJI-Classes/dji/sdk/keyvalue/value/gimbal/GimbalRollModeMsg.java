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
import dji.sdk.keyvalue.value.gimbal.GimbalRollMode;
import org.json.JSONObject;

public class GimbalRollModeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    GimbalRollMode value;

    public GimbalRollModeMsg() {
    }

    public GimbalRollModeMsg(GimbalRollMode gimbalRollMode) {
    }

    public static GimbalRollModeMsg fromJson(String string) {
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

    public GimbalRollMode getValue() {
        return null;
    }

    public void setValue(GimbalRollMode gimbalRollMode) {
    }

    public String toString() {
        return null;
    }
}

