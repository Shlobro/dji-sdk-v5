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
import org.json.JSONObject;

public class SprayPumpLifeData
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer repairTimes;
    Integer totalRunTimes;
    Integer runCircles;

    public SprayPumpLifeData() {
    }

    public SprayPumpLifeData(Integer n, Integer n2, Integer n3) {
    }

    public static SprayPumpLifeData fromJson(String string) {
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

    public Integer getRepairTimes() {
        return null;
    }

    public void setRepairTimes(Integer n) {
    }

    public Integer getTotalRunTimes() {
        return null;
    }

    public void setTotalRunTimes(Integer n) {
    }

    public Integer getRunCircles() {
        return null;
    }

    public void setRunCircles(Integer n) {
    }

    public String toString() {
        return null;
    }
}

