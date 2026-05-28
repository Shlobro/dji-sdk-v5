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

public class DroneNestPowerInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer electricSupplyVoltage;
    Long backupBatteryVoltage;
    Integer backupBatteryTemperature;

    public DroneNestPowerInfo() {
    }

    public DroneNestPowerInfo(Integer n, Long l2, Integer n2) {
    }

    public static DroneNestPowerInfo fromJson(String string) {
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

    public Integer getElectricSupplyVoltage() {
        return null;
    }

    public void setElectricSupplyVoltage(Integer n) {
    }

    public Long getBackupBatteryVoltage() {
        return null;
    }

    public void setBackupBatteryVoltage(Long l2) {
    }

    public Integer getBackupBatteryTemperature() {
        return null;
    }

    public void setBackupBatteryTemperature(Integer n) {
    }

    public String toString() {
        return null;
    }
}

