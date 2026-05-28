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
import dji.sdk.keyvalue.value.flightcontroller.LandingGearPosition;
import org.json.JSONObject;

public class LandingGearStateMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    LandingGearPosition position;
    Integer packType;
    Integer mode;
    Integer autoControl;

    public LandingGearStateMsg() {
    }

    public LandingGearStateMsg(LandingGearPosition landingGearPosition, Integer n, Integer n2, Integer n3) {
    }

    public static LandingGearStateMsg fromJson(String string) {
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

    public LandingGearPosition getPosition() {
        return null;
    }

    public void setPosition(LandingGearPosition landingGearPosition) {
    }

    public Integer getPackType() {
        return null;
    }

    public void setPackType(Integer n) {
    }

    public Integer getMode() {
        return null;
    }

    public void setMode(Integer n) {
    }

    public Integer getAutoControl() {
        return null;
    }

    public void setAutoControl(Integer n) {
    }

    public String toString() {
        return null;
    }
}

