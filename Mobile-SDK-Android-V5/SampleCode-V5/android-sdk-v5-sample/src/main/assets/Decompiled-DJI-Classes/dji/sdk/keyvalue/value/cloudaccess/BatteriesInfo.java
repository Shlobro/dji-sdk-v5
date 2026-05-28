/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.cloudaccess;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class BatteriesInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer capacity_percent;
    Integer index;
    String sn;
    Integer type;
    Integer sub_type;
    String firmware_version;
    Integer loop_times;
    Integer voltage;
    Double temperature;
    Integer high_voltage_storage_days;

    public BatteriesInfo() {
    }

    public BatteriesInfo(Integer n, Integer n2, String string, Integer n3, Integer n4, String string2, Integer n5, Integer n6, Double d2, Integer n7) {
    }

    public static BatteriesInfo fromJson(String string) {
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

    public Integer getCapacity_percent() {
        return null;
    }

    public void setCapacity_percent(Integer n) {
    }

    public Integer getIndex() {
        return null;
    }

    public void setIndex(Integer n) {
    }

    public String getSn() {
        return null;
    }

    public void setSn(String string) {
    }

    public Integer getType() {
        return null;
    }

    public void setType(Integer n) {
    }

    public Integer getSub_type() {
        return null;
    }

    public void setSub_type(Integer n) {
    }

    public String getFirmware_version() {
        return null;
    }

    public void setFirmware_version(String string) {
    }

    public Integer getLoop_times() {
        return null;
    }

    public void setLoop_times(Integer n) {
    }

    public Integer getVoltage() {
        return null;
    }

    public void setVoltage(Integer n) {
    }

    public Double getTemperature() {
        return null;
    }

    public void setTemperature(Double d2) {
    }

    public Integer getHigh_voltage_storage_days() {
        return null;
    }

    public void setHigh_voltage_storage_days(Integer n) {
    }

    public String toString() {
        return null;
    }
}

