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
import org.json.JSONObject;

public class DroneNestChargeState
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean isCharge;
    Boolean fullCharged;
    Integer electricity;

    public DroneNestChargeState() {
    }

    public DroneNestChargeState(Boolean bl, Boolean bl2, Integer n) {
    }

    public static DroneNestChargeState fromJson(String string) {
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

    public Boolean getIsCharge() {
        return null;
    }

    public void setIsCharge(Boolean bl) {
    }

    public Boolean getFullCharged() {
        return null;
    }

    public void setFullCharged(Boolean bl) {
    }

    public Integer getElectricity() {
        return null;
    }

    public void setElectricity(Integer n) {
    }

    public String toString() {
        return null;
    }
}

