/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class LightbridgeAntennaRSSI
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer antenna1;
    Integer antenna2;

    public LightbridgeAntennaRSSI() {
    }

    public LightbridgeAntennaRSSI(Integer n, Integer n2) {
    }

    public static LightbridgeAntennaRSSI fromJson(String string) {
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

    public Integer getAntenna1() {
        return null;
    }

    public void setAntenna1(Integer n) {
    }

    public Integer getAntenna2() {
        return null;
    }

    public void setAntenna2(Integer n) {
    }

    public String toString() {
        return null;
    }
}

