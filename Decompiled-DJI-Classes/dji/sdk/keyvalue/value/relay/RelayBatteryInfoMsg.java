/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.relay;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.relay.RelayChargeStatus;
import org.json.JSONObject;

public class RelayBatteryInfoMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer voltage;
    Integer current;
    Integer temperature;
    Integer chargeCycle;
    Integer capacityPercent;
    RelayChargeStatus chargeStatus;

    public RelayBatteryInfoMsg() {
    }

    public RelayBatteryInfoMsg(Integer n, Integer n2, Integer n3, Integer n4, Integer n5, RelayChargeStatus relayChargeStatus) {
    }

    public static RelayBatteryInfoMsg fromJson(String string) {
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

    public Integer getVoltage() {
        return null;
    }

    public void setVoltage(Integer n) {
    }

    public Integer getCurrent() {
        return null;
    }

    public void setCurrent(Integer n) {
    }

    public Integer getTemperature() {
        return null;
    }

    public void setTemperature(Integer n) {
    }

    public Integer getChargeCycle() {
        return null;
    }

    public void setChargeCycle(Integer n) {
    }

    public Integer getCapacityPercent() {
        return null;
    }

    public void setCapacityPercent(Integer n) {
    }

    public RelayChargeStatus getChargeStatus() {
        return null;
    }

    public void setChargeStatus(RelayChargeStatus relayChargeStatus) {
    }

    public String toString() {
        return null;
    }
}

