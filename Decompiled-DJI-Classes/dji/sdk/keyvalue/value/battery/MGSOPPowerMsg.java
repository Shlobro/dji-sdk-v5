/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.battery;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class MGSOPPowerMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer instantSOPPower;
    Integer averageSOPPower;

    public MGSOPPowerMsg() {
    }

    public MGSOPPowerMsg(Integer n, Integer n2) {
    }

    public static MGSOPPowerMsg fromJson(String string) {
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

    public Integer getInstantSOPPower() {
        return null;
    }

    public void setInstantSOPPower(Integer n) {
    }

    public Integer getAverageSOPPower() {
        return null;
    }

    public void setAverageSOPPower(Integer n) {
    }

    public String toString() {
        return null;
    }
}

