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
import dji.sdk.keyvalue.value.flightcontroller.LandingProtectType;
import org.json.JSONObject;

public class LandingProtectTypeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    LandingProtectType value;

    public LandingProtectTypeMsg() {
    }

    public LandingProtectTypeMsg(LandingProtectType landingProtectType) {
    }

    public static LandingProtectTypeMsg fromJson(String string) {
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

    public LandingProtectType getValue() {
        return null;
    }

    public void setValue(LandingProtectType landingProtectType) {
    }

    public String toString() {
        return null;
    }
}

